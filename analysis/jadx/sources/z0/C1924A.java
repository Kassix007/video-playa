package z0;

import B0.n0;
import com.google.android.gms.internal.measurement.K1;
import i0.C1130b;
import i0.C1131c;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: z0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1924A implements InterfaceC1953m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B0.U f18658q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1924A(B0.U u6) {
        this.f18658q = u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final boolean C() {
        return this.f18658q.f325B.B0().f10099D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final long E() {
        B0.U u6 = this.f18658q;
        return (((long) u6.f18664q) << 32) | (((long) u6.f18665r) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final long F(long j) {
        B0.U u6 = this.f18658q;
        n0 n0Var = u6.f325B;
        B0.U uG = AbstractC1938O.g(u6);
        return n0Var.F(C1130b.e(0L, C1130b.d(a(uG.f328E, 0L), u6.f325B.K0(uG.f325B, 0L))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final C1131c I(InterfaceC1953m interfaceC1953m, boolean z5) {
        return this.f18658q.f325B.I(interfaceC1953m, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(InterfaceC1953m interfaceC1953m, long j) {
        boolean z5 = interfaceC1953m instanceof C1924A;
        B0.U u6 = this.f18658q;
        if (!z5) {
            B0.U uG = AbstractC1938O.g(u6);
            n0 n0Var = uG.f325B;
            long jA = a(uG.f328E, j);
            long j7 = uG.f326C;
            long jD = C1130b.d(jA, (4294967295L & ((long) Float.floatToRawIntBits((int) (j7 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32));
            if (!n0Var.B0().f10099D) {
                AbstractC1904a.b("LayoutCoordinate operations are only valid when isAttached is true");
            }
            n0Var.M0();
            n0 n0Var2 = n0Var.f480D;
            if (n0Var2 != null) {
                n0Var = n0Var2;
            }
            return C1130b.e(jD, n0Var.K0(interfaceC1953m, 0L));
        }
        B0.U u7 = ((C1924A) interfaceC1953m).f18658q;
        n0 n0Var3 = u7.f325B;
        n0Var3.M0();
        B0.U uZ0 = u6.f325B.w0(n0Var3).z0();
        if (uZ0 != null) {
            long jB = W0.i.b(W0.i.c(u7.s0(uZ0, false), K1.K(j)), u6.s0(uZ0, false));
            return (((long) Float.floatToRawIntBits((int) (jB >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jB & 4294967295L))) & 4294967295L);
        }
        B0.U uG2 = AbstractC1938O.g(u7);
        long jC = W0.i.c(W0.i.c(u7.s0(uG2, false), uG2.f326C), K1.K(j));
        B0.U uG3 = AbstractC1938O.g(u6);
        long jB2 = W0.i.b(jC, W0.i.c(u6.s0(uG3, false), uG3.f326C));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jB2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jB2 & 4294967295L))) & 4294967295L;
        n0 n0Var4 = uG3.f325B.f480D;
        kotlin.jvm.internal.m.b(n0Var4);
        n0 n0Var5 = uG2.f325B.f480D;
        kotlin.jvm.internal.m.b(n0Var5);
        return n0Var4.K0(n0Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final long e(long j) {
        B0.U u6 = this.f18658q;
        n0 n0Var = u6.f325B;
        B0.U uG = AbstractC1938O.g(u6);
        return n0Var.e(C1130b.e(j, C1130b.d(a(uG.f328E, 0L), u6.f325B.K0(uG.f325B, 0L))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1953m
    public final InterfaceC1953m h() {
        B0.U uZ0;
        if (!C()) {
            AbstractC1904a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        n0 n0Var = this.f18658q.f325B.f478B.f268U.f431c.f480D;
        if (n0Var == null || (uZ0 = n0Var.z0()) == null) {
            return null;
        }
        return uZ0.f328E;
    }
}
