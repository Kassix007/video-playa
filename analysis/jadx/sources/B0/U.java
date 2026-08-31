package B0;

import java.util.LinkedHashMap;
import m5.C1386y;
import r.C1543B;
import z0.C1924A;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends T implements InterfaceC1925B {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final n0 f325B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LinkedHashMap f327D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public InterfaceC1927D f329F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1543B f330G;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f326C = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1924A f328E = new C1924A(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(n0 n0Var) {
        this.f325B = n0Var;
        C1543B c1543b = r.L.f16158a;
        this.f330G = new C1543B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void p0(U u6, InterfaceC1927D interfaceC1927D) {
        C1386y c1386y;
        LinkedHashMap linkedHashMap;
        if (interfaceC1927D != null) {
            u6.W((((long) interfaceC1927D.a()) & 4294967295L) | (((long) interfaceC1927D.b()) << 32));
            c1386y = C1386y.f15098a;
        } else {
            c1386y = null;
        }
        if (c1386y == null) {
            u6.W(0L);
        }
        if (!kotlin.jvm.internal.m.a(u6.f329F, interfaceC1927D) && interfaceC1927D != null && ((((linkedHashMap = u6.f327D) != null && !linkedHashMap.isEmpty()) || !interfaceC1927D.c().isEmpty()) && !kotlin.jvm.internal.m.a(interfaceC1927D.c(), u6.f327D))) {
            Y y6 = u6.f325B.f478B.f269V.f312q;
            kotlin.jvm.internal.m.b(y6);
            y6.f346G.f();
            LinkedHashMap linkedHashMap2 = u6.f327D;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                u6.f327D = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC1927D.c());
        }
        u6.f329F = interfaceC1927D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J
    public final void U(long j, float f, B5.c cVar) {
        r0(j);
        if (this.f321w) {
            return;
        }
        q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f325B.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final T c0() {
        n0 n0Var = this.f325B.f479C;
        if (n0Var != null) {
            return n0Var.z0();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final InterfaceC1953m d0() {
        return this.f328E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final boolean e0() {
        return this.f329F != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J, z0.InterfaceC1925B
    public final Object g() {
        return this.f325B.g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1928E
    public final W0.l getLayoutDirection() {
        return this.f325B.f478B.f262O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final L h0() {
        return this.f325B.f478B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final InterfaceC1927D j0() {
        InterfaceC1927D interfaceC1927D = this.f329F;
        if (interfaceC1927D != null) {
            return interfaceC1927D;
        }
        throw C0.S.i("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f325B.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final T l0() {
        n0 n0Var = this.f325B.f480D;
        if (n0Var != null) {
            return n0Var.z0();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final long m0() {
        return this.f326C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final void o0() {
        U(this.f326C, 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q0() {
        j0().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T, z0.InterfaceC1928E
    public final boolean r() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r0(long j) {
        if (!W0.i.a(this.f326C, j)) {
            this.f326C = j;
            n0 n0Var = this.f325B;
            Y y6 = n0Var.f478B.f269V.f312q;
            if (y6 != null) {
                y6.b0();
            }
            T.n0(n0Var);
        }
        if (this.f322x) {
            return;
        }
        Z(new x0(j0(), this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long s0(U u6, boolean z5) {
        long jC = 0;
        U uZ0 = this;
        while (!uZ0.equals(u6)) {
            if (!uZ0.f320v || !z5) {
                jC = W0.i.c(jC, uZ0.f326C);
            }
            n0 n0Var = uZ0.f325B.f480D;
            kotlin.jvm.internal.m.b(n0Var);
            uZ0 = n0Var.z0();
            kotlin.jvm.internal.m.b(uZ0);
        }
        return jC;
    }
}
