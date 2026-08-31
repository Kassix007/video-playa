package u2;

import B0.T;
import P5.H;
import P5.S;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1955o;

/* JADX INFO: loaded from: classes.dex */
public final class r implements E2.i, InterfaceC1955o {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S f17184q = H.b(new W0.a(w.f17191a));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1955o
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        W0.a aVar = new W0.a(j);
        S s6 = this.f17184q;
        s6.getClass();
        s6.h(null, aVar);
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new C1695p(abstractC1933JA, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // E2.i
    public final Object f(t2.j jVar) {
        return H.j(new C1692m(this.f17184q, 1), jVar);
    }
}
