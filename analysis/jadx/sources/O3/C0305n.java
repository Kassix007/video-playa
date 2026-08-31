package O3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0820k1;
import com.google.android.gms.internal.measurement.C0845p1;
import com.google.android.gms.internal.measurement.C0850q1;
import com.google.android.gms.internal.measurement.C0854r1;
import com.google.android.gms.internal.measurement.C0859s1;
import com.google.android.gms.internal.measurement.Y3;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0305n extends O1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0302m f4983u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final T f4984v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f4979w = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String[] f4980x = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String[] f4981y = {FirebaseAnalytics.Param.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String[] f4982z = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String[] f4972A = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String[] f4973B = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String[] f4974C = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f4975D = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String[] f4976E = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f4977F = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f4978G = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0305n(T1 t12) {
        super(t12);
        this.f4984v = new T(((C0323t0) this.f4346r).f5052A);
        ((C0323t0) this.f4346r).getClass();
        this.f4983u = new C0302m(this, ((C0323t0) this.f4346r).f5072q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String T(List list) {
        return list.isEmpty() ? "" : C0.S.n(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b0(ContentValues contentValues, Object obj) {
        AbstractC1887A.d(FirebaseAnalytics.Param.VALUE);
        AbstractC1887A.g(obj);
        if (obj instanceof String) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(FirebaseAnalytics.Param.VALUE, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(FirebaseAnalytics.Param.VALUE, (Double) obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(Long l7) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        p();
        if (Z()) {
            StringBuilder sb = new StringBuilder(l7.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l7);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (K(sb.toString(), null) > 0) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseF0 = f0();
                c0323t0.f5052A.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l7.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l7);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseF0.execSQL(sb3.toString());
            } catch (SQLiteException e7) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4670w.c(e7, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object B(Cursor cursor, int i) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        int type = cursor.getType(i);
        if (type == 0) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        X x8 = c0323t0.f5077v;
        C0323t0.l(x8);
        x8.f4670w.b("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long C(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            x3.AbstractC1887A.d(r14)
            java.lang.String r2 = "first_open_count"
            x3.AbstractC1887A.d(r2)
            r13.o()
            r13.p()
            android.database.sqlite.SQLiteDatabase r3 = r13.f0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.L(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            O3.X r1 = r0.f5077v     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            O3.W r9 = O3.X.w(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.d(r9, r2, r6)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            O3.X r1 = r0.f5077v     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            O3.W r5 = O3.X.w(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.d(r5, r2, r4)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            O3.X r0 = r0.f5077v     // Catch: java.lang.Throwable -> L6d
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L6d
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            O3.W r14 = O3.X.w(r14)     // Catch: java.lang.Throwable -> L6d
            r0.e(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.C(java.lang.String):long");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean D(String str, String str2) {
        return K("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(List list) {
        AbstractC1887A.g(list);
        o();
        p();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = f0().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.d(Integer.valueOf(iDelete), Integer.valueOf(list.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(String str) {
        try {
            f0().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str, str});
        } catch (SQLiteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.d(X.w(str), e7, "Failed to remove unused event metadata. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long G(String str) {
        AbstractC1887A.d(str);
        return L("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(String str, Long l7, long j, C0820k1 c0820k1) {
        o();
        p();
        AbstractC1887A.g(c0820k1);
        AbstractC1887A.d(str);
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        byte[] bArrA = c0820k1.a();
        X x6 = c0323t0.f5077v;
        X x7 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4666E.d(c0323t0.f5081z.a(str), Integer.valueOf(bArrA.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l7);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrA);
        try {
            if (f0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C0323t0.l(x7);
                x7.f4670w.c(X.w(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e7) {
            C0323t0.l(x7);
            x7.f4670w.d(X.w(str), e7, "Error storing complex main event. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            r25 = this;
            r1 = r25
            r5 = r26
            java.lang.Object r0 = r1.f4346r
            r12 = r0
            O3.t0 r12 = (O3.C0323t0) r12
            x3.AbstractC1887A.g(r29)
            r1.o()
            r1.p()
            if (r27 == 0) goto L1f
            O3.l r0 = new O3.l
            long r2 = r27.longValue()
            r0.<init>(r1, r5, r2)
        L1d:
            r13 = r0
            goto L25
        L1f:
            O3.l r0 = new O3.l
            r0.<init>(r1, r5)
            goto L1d
        L25:
            java.util.List r0 = r13.a()
        L29:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L2d0
            java.util.Iterator r14 = r0.iterator()
        L33:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L2c6
            java.lang.Object r0 = r14.next()
            r15 = r0
            O3.k r15 = (O3.C0296k) r15
            boolean r0 = android.text.TextUtils.isEmpty(r28)
            if (r0 != 0) goto L117
            long r2 = r15.f4931b
            r4 = 0
            android.database.sqlite.SQLiteDatabase r16 = r1.f0()     // Catch: java.lang.Throwable -> Ld9 android.database.sqlite.SQLiteException -> Ldb
            java.lang.String r17 = "raw_events_metadata"
            java.lang.String r0 = "metadata"
            java.lang.String[] r18 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Ld9 android.database.sqlite.SQLiteException -> Ldb
            java.lang.String r19 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> Ld9 android.database.sqlite.SQLiteException -> Ldb
            java.lang.String[] r20 = new java.lang.String[]{r5, r0}     // Catch: java.lang.Throwable -> Ld9 android.database.sqlite.SQLiteException -> Ldb
            java.lang.String r23 = "rowid"
            java.lang.String r24 = "2"
            r21 = 0
            r22 = 0
            android.database.Cursor r2 = r16.query(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch: java.lang.Throwable -> Ld9 android.database.sqlite.SQLiteException -> Ldb
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            if (r0 != 0) goto L8a
            O3.X r0 = r12.f5077v     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            java.lang.String r3 = "Raw event metadata record is missing. appId"
            O3.W r6 = O3.X.w(r5)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            r0.c(r6, r3)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
        L81:
            r2.close()
            goto Lf3
        L86:
            r0 = move-exception
            goto Ld5
        L88:
            r0 = move-exception
            goto Ld7
        L8a:
            r0 = 0
            byte[] r0 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            com.google.android.gms.internal.measurement.r1 r3 = com.google.android.gms.internal.measurement.C0859s1.U()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88 java.io.IOException -> Lc3
            com.google.android.gms.internal.measurement.p2 r0 = O3.C0270b0.b0(r3, r0)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88 java.io.IOException -> Lc3
            com.google.android.gms.internal.measurement.r1 r0 = (com.google.android.gms.internal.measurement.C0854r1) r0     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88 java.io.IOException -> Lc3
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88 java.io.IOException -> Lc3
            r3 = r0
            com.google.android.gms.internal.measurement.s1 r3 = (com.google.android.gms.internal.measurement.C0859s1) r3     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88 java.io.IOException -> Lc3
            boolean r0 = r2.moveToNext()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            if (r0 == 0) goto Lb9
            O3.X r0 = r12.f5077v     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "Get multiple raw event metadata records, expected one. appId"
            O3.W r6 = O3.X.w(r5)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            r0.c(r6, r4)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            goto Lb9
        Lb7:
            r0 = move-exception
            goto Lc1
        Lb9:
            r2.close()     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> Lb7
            r2.close()
        Lbf:
            r4 = r3
            goto Lf3
        Lc1:
            r4 = r2
            goto Ldd
        Lc3:
            r0 = move-exception
            O3.X r3 = r12.f5077v     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            java.lang.String r6 = "Data loss. Failed to merge raw event metadata. appId"
            O3.W r7 = O3.X.w(r5)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            r3.d(r7, r0, r6)     // Catch: java.lang.Throwable -> L86 android.database.sqlite.SQLiteException -> L88
            goto L81
        Ld5:
            r4 = r2
            goto L11a
        Ld7:
            r3 = r4
            goto Lc1
        Ld9:
            r0 = move-exception
            goto L11a
        Ldb:
            r0 = move-exception
            r3 = r4
        Ldd:
            O3.X r2 = r12.f5077v     // Catch: java.lang.Throwable -> Ld9
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> Ld9
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r6 = "Data loss. Error selecting raw event. appId"
            O3.W r7 = O3.X.w(r5)     // Catch: java.lang.Throwable -> Ld9
            r2.d(r7, r0, r6)     // Catch: java.lang.Throwable -> Ld9
            if (r4 == 0) goto Lbf
            r4.close()
            goto Lbf
        Lf3:
            if (r4 == 0) goto L117
            com.google.android.gms.internal.measurement.w2 r0 = r4.U1()
            java.util.Iterator r0 = r0.iterator()
        Lfd:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L117
            java.lang.Object r2 = r0.next()
            com.google.android.gms.internal.measurement.B1 r2 = (com.google.android.gms.internal.measurement.B1) r2
            java.lang.String r2 = r2.r()
            r3 = r28
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lfd
            goto L33
        L117:
            r3 = r28
            goto L120
        L11a:
            if (r4 == 0) goto L11f
            r4.close()
        L11f:
            throw r0
        L120:
            O3.T1 r0 = r1.f4510s
            O3.b0 r2 = r0.f4613w
            O3.T1.S(r2)
            com.google.android.gms.internal.measurement.k1 r4 = r15.f4933d
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.util.List r6 = r4.p()
            java.util.Iterator r6 = r6.iterator()
        L136:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L1b8
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.n1 r7 = (com.google.android.gms.internal.measurement.C0835n1) r7
            boolean r8 = r7.x()
            if (r8 == 0) goto L154
            java.lang.String r8 = r7.q()
            double r9 = r7.y()
            r11.putDouble(r8, r9)
            goto L136
        L154:
            boolean r8 = r7.v()
            if (r8 == 0) goto L166
            java.lang.String r8 = r7.q()
            float r7 = r7.w()
            r11.putFloat(r8, r7)
            goto L136
        L166:
            boolean r8 = r7.t()
            if (r8 == 0) goto L178
            java.lang.String r8 = r7.q()
            long r9 = r7.u()
            r11.putLong(r8, r9)
            goto L136
        L178:
            boolean r8 = r7.r()
            if (r8 == 0) goto L18a
            java.lang.String r8 = r7.q()
            java.lang.String r7 = r7.s()
            r11.putString(r8, r7)
            goto L136
        L18a:
            java.util.List r8 = r7.z()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L1a6
            java.lang.String r8 = r7.q()
            java.util.List r7 = r7.z()
            com.google.android.gms.internal.measurement.w2 r7 = (com.google.android.gms.internal.measurement.InterfaceC0880w2) r7
            android.os.Bundle[] r7 = O3.C0270b0.d0(r7)
            r11.putParcelableArray(r8, r7)
            goto L136
        L1a6:
            java.lang.Object r8 = r2.f4346r
            O3.t0 r8 = (O3.C0323t0) r8
            O3.X r8 = r8.f5077v
            O3.C0323t0.l(r8)
            O3.V r8 = r8.f4670w
            java.lang.String r9 = "Unexpected parameter type for parameter"
            r8.c(r7, r9)
            goto L136
        L1b8:
            java.lang.String r2 = "_o"
            java.lang.String r6 = r11.getString(r2)
            r11.remove(r2)
            java.lang.String r2 = r4.s()
            if (r6 != 0) goto L1c9
            java.lang.String r6 = ""
        L1c9:
            O3.Y1 r7 = r12.f5080y
            O3.X r8 = r12.f5077v
            O3.C0323t0.j(r7)
            java.lang.String r9 = "_cmp"
            boolean r2 = r2.equals(r9)
            if (r2 != 0) goto L1de
            r2 = r29
            r9 = r2
        L1db:
            r16 = r4
            goto L20d
        L1de:
            android.os.Bundle r2 = new android.os.Bundle
            r9 = r29
            r2.<init>(r9)
            java.util.Set r10 = r9.keySet()
            java.util.Iterator r10 = r10.iterator()
        L1ed:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L1db
            java.lang.Object r16 = r10.next()
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            r16 = r4
            java.lang.String r4 = "gad_"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L208
            r2.remove(r3)
        L208:
            r3 = r28
            r4 = r16
            goto L1ed
        L20d:
            r7.z(r11, r2)
            java.lang.Object r2 = r1.f4346r
            r3 = r2
            O3.t0 r3 = (O3.C0323t0) r3
            O3.r r2 = new O3.r
            r4 = r6
            java.lang.String r6 = r16.s()
            r10 = r8
            long r7 = r16.u()
            long r16 = r16.w()
            r27 = r10
            r9 = r16
            r2.<init>(r3, r4, r5, r6, r7, r9, r11)
            long r3 = r15.f4930a
            long r5 = r15.f4931b
            boolean r7 = r15.f4932c
            r1.o()
            r1.p()
            java.lang.String r8 = r2.f5031a
            x3.AbstractC1887A.d(r8)
            O3.b0 r0 = r0.f4613w
            O3.T1.S(r0)
            com.google.android.gms.internal.measurement.k1 r0 = r0.Q(r2)
            byte[] r0 = r0.a()
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>()
            java.lang.String r10 = "app_id"
            r9.put(r10, r8)
            java.lang.String r10 = r2.f5032b
            java.lang.String r11 = "name"
            r9.put(r11, r10)
            java.lang.String r10 = "timestamp"
            long r1 = r2.f5034d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r9.put(r10, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r2 = "metadata_fingerprint"
            r9.put(r2, r1)
            java.lang.String r1 = "data"
            r9.put(r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.String r1 = "realtime"
            r9.put(r1, r0)
            android.database.sqlite.SQLiteDatabase r0 = r25.f0()     // Catch: android.database.sqlite.SQLiteException -> L2b4
            java.lang.String r1 = "raw_events"
            java.lang.String r2 = "rowid = ?"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L2b4
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: android.database.sqlite.SQLiteException -> L2b4
            int r0 = r0.update(r1, r9, r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L2b4
            long r0 = (long) r0     // Catch: android.database.sqlite.SQLiteException -> L2b4
            r2 = 1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2ac
            O3.C0323t0.l(r27)     // Catch: android.database.sqlite.SQLiteException -> L2b4
            r10 = r27
            O3.V r2 = r10.f4670w     // Catch: android.database.sqlite.SQLiteException -> L2b2
            java.lang.String r3 = "Failed to update raw event. appId, updatedRows"
            O3.W r4 = O3.X.w(r8)     // Catch: android.database.sqlite.SQLiteException -> L2b2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: android.database.sqlite.SQLiteException -> L2b2
            r2.d(r4, r0, r3)     // Catch: android.database.sqlite.SQLiteException -> L2b2
        L2ac:
            r1 = r25
            r5 = r26
            goto L33
        L2b2:
            r0 = move-exception
            goto L2b7
        L2b4:
            r0 = move-exception
            r10 = r27
        L2b7:
            O3.C0323t0.l(r10)
            O3.V r1 = r10.f4670w
            java.lang.String r2 = "Error updating raw event. appId"
            O3.W r3 = O3.X.w(r8)
            r1.d(r3, r0, r2)
            goto L2ac
        L2c6:
            java.util.List r0 = r13.a()
            r1 = r25
            r5 = r26
            goto L29
        L2d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.I(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:10:0x0034 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0014 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:32:0x002e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.J0 J(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f4346r
            O3.t0 r0 = (O3.C0323t0) r0
            x3.AbstractC1887A.g(r5)
            r4.o()
            r4.p()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.f0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            O3.X r1 = r0.f5077v     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            O3.V r1 = r1.f4666E     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.b(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            O3.J0 r2 = O3.J0.c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            O3.X r0 = r0.f5077v     // Catch: java.lang.Throwable -> L32
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L32
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.c(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            O3.J0 r5 = O3.J0.f4496c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.J(java.lang.String):O3.J0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long K(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = f0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e7) {
                X x6 = ((C0323t0) this.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4670w.d(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long L(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = f0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e7) {
                X x6 = ((C0323t0) this.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4670w.d(str, e7, "Database error");
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String M(java.lang.String r4, java.lang.String[] r5) {
        /*
            r3 = this;
            android.database.sqlite.SQLiteDatabase r0 = r3.f0()
            r1 = 0
            android.database.Cursor r1 = r0.rawQuery(r4, r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            boolean r5 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            if (r5 == 0) goto L18
            r5 = 0
            java.lang.String r4 = r1.getString(r5)     // Catch: java.lang.Throwable -> L1e android.database.sqlite.SQLiteException -> L20
            r1.close()
            return r4
        L18:
            r1.close()
            java.lang.String r4 = ""
            return r4
        L1e:
            r4 = move-exception
            goto L32
        L20:
            r5 = move-exception
            java.lang.Object r0 = r3.f4346r     // Catch: java.lang.Throwable -> L1e
            O3.t0 r0 = (O3.C0323t0) r0     // Catch: java.lang.Throwable -> L1e
            O3.X r0 = r0.f5077v     // Catch: java.lang.Throwable -> L1e
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L1e
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "Database error"
            r0.d(r4, r5, r2)     // Catch: java.lang.Throwable -> L1e
            throw r5     // Catch: java.lang.Throwable -> L1e
        L32:
            if (r1 == 0) goto L37
            r1.close()
        L37:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.M(java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(ContentValues contentValues) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        try {
            SQLiteDatabase sQLiteDatabaseF0 = f0();
            if (contentValues.getAsString("app_id") == null) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4672y.c(X.w("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseF0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseF0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4670w.d(X.w("consent_settings"), X.w("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e7) {
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4670w.e("Error storing into table. key", X.w("consent_settings"), X.w("app_id"), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.C0319s O(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r30 = this;
            r1 = r30
            java.lang.Object r0 = r1.f4346r
            r2 = r0
            O3.t0 r2 = (O3.C0323t0) r2
            x3.AbstractC1887A.d(r32)
            x3.AbstractC1887A.d(r33)
            r1.o()
            r1.p()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r10 = "last_exempt_from_sampling"
            java.lang.String r11 = "current_session_count"
            java.lang.String r3 = "lifetime_count"
            java.lang.String r4 = "current_bundle_count"
            java.lang.String r5 = "last_fire_timestamp"
            java.lang.String r6 = "last_bundled_timestamp"
            java.lang.String r7 = "last_bundled_day"
            java.lang.String r8 = "last_sampled_complex_event_id"
            java.lang.String r9 = "last_sampling_rate"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r0.<init>(r3)
            r3 = 0
            android.database.sqlite.SQLiteDatabase r4 = r1.f0()     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10b
            r12 = 0
            java.lang.String[] r5 = new java.lang.String[r12]     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10b
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10b
            r6 = r0
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10b
            java.lang.String r7 = "app_id=? and name=?"
            java.lang.String[] r8 = new java.lang.String[]{r32, r33}     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10b
            r10 = 0
            r11 = 0
            r9 = 0
            r5 = r31
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L109 android.database.sqlite.SQLiteException -> L10b
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r0 != 0) goto L58
            goto L125
        L58:
            long r16 = r4.getLong(r12)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r0 = 1
            long r18 = r4.getLong(r0)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r5 = 2
            long r22 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r5 = 3
            boolean r6 = r4.isNull(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r7 = 0
            if (r6 == 0) goto L72
            r24 = r7
            goto L78
        L72:
            long r5 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r24 = r5
        L78:
            r5 = 4
            boolean r6 = r4.isNull(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r6 == 0) goto L82
            r26 = r3
            goto L8c
        L82:
            long r5 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r26 = r5
        L8c:
            r5 = 5
            boolean r6 = r4.isNull(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r6 == 0) goto L96
            r27 = r3
            goto La0
        L96:
            long r5 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r27 = r5
        La0:
            r5 = 6
            boolean r6 = r4.isNull(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r6 == 0) goto Laa
            r28 = r3
            goto Lb4
        Laa:
            long r5 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r28 = r5
        Lb4:
            r5 = 7
            boolean r6 = r4.isNull(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r6 != 0) goto Lcf
            long r5 = r4.getLong(r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r9 = 1
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto Lc6
            r12 = r0
        Lc6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r29 = r0
            goto Ld1
        Lcd:
            r0 = move-exception
            goto L107
        Lcf:
            r29 = r3
        Ld1:
            r0 = 8
            boolean r5 = r4.isNull(r0)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r5 == 0) goto Ldc
        Ld9:
            r20 = r7
            goto Le1
        Ldc:
            long r7 = r4.getLong(r0)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            goto Ld9
        Le1:
            O3.s r13 = new O3.s     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r14 = r32
            r15 = r33
            r13.<init>(r14, r15, r16, r18, r20, r22, r24, r26, r27, r28, r29)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            if (r0 == 0) goto L103
            O3.X r0 = r2.f5077v     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            java.lang.String r5 = "Got multiple records for event aggregates, expected one. appId"
            O3.W r6 = O3.X.w(r32)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            r0.c(r6, r5)     // Catch: java.lang.Throwable -> Lcd android.database.sqlite.SQLiteException -> L101
            goto L103
        L101:
            r0 = move-exception
            goto L10d
        L103:
            r4.close()
            return r13
        L107:
            r3 = r4
            goto L12b
        L109:
            r0 = move-exception
            goto L12b
        L10b:
            r0 = move-exception
            r4 = r3
        L10d:
            O3.X r5 = r2.f5077v     // Catch: java.lang.Throwable -> Lcd
            O3.C0323t0.l(r5)     // Catch: java.lang.Throwable -> Lcd
            O3.V r5 = r5.f4670w     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = "Error querying events. appId"
            O3.W r7 = O3.X.w(r32)     // Catch: java.lang.Throwable -> Lcd
            O3.Q r2 = r2.f5081z     // Catch: java.lang.Throwable -> Lcd
            r15 = r33
            java.lang.String r2 = r2.a(r15)     // Catch: java.lang.Throwable -> Lcd
            r5.e(r6, r7, r2, r0)     // Catch: java.lang.Throwable -> Lcd
        L125:
            if (r4 == 0) goto L12a
            r4.close()
        L12a:
            return r3
        L12b:
            if (r3 == 0) goto L130
            r3.close()
        L130:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.O(java.lang.String, java.lang.String, java.lang.String):O3.s");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P(String str, C0319s c0319s) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        AbstractC1887A.g(c0319s);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        String str2 = c0319s.f5040a;
        contentValues.put("app_id", str2);
        contentValues.put("name", c0319s.f5041b);
        contentValues.put("lifetime_count", Long.valueOf(c0319s.f5042c));
        contentValues.put("current_bundle_count", Long.valueOf(c0319s.f5043d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c0319s.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c0319s.f5045g));
        contentValues.put("last_bundled_day", c0319s.f5046h);
        contentValues.put("last_sampled_complex_event_id", c0319s.i);
        contentValues.put("last_sampling_rate", c0319s.j);
        contentValues.put("current_session_count", Long.valueOf(c0319s.f5044e));
        Boolean bool = c0319s.f5047k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (f0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4670w.c(X.w(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e7) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.d(X.w(str2), e7, "Error storing event aggregates. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(String str, String str2) {
        AbstractC1887A.d(str2);
        o();
        p();
        try {
            f0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.d(X.w(str2), e7, "Error deleting snapshot. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final U1 R(String str, long j, byte[] bArr, String str2, String str3, int i, int i7, long j7, long j8, long j9) {
        EnumC0292i1 enumC0292i1;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        if (TextUtils.isEmpty(str2)) {
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4665D.b("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            C0845p1 c0845p1 = (C0845p1) C0270b0.b0(C0850q1.w(), bArr);
            EnumC0292i1[] enumC0292i1ArrValues = EnumC0292i1.values();
            int length = enumC0292i1ArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    enumC0292i1 = EnumC0292i1.UNKNOWN;
                    break;
                }
                enumC0292i1 = enumC0292i1ArrValues[i8];
                if (enumC0292i1.f4916q == i) {
                    break;
                }
                i8++;
            }
            if (enumC0292i1 != EnumC0292i1.GOOGLE_SIGNAL && enumC0292i1 != EnumC0292i1.GOOGLE_SIGNAL_PENDING && i7 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((C0850q1) c0845p1.f11012r).p()).iterator();
                while (it.hasNext()) {
                    C0854r1 c0854r1 = (C0854r1) ((C0859s1) it.next()).i();
                    c0854r1.b();
                    ((C0859s1) c0854r1.f11012r).T0(i7);
                    arrayList.add((C0859s1) c0854r1.e());
                }
                c0845p1.b();
                ((C0850q1) c0845p1.f11012r).B();
                c0845p1.b();
                ((C0850q1) c0845p1.f11012r).A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length2 = strArrSplit.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length2) {
                        break;
                    }
                    String str4 = strArrSplit[i9];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        X x7 = c0323t0.f5077v;
                        C0323t0.l(x7);
                        x7.f4670w.c(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i9++;
                }
            }
            return new U1(j, (C0850q1) c0845p1.e(), str2, map, enumC0292i1, j7, j8, j9, i7);
        } catch (IOException e7) {
            X x8 = c0323t0.f5077v;
            C0323t0.l(x8);
            x8.f4670w.d(str, e7, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String S() {
        ((C0323t0) this.f4346r).f5052A.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l7 = (Long) F.f4397S.a(null);
        l7.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l7 + ")";
        String str2 = "(upload_type != 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) F.f4395R.a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        k1.i.s(sb, "(", str, " OR ", str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(String str, I1 i12) {
        o();
        p();
        AbstractC1887A.d(str);
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        B3.a aVar = c0323t0.f5052A;
        X x6 = c0323t0.f5077v;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        E e7 = F.f4462v0;
        long jLongValue = jCurrentTimeMillis - ((Long) e7.a(null)).longValue();
        long j = i12.f4494r;
        if (j < jLongValue || j > ((Long) e7.a(null)).longValue() + jCurrentTimeMillis) {
            C0323t0.l(x6);
            x6.f4673z.e("Storing trigger URI outside of the max retention time span. appId, now, timestamp", X.w(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        C0323t0.l(x6);
        x6.f4666E.b("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", i12.f4493q);
        contentValues.put(FirebaseAnalytics.Param.SOURCE, Integer.valueOf(i12.f4495s));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (f0().insert("trigger_uris", null, contentValues) == -1) {
                C0323t0.l(x6);
                x6.f4670w.c(X.w(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e8) {
            C0323t0.l(x6);
            x6.f4670w.d(X.w(str), e8, "Error storing trigger URI. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V(String str, J0 j02) {
        AbstractC1887A.g(str);
        AbstractC1887A.g(j02);
        o();
        p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", j02.g());
        contentValues.put("consent_source", Integer.valueOf(j02.f4498b));
        N(contentValues);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(String str, J0 j02) {
        AbstractC1887A.g(str);
        o();
        p();
        V(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", j02.g());
        N(contentValues);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J0 X(String str) {
        AbstractC1887A.g(str);
        o();
        p();
        return J0.c(100, M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0319s Y(String str, C0820k1 c0820k1, String str2) {
        C0319s c0319sO = O("events", str, c0820k1.s());
        if (c0319sO != null) {
            long j = c0319sO.f5044e + 1;
            long j7 = c0319sO.f5043d + 1;
            return new C0319s(c0319sO.f5040a, c0319sO.f5041b, c0319sO.f5042c + 1, j7, j, c0319sO.f, c0319sO.f5045g, c0319sO.f5046h, c0319sO.i, c0319sO.j, c0319sO.f5047k);
        }
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        X x6 = c0323t0.f5077v;
        C0323t0.l(x6);
        x6.f4673z.d(X.w(str), c0323t0.f5081z.a(str2), "Event aggregate wasn't created during raw event logging. appId, event");
        return new C0319s(str, c0820k1.s(), 1L, 1L, 1L, c0820k1.u(), 0L, null, null, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean Z() {
        return ((C0323t0) this.f4346r).f5072q.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x007d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x01dd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:0x0087 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00ee, B:43:0x0100, B:44:0x0104, B:45:0x0114, B:47:0x011a, B:48:0x012a, B:50:0x0133, B:53:0x0147, B:55:0x0165, B:56:0x016e, B:57:0x0178, B:62:0x01b3, B:61:0x01a3, B:65:0x01ba, B:52:0x0140, B:67:0x01cc, B:71:0x01df, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100 A[Catch: all -> 0x007a, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007a, blocks: (B:3:0x0018, B:8:0x002c, B:14:0x004a, B:15:0x0066, B:18:0x006e, B:19:0x0072, B:40:0x00ca, B:42:0x00ee, B:43:0x0100, B:44:0x0104, B:45:0x0114, B:47:0x011a, B:48:0x012a, B:50:0x0133, B:53:0x0147, B:55:0x0165, B:56:0x016e, B:57:0x0178, B:62:0x01b3, B:61:0x01a3, B:65:0x01ba, B:52:0x0140, B:67:0x01cc, B:71:0x01df, B:11:0x003e, B:29:0x0089, B:31:0x008f, B:35:0x009e, B:38:0x00c2, B:32:0x0094), top: B:78:0x0018 }] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r21, long r22, long r24, O3.C0285g0 r26) {
        /*
            r20 = this;
            r1 = r20
            r2 = r26
            java.lang.Object r0 = r1.f4346r
            r3 = r0
            O3.t0 r3 = (O3.C0323t0) r3
            r1.o()
            r1.p()
            java.lang.String r0 = " order by rowid limit 1;"
            java.lang.String r4 = "select metadata_fingerprint from raw_events where app_id = ?"
            java.lang.String r5 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            java.lang.String r6 = "select app_id, metadata_fingerprint from raw_events where "
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r1.f0()     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            boolean r9 = android.text.TextUtils.isEmpty(r21)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            r10 = 1
            java.lang.String r11 = ""
            r17 = -1
            r12 = 0
            if (r9 == 0) goto L85
            int r0 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r0 == 0) goto L3e
            java.lang.String r4 = java.lang.String.valueOf(r24)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            java.lang.String r9 = java.lang.String.valueOf(r22)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            java.lang.String[] r4 = new java.lang.String[]{r4, r9}     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            goto L46
        L39:
            r0 = move-exception
            r9 = r21
            goto L1de
        L3e:
            java.lang.String r4 = java.lang.String.valueOf(r22)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
        L46:
            if (r0 == 0) goto L4a
            java.lang.String r11 = "rowid <= ? and "
        L4a:
            int r0 = r11.length()     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            int r0 = r0 + 148
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            r9.<init>(r0)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            r9.append(r6)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            r9.append(r11)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            r9.append(r5)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            java.lang.String r0 = r9.toString()     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            android.database.Cursor r7 = r8.rawQuery(r0, r4)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L80
            if (r0 != 0) goto L6e
            goto L1ef
        L6e:
            java.lang.String r4 = r7.getString(r12)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L80
            java.lang.String r0 = r7.getString(r10)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r7.close()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            goto Lca
        L7a:
            r0 = move-exception
            goto L1f5
        L7d:
            r0 = move-exception
            goto L1df
        L80:
            r0 = move-exception
            r4 = r21
            goto L1df
        L85:
            int r5 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r5 == 0) goto L94
            java.lang.String r6 = java.lang.String.valueOf(r24)     // Catch: android.database.sqlite.SQLiteException -> L39 java.lang.Throwable -> L7a
            r9 = r21
            java.lang.String[] r6 = new java.lang.String[]{r9, r6}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            goto L9a
        L94:
            r9 = r21
            java.lang.String[] r6 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
        L9a:
            if (r5 == 0) goto L9e
            java.lang.String r11 = " and rowid <= ?"
        L9e:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            int r5 = r5 + 84
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            r13.<init>(r5)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            r13.append(r4)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            r13.append(r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            r13.append(r0)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            java.lang.String r0 = r13.toString()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            android.database.Cursor r7 = r8.rawQuery(r0, r6)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            if (r0 != 0) goto Lc2
            goto L1ef
        Lc2:
            java.lang.String r0 = r7.getString(r12)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            r7.close()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L1dd
            r4 = r9
        Lca:
            java.lang.String r9 = "raw_events_metadata"
            java.lang.String r5 = "metadata"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r11 = "app_id = ? and metadata_fingerprint = ?"
            r6 = r12
            java.lang.String[] r12 = new java.lang.String[]{r4, r0}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r15 = "rowid"
            java.lang.String r16 = "2"
            r13 = 0
            r14 = 0
            r19 = r10
            r10 = r5
            r5 = r19
            android.database.Cursor r7 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            boolean r9 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            if (r9 != 0) goto L100
            O3.X r0 = r3.f5077v     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r2 = "Raw event metadata record is missing. appId"
            O3.W r5 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r0.c(r5, r2)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            goto L1ef
        L100:
            byte[] r9 = r7.getBlob(r6)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.r1 r10 = com.google.android.gms.internal.measurement.C0859s1.U()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1cb
            com.google.android.gms.internal.measurement.p2 r9 = O3.C0270b0.b0(r10, r9)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1cb
            com.google.android.gms.internal.measurement.r1 r9 = (com.google.android.gms.internal.measurement.C0854r1) r9     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1cb
            com.google.android.gms.internal.measurement.q2 r9 = r9.e()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1cb
            com.google.android.gms.internal.measurement.s1 r9 = (com.google.android.gms.internal.measurement.C0859s1) r9     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1cb
            boolean r10 = r7.moveToNext()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            if (r10 == 0) goto L12a
            O3.X r10 = r3.f5077v     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.C0323t0.l(r10)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.V r10 = r10.f4673z     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r11 = "Get multiple raw event metadata records, expected one. appId"
            O3.W r12 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r10.c(r12, r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
        L12a:
            r7.close()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r2.f4860b = r9     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            int r9 = (r24 > r17 ? 1 : (r24 == r17 ? 0 : -1))
            if (r9 == 0) goto L140
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            java.lang.String r10 = java.lang.String.valueOf(r24)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String[] r0 = new java.lang.String[]{r4, r0, r10}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
        L13d:
            r12 = r0
            r11 = r9
            goto L147
        L140:
            java.lang.String r9 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r0 = new java.lang.String[]{r4, r0}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            goto L13d
        L147:
            java.lang.String r9 = "raw_events"
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "name"
            java.lang.String r13 = "timestamp"
            java.lang.String r14 = "data"
            java.lang.String[] r10 = new java.lang.String[]{r0, r10, r13, r14}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r15 = "rowid"
            r16 = 0
            r13 = 0
            r14 = 0
            android.database.Cursor r7 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            boolean r0 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            if (r0 == 0) goto L1ba
        L165:
            long r8 = r7.getLong(r6)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r0 = 3
            byte[] r0 = r7.getBlob(r0)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.j1 r10 = com.google.android.gms.internal.measurement.C0820k1.z()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1a2
            com.google.android.gms.internal.measurement.p2 r0 = O3.C0270b0.b0(r10, r0)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1a2
            com.google.android.gms.internal.measurement.j1 r0 = (com.google.android.gms.internal.measurement.C0815j1) r0     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d java.io.IOException -> L1a2
            java.lang.String r10 = r7.getString(r5)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r0.b()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.q2 r11 = r0.f11012r     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.k1 r11 = (com.google.android.gms.internal.measurement.C0820k1) r11     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r11.F(r10)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r10 = 2
            long r10 = r7.getLong(r10)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r0.b()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.q2 r12 = r0.f11012r     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.k1 r12 = (com.google.android.gms.internal.measurement.C0820k1) r12     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r12.G(r10)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.q2 r0 = r0.e()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            com.google.android.gms.internal.measurement.k1 r0 = (com.google.android.gms.internal.measurement.C0820k1) r0     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            boolean r0 = r2.c(r8, r0)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            if (r0 != 0) goto L1b3
            goto L1ef
        L1a2:
            r0 = move-exception
            O3.X r8 = r3.f5077v     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.C0323t0.l(r8)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.V r8 = r8.f4670w     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            O3.W r10 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r8.d(r10, r0, r9)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
        L1b3:
            boolean r0 = r7.moveToNext()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            if (r0 != 0) goto L165
            goto L1ef
        L1ba:
            O3.X r0 = r3.f5077v     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.V r0 = r0.f4673z     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r2 = "Raw event data disappeared while in transaction. appId"
            O3.W r5 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r0.c(r5, r2)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            goto L1ef
        L1cb:
            r0 = move-exception
            O3.X r2 = r3.f5077v     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            java.lang.String r5 = "Data loss. Failed to merge raw event metadata. appId"
            O3.W r6 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            r2.d(r6, r0, r5)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteException -> L7d
            goto L1ef
        L1dd:
            r0 = move-exception
        L1de:
            r4 = r9
        L1df:
            O3.X r2 = r3.f5077v     // Catch: java.lang.Throwable -> L7a
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L7a
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Data loss. Error selecting raw event. appId"
            O3.W r4 = O3.X.w(r4)     // Catch: java.lang.Throwable -> L7a
            r2.d(r4, r0, r3)     // Catch: java.lang.Throwable -> L7a
        L1ef:
            if (r7 == 0) goto L1f4
            r7.close()
        L1f4:
            return
        L1f5:
            if (r7 == 0) goto L1fa
            r7.close()
        L1fa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.a0(java.lang.String, long, long, O3.g0):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0() {
        p();
        f0().beginTransaction();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0() {
        p();
        f0().setTransactionSuccessful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e0() {
        p();
        f0().endTransaction();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SQLiteDatabase f0() {
        o();
        try {
            return this.f4983u.getWritableDatabase();
        } catch (SQLiteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.c(e7, "Error opening database");
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final void g0(String str) {
        C0319s c0319sO;
        Q("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = f0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (c0319sO = O("events", str, string)) != null) {
                            P("events_snapshot", c0319sO);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e7) {
                X x6 = ((C0323t0) this.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4670w.d(X.w(str), e7, "Error creating snapshot. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0(java.lang.String r20) throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "events_snapshot"
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String r4 = "lifetime_count"
            java.lang.String r5 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r5, r4}
            java.util.List r4 = java.util.Arrays.asList(r4)
            r0.<init>(r4)
            java.lang.String r4 = "events"
            java.lang.String r5 = "_f"
            O3.s r6 = r1.O(r4, r2, r5)
            java.lang.String r7 = "_v"
            O3.s r8 = r1.O(r4, r2, r7)
            r1.Q(r4, r2)
            r9 = 0
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r1.f0()     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            java.lang.String r12 = "events_snapshot"
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            java.lang.Object[] r0 = r0.toArray(r13)     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            r13 = r0
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            java.lang.String r14 = "app_id=?"
            java.lang.String[] r15 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            r17 = 0
            r18 = 0
            r16 = 0
            android.database.Cursor r9 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            boolean r0 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L9b android.database.sqlite.SQLiteException -> L9e
            if (r0 != 0) goto L60
            r9.close()
            if (r6 == 0) goto L59
        L54:
            r1.P(r4, r6)
            goto Lc4
        L59:
            if (r8 == 0) goto Lc4
        L5b:
            r1.P(r4, r8)
            goto Lc4
        L60:
            r11 = r10
            r12 = r11
        L62:
            java.lang.String r0 = r9.getString(r10)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r13 = 1
            long r14 = r9.getLong(r13)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            r16 = 1
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L80
            boolean r14 = r5.equals(r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            if (r14 == 0) goto L79
            r11 = r13
            goto L80
        L79:
            boolean r14 = r7.equals(r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            if (r14 == 0) goto L80
            r12 = r13
        L80:
            if (r0 == 0) goto L90
            O3.s r0 = r1.O(r3, r2, r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            if (r0 == 0) goto L90
            r1.P(r4, r0)     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            goto L90
        L8c:
            r0 = move-exception
            goto L97
        L8e:
            r0 = move-exception
            goto L99
        L90:
            boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L8c android.database.sqlite.SQLiteException -> L8e
            if (r0 != 0) goto L62
            goto Lb5
        L97:
            r10 = r11
            goto Lc9
        L99:
            r10 = r11
            goto La0
        L9b:
            r0 = move-exception
            r12 = r10
            goto Lc9
        L9e:
            r0 = move-exception
            r12 = r10
        La0:
            java.lang.Object r5 = r1.f4346r     // Catch: java.lang.Throwable -> Lc8
            O3.t0 r5 = (O3.C0323t0) r5     // Catch: java.lang.Throwable -> Lc8
            O3.X r5 = r5.f5077v     // Catch: java.lang.Throwable -> Lc8
            O3.C0323t0.l(r5)     // Catch: java.lang.Throwable -> Lc8
            O3.V r5 = r5.f4670w     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r7 = "Error querying snapshot. appId"
            O3.W r11 = O3.X.w(r2)     // Catch: java.lang.Throwable -> Lc8
            r5.d(r11, r0, r7)     // Catch: java.lang.Throwable -> Lc8
            r11 = r10
        Lb5:
            if (r9 == 0) goto Lba
            r9.close()
        Lba:
            if (r11 != 0) goto Lbf
            if (r6 == 0) goto Lbf
            goto L54
        Lbf:
            if (r12 != 0) goto Lc4
            if (r8 == 0) goto Lc4
            goto L5b
        Lc4:
            r1.Q(r3, r2)
            return
        Lc8:
            r0 = move-exception
        Lc9:
            if (r9 == 0) goto Lce
            r9.close()
        Lce:
            if (r10 != 0) goto Ld7
            if (r6 != 0) goto Ld3
            goto Ld7
        Ld3:
            r1.P(r4, r6)
            goto Lde
        Ld7:
            if (r12 != 0) goto Lde
            if (r8 == 0) goto Lde
            r1.P(r4, r8)
        Lde:
            r1.Q(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.h0(java.lang.String):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i0(String str, String str2) {
        AbstractC1887A.d(str);
        AbstractC1887A.d(str2);
        o();
        p();
        try {
            f0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.e("Error deleting user property. appId", X.w(str), c0323t0.f5081z.c(str2), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j0(W1 w12) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        String str = w12.f4658b;
        o();
        p();
        String str2 = w12.f4657a;
        String str3 = w12.f4659c;
        if (k0(str2, str3) == null) {
            if (Y1.m0(str3)) {
                if (K("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(c0323t0.f5075t.w(str2, F.f4402V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jK = K("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                c0323t0.getClass();
                if (jK >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(w12.f4660d));
        b0(contentValues, w12.f4661e);
        try {
            if (f0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(X.w(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e7) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.d(X.w(str2), e7, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.W1 k0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4346r
            r1 = r0
            O3.t0 r1 = (O3.C0323t0) r1
            x3.AbstractC1887A.d(r12)
            x3.AbstractC1887A.d(r13)
            r11.o()
            r11.p()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.f0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.B(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            O3.W1 r4 = new O3.W1     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            O3.X r12 = r1.f5077v     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            O3.C0323t0.l(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            O3.V r12 = r12.f4670w     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            O3.W r0 = O3.X.w(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.c(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            O3.X r13 = r1.f5077v     // Catch: java.lang.Throwable -> L67
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> L67
            O3.V r13 = r13.f4670w     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            O3.W r4 = O3.X.w(r5)     // Catch: java.lang.Throwable -> L67
            O3.Q r1 = r1.f5081z     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.c(r7)     // Catch: java.lang.Throwable -> L67
            r13.e(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.k0(java.lang.String, java.lang.String):O3.W1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x009c */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    public final List l0(String str) {
        String str2;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        AbstractC1887A.d(str);
        o();
        p();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                c0323t0.getClass();
                cursorQuery = f0().query("user_attributes", new String[]{"name", FirebaseAnalytics.Param.ORIGIN, "set_timestamp", FirebaseAnalytics.Param.VALUE}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursorQuery.moveToFirst()) {
                        while (true) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j = cursorQuery.getLong(2);
                            Object objB = B(cursorQuery, 3);
                            if (objB == null) {
                                X x6 = c0323t0.f5077v;
                                C0323t0.l(x6);
                                x6.f4670w.c(X.w(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new W1(str2, str3, string, j, objB));
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    X x7 = c0323t0.f5077v;
                                    C0323t0.l(x7);
                                    x7.f4670w.d(X.w(str2), e, "Error querying user properties. appId");
                                    arrayList = Collections.EMPTY_LIST;
                                }
                            }
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e8) {
                    e = e8;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e9) {
            e = e9;
            str2 = str;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x012c */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        O3.C0323t0.l(r13);
        r13.f4670w.c(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            r22 = this;
            r1 = r22
            r0 = r25
            java.lang.Object r2 = r1.f4346r
            O3.t0 r2 = (O3.C0323t0) r2
            x3.AbstractC1887A.d(r23)
            r1.o()
            r1.p()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r12 = "1001"
            java.lang.String r4 = "*"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r14 = 3
            r5.<init>(r14)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r15 = r23
            r5.add(r15)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r7 = "app_id=?"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            boolean r7 = android.text.TextUtils.isEmpty(r24)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            if (r7 != 0) goto L43
            r7 = r24
            r5.add(r7)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r8 = " and origin=?"
            r6.append(r8)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            goto L45
        L3d:
            r0 = move-exception
            goto L114
        L40:
            r0 = move-exception
            goto L116
        L43:
            r7 = r24
        L45:
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r9 = 1
            if (r8 != 0) goto L6c
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            int r8 = r8 + r9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r10.append(r0)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r10.append(r4)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r5.add(r4)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r4 = " and name glob ?"
            r6.append(r4)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
        L6c:
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.Object[] r4 = r5.toArray(r4)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r8 = r4
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            android.database.sqlite.SQLiteDatabase r4 = r1.f0()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r5 = "user_attributes"
            java.lang.String r10 = "name"
            java.lang.String r11 = "set_timestamp"
            java.lang.String r9 = "value"
            java.lang.String r13 = "origin"
            java.lang.String[] r9 = new java.lang.String[]{r10, r11, r9, r13}     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            java.lang.String r11 = "rowid"
            r2.getClass()     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            O3.X r13 = r2.f5077v     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            r7 = r6
            r6 = r9
            r9 = 0
            r10 = 0
            r14 = 1
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L3d android.database.sqlite.SQLiteException -> L40
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> L110
            if (r5 != 0) goto La7
            goto L12c
        La7:
            r5 = r24
        La9:
            int r6 = r3.size()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r6 < r7) goto Lc5
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            O3.V r0 = r13.f4670w     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            java.lang.String r6 = "Read more than the max allowed user properties, ignoring excess"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r0.c(r7, r6)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            goto L12c
        Lc1:
            r0 = move-exception
            goto L10e
        Lc3:
            r0 = move-exception
            goto L10c
        Lc5:
            r6 = 0
            java.lang.String r18 = r4.getString(r6)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            long r19 = r4.getLong(r14)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r6 = 2
            java.lang.Object r21 = r1.B(r4, r6)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            r6 = 3
            java.lang.String r5 = r4.getString(r6)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Lc3
            if (r21 != 0) goto Lef
            O3.C0323t0.l(r13)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Leb
            O3.V r7 = r13.f4670w     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Leb
            java.lang.String r8 = "(2)Read invalid user property value, ignoring it"
            O3.W r9 = O3.X.w(r15)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Leb
            r7.e(r8, r9, r5, r0)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Leb
            r17 = r5
            goto Lfb
        Leb:
            r0 = move-exception
            r17 = r5
            goto L108
        Lef:
            O3.W1 r15 = new O3.W1     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> Leb
            r16 = r23
            r17 = r5
            r15.<init>(r16, r17, r18, r19, r21)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> L107
            r3.add(r15)     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> L107
        Lfb:
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> Lc1 android.database.sqlite.SQLiteException -> L107
            if (r5 != 0) goto L102
            goto L12c
        L102:
            r15 = r23
            r5 = r17
            goto La9
        L107:
            r0 = move-exception
        L108:
            r13 = r4
            r5 = r17
            goto L119
        L10c:
            r13 = r4
            goto L119
        L10e:
            r13 = r4
            goto L133
        L110:
            r0 = move-exception
            r5 = r24
            goto L10c
        L114:
            r13 = 0
            goto L133
        L116:
            r5 = r24
            r13 = 0
        L119:
            O3.X r2 = r2.f5077v     // Catch: java.lang.Throwable -> L132
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L132
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L132
            java.lang.String r3 = "(2)Error querying user properties"
            O3.W r4 = O3.X.w(r23)     // Catch: java.lang.Throwable -> L132
            r2.e(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L132
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L132
            r4 = r13
        L12c:
            if (r4 == 0) goto L131
            r4.close()
        L131:
            return r3
        L132:
            r0 = move-exception
        L133:
            if (r13 == 0) goto L138
            r13.close()
        L138:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.m0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n0(C0278e c0278e) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        p();
        String str = c0278e.f4830q;
        AbstractC1887A.g(str);
        if (k0(str, c0278e.f4832s.f4647r) == null) {
            long jK = K("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            c0323t0.getClass();
            if (jK >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(FirebaseAnalytics.Param.ORIGIN, c0278e.f4831r);
        contentValues.put("name", c0278e.f4832s.f4647r);
        Object objW = c0278e.f4832s.W();
        AbstractC1887A.g(objW);
        b0(contentValues, objW);
        contentValues.put("active", Boolean.valueOf(c0278e.f4834u));
        contentValues.put("trigger_event_name", c0278e.f4835v);
        contentValues.put("trigger_timeout", Long.valueOf(c0278e.f4837x));
        C0328v c0328v = c0278e.f4836w;
        Y1 y12 = c0323t0.f5080y;
        X x6 = c0323t0.f5077v;
        C0323t0.j(y12);
        contentValues.put("timed_out_event", Y1.S(c0328v));
        contentValues.put("creation_timestamp", Long.valueOf(c0278e.f4833t));
        C0323t0.j(y12);
        contentValues.put("triggered_event", Y1.S(c0278e.f4838y));
        contentValues.put("triggered_timestamp", Long.valueOf(c0278e.f4832s.f4648s));
        contentValues.put("time_to_live", Long.valueOf(c0278e.f4839z));
        contentValues.put("expired_event", Y1.S(c0278e.f4829A));
        try {
            if (f0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            C0323t0.l(x6);
            x6.f4670w.c(X.w(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e7) {
            C0323t0.l(x6);
            x6.f4670w.d(X.w(str), e7, "Error storing conditional user property");
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.C0278e o0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            r26 = this;
            r1 = r26
            java.lang.Object r0 = r1.f4346r
            r8 = r0
            O3.t0 r8 = (O3.C0323t0) r8
            x3.AbstractC1887A.d(r27)
            x3.AbstractC1887A.d(r28)
            r1.o()
            r1.p()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r1.f0()     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            java.lang.String r11 = "conditional_properties"
            java.lang.String r12 = "origin"
            java.lang.String r13 = "value"
            java.lang.String r14 = "active"
            java.lang.String r15 = "trigger_event_name"
            java.lang.String r16 = "trigger_timeout"
            java.lang.String r17 = "timed_out_event"
            java.lang.String r18 = "creation_timestamp"
            java.lang.String r19 = "triggered_event"
            java.lang.String r20 = "triggered_timestamp"
            java.lang.String r21 = "time_to_live"
            java.lang.String r22 = "expired_event"
            java.lang.String[] r12 = new java.lang.String[]{r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            java.lang.String r13 = "app_id=? and name=?"
            java.lang.String[] r14 = new java.lang.String[]{r27, r28}     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            r16 = 0
            r17 = 0
            r15 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lf8 android.database.sqlite.SQLiteException -> Lfa
            boolean r0 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            if (r0 != 0) goto L4b
            goto L114
        L4b:
            r0 = 0
            java.lang.String r2 = r10.getString(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            if (r2 != 0) goto L54
            java.lang.String r2 = ""
        L54:
            r13 = r2
            goto L59
        L56:
            r0 = move-exception
            goto Lf6
        L59:
            r2 = 1
            java.lang.Object r5 = r1.B(r10, r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r3 = 2
            int r3 = r10.getInt(r3)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            if (r3 == 0) goto L68
            r17 = r2
            goto L6a
        L68:
            r17 = r0
        L6a:
            r0 = 3
            java.lang.String r18 = r10.getString(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r0 = 4
            long r20 = r10.getLong(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            O3.T1 r0 = r1.f4510s     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            O3.b0 r0 = r0.f4613w     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            O3.T1.S(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r2 = 5
            byte[] r2 = r10.getBlob(r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            android.os.Parcelable$Creator<O3.v> r3 = O3.C0328v.CREATOR     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            android.os.Parcelable r2 = r0.T(r2, r3)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r19 = r2
            O3.v r19 = (O3.C0328v) r19     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r2 = 6
            long r15 = r10.getLong(r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            O3.T1.S(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r2 = 7
            byte[] r2 = r10.getBlob(r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            android.os.Parcelable r2 = r0.T(r2, r3)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r22 = r2
            O3.v r22 = (O3.C0328v) r22     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r2 = 8
            long r6 = r10.getLong(r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r2 = 9
            long r23 = r10.getLong(r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            O3.T1.S(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r2 = 10
            byte[] r2 = r10.getBlob(r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            android.os.Parcelable r0 = r0.T(r2, r3)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r25 = r0
            O3.v r25 = (O3.C0328v) r25     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            O3.V1 r14 = new O3.V1     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lf2
            r3 = r6
            r7 = r13
            r2 = r14
            r6 = r28
            r2.<init>(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            r14 = r2
            r13 = r7
            O3.e r11 = new O3.e     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            r12 = r27
            r11.<init>(r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r25)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            boolean r0 = r10.moveToNext()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            if (r0 == 0) goto Lee
            O3.X r0 = r8.f5077v     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            O3.C0323t0.l(r0)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            O3.V r0 = r0.f4670w     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            java.lang.String r2 = "Got multiple records for conditional property, expected one"
            O3.W r3 = O3.X.w(r27)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            O3.Q r4 = r8.f5081z     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            java.lang.String r4 = r4.c(r6)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            r0.d(r3, r4, r2)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteException -> Lec
            goto Lee
        Lec:
            r0 = move-exception
            goto Lfe
        Lee:
            r10.close()
            return r11
        Lf2:
            r0 = move-exception
            r6 = r28
            goto Lfe
        Lf6:
            r9 = r10
            goto L11a
        Lf8:
            r0 = move-exception
            goto L11a
        Lfa:
            r0 = move-exception
            r6 = r28
            r10 = r9
        Lfe:
            O3.X r2 = r8.f5077v     // Catch: java.lang.Throwable -> L56
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L56
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L56
            java.lang.String r3 = "Error querying conditional property"
            O3.W r4 = O3.X.w(r27)     // Catch: java.lang.Throwable -> L56
            O3.Q r5 = r8.f5081z     // Catch: java.lang.Throwable -> L56
            java.lang.String r5 = r5.c(r6)     // Catch: java.lang.Throwable -> L56
            r2.e(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L56
        L114:
            if (r10 == 0) goto L119
            r10.close()
        L119:
            return r9
        L11a:
            if (r9 == 0) goto L11f
            r9.close()
        L11f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.o0(java.lang.String, java.lang.String):O3.e");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p0(String str, String str2) {
        AbstractC1887A.d(str);
        AbstractC1887A.d(str2);
        o();
        p();
        try {
            f0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            X x6 = c0323t0.f5077v;
            C0323t0.l(x6);
            x6.f4670w.e("Error deleting conditional property", X.w(str), c0323t0.f5081z.c(str2), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List q0(String str, String str2, String str3) {
        AbstractC1887A.d(str);
        o();
        p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return r0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x010a */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.f5077v;
        O3.C0323t0.l(r3);
        r3.f4670w.c(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r0(java.lang.String r29, java.lang.String[] r30) {
        /*
            r28 = this;
            r1 = r28
            java.lang.Object r0 = r1.f4346r
            r2 = r0
            O3.t0 r2 = (O3.C0323t0) r2
            r1.o()
            r1.p()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r11 = "1001"
            r12 = 0
            android.database.sqlite.SQLiteDatabase r3 = r1.f0()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r4 = "conditional_properties"
            java.lang.String r13 = "app_id"
            java.lang.String r14 = "origin"
            java.lang.String r15 = "name"
            java.lang.String r16 = "value"
            java.lang.String r17 = "active"
            java.lang.String r18 = "trigger_event_name"
            java.lang.String r19 = "trigger_timeout"
            java.lang.String r20 = "timed_out_event"
            java.lang.String r21 = "creation_timestamp"
            java.lang.String r22 = "triggered_event"
            java.lang.String r23 = "triggered_timestamp"
            java.lang.String r24 = "time_to_live"
            java.lang.String r25 = "expired_event"
            java.lang.String[] r5 = new java.lang.String[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25}     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r10 = "rowid"
            r2.getClass()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r8 = 0
            r9 = 0
            r6 = r29
            r7 = r30
            android.database.Cursor r12 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            boolean r3 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            if (r3 == 0) goto L10a
        L4e:
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L6e
            O3.X r3 = r2.f5077v     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r5 = "Read more than the max allowed conditional properties, ignoring extra"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r3.c(r4, r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            goto L10a
        L68:
            r0 = move-exception
            goto L110
        L6b:
            r0 = move-exception
            goto Lfc
        L6e:
            r3 = 0
            java.lang.String r14 = r12.getString(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 1
            java.lang.String r15 = r12.getString(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r5 = 2
            java.lang.String r9 = r12.getString(r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r5 = 3
            java.lang.Object r8 = r1.B(r12, r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r5 = 4
            int r5 = r12.getInt(r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            if (r5 == 0) goto L8c
            r19 = r4
            goto L8e
        L8c:
            r19 = r3
        L8e:
            r3 = 5
            java.lang.String r20 = r12.getString(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r3 = 6
            long r22 = r12.getLong(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.T1 r3 = r1.f4510s     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.b0 r3 = r3.f4613w     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.T1.S(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 7
            byte[] r4 = r12.getBlob(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            android.os.Parcelable$Creator<O3.v> r5 = O3.C0328v.CREATOR     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            android.os.Parcelable r4 = r3.T(r4, r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r21 = r4
            O3.v r21 = (O3.C0328v) r21     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 8
            long r17 = r12.getLong(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.T1.S(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 9
            byte[] r4 = r12.getBlob(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            android.os.Parcelable r4 = r3.T(r4, r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r24 = r4
            O3.v r24 = (O3.C0328v) r24     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 10
            long r6 = r12.getLong(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 11
            long r25 = r12.getLong(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.T1.S(r3)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r4 = 12
            byte[] r4 = r12.getBlob(r4)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            android.os.Parcelable r3 = r3.T(r4, r5)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r27 = r3
            O3.v r27 = (O3.C0328v) r27     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            O3.V1 r16 = new O3.V1     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r10 = r15
            r5 = r16
            r5.<init>(r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r16 = r5
            r15 = r10
            O3.e r13 = new O3.e     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r13.<init>(r14, r15, r16, r17, r19, r20, r21, r22, r24, r25, r27)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            r0.add(r13)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            boolean r3 = r12.moveToNext()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6b
            if (r3 != 0) goto L4e
            goto L10a
        Lfc:
            O3.X r2 = r2.f5077v     // Catch: java.lang.Throwable -> L68
            O3.C0323t0.l(r2)     // Catch: java.lang.Throwable -> L68
            O3.V r2 = r2.f4670w     // Catch: java.lang.Throwable -> L68
            java.lang.String r3 = "Error querying conditional user property value"
            r2.c(r0, r3)     // Catch: java.lang.Throwable -> L68
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L68
        L10a:
            if (r12 == 0) goto L10f
            r12.close()
        L10f:
            return r0
        L110:
            if (r12 == 0) goto L115
            r12.close()
        L115:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.r0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long s(String str, C0850q1 c0850q1, String str2, Map map, EnumC0292i1 enumC0292i1, Long l7) {
        int iDelete;
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        p();
        AbstractC1887A.g(c0850q1);
        AbstractC1887A.d(str);
        o();
        p();
        if (Z()) {
            T1 t12 = this.f4510s;
            long jA = t12.f4615y.f5164w.a();
            B3.a aVar = c0323t0.f5052A;
            X x6 = c0323t0.f5077v;
            aVar.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) F.f4385M.a(null)).longValue()) {
                t12.f4615y.f5164w.b(jElapsedRealtime);
                o();
                p();
                if (Z() && (iDelete = f0().delete("upload_queue", S(), new String[0])) > 0) {
                    C0323t0.l(x6);
                    x6.f4666E.c(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                AbstractC1887A.d(str);
                o();
                p();
                try {
                    int iW = c0323t0.f5075t.w(str, F.f4362A);
                    if (iW > 0) {
                        f0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iW)});
                    }
                } catch (SQLiteException e7) {
                    C0323t0.l(x6);
                    x6.f4670w.d(X.w(str), e7, "Error deleting over the limit queued batches. appId");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrA = c0850q1.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrA);
        contentValues.put("upload_uri", str2);
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb2.toString());
        contentValues.put("upload_type", Integer.valueOf(enumC0292i1.f4916q));
        B3.a aVar2 = c0323t0.f5052A;
        X x7 = c0323t0.f5077v;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l7 != null) {
            contentValues.put("associated_row_id", l7);
        }
        try {
            long jInsert = f0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            C0323t0.l(x7);
            x7.f4670w.c(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e8) {
            C0323t0.l(x7);
            x7.f4670w.d(str, e8, "Error storing MeasurementBatch to upload_queue. appId");
            return -1L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O3.C0273c0 s0(java.lang.String r53) {
        /*
            r52 = this;
            r1 = r52
            r2 = r53
            java.lang.Object r0 = r1.f4346r
            r3 = r0
            O3.t0 r3 = (O3.C0323t0) r3
            x3.AbstractC1887A.d(r2)
            r1.o()
            r1.p()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r1.f0()     // Catch: java.lang.Throwable -> L3d1 android.database.sqlite.SQLiteException -> L3d3
            java.lang.String r6 = "apps"
            java.lang.String r7 = "app_instance_id"
            java.lang.String r8 = "gmp_app_id"
            java.lang.String r9 = "resettable_device_id_hash"
            java.lang.String r10 = "last_bundle_index"
            java.lang.String r11 = "last_bundle_start_timestamp"
            java.lang.String r12 = "last_bundle_end_timestamp"
            java.lang.String r13 = "app_version"
            java.lang.String r14 = "app_store"
            java.lang.String r15 = "gmp_version"
            java.lang.String r16 = "dev_cert_hash"
            java.lang.String r17 = "measurement_enabled"
            java.lang.String r18 = "day"
            java.lang.String r19 = "daily_public_events_count"
            java.lang.String r20 = "daily_events_count"
            java.lang.String r21 = "daily_conversions_count"
            java.lang.String r22 = "config_fetched_time"
            java.lang.String r23 = "failed_config_fetch_time"
            java.lang.String r24 = "app_version_int"
            java.lang.String r25 = "firebase_instance_id"
            java.lang.String r26 = "daily_error_events_count"
            java.lang.String r27 = "daily_realtime_events_count"
            java.lang.String r28 = "health_monitor_sample"
            java.lang.String r29 = "android_id"
            java.lang.String r30 = "adid_reporting_enabled"
            java.lang.String r31 = "admob_app_id"
            java.lang.String r32 = "dynamite_version"
            java.lang.String r33 = "safelisted_events"
            java.lang.String r34 = "ga_app_id"
            java.lang.String r35 = "session_stitching_token"
            java.lang.String r36 = "sgtm_upload_enabled"
            java.lang.String r37 = "target_os_version"
            java.lang.String r38 = "session_stitching_token_hash"
            java.lang.String r39 = "ad_services_version"
            java.lang.String r40 = "unmatched_first_open_without_ad_id"
            java.lang.String r41 = "npa_metadata_value"
            java.lang.String r42 = "attribution_eligibility_status"
            java.lang.String r43 = "sgtm_preview_key"
            java.lang.String r44 = "dma_consent_state"
            java.lang.String r45 = "daily_realtime_dcu_count"
            java.lang.String r46 = "bundle_delivery_index"
            java.lang.String r47 = "serialized_npa_metadata"
            java.lang.String r48 = "unmatched_pfo"
            java.lang.String r49 = "unmatched_uwa"
            java.lang.String r50 = "ad_campaign_info"
            java.lang.String r51 = "client_upload_eligibility"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51}     // Catch: java.lang.Throwable -> L3d1 android.database.sqlite.SQLiteException -> L3d3
            java.lang.String r8 = "app_id=?"
            java.lang.String[] r9 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L3d1 android.database.sqlite.SQLiteException -> L3d3
            r11 = 0
            r12 = 0
            r10 = 0
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L3d1 android.database.sqlite.SQLiteException -> L3d3
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r0 != 0) goto L8c
            goto L3e5
        L8c:
            O3.c0 r0 = new O3.c0     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.T1 r6 = r1.f4510s     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.t0 r7 = r6.f4582B     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.t0 r7 = r0.f4793a     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.J0 r8 = r6.a(r2)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.I0 r9 = O3.I0.ANALYTICS_STORAGE     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r8 = r8.i(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r10 = 0
            if (r8 == 0) goto Laf
            java.lang.String r8 = r5.getString(r10)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.F(r8)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            goto Laf
        Lac:
            r0 = move-exception
            goto L3cf
        Laf:
            r8 = 1
            java.lang.String r11 = r5.getString(r8)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.H(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.J0 r11 = r6.a(r2)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.I0 r12 = O3.I0.AD_STORAGE     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = r11.i(r12)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == 0) goto Lcb
            r11 = 2
            java.lang.String r11 = r5.getString(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.I(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        Lcb:
            r11 = 3
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.e(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 4
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.L(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 5
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.M(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 6
            java.lang.String r11 = r5.getString(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.O(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 7
            java.lang.String r11 = r5.getString(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.R(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 8
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.S(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 9
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.a(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 10
            boolean r12 = r5.isNull(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r12 != 0) goto L113
            int r11 = r5.getInt(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == 0) goto L115
        L113:
            r11 = r8
            goto L116
        L115:
            r11 = r10
        L116:
            r0.d(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 11
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.i(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 12
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.j(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 13
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.k(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 14
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.l(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 15
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 16
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.g(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 17
            boolean r12 = r5.isNull(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r12 == 0) goto L15b
            r11 = -2147483648(0xffffffff80000000, double:NaN)
            goto L160
        L15b:
            int r11 = r5.getInt(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            long r11 = (long) r11     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L160:
            r0.Q(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 18
            java.lang.String r11 = r5.getString(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.K(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 19
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.n(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 20
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.m(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 21
            java.lang.String r11 = r5.getString(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.v(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 23
            boolean r12 = r5.isNull(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r12 != 0) goto L195
            int r11 = r5.getInt(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == 0) goto L197
        L195:
            r11 = r8
            goto L198
        L197:
            r11 = r10
        L198:
            O3.p0 r12 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r12)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r12.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r12 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r13 = r0.f4805p     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r13 == r11) goto L1a8
            r13 = r8
            goto L1a9
        L1a8:
            r13 = r10
        L1a9:
            r12 = r12 | r13
            r0.f4790Q = r12     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4805p = r11     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 25
            boolean r12 = r5.isNull(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r12 == 0) goto L1b9
            r11 = 0
            goto L1bd
        L1b9:
            long r11 = r5.getLong(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L1bd:
            r0.c(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = 26
            boolean r12 = r5.isNull(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r12 != 0) goto L1da
            java.lang.String r11 = r5.getString(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.String r12 = ","
            r13 = -1
            java.lang.String[] r11 = r11.split(r12, r13)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.x(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L1da:
            O3.J0 r6 = r6.a(r2)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r6 = r6.i(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r6 == 0) goto L204
            r6 = 28
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.String r11 = r0.f4809t     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = java.util.Objects.equals(r11, r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = r11 ^ r8
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4809t = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            goto L204
        L201:
            r0 = move-exception
            goto L3d5
        L204:
            r6 = 29
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 != 0) goto L214
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r6 == 0) goto L214
            r6 = r8
            goto L215
        L214:
            r6 = r10
        L215:
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = r0.f4810u     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L225
            r11 = r8
            goto L226
        L225:
            r11 = r10
        L226:
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4810u = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 39
            long r11 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.r(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 36
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.String r11 = r0.f4776C     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L24a
            r11 = r8
            goto L24b
        L24a:
            r11 = r10
        L24b:
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4776C = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 30
            long r11 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.z(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 31
            long r11 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.A(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            com.google.android.gms.internal.measurement.Y3.a()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.g r6 = r3.f5075t     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.E r9 = O3.F.f4392P0     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r6 = r6.y(r2, r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r6 == 0) goto L294
            r6 = 32
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            int r11 = r0.f4813x     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L285
            r11 = r8
            goto L286
        L285:
            r11 = r10
        L286:
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4813x = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 35
            long r11 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.B(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L294:
            r6 = 33
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 != 0) goto L2a4
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r6 == 0) goto L2a4
            r6 = r8
            goto L2a5
        L2a4:
            r6 = r10
        L2a5:
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = r0.f4814y     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L2b5
            r11 = r8
            goto L2b6
        L2b5:
            r11 = r10
        L2b6:
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4814y = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 34
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 == 0) goto L2c5
            r6 = r4
            goto L2d2
        L2c5:
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r6 == 0) goto L2cd
            r6 = r8
            goto L2ce
        L2cd:
            r6 = r10
        L2ce:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L2d2:
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.Boolean r11 = r0.f4806q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = java.util.Objects.equals(r11, r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = r11 ^ r8
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4806q = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 37
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.p(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 38
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.q(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 40
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 == 0) goto L305
            java.lang.String r6 = ""
            goto L30c
        L305:
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            x3.AbstractC1887A.g(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L30c:
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.String r11 = r0.f4780G     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L31c
            r11 = r8
            goto L31d
        L31c:
            r11 = r10
        L31d:
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4780G = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 41
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 != 0) goto L348
            long r11 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.Long r11 = r0.f4815z     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = java.util.Objects.equals(r11, r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = r11 ^ r8
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4815z = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L348:
            r6 = 42
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 != 0) goto L36e
            long r11 = r5.getLong(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.Long r6 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.Long r11 = r0.f4774A     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r11 = java.util.Objects.equals(r11, r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r11 = r11 ^ r8
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4774A = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L36e:
            r6 = 43
            byte[] r6 = r5.getBlob(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            byte[] r11 = r0.f4781H     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L384
            r11 = r8
            goto L385
        L384:
            r11 = r10
        L385:
            r9 = r9 | r11
            r0.f4790Q = r9     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4781H = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6 = 44
            boolean r9 = r5.isNull(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r9 != 0) goto L3ab
            int r6 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.p0 r9 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r9)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r9.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r9 = r0.f4790Q     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            int r11 = r0.f4782I     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r11 == r6) goto L3a5
            goto L3a6
        L3a5:
            r8 = r10
        L3a6:
            r8 = r8 | r9
            r0.f4790Q = r8     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4782I = r6     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L3ab:
            O3.p0 r6 = r7.f5078w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6.o()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r0.f4790Q = r10     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            if (r6 == 0) goto L3cb
            O3.X r6 = r3.f5077v     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            O3.V r6 = r6.f4670w     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            java.lang.String r7 = "Got multiple records for app, expected one. appId"
            O3.W r8 = O3.X.w(r2)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> Lac android.database.sqlite.SQLiteException -> L201
        L3cb:
            r5.close()
            return r0
        L3cf:
            r4 = r5
            goto L3eb
        L3d1:
            r0 = move-exception
            goto L3eb
        L3d3:
            r0 = move-exception
            r5 = r4
        L3d5:
            O3.X r3 = r3.f5077v     // Catch: java.lang.Throwable -> Lac
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> Lac
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> Lac
            java.lang.String r6 = "Error querying app. appId"
            O3.W r2 = O3.X.w(r2)     // Catch: java.lang.Throwable -> Lac
            r3.d(r2, r0, r6)     // Catch: java.lang.Throwable -> Lac
        L3e5:
            if (r5 == 0) goto L3ea
            r5.close()
        L3ea:
            return r4
        L3eb:
            if (r4 == 0) goto L3f0
            r4.close()
        L3f0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.s0(java.lang.String):O3.c0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List t(java.lang.String r19, O3.M1 r20, int r21) {
        /*
            r18 = this;
            x3.AbstractC1887A.d(r19)
            r18.o()
            r18.p()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.f0()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r6 = r20
            java.util.List r6 = r6.f4518q     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = T(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.S()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r6.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L66
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = r0
            goto L67
        L66:
            r11 = r2
        L67:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
        L72:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto Lb9
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r3 = r18
            r4 = r19
            O3.U1 r1 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto L72
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto L72
        Lb5:
            r0 = move-exception
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Lbf
        Lb9:
            r3 = r18
            goto Ld5
        Lbc:
            r3 = r18
            goto Ldc
        Lbf:
            r3 = r18
            java.lang.Object r1 = r3.f4346r     // Catch: java.lang.Throwable -> Ldb
            O3.t0 r1 = (O3.C0323t0) r1     // Catch: java.lang.Throwable -> Ldb
            O3.X r1 = r1.f5077v     // Catch: java.lang.Throwable -> Ldb
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> Ldb
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.d(r5, r0, r4)     // Catch: java.lang.Throwable -> Ldb
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r2 == 0) goto Lda
            r2.close()
        Lda:
            return r0
        Ldb:
            r0 = move-exception
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.t(java.lang.String, O3.M1, int):java.util.List");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t0(C0273c0 c0273c0, boolean z5) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        C0323t0 c0323t02 = c0273c0.f4793a;
        o();
        p();
        String strD = c0273c0.D();
        AbstractC1887A.g(strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD);
        I0 i02 = I0.ANALYTICS_STORAGE;
        T1 t12 = this.f4510s;
        if (z5) {
            contentValues.put("app_instance_id", (String) null);
        } else if (t12.a(strD).i(i02)) {
            contentValues.put("app_instance_id", c0273c0.E());
        }
        contentValues.put("gmp_app_id", c0273c0.G());
        if (t12.a(strD).i(I0.AD_STORAGE)) {
            C0312p0 c0312p0 = c0323t02.f5078w;
            C0323t0.l(c0312p0);
            c0312p0.o();
            contentValues.put("resettable_device_id_hash", c0273c0.f4797e);
        }
        C0312p0 c0312p02 = c0323t02.f5078w;
        C0323t0.l(c0312p02);
        c0312p02.o();
        contentValues.put("last_bundle_index", Long.valueOf(c0273c0.f4798g));
        C0312p0 c0312p03 = c0323t02.f5078w;
        C0323t0.l(c0312p03);
        c0312p03.o();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c0273c0.f4799h));
        C0312p0 c0312p04 = c0323t02.f5078w;
        C0323t0.l(c0312p04);
        c0312p04.o();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c0273c0.i));
        contentValues.put("app_version", c0273c0.N());
        C0312p0 c0312p05 = c0323t02.f5078w;
        C0323t0.l(c0312p05);
        c0312p05.o();
        contentValues.put("app_store", c0273c0.f4801l);
        C0312p0 c0312p06 = c0323t02.f5078w;
        C0323t0.l(c0312p06);
        c0312p06.o();
        contentValues.put("gmp_version", Long.valueOf(c0273c0.f4802m));
        C0312p0 c0312p07 = c0323t02.f5078w;
        C0323t0.l(c0312p07);
        c0312p07.o();
        contentValues.put("dev_cert_hash", Long.valueOf(c0273c0.f4803n));
        C0312p0 c0312p08 = c0323t02.f5078w;
        C0323t0.l(c0312p08);
        c0312p08.o();
        contentValues.put("measurement_enabled", Boolean.valueOf(c0273c0.f4804o));
        C0312p0 c0312p09 = c0323t02.f5078w;
        C0312p0 c0312p010 = c0323t02.f5078w;
        C0323t0.l(c0312p09);
        c0312p09.o();
        contentValues.put("day", Long.valueOf(c0273c0.f4783J));
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("daily_public_events_count", Long.valueOf(c0273c0.f4784K));
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("daily_events_count", Long.valueOf(c0273c0.f4785L));
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("daily_conversions_count", Long.valueOf(c0273c0.f4786M));
        C0312p0 c0312p011 = c0323t02.f5078w;
        C0323t0.l(c0312p011);
        c0312p011.o();
        contentValues.put("config_fetched_time", Long.valueOf(c0273c0.f4791R));
        C0312p0 c0312p012 = c0323t02.f5078w;
        C0323t0.l(c0312p012);
        c0312p012.o();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c0273c0.f4792S));
        contentValues.put("app_version_int", Long.valueOf(c0273c0.P()));
        contentValues.put("firebase_instance_id", c0273c0.J());
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("daily_error_events_count", Long.valueOf(c0273c0.f4787N));
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c0273c0.f4788O));
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("health_monitor_sample", c0273c0.f4789P);
        contentValues.put("android_id", (Long) 0L);
        C0312p0 c0312p013 = c0323t02.f5078w;
        C0323t0.l(c0312p013);
        c0312p013.o();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c0273c0.f4805p));
        contentValues.put("dynamite_version", Long.valueOf(c0273c0.b()));
        if (t12.a(strD).i(i02)) {
            C0312p0 c0312p014 = c0323t02.f5078w;
            C0323t0.l(c0312p014);
            c0312p014.o();
            contentValues.put("session_stitching_token", c0273c0.f4809t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c0273c0.y()));
        C0312p0 c0312p015 = c0323t02.f5078w;
        C0323t0.l(c0312p015);
        c0312p015.o();
        contentValues.put("target_os_version", Long.valueOf(c0273c0.f4811v));
        C0312p0 c0312p016 = c0323t02.f5078w;
        C0323t0.l(c0312p016);
        c0312p016.o();
        contentValues.put("session_stitching_token_hash", Long.valueOf(c0273c0.f4812w));
        Y3.a();
        C0284g c0284g = c0323t0.f5075t;
        X x6 = c0323t0.f5077v;
        if (c0284g.y(strD, F.f4392P0)) {
            C0312p0 c0312p017 = c0323t02.f5078w;
            C0323t0.l(c0312p017);
            c0312p017.o();
            contentValues.put("ad_services_version", Integer.valueOf(c0273c0.f4813x));
            C0312p0 c0312p018 = c0323t02.f5078w;
            C0323t0.l(c0312p018);
            c0312p018.o();
            contentValues.put("attribution_eligibility_status", Long.valueOf(c0273c0.f4775B));
        }
        C0312p0 c0312p019 = c0323t02.f5078w;
        C0323t0.l(c0312p019);
        c0312p019.o();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c0273c0.f4814y));
        contentValues.put("npa_metadata_value", c0273c0.w());
        C0312p0 c0312p020 = c0323t02.f5078w;
        C0323t0.l(c0312p020);
        c0312p020.o();
        contentValues.put("bundle_delivery_index", Long.valueOf(c0273c0.f4779F));
        contentValues.put("sgtm_preview_key", c0273c0.C());
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("dma_consent_state", Integer.valueOf(c0273c0.f4777D));
        C0323t0.l(c0312p010);
        c0312p010.o();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(c0273c0.f4778E));
        contentValues.put("serialized_npa_metadata", c0273c0.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(c0273c0.t()));
        C0312p0 c0312p021 = c0323t02.f5078w;
        C0323t0.l(c0312p021);
        c0312p021.o();
        ArrayList arrayList = c0273c0.f4808s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C0323t0.l(x6);
                x6.f4673z.c(strD, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (c0323t0.f5075t.y(null, F.f4382K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        C0312p0 c0312p022 = c0323t02.f5078w;
        C0323t0.l(c0312p022);
        c0312p022.o();
        contentValues.put("unmatched_pfo", c0273c0.f4815z);
        C0312p0 c0312p023 = c0323t02.f5078w;
        C0323t0.l(c0312p023);
        c0312p023.o();
        contentValues.put("unmatched_uwa", c0273c0.f4774A);
        C0312p0 c0312p024 = c0323t02.f5078w;
        C0323t0.l(c0312p024);
        c0312p024.o();
        contentValues.put("ad_campaign_info", c0273c0.f4781H);
        try {
            SQLiteDatabase sQLiteDatabaseF0 = f0();
            if (sQLiteDatabaseF0.update("apps", contentValues, "app_id = ?", new String[]{strD}) == 0 && sQLiteDatabaseF0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C0323t0.l(x6);
                x6.f4670w.c(X.w(strD), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e7) {
            C0323t0.l(x6);
            x6.f4670w.d(X.w(strD), e7, "Error storing app. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u(String str) {
        EnumC0292i1[] enumC0292i1Arr = {EnumC0292i1.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC0292i1Arr[0].f4916q));
        String strT = T(arrayList);
        String strS = S();
        StringBuilder sb = new StringBuilder(strT.length() + 61 + strS.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(strT);
        sb.append(" AND NOT ");
        sb.append(strS);
        return K(sb.toString(), new String[]{str}) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0293j u0(long j, String str, boolean z5, boolean z6, boolean z7, boolean z8) {
        return v0(j, str, 1L, false, false, z5, false, z6, z7, z8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(Long l7) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        p();
        try {
            if (f0().delete("upload_queue", "rowid=?", new String[]{l7.toString()}) != 1) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.b("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e7) {
            X x7 = c0323t0.f5077v;
            C0323t0.l(x7);
            x7.f4670w.c(e7, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0293j v0(long j, String str, long j7, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        AbstractC1887A.d(str);
        o();
        p();
        String[] strArr = {str};
        C0293j c0293j = new C0293j();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseF0 = f0();
                cursorQuery = sQLiteDatabaseF0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        c0293j.f4918b = cursorQuery.getLong(1);
                        c0293j.f4917a = cursorQuery.getLong(2);
                        c0293j.f4919c = cursorQuery.getLong(3);
                        c0293j.f4920d = cursorQuery.getLong(4);
                        c0293j.f4921e = cursorQuery.getLong(5);
                        c0293j.f = cursorQuery.getLong(6);
                        c0293j.f4922g = cursorQuery.getLong(7);
                    }
                    if (z5) {
                        c0293j.f4918b += j7;
                    }
                    if (z6) {
                        c0293j.f4917a += j7;
                    }
                    if (z7) {
                        c0293j.f4919c += j7;
                    }
                    if (z8) {
                        c0293j.f4920d += j7;
                    }
                    if (z9) {
                        c0293j.f4921e += j7;
                    }
                    if (z10) {
                        c0293j.f += j7;
                    }
                    if (z11) {
                        c0293j.f4922g += j7;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(c0293j.f4917a));
                    contentValues.put("daily_events_count", Long.valueOf(c0293j.f4918b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c0293j.f4919c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c0293j.f4920d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c0293j.f4921e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c0293j.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c0293j.f4922g));
                    sQLiteDatabaseF0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    X x6 = c0323t0.f5077v;
                    C0323t0.l(x6);
                    x6.f4673z.c(X.w(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e7) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4670w.d(X.w(str), e7, "Error updating daily counts. appId");
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c0293j;
        } catch (Throwable th) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0022 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String w() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.f0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f4346r     // Catch: java.lang.Throwable -> L1a
            O3.t0 r3 = (O3.C0323t0) r3     // Catch: java.lang.Throwable -> L1a
            O3.X r3 = r3.f5077v     // Catch: java.lang.Throwable -> L1a
            O3.C0323t0.l(r3)     // Catch: java.lang.Throwable -> L1a
            O3.V r3 = r3.f4670w     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.c(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.w():java.lang.String");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:19:0x006b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B0.G0 w0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f4346r
            r1 = r0
            O3.t0 r1 = (O3.C0323t0) r1
            x3.AbstractC1887A.d(r12)
            r11.o()
            r11.p()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.f0()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L82
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            O3.X r6 = r1.f5077v     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            O3.C0323t0.l(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            O3.V r6 = r6.f4670w     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            O3.W r8 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.c(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6b
        L5c:
            r0 = move-exception
            goto L72
        L5e:
            if (r0 != 0) goto L61
            goto L82
        L61:
            B0.G0 r6 = new B0.G0     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 7
            r6.<init>(r0, r4, r5, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6b:
            r2 = r3
            goto L88
        L6d:
            r0 = move-exception
            r12 = r0
            goto L88
        L70:
            r0 = move-exception
            r3 = r2
        L72:
            O3.X r1 = r1.f5077v     // Catch: java.lang.Throwable -> L59
            O3.C0323t0.l(r1)     // Catch: java.lang.Throwable -> L59
            O3.V r1 = r1.f4670w     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            O3.W r12 = O3.X.w(r12)     // Catch: java.lang.Throwable -> L59
            r1.d(r12, r0, r4)     // Catch: java.lang.Throwable -> L59
        L82:
            if (r3 == 0) goto L87
            r3.close()
        L87:
            return r2
        L88:
            if (r2 == 0) goto L8d
            r2.close()
        L8d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.C0305n.w0(java.lang.String):B0.G0");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(long j) {
        o();
        p();
        try {
            if (f0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e7) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.c(e7, "Failed to delete a bundle in a queue table");
            throw e7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x0(C0859s1 c0859s1, boolean z5) {
        o();
        p();
        AbstractC1887A.d(c0859s1.p());
        if (!c0859s1.b2()) {
            throw new IllegalStateException();
        }
        y();
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        B3.a aVar = c0323t0.f5052A;
        X x6 = c0323t0.f5077v;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = c0859s1.c2();
        E e7 = F.f4395R;
        if (jC2 < jCurrentTimeMillis - ((Long) e7.a(null)).longValue() || c0859s1.c2() > ((Long) e7.a(null)).longValue() + jCurrentTimeMillis) {
            C0323t0.l(x6);
            x6.f4673z.e("Storing bundle outside of the max uploading time span. appId, now, timestamp", X.w(c0859s1.p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c0859s1.c2()));
        }
        byte[] bArrA = c0859s1.a();
        try {
            C0270b0 c0270b0 = this.f4510s.f4613w;
            T1.S(c0270b0);
            byte[] bArrA0 = c0270b0.a0(bArrA);
            C0323t0.l(x6);
            x6.f4666E.c(Integer.valueOf(bArrA0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", c0859s1.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c0859s1.c2()));
            contentValues.put("data", bArrA0);
            contentValues.put("has_realtime", Integer.valueOf(z5 ? 1 : 0));
            if (c0859s1.p0()) {
                contentValues.put("retry_count", Integer.valueOf(c0859s1.q0()));
            }
            try {
                if (f0().insert("queue", null, contentValues) == -1) {
                    C0323t0.l(x6);
                    x6.f4670w.c(X.w(c0859s1.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e8) {
                C0323t0.l(x6);
                x6.f4670w.d(X.w(c0859s1.p()), e8, "Error storing bundle. appId");
            }
        } catch (IOException e9) {
            C0323t0.l(x6);
            x6.f4670w.d(X.w(c0859s1.p()), e9, "Data loss. Failed to serialize bundle. appId");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y() {
        o();
        p();
        if (Z()) {
            T1 t12 = this.f4510s;
            long jA = t12.f4615y.f5163v.a();
            C0323t0 c0323t0 = (C0323t0) this.f4346r;
            c0323t0.f5052A.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jA) > ((Long) F.f4385M.a(null)).longValue()) {
                t12.f4615y.f5163v.b(jElapsedRealtime);
                o();
                p();
                if (Z()) {
                    SQLiteDatabase sQLiteDatabaseF0 = f0();
                    c0323t0.f5052A.getClass();
                    int iDelete = sQLiteDatabaseF0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) F.f4395R.a(null)).longValue())});
                    if (iDelete > 0) {
                        X x6 = c0323t0.f5077v;
                        C0323t0.l(x6);
                        x6.f4666E.c(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(ArrayList arrayList) {
        C0323t0 c0323t0 = (C0323t0) this.f4346r;
        o();
        p();
        AbstractC1887A.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (Z()) {
            String strJoin = TextUtils.join(",", arrayList);
            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
            sb.append("(");
            sb.append(strJoin);
            sb.append(")");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(string.length() + 80);
            sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb2.append(string);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (K(sb2.toString(), null) > 0) {
                X x6 = c0323t0.f5077v;
                C0323t0.l(x6);
                x6.f4673z.b("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseF0 = f0();
                StringBuilder sb3 = new StringBuilder(string.length() + 127);
                sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb3.append(string);
                sb3.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseF0.execSQL(sb3.toString());
            } catch (SQLiteException e7) {
                X x7 = c0323t0.f5077v;
                C0323t0.l(x7);
                x7.f4670w.c(e7, "Error incrementing retry count. error");
            }
        }
    }

    @Override // O3.O1
    public final void r() {
    }
}
