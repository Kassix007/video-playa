package v;

import B0.AbstractC0049n;
import B0.G0;
import B0.InterfaceC0051p;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import i0.C1133e;
import i1.C1134a;
import j0.AbstractC1148c;
import j0.C1147b;
import l0.C1218a;
import l0.C1219b;
import m0.C1348c;
import t1.AbstractC1614a;
import v0.C1731A;
import w.EnumC1778d0;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0049n implements InterfaceC0051p {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final /* synthetic */ int f17255G = 1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C1717l f17256H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final E f17257I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Object f17258J;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L(C1731A c1731a, C1717l c1717l, E e7) {
        this.f17256H = c1717l;
        this.f17257I = e7;
        x0(c1731a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean A0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean B0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RenderNode C0() {
        RenderNode renderNode = (RenderNode) this.f17258J;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = AbstractC1614a.f();
        this.f17258J = renderNodeF;
        return renderNodeF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(B0.N n7) {
        boolean zB0;
        char c7;
        long j;
        float f;
        boolean z5;
        boolean zA0;
        C1717l c1717l;
        RecordingCanvas recordingCanvas;
        char c8;
        float f7;
        float f8;
        float f9;
        float fB;
        switch (this.f17255G) {
            case 0:
                A.L l7 = (A.L) this.f17258J;
                C1219b c1219b = n7.f296q;
                long jD = c1219b.d();
                C1717l c1717l2 = this.f17256H;
                c1717l2.i(jD);
                if (C1133e.e(c1219b.d())) {
                    n7.a();
                    return;
                }
                n7.a();
                c1717l2.f17357d.getValue();
                Canvas canvasA = AbstractC1148c.a(c1219b.f14425r.t());
                E e7 = this.f17257I;
                if (E.f(e7.f)) {
                    zB0 = B0(270.0f, (((long) Float.floatToRawIntBits(n7.u(l7.b(n7.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1219b.d() & 4294967295L)))) << 32), e7.c(), canvasA);
                } else {
                    zB0 = false;
                }
                if (E.f(e7.f17230d)) {
                    c7 = ' ';
                    j = 4294967295L;
                    zB0 = B0(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(n7.u(l7.d()))) & 4294967295L), e7.e(), canvasA) || zB0;
                } else {
                    c7 = ' ';
                    j = 4294967295L;
                }
                if (E.f(e7.f17232g)) {
                    zB0 = B0(90.0f, (((long) Float.floatToRawIntBits(n7.u(l7.c(n7.getLayoutDirection())) + (-((float) D5.a.G(Float.intBitsToFloat((int) (c1219b.d() >> c7))))))) & j) | (((long) Float.floatToRawIntBits(0.0f)) << c7), e7.d(), canvasA) || zB0;
                }
                if (E.f(e7.f17231e)) {
                    zB0 = B0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c1219b.d() & j))) + n7.u(l7.a()))) & j) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1219b.d() >> c7)))) << c7), e7.b(), canvasA) || zB0;
                }
                if (zB0) {
                    c1717l2.d();
                    return;
                }
                return;
            default:
                C1219b c1219b2 = n7.f296q;
                long jD2 = c1219b2.d();
                C1717l c1717l3 = this.f17256H;
                c1717l3.i(jD2);
                Canvas canvasA2 = AbstractC1148c.a(c1219b2.f14425r.t());
                c1717l3.f17357d.getValue();
                if (C1133e.e(c1219b2.d())) {
                    n7.a();
                    return;
                }
                boolean zIsHardwareAccelerated = canvasA2.isHardwareAccelerated();
                E e8 = this.f17257I;
                if (!zIsHardwareAccelerated) {
                    EdgeEffect edgeEffect = e8.f17230d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = e8.f17231e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = e8.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = e8.f17232g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = e8.f17233h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = e8.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = e8.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = e8.f17234k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    n7.a();
                    return;
                }
                float fU = n7.u(AbstractC1730z.f17424a);
                boolean z6 = E.f(e8.f17230d) || E.g(e8.f17233h) || E.f(e8.f17231e) || E.g(e8.i);
                boolean z7 = E.f(e8.f) || E.g(e8.j) || E.f(e8.f17232g) || E.g(e8.f17234k);
                if (z6 && z7) {
                    C0().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z6) {
                    C0().setPosition(0, 0, (D5.a.G(fU) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z7) {
                        n7.a();
                        return;
                    }
                    C0().setPosition(0, 0, canvasA2.getWidth(), (D5.a.G(fU) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = C0().beginRecording();
                boolean zG = E.g(e8.j);
                EnumC1778d0 enumC1778d0 = EnumC1778d0.f17946r;
                if (zG) {
                    EdgeEffect edgeEffectA = e8.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = e8.a(enumC1778d0);
                        e8.j = edgeEffectA;
                    }
                    A0(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (E.f(e8.f)) {
                    EdgeEffect edgeEffectC = e8.c();
                    zA0 = A0(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (E.g(e8.f)) {
                        z5 = z7;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c1717l3.c() & 4294967295L));
                        EdgeEffect edgeEffectA2 = e8.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = e8.a(enumC1778d0);
                            e8.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float fB2 = i >= 31 ? AbstractC1720o.b(edgeEffectC) : 0.0f;
                        f = fU;
                        float f10 = 1 - fIntBitsToFloat;
                        if (i >= 31) {
                            AbstractC1720o.c(edgeEffectA2, fB2, f10);
                        } else {
                            edgeEffectA2.onPull(fB2, f10);
                        }
                    } else {
                        f = fU;
                        z5 = z7;
                    }
                } else {
                    f = fU;
                    z5 = z7;
                    zA0 = false;
                }
                boolean zG2 = E.g(e8.f17233h);
                EnumC1778d0 enumC1778d02 = EnumC1778d0.f17945q;
                if (zG2) {
                    EdgeEffect edgeEffectA3 = e8.f17233h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = e8.a(enumC1778d02);
                        e8.f17233h = edgeEffectA3;
                    }
                    A0(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (E.f(e8.f17230d)) {
                    EdgeEffect edgeEffectE = e8.e();
                    boolean z8 = A0(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zA0;
                    if (E.g(e8.f17230d)) {
                        recordingCanvas = recordingCanvasBeginRecording;
                        c8 = ' ';
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c1717l3.c() >> 32));
                        EdgeEffect edgeEffectA4 = e8.f17233h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = e8.a(enumC1778d02);
                            e8.f17233h = edgeEffectA4;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            c1717l = c1717l3;
                            fB = AbstractC1720o.b(edgeEffectE);
                        } else {
                            c1717l = c1717l3;
                            fB = 0.0f;
                        }
                        if (i7 >= 31) {
                            AbstractC1720o.c(edgeEffectA4, fB, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(fB, fIntBitsToFloat2);
                        }
                    } else {
                        c1717l = c1717l3;
                        recordingCanvas = recordingCanvasBeginRecording;
                        c8 = ' ';
                    }
                    zA0 = z8;
                } else {
                    c1717l = c1717l3;
                    recordingCanvas = recordingCanvasBeginRecording;
                    c8 = ' ';
                }
                if (E.g(e8.f17234k)) {
                    EdgeEffect edgeEffectA5 = e8.f17234k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = e8.a(enumC1778d0);
                        e8.f17234k = edgeEffectA5;
                    }
                    A0(270.0f, edgeEffectA5, recordingCanvas);
                    edgeEffectA5.finish();
                }
                if (E.f(e8.f17232g)) {
                    EdgeEffect edgeEffectD = e8.d();
                    boolean z9 = A0(90.0f, edgeEffectD, recordingCanvas) || zA0;
                    if (E.g(e8.f17232g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c1717l.c() & 4294967295L));
                        EdgeEffect edgeEffectA6 = e8.f17234k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = e8.a(enumC1778d0);
                            e8.f17234k = edgeEffectA6;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        float fB3 = i8 >= 31 ? AbstractC1720o.b(edgeEffectD) : 0.0f;
                        if (i8 >= 31) {
                            AbstractC1720o.c(edgeEffectA6, fB3, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(fB3, fIntBitsToFloat3);
                        }
                    }
                    zA0 = z9;
                }
                if (E.g(e8.i)) {
                    EdgeEffect edgeEffectA7 = e8.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = e8.a(enumC1778d02);
                        e8.i = edgeEffectA7;
                    }
                    f7 = 0.0f;
                    A0(0.0f, edgeEffectA7, recordingCanvas);
                    edgeEffectA7.finish();
                } else {
                    f7 = 0.0f;
                }
                if (E.f(e8.f17231e)) {
                    EdgeEffect edgeEffectB = e8.b();
                    boolean z10 = A0(180.0f, edgeEffectB, recordingCanvas) || zA0;
                    if (E.g(e8.f17231e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c1717l.c() >> c8));
                        EdgeEffect edgeEffectA8 = e8.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = e8.a(enumC1778d02);
                            e8.i = edgeEffectA8;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float fB4 = i9 >= 31 ? AbstractC1720o.b(edgeEffectB) : f7;
                        float f11 = 1 - fIntBitsToFloat4;
                        if (i9 >= 31) {
                            AbstractC1720o.c(edgeEffectA8, fB4, f11);
                        } else {
                            edgeEffectA8.onPull(fB4, f11);
                        }
                    }
                    zA0 = z10;
                }
                if (zA0) {
                    c1717l.d();
                }
                float f12 = z5 ? f7 : f;
                if (!z6) {
                    f7 = f;
                }
                W0.l layoutDirection = n7.getLayoutDirection();
                C1147b c1147b = new C1147b();
                c1147b.f13696a = recordingCanvas;
                long jD3 = c1219b2.d();
                G0 g02 = c1219b2.f14425r;
                C1218a c1218a = ((C1219b) g02.f236t).f14424q;
                W0.c cVar = c1218a.f14420a;
                W0.l lVar = c1218a.f14421b;
                j0.m mVarT = g02.t();
                long jE = c1219b2.f14425r.E();
                G0 g03 = c1219b2.f14425r;
                C1348c c1348c = (C1348c) g03.f235s;
                g03.V(n7);
                g03.W(layoutDirection);
                g03.U(c1147b);
                g03.X(jD3);
                g03.f235s = null;
                c1147b.k();
                try {
                    ((C1134a) c1219b2.f14425r.f234r).A(f12, f7);
                    try {
                        n7.a();
                        c1147b.i();
                        G0 g04 = c1219b2.f14425r;
                        g04.V(cVar);
                        g04.W(lVar);
                        g04.U(mVarT);
                        g04.X(jE);
                        g04.f235s = c1348c;
                        C0().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f8, f9);
                        canvasA2.drawRenderNode(C0());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((C1134a) c1219b2.f14425r.f234r).A(-f12, -f7);
                    }
                } catch (Throwable th) {
                    c1147b.i();
                    G0 g05 = c1219b2.f14425r;
                    g05.V(cVar);
                    g05.W(lVar);
                    g05.U(mVarT);
                    g05.X(jE);
                    g05.f235s = c1348c;
                    throw th;
                }
        }
    }

    public L(C1731A c1731a, C1717l c1717l, E e7, A.L l7) {
        this.f17256H = c1717l;
        this.f17257I = e7;
        this.f17258J = l7;
        x0(c1731a);
    }
}
