package androidx.core.widget;

import A1.d;
import A1.f;
import A1.g;
import A1.h;
import A1.j;
import M.C0231t;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.internal.measurement.K1;
import java.util.WeakHashMap;
import k3.c;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.C1844g;
import w1.C1847j;
import w1.InterfaceC1849l;
import w1.r;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1849l {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final float f9440S = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final f f9441T = new f(0);

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final int[] f9442U = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f9443A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f9444B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public VelocityTracker f9445C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f9446D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f9447E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f9448F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f9449G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f9450H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f9451I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int[] f9452J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int[] f9453K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f9454L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9455M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public j f9456N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C0231t f9457O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final C1847j f9458P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public float f9459Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C1844g f9460R;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f9461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f9462r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f9463s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final OverScroller f9464t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final EdgeEffect f9465u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final EdgeEffect f9466v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r f9467w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9468x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9469y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9470z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.wnapp.smspariaz.R.attr.nestedScrollViewStyle);
        this.f9463s = new Rect();
        this.f9469y = true;
        this.f9470z = false;
        this.f9443A = null;
        this.f9444B = false;
        this.f9447E = true;
        this.f9451I = -1;
        this.f9452J = new int[2];
        this.f9453K = new int[2];
        this.f9460R = new C1844g(getContext(), new c(this));
        int i = Build.VERSION.SDK_INT;
        this.f9465u = i >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f9466v = i >= 31 ? d.a(context, attributeSet) : new EdgeEffect(context);
        this.f9461q = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f9464t = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f9448F = viewConfiguration.getScaledTouchSlop();
        this.f9449G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9450H = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f9442U, com.wnapp.smspariaz.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f9457O = new C0231t();
        this.f9458P = new C1847j(this);
        setNestedScrollingEnabled(true);
        AbstractC1835K.m(this, f9441T);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private r getScrollFeedbackProvider() {
        if (this.f9467w == null) {
            this.f9467w = new r(this);
        }
        return this.f9467w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void a(View view, View view2, int i, int i7) {
        C0231t c0231t = this.f9457O;
        if (i7 == 1) {
            c0231t.f3617b = i;
        } else {
            c0231t.f3616a = i;
        }
        this.f9458P.g(2, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void b(View view, int i) {
        C0231t c0231t = this.f9457O;
        if (i == 1) {
            c0231t.f3617b = 0;
        } else {
            c0231t.f3616a = 0;
        }
        w(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f9463s;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(e(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            r17 = this;
            r0 = r17
            android.widget.OverScroller r1 = r0.f9464t
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto Lb
            return
        Lb:
            android.widget.OverScroller r1 = r0.f9464t
            r1.computeScrollOffset()
            android.widget.OverScroller r1 = r0.f9464t
            int r1 = r1.getCurrY()
            int r2 = r0.f9455M
            int r2 = r1 - r2
            int r3 = r0.getHeight()
            android.widget.EdgeEffect r4 = r0.f9465u
            android.widget.EdgeEffect r5 = r0.f9466v
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 0
            r8 = 1082130432(0x40800000, float:4.0)
            if (r2 <= 0) goto L4a
            float r9 = com.google.android.gms.internal.measurement.K1.q(r4)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 == 0) goto L4a
            int r7 = -r2
            float r7 = (float) r7
            float r7 = r7 * r8
            float r9 = (float) r3
            float r7 = r7 / r9
            int r3 = -r3
            float r3 = (float) r3
            float r3 = r3 / r8
            float r6 = com.google.android.gms.internal.measurement.K1.C(r4, r7, r6)
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            if (r3 == r2) goto L47
            r4.finish()
        L47:
            int r2 = r2 - r3
        L48:
            r8 = r2
            goto L68
        L4a:
            if (r2 >= 0) goto L48
            float r9 = com.google.android.gms.internal.measurement.K1.q(r5)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            float r7 = (float) r2
            float r7 = r7 * r8
            float r3 = (float) r3
            float r7 = r7 / r3
            float r3 = r3 / r8
            float r6 = com.google.android.gms.internal.measurement.K1.C(r5, r7, r6)
            float r6 = r6 * r3
            int r3 = java.lang.Math.round(r6)
            if (r3 == r2) goto L47
            r5.finish()
            goto L47
        L68:
            r0.f9455M = r1
            int[] r10 = r0.f9453K
            r1 = 1
            r2 = 0
            r10[r1] = r2
            r11 = 0
            w1.j r6 = r0.f9458P
            r7 = 0
            r9 = 1
            r6.c(r7, r8, r9, r10, r11)
            r16 = r10
            r3 = r16[r1]
            int r8 = r8 - r3
            int r3 = r0.getScrollRange()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 35
            if (r6 < r7) goto L94
            android.widget.OverScroller r6 = r0.f9464t
            float r6 = r6.getCurrVelocity()
            float r6 = java.lang.Math.abs(r6)
            A1.g.a(r0, r6)
        L94:
            if (r8 == 0) goto Lb9
            int r6 = r0.getScrollY()
            int r7 = r0.getScrollX()
            r0.p(r8, r7, r6, r3)
            int r7 = r0.getScrollY()
            int r11 = r7 - r6
            int r13 = r8 - r11
            r16[r1] = r2
            r12 = 0
            w1.j r9 = r0.f9458P
            r10 = 0
            int[] r14 = r0.f9452J
            r15 = 1
            r9.d(r10, r11, r12, r13, r14, r15, r16)
            r2 = r16[r1]
            int r8 = r13 - r2
        Lb9:
            if (r8 == 0) goto Lf0
            int r2 = r0.getOverScrollMode()
            if (r2 == 0) goto Lc5
            if (r2 != r1) goto Le8
            if (r3 <= 0) goto Le8
        Lc5:
            if (r8 >= 0) goto Ld8
            boolean r2 = r4.isFinished()
            if (r2 == 0) goto Le8
            android.widget.OverScroller r2 = r0.f9464t
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r4.onAbsorb(r2)
            goto Le8
        Ld8:
            boolean r2 = r5.isFinished()
            if (r2 == 0) goto Le8
            android.widget.OverScroller r2 = r0.f9464t
            float r2 = r2.getCurrVelocity()
            int r2 = (int) r2
            r5.onAbsorb(r2)
        Le8:
            android.widget.OverScroller r2 = r0.f9464t
            r2.abortAnimation()
            r0.w(r1)
        Lf0:
            android.widget.OverScroller r2 = r0.f9464t
            boolean r2 = r2.isFinished()
            if (r2 != 0) goto Lfc
            r0.postInvalidateOnAnimation()
            return
        Lfc:
            r0.w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void d(View view, int i, int i7, int[] iArr, int i8) {
        this.f9458P.c(i, i7, i8, iArr, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || f(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f7, boolean z5) {
        return this.f9458P.a(f, f7, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f7) {
        return this.f9458P.b(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i7, int[] iArr, int[] iArr2) {
        return this.f9458P.c(i, i7, 0, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i7, int i8, int i9, int[] iArr) {
        return this.f9458P.d(i, i7, i8, i9, iArr, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f9465u;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f9466v;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i7 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i8 = rect.bottom;
        if (i8 > i7 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i7, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i8 >= i7) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i7 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f9463s
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 130(0x82, float:1.82E-43)
            r2 = 0
            if (r0 <= 0) goto L98
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L98
            int r0 = r6.getAction()
            if (r0 != 0) goto Lc0
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L88
            r3 = 20
            if (r0 == r3) goto L78
            r3 = 62
            if (r0 == r3) goto L6d
            r6 = 92
            if (r0 == r6) goto L68
            r6 = 93
            if (r0 == r6) goto L63
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L5f
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L5b
            goto Lc0
        L5b:
            r5.q(r1)
            return r2
        L5f:
            r5.q(r4)
            return r2
        L63:
            boolean r6 = r5.k(r1)
            return r6
        L68:
            boolean r6 = r5.k(r4)
            return r6
        L6d:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L74
            r1 = r4
        L74:
            r5.q(r1)
            return r2
        L78:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L83
            boolean r6 = r5.k(r1)
            return r6
        L83:
            boolean r6 = r5.c(r1)
            return r6
        L88:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto L93
            boolean r6 = r5.k(r4)
            return r6
        L93:
            boolean r6 = r5.c(r4)
            return r6
        L98:
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto Lc0
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto Lc0
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto Lac
            r6 = 0
        Lac:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r1)
            if (r6 == 0) goto Lc0
            if (r6 == r5) goto Lc0
            boolean r6 = r6.requestFocus(r1)
            if (r6 == 0) goto Lc0
            r6 = 1
            return r6
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.f(android.view.KeyEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        if (getChildCount() > 0) {
            this.f9464t.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f9458P.g(2, 1);
            this.f9455M = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                g.a(this, Math.abs(this.f9464t.getCurrVelocity()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0231t c0231t = this.f9457O;
        return c0231t.f3617b | c0231t.f3616a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getVerticalScrollFactorCompat() {
        if (this.f9459Q == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f9459Q = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f9459Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1849l
    public final void h(View view, int i, int i7, int i8, int i9, int i10, int[] iArr) {
        n(i9, i10, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f9458P.f(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void i(View view, int i, int i7, int i8, int i9, int i10) {
        n(i9, i10, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f9458P.f18222d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final boolean j(View view, View view2, int i, int i7) {
        return (i & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean k(int i) {
        int childCount;
        boolean z5 = i == 130;
        int height = getHeight();
        Rect rect = this.f9463s;
        rect.top = 0;
        rect.bottom = height;
        if (z5 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean m(View view, int i, int i7) {
        Rect rect = this.f9463s;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void n(int i, int i7, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f9458P.d(0, scrollY2, 0, i - scrollY2, null, i7, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f9451I) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f9468x = (int) motionEvent.getY(i);
            this.f9451I = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f9445C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f9470z = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r32) {
        /*
            r31 = this;
            r0 = r31
            r3 = r32
            int r1 = r3.getAction()
            r2 = 8
            if (r1 != r2) goto L349
            boolean r1 = r0.f9444B
            if (r1 != 0) goto L349
            int r1 = r3.getSource()
            r8 = 2
            r1 = r1 & r8
            r9 = 4194304(0x400000, float:5.877472E-39)
            r10 = 0
            r11 = 26
            if (r1 != r8) goto L2e
            r1 = 9
            float r2 = r3.getAxisValue(r1)
            float r4 = r3.getX()
            int r4 = (int) r4
            r30 = r2
            r2 = r1
            r1 = r30
            goto L45
        L2e:
            int r1 = r3.getSource()
            r1 = r1 & r9
            if (r1 != r9) goto L42
            float r2 = r3.getAxisValue(r11)
            int r1 = r0.getWidth()
            int r4 = r1 / 2
            r1 = r2
            r2 = r11
            goto L45
        L42:
            r1 = r10
            r2 = 0
            r4 = 0
        L45:
            int r5 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r5 == 0) goto L349
            float r5 = r0.getVerticalScrollFactorCompat()
            float r5 = r5 * r1
            int r1 = (int) r5
            int r5 = r3.getSource()
            r6 = 8194(0x2002, float:1.1482E-41)
            r5 = r5 & r6
            if (r5 != r6) goto L5a
            r6 = 1
            goto L5b
        L5a:
            r6 = 0
        L5b:
            int r1 = -r1
            r5 = 1
            r0.s(r1, r2, r3, r4, r5, r6)
            if (r2 == 0) goto L31f
            w1.g r1 = r0.f9460R
            k3.c r4 = r1.f18208b
            java.lang.Object r4 = r4.f14120q
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            int[] r5 = r1.f18213h
            int r6 = r3.getSource()
            int r13 = r3.getDeviceId()
            int r14 = r1.f
            r15 = 34
            r16 = 1
            if (r14 != r6) goto L8a
            int r14 = r1.f18212g
            if (r14 != r13) goto L8a
            int r14 = r1.f18211e
            if (r14 == r2) goto L85
            goto L8a
        L85:
            r7 = 0
            r19 = 0
            goto L135
        L8a:
            android.content.Context r14 = r1.f18207a
            android.view.ViewConfiguration r8 = android.view.ViewConfiguration.get(r14)
            int r10 = r3.getDeviceId()
            r19 = 0
            int r7 = r3.getSource()
            int r12 = android.os.Build.VERSION.SDK_INT
            java.lang.String r11 = "android"
            java.lang.String r9 = "dimen"
            r0 = -1
            if (r12 < r15) goto Laa
            java.lang.reflect.Method r22 = w1.AbstractC1836L.f18154a
            int r7 = A1.l.f(r8, r10, r2, r7)
            goto Le2
        Laa:
            java.lang.reflect.Method r22 = w1.AbstractC1836L.f18154a
            android.view.InputDevice r10 = android.view.InputDevice.getDevice(r10)
            if (r10 == 0) goto Ldf
            android.view.InputDevice$MotionRange r10 = r10.getMotionRange(r2, r7)
            if (r10 == 0) goto Ldf
            android.content.res.Resources r10 = r14.getResources()
            r15 = 4194304(0x400000, float:5.877472E-39)
            if (r7 != r15) goto Lcb
            r7 = 26
            if (r2 != r7) goto Lcb
            java.lang.String r7 = "config_viewMinRotaryEncoderFlingVelocity"
            int r7 = r10.getIdentifier(r7, r9, r11)
            goto Lcc
        Lcb:
            r7 = r0
        Lcc:
            java.util.Objects.requireNonNull(r8)
            if (r7 == r0) goto Lda
            if (r7 == 0) goto Ldf
            int r7 = r10.getDimensionPixelSize(r7)
            if (r7 >= 0) goto Le2
            goto Ldf
        Lda:
            int r7 = r8.getScaledMinimumFlingVelocity()
            goto Le2
        Ldf:
            r7 = 2147483647(0x7fffffff, float:NaN)
        Le2:
            r5[r19] = r7
            int r7 = r3.getDeviceId()
            int r10 = r3.getSource()
            r15 = 34
            if (r12 < r15) goto Lf5
            int r0 = A1.l.e(r8, r7, r2, r10)
            goto L12b
        Lf5:
            android.view.InputDevice r7 = android.view.InputDevice.getDevice(r7)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L12a
            android.view.InputDevice$MotionRange r7 = r7.getMotionRange(r2, r10)
            if (r7 == 0) goto L12a
            android.content.res.Resources r7 = r14.getResources()
            r15 = 4194304(0x400000, float:5.877472E-39)
            if (r10 != r15) goto L116
            r10 = 26
            if (r2 != r10) goto L116
            java.lang.String r10 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r9 = r7.getIdentifier(r10, r9, r11)
            goto L117
        L116:
            r9 = r0
        L117:
            java.util.Objects.requireNonNull(r8)
            if (r9 == r0) goto L125
            if (r9 == 0) goto L12a
            int r0 = r7.getDimensionPixelSize(r9)
            if (r0 >= 0) goto L12b
            goto L12a
        L125:
            int r0 = r8.getScaledMaximumFlingVelocity()
            goto L12b
        L12a:
            r0 = r12
        L12b:
            r5[r16] = r0
            r1.f = r6
            r1.f18212g = r13
            r1.f18211e = r2
            r7 = r16
        L135:
            r0 = r5[r19]
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r6) goto L147
            android.view.VelocityTracker r0 = r1.f18209c
            if (r0 == 0) goto L348
            r0.recycle()
            r0 = 0
            r1.f18209c = r0
            return r16
        L147:
            android.view.VelocityTracker r0 = r1.f18209c
            if (r0 != 0) goto L151
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.f18209c = r0
        L151:
            android.view.VelocityTracker r0 = r1.f18209c
            java.util.Map r6 = w1.AbstractC1857u.f18242a
            r0.addMovement(r3)
            int r6 = android.os.Build.VERSION.SDK_INT
            r8 = 20
            r15 = 34
            if (r6 < r15) goto L161
            goto L1b9
        L161:
            int r6 = r3.getSource()
            r15 = 4194304(0x400000, float:5.877472E-39)
            if (r6 != r15) goto L1b9
            java.util.Map r6 = w1.AbstractC1857u.f18242a
            boolean r9 = r6.containsKey(r0)
            if (r9 != 0) goto L179
            w1.v r9 = new w1.v
            r9.<init>()
            r6.put(r0, r9)
        L179:
            java.lang.Object r6 = r6.get(r0)
            w1.v r6 = (w1.C1858v) r6
            long[] r9 = r6.f18244b
            long r10 = r3.getEventTime()
            int r12 = r6.f18246d
            if (r12 == 0) goto L19c
            int r12 = r6.f18247e
            r12 = r9[r12]
            long r12 = r10 - r12
            r14 = 40
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto L19c
            r12 = r19
            r6.f18246d = r12
            r12 = 0
            r6.f18245c = r12
        L19c:
            int r12 = r6.f18247e
            int r12 = r12 + 1
            int r12 = r12 % r8
            r6.f18247e = r12
            int r13 = r6.f18246d
            if (r13 == r8) goto L1ab
            int r13 = r13 + 1
            r6.f18246d = r13
        L1ab:
            float[] r13 = r6.f18243a
            r14 = 26
            float r3 = r3.getAxisValue(r14)
            r13[r12] = r3
            int r3 = r6.f18247e
            r9[r3] = r10
        L1b9:
            r3 = 1000(0x3e8, float:1.401E-42)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.computeCurrentVelocity(r3, r6)
            java.util.Map r9 = w1.AbstractC1857u.f18242a
            java.lang.Object r9 = r9.get(r0)
            w1.v r9 = (w1.C1858v) r9
            if (r9 == 0) goto L2bc
            float[] r10 = r9.f18243a
            long[] r11 = r9.f18244b
            int r12 = r9.f18246d
            r13 = 2
            if (r12 >= r13) goto L1dc
        L1d4:
            r26 = r4
            r32 = r6
            r4 = r3
            r3 = 0
            goto L296
        L1dc:
            int r13 = r9.f18247e
            int r14 = r13 + 20
            int r12 = r12 + (-1)
            int r14 = r14 - r12
            int r14 = r14 % r8
            r12 = r11[r13]
        L1e6:
            r23 = r11[r14]
            long r25 = r12 - r23
            r27 = 100
            int r15 = (r25 > r27 ? 1 : (r25 == r27 ? 0 : -1))
            if (r15 <= 0) goto L1fa
            int r15 = r9.f18246d
            int r15 = r15 + (-1)
            r9.f18246d = r15
            int r14 = r14 + 1
            int r14 = r14 % r8
            goto L1e6
        L1fa:
            int r12 = r9.f18246d
            r13 = 2
            if (r12 >= r13) goto L200
            goto L1d4
        L200:
            if (r12 != r13) goto L21a
            int r14 = r14 + 1
            int r14 = r14 % r8
            r12 = r11[r14]
            int r8 = (r23 > r12 ? 1 : (r23 == r12 ? 0 : -1))
            if (r8 != 0) goto L20c
            goto L1d4
        L20c:
            r8 = r10[r14]
            long r12 = r12 - r23
            float r10 = (float) r12
            float r8 = r8 / r10
            r26 = r4
            r32 = r6
            r4 = r3
            r3 = r8
            goto L296
        L21a:
            r32 = r6
            r12 = 0
            r13 = 0
            r15 = 0
        L21f:
            int r6 = r9.f18246d
            int r6 = r6 + (-1)
            r17 = 1073741824(0x40000000, float:2.0)
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 >= r6) goto L27c
            int r6 = r13 + r14
            int r23 = r6 % 20
            r23 = r11[r23]
            int r6 = r6 + 1
            int r6 = r6 % r8
            r25 = r11[r6]
            int r25 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r25 != 0) goto L23d
            r26 = r4
            goto L271
        L23d:
            int r15 = r15 + 1
            r18 = 0
            int r25 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r25 >= 0) goto L247
            r20 = r21
        L247:
            float r21 = java.lang.Math.abs(r12)
            float r8 = r21 * r17
            r26 = r4
            double r3 = (double) r8
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r20 = r20 * r3
            r3 = r10[r6]
            r28 = r11[r6]
            r6 = r3
            long r3 = r28 - r23
            float r3 = (float) r3
            float r3 = r6 / r3
            float r4 = r3 - r20
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r4
            float r3 = r3 + r12
            r4 = r16
            if (r15 != r4) goto L270
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
        L270:
            r12 = r3
        L271:
            int r13 = r13 + 1
            r4 = r26
            r3 = 1000(0x3e8, float:1.401E-42)
            r8 = 20
            r16 = 1
            goto L21f
        L27c:
            r26 = r4
            r18 = 0
            int r3 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r3 >= 0) goto L286
            r20 = r21
        L286:
            float r3 = java.lang.Math.abs(r12)
            float r3 = r3 * r17
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r3 = r3 * r20
            r4 = 1000(0x3e8, float:1.401E-42)
        L296:
            float r4 = (float) r4
            float r3 = r3 * r4
            r9.f18245c = r3
            float r4 = java.lang.Math.abs(r32)
            float r4 = -r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2ab
            float r3 = java.lang.Math.abs(r32)
            float r3 = -r3
            r9.f18245c = r3
            goto L2be
        L2ab:
            float r3 = r9.f18245c
            float r4 = java.lang.Math.abs(r32)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L2be
            float r3 = java.lang.Math.abs(r32)
            r9.f18245c = r3
            goto L2be
        L2bc:
            r26 = r4
        L2be:
            int r3 = android.os.Build.VERSION.SDK_INT
            r15 = 34
            if (r3 < r15) goto L2c9
            float r0 = A1.l.b(r0, r2)
            goto L2eb
        L2c9:
            if (r2 != 0) goto L2d0
            float r0 = r0.getXVelocity()
            goto L2eb
        L2d0:
            r4 = 1
            if (r2 != r4) goto L2d8
            float r0 = r0.getYVelocity()
            goto L2eb
        L2d8:
            java.util.Map r3 = w1.AbstractC1857u.f18242a
            java.lang.Object r0 = r3.get(r0)
            w1.v r0 = (w1.C1858v) r0
            if (r0 == 0) goto L2ea
            r14 = 26
            if (r2 == r14) goto L2e7
            goto L2ea
        L2e7:
            float r0 = r0.f18245c
            goto L2eb
        L2ea:
            r0 = 0
        L2eb:
            float r2 = r26.getVerticalScrollFactorCompat()
            float r2 = -r2
            float r0 = r0 * r2
            float r2 = java.lang.Math.signum(r0)
            if (r7 != 0) goto L307
            float r3 = r1.f18210d
            float r3 = java.lang.Math.signum(r3)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L30a
            r18 = 0
            int r2 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r2 == 0) goto L30a
        L307:
            r4 = r26
            goto L30d
        L30a:
            r4 = r26
            goto L312
        L30d:
            android.widget.OverScroller r2 = r4.f9464t
            r2.abortAnimation()
        L312:
            float r2 = java.lang.Math.abs(r0)
            r19 = 0
            r3 = r5[r19]
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L322
        L31f:
            r16 = 1
            goto L348
        L322:
            r16 = 1
            r2 = r5[r16]
            int r3 = -r2
            float r3 = (float) r3
            float r2 = (float) r2
            float r0 = java.lang.Math.min(r0, r2)
            float r0 = java.lang.Math.max(r3, r0)
            r18 = 0
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 != 0) goto L33a
            r10 = r18
            goto L344
        L33a:
            android.widget.OverScroller r2 = r4.f9464t
            r2.abortAnimation()
            int r2 = (int) r0
            r4.g(r2)
            r10 = r0
        L344:
            r1.f18210d = r10
            r16 = 1
        L348:
            return r16
        L349:
            r19 = 0
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r12.f9444B
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            r4 = 0
            if (r0 == 0) goto Laf
            r5 = -1
            if (r0 == r1) goto L83
            if (r0 == r2) goto L25
            r1 = 3
            if (r0 == r1) goto L83
            r1 = 6
            if (r0 == r1) goto L20
            goto L134
        L20:
            r12.o(r13)
            goto L134
        L25:
            int r0 = r12.f9451I
            if (r0 != r5) goto L2b
            goto L134
        L2b:
            int r3 = r13.findPointerIndex(r0)
            if (r3 != r5) goto L4b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r13.<init>(r1)
            r13.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r13)
            goto L134
        L4b:
            float r0 = r13.getY(r3)
            int r0 = (int) r0
            int r3 = r12.f9468x
            int r3 = r0 - r3
            int r3 = java.lang.Math.abs(r3)
            int r5 = r12.f9448F
            if (r3 <= r5) goto L134
            int r3 = r12.getNestedScrollAxes()
            r2 = r2 & r3
            if (r2 != 0) goto L134
            r12.f9444B = r1
            r12.f9468x = r0
            android.view.VelocityTracker r0 = r12.f9445C
            if (r0 != 0) goto L71
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f9445C = r0
        L71:
            android.view.VelocityTracker r0 = r12.f9445C
            r0.addMovement(r13)
            r12.f9454L = r4
            android.view.ViewParent r13 = r12.getParent()
            if (r13 == 0) goto L134
            r13.requestDisallowInterceptTouchEvent(r1)
            goto L134
        L83:
            r12.f9444B = r4
            r12.f9451I = r5
            android.view.VelocityTracker r13 = r12.f9445C
            if (r13 == 0) goto L90
            r13.recycle()
            r12.f9445C = r3
        L90:
            int r6 = r12.getScrollX()
            int r7 = r12.getScrollY()
            r10 = 0
            int r11 = r12.getScrollRange()
            android.widget.OverScroller r5 = r12.f9464t
            r8 = 0
            r9 = 0
            boolean r13 = r5.springBack(r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Laa
            r12.postInvalidateOnAnimation()
        Laa:
            r12.w(r4)
            goto L134
        Laf:
            float r0 = r13.getY()
            int r0 = (int) r0
            float r5 = r13.getX()
            int r5 = (int) r5
            int r6 = r12.getChildCount()
            if (r6 <= 0) goto L119
            int r6 = r12.getScrollY()
            android.view.View r7 = r12.getChildAt(r4)
            int r8 = r7.getTop()
            int r8 = r8 - r6
            if (r0 < r8) goto L119
            int r8 = r7.getBottom()
            int r8 = r8 - r6
            if (r0 >= r8) goto L119
            int r6 = r7.getLeft()
            if (r5 < r6) goto L119
            int r6 = r7.getRight()
            if (r5 >= r6) goto L119
            r12.f9468x = r0
            int r0 = r13.getPointerId(r4)
            r12.f9451I = r0
            android.view.VelocityTracker r0 = r12.f9445C
            if (r0 != 0) goto Lf4
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.f9445C = r0
            goto Lf7
        Lf4:
            r0.clear()
        Lf7:
            android.view.VelocityTracker r0 = r12.f9445C
            r0.addMovement(r13)
            android.widget.OverScroller r0 = r12.f9464t
            r0.computeScrollOffset()
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L111
            android.widget.OverScroller r13 = r12.f9464t
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L110
            goto L111
        L110:
            r1 = r4
        L111:
            r12.f9444B = r1
            w1.j r13 = r12.f9458P
            r13.g(r2, r4)
            goto L134
        L119:
            boolean r13 = r12.v(r13)
            if (r13 != 0) goto L129
            android.widget.OverScroller r13 = r12.f9464t
            boolean r13 = r13.isFinished()
            if (r13 != 0) goto L128
            goto L129
        L128:
            r1 = r4
        L129:
            r12.f9444B = r1
            android.view.VelocityTracker r13 = r12.f9445C
            if (r13 == 0) goto L134
            r13.recycle()
            r12.f9445C = r3
        L134:
            boolean r13 = r12.f9444B
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int measuredHeight;
        super.onLayout(z5, i, i7, i8, i9);
        int i10 = 0;
        this.f9469y = false;
        View view = this.f9443A;
        if (view != null && l(view, this)) {
            View view2 = this.f9443A;
            Rect rect = this.f9463s;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iE = e(rect);
            if (iE != 0) {
                scrollBy(0, iE);
            }
        }
        this.f9443A = null;
        if (!this.f9470z) {
            if (this.f9456N != null) {
                scrollTo(getScrollX(), this.f9456N.f202q);
                this.f9456N = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i9 - i7) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i10 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i10 != scrollY) {
                scrollTo(getScrollX(), i10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f9470z = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i7) {
        super.onMeasure(i, i7);
        if (this.f9446D && View.MeasureSpec.getMode(i7) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z5) {
        if (z5) {
            return false;
        }
        dispatchNestedFling(0.0f, f7, true);
        g((int) f7);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        return this.f9458P.b(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i7, int[] iArr) {
        this.f9458P.c(i, i7, 0, iArr, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i7, int i8, int i9) {
        n(i9, 0, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        a(view, view2, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onOverScrolled(int i, int i7, boolean z5, boolean z6) {
        super.scrollTo(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f9456N = jVar;
        requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f202q = getScrollY();
        return jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onScrollChanged(int i, int i7, int i8, int i9) {
        super.onScrollChanged(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onSizeChanged(int i, int i7, int i8, int i9) {
        super.onSizeChanged(i, i7, i8, i9);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i9)) {
            return;
        }
        Rect rect = this.f9463s;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iE = e(rect);
        if (iE != 0) {
            if (this.f9447E) {
                u(0, iE, false);
            } else {
                scrollBy(0, iE);
            }
        }
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
    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r3 = r19
            android.view.VelocityTracker r1 = r0.f9445C
            if (r1 != 0) goto Le
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f9445C = r1
        Le:
            int r1 = r3.getActionMasked()
            r2 = 0
            if (r1 != 0) goto L17
            r0.f9454L = r2
        L17:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtain(r3)
            int r4 = r0.f9454L
            float r4 = (float) r4
            r5 = 0
            r7.offsetLocation(r5, r4)
            w1.j r4 = r0.f9458P
            r6 = 2
            r8 = 1
            if (r1 == 0) goto L1ed
            r9 = 0
            r10 = -1
            android.widget.EdgeEffect r11 = r0.f9465u
            android.widget.EdgeEffect r12 = r0.f9466v
            if (r1 == r8) goto L161
            if (r1 == r6) goto La3
            r4 = 3
            if (r1 == r4) goto L62
            r2 = 5
            if (r1 == r2) goto L4f
            r2 = 6
            if (r1 == r2) goto L3d
            goto L221
        L3d:
            r18.o(r19)
            int r1 = r0.f9451I
            int r1 = r3.findPointerIndex(r1)
            float r1 = r3.getY(r1)
            int r1 = (int) r1
            r0.f9468x = r1
            goto L221
        L4f:
            int r1 = r3.getActionIndex()
            float r2 = r3.getY(r1)
            int r2 = (int) r2
            r0.f9468x = r2
            int r1 = r3.getPointerId(r1)
            r0.f9451I = r1
            goto L221
        L62:
            boolean r1 = r0.f9444B
            if (r1 == 0) goto L87
            int r1 = r0.getChildCount()
            if (r1 <= 0) goto L87
            int r12 = r0.getScrollX()
            int r13 = r0.getScrollY()
            r16 = 0
            int r17 = r0.getScrollRange()
            android.widget.OverScroller r11 = r0.f9464t
            r14 = 0
            r15 = 0
            boolean r1 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L87
            r0.postInvalidateOnAnimation()
        L87:
            r0.f9451I = r10
            r0.f9444B = r2
            android.view.VelocityTracker r1 = r0.f9445C
            if (r1 == 0) goto L94
            r1.recycle()
            r0.f9445C = r9
        L94:
            r0.w(r2)
            android.widget.EdgeEffect r1 = r0.f9465u
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f9466v
            r1.onRelease()
            goto L221
        La3:
            int r1 = r0.f9451I
            int r1 = r3.findPointerIndex(r1)
            if (r1 != r10) goto Lc7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid pointerId="
            r1.<init>(r2)
            int r2 = r0.f9451I
            r1.append(r2)
            java.lang.String r2 = " in onTouchEvent"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "NestedScrollView"
            android.util.Log.e(r2, r1)
            goto L221
        Lc7:
            float r2 = r3.getY(r1)
            int r9 = (int) r2
            int r2 = r0.f9468x
            int r2 = r2 - r9
            float r4 = r3.getX(r1)
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r4 = r4 / r6
            float r6 = (float) r2
            int r10 = r0.getHeight()
            float r10 = (float) r10
            float r6 = r6 / r10
            float r10 = com.google.android.gms.internal.measurement.K1.q(r11)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 == 0) goto Lfb
            float r6 = -r6
            float r4 = com.google.android.gms.internal.measurement.K1.C(r11, r6, r4)
            float r4 = -r4
            float r6 = com.google.android.gms.internal.measurement.K1.q(r11)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf9
            r11.onRelease()
        Lf9:
            r5 = r4
            goto L116
        Lfb:
            float r10 = com.google.android.gms.internal.measurement.K1.q(r12)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 == 0) goto L116
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r4
            float r4 = com.google.android.gms.internal.measurement.K1.C(r12, r6, r10)
            float r6 = com.google.android.gms.internal.measurement.K1.q(r12)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto Lf9
            r12.onRelease()
            goto Lf9
        L116:
            int r4 = r0.getHeight()
            float r4 = (float) r4
            float r5 = r5 * r4
            int r4 = java.lang.Math.round(r5)
            if (r4 == 0) goto L125
            r0.invalidate()
        L125:
            int r2 = r2 - r4
            boolean r4 = r0.f9444B
            if (r4 != 0) goto L146
            int r4 = java.lang.Math.abs(r2)
            int r5 = r0.f9448F
            if (r4 <= r5) goto L146
            android.view.ViewParent r4 = r0.getParent()
            if (r4 == 0) goto L13b
            r4.requestDisallowInterceptTouchEvent(r8)
        L13b:
            r0.f9444B = r8
            if (r2 <= 0) goto L143
            int r4 = r0.f9448F
            int r2 = r2 - r4
            goto L146
        L143:
            int r4 = r0.f9448F
            int r2 = r2 + r4
        L146:
            boolean r4 = r0.f9444B
            if (r4 == 0) goto L221
            float r1 = r3.getX(r1)
            int r4 = (int) r1
            r5 = 0
            r6 = 0
            r1 = r2
            r2 = 1
            int r1 = r0.s(r1, r2, r3, r4, r5, r6)
            int r9 = r9 - r1
            r0.f9468x = r9
            int r2 = r0.f9454L
            int r2 = r2 + r1
            r0.f9454L = r2
            goto L221
        L161:
            android.view.VelocityTracker r1 = r0.f9445C
            int r3 = r0.f9450H
            float r3 = (float) r3
            r6 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r6, r3)
            int r3 = r0.f9451I
            float r1 = r1.getYVelocity(r3)
            int r1 = (int) r1
            int r3 = java.lang.Math.abs(r1)
            int r6 = r0.f9449G
            if (r3 < r6) goto L1b7
            float r3 = com.google.android.gms.internal.measurement.K1.q(r11)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L191
            boolean r3 = r0.t(r11, r1)
            if (r3 == 0) goto L18c
            r11.onAbsorb(r1)
            goto L1d2
        L18c:
            int r1 = -r1
            r0.g(r1)
            goto L1d2
        L191:
            float r3 = com.google.android.gms.internal.measurement.K1.q(r12)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L1a8
            int r1 = -r1
            boolean r3 = r0.t(r12, r1)
            if (r3 == 0) goto L1a4
            r12.onAbsorb(r1)
            goto L1d2
        L1a4:
            r0.g(r1)
            goto L1d2
        L1a8:
            int r1 = -r1
            float r3 = (float) r1
            boolean r4 = r4.b(r5, r3)
            if (r4 != 0) goto L1d2
            r0.dispatchNestedFling(r5, r3, r8)
            r0.g(r1)
            goto L1d2
        L1b7:
            int r12 = r0.getScrollX()
            int r13 = r0.getScrollY()
            r16 = 0
            int r17 = r0.getScrollRange()
            android.widget.OverScroller r11 = r0.f9464t
            r14 = 0
            r15 = 0
            boolean r1 = r11.springBack(r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L1d2
            r0.postInvalidateOnAnimation()
        L1d2:
            r0.f9451I = r10
            r0.f9444B = r2
            android.view.VelocityTracker r1 = r0.f9445C
            if (r1 == 0) goto L1df
            r1.recycle()
            r0.f9445C = r9
        L1df:
            r0.w(r2)
            android.widget.EdgeEffect r1 = r0.f9465u
            r1.onRelease()
            android.widget.EdgeEffect r1 = r0.f9466v
            r1.onRelease()
            goto L221
        L1ed:
            int r1 = r0.getChildCount()
            if (r1 != 0) goto L1f4
            return r2
        L1f4:
            boolean r1 = r0.f9444B
            if (r1 == 0) goto L201
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L201
            r1.requestDisallowInterceptTouchEvent(r8)
        L201:
            android.widget.OverScroller r1 = r0.f9464t
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L211
            android.widget.OverScroller r1 = r0.f9464t
            r1.abortAnimation()
            r0.w(r8)
        L211:
            float r1 = r3.getY()
            int r1 = (int) r1
            int r3 = r3.getPointerId(r2)
            r0.f9468x = r1
            r0.f9451I = r3
            r4.g(r6, r2)
        L221:
            android.view.VelocityTracker r1 = r0.f9445C
            if (r1 == 0) goto L228
            r1.addMovement(r7)
        L228:
            r7.recycle()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p(int i, int i7, int i8, int i9) {
        int i10;
        boolean z5;
        int i11;
        boolean z6;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i12 = i8 + i;
        if (i7 <= 0 && i7 >= 0) {
            i10 = i7;
            z5 = false;
        } else {
            i10 = 0;
            z5 = true;
        }
        if (i12 > i9) {
            i11 = i9;
        } else {
            if (i12 >= 0) {
                i11 = i12;
                z6 = false;
                if (z6 && !this.f9458P.f(1)) {
                    this.f9464t.springBack(i10, i11, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i10, i11);
                return !z5 || z6;
            }
            i11 = 0;
        }
        z6 = true;
        if (z6) {
            this.f9464t.springBack(i10, i11, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i10, i11);
        if (z5) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(int i) {
        boolean z5 = i == 130;
        int height = getHeight();
        Rect rect = this.f9463s;
        if (z5) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i7 = rect.top;
        int i8 = height + i7;
        rect.bottom = i8;
        r(i, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(int r19, int r20, int r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r18.getHeight()
            int r4 = r18.getScrollY()
            int r3 = r3 + r4
            r5 = 33
            if (r0 != r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            r8 = 2
            r9 = r18
            java.util.ArrayList r8 = r9.getFocusables(r8)
            int r10 = r8.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r8.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r1 >= r6) goto L69
            if (r15 >= r2) goto L69
            if (r1 >= r15) goto L3f
            if (r6 >= r2) goto L3f
            r17 = 1
            goto L41
        L3f:
            r17 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r17
            goto L69
        L47:
            if (r5 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r5 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r17 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r17 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L70
            r6 = r9
            goto L71
        L70:
            r6 = r11
        L71:
            if (r1 < r4) goto L78
            if (r2 > r3) goto L78
            r16 = 0
            goto L8a
        L78:
            if (r5 == 0) goto L7d
            int r1 = r1 - r4
        L7b:
            r10 = r1
            goto L80
        L7d:
            int r1 = r2 - r3
            goto L7b
        L80:
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 1
            r9.s(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.r(int, int, int):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f9469y) {
            this.f9443A = view2;
        } else {
            Rect rect = this.f9463s;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iE = e(rect);
            if (iE != 0) {
                scrollBy(0, iE);
            }
        }
        super.requestChildFocus(view, view2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iE = e(rect);
        boolean z6 = iE != 0;
        if (z6) {
            if (z5) {
                scrollBy(0, iE);
                return z6;
            }
            u(0, iE, false);
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        VelocityTracker velocityTracker;
        if (z5 && (velocityTracker = this.f9445C) != null) {
            velocityTracker.recycle();
            this.f9445C = null;
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f9469y = true;
        super.requestLayout();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r24
            r9 = r25
            w1.j r10 = r0.f9458P
            r11 = 1
            if (r9 != r11) goto L11
            r3 = 2
            r10.g(r3, r9)
        L11:
            int[] r8 = r0.f9452J
            w1.j r3 = r0.f9458P
            r4 = 0
            int[] r7 = r0.f9453K
            r5 = r21
            r6 = r9
            boolean r3 = r3.c(r4, r5, r6, r7, r8)
            int[] r12 = r0.f9452J
            int[] r4 = r0.f9453K
            r13 = 0
            if (r3 == 0) goto L2f
            r3 = r4[r11]
            int r3 = r21 - r3
            r5 = r12[r11]
            r14 = r3
            r15 = r5
            goto L32
        L2f:
            r14 = r21
            r15 = r13
        L32:
            int r3 = r0.getScrollY()
            int r5 = r0.getScrollRange()
            int r6 = r0.getOverScrollMode()
            if (r6 == 0) goto L48
            if (r6 != r11) goto L4d
            int r6 = r0.getScrollRange()
            if (r6 <= 0) goto L4d
        L48:
            if (r26 != 0) goto L4d
            r16 = r11
            goto L4f
        L4d:
            r16 = r13
        L4f:
            boolean r6 = r0.p(r14, r13, r3, r5)
            if (r6 == 0) goto L5e
            boolean r6 = r10.f(r9)
            if (r6 != 0) goto L5e
            r17 = r11
            goto L60
        L5e:
            r17 = r13
        L60:
            int r6 = r0.getScrollY()
            int r6 = r6 - r3
            if (r23 == 0) goto L7a
            if (r6 == 0) goto L7a
            w1.r r7 = r0.getScrollFeedbackProvider()
            int r8 = r23.getDeviceId()
            int r10 = r23.getSource()
            w1.q r7 = r7.f18236a
            r7.onScrollProgress(r8, r10, r1, r6)
        L7a:
            int r7 = r14 - r6
            r4[r11] = r13
            r8 = r5
            r5 = r6
            r6 = 0
            r10 = r3
            w1.j r3 = r0.f9458P
            r18 = r10
            r10 = r4
            r4 = 0
            r19 = r8
            int[] r8 = r0.f9452J
            r13 = r19
            r3.d(r4, r5, r6, r7, r8, r9, r10)
            r3 = r12[r11]
            int r15 = r15 + r3
            r3 = r10[r11]
            int r14 = r14 - r3
            int r3 = r18 + r14
            android.widget.EdgeEffect r4 = r0.f9466v
            android.widget.EdgeEffect r5 = r0.f9465u
            if (r3 >= 0) goto Ld1
            if (r16 == 0) goto Lcf
            int r3 = -r14
            float r3 = (float) r3
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            com.google.android.gms.internal.measurement.K1.C(r5, r3, r2)
            if (r23 == 0) goto Lc6
            w1.r r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            w1.q r2 = r2.f18236a
            r2.onScrollLimit(r3, r6, r1, r11)
        Lc6:
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto Lcf
            r4.onRelease()
        Lcf:
            r7 = 0
            goto L108
        Ld1:
            if (r3 <= r13) goto Lcf
            if (r16 == 0) goto Lcf
            float r3 = (float) r14
            int r6 = r0.getHeight()
            float r6 = (float) r6
            float r3 = r3 / r6
            float r2 = (float) r2
            int r6 = r0.getWidth()
            float r6 = (float) r6
            float r2 = r2 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r2
            com.google.android.gms.internal.measurement.K1.C(r4, r3, r6)
            if (r23 == 0) goto Lfe
            w1.r r2 = r0.getScrollFeedbackProvider()
            int r3 = r23.getDeviceId()
            int r6 = r23.getSource()
            w1.q r2 = r2.f18236a
            r7 = 0
            r2.onScrollLimit(r3, r6, r1, r7)
            goto Lff
        Lfe:
            r7 = 0
        Lff:
            boolean r1 = r5.isFinished()
            if (r1 != 0) goto L108
            r5.onRelease()
        L108:
            boolean r1 = r5.isFinished()
            if (r1 == 0) goto L118
            boolean r1 = r4.isFinished()
            if (r1 != 0) goto L115
            goto L118
        L115:
            r13 = r17
            goto L11c
        L118:
            r0.postInvalidateOnAnimation()
            r13 = r7
        L11c:
            if (r13 == 0) goto L127
            if (r9 != 0) goto L127
            android.view.VelocityTracker r1 = r0.f9445C
            if (r1 == 0) goto L127
            r1.clear()
        L127:
            if (r9 != r11) goto L132
            r0.w(r9)
            r5.onRelease()
            r4.onRelease()
        L132:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void scrollTo(int i, int i7) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i7 < 0) {
                i7 = 0;
            } else if (height + i7 > height2) {
                i7 = height2 - height;
            }
            if (i == getScrollX() && i7 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setFillViewport(boolean z5) {
        if (z5 != this.f9446D) {
            this.f9446D = z5;
            requestLayout();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        C1847j c1847j = this.f9458P;
        if (c1847j.f18222d) {
            ViewGroup viewGroup = c1847j.f18221c;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            AbstractC1826B.m(viewGroup);
        }
        c1847j.f18222d = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setSmoothScrollingEnabled(boolean z5) {
        this.f9447E = z5;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.f9458P.g(i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fQ = K1.q(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f9461q * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d5 = f9440S;
        return ((float) (Math.exp((d5 / (d5 - 1.0d)) * dLog) * ((double) f))) < fQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void u(int i, int i7, boolean z5) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f9462r > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i7 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f9464t.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z5) {
                this.f9458P.g(2, 1);
            } else {
                w(1);
            }
            this.f9455M = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f9464t.isFinished()) {
                this.f9464t.abortAnimation();
                w(1);
            }
            scrollBy(i, i7);
        }
        this.f9462r = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v(MotionEvent motionEvent) {
        boolean z5;
        EdgeEffect edgeEffect = this.f9465u;
        if (K1.q(edgeEffect) != 0.0f) {
            K1.C(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z5 = true;
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.f9466v;
        if (K1.q(edgeEffect2) == 0.0f) {
            return z5;
        }
        K1.C(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(int i) {
        this.f9458P.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(h hVar) {
    }
}
