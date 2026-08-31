package C0;

import M5.AbstractC0263y;
import P.C0371o;
import P.C0385v0;
import P.EnumC0374p0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0660x;
import c0.C0714b;
import c0.InterfaceC0728p;
import com.wnapp.smspariaz.R;
import java.lang.ref.WeakReference;
import m5.C1376o;
import q5.C1530i;
import q5.InterfaceC1529h;
import y0.AbstractC1904a;

/* JADX INFO: renamed from: C0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0065a extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WeakReference f980q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IBinder f981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w1 f982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public P.r f983t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C.k f984u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f985v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f987x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0065a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        D d5 = new D(1, this);
        addOnAttachStateChangeListener(d5);
        Z0 z02 = new Z0(0);
        l6.d.r(this).f534a.add(z02);
        this.f984u = new C.k(this, d5, z02, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setParentContext(P.r rVar) {
        if (this.f983t != rVar) {
            this.f983t = rVar;
            if (rVar != null) {
                this.f980q = null;
            }
            w1 w1Var = this.f982s;
            if (w1Var != null) {
                w1Var.d();
                this.f982s = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f981r != iBinder) {
            this.f981r = iBinder;
            this.f980q = null;
        }
    }

    public abstract void a(int i, C0371o c0371o);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        b();
        super.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        if (this.f986w) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.f983t == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        if (this.f982s == null) {
            try {
                this.f986w = true;
                this.f982s = x1.a(this, h(), new X.e(-656146368, true, new A.e0(3, this)));
            } finally {
                this.f986w = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f(int i, int i7, int i8, int i9) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i8 - i) - getPaddingRight(), (i9 - i7) - getPaddingBottom());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g(int i, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i7);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i7)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getHasComposition() {
        return this.f982s != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getShowLayoutBounds() {
        return this.f985v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final P.r h() {
        C0385v0 c0385v0;
        InterfaceC1529h interfaceC1529h;
        C0080h0 c0080h0;
        P.r rVarB = this.f983t;
        if (rVarB == null) {
            rVarB = s1.b(this);
            if (rVarB == null) {
                for (ViewParent parent = getParent(); rVarB == null && (parent instanceof View); parent = parent.getParent()) {
                    rVarB = s1.b((View) parent);
                }
            }
            if (rVarB != null) {
                P.r rVar = (!(rVarB instanceof C0385v0) || ((EnumC0374p0) ((C0385v0) rVarB).f5570t.getValue()).compareTo(EnumC0374p0.f5491r) > 0) ? rVarB : null;
                if (rVar != null) {
                    this.f980q = new WeakReference(rVar);
                }
            } else {
                rVarB = null;
            }
            if (rVarB == null) {
                WeakReference weakReference = this.f980q;
                if (weakReference == null || (rVarB = (P.r) weakReference.get()) == null || ((rVarB instanceof C0385v0) && ((EnumC0374p0) ((C0385v0) rVarB).f5570t.getValue()).compareTo(EnumC0374p0.f5491r) <= 0)) {
                    rVarB = null;
                }
                if (rVarB == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC1904a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view = this;
                    while (parent2 instanceof View) {
                        View view2 = (View) parent2;
                        if (view2.getId() == 16908290) {
                            break;
                        }
                        view = view2;
                        parent2 = view2.getParent();
                    }
                    P.r rVarB2 = s1.b(view);
                    if (rVarB2 == null) {
                        ((h1) j1.f1051a.get()).getClass();
                        InterfaceC1529h interfaceC1529h2 = C1530i.f16022q;
                        C1376o c1376o = C0076f0.f1026A;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC1529h = (InterfaceC1529h) C0076f0.f1026A.getValue();
                        } else {
                            interfaceC1529h = (InterfaceC1529h) C0076f0.f1027B.get();
                            if (interfaceC1529h == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC1529h interfaceC1529hPlus = interfaceC1529h.plus(interfaceC1529h2);
                        P.T t6 = (P.T) interfaceC1529hPlus.get(P.S.f5373r);
                        if (t6 != null) {
                            c0080h0 = new C0080h0(t6);
                            K2.a aVar = (K2.a) c0080h0.f1043s;
                            synchronized (aVar.f2860c) {
                                aVar.f2859b = false;
                            }
                        } else {
                            c0080h0 = null;
                        }
                        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                        InterfaceC1529h k02 = (InterfaceC0728p) interfaceC1529hPlus.get(C0714b.f10075D);
                        if (k02 == null) {
                            k02 = new K0();
                            yVar.f14268q = k02;
                        }
                        if (c0080h0 != null) {
                            interfaceC1529h2 = c0080h0;
                        }
                        InterfaceC1529h interfaceC1529hPlus2 = interfaceC1529hPlus.plus(interfaceC1529h2).plus(k02);
                        c0385v0 = new C0385v0(interfaceC1529hPlus2);
                        synchronized (c0385v0.f5555b) {
                            c0385v0.f5569s = true;
                        }
                        R5.d dVarA = AbstractC0263y.a(interfaceC1529hPlus2);
                        InterfaceC0660x interfaceC0660xD = androidx.lifecycle.X.d(view);
                        AbstractC0654q lifecycle = interfaceC0660xD != null ? interfaceC0660xD.getLifecycle() : null;
                        if (lifecycle == null) {
                            AbstractC1904a.c("ViewTreeLifecycleOwner not found from " + view);
                            throw new C2.e();
                        }
                        view.addOnAttachStateChangeListener(new k1(view, c0385v0));
                        lifecycle.a(new p1(dVarA, c0080h0, c0385v0, yVar, view));
                        view.setTag(R.id.androidx_compose_ui_view_composition_context, c0385v0);
                        M5.V v6 = M5.V.f3830q;
                        Handler handler = view.getHandler();
                        int i = N5.g.f4045a;
                        view.addOnAttachStateChangeListener(new D(2, AbstractC0263y.t(v6, new N5.f(handler, "windowRecomposer cleanup", false).f4044t, null, new i1(c0385v0, view, null), 2)));
                    } else {
                        if (!(rVarB2 instanceof C0385v0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c0385v0 = (C0385v0) rVarB2;
                    }
                    C0385v0 c0385v02 = ((EnumC0374p0) c0385v0.f5570t.getValue()).compareTo(EnumC0374p0.f5491r) > 0 ? c0385v0 : null;
                    if (c0385v02 != null) {
                        this.f980q = new WeakReference(c0385v02);
                    }
                    return c0385v0;
                }
            }
        }
        return rVarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f987x || super.isTransitionGroup();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        f(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        e();
        g(i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setParentCompositionContext(P.r rVar) {
        setParentContext(rVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setShowLayoutBounds(boolean z5) {
        this.f985v = z5;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((A) ((B0.t0) childAt)).setShowLayoutBounds(z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z5) {
        super.setTransitionGroup(z5);
        this.f987x = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setViewCompositionStrategy(a1 a1Var) {
        C.k kVar = this.f984u;
        if (kVar != null) {
            kVar.invoke();
        }
        ((W) a1Var).getClass();
        D d5 = new D(1, this);
        addOnAttachStateChangeListener(d5);
        Z0 z02 = new Z0(0);
        l6.d.r(this).f534a.add(z02);
        this.f984u = new C.k(this, d5, z02, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        b();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z5) {
        b();
        return super.addViewInLayout(view, i, layoutParams, z5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i7) {
        b();
        super.addView(view, i, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
