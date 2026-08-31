package androidx.appcompat.widget;

import M.C0231t;
import Z3.a;
import a.AbstractC0597a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.wnapp.smspariaz.R;
import h.I;
import java.util.WeakHashMap;
import k.j;
import l.MenuC1209l;
import l.w;
import m.C1281T0;
import m.C1291Y0;
import m.C1298c;
import m.C1300d;
import m.C1312j;
import m.InterfaceC1296b;
import m.InterfaceC1309h0;
import m.InterfaceC1311i0;
import m.RunnableC1294a;
import n1.b;
import w1.AbstractC1826B;
import w1.AbstractC1835K;
import w1.AbstractC1862z;
import w1.InterfaceC1848k;
import w1.InterfaceC1849l;
import w1.a0;
import w1.b0;
import w1.c0;
import w1.d0;
import w1.e0;
import w1.l0;
import w1.o0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC1309h0, InterfaceC1848k, InterfaceC1849l {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int[] f9115S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final o0 f9116T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final Rect f9117U;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9118A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9119B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f9120C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Rect f9121D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f9122E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Rect f9123F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public o0 f9124G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public o0 f9125H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public o0 f9126I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public o0 f9127J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public InterfaceC1296b f9128K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public OverScroller f9129L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ViewPropertyAnimator f9130M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final a f9131N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final RunnableC1294a f9132O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final RunnableC1294a f9133P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final C0231t f9134Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C1300d f9135R;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9137r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ContentFrameLayout f9138s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ActionBarContainer f9139t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public InterfaceC1311i0 f9140u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f9141v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9142w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f9143x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9144y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9145z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = Build.VERSION.SDK_INT;
        e0 d0Var = i >= 34 ? new d0() : i >= 30 ? new c0() : i >= 29 ? new b0() : new a0();
        d0Var.g(b.b(0, 1, 0, 1));
        f9116T = d0Var.b();
        f9117U = new Rect();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9137r = 0;
        this.f9120C = new Rect();
        this.f9121D = new Rect();
        this.f9122E = new Rect();
        this.f9123F = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        o0 o0Var = o0.f18231b;
        this.f9124G = o0Var;
        this.f9125H = o0Var;
        this.f9126I = o0Var;
        this.f9127J = o0Var;
        this.f9131N = new a(1, this);
        this.f9132O = new RunnableC1294a(this, 0);
        this.f9133P = new RunnableC1294a(this, 1);
        f(context);
        this.f9134Q = new C0231t();
        C1300d c1300d = new C1300d(context);
        c1300d.setWillNotDraw(true);
        this.f9135R = c1300d;
        addView(c1300d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean c(View view, Rect rect, boolean z5) {
        boolean z6;
        C1298c c1298c = (C1298c) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) c1298c).leftMargin;
        int i7 = rect.left;
        if (i != i7) {
            ((ViewGroup.MarginLayoutParams) c1298c).leftMargin = i7;
            z6 = true;
        } else {
            z6 = false;
        }
        int i8 = ((ViewGroup.MarginLayoutParams) c1298c).topMargin;
        int i9 = rect.top;
        if (i8 != i9) {
            ((ViewGroup.MarginLayoutParams) c1298c).topMargin = i9;
            z6 = true;
        }
        int i10 = ((ViewGroup.MarginLayoutParams) c1298c).rightMargin;
        int i11 = rect.right;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) c1298c).rightMargin = i11;
            z6 = true;
        }
        if (z5) {
            int i12 = ((ViewGroup.MarginLayoutParams) c1298c).bottomMargin;
            int i13 = rect.bottom;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) c1298c).bottomMargin = i13;
                return true;
            }
        }
        return z6;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1298c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void d(View view, int i, int i7, int[] iArr, int i8) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f9141v != null) {
            if (this.f9139t.getVisibility() == 0) {
                translationY = (int) (this.f9139t.getTranslationY() + this.f9139t.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f9141v.setBounds(0, translationY, getWidth(), this.f9141v.getIntrinsicHeight() + translationY);
            this.f9141v.draw(canvas);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        removeCallbacks(this.f9132O);
        removeCallbacks(this.f9133P);
        ViewPropertyAnimator viewPropertyAnimator = this.f9130M;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f9115S);
        this.f9136q = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f9141v = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f9129L = new OverScroller(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(int i) {
        k();
        if (i == 2) {
            ((C1291Y0) this.f9140u).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((C1291Y0) this.f9140u).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1298c(-1, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1298c(getContext(), attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f9139t;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0231t c0231t = this.f9134Q;
        return c0231t.f3617b | c0231t.f3616a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CharSequence getTitle() {
        k();
        return ((C1291Y0) this.f9140u).f14730a.getTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1849l
    public final void h(View view, int i, int i7, int i8, int i9, int i10, int[] iArr) {
        i(view, i, i7, i8, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final void i(View view, int i, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            onNestedScroll(view, i, i7, i8, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.InterfaceC1848k
    public final boolean j(View view, View view2, int i, int i7) {
        return i7 == 0 && onStartNestedScroll(view, view2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        InterfaceC1311i0 wrapper;
        if (this.f9138s == null) {
            this.f9138s = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f9139t = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC1311i0) {
                wrapper = (InterfaceC1311i0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f9140u = wrapper;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(Menu menu, w wVar) {
        k();
        C1291Y0 c1291y0 = (C1291Y0) this.f9140u;
        Toolbar toolbar = c1291y0.f14730a;
        if (c1291y0.f14739m == null) {
            C1312j c1312j = new C1312j(toolbar.getContext());
            c1291y0.f14739m = c1312j;
            c1312j.f14818y = R.id.action_menu_presenter;
        }
        C1312j c1312j2 = c1291y0.f14739m;
        c1312j2.f14814u = wVar;
        MenuC1209l menuC1209l = (MenuC1209l) menu;
        if (menuC1209l == null && toolbar.f9205q == null) {
            return;
        }
        toolbar.f();
        MenuC1209l menuC1209l2 = toolbar.f9205q.f9146F;
        if (menuC1209l2 == menuC1209l) {
            return;
        }
        if (menuC1209l2 != null) {
            menuC1209l2.r(toolbar.f9198d0);
            menuC1209l2.r(toolbar.f9199e0);
        }
        if (toolbar.f9199e0 == null) {
            toolbar.f9199e0 = new C1281T0(toolbar);
        }
        c1312j2.f14802H = true;
        if (menuC1209l != null) {
            menuC1209l.b(c1312j2, toolbar.f9214z);
            menuC1209l.b(toolbar.f9199e0, toolbar.f9214z);
        } else {
            c1312j2.i(toolbar.f9214z, null);
            toolbar.f9199e0.i(toolbar.f9214z, null);
            c1312j2.h(true);
            toolbar.f9199e0.h(true);
        }
        toolbar.f9205q.setPopupTheme(toolbar.f9172A);
        toolbar.f9205q.setPresenter(c1312j2);
        toolbar.f9198d0 = c1312j2;
        toolbar.u();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        o0 o0VarG = o0.g(this, windowInsets);
        boolean zC = c(this.f9139t, new Rect(o0VarG.b(), o0VarG.d(), o0VarG.c(), o0VarG.a()), false);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        Rect rect = this.f9120C;
        AbstractC1826B.b(this, o0VarG, rect);
        int i = rect.left;
        int i7 = rect.top;
        int i8 = rect.right;
        int i9 = rect.bottom;
        l0 l0Var = o0VarG.f18232a;
        o0 o0VarN = l0Var.n(i, i7, i8, i9);
        this.f9124G = o0VarN;
        boolean z5 = true;
        if (!this.f9125H.equals(o0VarN)) {
            this.f9125H = this.f9124G;
            zC = true;
        }
        Rect rect2 = this.f9121D;
        if (rect2.equals(rect)) {
            z5 = zC;
        } else {
            rect2.set(rect);
        }
        if (z5) {
            requestLayout();
        }
        return l0Var.a().f18232a.c().f18232a.b().f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f(getContext());
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1298c c1298c = (C1298c) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i11 = ((ViewGroup.MarginLayoutParams) c1298c).leftMargin + paddingLeft;
                int i12 = ((ViewGroup.MarginLayoutParams) c1298c).topMargin + paddingTop;
                childAt.layout(i11, i12, measuredWidth + i11, measuredHeight + i12);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            r12 = this;
            r12.k()
            androidx.appcompat.widget.ActionBarContainer r1 = r12.f9139t
            r3 = 0
            r5 = 0
            r0 = r12
            r2 = r13
            r4 = r14
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r13 = r0.f9139t
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()
            m.c r13 = (m.C1298c) r13
            androidx.appcompat.widget.ActionBarContainer r14 = r0.f9139t
            int r14 = r14.getMeasuredWidth()
            int r1 = r13.leftMargin
            int r14 = r14 + r1
            int r1 = r13.rightMargin
            int r14 = r14 + r1
            r1 = 0
            int r14 = java.lang.Math.max(r1, r14)
            androidx.appcompat.widget.ActionBarContainer r3 = r0.f9139t
            int r3 = r3.getMeasuredHeight()
            int r5 = r13.topMargin
            int r3 = r3 + r5
            int r13 = r13.bottomMargin
            int r3 = r3 + r13
            int r13 = java.lang.Math.max(r1, r3)
            androidx.appcompat.widget.ActionBarContainer r3 = r0.f9139t
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r1, r3)
            java.util.WeakHashMap r5 = w1.AbstractC1835K.f18149a
            int r5 = r12.getWindowSystemUiVisibility()
            r5 = r5 & 256(0x100, float:3.59E-43)
            r6 = 1
            if (r5 == 0) goto L4d
            r5 = r6
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r5 == 0) goto L62
            int r7 = r0.f9136q
            boolean r8 = r0.f9143x
            if (r8 == 0) goto L74
            androidx.appcompat.widget.ActionBarContainer r8 = r0.f9139t
            android.view.View r8 = r8.getTabContainer()
            if (r8 == 0) goto L74
            int r8 = r0.f9136q
            int r7 = r7 + r8
            goto L74
        L62:
            androidx.appcompat.widget.ActionBarContainer r7 = r0.f9139t
            int r7 = r7.getVisibility()
            r8 = 8
            if (r7 == r8) goto L73
            androidx.appcompat.widget.ActionBarContainer r7 = r0.f9139t
            int r7 = r7.getMeasuredHeight()
            goto L74
        L73:
            r7 = r1
        L74:
            android.graphics.Rect r8 = r0.f9120C
            android.graphics.Rect r9 = r0.f9122E
            r9.set(r8)
            w1.o0 r8 = r0.f9124G
            r0.f9126I = r8
            boolean r8 = r0.f9142w
            if (r8 != 0) goto Laa
            if (r5 != 0) goto Laa
            m.d r5 = r0.f9135R
            w1.o0 r8 = androidx.appcompat.widget.ActionBarOverlayLayout.f9116T
            android.graphics.Rect r10 = r0.f9123F
            w1.AbstractC1826B.b(r5, r8, r10)
            android.graphics.Rect r5 = androidx.appcompat.widget.ActionBarOverlayLayout.f9117U
            boolean r5 = r10.equals(r5)
            if (r5 != 0) goto Laa
            int r5 = r9.top
            int r5 = r5 + r7
            r9.top = r5
            int r5 = r9.bottom
            r9.bottom = r5
            w1.o0 r5 = r0.f9126I
            w1.l0 r5 = r5.f18232a
            w1.o0 r1 = r5.n(r1, r7, r1, r1)
            r0.f9126I = r1
            goto Lf7
        Laa:
            w1.o0 r1 = r0.f9126I
            int r1 = r1.b()
            w1.o0 r5 = r0.f9126I
            int r5 = r5.d()
            int r5 = r5 + r7
            w1.o0 r7 = r0.f9126I
            int r7 = r7.c()
            w1.o0 r8 = r0.f9126I
            int r8 = r8.a()
            n1.b r1 = n1.b.b(r1, r5, r7, r8)
            w1.o0 r5 = r0.f9126I
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r7 < r8) goto Ld5
            w1.d0 r7 = new w1.d0
            r7.<init>(r5)
            goto Lee
        Ld5:
            r8 = 30
            if (r7 < r8) goto Ldf
            w1.c0 r7 = new w1.c0
            r7.<init>(r5)
            goto Lee
        Ldf:
            r8 = 29
            if (r7 < r8) goto Le9
            w1.b0 r7 = new w1.b0
            r7.<init>(r5)
            goto Lee
        Le9:
            w1.a0 r7 = new w1.a0
            r7.<init>(r5)
        Lee:
            r7.g(r1)
            w1.o0 r1 = r7.b()
            r0.f9126I = r1
        Lf7:
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.f9138s
            c(r1, r9, r6)
            w1.o0 r1 = r0.f9127J
            w1.o0 r5 = r0.f9126I
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L10f
            w1.o0 r1 = r0.f9126I
            r0.f9127J = r1
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.f9138s
            w1.AbstractC1835K.b(r5, r1)
        L10f:
            androidx.appcompat.widget.ContentFrameLayout r7 = r0.f9138s
            r9 = 0
            r11 = 0
            r6 = r0
            r8 = r2
            r10 = r4
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.f9138s
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            m.c r1 = (m.C1298c) r1
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.f9138s
            int r5 = r5.getMeasuredWidth()
            int r6 = r1.leftMargin
            int r5 = r5 + r6
            int r6 = r1.rightMargin
            int r5 = r5 + r6
            int r14 = java.lang.Math.max(r14, r5)
            androidx.appcompat.widget.ContentFrameLayout r5 = r0.f9138s
            int r5 = r5.getMeasuredHeight()
            int r6 = r1.topMargin
            int r5 = r5 + r6
            int r1 = r1.bottomMargin
            int r5 = r5 + r1
            int r13 = java.lang.Math.max(r13, r5)
            androidx.appcompat.widget.ContentFrameLayout r1 = r0.f9138s
            int r1 = r1.getMeasuredState()
            int r1 = android.view.View.combineMeasuredStates(r3, r1)
            int r3 = r12.getPaddingLeft()
            int r5 = r12.getPaddingRight()
            int r5 = r5 + r3
            int r5 = r5 + r14
            int r14 = r12.getPaddingTop()
            int r3 = r12.getPaddingBottom()
            int r3 = r3 + r14
            int r3 = r3 + r13
            int r13 = r12.getSuggestedMinimumHeight()
            int r13 = java.lang.Math.max(r3, r13)
            int r14 = r12.getSuggestedMinimumWidth()
            int r14 = java.lang.Math.max(r5, r14)
            int r14 = android.view.View.resolveSizeAndState(r14, r2, r1)
            int r1 = r1 << 16
            int r13 = android.view.View.resolveSizeAndState(r13, r4, r1)
            r12.setMeasuredDimension(r14, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f7, boolean z5) {
        if (!this.f9144y || !z5) {
            return false;
        }
        this.f9129L.fling(0, 0, 0, (int) f7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f9129L.getFinalY() > this.f9139t.getHeight()) {
            e();
            this.f9133P.run();
        } else {
            e();
            this.f9132O.run();
        }
        this.f9145z = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f7) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i7, int[] iArr) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i7, int i8, int i9) {
        int i10 = this.f9118A + i7;
        this.f9118A = i10;
        setActionBarHideOffset(i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        I i7;
        j jVar;
        this.f9134Q.f3616a = i;
        this.f9118A = getActionBarHideOffset();
        e();
        InterfaceC1296b interfaceC1296b = this.f9128K;
        if (interfaceC1296b == null || (jVar = (i7 = (I) interfaceC1296b).f13232L) == null) {
            return;
        }
        jVar.a();
        i7.f13232L = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f9139t.getVisibility() != 0) {
            return false;
        }
        return this.f9144y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f9144y || this.f9145z) {
            return;
        }
        if (this.f9118A <= this.f9139t.getHeight()) {
            e();
            postDelayed(this.f9132O, 600L);
        } else {
            e();
            postDelayed(this.f9133P, 600L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i7 = this.f9119B ^ i;
        this.f9119B = i;
        boolean z5 = (i & 4) == 0;
        boolean z6 = (i & 256) != 0;
        InterfaceC1296b interfaceC1296b = this.f9128K;
        if (interfaceC1296b != null) {
            I i8 = (I) interfaceC1296b;
            i8.f13228H = !z6;
            if (z5 || !z6) {
                if (i8.f13229I) {
                    i8.f13229I = false;
                    i8.a0(true);
                }
            } else if (!i8.f13229I) {
                i8.f13229I = true;
                i8.a0(true);
            }
        }
        if ((i7 & 256) == 0 || this.f9128K == null) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        AbstractC1862z.c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f9137r = i;
        InterfaceC1296b interfaceC1296b = this.f9128K;
        if (interfaceC1296b != null) {
            ((I) interfaceC1296b).f13227G = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActionBarHideOffset(int i) {
        e();
        this.f9139t.setTranslationY(-Math.max(0, Math.min(i, this.f9139t.getHeight())));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setActionBarVisibilityCallback(InterfaceC1296b interfaceC1296b) {
        this.f9128K = interfaceC1296b;
        if (getWindowToken() != null) {
            ((I) this.f9128K).f13227G = this.f9137r;
            int i = this.f9119B;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = AbstractC1835K.f18149a;
                AbstractC1862z.c(this);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHasNonEmbeddedTabs(boolean z5) {
        this.f9143x = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHideOnContentScrollEnabled(boolean z5) {
        if (z5 != this.f9144y) {
            this.f9144y = z5;
            if (z5) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setIcon(int i) {
        k();
        C1291Y0 c1291y0 = (C1291Y0) this.f9140u;
        c1291y0.f14733d = i != 0 ? AbstractC0597a.C(c1291y0.f14730a.getContext(), i) : null;
        c1291y0.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setLogo(int i) {
        k();
        C1291Y0 c1291y0 = (C1291Y0) this.f9140u;
        c1291y0.f14734e = i != 0 ? AbstractC0597a.C(c1291y0.f14730a.getContext(), i) : null;
        c1291y0.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setOverlayMode(boolean z5) {
        this.f9142w = z5;
    }

    public void setShowingForActionMode(boolean z5) {
    }

    public void setUiOptions(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1309h0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((C1291Y0) this.f9140u).f14737k = callback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // m.InterfaceC1309h0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        C1291Y0 c1291y0 = (C1291Y0) this.f9140u;
        if (c1291y0.f14735g) {
            return;
        }
        Toolbar toolbar = c1291y0.f14730a;
        c1291y0.f14736h = charSequence;
        if ((c1291y0.f14731b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (c1291y0.f14735g) {
                AbstractC1835K.n(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1298c(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        C1291Y0 c1291y0 = (C1291Y0) this.f9140u;
        c1291y0.f14733d = drawable;
        c1291y0.c();
    }
}
