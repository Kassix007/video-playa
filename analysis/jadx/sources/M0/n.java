package m0;

import B0.G0;
import C0.c1;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import j0.C1147b;
import l0.AbstractC1220c;
import l0.C1218a;
import l0.C1219b;
import n0.AbstractC1391a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends View {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final c1 f14997A = new c1(3);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC1391a f14998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0.n f14999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1219b f15000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Outline f15002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public W0.c f15004w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public W0.l f15005x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B5.c f15006y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1348c f15007z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(AbstractC1391a abstractC1391a, j0.n nVar, C1219b c1219b) {
        super(abstractC1391a.getContext());
        this.f14998q = abstractC1391a;
        this.f14999r = nVar;
        this.f15000s = c1219b;
        setOutlineProvider(f14997A);
        this.f15003v = true;
        this.f15004w = AbstractC1220c.f14428a;
        this.f15005x = W0.l.f8022q;
        InterfaceC1350e.f14944a.getClass();
        this.f15006y = C1347b.f14920s;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        j0.n nVar = this.f14999r;
        C1147b c1147b = nVar.f13717a;
        Canvas canvas2 = c1147b.f13696a;
        c1147b.f13696a = canvas;
        W0.c cVar = this.f15004w;
        W0.l lVar = this.f15005x;
        float width = getWidth();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C1348c c1348c = this.f15007z;
        B5.c cVar2 = this.f15006y;
        C1219b c1219b = this.f15000s;
        G0 g02 = c1219b.f14425r;
        C1218a c1218a = ((C1219b) g02.f236t).f14424q;
        W0.c cVar3 = c1218a.f14420a;
        W0.l lVar2 = c1218a.f14421b;
        j0.m mVarT = g02.t();
        G0 g03 = c1219b.f14425r;
        long jE = g03.E();
        C1348c c1348c2 = (C1348c) g03.f235s;
        g03.V(cVar);
        g03.W(lVar);
        g03.U(c1147b);
        g03.X(jFloatToRawIntBits);
        g03.f235s = c1348c;
        c1147b.k();
        try {
            cVar2.invoke(c1219b);
            c1147b.i();
            g03.V(cVar3);
            g03.W(lVar2);
            g03.U(mVarT);
            g03.X(jE);
            g03.f235s = c1348c2;
            nVar.f13717a.f13696a = canvas2;
            this.f15001t = false;
        } catch (Throwable th) {
            c1147b.i();
            g03.V(cVar3);
            g03.W(lVar2);
            g03.U(mVarT);
            g03.X(jE);
            g03.f235s = c1348c2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f15003v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final j0.n getCanvasHolder() {
        return this.f14999r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getOwnerView() {
        return this.f14998q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f15003v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void invalidate() {
        if (this.f15001t) {
            return;
        }
        this.f15001t = true;
        super.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z5) {
        if (this.f15003v != z5) {
            this.f15003v = z5;
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setInvalidated(boolean z5) {
        this.f15001t = z5;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
    }
}
