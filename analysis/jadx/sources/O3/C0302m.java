package O3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.Y3;

/* JADX INFO: renamed from: O3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0302m extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ D0 f4959r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0302m(C0305n c0305n, Context context) {
        this(context, "google_app_measurement.db");
        this.f4958q = 0;
        this.f4959r = c0305n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f4958q) {
            case 0:
                C0305n c0305n = (C0305n) this.f4959r;
                C0323t0 c0323t0 = (C0323t0) c0305n.f4346r;
                C0323t0 c0323t02 = (C0323t0) c0305n.f4346r;
                c0323t0.getClass();
                T t6 = c0305n.f4984v;
                if (t6.f4572r != 0) {
                    ((B3.a) t6.f4573s).getClass();
                    if (SystemClock.elapsedRealtime() - t6.f4572r < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((B3.a) t6.f4573s).getClass();
                    t6.f4572r = SystemClock.elapsedRealtime();
                    X x6 = c0323t02.f5077v;
                    C0323t0.l(x6);
                    x6.f4670w.b("Opening the database failed, dropping and recreating it");
                    if (!c0323t02.f5072q.getDatabasePath("google_app_measurement.db").delete()) {
                        X x7 = c0323t02.f5077v;
                        C0323t0.l(x7);
                        x7.f4670w.c("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        t6.f4572r = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e7) {
                        X x8 = c0323t02.f5077v;
                        C0323t0.l(x8);
                        x8.f4670w.c(e7, "Failed to open freshly created database");
                        throw e7;
                    }
                }
            default:
                P p7 = (P) this.f4959r;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e8) {
                    throw e8;
                } catch (SQLiteException unused2) {
                    C0323t0 c0323t03 = (C0323t0) p7.f4346r;
                    X x9 = c0323t03.f5077v;
                    C0323t0.l(x9);
                    x9.f4670w.b("Opening the local database failed, dropping and recreating it");
                    if (!c0323t03.f5072q.getDatabasePath("google_app_measurement_local.db").delete()) {
                        X x10 = c0323t03.f5077v;
                        C0323t0.l(x10);
                        x10.f4670w.c("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e9) {
                        X x11 = ((C0323t0) p7.f4346r).f5077v;
                        C0323t0.l(x11);
                        x11.f4670w.c(e9, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f4958q) {
            case 0:
                X x6 = ((C0323t0) ((C0305n) this.f4959r).f4346r).f5077v;
                C0323t0.l(x6);
                K0.f(x6, sQLiteDatabase);
                break;
            default:
                X x7 = ((C0323t0) ((P) this.f4959r).f4346r).f5077v;
                C0323t0.l(x7);
                K0.f(x7, sQLiteDatabase);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i7) {
        int i8 = this.f4958q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f4958q) {
            case 0:
                C0323t0 c0323t0 = (C0323t0) ((C0305n) this.f4959r).f4346r;
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                K0.c(x6, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C0305n.f4979w);
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C0305n.f4981y);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C0305n.f4982z);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C0305n.f4973B);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C0305n.f4972A);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C0305n.f4974C);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C0305n.f4975D);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C0305n.f4976E);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C0305n.f4977F);
                Y3.a();
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C0305n.f4978G);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C0305n.f4980x);
                C0323t0.l(x7);
                K0.c(x7, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                X x8 = ((C0323t0) ((P) this.f4959r).f4346r).f5077v;
                C0323t0.l(x8);
                K0.c(x8, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", P.f4547v);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i7) {
        int i8 = this.f4958q;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0302m(P p7, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f4958q = 1;
        this.f4959r = p7;
    }

    public C0302m(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    private final void a(SQLiteDatabase sQLiteDatabase, int i, int i7) {
    }

    private final void b(SQLiteDatabase sQLiteDatabase, int i, int i7) {
    }

    private final void c(SQLiteDatabase sQLiteDatabase, int i, int i7) {
    }

    private final void e(SQLiteDatabase sQLiteDatabase, int i, int i7) {
    }
}
