package j0;

import A.Y;
import B0.InterfaceC0060z;
import B0.T;
import c0.AbstractC0724l;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public B5.c f13714E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new Y(22, abstractC1933JA, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f13714E + ')';
    }
}
