package com.google.android.material.sidesheet;

import C0.S;
import C3.a;
import D1.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c4.f;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.wnapp.smspariaz.R;
import i1.b;
import i1.e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.i;
import s4.g;
import s4.j;
import s4.k;
import t4.c;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import x1.o;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public I1 f11575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f11576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f11577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f11578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f11579e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11580g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11581h;
    public d i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f11582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f11583l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11584m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11585n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11586o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference f11587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f11588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f11589r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public VelocityTracker f11590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f11592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c4.d f11593v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SideSheetBehavior() {
        this.f11579e = new f(this);
        this.f11580g = true;
        this.f11581h = 5;
        this.f11582k = 0.1f;
        this.f11589r = -1;
        this.f11592u = new LinkedHashSet();
        this.f11593v = new c4.d(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void c(e eVar) {
        this.f11587p = null;
        this.i = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void e() {
        this.f11587p = null;
        this.i = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        d dVar;
        VelocityTracker velocityTracker;
        if ((!view.isShown() && AbstractC1835K.e(view) == null) || !this.f11580g) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f11590s) != null) {
            velocityTracker.recycle();
            this.f11590s = null;
        }
        if (this.f11590s == null) {
            this.f11590s = VelocityTracker.obtain();
        }
        this.f11590s.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f11591t = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.j) {
            this.j = false;
            return false;
        }
        return (this.j || (dVar = this.i) == null || !dVar.p(motionEvent)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        View view3;
        int i7;
        View viewFindViewById;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        int i8 = 1;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        WeakReference weakReference = this.f11587p;
        g gVar = this.f11576b;
        int iI0 = 0;
        if (weakReference == null) {
            this.f11587p = new WeakReference(view);
            Context context = view.getContext();
            a.N(context, R.attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f));
            a.M(context, R.attr.motionDurationMedium2, 300);
            a.M(context, R.attr.motionDurationShort3, 150);
            a.M(context, R.attr.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
            if (gVar != null) {
                view.setBackground(gVar);
                float fE = this.f;
                if (fE == -1.0f) {
                    fE = AbstractC1826B.e(view);
                }
                gVar.j(fE);
            } else {
                ColorStateList colorStateList = this.f11577c;
                if (colorStateList != null) {
                    AbstractC1826B.i(view, colorStateList);
                }
            }
            int i9 = this.f11581h == 5 ? 4 : 0;
            if (view.getVisibility() != i9) {
                view.setVisibility(i9);
            }
            u();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (AbstractC1835K.e(view) == null) {
                AbstractC1835K.n(view, view.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i10 = Gravity.getAbsoluteGravity(((e) view.getLayoutParams()).f13540c, i) == 3 ? 1 : 0;
        I1 i12 = this.f11575a;
        if (i12 == null || i12.m0() != i10) {
            e eVar = null;
            k kVar = this.f11578d;
            if (i10 == 0) {
                this.f11575a = new t4.a(this, i8);
                if (kVar != null) {
                    WeakReference weakReference2 = this.f11587p;
                    if (weakReference2 != null && (view3 = (View) weakReference2.get()) != null && (view3.getLayoutParams() instanceof e)) {
                        eVar = (e) view3.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).rightMargin <= 0) {
                        j jVarE = kVar.e();
                        jVarE.f = new s4.a(0.0f);
                        jVarE.f16521g = new s4.a(0.0f);
                        k kVarA = jVarE.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA);
                        }
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalArgumentException(S.m("Invalid sheet edge position value: ", ". Must be 0 or 1.", i10));
                }
                this.f11575a = new t4.a(this, iI0);
                if (kVar != null) {
                    WeakReference weakReference3 = this.f11587p;
                    if (weakReference3 != null && (view2 = (View) weakReference3.get()) != null && (view2.getLayoutParams() instanceof e)) {
                        eVar = (e) view2.getLayoutParams();
                    }
                    if (eVar == null || ((ViewGroup.MarginLayoutParams) eVar).leftMargin <= 0) {
                        j jVarE2 = kVar.e();
                        jVarE2.f16520e = new s4.a(0.0f);
                        jVarE2.f16522h = new s4.a(0.0f);
                        k kVarA2 = jVarE2.a();
                        if (gVar != null) {
                            gVar.setShapeAppearanceModel(kVarA2);
                        }
                    }
                }
            }
        }
        if (this.i == null) {
            this.i = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f11593v);
        }
        int iI02 = this.f11575a.i0(view);
        coordinatorLayout.q(view, i);
        this.f11584m = coordinatorLayout.getWidth();
        this.f11585n = this.f11575a.j0(coordinatorLayout);
        this.f11583l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f11586o = marginLayoutParams != null ? this.f11575a.K(marginLayoutParams) : 0;
        int i11 = this.f11581h;
        if (i11 == 1 || i11 == 2) {
            iI0 = iI02 - this.f11575a.i0(view);
        } else if (i11 != 3) {
            if (i11 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f11581h);
            }
            iI0 = this.f11575a.f0();
        }
        view.offsetLeftAndRight(iI0);
        if (this.f11588q == null && (i7 = this.f11589r) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i7)) != null) {
            this.f11588q = new WeakReference(viewFindViewById);
        }
        Iterator it = this.f11592u.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void m(View view, Parcelable parcelable) {
        int i = ((c) parcelable).f16744s;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.f11581h = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final Parcelable n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean q(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f11581h == 1 && actionMasked == 0) {
            return true;
        }
        if (s()) {
            this.i.j(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f11590s) != null) {
            velocityTracker.recycle();
            this.f11590s = null;
        }
        if (this.f11590s == null) {
            this.f11590s = VelocityTracker.obtain();
        }
        this.f11590s.addMovement(motionEvent);
        if (s() && actionMasked == 2 && !this.j && s()) {
            float fAbs = Math.abs(this.f11591t - motionEvent.getX());
            d dVar = this.i;
            if (fAbs > dVar.f1341b) {
                dVar.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r(int i) {
        View view;
        if (this.f11581h == i) {
            return;
        }
        this.f11581h = i;
        WeakReference weakReference = this.f11587p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i7 = this.f11581h == 5 ? 4 : 0;
        if (view.getVisibility() != i7) {
            view.setVisibility(i7);
        }
        Iterator it = this.f11592u.iterator();
        if (it.hasNext()) {
            throw i.h(it);
        }
        u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s() {
        if (this.i != null) {
            return this.f11580g || this.f11581h == 1;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        if (r1.o(r0, r3.getTop()) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        r(2);
        r2.f11579e.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(android.view.View r3, int r4, boolean r5) {
        /*
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            com.google.android.gms.internal.measurement.I1 r0 = r2.f11575a
            int r0 = r0.f0()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = k1.i.i(r4, r5)
            r3.<init>(r4)
            throw r3
        L19:
            com.google.android.gms.internal.measurement.I1 r0 = r2.f11575a
            int r0 = r0.e0()
        L1f:
            D1.d r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.f1354r = r3
            r3 = -1
            r1.f1342c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f1340a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.f1354r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.f1354r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.r(r3)
            c4.f r3 = r2.f11579e
            r3.a(r4)
            return
        L57:
            r2.r(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.t(android.view.View, int, boolean):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u() {
        View view;
        WeakReference weakReference = this.f11587p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        AbstractC1835K.j(view, 262144);
        AbstractC1835K.h(view, 0);
        AbstractC1835K.j(view, 1048576);
        AbstractC1835K.h(view, 0);
        final int i = 5;
        if (this.f11581h != 5) {
            AbstractC1835K.k(view, x1.d.f18335l, new o() { // from class: t4.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // x1.o
                public final boolean a(View view2) {
                    int i7 = i;
                    int i8 = 1;
                    if (i7 == 1 || i7 == 2) {
                        throw new IllegalArgumentException(i.k(new StringBuilder("STATE_"), i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f16742q;
                    WeakReference weakReference2 = sideSheetBehavior.f11587p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i7);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f11587p.get();
                    m1.j jVar = new m1.j(i7, i8, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(jVar);
                            return true;
                        }
                    }
                    jVar.run();
                    return true;
                }
            });
        }
        final int i7 = 3;
        if (this.f11581h != 3) {
            AbstractC1835K.k(view, x1.d.j, new o() { // from class: t4.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // x1.o
                public final boolean a(View view2) {
                    int i72 = i7;
                    int i8 = 1;
                    if (i72 == 1 || i72 == 2) {
                        throw new IllegalArgumentException(i.k(new StringBuilder("STATE_"), i72 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
                    }
                    SideSheetBehavior sideSheetBehavior = this.f16742q;
                    WeakReference weakReference2 = sideSheetBehavior.f11587p;
                    if (weakReference2 == null || weakReference2.get() == null) {
                        sideSheetBehavior.r(i72);
                        return true;
                    }
                    View view3 = (View) sideSheetBehavior.f11587p.get();
                    m1.j jVar = new m1.j(i72, i8, sideSheetBehavior);
                    ViewParent parent = view3.getParent();
                    if (parent != null && parent.isLayoutRequested()) {
                        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                        if (view3.isAttachedToWindow()) {
                            view3.post(jVar);
                            return true;
                        }
                    }
                    jVar.run();
                    return true;
                }
            });
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        this.f11579e = new f(this);
        this.f11580g = true;
        this.f11581h = 5;
        this.f11582k = 0.1f;
        this.f11589r = -1;
        this.f11592u = new LinkedHashSet();
        this.f11593v = new c4.d(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V3.a.f7969B);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f11577c = I1.Z(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f11578d = k.b(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, -1);
            this.f11589r = resourceId;
            WeakReference weakReference = this.f11588q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f11588q = null;
            WeakReference weakReference2 = this.f11587p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                    if (view.isLaidOut()) {
                        view.requestLayout();
                    }
                }
            }
        }
        k kVar = this.f11578d;
        if (kVar != null) {
            g gVar = new g(kVar);
            this.f11576b = gVar;
            gVar.i(context);
            ColorStateList colorStateList = this.f11577c;
            if (colorStateList != null) {
                this.f11576b.k(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f11576b.setTint(typedValue.data);
            }
        }
        this.f = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        this.f11580g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
