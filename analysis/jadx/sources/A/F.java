package A;

import P.C0345b;
import P.C0354f0;
import c0.InterfaceC0723k;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;
import z0.InterfaceC1955o;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC1955o, A0.c, InterfaceC0723k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W f11q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0354f0 f12r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0354f0 f13s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F(W w3) {
        this.f11q = w3;
        this.f12r = C0345b.q(w3);
        this.f13s = C0345b.q(w3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1955o
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        C0354f0 c0354f0 = this.f12r;
        int iC = ((W) c0354f0.getValue()).c(t6, t6.getLayoutDirection());
        int iD = ((W) c0354f0.getValue()).d(t6);
        int iA = ((W) c0354f0.getValue()).a(t6, t6.getLayoutDirection()) + iC;
        int iB = ((W) c0354f0.getValue()).b(t6) + iD;
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(W0.b.h(-iA, -iB, j));
        return t6.f(W0.b.f(abstractC1933JA.f18664q + iA, j), W0.b.e(abstractC1933JA.f18665r + iB, j), n5.t.f15300q, new E(abstractC1933JA, iC, iD));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A0.c
    public final void e(A0.g gVar) {
        W w3 = (W) gVar.e(c0.f89a);
        W w6 = this.f11q;
        this.f12r.setValue(new C0027y(w6, w3));
        this.f13s.setValue(new U(w3, w6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return kotlin.jvm.internal.m.a(((F) obj).f11q, this.f11q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f11q.hashCode();
    }
}
