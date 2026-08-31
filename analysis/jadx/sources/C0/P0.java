package C0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import j0.C1147b;
import j0.InterfaceC1144A;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements InterfaceC0107v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f912a = A3.a.e();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void A(int i) {
        this.f912a.setAmbientShadowColor(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void B(float f) {
        this.f912a.setPivotY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void C(float f) {
        this.f912a.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int D() {
        return this.f912a.getRight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean E() {
        return this.f912a.getClipToOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void F(int i) {
        this.f912a.offsetTopAndBottom(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void G(boolean z5) {
        this.f912a.setClipToOutline(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void H(Outline outline) {
        this.f912a.setOutline(outline);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void I(int i) {
        this.f912a.setSpotShadowColor(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean J() {
        return this.f912a.setHasOverlappingRendering(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void K(Matrix matrix) {
        this.f912a.getMatrix(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final float L() {
        return this.f912a.getElevation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int a() {
        return this.f912a.getHeight();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int b() {
        return this.f912a.getWidth();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final float c() {
        return this.f912a.getAlpha();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void d() {
        this.f912a.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void e(float f) {
        this.f912a.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void f() {
        this.f912a.setTranslationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void g() {
        this.f912a.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void h(float f) {
        this.f912a.setScaleX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void i() {
        this.f912a.discardDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void j() {
        this.f912a.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void k() {
        this.f912a.setRotationZ(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void l(float f) {
        this.f912a.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void m(float f) {
        this.f912a.setCameraDistance(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean n() {
        return this.f912a.hasDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void o(int i) {
        this.f912a.offsetLeftAndRight(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int p() {
        return this.f912a.getBottom();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean q() {
        return this.f912a.getClipToBounds();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void r() {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f912a.setRenderEffect(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void s(Canvas canvas) {
        canvas.drawRenderNode(this.f912a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int t() {
        return this.f912a.getTop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int u() {
        return this.f912a.getLeft();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void v(float f) {
        this.f912a.setPivotX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void w(boolean z5) {
        this.f912a.setClipToBounds(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean x(int i, int i7, int i8, int i9) {
        return this.f912a.setPosition(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void y(j0.n nVar, InterfaceC1144A interfaceC1144A, Q0 q02) {
        RecordingCanvas recordingCanvasBeginRecording = this.f912a.beginRecording();
        C1147b c1147b = nVar.f13717a;
        Canvas canvas = c1147b.f13696a;
        c1147b.f13696a = recordingCanvasBeginRecording;
        if (interfaceC1144A != null) {
            c1147b.k();
            c1147b.a(interfaceC1144A);
        }
        q02.invoke(c1147b);
        if (interfaceC1144A != null) {
            c1147b.i();
        }
        nVar.f13717a.f13696a = canvas;
        this.f912a.endRecording();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void z() {
        RenderNode renderNode = this.f912a;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }
}
