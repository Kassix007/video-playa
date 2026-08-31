package O3;

import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.wnapp.smspariaz.R;
import java.io.File;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public abstract class K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f4502a = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", FirebaseAnalytics.Event.AD_IMPRESSION, FirebaseAnalytics.Event.SCREEN_VIEW, "ga_extra_parameter", "app_background", "firebase_campaign"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4503b = {FirebaseAnalytics.Event.AD_IMPRESSION};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f4504c = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f4505d = {FirebaseAnalytics.Event.PURCHASE, FirebaseAnalytics.Event.REFUND, FirebaseAnalytics.Event.ADD_PAYMENT_INFO, FirebaseAnalytics.Event.ADD_SHIPPING_INFO, FirebaseAnalytics.Event.ADD_TO_CART, FirebaseAnalytics.Event.ADD_TO_WISHLIST, FirebaseAnalytics.Event.BEGIN_CHECKOUT, FirebaseAnalytics.Event.REMOVE_FROM_CART, FirebaseAnalytics.Event.SELECT_ITEM, FirebaseAnalytics.Event.SELECT_PROMOTION, FirebaseAnalytics.Event.VIEW_CART, FirebaseAnalytics.Event.VIEW_ITEM, FirebaseAnalytics.Event.VIEW_ITEM_LIST, FirebaseAnalytics.Event.VIEW_PROMOTION, "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", FirebaseAnalytics.Event.SELECT_CONTENT, FirebaseAnalytics.Event.VIEW_SEARCH_RESULTS};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f4506e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f4507g = {FirebaseAnalytics.Param.ITEMS};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f4508h = {FirebaseAnalytics.Param.AFFILIATION, FirebaseAnalytics.Param.COUPON, FirebaseAnalytics.Param.CREATIVE_NAME, FirebaseAnalytics.Param.CREATIVE_SLOT, FirebaseAnalytics.Param.CURRENCY, "_ct", FirebaseAnalytics.Param.DISCOUNT, FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.ITEM_ID, FirebaseAnalytics.Param.ITEM_BRAND, FirebaseAnalytics.Param.ITEM_CATEGORY, FirebaseAnalytics.Param.ITEM_CATEGORY2, FirebaseAnalytics.Param.ITEM_CATEGORY3, FirebaseAnalytics.Param.ITEM_CATEGORY4, FirebaseAnalytics.Param.ITEM_CATEGORY5, FirebaseAnalytics.Param.ITEM_LIST_NAME, FirebaseAnalytics.Param.ITEM_LIST_ID, FirebaseAnalytics.Param.ITEM_NAME, FirebaseAnalytics.Param.ITEM_VARIANT, FirebaseAnalytics.Param.LOCATION_ID, FirebaseAnalytics.Param.PAYMENT_TYPE, FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.PROMOTION_ID, FirebaseAnalytics.Param.PROMOTION_NAME, FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.SHIPPING, FirebaseAnalytics.Param.SHIPPING_TIER, FirebaseAnalytics.Param.TAX, FirebaseAnalytics.Param.TRANSACTION_ID, FirebaseAnalytics.Param.VALUE, "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static final String[] i = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] j = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static s4.e f4509k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Context context, String str) {
        AbstractC1887A.g(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = a(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(O3.X r10, android.database.sqlite.SQLiteDatabase r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String[] r15) throws java.lang.Throwable {
        /*
            if (r10 == 0) goto Lf9
            r1 = 0
            java.lang.String r3 = "SQLITE_MASTER"
            java.lang.String r0 = "name"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L31
            java.lang.String r5 = "name=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L31
            r8 = 0
            r9 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2e
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L28
            r11.close()
            if (r0 != 0) goto L44
            goto L41
        L23:
            r0 = move-exception
            r10 = r0
            r1 = r11
            goto Lf3
        L28:
            r0 = move-exception
            goto L35
        L2a:
            r0 = move-exception
            r10 = r0
            goto Lf3
        L2e:
            r0 = move-exception
        L2f:
            r11 = r0
            goto L34
        L31:
            r0 = move-exception
            r2 = r11
            goto L2f
        L34:
            r11 = r1
        L35:
            O3.V r3 = r10.f4673z     // Catch: java.lang.Throwable -> L23
            java.lang.String r4 = "Error querying for table"
            r3.d(r12, r0, r4)     // Catch: java.lang.Throwable -> L23
            if (r11 == 0) goto L41
            r11.close()
        L41:
            r2.execSQL(r13)
        L44:
            java.lang.String r11 = "Table "
            java.lang.String r13 = " is missing required column: "
            java.lang.String r0 = "SELECT * FROM "
            java.lang.String r3 = " LIMIT 0"
            java.util.HashSet r4 = new java.util.HashSet     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r5 = r12.length()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r5 = r5 + 22
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r6.<init>(r5)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r6.append(r0)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r6.append(r12)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r6.append(r3)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r0 = r6.toString()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            android.database.Cursor r1 = r2.rawQuery(r0, r1)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r0 = r1.getColumnNames()     // Catch: java.lang.Throwable -> Le5
            java.util.Collections.addAll(r4, r0)     // Catch: java.lang.Throwable -> Le5
            r1.close()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r0 = ","
            java.lang.String[] r14 = r14.split(r0)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r0 = r14.length     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r1 = 0
            r3 = r1
        L80:
            if (r3 >= r0) goto Lba
            r5 = r14[r3]     // Catch: android.database.sqlite.SQLiteException -> Lb7
            boolean r6 = r4.remove(r5)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            if (r6 == 0) goto L8d
            int r3 = r3 + 1
            goto L80
        L8d:
            android.database.sqlite.SQLiteException r14 = new android.database.sqlite.SQLiteException     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r15 = r12.length()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r15 = r15 + 35
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r0 = r0.length()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            int r15 = r15 + r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r0.<init>(r15)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r0.append(r11)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r0.append(r12)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r0.append(r13)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r0.append(r5)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r11 = r0.toString()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r14.<init>(r11)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            throw r14     // Catch: android.database.sqlite.SQLiteException -> Lb7
        Lb7:
            r0 = move-exception
            r11 = r0
            goto Leb
        Lba:
            if (r15 == 0) goto Ld1
        Lbc:
            int r11 = r15.length     // Catch: android.database.sqlite.SQLiteException -> Lb7
            if (r1 >= r11) goto Ld1
            r11 = r15[r1]     // Catch: android.database.sqlite.SQLiteException -> Lb7
            boolean r11 = r4.remove(r11)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            if (r11 != 0) goto Lce
            int r11 = r1 + 1
            r11 = r15[r11]     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r2.execSQL(r11)     // Catch: android.database.sqlite.SQLiteException -> Lb7
        Lce:
            int r1 = r1 + 2
            goto Lbc
        Ld1:
            boolean r11 = r4.isEmpty()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            if (r11 != 0) goto Le4
            O3.V r11 = r10.f4673z     // Catch: android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r13 = "Table has extra columns. table, columns"
            java.lang.String r14 = ", "
            java.lang.String r14 = android.text.TextUtils.join(r14, r4)     // Catch: android.database.sqlite.SQLiteException -> Lb7
            r11.d(r12, r14, r13)     // Catch: android.database.sqlite.SQLiteException -> Lb7
        Le4:
            return
        Le5:
            r0 = move-exception
            r11 = r0
            r1.close()     // Catch: android.database.sqlite.SQLiteException -> Lb7
            throw r11     // Catch: android.database.sqlite.SQLiteException -> Lb7
        Leb:
            O3.V r10 = r10.f4670w
            java.lang.String r13 = "Failed to verify columns on table that was just created"
            r10.c(r12, r13)
            throw r11
        Lf3:
            if (r1 == 0) goto Lf8
            r1.close()
        Lf8:
            throw r10
        Lf9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Monitor must not be null"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.K0.c(O3.X, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(FirebaseAnalytics.Param.VALUE, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(FirebaseAnalytics.Param.VALUE, ((Long) obj).longValue());
        } else {
            bundle.putString(FirebaseAnalytics.Param.VALUE, obj.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object e(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(k1.i.k(C0.S.r("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(X x6, SQLiteDatabase sQLiteDatabase) {
        if (x6 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        V v6 = x6.f4673z;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            v6.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            v6.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            v6.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        v6.b("Failed to turn on database write permission for owner");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i7 = 0; i7 < iMin; i7++) {
            String str2 = strArr[i7];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i7];
            }
        }
        return null;
    }
}
