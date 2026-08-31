package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class F3 implements E3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f10631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T1 f10632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T1 f10633c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        cVar.e("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f10631a = cVar.e("measurement.audience.refresh_event_count_filters_timestamp", false);
        f10632b = cVar.e("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f10633c = cVar.e("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
