package M;

import B0.AbstractC0041g;
import B0.InterfaceC0047l;
import B0.InterfaceC0060z;
import c0.AbstractC0724l;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0724l implements InterfaceC0047l, InterfaceC0060z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        float f = ((W0.f) AbstractC0041g.i(this, AbstractC0236y.f3675a)).f8013q;
        float f7 = 0;
        if (f < f7) {
            f = f7;
        }
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        boolean z5 = this.f10099D && !Float.isNaN(f) && Float.compare(f, f7) > 0;
        int iG = Float.isNaN(f) ? 0 : t6.G(f);
        int iMax = z5 ? Math.max(abstractC1933JA.f18664q, iG) : abstractC1933JA.f18664q;
        int iMax2 = z5 ? Math.max(abstractC1933JA.f18665r, iG) : abstractC1933JA.f18665r;
        return t6.f(iMax, iMax2, n5.t.f15300q, new A.E(iMax, abstractC1933JA, iMax2));
    }
}
