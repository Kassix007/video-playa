package androidx.coordinatorlayout.widget;

import E.c0;
import I2.A;
import M.C0231t;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.wnapp.smspariaz.R;
import h1.AbstractC1120a;
import i1.C1134a;
import i1.b;
import i1.d;
import i1.e;
import i1.f;
import i1.g;
import i1.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import r.Q;
import v1.c;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.InterfaceC1848k;
import w1.InterfaceC1849l;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC1848k, InterfaceC1849l {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final String f9397J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Class[] f9398K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final ThreadLocal f9399L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final A f9400M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final c f9401N;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f9402A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public f f9403B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f9404C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public o0 f9405D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9406E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Drawable f9407F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f9408G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public C1134a f9409H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0231t f9410I;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f9411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f9412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f9413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f9414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f9415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int[] f9416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f9419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f9420z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f9397J = r02 != null ? r02.getName() : null;
        f9400M = new A(7);
        f9398K = new Class[]{Context.class, AttributeSet.class};
        f9399L = new ThreadLocal();
        f9401N = new c(12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f9411q = new ArrayList();
        this.f9412r = new c0(11);
        this.f9413s = new ArrayList();
        this.f9414t = new ArrayList();
        this.f9415u = new int[2];
        this.f9416v = new int[2];
        this.f9410I = new C0231t();
        int[] iArr = AbstractC1120a.f13440a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f9419y = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                this.f9419y[i] = (int) (r1[i] * f);
            }
        }
        this.f9407F = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new d(this));
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Rect c() {
        Rect rect = (Rect) f9401N.a();
        return rect == null ? new Rect() : rect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(int i, Rect rect, Rect rect2, e eVar, int i7, int i8) {
        int i9 = eVar.f13540c;
        if (i9 == 0) {
            i9 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i);
        int i10 = eVar.f13541d;
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        if ((i10 & 112) == 0) {
            i10 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i10, i);
        int i11 = absoluteGravity & 7;
        int i12 = absoluteGravity & 112;
        int i13 = absoluteGravity2 & 7;
        int i14 = absoluteGravity2 & 112;
        int iWidth = i13 != 1 ? i13 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i14 != 16 ? i14 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i11 == 1) {
            iWidth -= i7 / 2;
        } else if (i11 != 5) {
            iWidth -= i7;
        }
        if (i12 == 16) {
            iHeight -= i8 / 2;
        } else if (i12 != 80) {
            iHeight -= i8;
        }
        rect2.set(iWidth, iHeight, i7 + iWidth, i8 + iHeight);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e n(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f13539b) {
            i1.c cVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cVar = (i1.c) superclass.getAnnotation(i1.c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    b bVar = (b) cVar.value().getDeclaredConstructor(null).newInstance(null);
                    b bVar2 = eVar.f13538a;
                    if (bVar2 != bVar) {
                        if (bVar2 != null) {
                            bVar2.e();
                        }
                        eVar.f13538a = bVar;
                        eVar.f13539b = true;
                        if (bVar != null) {
                            bVar.c(eVar);
                        }
                    }
                } catch (Exception e7) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e7);
                }
            }
            eVar.f13539b = true;
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i7 = eVar.i;
        if (i7 != i) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            view.offsetLeftAndRight(i - i7);
            eVar.i = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void v(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int i7 = eVar.j;
        if (i7 != i) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            view.offsetTopAndBottom(i - i7);
            eVar.j = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void a(View view, View view2, int i, int i7) {
        C0231t c0231t = this.f9410I;
        if (i7 == 1) {
            c0231t.f3617b = i;
        } else {
            c0231t.f3616a = i;
        }
        this.f9402A = view2;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            ((e) getChildAt(i8).getLayoutParams()).getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void b(View view, int i) {
        C0231t c0231t = this.f9410I;
        if (i == 1) {
            c0231t.f3617b = 0;
        } else {
            c0231t.f3616a = 0;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i)) {
                b bVar = eVar.f13538a;
                if (bVar != null) {
                    bVar.p(childAt, view, i);
                }
                if (i == 0) {
                    eVar.f13547m = false;
                } else if (i == 1) {
                    eVar.f13548n = false;
                }
            }
        }
        this.f9402A = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void d(View view, int i, int i7, int[] iArr, int i8) {
        b bVar;
        int childCount = getChildCount();
        boolean z5 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i8) && (bVar = eVar.f13538a) != null) {
                    int[] iArr2 = this.f9415u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.j(this, childAt, view, i, i7, iArr2, i8);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z5) {
            p(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        b bVar = ((e) view.getLayoutParams()).f13538a;
        if (bVar != null) {
            bVar.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f9407F;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(e eVar, Rect rect, int i, int i7) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i7) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i7 + iMax2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(View view, Rect rect, boolean z5) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z5) {
            k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList g(View view) {
        Q q7 = (Q) this.f9412r.f1553r;
        int i = q7.f16166s;
        ArrayList arrayList = null;
        for (int i7 = 0; i7 < i; i7++) {
            ArrayList arrayList2 = (ArrayList) q7.i(i7);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(q7.f(i7));
            }
        }
        ArrayList arrayList3 = this.f9414t;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<View> getDependencySortedChildren() {
        s();
        return Collections.unmodifiableList(this.f9411q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final o0 getLastWindowInsets() {
        return this.f9405D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0231t c0231t = this.f9410I;
        return c0231t.f3617b | c0231t.f3616a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Drawable getStatusBarBackground() {
        return this.f9407F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1849l
    public final void h(View view, int i, int i7, int i8, int i9, int i10, int[] iArr) {
        b bVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z5 = false;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i10) && (bVar = eVar.f13538a) != null) {
                    int[] iArr2 = this.f9415u;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    bVar.k(this, childAt, i7, i8, i9, iArr2);
                    iMax = i8 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i9 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z5 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z5) {
            p(1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void i(View view, int i, int i7, int i8, int i9, int i10) {
        h(view, i, i7, i8, i9, 0, this.f9416v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final boolean j(View view, View view2, int i, int i7) {
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b bVar = eVar.f13538a;
                if (bVar != null) {
                    boolean zO = bVar.o(childAt, i, i7);
                    z5 |= zO;
                    if (i7 == 0) {
                        eVar.f13547m = zO;
                    } else if (i7 == 1) {
                        eVar.f13548n = zO;
                    }
                } else if (i7 == 0) {
                    eVar.f13547m = false;
                } else if (i7 == 1) {
                    eVar.f13548n = false;
                }
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(View view, Rect rect) {
        ThreadLocal threadLocal = h.f13552a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = h.f13552a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        h.a(this, view, matrix);
        ThreadLocal threadLocal3 = h.f13553b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int m(int i) {
        int[] iArr = this.f9419y;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(View view, int i, int i7) {
        c cVar = f9401N;
        Rect rectC = c();
        k(view, rectC);
        try {
            return rectC.contains(i, i7);
        } finally {
            rectC.setEmpty();
            cVar.c(rectC);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t(false);
        if (this.f9404C) {
            if (this.f9403B == null) {
                this.f9403B = new f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f9403B);
        }
        if (this.f9405D == null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            if (getFitsSystemWindows()) {
                AbstractC1862z.c(this);
            }
        }
        this.f9418x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t(false);
        if (this.f9404C && this.f9403B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f9403B);
        }
        View view = this.f9402A;
        if (view != null) {
            b(view, 0);
        }
        this.f9418x = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f9406E || this.f9407F == null) {
            return;
        }
        o0 o0Var = this.f9405D;
        int iD = o0Var != null ? o0Var.d() : 0;
        if (iD > 0) {
            this.f9407F.setBounds(0, 0, getWidth(), iD);
            this.f9407F.draw(canvas);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t(true);
        }
        boolean zR = r(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zR;
        }
        t(true);
        return zR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        b bVar;
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.f9411q;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            if (view.getVisibility() != 8 && ((bVar = ((e) view.getLayoutParams()).f13538a) == null || !bVar.g(this, view, layoutDirection))) {
                q(view, layoutDirection);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r0.s()
            int r1 = r0.getChildCount()
            r6 = 0
            r2 = r6
        Lb:
            r3 = 1
            if (r2 >= r1) goto L33
            android.view.View r4 = r0.getChildAt(r2)
            E.c0 r5 = r0.f9412r
            java.lang.Object r5 = r5.f1553r
            r.Q r5 = (r.Q) r5
            int r7 = r5.f16166s
            r8 = r6
        L1b:
            if (r8 >= r7) goto L30
            java.lang.Object r9 = r5.i(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L2d
            boolean r9 = r9.contains(r4)
            if (r9 == 0) goto L2d
            r1 = r3
            goto L34
        L2d:
            int r8 = r8 + 1
            goto L1b
        L30:
            int r2 = r2 + 1
            goto Lb
        L33:
            r1 = r6
        L34:
            boolean r2 = r0.f9404C
            if (r1 == r2) goto L68
            if (r1 == 0) goto L55
            boolean r1 = r0.f9418x
            if (r1 == 0) goto L52
            i1.f r1 = r0.f9403B
            if (r1 != 0) goto L49
            i1.f r1 = new i1.f
            r1.<init>(r0)
            r0.f9403B = r1
        L49:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            i1.f r2 = r0.f9403B
            r1.addOnPreDrawListener(r2)
        L52:
            r0.f9404C = r3
            goto L68
        L55:
            boolean r1 = r0.f9418x
            if (r1 == 0) goto L66
            i1.f r1 = r0.f9403B
            if (r1 == 0) goto L66
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            i1.f r2 = r0.f9403B
            r1.removeOnPreDrawListener(r2)
        L66:
            r0.f9404C = r6
        L68:
            int r7 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r8 = r0.getPaddingRight()
            int r2 = r0.getPaddingBottom()
            java.util.WeakHashMap r4 = w1.AbstractC1835K.f18149a
            int r9 = r0.getLayoutDirection()
            if (r9 != r3) goto L82
            r10 = r3
            goto L83
        L82:
            r10 = r6
        L83:
            int r11 = android.view.View.MeasureSpec.getMode(r27)
            int r12 = android.view.View.MeasureSpec.getSize(r27)
            int r13 = android.view.View.MeasureSpec.getMode(r28)
            int r14 = android.view.View.MeasureSpec.getSize(r28)
            int r15 = r7 + r8
            int r16 = r1 + r2
            int r1 = r0.getSuggestedMinimumWidth()
            int r2 = r0.getSuggestedMinimumHeight()
            w1.o0 r4 = r0.f9405D
            if (r4 == 0) goto Lac
            boolean r4 = r0.getFitsSystemWindows()
            if (r4 == 0) goto Lac
            r17 = r3
            goto Lae
        Lac:
            r17 = r6
        Lae:
            java.util.ArrayList r3 = r0.f9411q
            int r4 = r3.size()
            r5 = r6
            r18 = r5
        Lb7:
            if (r5 >= r4) goto L1dc
            java.lang.Object r19 = r3.get(r5)
            android.view.View r19 = (android.view.View) r19
            int r6 = r19.getVisibility()
            r21 = r1
            r1 = 8
            if (r6 != r1) goto Ld9
            r23 = r3
            r22 = r4
            r19 = r5
            r20 = r7
            r1 = r21
            r24 = 0
            r21 = r8
            goto L1ce
        Ld9:
            android.view.ViewGroup$LayoutParams r1 = r19.getLayoutParams()
            r6 = r1
            i1.e r6 = (i1.e) r6
            int r1 = r6.f13542e
            if (r1 < 0) goto L127
            if (r11 == 0) goto L127
            int r1 = r0.m(r1)
            r22 = r1
            int r1 = r6.f13540c
            if (r1 != 0) goto Lf3
            r1 = 8388661(0x800035, float:1.1755018E-38)
        Lf3:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r9)
            r1 = r1 & 7
            r23 = r2
            r2 = 3
            if (r1 != r2) goto L100
            if (r10 == 0) goto L105
        L100:
            r2 = 5
            if (r1 != r2) goto L114
            if (r10 == 0) goto L114
        L105:
            int r1 = r12 - r8
            int r1 = r1 - r22
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L10e:
            r25 = r4
            r4 = r1
            r1 = r25
            goto L12c
        L114:
            if (r1 != r2) goto L118
            if (r10 == 0) goto L11d
        L118:
            r2 = 3
            if (r1 != r2) goto L125
            if (r10 == 0) goto L125
        L11d:
            int r1 = r22 - r7
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            goto L10e
        L125:
            r2 = 0
            goto L12a
        L127:
            r23 = r2
            goto L125
        L12a:
            r1 = r4
            r4 = r2
        L12c:
            if (r17 == 0) goto L15f
            boolean r20 = r19.getFitsSystemWindows()
            if (r20 != 0) goto L15f
            w1.o0 r2 = r0.f9405D
            int r2 = r2.b()
            r22 = r1
            w1.o0 r1 = r0.f9405D
            int r1 = r1.c()
            int r1 = r1 + r2
            w1.o0 r2 = r0.f9405D
            int r2 = r2.d()
            r24 = r1
            w1.o0 r1 = r0.f9405D
            int r1 = r1.a()
            int r1 = r1 + r2
            int r2 = r12 - r24
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11)
            int r1 = r14 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r13)
            goto L165
        L15f:
            r22 = r1
            r2 = r27
            r1 = r28
        L165:
            i1.b r0 = r6.f13538a
            if (r0 == 0) goto L18b
            r24 = 0
            r20 = r7
            r7 = r21
            r21 = r8
            r8 = r23
            r23 = r3
            r3 = r2
            r2 = r19
            r19 = r5
            r5 = r1
            r1 = r26
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            if (r0 != 0) goto L188
            goto L19d
        L188:
            r0 = r26
            goto L1a3
        L18b:
            r20 = r7
            r7 = r21
            r24 = 0
            r21 = r8
            r8 = r23
            r23 = r3
            r3 = r4
            r4 = r1
            r1 = r19
            r19 = r5
        L19d:
            r5 = 0
            r0 = r26
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L1a3:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r15
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r6.rightMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r7, r2)
            int r3 = r1.getMeasuredHeight()
            int r3 = r3 + r16
            int r4 = r6.topMargin
            int r3 = r3 + r4
            int r4 = r6.bottomMargin
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r8, r3)
            int r1 = r1.getMeasuredState()
            r6 = r18
            int r18 = android.view.View.combineMeasuredStates(r6, r1)
            r1 = r2
            r2 = r3
        L1ce:
            int r5 = r19 + 1
            r7 = r20
            r8 = r21
            r4 = r22
            r3 = r23
            r6 = r24
            goto Lb7
        L1dc:
            r7 = r1
            r8 = r2
            r6 = r18
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r6
            r2 = r27
            int r1 = android.view.View.resolveSizeAndState(r7, r2, r1)
            int r2 = r6 << 16
            r3 = r28
            int r2 = android.view.View.resolveSizeAndState(r8, r3, r2)
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z5) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    b bVar = eVar.f13538a;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        b bVar;
        int childCount = getChildCount();
        boolean zI = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0) && (bVar = eVar.f13538a) != null) {
                    zI |= bVar.i(view);
                }
            }
        }
        return zI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i7, int[] iArr) {
        d(view, i, i7, iArr, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i7, int i8, int i9) {
        i(view, i, i7, i8, i9, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f1163q);
        SparseArray sparseArray = gVar.f13551s;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = n(childAt).f13538a;
            if (id != -1 && bVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                bVar.m(childAt, parcelable2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableN;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            b bVar = ((e) childAt.getLayoutParams()).f13538a;
            if (id != -1 && bVar != null && (parcelableN = bVar.n(childAt)) != null) {
                sparseArray.append(id, parcelableN);
            }
        }
        gVar.f13551s = sparseArray;
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return j(view, view2, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f9420z
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.r(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f9420z
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            i1.e r6 = (i1.e) r6
            i1.b r6 = r6.f13538a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f9420z
            boolean r6 = r6.q(r7, r1)
        L2a:
            android.view.View r7 = r0.f9420z
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.t(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            java.util.WeakHashMap r2 = w1.AbstractC1835K.f18149a
            int r3 = r0.getLayoutDirection()
            java.util.ArrayList r2 = r0.f9411q
            int r9 = r2.size()
            android.graphics.Rect r10 = c()
            android.graphics.Rect r11 = c()
            android.graphics.Rect r12 = c()
            r14 = 0
        L1d:
            v1.c r15 = androidx.coordinatorlayout.widget.CoordinatorLayout.f9401N
            if (r14 >= r9) goto L2bd
            java.lang.Object r4 = r2.get(r14)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            i1.e r5 = (i1.e) r5
            if (r1 != 0) goto L3f
            int r6 = r4.getVisibility()
            r7 = 8
            if (r6 != r7) goto L3f
            r5 = r2
            r2 = r9
            r4 = r12
            r20 = r14
            r6 = 0
            goto L2b6
        L3f:
            r6 = 0
        L40:
            if (r6 >= r14) goto Lf8
            java.lang.Object r8 = r2.get(r6)
            android.view.View r8 = (android.view.View) r8
            android.view.View r7 = r5.f13546l
            if (r7 != r8) goto Lde
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            i1.e r7 = (i1.e) r7
            android.view.View r8 = r7.f13545k
            if (r8 == 0) goto Lde
            android.graphics.Rect r8 = c()
            android.graphics.Rect r13 = c()
            r17 = r5
            android.graphics.Rect r5 = c()
            r18 = r3
            android.view.View r3 = r7.f13545k
            r0.k(r3, r8)
            r3 = 0
            r0.f(r4, r13, r3)
            r3 = r6
            r6 = r7
            int r7 = r4.getMeasuredWidth()
            r19 = r4
            r4 = r8
            int r8 = r19.getMeasuredHeight()
            r20 = r17
            r17 = r2
            r2 = r20
            r20 = r18
            r18 = r3
            r3 = r20
            r20 = r14
            r14 = r19
            l(r3, r4, r5, r6, r7, r8)
            r19 = r9
            int r9 = r5.left
            r21 = r12
            int r12 = r13.left
            if (r9 != r12) goto La3
            int r9 = r5.top
            int r12 = r13.top
            if (r9 == r12) goto La0
            goto La3
        La0:
            r16 = 0
            goto La5
        La3:
            r16 = 1
        La5:
            r0.e(r6, r5, r7, r8)
            int r7 = r5.left
            int r8 = r13.left
            int r7 = r7 - r8
            int r8 = r5.top
            int r9 = r13.top
            int r8 = r8 - r9
            if (r7 == 0) goto Lb9
            java.util.WeakHashMap r9 = w1.AbstractC1835K.f18149a
            r14.offsetLeftAndRight(r7)
        Lb9:
            if (r8 == 0) goto Lc0
            java.util.WeakHashMap r7 = w1.AbstractC1835K.f18149a
            r14.offsetTopAndBottom(r8)
        Lc0:
            if (r16 == 0) goto Lcb
            i1.b r7 = r6.f13538a
            if (r7 == 0) goto Lcb
            android.view.View r6 = r6.f13545k
            r7.d(r0, r14, r6)
        Lcb:
            r4.setEmpty()
            r15.c(r4)
            r13.setEmpty()
            r15.c(r13)
            r5.setEmpty()
            r15.c(r5)
            goto Lea
        Lde:
            r17 = r2
            r2 = r5
            r18 = r6
            r19 = r9
            r21 = r12
            r20 = r14
            r14 = r4
        Lea:
            int r6 = r18 + 1
            r5 = r2
            r4 = r14
            r2 = r17
            r9 = r19
            r14 = r20
            r12 = r21
            goto L40
        Lf8:
            r17 = r2
            r2 = r5
            r19 = r9
            r21 = r12
            r20 = r14
            r14 = r4
            r4 = 1
            r0.f(r14, r11, r4)
            int r5 = r2.f13543g
            r6 = 5
            r7 = 3
            r8 = 80
            r9 = 48
            if (r5 == 0) goto L15e
            boolean r5 = r11.isEmpty()
            if (r5 != 0) goto L15e
            int r5 = r2.f13543g
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r3)
            r12 = r5 & 112(0x70, float:1.57E-43)
            if (r12 == r9) goto L133
            if (r12 == r8) goto L123
            goto L13d
        L123:
            int r12 = r10.bottom
            int r13 = r0.getHeight()
            int r4 = r11.top
            int r13 = r13 - r4
            int r4 = java.lang.Math.max(r12, r13)
            r10.bottom = r4
            goto L13d
        L133:
            int r4 = r10.top
            int r12 = r11.bottom
            int r4 = java.lang.Math.max(r4, r12)
            r10.top = r4
        L13d:
            r4 = r5 & 7
            if (r4 == r7) goto L154
            if (r4 == r6) goto L144
            goto L15e
        L144:
            int r4 = r10.right
            int r5 = r0.getWidth()
            int r12 = r11.left
            int r5 = r5 - r12
            int r4 = java.lang.Math.max(r4, r5)
            r10.right = r4
            goto L15e
        L154:
            int r4 = r10.left
            int r5 = r11.right
            int r4 = java.lang.Math.max(r4, r5)
            r10.left = r4
        L15e:
            int r2 = r2.f13544h
            if (r2 == 0) goto L26c
            int r2 = r14.getVisibility()
            if (r2 != 0) goto L26c
            java.util.WeakHashMap r2 = w1.AbstractC1835K.f18149a
            boolean r2 = r14.isLaidOut()
            if (r2 != 0) goto L172
            goto L26c
        L172:
            int r2 = r14.getWidth()
            if (r2 <= 0) goto L26c
            int r2 = r14.getHeight()
            if (r2 > 0) goto L180
            goto L26c
        L180:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            i1.e r2 = (i1.e) r2
            i1.b r4 = r2.f13538a
            android.graphics.Rect r5 = c()
            android.graphics.Rect r12 = c()
            int r13 = r14.getLeft()
            int r6 = r14.getTop()
            int r7 = r14.getRight()
            int r8 = r14.getBottom()
            r12.set(r13, r6, r7, r8)
            if (r4 == 0) goto L1d6
            boolean r4 = r4.a(r14)
            if (r4 == 0) goto L1d6
            boolean r4 = r12.contains(r5)
            if (r4 == 0) goto L1b2
            goto L1d9
        L1b2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r5.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r12.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1d6:
            r5.set(r12)
        L1d9:
            r12.setEmpty()
            r15.c(r12)
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L1ed
            r5.setEmpty()
            r15.c(r5)
            goto L26c
        L1ed:
            int r4 = r2.f13544h
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r3)
            r6 = r4 & 48
            if (r6 != r9) goto L209
            int r6 = r5.top
            int r7 = r2.topMargin
            int r6 = r6 - r7
            int r7 = r2.j
            int r6 = r6 - r7
            int r7 = r10.top
            if (r6 >= r7) goto L209
            int r7 = r7 - r6
            v(r14, r7)
            r7 = 1
            goto L20a
        L209:
            r7 = 0
        L20a:
            r6 = r4 & 80
            r8 = 80
            if (r6 != r8) goto L226
            int r6 = r0.getHeight()
            int r8 = r5.bottom
            int r6 = r6 - r8
            int r8 = r2.bottomMargin
            int r6 = r6 - r8
            int r8 = r2.j
            int r6 = r6 + r8
            int r8 = r10.bottom
            if (r6 >= r8) goto L226
            int r6 = r6 - r8
            v(r14, r6)
            r7 = 1
        L226:
            if (r7 != 0) goto L22c
            r6 = 0
            v(r14, r6)
        L22c:
            r6 = r4 & 3
            r7 = 3
            if (r6 != r7) goto L243
            int r6 = r5.left
            int r7 = r2.leftMargin
            int r6 = r6 - r7
            int r7 = r2.i
            int r6 = r6 - r7
            int r7 = r10.left
            if (r6 >= r7) goto L243
            int r7 = r7 - r6
            u(r14, r7)
            r7 = 1
            goto L244
        L243:
            r7 = 0
        L244:
            r4 = r4 & 5
            r6 = 5
            if (r4 != r6) goto L25f
            int r4 = r0.getWidth()
            int r6 = r5.right
            int r4 = r4 - r6
            int r6 = r2.rightMargin
            int r4 = r4 - r6
            int r2 = r2.i
            int r4 = r4 + r2
            int r2 = r10.right
            if (r4 >= r2) goto L25f
            int r4 = r4 - r2
            u(r14, r4)
            r7 = 1
        L25f:
            r6 = 0
            if (r7 != 0) goto L265
            u(r14, r6)
        L265:
            r5.setEmpty()
            r15.c(r5)
            goto L26d
        L26c:
            r6 = 0
        L26d:
            r2 = 2
            if (r1 == r2) goto L294
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            i1.e r2 = (i1.e) r2
            android.graphics.Rect r2 = r2.f13549o
            r4 = r21
            r4.set(r2)
            boolean r2 = r4.equals(r11)
            if (r2 == 0) goto L288
            r5 = r17
            r2 = r19
            goto L2b6
        L288:
            android.view.ViewGroup$LayoutParams r2 = r14.getLayoutParams()
            i1.e r2 = (i1.e) r2
            android.graphics.Rect r2 = r2.f13549o
            r2.set(r11)
            goto L296
        L294:
            r4 = r21
        L296:
            int r14 = r20 + 1
            r2 = r19
        L29a:
            r5 = r17
            if (r14 >= r2) goto L2b6
            java.lang.Object r7 = r5.get(r14)
            android.view.View r7 = (android.view.View) r7
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            i1.e r8 = (i1.e) r8
            i1.b r8 = r8.f13538a
            if (r8 == 0) goto L2b1
            r8.b(r7)
        L2b1:
            int r14 = r14 + 1
            r17 = r5
            goto L29a
        L2b6:
            int r14 = r20 + 1
            r9 = r2
            r12 = r4
            r2 = r5
            goto L1d
        L2bd:
            r4 = r12
            r10.setEmpty()
            r15.c(r10)
            r11.setEmpty()
            r15.c(r11)
            r4.setEmpty()
            r15.c(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p(int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(View view, int i) {
        Rect rectC;
        Rect rectC2;
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f13545k;
        if (view2 == null && eVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        c cVar = f9401N;
        if (view2 != null) {
            rectC = c();
            rectC2 = c();
            try {
                k(view2, rectC);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                l(i, rectC, rectC2, eVar2, measuredWidth, measuredHeight);
                e(eVar2, rectC2, measuredWidth, measuredHeight);
                view.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
                return;
            } finally {
                rectC.setEmpty();
                cVar.c(rectC);
                rectC2.setEmpty();
                cVar.c(rectC2);
            }
        }
        int i7 = eVar.f13542e;
        if (i7 < 0) {
            e eVar3 = (e) view.getLayoutParams();
            rectC = c();
            rectC.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin);
            if (this.f9405D != null) {
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectC.left = this.f9405D.b() + rectC.left;
                    rectC.top = this.f9405D.d() + rectC.top;
                    rectC.right -= this.f9405D.c();
                    rectC.bottom -= this.f9405D.a();
                }
            }
            rectC2 = c();
            int i8 = eVar3.f13540c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), rectC, rectC2, i);
            view.layout(rectC2.left, rectC2.top, rectC2.right, rectC2.bottom);
            return;
        }
        e eVar4 = (e) view.getLayoutParams();
        int i9 = eVar4.f13540c;
        if (i9 == 0) {
            i9 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i9, i);
        int i10 = absoluteGravity & 7;
        int i11 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i7 = width - i7;
        }
        int iM = m(i7) - measuredWidth2;
        if (i10 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i10 == 5) {
            iM += measuredWidth2;
        }
        int i12 = i11 != 16 ? i11 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar4).leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar4).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f9413s;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i7 = childCount - 1; i7 >= 0; i7--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i7) : i7));
        }
        A a7 = f9400M;
        if (a7 != null) {
            Collections.sort(arrayList, a7);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zF = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList.get(i8);
            b bVar = ((e) view.getLayoutParams()).f13538a;
            if (zF && actionMasked != 0) {
                if (bVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i == 0) {
                        bVar.f(this, view, motionEventObtain);
                    } else if (i == 1) {
                        bVar.q(view, motionEventObtain);
                    }
                }
            } else if (!zF && bVar != null) {
                if (i == 0) {
                    zF = bVar.f(this, view, motionEvent);
                } else if (i == 1) {
                    zF = bVar.q(view, motionEvent);
                }
                if (zF) {
                    this.f9420z = view;
                }
            }
        }
        arrayList.clear();
        return zF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        b bVar = ((e) view.getLayoutParams()).f13538a;
        if (bVar != null) {
            bVar.l(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        super.requestDisallowInterceptTouchEvent(z5);
        if (!z5 || this.f9417w) {
            return;
        }
        t(false);
        this.f9417w = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r15 = this;
            java.util.ArrayList r0 = r15.f9411q
            r0.clear()
            E.c0 r1 = r15.f9412r
            java.lang.Object r2 = r1.f1553r
            r.Q r2 = (r.Q) r2
            java.lang.Object r3 = r1.f1552q
            b1.d r3 = (b1.d) r3
            java.lang.Object r4 = r1.f1553r
            r.Q r4 = (r.Q) r4
            int r5 = r2.f16166s
            r6 = 0
            r7 = r6
        L17:
            if (r7 >= r5) goto L2a
            java.lang.Object r8 = r2.i(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L27
            r8.clear()
            r3.c(r8)
        L27:
            int r7 = r7 + 1
            goto L17
        L2a:
            r2.clear()
            int r2 = r15.getChildCount()
            r5 = r6
        L32:
            if (r5 >= r2) goto L16d
            android.view.View r7 = r15.getChildAt(r5)
            i1.e r8 = n(r7)
            int r9 = r8.f
            r10 = -1
            r11 = 0
            if (r9 != r10) goto L48
            r8.f13546l = r11
            r8.f13545k = r11
            goto Lc7
        L48:
            android.view.View r10 = r8.f13545k
            if (r10 == 0) goto L74
            int r10 = r10.getId()
            if (r10 == r9) goto L53
            goto L74
        L53:
            android.view.View r10 = r8.f13545k
            android.view.ViewParent r12 = r10.getParent()
        L59:
            if (r12 == r15) goto L71
            if (r12 == 0) goto L6c
            if (r12 != r7) goto L60
            goto L6c
        L60:
            boolean r13 = r12 instanceof android.view.View
            if (r13 == 0) goto L67
            r10 = r12
            android.view.View r10 = (android.view.View) r10
        L67:
            android.view.ViewParent r12 = r12.getParent()
            goto L59
        L6c:
            r8.f13546l = r11
            r8.f13545k = r11
            goto L74
        L71:
            r8.f13546l = r10
            goto Lc7
        L74:
            android.view.View r10 = r15.findViewById(r9)
            r8.f13545k = r10
            if (r10 == 0) goto Lbd
            if (r10 != r15) goto L91
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto L89
            r8.f13546l = r11
            r8.f13545k = r11
            goto Lc7
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L91:
            android.view.ViewParent r9 = r10.getParent()
        L95:
            if (r9 == r15) goto Lba
            if (r9 == 0) goto Lba
            if (r9 != r7) goto Lae
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto La6
            r8.f13546l = r11
            r8.f13545k = r11
            goto Lc7
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        Lae:
            boolean r12 = r9 instanceof android.view.View
            if (r12 == 0) goto Lb5
            r10 = r9
            android.view.View r10 = (android.view.View) r10
        Lb5:
            android.view.ViewParent r9 = r9.getParent()
            goto L95
        Lba:
            r8.f13546l = r10
            goto Lc7
        Lbd:
            boolean r10 = r15.isInEditMode()
            if (r10 == 0) goto L149
            r8.f13546l = r11
            r8.f13545k = r11
        Lc7:
            boolean r9 = r4.containsKey(r7)
            if (r9 != 0) goto Ld0
            r4.put(r7, r11)
        Ld0:
            r9 = r6
        Ld1:
            if (r9 >= r2) goto L145
            if (r9 != r5) goto Ld6
            goto L13a
        Ld6:
            android.view.View r10 = r15.getChildAt(r9)
            android.view.View r12 = r8.f13546l
            if (r10 == r12) goto L104
            java.util.WeakHashMap r12 = w1.AbstractC1835K.f18149a
            int r12 = r15.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
            i1.e r13 = (i1.e) r13
            int r13 = r13.f13543g
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r12)
            if (r13 == 0) goto Lfc
            int r14 = r8.f13544h
            int r12 = android.view.Gravity.getAbsoluteGravity(r14, r12)
            r12 = r12 & r13
            if (r12 != r13) goto Lfc
            goto L104
        Lfc:
            i1.b r10 = r8.f13538a
            if (r10 == 0) goto L13a
            r10.b(r7)
            goto L13a
        L104:
            boolean r12 = r4.containsKey(r10)
            if (r12 != 0) goto L113
            boolean r12 = r4.containsKey(r10)
            if (r12 != 0) goto L113
            r4.put(r10, r11)
        L113:
            boolean r12 = r4.containsKey(r10)
            if (r12 == 0) goto L13d
            boolean r12 = r4.containsKey(r7)
            if (r12 == 0) goto L13d
            java.lang.Object r12 = r4.get(r10)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L137
            java.lang.Object r12 = r3.a()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L134
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L134:
            r4.put(r10, r12)
        L137:
            r12.add(r7)
        L13a:
            int r9 = r9 + 1
            goto Ld1
        L13d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L145:
            int r5 = r5 + 1
            goto L32
        L149:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r15.getResources()
            java.lang.String r2 = r2.getResourceName(r9)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L16d:
            java.lang.Object r2 = r1.f1554s
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.lang.Object r3 = r1.f1555t
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            int r5 = r4.f16166s
        L17d:
            if (r6 >= r5) goto L189
            java.lang.Object r7 = r4.f(r6)
            r1.e(r7, r2, r3)
            int r6 = r6 + 1
            goto L17d
        L189:
            r0.addAll(r2)
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.s():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setFitsSystemWindows(boolean z5) {
        super.setFitsSystemWindows(z5);
        w();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f9408G = onHierarchyChangeListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f9407F;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f9407F = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f9407F.setState(getDrawableState());
                }
                Drawable drawable3 = this.f9407F;
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f9407F.setVisible(getVisibility() == 0, false);
                this.f9407F.setCallback(this);
            }
            WeakHashMap weakHashMap2 = AbstractC1835K.f18149a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z5 = i == 0;
        Drawable drawable = this.f9407F;
        if (drawable == null || drawable.isVisible() == z5) {
            return;
        }
        this.f9407F.setVisible(z5, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(boolean z5) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            b bVar = ((e) childAt.getLayoutParams()).f13538a;
            if (bVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z5) {
                    bVar.f(this, childAt, motionEventObtain);
                } else {
                    bVar.q(childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            ((e) getChildAt(i7).getLayoutParams()).getClass();
        }
        this.f9420z = null;
        this.f9417w = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f9407F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w() {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (!getFitsSystemWindows()) {
            AbstractC1826B.l(this, null);
            return;
        }
        if (this.f9409H == null) {
            this.f9409H = new C1134a(0, this);
        }
        AbstractC1826B.l(this, this.f9409H);
        setSystemUiVisibility(1280);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }
}
