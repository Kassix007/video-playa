package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class P2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P2 f10684c = new P2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10686b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F2 f10685a = new F2(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final S2 a(Class cls) {
        S2 s2T;
        Charset charset = AbstractC0885x2.f11122a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f10686b;
        S2 s22 = (S2) concurrentHashMap.get(cls);
        if (s22 != null) {
            return s22;
        }
        F2 f22 = this.f10685a;
        f22.getClass();
        C0841o2 c0841o2 = T2.f10712a;
        AbstractC0851q2.class.isAssignableFrom(cls);
        R2 r2B = ((F2) f22.f10630q).b(cls);
        if ((r2B.f10700d & 2) == 2) {
            C0841o2 c0841o22 = T2.f10712a;
            C0841o2 c0841o23 = AbstractC0816j2.f10879a;
            s2T = new M2(c0841o22, r2B.f10697a);
        } else {
            int i = N2.f10677a;
            int i7 = C2.f10612a;
            C0841o2 c0841o24 = T2.f10712a;
            C0841o2 c0841o25 = r2B.a() + (-1) != 1 ? AbstractC0816j2.f10879a : null;
            int i8 = I2.f10647a;
            s2T = L2.t(r2B, c0841o24, c0841o25);
        }
        S2 s23 = (S2) concurrentHashMap.putIfAbsent(cls, s2T);
        return s23 != null ? s23 : s2T;
    }
}
