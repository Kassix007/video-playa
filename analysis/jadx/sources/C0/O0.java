package C0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import j0.C1147b;
import j0.InterfaceC1144A;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements InterfaceC0107v0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f905g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f910e;
    public boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O0(A a7) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", a7);
        this.f906a = renderNodeCreate;
        if (f905g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                T0.c(renderNodeCreate, T0.a(renderNodeCreate));
                T0.d(renderNodeCreate, T0.b(renderNodeCreate));
            }
            S0.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f905g = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void A(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            T0.c(this.f906a, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void B(float f) {
        this.f906a.setPivotY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void C(float f) {
        this.f906a.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int D() {
        return this.f909d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean E() {
        return this.f906a.getClipToOutline();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void F(int i) {
        this.f908c += i;
        this.f910e += i;
        this.f906a.offsetTopAndBottom(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void G(boolean z5) {
        this.f906a.setClipToOutline(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void H(Outline outline) {
        this.f906a.setOutline(outline);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void I(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            T0.d(this.f906a, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean J() {
        return this.f906a.setHasOverlappingRendering(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void K(Matrix matrix) {
        this.f906a.getMatrix(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final float L() {
        return this.f906a.getElevation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int a() {
        return this.f910e - this.f908c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int b() {
        return this.f909d - this.f907b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final float c() {
        return this.f906a.getAlpha();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void d() {
        this.f906a.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void e(float f) {
        this.f906a.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void f() {
        this.f906a.setTranslationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void g() {
        this.f906a.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void h(float f) {
        this.f906a.setScaleX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void i() {
        S0.a(this.f906a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void j() {
        this.f906a.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void k() {
        this.f906a.setRotation(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void l(float f) {
        this.f906a.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void m(float f) {
        this.f906a.setCameraDistance(-f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean n() {
        return this.f906a.isValid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void o(int i) {
        this.f907b += i;
        this.f909d += i;
        this.f906a.offsetLeftAndRight(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int p() {
        return this.f910e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean q() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void s(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f906a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int t() {
        return this.f908c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final int u() {
        return this.f907b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void v(float f) {
        this.f906a.setPivotX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void w(boolean z5) {
        this.f = z5;
        this.f906a.setClipToBounds(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final boolean x(int i, int i7, int i8, int i9) {
        this.f907b = i;
        this.f908c = i7;
        this.f909d = i8;
        this.f910e = i9;
        return this.f906a.setLeftTopRightBottom(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void y(j0.n nVar, InterfaceC1144A interfaceC1144A, Q0 q02) {
        Canvas canvasStart = this.f906a.start(b(), a());
        C1147b c1147b = nVar.f13717a;
        Canvas canvas = c1147b.f13696a;
        c1147b.f13696a = canvasStart;
        if (interfaceC1144A != null) {
            c1147b.k();
            c1147b.a(interfaceC1144A);
        }
        q02.invoke(c1147b);
        if (interfaceC1144A != null) {
            c1147b.i();
        }
        nVar.f13717a.f13696a = canvas;
        this.f906a.end(canvasStart);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // C0.InterfaceC0107v0
    public final void z() {
        this.f906a.setLayerType(0);
        this.f906a.setHasOverlappingRendering(true);
    }

    @Override // C0.InterfaceC0107v0
    public final void r() {
    }
}
