package com.google.android.material.bottomsheet;

import D1.d;
import U.l;
import U3.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c4.c;
import c4.f;
import com.google.android.gms.internal.measurement.I1;
import com.wnapp.smspariaz.R;
import i1.b;
import i1.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import k1.i;
import l4.m;
import s4.g;
import s4.k;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.C1838a;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final f f11362A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ValueAnimator f11363B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f11364C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f11365D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f11366E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float f11367F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11368G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final float f11369H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f11370I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f11371J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f11372K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f11373L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public d f11374M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f11375N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f11376O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f11377P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final float f11378Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f11379R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f11380S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f11381T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public WeakReference f11382U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public WeakReference f11383V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final ArrayList f11384W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public VelocityTracker f11385X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f11386Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f11387Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11388a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f11389a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11390b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public HashMap f11391b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11392c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final SparseIntArray f11393c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11394d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final c4.d f11395d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11396e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11398h;
    public final g i;
    public final ColorStateList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11399k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f11402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f11403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f11404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f11405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f11406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f11407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11408t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f11409u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11410v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11411w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f11412x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f11413y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11414z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomSheetBehavior() {
        this.f11388a = 0;
        this.f11390b = true;
        this.f11399k = -1;
        this.f11400l = -1;
        this.f11362A = new f(this);
        this.f11367F = 0.5f;
        this.f11369H = -1.0f;
        this.f11372K = true;
        this.f11373L = 4;
        this.f11378Q = 0.1f;
        this.f11384W = new ArrayList();
        this.f11387Z = -1;
        this.f11393c0 = new SparseIntArray();
        this.f11395d0 = new c4.d(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View v(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (AbstractC1826B.h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewV = v(viewGroup.getChildAt(i));
            if (viewV != null) {
                return viewV;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int w(int i, int i7, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i7, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
        }
        if (size != 0) {
            i8 = Math.min(size, i8);
        }
        return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(int i) {
        if (i == -1) {
            if (this.f) {
                return;
            } else {
                this.f = true;
            }
        } else {
            if (!this.f && this.f11396e == i) {
                return;
            }
            this.f = false;
            this.f11396e = Math.max(0, i);
        }
        I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(int i) {
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(i.k(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.f11370I && i == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i);
            return;
        }
        int i7 = (i == 6 && this.f11390b && y(i) <= this.f11365D) ? 3 : i;
        WeakReference weakReference = this.f11382U;
        if (weakReference == null || weakReference.get() == null) {
            C(i);
            return;
        }
        View view = (View) this.f11382U.get();
        a aVar = new a(this, view, i7);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            if (view.isAttachedToWindow()) {
                view.post(aVar);
                return;
            }
        }
        aVar.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(int i) {
        if (this.f11373L == i) {
            return;
        }
        this.f11373L = i;
        if (i != 4 && i != 3 && i != 6) {
            boolean z5 = this.f11370I;
        }
        WeakReference weakReference = this.f11382U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            H(true);
        } else if (i == 6 || i == 5 || i == 4) {
            H(false);
        }
        G(i, true);
        ArrayList arrayList = this.f11384W;
        if (arrayList.size() <= 0) {
            F();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean D(View view, float f) {
        if (this.f11371J) {
            return true;
        }
        if (view.getTop() < this.f11368G) {
            return false;
        }
        return Math.abs(((f * this.f11378Q) + ((float) view.getTop())) - ((float) this.f11368G)) / ((float) t()) > 0.5f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        C(2);
        G(r4, true);
        r2.f11362A.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
    
        if (r1.o(r3.getLeft(), r0) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            int r0 = r2.y(r4)
            D1.d r1 = r2.f11374M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.f1354r = r3
            r3 = -1
            r1.f1342c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f1340a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.f1354r
            if (r5 == 0) goto L30
            r5 = 0
            r1.f1354r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.C(r3)
            r3 = 1
            r2.G(r4, r3)
            c4.f r3 = r2.f11362A
            r3.a(r4)
            return
        L40:
            r2.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F() {
        View view;
        int iA;
        WeakReference weakReference = this.f11382U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1835K.j(view, 524288);
        AbstractC1835K.h(view, 0);
        AbstractC1835K.j(view, 262144);
        AbstractC1835K.h(view, 0);
        AbstractC1835K.j(view, 1048576);
        AbstractC1835K.h(view, 0);
        SparseIntArray sparseIntArray = this.f11393c0;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            AbstractC1835K.j(view, i);
            AbstractC1835K.h(view, 0);
            sparseIntArray.delete(0);
        }
        if (!this.f11390b && this.f11373L != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            l lVar = new l(i, this);
            ArrayList arrayListF = AbstractC1835K.f(view);
            int i7 = 0;
            while (true) {
                if (i7 >= arrayListF.size()) {
                    int i8 = 0;
                    int i9 = -1;
                    while (true) {
                        int[] iArr = AbstractC1835K.f18152d;
                        if (i8 >= 32 || i9 != -1) {
                            break;
                        }
                        int i10 = iArr[i8];
                        boolean z5 = true;
                        for (int i11 = 0; i11 < arrayListF.size(); i11++) {
                            z5 &= ((x1.d) arrayListF.get(i11)).a() != i10;
                        }
                        if (z5) {
                            i9 = i10;
                        }
                        i8++;
                    }
                    iA = i9;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((x1.d) arrayListF.get(i7)).f18340a).getLabel())) {
                        iA = ((x1.d) arrayListF.get(i7)).a();
                        break;
                    }
                    i7++;
                }
            }
            if (iA != -1) {
                x1.d dVar = new x1.d(null, iA, string, lVar, null);
                View.AccessibilityDelegate accessibilityDelegateD = AbstractC1835K.d(view);
                C1839b c1839b = accessibilityDelegateD == null ? null : accessibilityDelegateD instanceof C1838a ? ((C1838a) accessibilityDelegateD).f18180a : new C1839b(accessibilityDelegateD);
                if (c1839b == null) {
                    c1839b = new C1839b();
                }
                AbstractC1835K.m(view, c1839b);
                AbstractC1835K.j(view, dVar.a());
                AbstractC1835K.f(view).add(dVar);
                AbstractC1835K.h(view, 0);
            }
            sparseIntArray.put(0, iA);
        }
        if (this.f11370I) {
            int i12 = 5;
            if (this.f11373L != 5) {
                AbstractC1835K.k(view, x1.d.f18335l, new l(i12, this));
            }
        }
        int i13 = this.f11373L;
        int i14 = 4;
        int i15 = 3;
        if (i13 == 3) {
            AbstractC1835K.k(view, x1.d.f18334k, new l(this.f11390b ? 4 : 6, this));
            return;
        }
        if (i13 == 4) {
            AbstractC1835K.k(view, x1.d.j, new l(this.f11390b ? 3 : 6, this));
        } else {
            if (i13 != 6) {
                return;
            }
            AbstractC1835K.k(view, x1.d.f18334k, new l(i14, this));
            AbstractC1835K.k(view, x1.d.j, new l(i15, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(int i, boolean z5) {
        g gVar;
        if (i == 2) {
            return;
        }
        boolean z6 = this.f11373L == 3 && (this.f11412x || z());
        if (this.f11414z == z6 || (gVar = this.i) == null) {
            return;
        }
        this.f11414z = z6;
        ValueAnimator valueAnimator = this.f11363B;
        if (z5 && valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(gVar.f16505q.i, z6 ? s() : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float fS = this.f11414z ? s() : 1.0f;
        s4.f fVar = gVar.f16505q;
        if (fVar.i != fS) {
            fVar.i = fS;
            gVar.f16509u = true;
            gVar.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(boolean z5) {
        WeakReference weakReference = this.f11382U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.f11391b0 != null) {
                    return;
                } else {
                    this.f11391b0 = new HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.f11382U.get() && z5) {
                    this.f11391b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z5) {
                return;
            }
            this.f11391b0 = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() {
        View view;
        if (this.f11382U != null) {
            r();
            if (this.f11373L != 4 || (view = (View) this.f11382U.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void c(e eVar) {
        this.f11382U = null;
        this.f11374M = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void e() {
        this.f11382U = null;
        this.f11374M = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i;
        d dVar;
        if (!view.isShown() || !this.f11372K) {
            this.f11375N = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11386Y = -1;
            this.f11387Z = -1;
            VelocityTracker velocityTracker = this.f11385X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f11385X = null;
            }
        }
        if (this.f11385X == null) {
            this.f11385X = VelocityTracker.obtain();
        }
        this.f11385X.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f11387Z = (int) motionEvent.getY();
            if (this.f11373L != 2) {
                WeakReference weakReference = this.f11383V;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.o(view2, x6, this.f11387Z)) {
                    this.f11386Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f11389a0 = true;
                }
            }
            this.f11375N = this.f11386Y == -1 && !coordinatorLayout.o(view, x6, this.f11387Z);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11389a0 = false;
            this.f11386Y = -1;
            if (this.f11375N) {
                this.f11375N = false;
                return false;
            }
        }
        if (this.f11375N || (dVar = this.f11374M) == null || !dVar.p(motionEvent)) {
            WeakReference weakReference2 = this.f11383V;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f11375N || this.f11373L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f11374M == null || (i = this.f11387Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.f11374M.f1341b) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        if (this.f11382U == null) {
            this.f11397g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z5 = (Build.VERSION.SDK_INT < 29 || this.f11402n || this.f) ? false : true;
            if (this.f11403o || this.f11404p || this.f11405q || this.f11407s || this.f11408t || this.f11409u || z5) {
                m.d(view, new c(this, z5));
            }
            AbstractC1835K.o(view, new c4.g(view));
            this.f11382U = new WeakReference(view);
            Context context = view.getContext();
            C3.a.N(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            C3.a.M(context, R.attr.motionDurationMedium2, 300);
            C3.a.M(context, R.attr.motionDurationShort3, 150);
            C3.a.M(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
            g gVar = this.i;
            if (gVar != null) {
                view.setBackground(gVar);
                float fE = this.f11369H;
                if (fE == -1.0f) {
                    fE = AbstractC1826B.e(view);
                }
                gVar.j(fE);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    AbstractC1826B.i(view, colorStateList);
                }
            }
            F();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.f11374M == null) {
            this.f11374M = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f11395d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.f11380S = coordinatorLayout.getWidth();
        this.f11381T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f11379R = height;
        int iMin = this.f11381T;
        int i7 = iMin - height;
        int i8 = this.f11411w;
        if (i7 < i8) {
            boolean z6 = this.f11406r;
            int i9 = this.f11400l;
            if (z6) {
                if (i9 != -1) {
                    iMin = Math.min(iMin, i9);
                }
                this.f11379R = iMin;
            } else {
                int iMin2 = iMin - i8;
                if (i9 != -1) {
                    iMin2 = Math.min(iMin2, i9);
                }
                this.f11379R = iMin2;
            }
        }
        this.f11365D = Math.max(0, this.f11381T - this.f11379R);
        this.f11366E = (int) ((1.0f - this.f11367F) * this.f11381T);
        r();
        int i10 = this.f11373L;
        if (i10 == 3) {
            view.offsetTopAndBottom(x());
        } else if (i10 == 6) {
            view.offsetTopAndBottom(this.f11366E);
        } else if (this.f11370I && i10 == 5) {
            view.offsetTopAndBottom(this.f11381T);
        } else if (i10 == 4) {
            view.offsetTopAndBottom(this.f11368G);
        } else if (i10 == 1 || i10 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        G(this.f11373L, false);
        this.f11383V = new WeakReference(v(view));
        ArrayList arrayList = this.f11384W;
        if (arrayList.size() <= 0) {
            return true;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, this.f11399k, marginLayoutParams.width), w(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.f11400l, marginLayoutParams.height));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean i(View view) {
        WeakReference weakReference = this.f11383V;
        return (weakReference == null || view != weakReference.get() || this.f11373L == 3) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void j(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i7, int[] iArr, int i8) {
        if (i8 == 1) {
            return;
        }
        WeakReference weakReference = this.f11383V;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i9 = top - i7;
        boolean z5 = this.f11372K;
        if (i7 > 0) {
            if (i9 < x()) {
                int iX = top - x();
                iArr[1] = iX;
                int i10 = -iX;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                view.offsetTopAndBottom(i10);
                C(3);
            } else {
                if (!z5) {
                    return;
                }
                iArr[1] = i7;
                WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
                view.offsetTopAndBottom(-i7);
                C(1);
            }
        } else if (i7 < 0 && !view2.canScrollVertically(-1)) {
            int i11 = this.f11368G;
            if (i9 > i11 && !this.f11370I) {
                int i12 = top - i11;
                iArr[1] = i12;
                int i13 = -i12;
                WeakHashMap weakHashMap3 = AbstractC1835K.f18149a;
                view.offsetTopAndBottom(i13);
                C(4);
            } else {
                if (!z5) {
                    return;
                }
                iArr[1] = i7;
                WeakHashMap weakHashMap4 = AbstractC1835K.f18149a;
                view.offsetTopAndBottom(-i7);
                C(1);
            }
        }
        u(view.getTop());
        this.f11376O = i7;
        this.f11377P = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void m(View view, Parcelable parcelable) {
        c4.e eVar = (c4.e) parcelable;
        int i = this.f11388a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.f11396e = eVar.f10244t;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f11390b = eVar.f10245u;
            }
            if (i == -1 || (i & 4) == 4) {
                this.f11370I = eVar.f10246v;
            }
            if (i == -1 || (i & 8) == 8) {
                this.f11371J = eVar.f10247w;
            }
        }
        int i7 = eVar.f10243s;
        if (i7 == 1 || i7 == 2) {
            this.f11373L = 4;
        } else {
            this.f11373L = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c4.e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean o(View view, int i, int i7) {
        this.f11376O = 0;
        this.f11377P = false;
        return (i & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    @Override // i1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.view.View r4, android.view.View r5, int r6) {
        /*
            r3 = this;
            int r6 = r4.getTop()
            int r0 = r3.x()
            r1 = 3
            if (r6 != r0) goto Lf
            r3.C(r1)
            return
        Lf:
            java.lang.ref.WeakReference r6 = r3.f11383V
            if (r6 == 0) goto Lb5
            java.lang.Object r6 = r6.get()
            if (r5 != r6) goto Lb5
            boolean r5 = r3.f11377P
            if (r5 != 0) goto L1f
            goto Lb5
        L1f:
            int r5 = r3.f11376O
            r6 = 6
            if (r5 <= 0) goto L34
            boolean r5 = r3.f11390b
            if (r5 == 0) goto L2a
            goto Laf
        L2a:
            int r5 = r4.getTop()
            int r0 = r3.f11366E
            if (r5 <= r0) goto Laf
            goto Lae
        L34:
            boolean r5 = r3.f11370I
            if (r5 == 0) goto L55
            android.view.VelocityTracker r5 = r3.f11385X
            if (r5 != 0) goto L3e
            r5 = 0
            goto L4d
        L3e:
            r0 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f11392c
            r5.computeCurrentVelocity(r0, r2)
            android.view.VelocityTracker r5 = r3.f11385X
            int r0 = r3.f11386Y
            float r5 = r5.getYVelocity(r0)
        L4d:
            boolean r5 = r3.D(r4, r5)
            if (r5 == 0) goto L55
            r1 = 5
            goto Laf
        L55:
            int r5 = r3.f11376O
            r0 = 4
            if (r5 != 0) goto L93
            int r5 = r4.getTop()
            boolean r2 = r3.f11390b
            if (r2 == 0) goto L74
            int r6 = r3.f11365D
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r2 = r3.f11368G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L97
            goto Laf
        L74:
            int r2 = r3.f11366E
            if (r5 >= r2) goto L83
            int r0 = r3.f11368G
            int r0 = r5 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r5 >= r0) goto Lae
            goto Laf
        L83:
            int r1 = r5 - r2
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f11368G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
            goto Lae
        L93:
            boolean r5 = r3.f11390b
            if (r5 == 0) goto L99
        L97:
            r1 = r0
            goto Laf
        L99:
            int r5 = r4.getTop()
            int r1 = r3.f11366E
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f11368G
            int r5 = r5 - r2
            int r5 = java.lang.Math.abs(r5)
            if (r1 >= r5) goto L97
        Lae:
            r1 = r6
        Laf:
            r5 = 0
            r3.E(r4, r1, r5)
            r3.f11377P = r5
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.p(android.view.View, android.view.View, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f11373L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        d dVar = this.f11374M;
        if (dVar != null && (this.f11372K || i == 1)) {
            dVar.j(motionEvent);
        }
        if (actionMasked == 0) {
            this.f11386Y = -1;
            this.f11387Z = -1;
            VelocityTracker velocityTracker = this.f11385X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f11385X = null;
            }
        }
        if (this.f11385X == null) {
            this.f11385X = VelocityTracker.obtain();
        }
        this.f11385X.addMovement(motionEvent);
        if (this.f11374M != null && ((this.f11372K || this.f11373L == 1) && actionMasked == 2 && !this.f11375N)) {
            float fAbs = Math.abs(this.f11387Z - motionEvent.getY());
            d dVar2 = this.f11374M;
            if (fAbs > dVar2.f1341b) {
                dVar2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f11375N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        int iT = t();
        if (this.f11390b) {
            this.f11368G = Math.max(this.f11381T - iT, this.f11365D);
        } else {
            this.f11368G = this.f11381T - iT;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float s() {
        /*
            r5 = this;
            s4.g r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.f11382U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.f11382U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.z()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            s4.g r2 = r5.i
            s4.f r3 = r2.f16505q
            s4.k r3 = r3.f16479a
            s4.c r3 = r3.f16529e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = B3.e.d(r0)
            if (r3 == 0) goto L4e
            int r3 = c4.a.b(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            s4.g r2 = r5.i
            s4.f r4 = r2.f16505q
            s4.k r4 = r4.f16479a
            s4.c r4 = r4.f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = B3.e.s(r0)
            if (r0 == 0) goto L74
            int r0 = c4.a.b(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.s():float");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t() {
        int i;
        return this.f ? Math.min(Math.max(this.f11397g, this.f11381T - ((this.f11380S * 9) / 16)), this.f11379R) + this.f11410v : (this.f11402n || this.f11403o || (i = this.f11401m) <= 0) ? this.f11396e + this.f11410v : Math.max(this.f11396e, i + this.f11398h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(int i) {
        if (((View) this.f11382U.get()) != null) {
            ArrayList arrayList = this.f11384W;
            if (arrayList.isEmpty()) {
                return;
            }
            int i7 = this.f11368G;
            if (i <= i7 && i7 != x()) {
                x();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int x() {
        if (this.f11390b) {
            return this.f11365D;
        }
        return Math.max(this.f11364C, this.f11406r ? 0 : this.f11411w);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int y(int i) {
        if (i == 3) {
            return x();
        }
        if (i == 4) {
            return this.f11368G;
        }
        if (i == 5) {
            return this.f11381T;
        }
        if (i == 6) {
            return this.f11366E;
        }
        throw new IllegalArgumentException(i.i(i, "Invalid state to get top offset: "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean z() {
        WeakReference weakReference = this.f11382U;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f11382U.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i;
        this.f11388a = 0;
        this.f11390b = true;
        this.f11399k = -1;
        this.f11400l = -1;
        this.f11362A = new f(this);
        this.f11367F = 0.5f;
        this.f11369H = -1.0f;
        this.f11372K = true;
        this.f11373L = 4;
        this.f11378Q = 0.1f;
        this.f11384W = new ArrayList();
        this.f11387Z = -1;
        this.f11393c0 = new SparseIntArray();
        this.f11395d0 = new c4.d(this, 0);
        this.f11398h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7977c);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.j = I1.Z(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            this.f11413y = k.b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).a();
        }
        k kVar = this.f11413y;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.i = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(s(), 1.0f);
        this.f11363B = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f11363B.addUpdateListener(new c4.b(0, this));
        this.f11369H = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f11399k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.f11400l = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(9);
        if (typedValuePeekValue != null && (i = typedValuePeekValue.data) == -1) {
            A(i);
        } else {
            A(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(8, false);
        if (this.f11370I != z5) {
            this.f11370I = z5;
            if (!z5 && this.f11373L == 5) {
                B(4);
            }
            F();
        }
        this.f11402n = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f11390b != z6) {
            this.f11390b = z6;
            if (this.f11382U != null) {
                r();
            }
            C((this.f11390b && this.f11373L == 6) ? 3 : this.f11373L);
            G(this.f11373L, true);
            F();
        }
        this.f11371J = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.f11372K = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.f11388a = typedArrayObtainStyledAttributes.getInt(10, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(7, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.f11367F = f;
            if (this.f11382U != null) {
                this.f11366E = (int) ((1.0f - f) * this.f11381T);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(5);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i7 = typedValuePeekValue2.data;
                if (i7 >= 0) {
                    this.f11364C = i7;
                    G(this.f11373L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f11364C = dimensionPixelOffset;
                    G(this.f11373L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f11394d = typedArrayObtainStyledAttributes.getInt(11, 500);
            this.f11403o = typedArrayObtainStyledAttributes.getBoolean(17, false);
            this.f11404p = typedArrayObtainStyledAttributes.getBoolean(18, false);
            this.f11405q = typedArrayObtainStyledAttributes.getBoolean(19, false);
            this.f11406r = typedArrayObtainStyledAttributes.getBoolean(20, true);
            this.f11407s = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f11408t = typedArrayObtainStyledAttributes.getBoolean(15, false);
            this.f11409u = typedArrayObtainStyledAttributes.getBoolean(16, false);
            this.f11412x = typedArrayObtainStyledAttributes.getBoolean(23, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f11392c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // i1.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i7, int i8, int[] iArr) {
    }
}
