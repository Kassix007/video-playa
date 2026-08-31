package o2;

import M.C0231t;
import R4.X1;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.web2native.MainActivity;
import java.util.WeakHashMap;
import n2.AbstractC1394a;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.C1847j;
import w1.InterfaceC1848k;
import w1.InterfaceC1849l;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends ViewGroup implements InterfaceC1849l, InterfaceC1848k {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int[] f15375d0 = {R.attr.enabled};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f15376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f15377B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f15378C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f15379D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public float f15380E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public float f15381F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f15382G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f15383H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final DecelerateInterpolator f15384I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C1414a f15385J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f15386K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f15387L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final int f15388M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f15389N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f15390O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final e f15391P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public g f15392Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public g f15393R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public h f15394S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public h f15395T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f15396U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f15397V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f15398W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final f f15399a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final i f15400b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final i f15401c0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f15402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f15403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f15406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f15407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0231t f15408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1847j f15409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f15410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f15411z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(MainActivity mainActivity) {
        super(mainActivity, null);
        int i = 0;
        this.f15404s = false;
        this.f15406u = -1.0f;
        this.f15410y = new int[2];
        this.f15411z = new int[2];
        this.f15376A = new int[2];
        this.f15383H = -1;
        this.f15386K = -1;
        X1 x12 = (X1) this;
        this.f15399a0 = new f(x12, i);
        this.f15400b0 = new i(x12, i);
        this.f15401c0 = new i(x12, 1);
        this.f15405t = ViewConfiguration.get(mainActivity).getScaledTouchSlop();
        this.f15378C = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f15384I = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f15397V = (int) (displayMetrics.density * 40.0f);
        C1414a c1414a = new C1414a(getContext());
        float f = c1414a.getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = c1414a.getContext().obtainStyledAttributes(AbstractC1394a.f15146a);
        c1414a.f15333r = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1826B.k(c1414a, f * 4.0f);
        shapeDrawable.getPaint().setColor(c1414a.f15333r);
        c1414a.setBackground(shapeDrawable);
        this.f15385J = c1414a;
        e eVar = new e(getContext());
        this.f15391P = eVar;
        eVar.c(1);
        this.f15385J.setImageDrawable(this.f15391P);
        this.f15385J.setVisibility(8);
        addView(this.f15385J);
        setChildrenDrawingOrderEnabled(true);
        int i7 = (int) (displayMetrics.density * 64.0f);
        this.f15389N = i7;
        this.f15406u = i7;
        this.f15408w = new C0231t();
        this.f15409x = new C1847j(this);
        setNestedScrollingEnabled(true);
        int i8 = -this.f15397V;
        this.f15379D = i8;
        this.f15388M = i8;
        k(1.0f);
        TypedArray typedArrayObtainStyledAttributes2 = mainActivity.obtainStyledAttributes((AttributeSet) null, f15375d0);
        setEnabled(typedArrayObtainStyledAttributes2.getBoolean(0, true));
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setColorViewAlpha(int i) {
        this.f15385J.getBackground().setAlpha(i);
        this.f15391P.setAlpha(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void a(View view, View view2, int i, int i7) {
        if (i7 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void b(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public abstract boolean c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void d(View view, int i, int i7, int[] iArr, int i8) {
        if (i8 == 0) {
            onNestedPreScroll(view, i, i7, iArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f7, boolean z5) {
        return this.f15409x.a(f, f7, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f7) {
        return this.f15409x.b(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i7, int[] iArr, int[] iArr2) {
        return this.f15409x.c(i, i7, 0, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i7, int i8, int i9, int[] iArr) {
        return this.f15409x.d(i, i7, i8, i9, iArr, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        if (this.f15402q == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f15385J)) {
                    this.f15402q = childAt;
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(float f) {
        if (f > this.f15406u) {
            m(true, true);
            return;
        }
        this.f15404s = false;
        e eVar = this.f15391P;
        d dVar = eVar.f15359q;
        dVar.f15342e = 0.0f;
        dVar.f = 0.0f;
        eVar.invalidateSelf();
        f fVar = new f(this, 1);
        this.f15387L = this.f15379D;
        i iVar = this.f15401c0;
        iVar.reset();
        iVar.setDuration(200L);
        iVar.setInterpolator(this.f15384I);
        C1414a c1414a = this.f15385J;
        c1414a.f15332q = fVar;
        c1414a.clearAnimation();
        this.f15385J.startAnimation(iVar);
        e eVar2 = this.f15391P;
        d dVar2 = eVar2.f15359q;
        if (dVar2.f15348n) {
            dVar2.f15348n = false;
        }
        eVar2.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(float f) {
        h hVar;
        h hVar2;
        e eVar = this.f15391P;
        d dVar = eVar.f15359q;
        if (!dVar.f15348n) {
            dVar.f15348n = true;
        }
        eVar.invalidateSelf();
        float fMin = Math.min(1.0f, Math.abs(f / this.f15406u));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f) - this.f15406u;
        int i = this.f15390O;
        if (i <= 0) {
            i = this.f15389N;
        }
        float f7 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f7 * 2.0f) / f7) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i7 = this.f15388M + ((int) ((f7 * fMin) + (f7 * fPow * 2.0f)));
        if (this.f15385J.getVisibility() != 0) {
            this.f15385J.setVisibility(0);
        }
        this.f15385J.setScaleX(1.0f);
        this.f15385J.setScaleY(1.0f);
        if (f < this.f15406u) {
            if (this.f15391P.f15359q.f15354t > 76 && ((hVar2 = this.f15394S) == null || !hVar2.hasStarted() || hVar2.hasEnded())) {
                h hVar3 = new h(this, this.f15391P.f15359q.f15354t, 76);
                hVar3.setDuration(300L);
                C1414a c1414a = this.f15385J;
                c1414a.f15332q = null;
                c1414a.clearAnimation();
                this.f15385J.startAnimation(hVar3);
                this.f15394S = hVar3;
            }
        } else if (this.f15391P.f15359q.f15354t < 255 && ((hVar = this.f15395T) == null || !hVar.hasStarted() || hVar.hasEnded())) {
            h hVar4 = new h(this, this.f15391P.f15359q.f15354t, 255);
            hVar4.setDuration(300L);
            C1414a c1414a2 = this.f15385J;
            c1414a2.f15332q = null;
            c1414a2.clearAnimation();
            this.f15385J.startAnimation(hVar4);
            this.f15395T = hVar4;
        }
        float fMin2 = Math.min(0.8f, fMax * 0.8f);
        e eVar2 = this.f15391P;
        d dVar2 = eVar2.f15359q;
        dVar2.f15342e = 0.0f;
        dVar2.f = fMin2;
        eVar2.invalidateSelf();
        float fMin3 = Math.min(1.0f, fMax);
        e eVar3 = this.f15391P;
        d dVar3 = eVar3.f15359q;
        if (fMin3 != dVar3.f15350p) {
            dVar3.f15350p = fMin3;
        }
        eVar3.invalidateSelf();
        e eVar4 = this.f15391P;
        eVar4.f15359q.f15343g = ((fPow * 2.0f) + ((fMax * 0.4f) - 0.25f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i7 - this.f15379D);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i7) {
        int i8 = this.f15386K;
        return i8 < 0 ? i7 : i7 == i + (-1) ? i8 : i7 >= i8 ? i7 + 1 : i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0231t c0231t = this.f15408w;
        return c0231t.f3617b | c0231t.f3616a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getProgressCircleDiameter() {
        return this.f15397V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getProgressViewEndOffset() {
        return this.f15389N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getProgressViewStartOffset() {
        return this.f15388M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1849l
    public final void h(View view, int i, int i7, int i8, int i9, int i10, int[] iArr) {
        if (i10 != 0) {
            return;
        }
        int i11 = iArr[1];
        if (i10 == 0) {
            this.f15409x.d(i, i7, i8, i9, this.f15411z, i10, iArr);
        }
        int i12 = i9 - (iArr[1] - i11);
        if ((i12 == 0 ? i9 + this.f15411z[1] : i12) >= 0 || c()) {
            return;
        }
        float fAbs = this.f15407v + Math.abs(r14);
        this.f15407v = fAbs;
        g(fAbs);
        iArr[1] = iArr[1] + i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f15409x.f(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void i(View view, int i, int i7, int i8, int i9, int i10) {
        h(view, i, i7, i8, i9, i10, this.f15376A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f15409x.f18222d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final boolean j(View view, View view2, int i, int i7) {
        if (i7 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(float f) {
        setTargetOffsetTopAndBottom((this.f15387L + ((int) ((this.f15388M - r0) * f))) - this.f15385J.getTop());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        this.f15385J.clearAnimation();
        this.f15391P.stop();
        this.f15385J.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.f15388M - this.f15379D);
        this.f15379D = this.f15385J.getTop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(boolean z5, boolean z6) {
        if (this.f15404s != z5) {
            this.f15396U = z6;
            e();
            this.f15404s = z5;
            f fVar = this.f15399a0;
            if (!z5) {
                g gVar = new g(this, 1);
                this.f15393R = gVar;
                gVar.setDuration(150L);
                C1414a c1414a = this.f15385J;
                c1414a.f15332q = fVar;
                c1414a.clearAnimation();
                this.f15385J.startAnimation(this.f15393R);
                return;
            }
            this.f15387L = this.f15379D;
            i iVar = this.f15400b0;
            iVar.reset();
            iVar.setDuration(200L);
            iVar.setInterpolator(this.f15384I);
            if (fVar != null) {
                this.f15385J.f15332q = fVar;
            }
            this.f15385J.clearAnimation();
            this.f15385J.startAnimation(iVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(float f) {
        float f7 = this.f15381F;
        float f8 = f - f7;
        float f9 = this.f15405t;
        if (f8 <= f9 || this.f15382G) {
            return;
        }
        this.f15380E = f7 + f9;
        this.f15382G = true;
        this.f15391P.setAlpha(76);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            r5.e()
            int r0 = r6.getActionMasked()
            boolean r1 = r5.isEnabled()
            r2 = 0
            if (r1 == 0) goto L88
            boolean r1 = r5.c()
            if (r1 != 0) goto L88
            boolean r1 = r5.f15404s
            if (r1 != 0) goto L88
            boolean r1 = r5.f15377B
            if (r1 == 0) goto L1e
            goto L88
        L1e:
            if (r0 == 0) goto L64
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L5f
            r4 = 2
            if (r0 == r4) goto L44
            r4 = 3
            if (r0 == r4) goto L5f
            r3 = 6
            if (r0 == r3) goto L2e
            goto L85
        L2e:
            int r0 = r6.getActionIndex()
            int r3 = r6.getPointerId(r0)
            int r4 = r5.f15383H
            if (r3 != r4) goto L85
            if (r0 != 0) goto L3d
            r2 = r1
        L3d:
            int r6 = r6.getPointerId(r2)
            r5.f15383H = r6
            goto L85
        L44:
            int r0 = r5.f15383H
            if (r0 != r3) goto L50
            java.lang.String r6 = "m"
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r6, r0)
            return r2
        L50:
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L57
            goto L88
        L57:
            float r6 = r6.getY(r0)
            r5.n(r6)
            goto L85
        L5f:
            r5.f15382G = r2
            r5.f15383H = r3
            goto L85
        L64:
            o2.a r0 = r5.f15385J
            int r0 = r0.getTop()
            int r1 = r5.f15388M
            int r1 = r1 - r0
            r5.setTargetOffsetTopAndBottom(r1)
            int r0 = r6.getPointerId(r2)
            r5.f15383H = r0
            r5.f15382G = r2
            int r0 = r6.findPointerIndex(r0)
            if (r0 >= 0) goto L7f
            goto L88
        L7f:
            float r6 = r6.getY(r0)
            r5.f15381F = r6
        L85:
            boolean r6 = r5.f15382G
            return r6
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.m.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f15402q == null) {
            e();
        }
        View view = this.f15402q;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f15385J.getMeasuredWidth();
        int measuredHeight2 = this.f15385J.getMeasuredHeight();
        int i10 = measuredWidth / 2;
        int i11 = measuredWidth2 / 2;
        int i12 = this.f15379D;
        this.f15385J.layout(i10 - i11, i12, i10 + i11, measuredHeight2 + i12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        if (this.f15402q == null) {
            e();
        }
        View view = this.f15402q;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f15385J.measure(View.MeasureSpec.makeMeasureSpec(this.f15397V, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f15397V, 1073741824));
        this.f15386K = -1;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if (getChildAt(i8) == this.f15385J) {
                this.f15386K = i8;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z5) {
        return this.f15409x.a(f, f7, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        return this.f15409x.b(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i7, int[] iArr) {
        if (i7 > 0) {
            float f = this.f15407v;
            if (f > 0.0f) {
                float f7 = i7;
                if (f7 > f) {
                    iArr[1] = (int) f;
                    this.f15407v = 0.0f;
                } else {
                    this.f15407v = f - f7;
                    iArr[1] = i7;
                }
                g(this.f15407v);
            }
        }
        int i8 = i - iArr[0];
        int i9 = i7 - iArr[1];
        int[] iArr2 = this.f15410y;
        if (dispatchNestedPreScroll(i8, i9, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i7, int i8, int i9) {
        h(view, i, i7, i8, i9, 0, this.f15376A);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.f15408w.f3616a = i;
        startNestedScroll(i & 2);
        this.f15407v = 0.0f;
        this.f15377B = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        setRefreshing(lVar.f15374q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new l(super.onSaveInstanceState(), this.f15404s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.f15404s || (i & 2) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f15408w.f3616a = 0;
        this.f15377B = false;
        float f = this.f15407v;
        if (f > 0.0f) {
            f(f);
            this.f15407v = 0.0f;
        }
        stopNestedScroll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !c() && !this.f15404s && !this.f15377B) {
            if (actionMasked == 0) {
                this.f15383H = motionEvent.getPointerId(0);
                this.f15382G = false;
                return true;
            }
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f15383H);
                if (iFindPointerIndex < 0) {
                    Log.e("m", "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f15382G) {
                    float y6 = (motionEvent.getY(iFindPointerIndex) - this.f15380E) * 0.5f;
                    this.f15382G = false;
                    f(y6);
                }
                this.f15383H = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f15383H);
                if (iFindPointerIndex2 < 0) {
                    Log.e("m", "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y7 = motionEvent.getY(iFindPointerIndex2);
                n(y7);
                if (this.f15382G) {
                    float f = (y7 - this.f15380E) * 0.5f;
                    if (f > 0.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        g(f);
                    }
                }
                return true;
            }
            if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f15383H) {
                            this.f15383H = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                            return true;
                        }
                    }
                    return true;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (actionIndex2 < 0) {
                    Log.e("m", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f15383H = motionEvent.getPointerId(actionIndex2);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        ViewParent parent;
        View view = this.f15402q;
        if (view != null) {
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            if (!AbstractC1826B.h(view)) {
                if (this.f15398W || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z5);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAnimationProgress(float f) {
        this.f15385J.setScaleX(f);
        this.f15385J.setScaleY(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setColorSchemeColors(int... iArr) {
        e();
        e eVar = this.f15391P;
        d dVar = eVar.f15359q;
        dVar.i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = context.getColor(iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setDistanceToTriggerSync(int i) {
        this.f15406u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (z5) {
            return;
        }
        l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z5) {
        this.f15398W = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        C1847j c1847j = this.f15409x;
        if (c1847j.f18222d) {
            ViewGroup viewGroup = c1847j.f18221c;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1826B.m(viewGroup);
        }
        c1847j.f18222d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOnRefreshListener(k kVar) {
        this.f15403r = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f15385J.setBackgroundColor(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRefreshing(boolean z5) {
        if (!z5 || this.f15404s == z5) {
            m(z5, false);
            return;
        }
        this.f15404s = z5;
        setTargetOffsetTopAndBottom((this.f15389N + this.f15388M) - this.f15379D);
        this.f15396U = false;
        this.f15385J.setVisibility(0);
        this.f15391P.setAlpha(255);
        g gVar = new g(this, 0);
        this.f15392Q = gVar;
        gVar.setDuration(this.f15378C);
        f fVar = this.f15399a0;
        if (fVar != null) {
            this.f15385J.f15332q = fVar;
        }
        this.f15385J.clearAnimation();
        this.f15385J.startAnimation(this.f15392Q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f15397V = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f15397V = (int) (displayMetrics.density * 40.0f);
            }
            this.f15385J.setImageDrawable(null);
            this.f15391P.c(i);
            this.f15385J.setImageDrawable(this.f15391P);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSlingshotDistance(int i) {
        this.f15390O = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTargetOffsetTopAndBottom(int i) {
        C1414a c1414a = this.f15385J;
        c1414a.bringToFront();
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        c1414a.offsetTopAndBottom(i);
        this.f15379D = c1414a.getTop();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f15409x.g(i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f15409x.h(0);
    }

    public void setOnChildScrollUpCallback(j jVar) {
    }
}
