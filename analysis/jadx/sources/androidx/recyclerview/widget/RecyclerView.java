package androidx.recyclerview.widget;

import A1.b;
import B0.G0;
import D1.c;
import E0.d;
import L0.l;
import M.C0231t;
import O3.B;
import O3.T;
import Q.J;
import Z.m;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import c2.AbstractC0730a;
import d2.AbstractC0957D;
import d2.AbstractC0958E;
import d2.AbstractC0960G;
import d2.AbstractC0962I;
import d2.AbstractC0963J;
import d2.AbstractC0972T;
import d2.AbstractC0974V;
import d2.AbstractC1000z;
import d2.C0956C;
import d2.C0961H;
import d2.C0964K;
import d2.C0965L;
import d2.C0966M;
import d2.C0968O;
import d2.C0971S;
import d2.C0975a;
import d2.C0982h;
import d2.C0985k;
import d2.C0994t;
import d2.C0998x;
import d2.C0999y;
import d2.InterfaceC0955B;
import d2.InterfaceC0967N;
import d2.RunnableC0973U;
import d2.RunnableC0987m;
import d2.X;
import d2.g0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import r.C1566q;
import r.Q;
import r1.g;
import w1.AbstractC1826B;
import w1.AbstractC1829E;
import w1.AbstractC1835K;
import w1.AbstractC1836L;
import w1.C1847j;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final int[] f9599I0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public static final Class[] f9600J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public static final c f9601K0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1000z f9602A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final int[] f9603A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AbstractC0960G f9604B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C1847j f9605B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ArrayList f9606C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final int[] f9607C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f9608D;
    public final int[] D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0985k f9609E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final int[] f9610E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9611F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final ArrayList f9612F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9613G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public final b f9614G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9615H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final C0998x f9616H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9617I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f9618J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f9619K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f9620L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9621M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final AccessibilityManager f9622N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f9623O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f9624P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f9625Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f9626R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0956C f9627S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public EdgeEffect f9628T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public EdgeEffect f9629U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public EdgeEffect f9630V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public EdgeEffect f9631W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public AbstractC0957D f9632a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f9633b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f9634c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public VelocityTracker f9635d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f9636e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f9637f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f9638g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f9639h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f9640i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public AbstractC0962I f9641j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f9642k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int f9643l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final float f9644m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final float f9645n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f9646o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final RunnableC0973U f9647p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B f9648q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RunnableC0987m f9649q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0966M f9650r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final J f9651r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0968O f9652s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C0971S f9653s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f9654t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public AbstractC0963J f9655t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final G0 f9656u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f9657u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final m f9658v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9659v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9660w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f9661w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f9662x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final C0999y f9663x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f9664y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f9665y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f9666z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public X f9667z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class cls = Integer.TYPE;
        f9600J0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f9601K0 = new c(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.wnapp.smspariaz.R.attr.recyclerViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static RecyclerView D(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewD = D(viewGroup.getChildAt(i));
            if (recyclerViewD != null) {
                return recyclerViewD;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0974V I(View view) {
        if (view == null) {
            return null;
        }
        return ((C0961H) view.getLayoutParams()).f11989a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C1847j getScrollingChildHelper() {
        if (this.f9605B0 == null) {
            this.f9605B0 = new C1847j(this);
        }
        return this.f9605B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(AbstractC0974V abstractC0974V) {
        WeakReference weakReference = abstractC0974V.f12033b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == abstractC0974V.f12032a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            abstractC0974V.f12033b = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View A(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList r1 = r11.f9608D
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            d2.k r5 = (d2.C0985k) r5
            int r6 = r5.f12156v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L59
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.d(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.c(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L61
            if (r6 != 0) goto L3c
            if (r9 == 0) goto L61
        L3c:
            if (r9 == 0) goto L49
            r5.f12157w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f12150p = r6
            goto L55
        L49:
            if (r6 == 0) goto L55
            r5.f12157w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f12147m = r6
        L55:
            r5.f(r8)
            goto L5b
        L59:
            if (r6 != r8) goto L61
        L5b:
            r6 = 3
            if (r0 == r6) goto L61
            r11.f9609E = r5
            return r7
        L61:
            int r4 = r4 + 1
            goto Lc
        L64:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.B(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(int[] iArr) {
        int iV = this.f9656u.v();
        if (iV == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < iV; i8++) {
            AbstractC0974V abstractC0974VI = I(this.f9656u.u(i8));
            if (!abstractC0974VI.o()) {
                int iB = abstractC0974VI.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i7) {
                    i7 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0974V E(int i) {
        AbstractC0974V abstractC0974V = null;
        if (this.f9623O) {
            return null;
        }
        int iG = this.f9656u.G();
        for (int i7 = 0; i7 < iG; i7++) {
            AbstractC0974V abstractC0974VI = I(this.f9656u.F(i7));
            if (abstractC0974VI != null && !abstractC0974VI.h() && F(abstractC0974VI) == i) {
                if (!((ArrayList) this.f9656u.f236t).contains(abstractC0974VI.f12032a)) {
                    return abstractC0974VI;
                }
                abstractC0974V = abstractC0974VI;
            }
        }
        return abstractC0974V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int F(AbstractC0974V abstractC0974V) {
        if ((abstractC0974V.j & 524) == 0 && abstractC0974V.e()) {
            int i = abstractC0974V.f12034c;
            ArrayList arrayList = (ArrayList) this.f9654t.f3124a;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0975a c0975a = (C0975a) arrayList.get(i7);
                int i8 = c0975a.f12059a;
                if (i8 != 1) {
                    if (i8 == 2) {
                        int i9 = c0975a.f12060b;
                        if (i9 <= i) {
                            int i10 = c0975a.f12061c;
                            if (i9 + i10 <= i) {
                                i -= i10;
                            }
                        } else {
                            continue;
                        }
                    } else if (i8 == 8) {
                        int i11 = c0975a.f12060b;
                        if (i11 == i) {
                            i = c0975a.f12061c;
                        } else {
                            if (i11 < i) {
                                i--;
                            }
                            if (c0975a.f12061c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c0975a.f12060b <= i) {
                    i += c0975a.f12061c;
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long G(AbstractC0974V abstractC0974V) {
        return this.f9602A.f12223b ? abstractC0974V.f12036e : abstractC0974V.f12034c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0974V H(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return I(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Rect J(View view) {
        C0961H c0961h = (C0961H) view.getLayoutParams();
        boolean z5 = c0961h.f11991c;
        Rect rect = c0961h.f11990b;
        if (!z5 || (this.f9653s0.f12018g && (c0961h.f11989a.k() || c0961h.f11989a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.f9606C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f9662x;
            rect2.set(0, 0, 0, 0);
            ((AbstractC0958E) arrayList.get(i)).getClass();
            ((C0961H) view.getLayoutParams()).f11989a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c0961h.f11991c = false;
        return rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean K() {
        return !this.f9615H || this.f9623O || this.f9654t.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean L() {
        return this.f9625Q > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(int i) {
        if (this.f9604B == null) {
            return;
        }
        setScrollState(2);
        this.f9604B.n0(i);
        awakenScrollBars();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N() {
        int iG = this.f9656u.G();
        for (int i = 0; i < iG; i++) {
            ((C0961H) this.f9656u.F(i).getLayoutParams()).f11991c = true;
        }
        ArrayList arrayList = this.f9650r.f12001c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C0961H c0961h = (C0961H) ((AbstractC0974V) arrayList.get(i7)).f12032a.getLayoutParams();
            if (c0961h != null) {
                c0961h.f11991c = true;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O(int i, int i7, boolean z5) {
        int i8 = i + i7;
        int iG = this.f9656u.G();
        for (int i9 = 0; i9 < iG; i9++) {
            AbstractC0974V abstractC0974VI = I(this.f9656u.F(i9));
            if (abstractC0974VI != null && !abstractC0974VI.o()) {
                int i10 = abstractC0974VI.f12034c;
                C0971S c0971s = this.f9653s0;
                if (i10 >= i8) {
                    abstractC0974VI.l(-i7, z5);
                    c0971s.f = true;
                } else if (i10 >= i) {
                    abstractC0974VI.a(8);
                    abstractC0974VI.l(-i7, z5);
                    abstractC0974VI.f12034c = i - 1;
                    c0971s.f = true;
                }
            }
        }
        C0966M c0966m = this.f9650r;
        ArrayList arrayList = c0966m.f12001c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList.get(size);
            if (abstractC0974V != null) {
                int i11 = abstractC0974V.f12034c;
                if (i11 >= i8) {
                    abstractC0974V.l(-i7, z5);
                } else if (i11 >= i) {
                    abstractC0974V.a(8);
                    c0966m.e(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void P() {
        this.f9625Q++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Q(boolean z5) {
        int i;
        AccessibilityManager accessibilityManager;
        int i7 = this.f9625Q - 1;
        this.f9625Q = i7;
        if (i7 < 1) {
            this.f9625Q = 0;
            if (z5) {
                int i8 = this.f9621M;
                this.f9621M = 0;
                if (i8 != 0 && (accessibilityManager = this.f9622N) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i8);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.f9612F0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList.get(size);
                    if (abstractC0974V.f12032a.getParent() == this && !abstractC0974V.o() && (i = abstractC0974V.f12045q) != -1) {
                        View view = abstractC0974V.f12032a;
                        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                        view.setImportantForAccessibility(i);
                        abstractC0974V.f12045q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9634c0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f9634c0 = motionEvent.getPointerId(i);
            int x6 = (int) (motionEvent.getX(i) + 0.5f);
            this.f9638g0 = x6;
            this.f9636e0 = x6;
            int y6 = (int) (motionEvent.getY(i) + 0.5f);
            this.f9639h0 = y6;
            this.f9637f0 = y6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S() {
        if (this.f9665y0 || !this.f9611F) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        postOnAnimation(this.f9614G0);
        this.f9665y0 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void T(AbstractC0974V abstractC0974V, C0231t c0231t) {
        abstractC0974V.j &= -8193;
        boolean z5 = this.f9653s0.f12019h;
        m mVar = this.f9658v;
        if (z5 && abstractC0974V.k() && !abstractC0974V.h() && !abstractC0974V.o()) {
            ((C1566q) mVar.f8313s).e(G(abstractC0974V), abstractC0974V);
        }
        Q q7 = (Q) mVar.f8312r;
        g0 g0VarA = (g0) q7.get(abstractC0974V);
        if (g0VarA == null) {
            g0VarA = g0.a();
            q7.put(abstractC0974V, g0VarA);
        }
        g0VarA.f12118b = c0231t;
        g0VarA.f12117a |= 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void U(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f9662x;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0961H) {
            C0961H c0961h = (C0961H) layoutParams;
            if (!c0961h.f11991c) {
                Rect rect2 = c0961h.f11990b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f9604B.k0(this, view, this.f9662x, !this.f9615H, view2 == null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void V() {
        VelocityTracker velocityTracker = this.f9635d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        c0(0);
        EdgeEffect edgeEffect = this.f9628T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f9628T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f9629U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f9629U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9630V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f9630V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9631W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f9631W.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W(int r18, int r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r19
            r0.m()
            d2.z r1 = r0.f9602A
            int[] r7 = r0.f9610E0
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L21
            r7[r11] = r11
            r7[r10] = r11
            r0.X(r8, r9, r7)
            r1 = r7[r11]
            r2 = r7[r10]
            int r3 = r8 - r1
            int r4 = r9 - r2
            goto L25
        L21:
            r1 = r11
            r2 = r1
            r3 = r2
            r4 = r3
        L25:
            java.util.ArrayList r5 = r0.f9606C
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L30
            r0.invalidate()
        L30:
            r7[r11] = r11
            r7[r10] = r11
            int[] r5 = r0.f9607C0
            r6 = 0
            r0.s(r1, r2, r3, r4, r5, r6, r7)
            r5 = r7[r11]
            int r3 = r3 - r5
            r6 = r7[r10]
            int r4 = r4 - r6
            if (r5 != 0) goto L47
            if (r6 == 0) goto L45
            goto L47
        L45:
            r5 = r11
            goto L48
        L47:
            r5 = r10
        L48:
            int r6 = r0.f9638g0
            int[] r7 = r0.f9607C0
            r12 = r7[r11]
            int r6 = r6 - r12
            r0.f9638g0 = r6
            int r6 = r0.f9639h0
            r7 = r7[r10]
            int r6 = r6 - r7
            r0.f9639h0 = r6
            int[] r6 = r0.D0
            r13 = r6[r11]
            int r13 = r13 + r12
            r6[r11] = r13
            r12 = r6[r10]
            int r12 = r12 + r7
            r6[r10] = r12
            int r6 = r0.getOverScrollMode()
            r7 = 2
            if (r6 == r7) goto L10e
            if (r20 == 0) goto L76
            int r6 = r20.getSource()
            r7 = 8194(0x2002, float:1.1482E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L7a
        L76:
            r16 = r10
            goto L10a
        L7a:
            float r6 = r20.getX()
            float r3 = (float) r3
            float r7 = r20.getY()
            float r4 = (float) r4
            r12 = 0
            int r13 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 >= 0) goto La7
            r0.v()
            android.widget.EdgeEffect r13 = r0.f9628T
            float r15 = -r3
            r16 = r10
            int r10 = r0.getWidth()
            float r10 = (float) r10
            float r15 = r15 / r10
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r7 = r7 / r10
            float r7 = r14 - r7
            A1.c.a(r13, r15, r7)
        La4:
            r7 = r16
            goto Lc4
        La7:
            r16 = r10
            int r10 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r10 <= 0) goto Lc3
            r0.w()
            android.widget.EdgeEffect r10 = r0.f9630V
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r13 = r3 / r13
            int r15 = r0.getHeight()
            float r15 = (float) r15
            float r7 = r7 / r15
            A1.c.a(r10, r13, r7)
            goto La4
        Lc3:
            r7 = r11
        Lc4:
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 >= 0) goto Le0
            r0.x()
            android.widget.EdgeEffect r7 = r0.f9629U
            float r10 = -r4
            int r13 = r0.getHeight()
            float r13 = (float) r13
            float r10 = r10 / r13
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r6 = r6 / r13
            A1.c.a(r7, r10, r6)
        Ldd:
            r7 = r16
            goto Lfb
        Le0:
            int r10 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r10 <= 0) goto Lfb
            r0.u()
            android.widget.EdgeEffect r7 = r0.f9631W
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r10 = r4 / r10
            int r13 = r0.getWidth()
            float r13 = (float) r13
            float r6 = r6 / r13
            float r14 = r14 - r6
            A1.c.a(r7, r10, r14)
            goto Ldd
        Lfb:
            if (r7 != 0) goto L105
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L105
            int r3 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r3 == 0) goto L10a
        L105:
            java.util.WeakHashMap r3 = w1.AbstractC1835K.f18149a
            r0.postInvalidateOnAnimation()
        L10a:
            r17.l(r18, r19)
            goto L110
        L10e:
            r16 = r10
        L110:
            if (r1 != 0) goto L114
            if (r2 == 0) goto L117
        L114:
            r0.t(r1, r2)
        L117:
            boolean r3 = r0.awakenScrollBars()
            if (r3 != 0) goto L120
            r0.invalidate()
        L120:
            if (r5 != 0) goto L128
            if (r1 != 0) goto L128
            if (r2 == 0) goto L127
            goto L128
        L127:
            return r11
        L128:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W(int, int, android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(int i, int i7, int[] iArr) {
        AbstractC0974V abstractC0974V;
        a0();
        P();
        int i8 = g.f16278a;
        Trace.beginSection("RV Scroll");
        C0971S c0971s = this.f9653s0;
        z(c0971s);
        C0966M c0966m = this.f9650r;
        int iM0 = i != 0 ? this.f9604B.m0(i, c0966m, c0971s) : 0;
        int iO0 = i7 != 0 ? this.f9604B.o0(i7, c0966m, c0971s) : 0;
        Trace.endSection();
        G0 g02 = this.f9656u;
        int iV = g02.v();
        for (int i9 = 0; i9 < iV; i9++) {
            View viewU = g02.u(i9);
            AbstractC0974V abstractC0974VH = H(viewU);
            if (abstractC0974VH != null && (abstractC0974V = abstractC0974VH.i) != null) {
                View view = abstractC0974V.f12032a;
                int left = viewU.getLeft();
                int top = viewU.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        Q(true);
        b0(false);
        if (iArr != null) {
            iArr[0] = iM0;
            iArr[1] = iO0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Y(int i) {
        C0994t c0994t;
        if (this.f9619K) {
            return;
        }
        setScrollState(0);
        RunnableC0973U runnableC0973U = this.f9647p0;
        runnableC0973U.f12030w.removeCallbacks(runnableC0973U);
        runnableC0973U.f12026s.abortAnimation();
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && (c0994t = abstractC0960G.f11981e) != null) {
            c0994t.i();
        }
        AbstractC0960G abstractC0960G2 = this.f9604B;
        if (abstractC0960G2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC0960G2.n0(i);
            awakenScrollBars();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void Z(int i, int i7, boolean z5) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9619K) {
            return;
        }
        if (!abstractC0960G.d()) {
            i = 0;
        }
        if (!this.f9604B.e()) {
            i7 = 0;
        }
        if (i == 0 && i7 == 0) {
            return;
        }
        if (z5) {
            int i8 = i != 0 ? 1 : 0;
            if (i7 != 0) {
                i8 |= 2;
            }
            getScrollingChildHelper().g(i8, 1);
        }
        this.f9647p0.b(i, i7, Integer.MIN_VALUE, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0() {
        int i = this.f9617I + 1;
        this.f9617I = i;
        if (i != 1 || this.f9619K) {
            return;
        }
        this.f9618J = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i7) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null) {
            abstractC0960G.getClass();
        }
        super.addFocusables(arrayList, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(boolean z5) {
        if (this.f9617I < 1) {
            this.f9617I = 1;
        }
        if (!z5 && !this.f9619K) {
            this.f9618J = false;
        }
        if (this.f9617I == 1) {
            if (z5 && this.f9618J && !this.f9619K && this.f9604B != null && this.f9602A != null) {
                o();
            }
            if (!this.f9619K) {
                this.f9618J = false;
            }
        }
        this.f9617I--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c0(int i) {
        getScrollingChildHelper().h(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0961H) && this.f9604B.f((C0961H) layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && abstractC0960G.d()) {
            return this.f9604B.j(this.f9653s0);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && abstractC0960G.d()) {
            return this.f9604B.k(this.f9653s0);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && abstractC0960G.d()) {
            return this.f9604B.l(this.f9653s0);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && abstractC0960G.e()) {
            return this.f9604B.m(this.f9653s0);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && abstractC0960G.e()) {
            return this.f9604B.n(this.f9653s0);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && abstractC0960G.e()) {
            return this.f9604B.o(this.f9653s0);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f7, boolean z5) {
        return getScrollingChildHelper().a(f, f7, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f7) {
        return getScrollingChildHelper().b(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i7, 0, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i7, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().d(i, i7, i8, i9, iArr, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z5;
        super.draw(canvas);
        ArrayList arrayList = this.f9606C;
        int size = arrayList.size();
        boolean z6 = false;
        for (int i = 0; i < size; i++) {
            ((AbstractC0958E) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.f9628T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f9660w ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f9628T;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f9629U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f9660w) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f9629U;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f9630V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f9660w ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f9630V;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f9631W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f9660w) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f9631W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(iSave4);
        }
        if ((z5 || this.f9632a0 == null || arrayList.size() <= 0 || !this.f9632a0.f()) ? z5 : true) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(AbstractC0974V abstractC0974V) {
        View view = abstractC0974V.f12032a;
        boolean z5 = view.getParent() == this;
        this.f9650r.j(H(view));
        if (abstractC0974V.j()) {
            this.f9656u.m(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z5) {
            this.f9656u.l(view, -1, true);
            return;
        }
        G0 g02 = this.f9656u;
        int iIndexOfChild = ((C0999y) g02.f234r).f12221a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            ((T) g02.f235s).k(iIndexOfChild);
            g02.I(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[ADDED_TO_REGION] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            d2.G r3 = r0.f9604B
            r3.getClass()
            d2.z r3 = r0.f9602A
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L21
            d2.G r3 = r0.f9604B
            if (r3 == 0) goto L21
            boolean r3 = r0.L()
            if (r3 != 0) goto L21
            boolean r3 = r0.f9619K
            if (r3 != 0) goto L21
            r3 = r4
            goto L22
        L21:
            r3 = r5
        L22:
            android.view.FocusFinder r6 = android.view.FocusFinder.getInstance()
            d2.S r7 = r0.f9653s0
            d2.M r8 = r0.f9650r
            r9 = 17
            r11 = 33
            r13 = 0
            r14 = 2
            if (r3 == 0) goto L93
            if (r2 == r14) goto L36
            if (r2 != r4) goto L93
        L36:
            d2.G r3 = r0.f9604B
            boolean r3 = r3.e()
            if (r3 == 0) goto L4c
            if (r2 != r14) goto L43
            r3 = 130(0x82, float:1.82E-43)
            goto L44
        L43:
            r3 = r11
        L44:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L4c
            r3 = r4
            goto L4d
        L4c:
            r3 = r5
        L4d:
            if (r3 != 0) goto L77
            d2.G r15 = r0.f9604B
            boolean r15 = r15.d()
            if (r15 == 0) goto L77
            d2.G r3 = r0.f9604B
            int r3 = r3.C()
            if (r3 != r4) goto L61
            r3 = r4
            goto L62
        L61:
            r3 = r5
        L62:
            if (r2 != r14) goto L66
            r15 = r4
            goto L67
        L66:
            r15 = r5
        L67:
            r3 = r3 ^ r15
            if (r3 == 0) goto L6d
            r3 = 66
            goto L6e
        L6d:
            r3 = r9
        L6e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r3)
            if (r3 != 0) goto L76
            r3 = r4
            goto L77
        L76:
            r3 = r5
        L77:
            if (r3 == 0) goto L8e
            r0.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto L83
            goto La4
        L83:
            r0.a0()
            d2.G r3 = r0.f9604B
            r3.S(r1, r2, r8, r7)
            r0.b0(r5)
        L8e:
            android.view.View r3 = r6.findNextFocus(r0, r1, r2)
            goto Lb3
        L93:
            android.view.View r6 = r6.findNextFocus(r0, r1, r2)
            if (r6 != 0) goto Lb2
            if (r3 == 0) goto Lb2
            r0.m()
            android.view.View r3 = r16.A(r17)
            if (r3 != 0) goto La5
        La4:
            return r13
        La5:
            r0.a0()
            d2.G r3 = r0.f9604B
            android.view.View r3 = r3.S(r1, r2, r8, r7)
            r0.b0(r5)
            goto Lb3
        Lb2:
            r3 = r6
        Lb3:
            if (r3 == 0) goto Lca
            boolean r6 = r3.hasFocusable()
            if (r6 != 0) goto Lca
            android.view.View r4 = r0.getFocusedChild()
            if (r4 != 0) goto Lc6
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        Lc6:
            r0.U(r3, r13)
            return r1
        Lca:
            if (r3 == 0) goto L161
            if (r3 != r0) goto Ld0
            goto L161
        Ld0:
            android.view.View r6 = r0.A(r3)
            if (r6 != 0) goto Ld9
            r4 = r5
            goto L196
        Ld9:
            if (r1 != 0) goto Ldd
            goto L196
        Ldd:
            android.view.View r6 = r16.A(r17)
            if (r6 != 0) goto Le5
            goto L196
        Le5:
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            android.graphics.Rect r8 = r0.f9662x
            r8.set(r5, r5, r6, r7)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            android.graphics.Rect r13 = r0.f9664y
            r13.set(r5, r5, r6, r7)
            r0.offsetDescendantRectToMyCoords(r1, r8)
            r0.offsetDescendantRectToMyCoords(r3, r13)
            d2.G r6 = r0.f9604B
            int r6 = r6.C()
            if (r6 != r4) goto L10f
            r6 = -1
            goto L110
        L10f:
            r6 = r4
        L110:
            int r15 = r8.left
            int r5 = r13.left
            if (r15 < r5) goto L11a
            int r7 = r8.right
            if (r7 > r5) goto L122
        L11a:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 >= r12) goto L122
            r5 = r4
            goto L12f
        L122:
            int r7 = r8.right
            int r12 = r13.right
            if (r7 > r12) goto L12a
            if (r15 < r12) goto L12e
        L12a:
            if (r15 <= r5) goto L12e
            r5 = -1
            goto L12f
        L12e:
            r5 = 0
        L12f:
            int r7 = r8.top
            int r12 = r13.top
            if (r7 < r12) goto L139
            int r15 = r8.bottom
            if (r15 > r12) goto L141
        L139:
            int r15 = r8.bottom
            int r10 = r13.bottom
            if (r15 >= r10) goto L141
            r7 = r4
            goto L14e
        L141:
            int r8 = r8.bottom
            int r10 = r13.bottom
            if (r8 > r10) goto L149
            if (r7 < r10) goto L14d
        L149:
            if (r7 <= r12) goto L14d
            r7 = -1
            goto L14e
        L14d:
            r7 = 0
        L14e:
            if (r2 == r4) goto L18f
            if (r2 == r14) goto L187
            if (r2 == r9) goto L184
            if (r2 == r11) goto L181
            r6 = 66
            if (r2 == r6) goto L17e
            r6 = 130(0x82, float:1.82E-43)
            if (r2 != r6) goto L163
            if (r7 <= 0) goto L161
            goto L196
        L161:
            r4 = 0
            goto L196
        L163:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid direction: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L17e:
            if (r5 <= 0) goto L161
            goto L196
        L181:
            if (r7 >= 0) goto L161
            goto L196
        L184:
            if (r5 >= 0) goto L161
            goto L196
        L187:
            if (r7 > 0) goto L196
            if (r7 != 0) goto L161
            int r5 = r5 * r6
            if (r5 < 0) goto L161
            goto L196
        L18f:
            if (r7 < 0) goto L196
            if (r7 != 0) goto L161
            int r5 = r5 * r6
            if (r5 > 0) goto L161
        L196:
            if (r4 == 0) goto L199
            return r3
        L199:
            android.view.View r1 = super.focusSearch(r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(AbstractC0958E abstractC0958E) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null) {
            abstractC0960G.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.f9606C;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC0958E);
        N();
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null) {
            return abstractC0960G.r();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null) {
            return abstractC0960G.s(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1000z getAdapter() {
        return this.f9602A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getBaseline() {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G == null) {
            return super.getBaseline();
        }
        abstractC0960G.getClass();
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i7) {
        return super.getChildDrawingOrder(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f9660w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X getCompatAccessibilityDelegate() {
        return this.f9667z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0956C getEdgeEffectFactory() {
        return this.f9627S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0957D getItemAnimator() {
        return this.f9632a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getItemDecorationCount() {
        return this.f9606C.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0960G getLayoutManager() {
        return this.f9604B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxFlingVelocity() {
        return this.f9643l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMinFlingVelocity() {
        return this.f9642k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getNanoTime() {
        return System.nanoTime();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0962I getOnFlingListener() {
        return this.f9641j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getPreserveFocusAfterLayout() {
        return this.f9646o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0965L getRecycledViewPool() {
        return this.f9650r.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getScrollState() {
        return this.f9633b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(AbstractC0963J abstractC0963J) {
        if (this.f9657u0 == null) {
            this.f9657u0 = new ArrayList();
        }
        this.f9657u0.add(abstractC0963J);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(String str) {
        if (L()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
        }
        if (this.f9626R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f9611F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f9619K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f18222d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        int iG = this.f9656u.G();
        for (int i = 0; i < iG; i++) {
            AbstractC0974V abstractC0974VI = I(this.f9656u.F(i));
            if (!abstractC0974VI.o()) {
                abstractC0974VI.f12035d = -1;
                abstractC0974VI.f12037g = -1;
            }
        }
        C0966M c0966m = this.f9650r;
        ArrayList arrayList = c0966m.f11999a;
        ArrayList arrayList2 = c0966m.f12001c;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList2.get(i7);
            abstractC0974V.f12035d = -1;
            abstractC0974V.f12037g = -1;
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            AbstractC0974V abstractC0974V2 = (AbstractC0974V) arrayList.get(i8);
            abstractC0974V2.f12035d = -1;
            abstractC0974V2.f12037g = -1;
        }
        ArrayList arrayList3 = c0966m.f12000b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i9 = 0; i9 < size3; i9++) {
                AbstractC0974V abstractC0974V3 = (AbstractC0974V) c0966m.f12000b.get(i9);
                abstractC0974V3.f12035d = -1;
                abstractC0974V3.f12037g = -1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, int i7) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f9628T;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.f9628T.onRelease();
            zIsFinished = this.f9628T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f9630V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f9630V.onRelease();
            zIsFinished |= this.f9630V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f9629U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i7 > 0) {
            this.f9629U.onRelease();
            zIsFinished |= this.f9629U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f9631W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i7 < 0) {
            this.f9631W.onRelease();
            zIsFinished |= this.f9631W.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        if (!this.f9615H || this.f9623O) {
            int i = g.f16278a;
            Trace.beginSection("RV FullInvalidate");
            o();
            Trace.endSection();
            return;
        }
        l lVar = this.f9654t;
        if (lVar.l()) {
            lVar.getClass();
            if (lVar.l()) {
                int i7 = g.f16278a;
                Trace.beginSection("RV FullInvalidate");
                o();
                Trace.endSection();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i, int i7) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        setMeasuredDimension(AbstractC0960G.g(i, paddingRight, getMinimumWidth()), AbstractC0960G.g(i7, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:231:0x0284 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0399  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r21 = this;
            r0 = r21
            d2.z r1 = r0.f9602A
            java.lang.String r2 = "RecyclerView"
            if (r1 != 0) goto Le
            java.lang.String r1 = "No adapter attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        Le:
            d2.G r1 = r0.f9604B
            if (r1 != 0) goto L18
            java.lang.String r1 = "No layout manager attached; skipping layout"
            android.util.Log.e(r2, r1)
            return
        L18:
            d2.S r1 = r0.f9653s0
            r3 = 0
            r1.i = r3
            int r4 = r1.f12016d
            r5 = 1
            if (r4 != r5) goto L2e
            r0.p()
            d2.G r4 = r0.f9604B
            r4.p0(r0)
            r0.q()
            goto L68
        L2e:
            L0.l r4 = r0.f9654t
            java.lang.Object r6 = r4.f3126c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L45
            java.lang.Object r4 = r4.f3124a
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L45
            goto L60
        L45:
            d2.G r4 = r0.f9604B
            int r4 = r4.f11987n
            int r6 = r0.getWidth()
            if (r4 != r6) goto L60
            d2.G r4 = r0.f9604B
            int r4 = r4.f11988o
            int r6 = r0.getHeight()
            if (r4 == r6) goto L5a
            goto L60
        L5a:
            d2.G r4 = r0.f9604B
            r4.p0(r0)
            goto L68
        L60:
            d2.G r4 = r0.f9604B
            r4.p0(r0)
            r0.q()
        L68:
            r4 = 4
            r1.a(r4)
            r0.a0()
            r0.P()
            r1.f12016d = r5
            boolean r6 = r1.j
            d2.M r8 = r0.f9650r
            Z.m r9 = r0.f9658v
            if (r6 == 0) goto L296
            B0.G0 r6 = r0.f9656u
            int r6 = r6.v()
            int r6 = r6 - r5
        L83:
            if (r6 < 0) goto L1c1
            B0.G0 r10 = r0.f9656u
            android.view.View r10 = r10.u(r6)
            d2.V r10 = I(r10)
            boolean r11 = r10.o()
            if (r11 == 0) goto L99
            r17 = r5
            goto L1bb
        L99:
            long r11 = r0.G(r10)
            d2.D r13 = r0.f9632a0
            r13.getClass()
            M.t r13 = new M.t
            r13.<init>()
            r13.a(r10)
            java.lang.Object r14 = r9.f8313s
            r.q r14 = (r.C1566q) r14
            java.lang.Object r15 = r9.f8312r
            r.Q r15 = (r.Q) r15
            java.lang.Object r14 = r14.b(r11)
            d2.V r14 = (d2.AbstractC0974V) r14
            if (r14 == 0) goto L1b6
            boolean r16 = r14.o()
            if (r16 != 0) goto L1b6
            java.lang.Object r16 = r15.get(r14)
            r17 = r5
            r5 = r16
            d2.g0 r5 = (d2.g0) r5
            if (r5 == 0) goto Ld5
            int r5 = r5.f12117a
            r5 = r5 & 1
            if (r5 == 0) goto Ld5
            r5 = r17
            goto Ld6
        Ld5:
            r5 = r3
        Ld6:
            java.lang.Object r15 = r15.get(r10)
            d2.g0 r15 = (d2.g0) r15
            if (r15 == 0) goto Le7
            int r15 = r15.f12117a
            r15 = r15 & 1
            if (r15 == 0) goto Le7
            r15 = r17
            goto Le8
        Le7:
            r15 = r3
        Le8:
            if (r5 == 0) goto Lf1
            if (r14 != r10) goto Lf1
            r9.g(r10, r13)
            goto L1bb
        Lf1:
            M.t r7 = r9.B(r14, r4)
            r9.g(r10, r13)
            r13 = 8
            M.t r13 = r9.B(r10, r13)
            if (r7 != 0) goto L18e
            B0.G0 r5 = r0.f9656u
            int r5 = r5.v()
            r7 = r3
        L107:
            if (r7 >= r5) goto L16d
            B0.G0 r13 = r0.f9656u
            android.view.View r13 = r13.u(r7)
            d2.V r13 = I(r13)
            if (r13 != r10) goto L116
            goto L16a
        L116:
            long r18 = r0.G(r13)
            int r15 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r15 != 0) goto L16a
            d2.z r1 = r0.f9602A
            java.lang.String r2 = " \n View Holder 2:"
            if (r1 == 0) goto L149
            boolean r1 = r1.f12223b
            if (r1 == 0) goto L149
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L149:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r3.<init>(r4)
            r3.append(r13)
            r3.append(r2)
            r3.append(r10)
            java.lang.String r2 = r0.y()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L16a:
            int r7 = r7 + 1
            goto L107
        L16d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r5.<init>(r7)
            r5.append(r14)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r5.append(r7)
            r5.append(r10)
            java.lang.String r7 = r0.y()
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r2, r5)
            goto L1bb
        L18e:
            r14.n(r3)
            if (r5 == 0) goto L196
            r0.f(r14)
        L196:
            if (r14 == r10) goto L1aa
            if (r15 == 0) goto L19d
            r0.f(r10)
        L19d:
            r14.f12038h = r10
            r0.f(r14)
            r8.j(r14)
            r10.n(r3)
            r10.i = r14
        L1aa:
            d2.D r5 = r0.f9632a0
            boolean r5 = r5.a(r14, r10, r7, r13)
            if (r5 == 0) goto L1bb
            r0.S()
            goto L1bb
        L1b6:
            r17 = r5
            r9.g(r10, r13)
        L1bb:
            int r6 = r6 + (-1)
            r5 = r17
            goto L83
        L1c1:
            r17 = r5
            java.lang.Object r2 = r9.f8312r
            r.Q r2 = (r.Q) r2
            int r4 = r2.f16166s
            int r4 = r4 + (-1)
        L1cb:
            if (r4 < 0) goto L294
            java.lang.Object r5 = r2.f(r4)
            r11 = r5
            d2.V r11 = (d2.AbstractC0974V) r11
            java.lang.Object r5 = r2.g(r4)
            d2.g0 r5 = (d2.g0) r5
            int r6 = r5.f12117a
            r7 = r6 & 3
            d2.x r10 = r0.f9616H0
            r12 = 3
            if (r7 != r12) goto L1f1
            androidx.recyclerview.widget.RecyclerView r6 = r10.f12220a
            d2.G r7 = r6.f9604B
            android.view.View r10 = r11.f12032a
            d2.M r6 = r6.f9650r
            r7.i0(r10, r6)
        L1ee:
            r7 = 0
            goto L284
        L1f1:
            r7 = r6 & 1
            if (r7 == 0) goto L20b
            M.t r6 = r5.f12118b
            if (r6 != 0) goto L205
            androidx.recyclerview.widget.RecyclerView r6 = r10.f12220a
            d2.G r7 = r6.f9604B
            android.view.View r10 = r11.f12032a
            d2.M r6 = r6.f9650r
            r7.i0(r10, r6)
            goto L1ee
        L205:
            M.t r7 = r5.f12119c
            r10.g(r11, r6, r7)
            goto L1ee
        L20b:
            r7 = r6 & 14
            r12 = 14
            if (r7 != r12) goto L219
            M.t r6 = r5.f12118b
            M.t r7 = r5.f12119c
            r10.f(r11, r6, r7)
            goto L1ee
        L219:
            r7 = r6 & 12
            r12 = 12
            if (r7 != r12) goto L26b
            M.t r6 = r5.f12118b
            M.t r7 = r5.f12119c
            r10.getClass()
            r11.n(r3)
            androidx.recyclerview.widget.RecyclerView r10 = r10.f12220a
            boolean r12 = r10.f9623O
            if (r12 == 0) goto L23b
            d2.D r12 = r10.f9632a0
            boolean r6 = r12.a(r11, r11, r6, r7)
            if (r6 == 0) goto L269
            r10.S()
            goto L269
        L23b:
            d2.D r12 = r10.f9632a0
            d2.h r12 = (d2.C0982h) r12
            r12.getClass()
            int r13 = r6.f3616a
            int r14 = r7.f3616a
            if (r13 != r14) goto L255
            int r15 = r6.f3617b
            int r3 = r7.f3617b
            if (r15 == r3) goto L24f
            goto L255
        L24f:
            r12.c(r11)
            r3 = r10
            r6 = 0
            goto L264
        L255:
            int r3 = r6.f3617b
            int r15 = r7.f3617b
            r20 = r13
            r13 = r3
            r3 = r10
            r10 = r12
            r12 = r20
            boolean r6 = r10.g(r11, r12, r13, r14, r15)
        L264:
            if (r6 == 0) goto L269
            r3.S()
        L269:
            r3 = 0
            goto L1ee
        L26b:
            r3 = r6 & 4
            if (r3 == 0) goto L277
            M.t r3 = r5.f12118b
            r7 = 0
            r10.g(r11, r3, r7)
        L275:
            r3 = 0
            goto L284
        L277:
            r7 = 0
            r3 = r6 & 8
            if (r3 == 0) goto L275
            M.t r3 = r5.f12118b
            M.t r6 = r5.f12119c
            r10.f(r11, r3, r6)
            goto L275
        L284:
            r5.f12117a = r3
            r5.f12118b = r7
            r5.f12119c = r7
            b1.d r3 = d2.g0.f12116d
            r3.c(r5)
            int r4 = r4 + (-1)
            r3 = 0
            goto L1cb
        L294:
            r7 = 0
            goto L299
        L296:
            r17 = r5
            goto L294
        L299:
            d2.G r2 = r0.f9604B
            r2.h0(r8)
            int r2 = r1.f12017e
            r1.f12014b = r2
            r3 = 0
            r0.f9623O = r3
            r0.f9624P = r3
            r1.j = r3
            r1.f12020k = r3
            d2.G r2 = r0.f9604B
            r2.f = r3
            java.util.ArrayList r2 = r8.f12000b
            if (r2 == 0) goto L2b6
            r2.clear()
        L2b6:
            d2.G r2 = r0.f9604B
            boolean r4 = r2.f11984k
            if (r4 == 0) goto L2c3
            r2.j = r3
            r2.f11984k = r3
            r8.k()
        L2c3:
            d2.G r2 = r0.f9604B
            r2.c0(r1)
            r2 = r17
            r0.Q(r2)
            r0.b0(r3)
            java.lang.Object r4 = r9.f8312r
            r.Q r4 = (r.Q) r4
            r4.clear()
            java.lang.Object r4 = r9.f8313s
            r.q r4 = (r.C1566q) r4
            r4.a()
            int[] r4 = r0.f9603A0
            r5 = r4[r3]
            r6 = r4[r2]
            r0.C(r4)
            r8 = r4[r3]
            if (r8 != r5) goto L2f2
            r4 = r4[r2]
            if (r4 == r6) goto L2f0
            goto L2f2
        L2f0:
            r2 = r3
            goto L2f3
        L2f2:
            r2 = 1
        L2f3:
            if (r2 == 0) goto L2f8
            r0.t(r3, r3)
        L2f8:
            boolean r2 = r0.f9646o0
            r4 = -1
            r6 = -1
            if (r2 == 0) goto L3f8
            d2.z r2 = r0.f9602A
            if (r2 == 0) goto L3f8
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L3f8
            int r2 = r0.getDescendantFocusability()
            r8 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r8) goto L3f8
            int r2 = r0.getDescendantFocusability()
            r8 = 131072(0x20000, float:1.83671E-40)
            if (r2 != r8) goto L321
            boolean r2 = r0.isFocused()
            if (r2 == 0) goto L321
            goto L3f8
        L321:
            boolean r2 = r0.isFocused()
            if (r2 != 0) goto L339
            android.view.View r2 = r0.getFocusedChild()
            B0.G0 r8 = r0.f9656u
            java.lang.Object r8 = r8.f236t
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L339
            goto L3f8
        L339:
            long r8 = r1.f12022m
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 == 0) goto L37f
            d2.z r2 = r0.f9602A
            boolean r2 = r2.f12223b
            if (r2 == 0) goto L37f
            if (r2 != 0) goto L348
            goto L37f
        L348:
            B0.G0 r2 = r0.f9656u
            int r2 = r2.G()
            r10 = r3
            r11 = r7
        L350:
            if (r10 >= r2) goto L380
            B0.G0 r12 = r0.f9656u
            android.view.View r12 = r12.F(r10)
            d2.V r12 = I(r12)
            if (r12 == 0) goto L37c
            boolean r13 = r12.h()
            if (r13 != 0) goto L37c
            long r13 = r12.f12036e
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 != 0) goto L37c
            android.view.View r11 = r12.f12032a
            B0.G0 r13 = r0.f9656u
            java.lang.Object r13 = r13.f236t
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            boolean r11 = r13.contains(r11)
            if (r11 == 0) goto L37a
            r11 = r12
            goto L37c
        L37a:
            r11 = r12
            goto L380
        L37c:
            int r10 = r10 + 1
            goto L350
        L37f:
            r11 = r7
        L380:
            if (r11 == 0) goto L399
            android.view.View r2 = r11.f12032a
            B0.G0 r8 = r0.f9656u
            java.lang.Object r8 = r8.f236t
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r8 = r8.contains(r2)
            if (r8 != 0) goto L399
            boolean r8 = r2.hasFocusable()
            if (r8 != 0) goto L397
            goto L399
        L397:
            r7 = r2
            goto L3df
        L399:
            B0.G0 r2 = r0.f9656u
            int r2 = r2.v()
            if (r2 <= 0) goto L3df
            int r2 = r1.f12021l
            if (r2 == r6) goto L3a6
            r3 = r2
        L3a6:
            int r2 = r1.b()
            r8 = r3
        L3ab:
            if (r8 >= r2) goto L3c1
            d2.V r9 = r0.E(r8)
            if (r9 != 0) goto L3b4
            goto L3c1
        L3b4:
            android.view.View r9 = r9.f12032a
            boolean r10 = r9.hasFocusable()
            if (r10 == 0) goto L3be
            r7 = r9
            goto L3df
        L3be:
            int r8 = r8 + 1
            goto L3ab
        L3c1:
            int r2 = java.lang.Math.min(r2, r3)
            r17 = 1
            int r2 = r2 + (-1)
        L3c9:
            if (r2 < 0) goto L3df
            d2.V r3 = r0.E(r2)
            if (r3 != 0) goto L3d2
            goto L3df
        L3d2:
            android.view.View r3 = r3.f12032a
            boolean r8 = r3.hasFocusable()
            if (r8 == 0) goto L3dc
            r7 = r3
            goto L3df
        L3dc:
            int r2 = r2 + (-1)
            goto L3c9
        L3df:
            if (r7 == 0) goto L3f8
            int r2 = r1.f12023n
            long r8 = (long) r2
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L3f5
            android.view.View r2 = r7.findViewById(r2)
            if (r2 == 0) goto L3f5
            boolean r3 = r2.isFocusable()
            if (r3 == 0) goto L3f5
            r7 = r2
        L3f5:
            r7.requestFocus()
        L3f8:
            r1.f12022m = r4
            r1.f12021l = r6
            r1.f12023n = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f9625Q = r0
            r1 = 1
            r5.f9611F = r1
            boolean r2 = r5.f9615H
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = r1
            goto L16
        L15:
            r2 = r0
        L16:
            r5.f9615H = r2
            d2.G r2 = r5.f9604B
            if (r2 == 0) goto L21
            r2.f11982g = r1
            r2.Q(r5)
        L21:
            r5.f9665y0 = r0
            java.lang.ThreadLocal r0 = d2.RunnableC0987m.f12166u
            java.lang.Object r1 = r0.get()
            d2.m r1 = (d2.RunnableC0987m) r1
            r5.f9649q0 = r1
            if (r1 != 0) goto L6b
            d2.m r1 = new d2.m
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12168q = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12171t = r2
            r5.f9649q0 = r1
            java.util.WeakHashMap r1 = w1.AbstractC1835K.f18149a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5d
            if (r1 == 0) goto L5d
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5d
            goto L5f
        L5d:
            r1 = 1114636288(0x42700000, float:60.0)
        L5f:
            d2.m r2 = r5.f9649q0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f12170s = r3
            r0.set(r2)
        L6b:
            d2.m r0 = r5.f9649q0
            java.util.ArrayList r0 = r0.f12168q
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0994t c0994t;
        super.onDetachedFromWindow();
        AbstractC0957D abstractC0957D = this.f9632a0;
        if (abstractC0957D != null) {
            abstractC0957D.e();
        }
        setScrollState(0);
        RunnableC0973U runnableC0973U = this.f9647p0;
        runnableC0973U.f12030w.removeCallbacks(runnableC0973U);
        runnableC0973U.f12026s.abortAnimation();
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null && (c0994t = abstractC0960G.f11981e) != null) {
            c0994t.i();
        }
        this.f9611F = false;
        AbstractC0960G abstractC0960G2 = this.f9604B;
        if (abstractC0960G2 != null) {
            abstractC0960G2.f11982g = false;
            abstractC0960G2.R(this);
        }
        this.f9612F0.clear();
        removeCallbacks(this.f9614G0);
        this.f9658v.getClass();
        while (g0.f12116d.a() != null) {
        }
        RunnableC0987m runnableC0987m = this.f9649q0;
        if (runnableC0987m != null) {
            runnableC0987m.f12168q.remove(this);
            this.f9649q0 = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f9606C;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0958E) arrayList.get(i)).a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            d2.G r0 = r5.f9604B
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f9619K
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            d2.G r0 = r5.f9604B
            boolean r0 = r0.e()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            d2.G r3 = r5.f9604B
            boolean r3 = r3.d()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            d2.G r3 = r5.f9604B
            boolean r3 = r3.e()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            d2.G r3 = r5.f9604B
            boolean r3 = r3.d()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f9644m0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f9645n0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.W(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00c6 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (!this.f9619K) {
            this.f9609E = null;
            if (B(motionEvent)) {
                V();
                setScrollState(0);
                return true;
            }
            AbstractC0960G abstractC0960G = this.f9604B;
            if (abstractC0960G != null) {
                boolean zD = abstractC0960G.d();
                boolean zE = this.f9604B.e();
                if (this.f9635d0 == null) {
                    this.f9635d0 = VelocityTracker.obtain();
                }
                this.f9635d0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f9620L) {
                        this.f9620L = false;
                    }
                    this.f9634c0 = motionEvent.getPointerId(0);
                    int x6 = (int) (motionEvent.getX() + 0.5f);
                    this.f9638g0 = x6;
                    this.f9636e0 = x6;
                    int y6 = (int) (motionEvent.getY() + 0.5f);
                    this.f9639h0 = y6;
                    this.f9637f0 = y6;
                    if (this.f9633b0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        c0(1);
                    }
                    int[] iArr = this.D0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zD;
                    if (zE) {
                        i = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f9635d0.clear();
                    c0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f9634c0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f9634c0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x7 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y7 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f9633b0 != 1) {
                        int i7 = x7 - this.f9636e0;
                        int i8 = y7 - this.f9637f0;
                        if (!zD || Math.abs(i7) <= this.f9640i0) {
                            z5 = false;
                        } else {
                            this.f9638g0 = x7;
                            z5 = true;
                        }
                        if (zE && Math.abs(i8) > this.f9640i0) {
                            this.f9639h0 = y7;
                            z5 = true;
                        }
                        if (z5) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    V();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f9634c0 = motionEvent.getPointerId(actionIndex);
                    int x8 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f9638g0 = x8;
                    this.f9636e0 = x8;
                    int y8 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f9639h0 = y8;
                    this.f9637f0 = y8;
                } else if (actionMasked == 6) {
                    R(motionEvent);
                }
                if (this.f9633b0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int i10 = g.f16278a;
        Trace.beginSection("RV OnLayout");
        o();
        Trace.endSection();
        this.f9615H = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G == null) {
            n(i, i7);
            return;
        }
        boolean zL = abstractC0960G.L();
        C0971S c0971s = this.f9653s0;
        if (!zL) {
            if (this.f9613G) {
                this.f9604B.f11978b.n(i, i7);
                return;
            }
            if (c0971s.f12020k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            AbstractC1000z abstractC1000z = this.f9602A;
            if (abstractC1000z != null) {
                c0971s.f12017e = abstractC1000z.a();
            } else {
                c0971s.f12017e = 0;
            }
            a0();
            this.f9604B.f11978b.n(i, i7);
            b0(false);
            c0971s.f12018g = false;
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i7);
        this.f9604B.f11978b.n(i, i7);
        if ((mode == 1073741824 && mode2 == 1073741824) || this.f9602A == null) {
            return;
        }
        if (c0971s.f12016d == 1) {
            p();
        }
        this.f9604B.q0(i, i7);
        c0971s.i = true;
        q();
        this.f9604B.s0(i, i7);
        if (this.f9604B.v0()) {
            this.f9604B.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            c0971s.i = true;
            q();
            this.f9604B.s0(i, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0968O)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0968O c0968o = (C0968O) parcelable;
        this.f9652s = c0968o;
        super.onRestoreInstanceState(c0968o.f1163q);
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G == null || (parcelable2 = this.f9652s.f12006s) == null) {
            return;
        }
        abstractC0960G.d0(parcelable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0968O c0968o = new C0968O(super.onSaveInstanceState());
        C0968O c0968o2 = this.f9652s;
        if (c0968o2 != null) {
            c0968o.f12006s = c0968o2.f12006s;
            return c0968o;
        }
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null) {
            c0968o.f12006s = abstractC0960G.e0();
            return c0968o;
        }
        c0968o.f12006s = null;
        return c0968o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i7, int i8, int i9) {
        super.onSizeChanged(i, i7, i8, i9);
        if (i == i8 && i7 == i9) {
            return;
        }
        this.f9631W = null;
        this.f9629U = null;
        this.f9630V = null;
        this.f9628T = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:256:0x0415 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:97:0x01f9 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v12, resolved type: d2.G */
    /* JADX DEBUG: Multi-variable search result rejected for r9v20, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v25, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v31, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r9v32, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[PHI: r1
  0x01f8: PHI (r1v53 int) = (r1v38 int), (r1v57 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fb  */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            r30 = this;
            r0 = r30
            r6 = r31
            boolean r1 = r0.f9619K
            r7 = 0
            if (r1 != 0) goto Ld
            boolean r1 = r0.f9620L
            if (r1 == 0) goto L10
        Ld:
            r3 = r7
            goto L4a6
        L10:
            d2.k r1 = r0.f9609E
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 0
            r8 = 1
            if (r1 != 0) goto L28
            int r1 = r6.getAction()
            if (r1 != 0) goto L22
            r1 = r7
            goto L12d
        L22:
            boolean r1 = r30.B(r31)
            goto L12d
        L28:
            int r9 = r1.f12139b
            int r10 = r1.f12156v
            if (r10 != 0) goto L30
            goto L122
        L30:
            int r10 = r6.getAction()
            if (r10 != 0) goto L70
            float r9 = r6.getX()
            float r10 = r6.getY()
            boolean r9 = r1.d(r9, r10)
            float r10 = r6.getX()
            float r11 = r6.getY()
            boolean r10 = r1.c(r10, r11)
            if (r9 != 0) goto L52
            if (r10 == 0) goto L122
        L52:
            if (r10 == 0) goto L5f
            r1.f12157w = r8
            float r9 = r6.getX()
            int r9 = (int) r9
            float r9 = (float) r9
            r1.f12150p = r9
            goto L6b
        L5f:
            if (r9 == 0) goto L6b
            r1.f12157w = r4
            float r9 = r6.getY()
            int r9 = (int) r9
            float r9 = (float) r9
            r1.f12147m = r9
        L6b:
            r1.f(r4)
            goto L122
        L70:
            int r10 = r6.getAction()
            if (r10 != r8) goto L85
            int r10 = r1.f12156v
            if (r10 != r4) goto L85
            r1.f12147m = r5
            r1.f12150p = r5
            r1.f(r8)
            r1.f12157w = r7
            goto L122
        L85:
            int r10 = r6.getAction()
            if (r10 != r4) goto L122
            int r10 = r1.f12156v
            if (r10 != r4) goto L122
            r1.g()
            int r10 = r1.f12157w
            r11 = 1073741824(0x40000000, float:2.0)
            if (r10 != r8) goto Ldb
            float r10 = r6.getX()
            int[] r14 = r1.f12159y
            r14[r7] = r9
            int r12 = r1.f12151q
            int r12 = r12 - r9
            r14[r8] = r12
            float r13 = (float) r9
            float r12 = (float) r12
            float r10 = java.lang.Math.min(r12, r10)
            float r13 = java.lang.Math.max(r13, r10)
            int r10 = r1.f12149o
            float r10 = (float) r10
            float r10 = r10 - r13
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto Lbc
            goto Ldb
        Lbc:
            float r12 = r1.f12150p
            androidx.recyclerview.widget.RecyclerView r10 = r1.f12153s
            int r15 = r10.computeHorizontalScrollRange()
            androidx.recyclerview.widget.RecyclerView r10 = r1.f12153s
            int r16 = r10.computeHorizontalScrollOffset()
            int r10 = r1.f12151q
            r17 = r10
            int r10 = d2.C0985k.e(r12, r13, r14, r15, r16, r17)
            if (r10 == 0) goto Ld9
            androidx.recyclerview.widget.RecyclerView r12 = r1.f12153s
            r12.scrollBy(r10, r7)
        Ld9:
            r1.f12150p = r13
        Ldb:
            int r10 = r1.f12157w
            if (r10 != r4) goto L122
            float r10 = r6.getY()
            int[] r14 = r1.f12158x
            r14[r7] = r9
            int r12 = r1.f12152r
            int r12 = r12 - r9
            r14[r8] = r12
            float r9 = (float) r9
            float r12 = (float) r12
            float r10 = java.lang.Math.min(r12, r10)
            float r13 = java.lang.Math.max(r9, r10)
            int r9 = r1.f12146l
            float r9 = (float) r9
            float r9 = r9 - r13
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L103
            goto L122
        L103:
            float r12 = r1.f12147m
            androidx.recyclerview.widget.RecyclerView r9 = r1.f12153s
            int r15 = r9.computeVerticalScrollRange()
            androidx.recyclerview.widget.RecyclerView r9 = r1.f12153s
            int r16 = r9.computeVerticalScrollOffset()
            int r9 = r1.f12152r
            r17 = r9
            int r9 = d2.C0985k.e(r12, r13, r14, r15, r16, r17)
            if (r9 == 0) goto L120
            androidx.recyclerview.widget.RecyclerView r10 = r1.f12153s
            r10.scrollBy(r7, r9)
        L120:
            r1.f12147m = r13
        L122:
            int r1 = r6.getAction()
            if (r1 == r3) goto L12a
            if (r1 != r8) goto L12c
        L12a:
            r0.f9609E = r2
        L12c:
            r1 = r8
        L12d:
            if (r1 == 0) goto L136
            r0.V()
            r0.setScrollState(r7)
            return r8
        L136:
            d2.G r1 = r0.f9604B
            if (r1 != 0) goto L13c
            goto Ld
        L13c:
            boolean r9 = r1.d()
            d2.G r1 = r0.f9604B
            boolean r10 = r1.e()
            android.view.VelocityTracker r1 = r0.f9635d0
            if (r1 != 0) goto L150
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f9635d0 = r1
        L150:
            int r1 = r6.getActionMasked()
            int r11 = r6.getActionIndex()
            int[] r12 = r0.D0
            if (r1 != 0) goto L160
            r12[r8] = r7
            r12[r7] = r7
        L160:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r6)
            r14 = r12[r7]
            float r14 = (float) r14
            r15 = r12[r8]
            float r15 = (float) r15
            r13.offsetLocation(r14, r15)
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == 0) goto L474
            java.lang.String r15 = "RecyclerView"
            if (r1 == r8) goto L281
            if (r1 == r4) goto L1aa
            if (r1 == r3) goto L1a2
            r2 = 5
            if (r1 == r2) goto L186
            r2 = 6
            if (r1 == r2) goto L181
            goto L49b
        L181:
            r30.R(r31)
            goto L49b
        L186:
            int r1 = r6.getPointerId(r11)
            r0.f9634c0 = r1
            float r1 = r6.getX(r11)
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f9638g0 = r1
            r0.f9636e0 = r1
            float r1 = r6.getY(r11)
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f9639h0 = r1
            r0.f9637f0 = r1
            goto L49b
        L1a2:
            r0.V()
            r0.setScrollState(r7)
            goto L49b
        L1aa:
            int r1 = r0.f9634c0
            int r1 = r6.findPointerIndex(r1)
            if (r1 >= 0) goto L1cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Error processing scroll; pointer index for id "
            r1.<init>(r2)
            int r2 = r0.f9634c0
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r15, r1)
            return r7
        L1cb:
            float r2 = r6.getX(r1)
            float r2 = r2 + r14
            int r11 = (int) r2
            float r1 = r6.getY(r1)
            float r1 = r1 + r14
            int r14 = (int) r1
            int r1 = r0.f9638g0
            int r1 = r1 - r11
            int r2 = r0.f9639h0
            int r2 = r2 - r14
            int r3 = r0.f9633b0
            if (r3 == r8) goto L214
            if (r9 == 0) goto L1f8
            if (r1 <= 0) goto L1ed
            int r3 = r0.f9640i0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r7, r1)
            goto L1f4
        L1ed:
            int r3 = r0.f9640i0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r7, r1)
        L1f4:
            if (r1 == 0) goto L1f8
            r3 = r8
            goto L1f9
        L1f8:
            r3 = r7
        L1f9:
            if (r10 == 0) goto L20f
            if (r2 <= 0) goto L205
            int r4 = r0.f9640i0
            int r2 = r2 - r4
            int r2 = java.lang.Math.max(r7, r2)
            goto L20c
        L205:
            int r4 = r0.f9640i0
            int r2 = r2 + r4
            int r2 = java.lang.Math.min(r7, r2)
        L20c:
            if (r2 == 0) goto L20f
            r3 = r8
        L20f:
            if (r3 == 0) goto L214
            r0.setScrollState(r8)
        L214:
            r15 = r1
            r16 = r2
            int r1 = r0.f9633b0
            if (r1 != r8) goto L49b
            int[] r4 = r0.f9610E0
            r4[r7] = r7
            r4[r8] = r7
            if (r9 == 0) goto L225
            r1 = r15
            goto L226
        L225:
            r1 = r7
        L226:
            if (r10 == 0) goto L22b
            r2 = r16
            goto L22c
        L22b:
            r2 = r7
        L22c:
            int[] r5 = r0.f9607C0
            r3 = 0
            boolean r1 = r0.r(r1, r2, r3, r4, r5)
            int[] r2 = r0.f9607C0
            if (r1 == 0) goto L253
            r1 = r4[r7]
            int r15 = r15 - r1
            r1 = r4[r8]
            int r16 = r16 - r1
            r1 = r12[r7]
            r3 = r2[r7]
            int r1 = r1 + r3
            r12[r7] = r1
            r1 = r12[r8]
            r3 = r2[r8]
            int r1 = r1 + r3
            r12[r8] = r1
            android.view.ViewParent r1 = r0.getParent()
            r1.requestDisallowInterceptTouchEvent(r8)
        L253:
            r1 = r16
            r3 = r2[r7]
            int r11 = r11 - r3
            r0.f9638g0 = r11
            r2 = r2[r8]
            int r14 = r14 - r2
            r0.f9639h0 = r14
            if (r9 == 0) goto L263
            r2 = r15
            goto L264
        L263:
            r2 = r7
        L264:
            if (r10 == 0) goto L267
            r7 = r1
        L267:
            boolean r2 = r0.W(r2, r7, r6)
            if (r2 == 0) goto L274
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r8)
        L274:
            d2.m r2 = r0.f9649q0
            if (r2 == 0) goto L49b
            if (r15 != 0) goto L27c
            if (r1 == 0) goto L49b
        L27c:
            r2.a(r0, r15, r1)
            goto L49b
        L281:
            android.view.VelocityTracker r1 = r0.f9635d0
            r1.addMovement(r13)
            android.view.VelocityTracker r1 = r0.f9635d0
            r3 = 1000(0x3e8, float:1.401E-42)
            int r6 = r0.f9643l0
            float r11 = (float) r6
            r1.computeCurrentVelocity(r3, r11)
            if (r9 == 0) goto L29c
            android.view.VelocityTracker r1 = r0.f9635d0
            int r3 = r0.f9634c0
            float r1 = r1.getXVelocity(r3)
            float r1 = -r1
            goto L29d
        L29c:
            r1 = r5
        L29d:
            if (r10 == 0) goto L2a9
            android.view.VelocityTracker r3 = r0.f9635d0
            int r9 = r0.f9634c0
            float r3 = r3.getYVelocity(r9)
            float r3 = -r3
            goto L2aa
        L2a9:
            r3 = r5
        L2aa:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 != 0) goto L2b6
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L2b3
            goto L2b6
        L2b3:
            r3 = r7
            goto L46d
        L2b6:
            int r1 = (int) r1
            int r3 = (int) r3
            d2.G r9 = r0.f9604B
            if (r9 != 0) goto L2c3
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r15, r1)
            goto L46c
        L2c3:
            boolean r10 = r0.f9619K
            if (r10 == 0) goto L2c9
            goto L46c
        L2c9:
            boolean r9 = r9.d()
            d2.G r10 = r0.f9604B
            boolean r10 = r10.e()
            int r11 = r0.f9642k0
            if (r9 == 0) goto L2dd
            int r12 = java.lang.Math.abs(r1)
            if (r12 >= r11) goto L2de
        L2dd:
            r1 = r7
        L2de:
            if (r10 == 0) goto L2e6
            int r12 = java.lang.Math.abs(r3)
            if (r12 >= r11) goto L2e7
        L2e6:
            r3 = r7
        L2e7:
            if (r1 != 0) goto L2ed
            if (r3 != 0) goto L2ed
            goto L46c
        L2ed:
            float r11 = (float) r1
            float r12 = (float) r3
            boolean r14 = r0.dispatchNestedPreFling(r11, r12)
            if (r14 != 0) goto L46c
            if (r9 != 0) goto L2fc
            if (r10 == 0) goto L2fa
            goto L2fc
        L2fa:
            r14 = r7
            goto L2fd
        L2fc:
            r14 = r8
        L2fd:
            r0.dispatchNestedFling(r11, r12, r14)
            d2.I r11 = r0.f9641j0
            if (r11 == 0) goto L411
            d2.w r11 = (d2.C0997w) r11
            androidx.recyclerview.widget.RecyclerView r12 = r11.f12216a
            d2.G r12 = r12.getLayoutManager()
            if (r12 != 0) goto L310
            goto L411
        L310:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f12216a
            d2.z r15 = r15.getAdapter()
            if (r15 != 0) goto L31a
            goto L411
        L31a:
            androidx.recyclerview.widget.RecyclerView r15 = r11.f12216a
            int r15 = r15.getMinFlingVelocity()
            int r2 = java.lang.Math.abs(r3)
            if (r2 > r15) goto L32c
            int r2 = java.lang.Math.abs(r1)
            if (r2 <= r15) goto L411
        L32c:
            boolean r2 = r12 instanceof d2.InterfaceC0970Q
            if (r2 != 0) goto L332
            goto L411
        L332:
            if (r2 != 0) goto L338
            r17 = r5
            r15 = 0
            goto L345
        L338:
            d2.v r15 = new d2.v
            r17 = r5
            androidx.recyclerview.widget.RecyclerView r5 = r11.f12216a
            android.content.Context r5 = r5.getContext()
            r15.<init>(r11, r5)
        L345:
            if (r15 != 0) goto L349
            goto L411
        L349:
            int r5 = r12.B()
            if (r5 != 0) goto L355
        L34f:
            r20 = r8
        L351:
            r2 = -1
        L352:
            r4 = -1
            goto L408
        L355:
            boolean r18 = r12.e()
            if (r18 == 0) goto L360
            E1.g r11 = r11.e(r12)
            goto L36c
        L360:
            boolean r18 = r12.d()
            if (r18 == 0) goto L36b
            E1.g r11 = r11.d(r12)
            goto L36c
        L36b:
            r11 = 0
        L36c:
            if (r11 != 0) goto L36f
            goto L34f
        L36f:
            int r4 = r12.v()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = 2147483647(0x7fffffff, float:NaN)
            r21 = r2
            r7 = r19
            r2 = r20
            r16 = 0
            r19 = 0
            r20 = r8
            r8 = 0
        L385:
            if (r8 >= r4) goto L3ab
            r22 = r4
            android.view.View r4 = r12.u(r8)
            if (r4 != 0) goto L392
            r23 = r8
            goto L3a6
        L392:
            r23 = r8
            int r8 = d2.C0997w.b(r4, r11)
            if (r8 > 0) goto L39f
            if (r8 <= r7) goto L39f
            r19 = r4
            r7 = r8
        L39f:
            if (r8 < 0) goto L3a6
            if (r8 >= r2) goto L3a6
            r16 = r4
            r2 = r8
        L3a6:
            int r8 = r23 + 1
            r4 = r22
            goto L385
        L3ab:
            boolean r2 = r12.d()
            if (r2 == 0) goto L3b8
            if (r1 <= 0) goto L3b6
        L3b3:
            r2 = r20
            goto L3bb
        L3b6:
            r2 = 0
            goto L3bb
        L3b8:
            if (r3 <= 0) goto L3b6
            goto L3b3
        L3bb:
            if (r2 == 0) goto L3c4
            if (r16 == 0) goto L3c4
            int r2 = d2.AbstractC0960G.H(r16)
            goto L352
        L3c4:
            if (r2 != 0) goto L3cd
            if (r19 == 0) goto L3cd
            int r2 = d2.AbstractC0960G.H(r19)
            goto L352
        L3cd:
            if (r2 == 0) goto L3d1
            r16 = r19
        L3d1:
            if (r16 != 0) goto L3d5
            goto L351
        L3d5:
            int r4 = d2.AbstractC0960G.H(r16)
            int r7 = r12.B()
            if (r21 == 0) goto L3f7
            r8 = r12
            d2.Q r8 = (d2.InterfaceC0970Q) r8
            int r7 = r7 + (-1)
            android.graphics.PointF r7 = r8.a(r7)
            if (r7 == 0) goto L3f7
            float r8 = r7.x
            int r8 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r8 < 0) goto L3f9
            float r7 = r7.y
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 >= 0) goto L3f7
            goto L3f9
        L3f7:
            r7 = 0
            goto L3fb
        L3f9:
            r7 = r20
        L3fb:
            if (r7 != r2) goto L3ff
            r2 = -1
            goto L401
        L3ff:
            r2 = r20
        L401:
            int r2 = r2 + r4
            if (r2 < 0) goto L351
            if (r2 < r5) goto L352
            goto L351
        L408:
            if (r2 != r4) goto L40b
            goto L413
        L40b:
            r15.f12201a = r2
            r12.y0(r15)
            goto L470
        L411:
            r20 = r8
        L413:
            if (r14 == 0) goto L46c
            if (r10 == 0) goto L419
            r9 = r9 | 2
        L419:
            w1.j r2 = r0.getScrollingChildHelper()
            r4 = r20
            r2.g(r9, r4)
            int r2 = -r6
            int r1 = java.lang.Math.min(r1, r6)
            int r24 = java.lang.Math.max(r2, r1)
            int r1 = java.lang.Math.min(r3, r6)
            int r25 = java.lang.Math.max(r2, r1)
            d2.U r1 = r0.f9647p0
            androidx.recyclerview.widget.RecyclerView r2 = r1.f12030w
            r3 = 2
            r2.setScrollState(r3)
            r3 = 0
            r1.f12025r = r3
            r1.f12024q = r3
            android.view.animation.Interpolator r3 = r1.f12027t
            D1.c r4 = androidx.recyclerview.widget.RecyclerView.f9601K0
            if (r3 == r4) goto L453
            r1.f12027t = r4
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.content.Context r2 = r2.getContext()
            r3.<init>(r2, r4)
            r1.f12026s = r3
        L453:
            android.widget.OverScroller r2 = r1.f12026s
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = 2147483647(0x7fffffff, float:NaN)
            r22 = 0
            r23 = 0
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = 2147483647(0x7fffffff, float:NaN)
            r21 = r2
            r21.fling(r22, r23, r24, r25, r26, r27, r28, r29)
            r1.a()
            goto L470
        L46c:
            r3 = 0
        L46d:
            r0.setScrollState(r3)
        L470:
            r0.V()
            goto L4a0
        L474:
            r3 = r7
            int r1 = r6.getPointerId(r3)
            r0.f9634c0 = r1
            float r1 = r6.getX()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f9638g0 = r1
            r0.f9636e0 = r1
            float r1 = r6.getY()
            float r1 = r1 + r14
            int r1 = (int) r1
            r0.f9639h0 = r1
            r0.f9637f0 = r1
            if (r10 == 0) goto L493
            r9 = r9 | 2
        L493:
            w1.j r1 = r0.getScrollingChildHelper()
            r3 = 0
            r1.g(r9, r3)
        L49b:
            android.view.VelocityTracker r1 = r0.f9635d0
            r1.addMovement(r13)
        L4a0:
            r13.recycle()
            r20 = 1
            return r20
        L4a6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r23 = this;
            r0 = r23
            d2.S r1 = r0.f9653s0
            r2 = 1
            r1.a(r2)
            r0.z(r1)
            r3 = 0
            r1.i = r3
            r0.a0()
            Z.m r4 = r0.f9658v
            java.lang.Object r5 = r4.f8312r
            r.Q r5 = (r.Q) r5
            java.lang.Object r6 = r4.f8312r
            r.Q r6 = (r.Q) r6
            r5.clear()
            java.lang.Object r4 = r4.f8313s
            r.q r4 = (r.C1566q) r4
            r4.a()
            r0.P()
            boolean r5 = r0.f9623O
            if (r5 == 0) goto L45
            L0.l r5 = r0.f9654t
            java.lang.Object r7 = r5.f3124a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r5.r(r7)
            java.lang.Object r7 = r5.f3126c
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r5.r(r7)
            boolean r5 = r0.f9624P
            if (r5 == 0) goto L45
            d2.G r5 = r0.f9604B
            r5.X()
        L45:
            d2.D r5 = r0.f9632a0
            if (r5 == 0) goto L336
            d2.G r5 = r0.f9604B
            boolean r5 = r5.z0()
            if (r5 == 0) goto L336
            L0.l r5 = r0.f9654t
            java.lang.Object r7 = r5.f3125b
            b1.d r7 = (b1.d) r7
            java.lang.Object r8 = r5.f3127d
            d2.x r8 = (d2.C0998x) r8
            java.lang.Object r9 = r5.f3128e
            k3.c r9 = (k3.c) r9
            java.lang.Object r10 = r5.f3124a
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.getClass()
        L66:
            int r11 = r10.size()
            r12 = 1
            int r11 = r11 - r12
            r14 = 0
        L6d:
            r15 = 8
            r13 = -1
            if (r11 < 0) goto L86
            java.lang.Object r17 = r10.get(r11)
            r2 = r17
            d2.a r2 = (d2.C0975a) r2
            int r2 = r2.f12059a
            if (r2 != r15) goto L81
            if (r14 == 0) goto L82
            goto L87
        L81:
            r14 = r12
        L82:
            int r11 = r11 + (-1)
            r2 = 1
            goto L6d
        L86:
            r11 = r13
        L87:
            if (r11 == r13) goto L249
            int r15 = r11 + 1
            java.lang.Object r13 = r9.f14120q
            L0.l r13 = (L0.l) r13
            java.lang.Object r18 = r10.get(r11)
            r3 = r18
            d2.a r3 = (d2.C0975a) r3
            java.lang.Object r18 = r10.get(r15)
            r14 = r18
            d2.a r14 = (d2.C0975a) r14
            int r2 = r14.f12059a
            if (r2 == r12) goto L215
            r17 = 0
            r12 = 2
            if (r2 == r12) goto L11b
            r12 = 4
            if (r2 == r12) goto Lb1
            r22 = r4
            r21 = r9
            goto L241
        Lb1:
            int r2 = r3.f12061c
            int r12 = r14.f12060b
            if (r2 >= r12) goto Lbe
            int r12 = r12 + (-1)
            r14.f12060b = r12
            r21 = r9
            goto Ld2
        Lbe:
            r21 = r9
            int r9 = r14.f12061c
            int r12 = r12 + r9
            if (r2 >= r12) goto Ld2
            int r9 = r9 + (-1)
            r14.f12061c = r9
            int r2 = r3.f12060b
            r9 = 1
            r12 = 4
            d2.a r2 = r13.p(r12, r2, r9)
            goto Ld4
        Ld2:
            r2 = r17
        Ld4:
            int r9 = r3.f12060b
            int r12 = r14.f12060b
            if (r9 > r12) goto Le1
            int r12 = r12 + 1
            r14.f12060b = r12
        Lde:
            r22 = r4
            goto Lf8
        Le1:
            r16 = r12
            int r12 = r14.f12061c
            int r12 = r16 + r12
            if (r9 >= r12) goto Lde
            int r12 = r12 - r9
            int r9 = r9 + 1
            r22 = r4
            r4 = 4
            d2.a r17 = r13.p(r4, r9, r12)
            int r4 = r14.f12061c
            int r4 = r4 - r12
            r14.f12061c = r4
        Lf8:
            r4 = r17
            r10.set(r15, r3)
            int r3 = r14.f12061c
            if (r3 <= 0) goto L105
            r10.set(r11, r14)
            goto L10f
        L105:
            r10.remove(r11)
            java.lang.Object r3 = r13.f3125b
            b1.d r3 = (b1.d) r3
            r3.c(r14)
        L10f:
            if (r2 == 0) goto L114
            r10.add(r11, r2)
        L114:
            if (r4 == 0) goto L241
            r10.add(r11, r4)
            goto L241
        L11b:
            r22 = r4
            r21 = r9
            int r2 = r3.f12060b
            int r4 = r3.f12061c
            if (r2 >= r4) goto L137
            int r9 = r14.f12060b
            if (r9 != r2) goto L133
            int r9 = r14.f12061c
            int r2 = r4 - r2
            if (r9 != r2) goto L133
            r2 = 0
        L130:
            r16 = 1
            goto L146
        L133:
            r2 = 0
        L134:
            r16 = 0
            goto L146
        L137:
            int r9 = r14.f12060b
            int r12 = r4 + 1
            if (r9 != r12) goto L144
            int r9 = r14.f12061c
            int r2 = r2 - r4
            if (r9 != r2) goto L144
            r2 = 1
            goto L130
        L144:
            r2 = 1
            goto L134
        L146:
            int r9 = r14.f12060b
            if (r4 >= r9) goto L14f
            int r9 = r9 + (-1)
            r14.f12060b = r9
            goto L16e
        L14f:
            int r12 = r14.f12061c
            int r9 = r9 + r12
            if (r4 >= r9) goto L16e
            int r12 = r12 + (-1)
            r14.f12061c = r12
            r12 = 2
            r3.f12059a = r12
            r9 = 1
            r3.f12061c = r9
            int r2 = r14.f12061c
            if (r2 != 0) goto L241
            r10.remove(r15)
            java.lang.Object r2 = r13.f3125b
            b1.d r2 = (b1.d) r2
            r2.c(r14)
            goto L241
        L16e:
            int r4 = r3.f12060b
            int r9 = r14.f12060b
            if (r4 > r9) goto L179
            int r9 = r9 + 1
            r14.f12060b = r9
            goto L18d
        L179:
            int r12 = r14.f12061c
            int r9 = r9 + r12
            if (r4 >= r9) goto L18d
            int r9 = r9 - r4
            int r4 = r4 + 1
            r12 = 2
            d2.a r17 = r13.p(r12, r4, r9)
            int r4 = r3.f12060b
            int r9 = r14.f12060b
            int r4 = r4 - r9
            r14.f12061c = r4
        L18d:
            r4 = r17
            if (r16 == 0) goto L1a0
            r10.set(r11, r14)
            r10.remove(r15)
            java.lang.Object r2 = r13.f3125b
            b1.d r2 = (b1.d) r2
            r2.c(r3)
            goto L241
        L1a0:
            if (r2 == 0) goto L1d1
            if (r4 == 0) goto L1ba
            int r2 = r3.f12060b
            int r9 = r4.f12060b
            if (r2 <= r9) goto L1af
            int r9 = r4.f12061c
            int r2 = r2 - r9
            r3.f12060b = r2
        L1af:
            int r2 = r3.f12061c
            int r9 = r4.f12060b
            if (r2 <= r9) goto L1ba
            int r9 = r4.f12061c
            int r2 = r2 - r9
            r3.f12061c = r2
        L1ba:
            int r2 = r3.f12060b
            int r9 = r14.f12060b
            if (r2 <= r9) goto L1c5
            int r9 = r14.f12061c
            int r2 = r2 - r9
            r3.f12060b = r2
        L1c5:
            int r2 = r3.f12061c
            int r9 = r14.f12060b
            if (r2 <= r9) goto L1ff
            int r9 = r14.f12061c
            int r2 = r2 - r9
            r3.f12061c = r2
            goto L1ff
        L1d1:
            if (r4 == 0) goto L1e9
            int r2 = r3.f12060b
            int r9 = r4.f12060b
            if (r2 < r9) goto L1de
            int r9 = r4.f12061c
            int r2 = r2 - r9
            r3.f12060b = r2
        L1de:
            int r2 = r3.f12061c
            int r9 = r4.f12060b
            if (r2 < r9) goto L1e9
            int r9 = r4.f12061c
            int r2 = r2 - r9
            r3.f12061c = r2
        L1e9:
            int r2 = r3.f12060b
            int r9 = r14.f12060b
            if (r2 < r9) goto L1f4
            int r9 = r14.f12061c
            int r2 = r2 - r9
            r3.f12060b = r2
        L1f4:
            int r2 = r3.f12061c
            int r9 = r14.f12060b
            if (r2 < r9) goto L1ff
            int r9 = r14.f12061c
            int r2 = r2 - r9
            r3.f12061c = r2
        L1ff:
            r10.set(r11, r14)
            int r2 = r3.f12060b
            int r9 = r3.f12061c
            if (r2 == r9) goto L20c
            r10.set(r15, r3)
            goto L20f
        L20c:
            r10.remove(r15)
        L20f:
            if (r4 == 0) goto L241
            r10.add(r11, r4)
            goto L241
        L215:
            r22 = r4
            r21 = r9
            int r2 = r3.f12061c
            int r4 = r14.f12060b
            if (r2 >= r4) goto L221
            r13 = -1
            goto L222
        L221:
            r13 = 0
        L222:
            int r9 = r3.f12060b
            if (r9 >= r4) goto L228
            int r13 = r13 + 1
        L228:
            if (r4 > r9) goto L22f
            int r4 = r14.f12061c
            int r9 = r9 + r4
            r3.f12060b = r9
        L22f:
            int r4 = r14.f12060b
            if (r4 > r2) goto L238
            int r9 = r14.f12061c
            int r2 = r2 + r9
            r3.f12061c = r2
        L238:
            int r4 = r4 + r13
            r14.f12060b = r4
            r10.set(r11, r14)
            r10.set(r15, r3)
        L241:
            r9 = r21
            r4 = r22
            r2 = 1
            r3 = 0
            goto L66
        L249:
            r22 = r4
            int r2 = r10.size()
            r3 = 0
        L250:
            if (r3 >= r2) goto L332
            java.lang.Object r4 = r10.get(r3)
            d2.a r4 = (d2.C0975a) r4
            int r9 = r4.f12059a
            r11 = 1
            if (r9 == r11) goto L326
            r12 = 2
            if (r9 == r12) goto L2c5
            r12 = 4
            if (r9 == r12) goto L26e
            if (r9 == r15) goto L26a
        L265:
            r12 = 2
            r20 = 1
            goto L32c
        L26a:
            r5.q(r4)
            goto L265
        L26e:
            int r9 = r4.f12060b
            int r11 = r4.f12061c
            int r11 = r11 + r9
            r12 = r9
            r13 = 0
            r14 = -1
        L276:
            if (r9 >= r11) goto L2ad
            d2.V r21 = r8.b(r9)
            if (r21 != 0) goto L284
            boolean r21 = r5.e(r9)
            if (r21 == 0) goto L286
        L284:
            r15 = 4
            goto L299
        L286:
            r15 = 1
            if (r14 != r15) goto L294
            r15 = 4
            d2.a r12 = r5.p(r15, r12, r13)
            r5.q(r12)
            r12 = r9
            r13 = 0
            goto L295
        L294:
            r15 = 4
        L295:
            r14 = 0
        L296:
            r20 = 1
            goto L2a6
        L299:
            if (r14 != 0) goto L2a4
            d2.a r12 = r5.p(r15, r12, r13)
            r5.g(r12)
            r12 = r9
            r13 = 0
        L2a4:
            r14 = 1
            goto L296
        L2a6:
            int r13 = r13 + 1
            int r9 = r9 + 1
            r15 = 8
            goto L276
        L2ad:
            int r9 = r4.f12061c
            if (r13 == r9) goto L2ba
            r7.c(r4)
            r15 = 4
            d2.a r4 = r5.p(r15, r12, r13)
            goto L2bb
        L2ba:
            r15 = 4
        L2bb:
            if (r14 != 0) goto L2c1
            r5.g(r4)
            goto L265
        L2c1:
            r5.q(r4)
            goto L265
        L2c5:
            r15 = 4
            int r9 = r4.f12060b
            int r11 = r4.f12061c
            int r11 = r11 + r9
            r12 = r9
            r13 = 0
            r14 = -1
        L2ce:
            if (r12 >= r11) goto L30c
            d2.V r19 = r8.b(r12)
            if (r19 != 0) goto L2dc
            boolean r19 = r5.e(r12)
            if (r19 == 0) goto L2de
        L2dc:
            r15 = 2
            goto L2ef
        L2de:
            r15 = 1
            if (r14 != r15) goto L2eb
            r15 = 2
            d2.a r14 = r5.p(r15, r9, r13)
            r5.q(r14)
            r14 = 1
            goto L2ed
        L2eb:
            r15 = 2
            r14 = 0
        L2ed:
            r15 = 0
            goto L2fc
        L2ef:
            if (r14 != 0) goto L2fa
            d2.a r14 = r5.p(r15, r9, r13)
            r5.g(r14)
            r14 = 1
            goto L2fb
        L2fa:
            r14 = 0
        L2fb:
            r15 = 1
        L2fc:
            if (r14 == 0) goto L304
            int r12 = r12 - r13
            int r11 = r11 - r13
            r13 = 1
        L301:
            r20 = 1
            goto L307
        L304:
            int r13 = r13 + 1
            goto L301
        L307:
            int r12 = r12 + 1
            r14 = r15
            r15 = 4
            goto L2ce
        L30c:
            r20 = 1
            int r11 = r4.f12061c
            if (r13 == r11) goto L31b
            r7.c(r4)
            r12 = 2
            d2.a r4 = r5.p(r12, r9, r13)
            goto L31c
        L31b:
            r12 = 2
        L31c:
            if (r14 != 0) goto L322
            r5.g(r4)
            goto L32c
        L322:
            r5.q(r4)
            goto L32c
        L326:
            r20 = r11
            r12 = 2
            r5.q(r4)
        L32c:
            int r3 = r3 + 1
            r15 = 8
            goto L250
        L332:
            r10.clear()
            goto L33d
        L336:
            r22 = r4
            L0.l r2 = r0.f9654t
            r2.f()
        L33d:
            boolean r2 = r0.f9659v0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L34a
            boolean r2 = r0.f9661w0
            if (r2 == 0) goto L348
            goto L34a
        L348:
            r2 = r4
            goto L34b
        L34a:
            r2 = r3
        L34b:
            boolean r5 = r0.f9615H
            if (r5 == 0) goto L369
            d2.D r5 = r0.f9632a0
            if (r5 == 0) goto L369
            boolean r5 = r0.f9623O
            if (r5 != 0) goto L35f
            if (r2 != 0) goto L35f
            d2.G r7 = r0.f9604B
            boolean r7 = r7.f
            if (r7 == 0) goto L369
        L35f:
            if (r5 == 0) goto L367
            d2.z r5 = r0.f9602A
            boolean r5 = r5.f12223b
            if (r5 == 0) goto L369
        L367:
            r5 = r3
            goto L36a
        L369:
            r5 = r4
        L36a:
            d2.S r7 = r0.f9653s0
            r7.j = r5
            if (r5 == 0) goto L383
            if (r2 == 0) goto L383
            boolean r2 = r0.f9623O
            if (r2 != 0) goto L383
            d2.D r2 = r0.f9632a0
            if (r2 == 0) goto L383
            d2.G r2 = r0.f9604B
            boolean r2 = r2.z0()
            if (r2 == 0) goto L383
            goto L384
        L383:
            r3 = r4
        L384:
            r7.f12020k = r3
            boolean r2 = r0.f9646o0
            r3 = 0
            if (r2 == 0) goto L39a
            boolean r2 = r0.hasFocus()
            if (r2 == 0) goto L39a
            d2.z r2 = r0.f9602A
            if (r2 == 0) goto L39a
            android.view.View r2 = r0.getFocusedChild()
            goto L39b
        L39a:
            r2 = r3
        L39b:
            if (r2 != 0) goto L39e
            goto L3a9
        L39e:
            android.view.View r2 = r0.A(r2)
            if (r2 != 0) goto L3a5
            goto L3a9
        L3a5:
            d2.V r3 = r0.H(r2)
        L3a9:
            r4 = -1
            r2 = -1
            if (r3 != 0) goto L3b5
            r1.f12022m = r4
            r1.f12021l = r2
            r1.f12023n = r2
            goto L402
        L3b5:
            d2.z r7 = r0.f9602A
            boolean r7 = r7.f12223b
            if (r7 == 0) goto L3bd
            long r4 = r3.f12036e
        L3bd:
            r1.f12022m = r4
            boolean r4 = r0.f9623O
            if (r4 == 0) goto L3c5
        L3c3:
            r4 = r2
            goto L3d7
        L3c5:
            boolean r4 = r3.h()
            if (r4 == 0) goto L3ce
            int r4 = r3.f12035d
            goto L3d7
        L3ce:
            androidx.recyclerview.widget.RecyclerView r4 = r3.f12046r
            if (r4 != 0) goto L3d3
            goto L3c3
        L3d3:
            int r4 = r4.F(r3)
        L3d7:
            r1.f12021l = r4
            android.view.View r3 = r3.f12032a
            int r4 = r3.getId()
        L3df:
            boolean r5 = r3.isFocused()
            if (r5 != 0) goto L400
            boolean r5 = r3 instanceof android.view.ViewGroup
            if (r5 == 0) goto L400
            boolean r5 = r3.hasFocus()
            if (r5 == 0) goto L400
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r3 = r3.getFocusedChild()
            int r5 = r3.getId()
            if (r5 == r2) goto L3df
            int r4 = r3.getId()
            goto L3df
        L400:
            r1.f12023n = r4
        L402:
            boolean r3 = r1.j
            if (r3 == 0) goto L40c
            boolean r3 = r0.f9661w0
            if (r3 == 0) goto L40c
            r3 = 1
            goto L40d
        L40c:
            r3 = 0
        L40d:
            r1.f12019h = r3
            r3 = 0
            r0.f9661w0 = r3
            r0.f9659v0 = r3
            boolean r3 = r1.f12020k
            r1.f12018g = r3
            d2.z r3 = r0.f9602A
            int r3 = r3.a()
            r1.f12017e = r3
            int[] r3 = r0.f9603A0
            r0.C(r3)
            boolean r3 = r1.j
            if (r3 == 0) goto L4a5
            B0.G0 r3 = r0.f9656u
            int r3 = r3.v()
            r4 = 0
        L430:
            if (r4 >= r3) goto L4a5
            B0.G0 r5 = r0.f9656u
            android.view.View r5 = r5.u(r4)
            d2.V r5 = I(r5)
            boolean r7 = r5.o()
            if (r7 != 0) goto L44e
            boolean r7 = r5.f()
            if (r7 == 0) goto L451
            d2.z r7 = r0.f9602A
            boolean r7 = r7.f12223b
            if (r7 != 0) goto L451
        L44e:
            r9 = r22
            goto L4a0
        L451:
            d2.D r7 = r0.f9632a0
            d2.AbstractC0957D.b(r5)
            r5.c()
            r7.getClass()
            M.t r7 = new M.t
            r7.<init>()
            r7.a(r5)
            java.lang.Object r8 = r6.get(r5)
            d2.g0 r8 = (d2.g0) r8
            if (r8 != 0) goto L473
            d2.g0 r8 = d2.g0.a()
            r6.put(r5, r8)
        L473:
            r8.f12118b = r7
            int r7 = r8.f12117a
            r7 = r7 | 4
            r8.f12117a = r7
            boolean r7 = r1.f12019h
            if (r7 == 0) goto L44e
            boolean r7 = r5.k()
            if (r7 == 0) goto L44e
            boolean r7 = r5.h()
            if (r7 != 0) goto L44e
            boolean r7 = r5.o()
            if (r7 != 0) goto L44e
            boolean r7 = r5.f()
            if (r7 != 0) goto L44e
            long r7 = r0.G(r5)
            r9 = r22
            r9.e(r7, r5)
        L4a0:
            int r4 = r4 + 1
            r22 = r9
            goto L430
        L4a5:
            boolean r3 = r1.f12020k
            r4 = 2
            if (r3 == 0) goto L545
            B0.G0 r3 = r0.f9656u
            int r3 = r3.G()
            r5 = 0
        L4b1:
            if (r5 >= r3) goto L4ce
            B0.G0 r7 = r0.f9656u
            android.view.View r7 = r7.F(r5)
            d2.V r7 = I(r7)
            boolean r8 = r7.o()
            if (r8 != 0) goto L4cb
            int r8 = r7.f12035d
            if (r8 != r2) goto L4cb
            int r8 = r7.f12034c
            r7.f12035d = r8
        L4cb:
            int r5 = r5 + 1
            goto L4b1
        L4ce:
            boolean r2 = r1.f
            r3 = 0
            r1.f = r3
            d2.G r3 = r0.f9604B
            d2.M r5 = r0.f9650r
            r3.b0(r5, r1)
            r1.f = r2
            r3 = 0
        L4dd:
            B0.G0 r2 = r0.f9656u
            int r2 = r2.v()
            if (r3 >= r2) goto L540
            B0.G0 r2 = r0.f9656u
            android.view.View r2 = r2.u(r3)
            d2.V r2 = I(r2)
            boolean r5 = r2.o()
            if (r5 == 0) goto L4f6
            goto L53d
        L4f6:
            java.lang.Object r5 = r6.get(r2)
            d2.g0 r5 = (d2.g0) r5
            if (r5 == 0) goto L505
            int r5 = r5.f12117a
            r5 = r5 & 4
            if (r5 == 0) goto L505
            goto L53d
        L505:
            d2.AbstractC0957D.b(r2)
            int r5 = r2.j
            r5 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L510
            r5 = 1
            goto L511
        L510:
            r5 = 0
        L511:
            d2.D r7 = r0.f9632a0
            r2.c()
            r7.getClass()
            M.t r7 = new M.t
            r7.<init>()
            r7.a(r2)
            if (r5 == 0) goto L527
            r0.T(r2, r7)
            goto L53d
        L527:
            java.lang.Object r5 = r6.get(r2)
            d2.g0 r5 = (d2.g0) r5
            if (r5 != 0) goto L536
            d2.g0 r5 = d2.g0.a()
            r6.put(r2, r5)
        L536:
            int r2 = r5.f12117a
            r2 = r2 | r4
            r5.f12117a = r2
            r5.f12118b = r7
        L53d:
            int r3 = r3 + 1
            goto L4dd
        L540:
            r0.k()
        L543:
            r2 = 1
            goto L549
        L545:
            r0.k()
            goto L543
        L549:
            r0.Q(r2)
            r3 = 0
            r0.b0(r3)
            r1.f12016d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.p():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        a0();
        P();
        C0971S c0971s = this.f9653s0;
        c0971s.a(6);
        this.f9654t.f();
        c0971s.f12017e = this.f9602A.a();
        c0971s.f12015c = 0;
        c0971s.f12018g = false;
        this.f9604B.b0(this.f9650r, c0971s);
        c0971s.f = false;
        this.f9652s = null;
        c0971s.j = c0971s.j && this.f9632a0 != null;
        c0971s.f12016d = 4;
        Q(true);
        b0(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r(int i, int i7, int i8, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i7, i8, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z5) {
        AbstractC0974V abstractC0974VI = I(view);
        if (abstractC0974VI != null) {
            if (abstractC0974VI.j()) {
                abstractC0974VI.j &= -257;
            } else if (!abstractC0974VI.o()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + abstractC0974VI + y());
            }
        }
        view.clearAnimation();
        I(view);
        super.removeDetachedView(view, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        C0994t c0994t = this.f9604B.f11981e;
        if ((c0994t == null || !c0994t.f12205e) && !L() && view2 != null) {
            U(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.f9604B.k0(this, view, rect, z5, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        ArrayList arrayList = this.f9608D;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0985k) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f9617I != 0 || this.f9619K) {
            this.f9618J = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(int i, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().d(i, i7, i8, i9, iArr, i10, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void scrollBy(int i, int i7) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f9619K) {
            return;
        }
        boolean zD = abstractC0960G.d();
        boolean zE = this.f9604B.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i7 = 0;
            }
            W(i, i7, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void scrollTo(int i, int i7) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!L()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f9621M |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAccessibilityDelegateCompat(X x6) {
        this.f9667z0 = x6;
        AbstractC1835K.m(this, x6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAdapter(AbstractC1000z abstractC1000z) {
        setLayoutFrozen(false);
        AbstractC1000z abstractC1000z2 = this.f9602A;
        B b7 = this.f9648q;
        if (abstractC1000z2 != null) {
            abstractC1000z2.f12222a.unregisterObserver(b7);
            this.f9602A.getClass();
        }
        AbstractC0957D abstractC0957D = this.f9632a0;
        if (abstractC0957D != null) {
            abstractC0957D.e();
        }
        AbstractC0960G abstractC0960G = this.f9604B;
        C0966M c0966m = this.f9650r;
        if (abstractC0960G != null) {
            abstractC0960G.g0(c0966m);
            this.f9604B.h0(c0966m);
        }
        c0966m.f11999a.clear();
        c0966m.d();
        l lVar = this.f9654t;
        lVar.r((ArrayList) lVar.f3124a);
        lVar.r((ArrayList) lVar.f3126c);
        AbstractC1000z abstractC1000z3 = this.f9602A;
        this.f9602A = abstractC1000z;
        if (abstractC1000z != null) {
            abstractC1000z.f12222a.registerObserver(b7);
        }
        AbstractC1000z abstractC1000z4 = this.f9602A;
        c0966m.f11999a.clear();
        c0966m.d();
        C0965L c0965lC = c0966m.c();
        if (abstractC1000z3 != null) {
            c0965lC.f11998b--;
        }
        if (c0965lC.f11998b == 0) {
            SparseArray sparseArray = c0965lC.f11997a;
            for (int i = 0; i < sparseArray.size(); i++) {
                ((C0964K) sparseArray.valueAt(i)).f11993a.clear();
            }
        }
        if (abstractC1000z4 != null) {
            c0965lC.f11998b++;
        }
        this.f9653s0.f = true;
        this.f9624P |= false;
        this.f9623O = true;
        int iG = this.f9656u.G();
        for (int i7 = 0; i7 < iG; i7++) {
            AbstractC0974V abstractC0974VI = I(this.f9656u.F(i7));
            if (abstractC0974VI != null && !abstractC0974VI.o()) {
                abstractC0974VI.a(6);
            }
        }
        N();
        C0966M c0966m2 = this.f9650r;
        ArrayList arrayList = c0966m2.f12001c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0974V abstractC0974V = (AbstractC0974V) arrayList.get(i8);
            if (abstractC0974V != null) {
                abstractC0974V.a(6);
                abstractC0974V.a(1024);
            }
        }
        AbstractC1000z abstractC1000z5 = c0966m2.f12005h.f9602A;
        if (abstractC1000z5 == null || !abstractC1000z5.f12223b) {
            c0966m2.d();
        }
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setChildDrawingOrderCallback(InterfaceC0955B interfaceC0955B) {
        if (interfaceC0955B == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.f9660w) {
            this.f9631W = null;
            this.f9629U = null;
            this.f9630V = null;
            this.f9628T = null;
        }
        this.f9660w = z5;
        super.setClipToPadding(z5);
        if (this.f9615H) {
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setEdgeEffectFactory(C0956C c0956c) {
        c0956c.getClass();
        this.f9627S = c0956c;
        this.f9631W = null;
        this.f9629U = null;
        this.f9630V = null;
        this.f9628T = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHasFixedSize(boolean z5) {
        this.f9613G = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemAnimator(AbstractC0957D abstractC0957D) {
        AbstractC0957D abstractC0957D2 = this.f9632a0;
        if (abstractC0957D2 != null) {
            abstractC0957D2.e();
            this.f9632a0.f11968a = null;
        }
        this.f9632a0 = abstractC0957D;
        if (abstractC0957D != null) {
            abstractC0957D.f11968a = this.f9663x0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setItemViewCacheSize(int i) {
        C0966M c0966m = this.f9650r;
        c0966m.f12003e = i;
        c0966m.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLayoutManager(AbstractC0960G abstractC0960G) {
        C0994t c0994t;
        if (abstractC0960G == this.f9604B) {
            return;
        }
        setScrollState(0);
        RunnableC0973U runnableC0973U = this.f9647p0;
        runnableC0973U.f12030w.removeCallbacks(runnableC0973U);
        runnableC0973U.f12026s.abortAnimation();
        AbstractC0960G abstractC0960G2 = this.f9604B;
        if (abstractC0960G2 != null && (c0994t = abstractC0960G2.f11981e) != null) {
            c0994t.i();
        }
        AbstractC0960G abstractC0960G3 = this.f9604B;
        C0966M c0966m = this.f9650r;
        if (abstractC0960G3 != null) {
            AbstractC0957D abstractC0957D = this.f9632a0;
            if (abstractC0957D != null) {
                abstractC0957D.e();
            }
            this.f9604B.g0(c0966m);
            this.f9604B.h0(c0966m);
            c0966m.f11999a.clear();
            c0966m.d();
            if (this.f9611F) {
                AbstractC0960G abstractC0960G4 = this.f9604B;
                abstractC0960G4.f11982g = false;
                abstractC0960G4.R(this);
            }
            this.f9604B.t0(null);
            this.f9604B = null;
        } else {
            c0966m.f11999a.clear();
            c0966m.d();
        }
        G0 g02 = this.f9656u;
        RecyclerView recyclerView = ((C0999y) g02.f234r).f12221a;
        ((T) g02.f235s).j();
        ArrayList arrayList = (ArrayList) g02.f236t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC0974V abstractC0974VI = I((View) arrayList.get(size));
            if (abstractC0974VI != null) {
                int i = abstractC0974VI.f12044p;
                if (recyclerView.L()) {
                    abstractC0974VI.f12045q = i;
                    recyclerView.f9612F0.add(abstractC0974VI);
                } else {
                    View view = abstractC0974VI.f12032a;
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    view.setImportantForAccessibility(i);
                }
                abstractC0974VI.f12044p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f9604B = abstractC0960G;
        if (abstractC0960G != null) {
            if (abstractC0960G.f11978b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0960G + " is already attached to a RecyclerView:" + abstractC0960G.f11978b.y());
            }
            abstractC0960G.t0(this);
            if (this.f9611F) {
                AbstractC0960G abstractC0960G5 = this.f9604B;
                abstractC0960G5.f11982g = true;
                abstractC0960G5.Q(this);
            }
        }
        c0966m.k();
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        C1847j scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f18222d) {
            ViewGroup viewGroup = scrollingChildHelper.f18221c;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1826B.m(viewGroup);
        }
        scrollingChildHelper.f18222d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnFlingListener(AbstractC0962I abstractC0962I) {
        this.f9641j0 = abstractC0962I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setOnScrollListener(AbstractC0963J abstractC0963J) {
        this.f9655t0 = abstractC0963J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPreserveFocusAfterLayout(boolean z5) {
        this.f9646o0 = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRecycledViewPool(C0965L c0965l) {
        C0966M c0966m = this.f9650r;
        if (c0966m.f12004g != null) {
            r1.f11998b--;
        }
        c0966m.f12004g = c0965l;
        if (c0965l == null || c0966m.f12005h.getAdapter() == null) {
            return;
        }
        c0966m.f12004g.f11998b++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setScrollState(int i) {
        C0994t c0994t;
        if (i == this.f9633b0) {
            return;
        }
        this.f9633b0 = i;
        if (i != 2) {
            RunnableC0973U runnableC0973U = this.f9647p0;
            runnableC0973U.f12030w.removeCallbacks(runnableC0973U);
            runnableC0973U.f12026s.abortAnimation();
            AbstractC0960G abstractC0960G = this.f9604B;
            if (abstractC0960G != null && (c0994t = abstractC0960G.f11981e) != null) {
                c0994t.i();
            }
        }
        AbstractC0960G abstractC0960G2 = this.f9604B;
        if (abstractC0960G2 != null) {
            abstractC0960G2.f0(i);
        }
        AbstractC0963J abstractC0963J = this.f9655t0;
        if (abstractC0963J != null) {
            abstractC0963J.a(this, i);
        }
        ArrayList arrayList = this.f9657u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0963J) this.f9657u0.get(size)).a(this, i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f9640i0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f9640i0 = viewConfiguration.getScaledTouchSlop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setViewCacheExtension(AbstractC0972T abstractC0972T) {
        this.f9650r.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        C0994t c0994t;
        if (z5 != this.f9619K) {
            i("Do not suppressLayout in layout or scroll");
            if (!z5) {
                this.f9619K = false;
                if (this.f9618J && this.f9604B != null && this.f9602A != null) {
                    requestLayout();
                }
                this.f9618J = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f9619K = true;
            this.f9620L = true;
            setScrollState(0);
            RunnableC0973U runnableC0973U = this.f9647p0;
            runnableC0973U.f12030w.removeCallbacks(runnableC0973U);
            runnableC0973U.f12026s.abortAnimation();
            AbstractC0960G abstractC0960G = this.f9604B;
            if (abstractC0960G == null || (c0994t = abstractC0960G.f11981e) == null) {
                return;
            }
            c0994t.i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(int i, int i7) {
        this.f9626R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i7);
        AbstractC0963J abstractC0963J = this.f9655t0;
        if (abstractC0963J != null) {
            abstractC0963J.b(this, i, i7);
        }
        ArrayList arrayList = this.f9657u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0963J) this.f9657u0.get(size)).b(this, i, i7);
            }
        }
        this.f9626R--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        if (this.f9631W != null) {
            return;
        }
        this.f9627S.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f9631W = edgeEffect;
        if (this.f9660w) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v() {
        if (this.f9628T != null) {
            return;
        }
        this.f9627S.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f9628T = edgeEffect;
        if (this.f9660w) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w() {
        if (this.f9630V != null) {
            return;
        }
        this.f9627S.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f9630V = edgeEffect;
        if (this.f9660w) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x() {
        if (this.f9629U != null) {
            return;
        }
        this.f9627S.getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.f9629U = edgeEffect;
        if (this.f9660w) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String y() {
        return " " + super.toString() + ", adapter:" + this.f9602A + ", layout:" + this.f9604B + ", context:" + getContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(C0971S c0971s) {
        if (getScrollState() != 2) {
            c0971s.getClass();
            return;
        }
        OverScroller overScroller = this.f9647p0.f12026s;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0971s.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        char c7;
        TypedArray typedArray;
        char c8;
        char c9;
        int i7;
        int i8;
        Constructor constructor;
        super(context, attributeSet, i);
        this.f9648q = new B(this);
        this.f9650r = new C0966M(this);
        this.f9658v = new m(8);
        this.f9662x = new Rect();
        this.f9664y = new Rect();
        this.f9666z = new RectF();
        this.f9606C = new ArrayList();
        this.f9608D = new ArrayList();
        this.f9617I = 0;
        this.f9623O = false;
        this.f9624P = false;
        this.f9625Q = 0;
        this.f9626R = 0;
        this.f9627S = new C0956C();
        C0982h c0982h = new C0982h();
        Object[] objArr = null;
        c0982h.f11968a = null;
        c0982h.f11969b = new ArrayList();
        c0982h.f11970c = 120L;
        c0982h.f11971d = 120L;
        c0982h.f11972e = 250L;
        c0982h.f = 250L;
        c0982h.f12121g = true;
        c0982h.f12122h = new ArrayList();
        c0982h.i = new ArrayList();
        c0982h.j = new ArrayList();
        c0982h.f12123k = new ArrayList();
        c0982h.f12124l = new ArrayList();
        c0982h.f12125m = new ArrayList();
        c0982h.f12126n = new ArrayList();
        c0982h.f12127o = new ArrayList();
        c0982h.f12128p = new ArrayList();
        c0982h.f12129q = new ArrayList();
        c0982h.f12130r = new ArrayList();
        this.f9632a0 = c0982h;
        this.f9633b0 = 0;
        this.f9634c0 = -1;
        this.f9644m0 = Float.MIN_VALUE;
        this.f9645n0 = Float.MIN_VALUE;
        this.f9646o0 = true;
        this.f9647p0 = new RunnableC0973U(this);
        this.f9651r0 = new J();
        C0971S c0971s = new C0971S();
        c0971s.f12013a = -1;
        c0971s.f12014b = 0;
        c0971s.f12015c = 0;
        c0971s.f12016d = 1;
        c0971s.f12017e = 0;
        c0971s.f = false;
        c0971s.f12018g = false;
        c0971s.f12019h = false;
        c0971s.i = false;
        c0971s.j = false;
        c0971s.f12020k = false;
        this.f9653s0 = c0971s;
        this.f9659v0 = false;
        this.f9661w0 = false;
        C0999y c0999y = new C0999y(this);
        this.f9663x0 = c0999y;
        this.f9665y0 = false;
        this.f9603A0 = new int[2];
        this.f9607C0 = new int[2];
        this.D0 = new int[2];
        this.f9610E0 = new int[2];
        this.f9612F0 = new ArrayList();
        this.f9614G0 = new b(16, this);
        this.f9616H0 = new C0998x(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f9640i0 = viewConfiguration.getScaledTouchSlop();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            Method method = AbstractC1836L.f18154a;
            fA = d.c(viewConfiguration);
        } else {
            fA = AbstractC1836L.a(viewConfiguration, context);
        }
        this.f9644m0 = fA;
        this.f9645n0 = i9 >= 26 ? d.d(viewConfiguration) : AbstractC1836L.a(viewConfiguration, context);
        this.f9642k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9643l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f9632a0.f11968a = c0999y;
        C0998x c0998x = new C0998x(this);
        l lVar = new l();
        lVar.f3125b = new b1.d(30);
        lVar.f3124a = new ArrayList();
        lVar.f3126c = new ArrayList();
        lVar.f3127d = c0998x;
        lVar.f3128e = new k3.c(lVar);
        this.f9654t = lVar;
        this.f9656u = new G0(new C0999y(this));
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if ((i9 >= 26 ? AbstractC1829E.a(this) : 0) == 0 && i9 >= 26) {
            AbstractC1829E.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f9622N = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new X(this));
        int[] iArr = AbstractC0730a.f10113a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i9 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f9660w = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
            }
            Resources resources = getContext().getResources();
            c9 = 2;
            typedArray = typedArrayObtainStyledAttributes;
            c7 = 3;
            i7 = i;
            c8 = 1;
            i8 = 4;
            new C0985k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(com.wnapp.smspariaz.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(com.wnapp.smspariaz.R.dimen.fastscroll_margin));
        } else {
            c7 = 3;
            typedArray = typedArrayObtainStyledAttributes;
            c8 = 1;
            c9 = 2;
            i7 = i;
            i8 = 4;
        }
        typedArray.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC0960G.class);
                    try {
                        Constructor constructor2 = clsAsSubclass.getConstructor(f9600J0);
                        Object[] objArr2 = new Object[i8];
                        objArr2[0] = context;
                        objArr2[c8] = attributeSet;
                        objArr2[c9] = Integer.valueOf(i7);
                        objArr2[c7] = 0;
                        objArr = objArr2;
                        constructor = constructor2;
                    } catch (NoSuchMethodException e7) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e8) {
                            e8.initCause(e7);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e8);
                        }
                    }
                    constructor.setAccessible(c8);
                    setLayoutManager((AbstractC0960G) constructor.newInstance(objArr));
                } catch (ClassCastException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e9);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e10);
                } catch (IllegalAccessException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e11);
                } catch (InstantiationException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        int[] iArr2 = f9599I0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        if (i10 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i7, 0);
        }
        boolean z5 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0960G abstractC0960G = this.f9604B;
        if (abstractC0960G != null) {
            return abstractC0960G.t(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(InterfaceC0967N interfaceC0967N) {
    }
}
