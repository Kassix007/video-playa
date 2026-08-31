package androidx.work.impl;

import androidx.room.u;
import androidx.work.Clock;
import j2.InterfaceC1155a;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class CleanupCallback extends u {
    private final Clock clock;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CleanupCallback(Clock clock) {
        m.e(clock, "clock");
        this.clock = clock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final long getPruneDate() {
        return this.clock.currentTimeMillis() - WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String getPruneSQL() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + getPruneDate() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Clock getClock() {
        return this.clock;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.room.u
    public void onOpen(InterfaceC1155a db) {
        m.e(db, "db");
        db.h();
        try {
            db.l(getPruneSQL());
            db.J();
        } finally {
            db.g();
        }
    }
}
