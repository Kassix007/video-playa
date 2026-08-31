package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class X3 implements W3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T1 f10761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T1 f10762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T1 f10763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T1 f10764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final T1 f10765e;
    public static final T1 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        c4.c cVar = new c4.c(S1.a(), true, true);
        f10761a = cVar.e("measurement.test.boolean_flag", false);
        f10762b = cVar.d("measurement.test.cached_long_flag", -1L);
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = T1.f10705g;
        f10763c = new T1(cVar, "measurement.test.double_flag", dValueOf, 2);
        f10764d = cVar.d("measurement.test.int_flag", -2L);
        f10765e = cVar.d("measurement.test.long_flag", -1L);
        f = cVar.f("measurement.test.string_flag", "---");
    }
}
