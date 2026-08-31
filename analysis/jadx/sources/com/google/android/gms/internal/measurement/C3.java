package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class C3 implements B3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f10613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T1 f10614b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        cVar.e("measurement.collection.event_safelist", true);
        f10613a = cVar.e("measurement.service.store_null_safelist", true);
        f10614b = cVar.e("measurement.service.store_safelist", true);
    }
}
