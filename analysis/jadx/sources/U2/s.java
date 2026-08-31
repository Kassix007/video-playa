package u2;

import B0.InterfaceC0051p;
import B0.InterfaceC0060z;
import B0.N;
import c0.AbstractC0724l;
import c0.C0717e;
import com.google.android.gms.internal.measurement.P1;
import i0.C1133e;
import i1.C1134a;
import l0.C1219b;
import n5.AbstractC1397A;
import o0.AbstractC1412b;
import z0.AbstractC1937N;
import z0.AbstractC1938O;
import z0.InterfaceC1950j;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC0724l implements InterfaceC0051p, InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC1412b f17185E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0717e f17186F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public InterfaceC1950j f17187G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f17188H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(N n7) {
        C1219b c1219b = n7.f296q;
        long jX0 = x0(c1219b.d());
        C0717e c0717e = this.f17186F;
        E2.e eVar = w.f17192b;
        long jA = P1.a(D5.a.G(C1133e.d(jX0)), D5.a.G(C1133e.b(jX0)));
        long jD = c1219b.d();
        long jA2 = c0717e.a(jA, P1.a(D5.a.G(C1133e.d(jD)), D5.a.G(C1133e.b(jD))), n7.getLayoutDirection());
        float f = (int) (jA2 >> 32);
        float f7 = (int) (jA2 & 4294967295L);
        ((C1134a) c1219b.f14425r.f234r).A(f, f7);
        this.f17185E.g(n7, jX0, this.f17188H, null);
        ((C1134a) c1219b.f14425r.f234r).A(-f, -f7);
        n7.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    @Override // B0.InterfaceC0060z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z0.InterfaceC1927D c(B0.T r10, z0.InterfaceC1925B r11, long r12) {
        /*
            r9 = this;
            boolean r0 = W0.a.f(r12)
            boolean r1 = W0.a.e(r12)
            r6 = 1
            if (r0 == 0) goto Le
            if (r1 == 0) goto Le
            goto L40
        Le:
            boolean r2 = W0.a.d(r12)
            if (r2 == 0) goto L1c
            boolean r2 = W0.a.c(r12)
            if (r2 == 0) goto L1c
            r2 = r6
            goto L1d
        L1c:
            r2 = 0
        L1d:
            o0.b r3 = r9.f17185E
            long r3 = r3.h()
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r5 != 0) goto L43
            if (r2 == 0) goto L40
            int r0 = W0.a.h(r12)
            int r1 = W0.a.g(r12)
            r2 = 0
            r3 = 10
            r4 = r12
            long r0 = W0.a.a(r0, r1, r2, r3, r4)
            goto Lcb
        L40:
            r0 = r12
            goto Lcb
        L43:
            if (r2 == 0) goto L54
            if (r0 != 0) goto L49
            if (r1 == 0) goto L54
        L49:
            int r0 = W0.a.h(r12)
            float r0 = (float) r0
            int r1 = W0.a.g(r12)
        L52:
            float r1 = (float) r1
            goto La0
        L54:
            float r0 = i0.C1133e.d(r3)
            float r1 = i0.C1133e.b(r3)
            boolean r2 = java.lang.Float.isInfinite(r0)
            if (r2 != 0) goto L79
            boolean r2 = java.lang.Float.isNaN(r0)
            if (r2 != 0) goto L79
            E2.e r2 = u2.w.f17192b
            int r2 = W0.a.j(r12)
            float r2 = (float) r2
            int r3 = W0.a.h(r12)
            float r3 = (float) r3
            float r0 = D5.a.p(r0, r2, r3)
            goto L7e
        L79:
            int r0 = W0.a.j(r12)
            float r0 = (float) r0
        L7e:
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L9b
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L9b
            E2.e r2 = u2.w.f17192b
            int r2 = W0.a.i(r12)
            float r2 = (float) r2
            int r3 = W0.a.g(r12)
            float r3 = (float) r3
            float r1 = D5.a.p(r1, r2, r3)
            goto La0
        L9b:
            int r1 = W0.a.i(r12)
            goto L52
        La0:
            long r0 = n5.AbstractC1397A.g(r0, r1)
            long r0 = r9.x0(r0)
            float r2 = i0.C1133e.d(r0)
            float r0 = i0.C1133e.b(r0)
            int r1 = D5.a.G(r2)
            int r1 = W0.b.f(r1, r12)
            int r0 = D5.a.G(r0)
            int r0 = W0.b.e(r0, r12)
            r2 = 0
            r3 = 10
            r4 = r1
            r1 = r0
            r0 = r4
            r4 = r12
            long r0 = W0.a.a(r0, r1, r2, r3, r4)
        Lcb:
            z0.J r0 = r11.a(r0)
            int r1 = r0.f18664q
            int r2 = r0.f18665r
            u2.p r3 = new u2.p
            r3.<init>(r0, r6)
            n5.t r0 = n5.t.f15300q
            z0.D r0 = r10.f(r1, r2, r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.s.c(B0.T, z0.B, long):z0.D");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long x0(long j) {
        if (C1133e.e(j)) {
            return 0L;
        }
        long jH = this.f17185E.h();
        if (jH == 9205357640488583168L) {
            return j;
        }
        float fD = C1133e.d(jH);
        if (Float.isInfinite(fD) || Float.isNaN(fD)) {
            fD = C1133e.d(j);
        }
        float fB = C1133e.b(jH);
        if (Float.isInfinite(fB) || Float.isNaN(fB)) {
            fB = C1133e.b(j);
        }
        long jG = AbstractC1397A.g(fD, fB);
        long jA = this.f17187G.a(jG, j);
        int i = AbstractC1937N.f18675a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        if (Float.isInfinite(fIntBitsToFloat) || Float.isNaN(fIntBitsToFloat)) {
            return j;
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
        return (Float.isInfinite(fIntBitsToFloat2) || Float.isNaN(fIntBitsToFloat2)) ? j : AbstractC1938O.h(jG, jA);
    }
}
