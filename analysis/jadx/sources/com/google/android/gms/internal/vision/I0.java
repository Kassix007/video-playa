package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final I0 f11178c = new I0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11180b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0941w0 f11179a = new C0941w0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final L0 a(Class cls) {
        L0 l0L;
        Class cls2;
        Charset charset = AbstractC0914i0.f11272a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f11180b;
        L0 l02 = (L0) concurrentHashMap.get(cls);
        if (l02 != null) {
            return l02;
        }
        C0941w0 c0941w0 = this.f11179a;
        c0941w0.getClass();
        Class cls3 = M0.f11207a;
        if (!AbstractC0906e0.class.isAssignableFrom(cls) && (cls2 = M0.f11207a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        J0 j0A = ((C0943x0) c0941w0.f11327a).a(cls);
        int i = j0A.f11200d;
        K k7 = j0A.f11197a;
        if ((i & 2) == 2) {
            if (AbstractC0906e0.class.isAssignableFrom(cls)) {
                l0L = new D0(M0.f11210d, W.f11241a, k7);
            } else {
                N0 n02 = M0.f11208b;
                V v6 = W.f11242b;
                if (v6 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                l0L = new D0(n02, v6, k7);
            }
        } else if (AbstractC0906e0.class.isAssignableFrom(cls)) {
            l0L = (j0A.f11200d & 1) == 1 ? C0.l(j0A, E0.f11150b, AbstractC0931r0.f11318b, M0.f11210d, W.f11241a, A0.f11133b) : C0.l(j0A, E0.f11150b, AbstractC0931r0.f11318b, M0.f11210d, null, A0.f11133b);
        } else if ((j0A.f11200d & 1) == 1) {
            F0 f02 = E0.f11149a;
            C0935t0 c0935t0 = AbstractC0931r0.f11317a;
            N0 n03 = M0.f11208b;
            V v7 = W.f11242b;
            if (v7 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            l0L = C0.l(j0A, f02, c0935t0, n03, v7, A0.f11132a);
        } else {
            l0L = C0.l(j0A, E0.f11149a, AbstractC0931r0.f11317a, M0.f11209c, null, A0.f11132a);
        }
        L0 l03 = (L0) concurrentHashMap.putIfAbsent(cls, l0L);
        return l03 != null ? l03 : l0L;
    }
}
