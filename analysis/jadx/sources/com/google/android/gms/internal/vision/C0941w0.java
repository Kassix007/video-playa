package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0941w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0908f0 f11326b = new C0908f0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11327a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0941w0() {
        B0 b02;
        try {
            b02 = (B0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            b02 = f11326b;
        }
        B0[] b0Arr = {C0908f0.f11267b, b02};
        C0943x0 c0943x0 = new C0943x0();
        c0943x0.f11328a = b0Arr;
        Charset charset = AbstractC0914i0.f11272a;
        this.f11327a = c0943x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(int i, P p7) {
        Q q7 = (Q) this.f11327a;
        q7.D(i, 2);
        q7.H(p7.g());
        q7.L(p7.f11221r, p7.k(), p7.g());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b(int i, Object obj, L0 l02) {
        Q q7 = (Q) this.f11327a;
        K k7 = (K) obj;
        q7.D(i, 2);
        int iC = k7.c();
        if (iC == -1) {
            iC = l02.h(k7);
            k7.b(iC);
        }
        q7.H(iC);
        l02.b(k7, q7.f11224b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c(int i, Object obj, L0 l02) {
        Q q7 = (Q) this.f11327a;
        q7.D(i, 3);
        l02.b((K) obj, q7.f11224b);
        q7.D(i, 4);
    }

    public C0941w0(Q q7) {
        Charset charset = AbstractC0914i0.f11272a;
        this.f11327a = q7;
        q7.f11224b = this;
    }
}
