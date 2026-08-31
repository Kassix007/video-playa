package androidx.compose.ui.input.nestedscroll;

import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import u0.InterfaceC1672a;
import u0.d;
import u0.g;

/* JADX INFO: loaded from: classes.dex */
final class NestedScrollElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1672a f9332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f9333r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NestedScrollElement(InterfaceC1672a interfaceC1672a, d dVar) {
        this.f9332q = interfaceC1672a;
        this.f9333r = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return m.a(nestedScrollElement.f9332q, this.f9332q) && m.a(nestedScrollElement.f9333r, this.f9333r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        return new g(this.f9332q, this.f9333r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        g gVar = (g) abstractC0724l;
        gVar.f17110E = this.f9332q;
        d dVar = gVar.f17111F;
        if (dVar.f17095a == gVar) {
            dVar.f17095a = null;
        }
        d dVar2 = this.f9333r;
        if (dVar2 == null) {
            gVar.f17111F = new d();
        } else if (!dVar2.equals(dVar)) {
            gVar.f17111F = dVar2;
        }
        if (gVar.f10099D) {
            d dVar3 = gVar.f17111F;
            dVar3.f17095a = gVar;
            dVar3.f17096b = null;
            gVar.f17112G = null;
            dVar3.f17097c = new A0.d(28, gVar);
            dVar3.f17098d = gVar.l0();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f9332q.hashCode() * 31;
        d dVar = this.f9333r;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
