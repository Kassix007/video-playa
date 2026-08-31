package Z0;

import A.J;
import A.Y;
import B0.AbstractC0041g;
import B0.C0029a;
import B0.C0056v;
import B0.L;
import B0.t0;
import B0.u0;
import B0.v0;
import C0.A;
import C0.RunnableC0114z;
import C0.W;
import C0.s1;
import M.C0231t;
import M5.AbstractC0263y;
import P.C0367m;
import P.InterfaceC0359i;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.X;
import c0.C0722j;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.K1;
import com.wnapp.smspariaz.R;
import java.util.LinkedHashMap;
import v0.C1749r;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.InterfaceC1849l;
import w1.InterfaceC1850m;
import w1.l0;
import w1.o0;
import y0.AbstractC1904a;
import z0.AbstractC1938O;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends ViewGroup implements InterfaceC1849l, InterfaceC0359i, u0, InterfaceC1850m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public B5.c f8342A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterfaceC0660x f8343B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g2.e f8344C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f8345D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f8346E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public o0 f8347F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final i f8348G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final i f8349H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B5.c f8350I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int[] f8351J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f8352K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f8353L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C0231t f8354M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f8355N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final L f8356O;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0.d f8357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f8358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t0 f8359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B5.a f8360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public B5.a f8362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public B5.a f8363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InterfaceC0725m f8364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public B5.c f8365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public W0.c f8366z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(Context context, C0367m c0367m, int i, u0.d dVar, View view, t0 t0Var) {
        super(context);
        this.f8357q = dVar;
        this.f8358r = view;
        this.f8359s = t0Var;
        LinkedHashMap linkedHashMap = s1.f1108a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0367m);
        int i7 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        r rVar = (r) this;
        AbstractC1835K.o(this, new a(rVar, i7));
        AbstractC1826B.l(this, this);
        this.f8360t = h.f8338t;
        this.f8362v = h.f8337s;
        this.f8363w = h.f8336r;
        C0722j c0722j = C0722j.f10095q;
        this.f8364x = c0722j;
        this.f8366z = I1.B();
        this.f8345D = new int[2];
        this.f8346E = 0L;
        this.f8348G = new i(rVar, 1);
        this.f8349H = new i(rVar, i7);
        this.f8351J = new int[2];
        this.f8352K = Integer.MIN_VALUE;
        this.f8353L = Integer.MIN_VALUE;
        this.f8354M = new C0231t();
        L l7 = new L(3);
        l7.f285w = true;
        l7.f252E = rVar;
        InterfaceC0725m interfaceC0725mA = I0.j.a(androidx.compose.ui.input.nestedscroll.a.a(c0722j, l.f8367a, dVar), true, b.f8319t);
        C1749r c1749r = new C1749r();
        c1749r.f17489q = new d(rVar, 1);
        O5.r rVar2 = new O5.r();
        O5.r rVar3 = c1749r.f17490r;
        if (rVar3 != null) {
            rVar3.f5259r = null;
        }
        c1749r.f17490r = rVar2;
        rVar2.f5259r = c1749r;
        setOnRequestDisallowInterceptTouchEvent$ui_release(rVar2);
        InterfaceC0725m interfaceC0725mC = androidx.compose.ui.layout.a.c(androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.b(interfaceC0725mA.d(c1749r), 0.0f, null, false, 131071), new J(rVar, l7, rVar, 5)), new c(rVar, l7, 2));
        l7.Y(this.f8364x.d(interfaceC0725mC));
        this.f8365y = new Y(21, l7, interfaceC0725mC);
        l7.V(this.f8366z);
        this.f8342A = new C0029a(23, l7);
        l7.f275b0 = new c(rVar, l7, 0);
        l7.f276c0 = new d(rVar, 0);
        l7.X(new e(rVar, l7));
        this.f8356O = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final v0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC1904a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((A) this.f8359s).getSnapshotObserver();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int l(r rVar, int i, int i7, int i8) {
        return (i8 >= 0 || i == i7) ? View.MeasureSpec.makeMeasureSpec(D5.a.q(i8, i, i7), 1073741824) : (i8 != -2 || i7 == Integer.MAX_VALUE) ? (i8 != -1 || i7 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static n1.b m(n1.b bVar, int i, int i7, int i8, int i9) {
        int i10 = bVar.f15125a - i;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = bVar.f15126b - i7;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = bVar.f15127c - i8;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = bVar.f15128d - i9;
        return n1.b.b(i10, i11, i12, i13 >= 0 ? i13 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void a(View view, View view2, int i, int i7) {
        C0231t c0231t = this.f8354M;
        if (i7 == 1) {
            c0231t.f3617b = i;
        } else {
            c0231t.f3616a = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void b(View view, int i) {
        C0231t c0231t = this.f8354M;
        if (i == 1) {
            c0231t.f3617b = 0;
        } else {
            c0231t.f3616a = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1850m
    public final o0 c(View view, o0 o0Var) {
        this.f8347F = new o0(o0Var);
        return n(o0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void d(View view, int i, int i7, int[] iArr, int i8) {
        if (this.f8358r.isNestedScrollingEnabled()) {
            float f = i;
            float f7 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f * f7)) << 32) | (((long) Float.floatToRawIntBits(i7 * f7)) & 4294967295L);
            int i9 = i8 == 0 ? 1 : 2;
            u0.g gVar = this.f8357q.f17095a;
            u0.g gVar2 = null;
            if (gVar != null && gVar.f10099D) {
                gVar2 = (u0.g) AbstractC0041g.j(gVar);
            }
            long jB0 = gVar2 != null ? gVar2.b0(i9, jFloatToRawIntBits) : 0L;
            iArr[0] = W.c(Float.intBitsToFloat((int) (jB0 >> 32)));
            iArr[1] = W.c(Float.intBitsToFloat((int) (jB0 & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void e() {
        View view = this.f8358r;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f8362v.invoke();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void f() {
        this.f8363w.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void g() {
        this.f8362v.invoke();
        removeAllViewsInLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f8351J;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final W0.c getDensity() {
        return this.f8366z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getInteropView() {
        return this.f8358r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final L getLayoutNode() {
        return this.f8356O;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f8358r.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0660x getLifecycleOwner() {
        return this.f8343B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0725m getModifier() {
        return this.f8364x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0231t c0231t = this.f8354M;
        return c0231t.f3617b | c0231t.f3616a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getOnDensityChanged$ui_release() {
        return this.f8342A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getOnModifierChanged$ui_release() {
        return this.f8365y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f8350I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.a getRelease() {
        return this.f8363w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.a getReset() {
        return this.f8362v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final g2.e getSavedStateRegistryOwner() {
        return this.f8344C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.a getUpdate() {
        return this.f8360t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View getView() {
        return this.f8358r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1849l
    public final void h(View view, int i, int i7, int i8, int i9, int i10, int[] iArr) {
        if (this.f8358r.isNestedScrollingEnabled()) {
            float f = i;
            float f7 = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f * f7)) << 32) | (((long) Float.floatToRawIntBits(i7 * f7)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i8 * f7)) << 32) | (((long) Float.floatToRawIntBits(i9 * f7)) & 4294967295L);
            int i11 = i10 == 0 ? 1 : 2;
            u0.g gVar = this.f8357q.f17095a;
            u0.g gVar2 = null;
            if (gVar != null && gVar.f10099D) {
                gVar2 = (u0.g) AbstractC0041g.j(gVar);
            }
            u0.g gVar3 = gVar2;
            long jF = gVar3 != null ? gVar3.F(i11, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = W.c(Float.intBitsToFloat((int) (jF >> 32)));
            iArr[1] = W.c(Float.intBitsToFloat((int) (jF & 4294967295L)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void i(View view, int i, int i7, int i8, int i9, int i10) {
        if (this.f8358r.isNestedScrollingEnabled()) {
            float f = -1;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(i * f)) << 32) | (((long) Float.floatToRawIntBits(i7 * f)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(i8 * f)) << 32) | (((long) Float.floatToRawIntBits(i9 * f)) & 4294967295L);
            int i11 = i10 == 0 ? 1 : 2;
            u0.g gVar = this.f8357q.f17095a;
            u0.g gVar2 = null;
            if (gVar != null && gVar.f10099D) {
                gVar2 = (u0.g) AbstractC0041g.j(gVar);
            }
            if (gVar2 != null) {
                gVar2.F(i11, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f8355N) {
            this.f8356O.A();
            return null;
        }
        this.f8358r.postOnAnimation(new RunnableC0114z(this.f8349H, 1));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f8358r.isNestedScrollingEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final boolean j(View view, View view2, int i, int i7) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o0 n(o0 o0Var) {
        l0 l0Var = o0Var.f18232a;
        n1.b bVarG = l0Var.g(-1);
        n1.b bVar = n1.b.f15124e;
        if (!bVarG.equals(bVar) || !l0Var.h(-9).equals(bVar) || l0Var.f() != null) {
            C0056v c0056v = this.f8356O.f268U.f430b;
            if (c0056v.f517a0.f10099D) {
                long jK = K1.K(c0056v.F(0L));
                int i = (int) (jK >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i7 = (int) (jK & 4294967295L);
                if (i7 < 0) {
                    i7 = 0;
                }
                long jE = AbstractC1938O.f(c0056v).E();
                int i8 = (int) (jE >> 32);
                int i9 = (int) (jE & 4294967295L);
                long j = c0056v.f18666s;
                long jK2 = K1.K(c0056v.F((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i10 = i8 - ((int) (jK2 >> 32));
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = i9 - ((int) (4294967295L & jK2));
                int i12 = i11 >= 0 ? i11 : 0;
                if (i != 0 || i7 != 0 || i10 != 0 || i12 != 0) {
                    return o0Var.f18232a.n(i, i7, i10, i12);
                }
            }
        }
        return o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f8348G.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f8355N) {
            this.f8356O.A();
        } else {
            this.f8358r.postOnAnimation(new RunnableC0114z(this.f8349H, 1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f519a.b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        this.f8358r.layout(0, 0, i8 - i, i9 - i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        View view = this.f8358r;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i7));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i7);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f8352K = i;
        this.f8353L = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z5) {
        if (!this.f8358r.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0263y.t(this.f8357q.c(), null, null, new f(z5, this, l6.d.i(f * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        if (!this.f8358r.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC0263y.t(this.f8357q.c(), null, null, new g(this, l6.d.i(f * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        B5.c cVar = this.f8350I;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z5));
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setDensity(W0.c cVar) {
        if (cVar != this.f8366z) {
            this.f8366z = cVar;
            B5.c cVar2 = this.f8342A;
            if (cVar2 != null) {
                cVar2.invoke(cVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLifecycleOwner(InterfaceC0660x interfaceC0660x) {
        if (interfaceC0660x != this.f8343B) {
            this.f8343B = interfaceC0660x;
            X.h(this, interfaceC0660x);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setModifier(InterfaceC0725m interfaceC0725m) {
        if (interfaceC0725m != this.f8364x) {
            this.f8364x = interfaceC0725m;
            B5.c cVar = this.f8365y;
            if (cVar != null) {
                cVar.invoke(interfaceC0725m);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnDensityChanged$ui_release(B5.c cVar) {
        this.f8342A = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnModifierChanged$ui_release(B5.c cVar) {
        this.f8365y = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(B5.c cVar) {
        this.f8350I = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setRelease(B5.a aVar) {
        this.f8363w = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setReset(B5.a aVar) {
        this.f8362v = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setSavedStateRegistryOwner(g2.e eVar) {
        if (eVar != this.f8344C) {
            this.f8344C = eVar;
            AbstractC0836n2.M(this, eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setUpdate(B5.a aVar) {
        this.f8360t = aVar;
        this.f8361u = true;
        this.f8348G.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.u0
    public final boolean x() {
        return isAttachedToWindow();
    }
}
