package g0;

import A.C0028z;
import B0.InterfaceC0051p;
import B0.InterfaceC0060z;
import B0.N;
import B0.T;
import c0.AbstractC0724l;
import c0.C0717e;
import i0.C1133e;
import i1.C1134a;
import j0.j;
import l0.C1219b;
import n5.t;
import o0.AbstractC1412b;
import z0.AbstractC1933J;
import z0.AbstractC1938O;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0724l implements InterfaceC0060z, InterfaceC0051p {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC1412b f12818E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12819F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public C0717e f12820G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC1950j f12821H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f12822I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public j f12823J;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean x0(long j) {
        return !C1133e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean y0(long j) {
        return !C1133e.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(N n7) {
        C1219b c1219b = n7.f296q;
        long jH = this.f12818E.h();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(y0(jH) ? Float.intBitsToFloat((int) (jH >> 32)) : Float.intBitsToFloat((int) (c1219b.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(x0(jH) ? Float.intBitsToFloat((int) (jH & 4294967295L)) : Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)))) & 4294967295L);
        long jH2 = (Float.intBitsToFloat((int) (c1219b.d() >> 32)) == 0.0f || Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)) == 0.0f) ? 0L : AbstractC1938O.h(jFloatToRawIntBits, this.f12821H.a(jFloatToRawIntBits, c1219b.d()));
        long jA = this.f12820G.a((((long) Math.round(Float.intBitsToFloat((int) (jH2 >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jH2 & 4294967295L)))) & 4294967295L), (((long) Math.round(Float.intBitsToFloat((int) (c1219b.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)))) & 4294967295L), n7.getLayoutDirection());
        float f = (int) (jA >> 32);
        float f7 = (int) (jA & 4294967295L);
        ((C1134a) c1219b.f14425r.f234r).A(f, f7);
        try {
            this.f12818E.g(n7, jH2, this.f12822I, this.f12823J);
            ((C1134a) c1219b.f14425r.f234r).A(-f, -f7);
            n7.a();
        } catch (Throwable th) {
            ((C1134a) c1219b.f14425r.f234r).A(-f, -f7);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        long jA;
        boolean z5 = false;
        boolean z6 = W0.a.d(j) && W0.a.c(j);
        if (W0.a.f(j) && W0.a.e(j)) {
            z5 = true;
        }
        if (((!this.f12819F || this.f12818E.h() == 9205357640488583168L) && z6) || z5) {
            jA = W0.a.a(W0.a.h(j), W0.a.g(j), 0, 10, j);
        } else {
            long jH = this.f12818E.h();
            int iRound = y0(jH) ? Math.round(Float.intBitsToFloat((int) (jH >> 32))) : W0.a.j(j);
            int iRound2 = x0(jH) ? Math.round(Float.intBitsToFloat((int) (jH & 4294967295L))) : W0.a.i(j);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(W0.b.f(iRound, j))) << 32) | (((long) Float.floatToRawIntBits(W0.b.e(iRound2, j))) & 4294967295L);
            if (this.f12819F && this.f12818E.h() != 9205357640488583168L) {
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(!y0(this.f12818E.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) : Float.intBitsToFloat((int) (this.f12818E.h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(!x0(this.f12818E.h()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.f12818E.h() & 4294967295L)))) & 4294967295L);
                jFloatToRawIntBits = (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == 0.0f) ? 0L : AbstractC1938O.h(jFloatToRawIntBits2, this.f12821H.a(jFloatToRawIntBits2, jFloatToRawIntBits));
            }
            jA = W0.a.a(W0.b.f(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32))), j), W0.b.e(Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))), j), 0, 10, j);
        }
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(jA);
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, t.f15300q, new C0028z(abstractC1933JA, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterModifier(painter=" + this.f12818E + ", sizeToIntrinsics=" + this.f12819F + ", alignment=" + this.f12820G + ", alpha=" + this.f12822I + ", colorFilter=" + this.f12823J + ')';
    }
}
