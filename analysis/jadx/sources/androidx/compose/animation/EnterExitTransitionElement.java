package androidx.compose.animation;

import B0.AbstractC0036d0;
import c0.AbstractC0724l;
import kotlin.jvm.internal.m;
import t.C1593B;
import t.C1594C;
import t.C1595D;
import t.C1596E;
import t.r;
import t.u;
import u.v0;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v0 f9224q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1595D f9225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1596E f9226s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final B5.a f9227t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u f9228u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public EnterExitTransitionElement(v0 v0Var, C1595D c1595d, C1596E c1596e, B5.a aVar, u uVar) {
        this.f9224q = v0Var;
        this.f9225r = c1595d;
        this.f9226s = c1596e;
        this.f9227t = aVar;
        this.f9228u = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return this.f9224q.equals(enterExitTransitionElement.f9224q) && this.f9225r.equals(enterExitTransitionElement.f9225r) && m.a(this.f9226s, enterExitTransitionElement.f9226s) && m.a(this.f9227t, enterExitTransitionElement.f9227t) && m.a(this.f9228u, enterExitTransitionElement.f9228u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        C1594C c1594c = new C1594C();
        c1594c.f16572E = this.f9224q;
        c1594c.f16573F = this.f9226s;
        c1594c.f16574G = this.f9227t;
        c1594c.f16575H = this.f9228u;
        c1594c.f16576I = r.f16632a;
        W0.b.b(0, 0, 15);
        new C1593B(c1594c, 0);
        new C1593B(c1594c, 1);
        return c1594c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        C1594C c1594c = (C1594C) abstractC0724l;
        c1594c.f16572E = this.f9224q;
        c1594c.f16573F = this.f9226s;
        c1594c.f16574G = this.f9227t;
        c1594c.f16575H = this.f9228u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9228u.hashCode() + ((this.f9227t.hashCode() + ((this.f9226s.f16582a.hashCode() + ((this.f9225r.f16579a.hashCode() + (this.f9224q.hashCode() * 923521)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f9224q + ", sizeAnimation=null, offsetAnimation=null, slideAnimation=null, enter=" + this.f9225r + ", exit=" + this.f9226s + ", isEnabled=" + this.f9227t + ", graphicsLayerBlock=" + this.f9228u + ')';
    }
}
