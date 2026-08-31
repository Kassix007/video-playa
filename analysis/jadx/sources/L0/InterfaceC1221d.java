package l0;

import B0.G0;
import B0.N;
import W0.l;
import j0.AbstractC1145B;
import j0.C1150e;
import j0.InterfaceC1144A;
import j0.j;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: l0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1221d extends W0.c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void B(N n7, AbstractC1145B abstractC1145B, long j, long j7, long j8, AbstractC1220c abstractC1220c, int i) {
        long j9 = (i & 2) != 0 ? 0L : j;
        long jK0 = (i & 4) != 0 ? k0(n7.f296q.d(), j9) : j7;
        AbstractC1220c abstractC1220c2 = (i & 32) != 0 ? C1223f.f14430b : abstractC1220c;
        C1219b c1219b = n7.f296q;
        int i7 = (int) (j9 >> 32);
        int i8 = (int) (j9 & 4294967295L);
        c1219b.f14424q.f14422c.e(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (jK0 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (jK0 & 4294967295L)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), c1219b.c(abstractC1145B, abstractC1220c2, 1.0f, null, 3, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void V(InterfaceC1221d interfaceC1221d, long j, float f, long j7, int i) {
        if ((i & 4) != 0) {
            j7 = interfaceC1221d.M();
        }
        interfaceC1221d.p(f, j, j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void g0(InterfaceC1221d interfaceC1221d, long j, long j7, long j8, float f, int i) {
        long j9 = (i & 2) != 0 ? 0L : j7;
        interfaceC1221d.R(j, j9, (i & 4) != 0 ? k0(interfaceC1221d.d(), j9) : j8, (i & 8) != 0 ? 1.0f : f, C1223f.f14430b, (i & 64) != 0 ? 3 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static /* synthetic */ void j(InterfaceC1221d interfaceC1221d, InterfaceC1144A interfaceC1144A, AbstractC1145B abstractC1145B, float f, C1224g c1224g, int i) {
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        float f7 = f;
        AbstractC1220c abstractC1220c = c1224g;
        if ((i & 8) != 0) {
            abstractC1220c = C1223f.f14430b;
        }
        interfaceC1221d.m(interfaceC1144A, abstractC1145B, f7, abstractC1220c, (i & 32) != 0 ? 3 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static long k0(long j, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static void y(InterfaceC1221d interfaceC1221d, C1150e c1150e, long j, long j7, float f, j jVar, int i, int i7) {
        interfaceC1221d.i(c1150e, 0L, j, (i7 & 16) != 0 ? j : j7, (i7 & 32) != 0 ? 1.0f : f, jVar, (i7 & 512) != 0 ? 1 : i);
    }

    void L(long j, long j7, long j8, float f, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long M() {
        return AbstractC1397A.r(z().E());
    }

    void R(long j, long j7, long j8, float f, AbstractC1220c abstractC1220c, int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long d() {
        return z().E();
    }

    l getLayoutDirection();

    void i(C1150e c1150e, long j, long j7, long j8, float f, j jVar, int i);

    void m(InterfaceC1144A interfaceC1144A, AbstractC1145B abstractC1145B, float f, AbstractC1220c abstractC1220c, int i);

    void p(float f, long j, long j7);

    void v(long j, float f, float f7, long j7, long j8, AbstractC1220c abstractC1220c);

    void w(InterfaceC1144A interfaceC1144A, long j, AbstractC1220c abstractC1220c);

    G0 z();
}
