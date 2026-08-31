package j0;

import A.Y;
import B0.C0029a;
import B0.InterfaceC0060z;
import B0.T;
import c0.AbstractC0724l;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0724l implements InterfaceC0060z {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f13681E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f13682F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public float f13683G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public float f13684H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public float f13685I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f13686J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public E f13687K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f13688L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f13689M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f13690N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C0029a f13691O;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0060z
    public final InterfaceC1927D c(T t6, InterfaceC1925B interfaceC1925B, long j) {
        AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
        return t6.f(abstractC1933JA.f18664q, abstractC1933JA.f18665r, n5.t.f15300q, new Y(23, abstractC1933JA, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.f13681E);
        sb.append(", scaleY=");
        sb.append(this.f13682F);
        sb.append(", alpha = ");
        sb.append(this.f13683G);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f13684H);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.f13685I);
        sb.append(", transformOrigin=");
        sb.append((Object) H.d(this.f13686J));
        sb.append(", shape=");
        sb.append(this.f13687K);
        sb.append(", clip=");
        sb.append(this.f13688L);
        sb.append(", renderEffect=null, ambientShadowColor=");
        k1.i.r(this.f13689M, sb, ", spotShadowColor=");
        sb.append((Object) o.i(this.f13690N));
        sb.append(", compositingStrategy=CompositingStrategy(value=0))");
        return sb.toString();
    }
}
