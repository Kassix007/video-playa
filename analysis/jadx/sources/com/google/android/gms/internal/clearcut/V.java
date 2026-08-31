package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V f10444c = new V();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f10445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10446b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public V() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        I i = null;
        for (int i7 = 0; i7 <= 0; i7++) {
            try {
                i = (I) Class.forName(strArr[0]).getConstructor(null).newInstance(null);
            } catch (Throwable unused) {
                i = null;
            }
            if (i != null) {
                break;
            }
        }
        this.f10445a = i == null ? new I() : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Z a(Class cls) {
        Q q7;
        F f;
        C0741c0 c0741c0;
        C0757p c0757p;
        L l7;
        Z zN;
        Class cls2;
        Charset charset = AbstractC0765y.f10579a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f10446b;
        Z z5 = (Z) concurrentHashMap.get(cls);
        if (z5 != null) {
            return z5;
        }
        I i = this.f10445a;
        i.getClass();
        Class cls3 = AbstractC0737a0.f10482a;
        if (!AbstractC0764x.class.isAssignableFrom(cls) && (cls2 = AbstractC0737a0.f10482a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        X xA = i.f10421a.a(cls);
        Y y6 = xA.f10450b;
        AbstractC0748g abstractC0748g = xA.f10449a;
        if ((y6.f10455d & 2) != 2) {
            if (AbstractC0764x.class.isAssignableFrom(cls)) {
                if ((xA.f10450b.f10455d & 1) == 1) {
                    q7 = S.f10443b;
                    f = F.f10417b;
                    c0741c0 = AbstractC0737a0.f10485d;
                    c0757p = AbstractC0758q.f10540a;
                } else {
                    q7 = S.f10443b;
                    f = F.f10417b;
                    c0741c0 = AbstractC0737a0.f10485d;
                    c0757p = null;
                }
                l7 = M.f10426b;
            } else {
                if ((xA.f10450b.f10455d & 1) == 1) {
                    q7 = S.f10442a;
                    f = F.f10416a;
                    c0741c0 = AbstractC0737a0.f10483b;
                    c0757p = AbstractC0758q.f10541b;
                    if (c0757p == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                } else {
                    q7 = S.f10442a;
                    f = F.f10416a;
                    c0741c0 = AbstractC0737a0.f10484c;
                    c0757p = null;
                }
                l7 = M.f10425a;
            }
            zN = O.n(xA, q7, f, c0741c0, c0757p, l7);
        } else if (AbstractC0764x.class.isAssignableFrom(cls)) {
            zN = new P(AbstractC0737a0.f10485d, AbstractC0758q.f10540a, abstractC0748g);
        } else {
            C0741c0 c0741c02 = AbstractC0737a0.f10483b;
            C0757p c0757p2 = AbstractC0758q.f10541b;
            if (c0757p2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            zN = new P(c0741c02, c0757p2, abstractC0748g);
        }
        Z z6 = (Z) concurrentHashMap.putIfAbsent(cls, zN);
        return z6 != null ? z6 : zN;
    }
}
