package androidx.compose.ui.graphics;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import B0.C0029a;
import B0.n0;
import c0.AbstractC0724l;
import j0.E;
import j0.F;
import j0.H;
import j0.o;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends AbstractC0036d0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f9324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f9325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f9326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final E f9327t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9328u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f9329v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9330w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GraphicsLayerElement(float f, float f7, long j, E e7, boolean z5, long j7, long j8) {
        this.f9324q = f;
        this.f9325r = f7;
        this.f9326s = j;
        this.f9327t = e7;
        this.f9328u = z5;
        this.f9329v = j7;
        this.f9330w = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        graphicsLayerElement.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f9324q, graphicsLayerElement.f9324q) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f9325r, graphicsLayerElement.f9325r) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && H.a(this.f9326s, graphicsLayerElement.f9326s) && m.a(this.f9327t, graphicsLayerElement.f9327t) && this.f9328u == graphicsLayerElement.f9328u && o.c(this.f9329v, graphicsLayerElement.f9329v) && o.c(this.f9330w, graphicsLayerElement.f9330w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final AbstractC0724l f() {
        F f = new F();
        f.f13681E = 1.0f;
        f.f13682F = 1.0f;
        f.f13683G = this.f9324q;
        f.f13684H = this.f9325r;
        f.f13685I = 8.0f;
        f.f13686J = this.f9326s;
        f.f13687K = this.f9327t;
        f.f13688L = this.f9328u;
        f.f13689M = this.f9329v;
        f.f13690N = this.f9330w;
        f.f13691O = new C0029a(29, f);
        return f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.AbstractC0036d0
    public final void g(AbstractC0724l abstractC0724l) {
        F f = (F) abstractC0724l;
        f.f13681E = 1.0f;
        f.f13682F = 1.0f;
        f.f13683G = this.f9324q;
        f.f13684H = this.f9325r;
        f.f13685I = 8.0f;
        f.f13686J = this.f9326s;
        f.f13687K = this.f9327t;
        f.f13688L = this.f9328u;
        f.f13689M = this.f9329v;
        f.f13690N = this.f9330w;
        n0 n0Var = AbstractC0041g.s(f, 2).f479C;
        if (n0Var != null) {
            n0Var.U0(f.f13691O, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iB = i.b(8.0f, i.b(0.0f, i.b(0.0f, i.b(0.0f, i.b(this.f9325r, i.b(0.0f, i.b(0.0f, i.b(this.f9324q, i.b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = H.f13694c;
        int iE = i.e((this.f9327t.hashCode() + i.d(iB, 31, this.f9326s)) * 31, 961, this.f9328u);
        int i7 = o.f13723h;
        return Integer.hashCode(0) + i.d(i.d(iE, 31, this.f9329v), 31, this.f9330w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f9324q);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f9325r);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) H.d(this.f9326s));
        sb.append(", shape=");
        sb.append(this.f9327t);
        sb.append(", clip=");
        sb.append(this.f9328u);
        sb.append(", renderEffect=null, ambientShadowColor=");
        i.r(this.f9329v, sb, ", spotShadowColor=");
        sb.append((Object) o.i(this.f9330w));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
