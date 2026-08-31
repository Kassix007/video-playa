package z0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v extends B0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f18721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B5.e f18722b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(y yVar, B5.e eVar) {
        this.f18721a = yVar;
        this.f18722b = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(B0.T t6, List list, long j) {
        y yVar = this.f18721a;
        C1960t c1960t = yVar.f18737x;
        c1960t.f18712q = t6.getLayoutDirection();
        c1960t.f18713r = t6.b();
        c1960t.f18714s = t6.l();
        boolean zR = t6.r();
        B5.e eVar = this.f18722b;
        if (zR || yVar.f18730q.f286x == null) {
            yVar.f18733t = 0;
            InterfaceC1927D interfaceC1927D = (InterfaceC1927D) eVar.invoke(c1960t, new W0.a(j));
            return new C1961u(interfaceC1927D, yVar, yVar.f18733t, interfaceC1927D, 1);
        }
        yVar.f18734u = 0;
        InterfaceC1927D interfaceC1927D2 = (InterfaceC1927D) eVar.invoke(yVar.f18738y, new W0.a(j));
        return new C1961u(interfaceC1927D2, yVar, yVar.f18734u, interfaceC1927D2, 0);
    }
}
