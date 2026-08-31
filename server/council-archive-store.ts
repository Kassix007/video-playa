import type { CouncilResult } from "./council-schema.js";
import type {
  CouncilArchiveStore,
  CouncilLegacyEntry,
  CouncilResultStore,
} from "./council-store.js";
import type { CouncilDateCount } from "./council-history.js";
import { getMauritiusDate, subtractMauritiusDays } from "./mauritius-time.js";

export interface CouncilArchiveReader {
  readArchivedDay(date: string): Promise<CouncilResult[] | null>;
  readArchiveMonthIndex(month: string): Promise<{
    days: Record<string, { completed_count: number }>;
  } | null>;
}

export class ArchiveAwareCouncilResultStore implements CouncilArchiveStore {
  readonly kind: CouncilResultStore["kind"];

  constructor(
    private readonly hot: CouncilArchiveStore,
    private readonly archive: CouncilArchiveReader,
    private readonly options: { hotRetentionDays?: number; now?: () => Date } = {},
  ) {
    this.kind = hot.kind;
  }

  save: CouncilArchiveStore["save"] = (...arguments_) => this.hot.save(...arguments_);
  getLatest: CouncilArchiveStore["getLatest"] = () => this.hot.getLatest();
  getHistory: CouncilArchiveStore["getHistory"] = (limit) => this.hot.getHistory(limit);
  getHotByDate: CouncilArchiveStore["getHotByDate"] = (date) => this.hot.getHotByDate(date);
  listHotDates: CouncilArchiveStore["listHotDates"] = () => this.hot.listHotDates();
  deleteHotDay: CouncilArchiveStore["deleteHotDay"] = (date) => this.hot.deleteHotDay(date);
  listLegacyEntries: () => Promise<CouncilLegacyEntry[]> = () => this.hot.listLegacyEntries();
  deleteLegacyKeys: CouncilArchiveStore["deleteLegacyKeys"] = (keys) => this.hot.deleteLegacyKeys(keys);
  getMigrationMarker: CouncilArchiveStore["getMigrationMarker"] = (date) => this.hot.getMigrationMarker(date);
  putMigrationMarker: CouncilArchiveStore["putMigrationMarker"] = (marker) => this.hot.putMigrationMarker(marker);

  async getByDate(date: string): Promise<CouncilResult[]> {
    const hotResults = await this.hot.getByDate(date);
    if (hotResults.length) return hotResults;
    const oldestHotDate = subtractMauritiusDays(
      getMauritiusDate(this.options.now?.() ?? new Date()),
      this.options.hotRetentionDays ?? 14,
    );
    if (date >= oldestHotDate) return [];
    try { return await this.archive.readArchivedDay(date) ?? []; }
    catch { return []; }
  }

  async getDateCounts(month: string): Promise<CouncilDateCount[]> {
    const hotCounts = await this.hot.getDateCounts(month);
    try {
      const index = await this.archive.readArchiveMonthIndex(month);
      if (!index) return hotCounts;
      const counts = new Map(Object.entries(index.days).map(([date, entry]) => [date, entry.completed_count]));
      for (const item of hotCounts) counts.set(item.date, item.count);
      return [...counts.entries()].sort(([left], [right]) => left.localeCompare(right)).map(([date, count]) => ({ date, count }));
    } catch {
      return hotCounts;
    }
  }
}
