package m0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import j0.AbstractC1145B;
import j0.AbstractC1148c;
import j0.C1147b;
import l0.C1219b;
import n0.AbstractC1391a;

/* JADX INFO: renamed from: m0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1355j implements InterfaceC1350e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1354i f14978v = new C1354i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1391a f14979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0.n f14980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f14981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Resources f14982e;
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14984h;
    public long i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f14987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14988n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f14989o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f14991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f14994t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14995u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1355j(AbstractC1391a abstractC1391a) {
        j0.n nVar = new j0.n();
        C1219b c1219b = new C1219b();
        this.f14979b = abstractC1391a;
        this.f14980c = nVar;
        n nVar2 = new n(abstractC1391a, nVar, c1219b);
        this.f14981d = nVar2;
        this.f14982e = abstractC1391a.getResources();
        this.f = new Rect();
        abstractC1391a.addView(nVar2);
        nVar2.setClipBounds(null);
        this.i = 0L;
        View.generateViewId();
        this.f14987m = 3;
        this.f14988n = 0;
        this.f14989o = 1.0f;
        this.f14991q = 1.0f;
        this.f14992r = 1.0f;
        long j = j0.o.f13718b;
        this.f14994t = j;
        this.f14995u = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final Matrix A() {
        return this.f14981d.getMatrix();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // m0.InterfaceC1350e
    public final void B(W0.c cVar, W0.l lVar, C1348c c1348c, C1346a c1346a) {
        n nVar = this.f14981d;
        ViewParent parent = nVar.getParent();
        AbstractC1391a abstractC1391a = this.f14979b;
        if (parent == null) {
            abstractC1391a.addView(nVar);
        }
        nVar.f15004w = cVar;
        nVar.f15005x = lVar;
        nVar.f15006y = c1346a;
        nVar.f15007z = c1348c;
        if (nVar.isAttachedToWindow()) {
            nVar.setVisibility(4);
            nVar.setVisibility(0);
            try {
                j0.n nVar2 = this.f14980c;
                C1354i c1354i = f14978v;
                C1147b c1147b = nVar2.f13717a;
                Canvas canvas = c1147b.f13696a;
                c1147b.f13696a = c1354i;
                abstractC1391a.a(c1147b, nVar, nVar.getDrawingTime());
                nVar2.f13717a.f13696a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void C(int i, int i7, long j) {
        boolean zA = W0.k.a(this.i, j);
        n nVar = this.f14981d;
        if (zA) {
            int i8 = this.f14983g;
            if (i8 != i) {
                nVar.offsetLeftAndRight(i - i8);
            }
            int i9 = this.f14984h;
            if (i9 != i7) {
                nVar.offsetTopAndBottom(i7 - i9);
            }
        } else {
            if (this.f14986l || nVar.getClipToOutline()) {
                this.j = true;
            }
            int i10 = (int) (j >> 32);
            int i11 = (int) (4294967295L & j);
            nVar.layout(i, i7, i + i10, i7 + i11);
            this.i = j;
            if (this.f14990p) {
                nVar.setPivotX(i10 / 2.0f);
                nVar.setPivotY(i11 / 2.0f);
            }
        }
        this.f14983g = i;
        this.f14984h = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float D() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float E() {
        return this.f14993s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float F() {
        return this.f14992r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float G() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final int H() {
        return this.f14987m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void I(long j) {
        long j7 = 9223372034707292159L & j;
        n nVar = this.f14981d;
        if (j7 != 9205357640488583168L) {
            this.f14990p = false;
            nVar.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            nVar.setPivotY(Float.intBitsToFloat((int) (j & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                nVar.resetPivot();
                return;
            }
            this.f14990p = true;
            nVar.setPivotX(((int) (this.i >> 32)) / 2.0f);
            nVar.setPivotY(((int) (this.i & 4294967295L)) / 2.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final long J() {
        return this.f14994t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float a() {
        return this.f14991q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void b(float f) {
        this.f14993s = f;
        this.f14981d.setElevation(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float c() {
        return this.f14989o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void d() {
        this.f14981d.setRotationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void e(float f) {
        this.f14989o = f;
        this.f14981d.setAlpha(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void f() {
        this.f14981d.setTranslationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void g() {
        this.f14981d.setRotationY(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void h(float f) {
        this.f14991q = f;
        this.f14981d.setScaleX(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void i() {
        this.f14979b.removeViewInLayout(this.f14981d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void j() {
        this.f14981d.setTranslationX(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void k() {
        this.f14981d.setRotation(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void l(float f) {
        this.f14992r = f;
        this.f14981d.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void m(float f) {
        this.f14981d.setCameraDistance(f * this.f14982e.getDisplayMetrics().densityDpi);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float o() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final long p() {
        return this.f14995u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void q(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14994t = j;
            this.f14981d.setOutlineAmbientShadowColor(AbstractC1145B.v(j));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void r(Outline outline, long j) {
        n nVar = this.f14981d;
        nVar.f15002u = outline;
        nVar.invalidateOutline();
        if ((this.f14986l || nVar.getClipToOutline()) && outline != null) {
            nVar.setClipToOutline(true);
            if (this.f14986l) {
                this.f14986l = false;
                this.j = true;
            }
        }
        this.f14985k = outline != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float s() {
        return this.f14981d.getCameraDistance() / this.f14982e.getDisplayMetrics().densityDpi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float t() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void u(boolean z5) {
        boolean z6 = false;
        this.f14986l = z5 && !this.f14985k;
        this.j = true;
        if (z5 && this.f14985k) {
            z6 = true;
        }
        this.f14981d.setClipToOutline(z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final int v() {
        return this.f14988n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final float w() {
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void x(j0.m mVar) {
        Rect rect;
        boolean z5 = this.j;
        n nVar = this.f14981d;
        if (z5) {
            if ((this.f14986l || nVar.getClipToOutline()) && !this.f14985k) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = nVar.getWidth();
                rect.bottom = nVar.getHeight();
            } else {
                rect = null;
            }
            nVar.setClipBounds(rect);
        }
        if (AbstractC1148c.a(mVar).isHardwareAccelerated()) {
            this.f14979b.a(mVar, nVar, nVar.getDrawingTime());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void y(int i) {
        this.f14988n = i;
        n nVar = this.f14981d;
        boolean z5 = true;
        if (i == 1 || this.f14987m != 3) {
            nVar.setLayerType(2, null);
            nVar.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i == 1) {
            nVar.setLayerType(2, null);
        } else if (i == 2) {
            nVar.setLayerType(0, null);
            z5 = false;
        } else {
            nVar.setLayerType(0, null);
        }
        nVar.setCanUseCompositingLayer$ui_graphics_release(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m0.InterfaceC1350e
    public final void z(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14995u = j;
            this.f14981d.setOutlineSpotShadowColor(AbstractC1145B.v(j));
        }
    }
}
