package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0772a4 implements Z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f10791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T1 f10792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T1 f10793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T1 f10794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final T1 f10795e;
    public static final T1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final T1 f10796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final T1 f10797h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        cVar.e("measurement.rb.attribution.ad_campaign_info", true);
        cVar.e("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f10791a = cVar.e("measurement.rb.attribution.client2", true);
        f10792b = cVar.e("measurement.rb.attribution.followup1.service", false);
        cVar.e("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f10793c = cVar.e("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        cVar.e("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f10794d = cVar.e("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f10795e = cVar.e("measurement.rb.attribution.retry_disposition", false);
        f = cVar.e("measurement.rb.attribution.service", true);
        f10796g = cVar.e("measurement.rb.attribution.enable_trigger_redaction", true);
        f10797h = cVar.e("measurement.rb.attribution.uuid_generation", true);
        cVar.d("measurement.id.rb.attribution.retry_disposition", 0L);
        cVar.e("measurement.rb.attribution.improved_retry", true);
    }
}
