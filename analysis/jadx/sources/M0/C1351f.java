package m0;

import B0.G0;
import C0.A;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import com.google.android.gms.internal.measurement.P1;
import j0.AbstractC1145B;
import j0.AbstractC1148c;
import j0.C1147b;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.C1218a;
import l0.C1219b;

/* JADX INFO: renamed from: m0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1351f implements InterfaceC1350e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f14945v = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0.n f14946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1219b f14947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RenderNode f14948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14949e;
    public Matrix f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f14951h;
    public int i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f14952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f14954m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14955n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14956o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f14957p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f14958q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14959r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14960s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14961t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14962u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1351f(A a7, j0.n nVar, C1219b c1219b) {
        this.f14946b = nVar;
        this.f14947c = c1219b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", a7);
        this.f14948d = renderNodeCreate;
        this.f14949e = 0L;
        this.f14951h = 0L;
        if (f14945v.getAndSet(false)) {
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
                m.c(renderNodeCreate, m.a(renderNodeCreate));
                m.d(renderNodeCreate, m.b(renderNodeCreate));
            }
            l.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        L(0);
        this.i = 0;
        this.j = 3;
        this.f14952k = 1.0f;
        this.f14954m = 1.0f;
        this.f14955n = 1.0f;
        long j = j0.o.f13718b;
        this.f14957p = j;
        this.f14958q = j;
        this.f14959r = 8.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final Matrix A() {
        Matrix matrix = this.f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f = matrix;
        }
        this.f14948d.getMatrix(matrix);
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void B(W0.c cVar, W0.l lVar, C1348c c1348c, C1346a c1346a) {
        Canvas canvasStart = this.f14948d.start(Math.max((int) (this.f14949e >> 32), (int) (this.f14951h >> 32)), Math.max((int) (this.f14949e & 4294967295L), (int) (this.f14951h & 4294967295L)));
        try {
            C1147b c1147b = this.f14946b.f13717a;
            Canvas canvas = c1147b.f13696a;
            c1147b.f13696a = canvasStart;
            C1219b c1219b = this.f14947c;
            G0 g02 = c1219b.f14425r;
            long jD0 = P1.d0(this.f14949e);
            C1218a c1218a = ((C1219b) g02.f236t).f14424q;
            W0.c cVar2 = c1218a.f14420a;
            W0.l lVar2 = c1218a.f14421b;
            j0.m mVarT = g02.t();
            long jE = g02.E();
            C1348c c1348c2 = (C1348c) g02.f235s;
            g02.V(cVar);
            g02.W(lVar);
            g02.U(c1147b);
            g02.X(jD0);
            g02.f235s = c1348c;
            c1147b.k();
            try {
                c1346a.invoke(c1219b);
                c1147b.i();
                g02.V(cVar2);
                g02.W(lVar2);
                g02.U(mVarT);
                g02.X(jE);
                g02.f235s = c1348c2;
                c1147b.f13696a = canvas;
                this.f14948d.end(canvasStart);
            } catch (Throwable th) {
                c1147b.i();
                G0 g03 = c1219b.f14425r;
                g03.V(cVar2);
                g03.W(lVar2);
                g03.U(mVarT);
                g03.X(jE);
                g03.f235s = c1348c2;
                throw th;
            }
        } catch (Throwable th2) {
            this.f14948d.end(canvasStart);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void C(int i, int i7, long j) {
        int i8 = (int) (j >> 32);
        int i9 = (int) (4294967295L & j);
        this.f14948d.setLeftTopRightBottom(i, i7, i + i8, i7 + i9);
        if (W0.k.a(this.f14949e, j)) {
            return;
        }
        if (this.f14953l) {
            this.f14948d.setPivotX(i8 / 2.0f);
            this.f14948d.setPivotY(i9 / 2.0f);
        }
        this.f14949e = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float D() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float E() {
        return this.f14956o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float F() {
        return this.f14955n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float G() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final int H() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void I(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.f14953l = true;
            this.f14948d.setPivotX(((int) (this.f14949e >> 32)) / 2.0f);
            this.f14948d.setPivotY(((int) (4294967295L & this.f14949e)) / 2.0f);
        } else {
            this.f14953l = false;
            this.f14948d.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            this.f14948d.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final long J() {
        return this.f14957p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K() {
        boolean z5 = this.f14960s;
        boolean z6 = false;
        boolean z7 = z5 && !this.f14950g;
        if (z5 && this.f14950g) {
            z6 = true;
        }
        if (z7 != this.f14961t) {
            this.f14961t = z7;
            this.f14948d.setClipToBounds(z7);
        }
        if (z6 != this.f14962u) {
            this.f14962u = z6;
            this.f14948d.setClipToOutline(z6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(int i) {
        RenderNode renderNode = this.f14948d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float a() {
        return this.f14954m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void b(float f) {
        this.f14956o = f;
        this.f14948d.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float c() {
        return this.f14952k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void d() {
        this.f14948d.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void e(float f) {
        this.f14952k = f;
        this.f14948d.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void f() {
        this.f14948d.setTranslationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void g() {
        this.f14948d.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void h(float f) {
        this.f14954m = f;
        this.f14948d.setScaleX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void i() {
        l.a(this.f14948d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void j() {
        this.f14948d.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void k() {
        this.f14948d.setRotation(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void l(float f) {
        this.f14955n = f;
        this.f14948d.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void m(float f) {
        this.f14959r = f;
        this.f14948d.setCameraDistance(-f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final boolean n() {
        return this.f14948d.isValid();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float o() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final long p() {
        return this.f14958q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14957p = j;
            m.c(this.f14948d, AbstractC1145B.v(j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void r(Outline outline, long j) {
        this.f14951h = j;
        this.f14948d.setOutline(outline);
        this.f14950g = outline != null;
        K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float s() {
        return this.f14959r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float t() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void u(boolean z5) {
        this.f14960s = z5;
        K();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final int v() {
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float w() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void x(j0.m mVar) {
        DisplayListCanvas displayListCanvasA = AbstractC1148c.a(mVar);
        kotlin.jvm.internal.m.c(displayListCanvasA, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasA.drawRenderNode(this.f14948d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void y(int i) {
        this.i = i;
        if (i != 1 && this.j == 3) {
            L(i);
        } else {
            L(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14958q = j;
            m.d(this.f14948d, AbstractC1145B.v(j));
        }
    }
}
