package m0;

import B0.G0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import com.google.android.gms.internal.measurement.P1;
import j0.AbstractC1145B;
import j0.AbstractC1148c;
import j0.C1147b;
import l0.C1219b;

/* JADX INFO: renamed from: m0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1353h implements InterfaceC1350e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.n f14963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1219b f14964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f14965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14966e;
    public Matrix f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14968h;
    public final int i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f14970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f14971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f14972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14977s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1353h() {
        j0.n nVar = new j0.n();
        C1219b c1219b = new C1219b();
        this.f14963b = nVar;
        this.f14964c = c1219b;
        RenderNode renderNodeD = AbstractC1352g.d();
        this.f14965d = renderNodeD;
        this.f14966e = 0L;
        renderNodeD.setClipToBounds(false);
        L(renderNodeD, 0);
        this.f14968h = 1.0f;
        this.i = 3;
        this.j = 1.0f;
        this.f14969k = 1.0f;
        long j = j0.o.f13718b;
        this.f14971m = j;
        this.f14972n = j;
        this.f14973o = 8.0f;
        this.f14977s = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void L(RenderNode renderNode, int i) {
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final Matrix A() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.f14965d.getMatrix(matrix);
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void B(W0.c cVar, W0.l lVar, C1348c c1348c, C1346a c1346a) {
        C1219b c1219b = this.f14964c;
        RecordingCanvas recordingCanvasBeginRecording = this.f14965d.beginRecording();
        try {
            j0.n nVar = this.f14963b;
            C1147b c1147b = nVar.f13717a;
            Canvas canvas = c1147b.f13696a;
            c1147b.f13696a = recordingCanvasBeginRecording;
            G0 g02 = c1219b.f14425r;
            g02.V(cVar);
            g02.W(lVar);
            g02.f235s = c1348c;
            g02.X(this.f14966e);
            g02.U(c1147b);
            c1346a.invoke(c1219b);
            nVar.f13717a.f13696a = canvas;
        } finally {
            this.f14965d.endRecording();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void C(int i, int i7, long j) {
        this.f14965d.setPosition(i, i7, ((int) (j >> 32)) + i, ((int) (4294967295L & j)) + i7);
        this.f14966e = P1.d0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float D() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float E() {
        return this.f14970l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float F() {
        return this.f14969k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float G() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final int H() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void I(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f14965d.resetPivot();
        } else {
            this.f14965d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f14965d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final long J() {
        return this.f14971m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K() {
        boolean z5 = this.f14974p;
        boolean z6 = false;
        boolean z7 = z5 && !this.f14967g;
        if (z5 && this.f14967g) {
            z6 = true;
        }
        if (z7 != this.f14975q) {
            this.f14975q = z7;
            this.f14965d.setClipToBounds(z7);
        }
        if (z6 != this.f14976r) {
            this.f14976r = z6;
            this.f14965d.setClipToOutline(z6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float a() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void b(float f) {
        this.f14970l = f;
        this.f14965d.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float c() {
        return this.f14968h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void d() {
        this.f14965d.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void e(float f) {
        this.f14968h = f;
        this.f14965d.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void f() {
        this.f14965d.setTranslationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void g() {
        this.f14965d.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void h(float f) {
        this.j = f;
        this.f14965d.setScaleX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void i() {
        this.f14965d.discardDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void j() {
        this.f14965d.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void k() {
        this.f14965d.setRotationZ(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void l(float f) {
        this.f14969k = f;
        this.f14965d.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void m(float f) {
        this.f14973o = f;
        this.f14965d.setCameraDistance(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final boolean n() {
        return this.f14965d.hasDisplayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float o() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final long p() {
        return this.f14972n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void q(long j) {
        this.f14971m = j;
        this.f14965d.setAmbientShadowColor(AbstractC1145B.v(j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void r(Outline outline, long j) {
        this.f14965d.setOutline(outline);
        this.f14967g = outline != null;
        K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float s() {
        return this.f14973o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float t() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void u(boolean z5) {
        this.f14974p = z5;
        K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final int v() {
        return this.f14977s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float w() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void x(j0.m mVar) {
        AbstractC1148c.a(mVar).drawRenderNode(this.f14965d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void y(int i) {
        this.f14977s = i;
        if (i != 1 && this.i == 3) {
            L(this.f14965d, i);
        } else {
            L(this.f14965d, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void z(long j) {
        this.f14972n = j;
        this.f14965d.setSpotShadowColor(AbstractC1145B.v(j));
    }
}
