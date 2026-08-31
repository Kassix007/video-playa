package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class M2 implements S2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y1 f10672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0841o2 f10673b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public M2(C0841o2 c0841o2, Y1 y12) {
        C0841o2 c0841o22 = AbstractC0816j2.f10879a;
        this.f10673b = c0841o2;
        this.f10672a = y12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final void a(Object obj) {
        this.f10673b.getClass();
        Y2 y22 = ((AbstractC0851q2) obj).zzc;
        if (y22.f10776e) {
            y22.f10776e = false;
        }
        C0841o2 c0841o2 = AbstractC0816j2.f10879a;
        throw k1.i.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final boolean b(AbstractC0851q2 abstractC0851q2, AbstractC0851q2 abstractC0851q22) {
        return abstractC0851q2.zzc.equals(abstractC0851q22.zzc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final void c(Object obj, Object obj2) {
        T2.b(obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final void d(Object obj, byte[] bArr, int i, int i7, C0776b2 c0776b2) {
        AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) obj;
        if (abstractC0851q2.zzc == Y2.f) {
            abstractC0851q2.zzc = Y2.a();
        }
        throw k1.i.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final void e(Object obj, F2 f22) {
        throw k1.i.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final int f(AbstractC0851q2 abstractC0851q2) {
        return abstractC0851q2.zzc.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final int g(Y1 y12) {
        Y2 y22 = ((AbstractC0851q2) y12).zzc;
        int i = y22.f10775d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i7 = 0; i7 < y22.f10772a; i7++) {
            int i8 = y22.f10773b[i7] >>> 3;
            C0796f2 c0796f2 = (C0796f2) y22.f10774c[i7];
            int iU0 = C0801g2.u0(8);
            int iU02 = C0801g2.u0(i8) + C0801g2.u0(16);
            int iU03 = C0801g2.u0(24);
            int iH = c0796f2.h();
            iF += iU0 + iU0 + iU02 + C0.S.f(iH, iH, iU03);
        }
        y22.f10775d = iF;
        return iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final boolean h(Object obj) {
        throw k1.i.g(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.S2
    public final AbstractC0851q2 zza() {
        Y1 y12 = this.f10672a;
        return y12 instanceof AbstractC0851q2 ? (AbstractC0851q2) ((AbstractC0851q2) y12).o(4) : ((AbstractC0846p2) ((AbstractC0851q2) y12).o(5)).d();
    }
}
