package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0866t3 implements InterfaceC0861s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f11041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T1 f11042b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        cVar.e("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        cVar.e("measurement.set_default_event_parameters_with_backfill.service", true);
        cVar.d("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f11041a = cVar.e("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f11042b = cVar.e("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        cVar.e("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }
}
