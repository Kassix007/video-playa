package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.clearcut.C0751j;

/* JADX INFO: loaded from: classes.dex */
public final class D0 implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f11146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N0 f11147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V f11148c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D0(N0 n02, V v6, K k7) {
        this.f11147b = n02;
        v6.getClass();
        this.f11148c = v6;
        this.f11146a = k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final void a(Object obj) {
        this.f11147b.getClass();
        ((AbstractC0906e0) obj).zzb.f11217e = false;
        this.f11148c.getClass();
        C0.S.t(obj);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final void b(Object obj, C0941w0 c0941w0) {
        this.f11148c.getClass();
        C0.S.t(obj);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final boolean c(Object obj) {
        this.f11148c.getClass();
        C0.S.t(obj);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final void d(AbstractC0906e0 abstractC0906e0, AbstractC0906e0 abstractC0906e02) {
        M0.h(this.f11147b, abstractC0906e0, abstractC0906e02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final void e(Object obj, byte[] bArr, int i, int i7, C0751j c0751j) {
        AbstractC0906e0 abstractC0906e0 = (AbstractC0906e0) obj;
        if (abstractC0906e0.zzb == O0.f) {
            abstractC0906e0.zzb = O0.b();
        }
        throw k1.i.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final int f(AbstractC0906e0 abstractC0906e0) {
        this.f11147b.getClass();
        return abstractC0906e0.zzb.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final boolean g(AbstractC0906e0 abstractC0906e0, AbstractC0906e0 abstractC0906e02) {
        this.f11147b.getClass();
        return abstractC0906e0.zzb.equals(abstractC0906e02.zzb);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final int h(Object obj) {
        this.f11147b.getClass();
        O0 o02 = ((AbstractC0906e0) obj).zzb;
        int i = o02.f11216d;
        if (i != -1) {
            return i;
        }
        int iJ = 0;
        for (int i7 = 0; i7 < o02.f11213a; i7++) {
            int i8 = o02.f11214b[i7] >>> 3;
            iJ += Q.J(3, (P) o02.f11215c[i7]) + Q.S(2, i8) + (Q.T(8) << 1);
        }
        o02.f11216d = iJ;
        return iJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.L0
    public final Object zza() {
        return ((AbstractC0902c0) ((AbstractC0906e0) this.f11146a).e(5)).e();
    }
}
