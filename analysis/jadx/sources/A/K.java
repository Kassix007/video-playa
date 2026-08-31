package A;

import B0.InterfaceC0060z;
import c0.AbstractC0724l;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f25E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f26F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f27G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f28H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f29I;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(B0.T t6, InterfaceC1925B interfaceC1925B, long j) {
        int iG = t6.G(this.f27G) + t6.G(this.f25E);
        int iG2 = t6.G(this.f28H) + t6.G(this.f26F);
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(W0.b.h(-iG, -iG2, j));
        return t6.f(W0.b.f(abstractC1933JA.f18664q + iG, j), W0.b.e(abstractC1933JA.f18665r + iG2, j), n5.t.f15300q, new J(this, abstractC1933JA, t6, 0));
    }
}
