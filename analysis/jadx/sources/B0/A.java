package B0;

import z0.AbstractC1933J;
import z0.C1952l;

/* JADX INFO: loaded from: classes.dex */
public final class A extends U {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final /* synthetic */ B f212H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(B b7) {
        super(b7);
        this.f212H = b7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.T
    public final int Y(C1952l c1952l) {
        int iC = AbstractC0041g.c(this, c1952l);
        this.f330G.g(iC, c1952l);
        return iC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1925B
    public final AbstractC1933J a(long j) {
        X(j);
        new W0.a(j);
        B b7 = this.f212H;
        InterfaceC0060z interfaceC0060z = b7.f214a0;
        n0 n0Var = b7.f479C;
        kotlin.jvm.internal.m.b(n0Var);
        U uZ0 = n0Var.z0();
        kotlin.jvm.internal.m.b(uZ0);
        U.p0(this, interfaceC0060z.c(this, uZ0, j));
        return this;
    }
}
