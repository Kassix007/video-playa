package B0;

import android.graphics.Paint;
import c0.AbstractC0724l;
import j0.AbstractC1145B;
import m0.C1348c;
import r.C1543B;
import z0.AbstractC1933J;
import z0.C1952l;

/* JADX INFO: loaded from: classes.dex */
public final class B extends n0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final W1.d f213c0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC0060z f214a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public A f215b0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        W1.d dVarF = AbstractC1145B.f();
        dVarF.e(j0.o.f13721e);
        ((Paint) dVarF.f8044b).setStrokeWidth(1.0f);
        dVarF.j(1);
        f213c0 = dVarF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B0.z */
    /* JADX WARN: Multi-variable type inference failed */
    public B(L l7, InterfaceC0060z interfaceC0060z) {
        super(l7);
        this.f214a0 = interfaceC0060z;
        this.f215b0 = l7.f286x != null ? new A(this) : null;
        if ((((AbstractC0724l) interfaceC0060z).f10100q.f10102s & 512) != 0) {
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final AbstractC0724l B0() {
        return ((AbstractC0724l) this.f214a0).f10100q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final void Q0(j0.m mVar, C1348c c1348c) {
        n0 n0Var = this.f479C;
        kotlin.jvm.internal.m.b(n0Var);
        n0Var.t0(mVar, c1348c);
        if (((C0.A) O.a(this.f478B)).getShowLayoutBounds()) {
            long j = this.f18666s;
            mVar.j(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f213c0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1933J
    public final void U(long j, float f, B5.c cVar) {
        R0(j, f, cVar);
        if (this.f321w) {
            return;
        }
        O0();
        j0().d();
        kotlin.jvm.internal.m.b(this.f479C);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: B0.z */
    /* JADX WARN: Multi-variable type inference failed */
    public final void X0(InterfaceC0060z interfaceC0060z) {
        if (!interfaceC0060z.equals(this.f214a0) && (((AbstractC0724l) interfaceC0060z).f10100q.f10102s & 512) != 0) {
            throw new ClassCastException();
        }
        this.f214a0 = interfaceC0060z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final int Y(C1952l c1952l) {
        A a7 = this.f215b0;
        if (a7 == null) {
            return AbstractC0041g.c(this, c1952l);
        }
        C1543B c1543b = a7.f330G;
        int iD = c1543b.d(c1952l);
        if (iD >= 0) {
            return c1543b.f16111c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1925B
    public final AbstractC1933J a(long j) {
        X(j);
        InterfaceC0060z interfaceC0060z = this.f214a0;
        n0 n0Var = this.f479C;
        kotlin.jvm.internal.m.b(n0Var);
        T0(interfaceC0060z.c(this, n0Var, j));
        N0();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final void v0() {
        if (this.f215b0 == null) {
            this.f215b0 = new A(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.n0
    public final U z0() {
        return this.f215b0;
    }
}
