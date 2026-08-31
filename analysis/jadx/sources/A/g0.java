package A;

import B0.InterfaceC0060z;
import c0.AbstractC0724l;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public EnumC0026x f103E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public kotlin.jvm.internal.n f104F;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(W0.b.a(this.f103E != EnumC0026x.f153q ? 0 : W0.a.j(j), W0.a.h(j), this.f103E == EnumC0026x.f154r ? W0.a.i(j) : 0, W0.a.g(j)));
        int iQ = D5.a.q(abstractC1933JA.f18664q, W0.a.j(j), W0.a.h(j));
        int iQ2 = D5.a.q(abstractC1933JA.f18665r, W0.a.i(j), W0.a.g(j));
        return t6.f(iQ, iQ2, n5.t.f15300q, new f0(this, iQ, abstractC1933JA, iQ2, t6));
    }
}
