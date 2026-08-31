package androidx.compose.foundation;

import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import v.C1717l;
import v.e0;
import w.A0;
import w.EnumC1778d0;
import w.I;
import w.InterfaceC1775c;
import y.i;

/* JADX INFO: loaded from: classes.dex */
final class ScrollingContainerElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A0 f9244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC1778d0 f9245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I f9247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i f9248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC1775c f9249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1717l f9250w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScrollingContainerElement(C1717l c1717l, InterfaceC1775c interfaceC1775c, I i, EnumC1778d0 enumC1778d0, A0 a02, i iVar, boolean z5) {
        this.f9244q = a02;
        this.f9245r = enumC1778d0;
        this.f9246s = z5;
        this.f9247t = i;
        this.f9248u = iVar;
        this.f9249v = interfaceC1775c;
        this.f9250w = c1717l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScrollingContainerElement.class != obj.getClass()) {
            return false;
        }
        ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
        return m.a(this.f9244q, scrollingContainerElement.f9244q) && this.f9245r == scrollingContainerElement.f9245r && this.f9246s == scrollingContainerElement.f9246s && m.a(this.f9247t, scrollingContainerElement.f9247t) && m.a(this.f9248u, scrollingContainerElement.f9248u) && m.a(this.f9249v, scrollingContainerElement.f9249v) && m.a(this.f9250w, scrollingContainerElement.f9250w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        e0 e0Var = new e0();
        e0Var.f17327G = this.f9244q;
        e0Var.f17328H = this.f9245r;
        e0Var.f17329I = this.f9246s;
        e0Var.f17330J = this.f9247t;
        e0Var.f17331K = this.f9248u;
        e0Var.f17332L = this.f9249v;
        e0Var.f17333M = this.f9250w;
        return e0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        i iVar = this.f9248u;
        ((e0) abstractC0724l).C0(this.f9250w, this.f9249v, this.f9247t, this.f9245r, this.f9244q, iVar, this.f9246s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = k1.i.e(k1.i.e((this.f9245r.hashCode() + (this.f9244q.hashCode() * 31)) * 31, 31, this.f9246s), 31, false);
        I i = this.f9247t;
        int iHashCode = (iE + (i != null ? i.hashCode() : 0)) * 31;
        i iVar = this.f9248u;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        InterfaceC1775c interfaceC1775c = this.f9249v;
        int iE2 = k1.i.e((iHashCode2 + (interfaceC1775c != null ? interfaceC1775c.hashCode() : 0)) * 31, 31, false);
        C1717l c1717l = this.f9250w;
        return iE2 + (c1717l != null ? c1717l.hashCode() : 0);
    }
}
