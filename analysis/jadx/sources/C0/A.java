package C0;

import B0.AbstractC0036d0;
import B0.AbstractC0041g;
import B0.AbstractC0049n;
import B0.C0030a0;
import B0.C0034c0;
import B0.C0042g0;
import B0.C0050o;
import B0.C0054t;
import C0.C0088l0;
import L0.C0192d;
import M5.AbstractC0263y;
import P.C0345b;
import P.C0354f0;
import a.AbstractC0597a;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0643f;
import androidx.lifecycle.InterfaceC0660x;
import c0.AbstractC0724l;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import e0.ViewOnAttachStateChangeListenerC1018c;
import f0.ViewOnDragListenerC1059a;
import h0.AbstractC1111d;
import h0.C1110c;
import h0.C1113f;
import h0.C1115h;
import h0.InterfaceC1114g;
import i0.C1131c;
import i3.C1136a;
import j0.AbstractC1145B;
import j0.C1147b;
import j0.C1149d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import m5.C1386y;
import m5.InterfaceC1364c;
import q5.InterfaceC1529h;
import r.AbstractC1561l;
import r.C1544C;
import r.C1566q;
import r.C1570v;
import r0.C1572b;
import r0.InterfaceC1571a;
import s0.C1587a;
import s0.C1589c;
import s0.InterfaceC1588b;
import v0.C1731A;
import v0.C1734c;
import v0.C1745n;
import v0.C1750s;
import v0.InterfaceC1741j;
import v0.InterfaceC1742k;
import w1.AbstractC1835K;
import w1.AbstractC1836L;
import x0.C1882a;
import y0.AbstractC1904a;
import z0.AbstractC1932I;
import z0.AbstractC1935L;
import z0.AbstractC1938O;
import z0.C1936M;

/* JADX INFO: loaded from: classes.dex */
public final class A extends ViewGroup implements B0.t0, B0.z0, InterfaceC0643f {

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public static Class f702S0;
    public static Method T0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B0.L f703A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f704A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1570v f705B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final C0354f0 f706B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final J0.a f707C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final C1572b f708C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final A f709D;
    public final C1589c D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final I0.n f710E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final A0.e f711E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final I f712F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final E0 f713F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ViewOnAttachStateChangeListenerC1018c f714G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public MotionEvent f715G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0077g f716H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public long f717H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C1149d f718I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final C0050o f719I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final d0.h f720J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public final C1544C f721J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final ArrayList f722K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final A1.b f723K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f724L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final RunnableC0089m f725L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f726M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f727M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f728N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public final C0112y f729N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final C1734c f730O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public final InterfaceC0090m0 f731O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final L.s f732P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f733P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public B5.c f734Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public final I0 f735Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final E.c0 f736R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final E0 f737R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final d0.b f738S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f739T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final C0081i f740U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C0079h f741V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final B0.v0 f742W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f743a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0086k0 f744b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C0115z0 f745c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public W0.a f746d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f747e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final C0030a0 f748f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f749g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int[] f750h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final float[] f751i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final float[] f752j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f753k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f754l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public long f755m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f756n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final C0354f0 f757o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final P.C f758p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f759q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public B5.c f760q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f761r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0083j f762r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B0.N f763s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC0085k f764s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0354f0 f765t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC0087l f766t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C1115h f767u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final P0.c f768u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC1529h f769v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final P0.e f770v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewOnDragListenerC1059a f771w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final AtomicReference f772w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final I0 f773x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final E0 f774x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j0.n f775y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final E0 f776y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0084j0 f777z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final C0354f0 f778z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v35, types: [C0.k] */
    /* JADX WARN: Type inference failed for: r1v36, types: [C0.l] */
    public A(Context context, InterfaceC1529h interfaceC1529h) {
        E.c0 c0Var;
        d0.b bVar;
        super(context);
        this.f759q = 9205357640488583168L;
        this.f761r = true;
        this.f763s = new B0.N();
        W0.e eVarA = Q2.g.a(context);
        P.S s6 = P.S.f5375t;
        this.f765t = new C0354f0(eVarA, s6);
        I0.d dVar = new I0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        AbstractC0036d0 abstractC0036d0 = new AbstractC0036d0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final AbstractC0724l f() {
                C0088l0 c0088l0 = new C0088l0();
                c0088l0.f1059E = this.f9339q;
                return c0088l0;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // B0.AbstractC0036d0
            public final void g(AbstractC0724l abstractC0724l) {
                ((C0088l0) abstractC0724l).f1059E = this.f9339q;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final int hashCode() {
                return this.f9339q.hashCode();
            }
        };
        int i = 0;
        int i7 = 0;
        int i8 = 0;
        final A a7 = this;
        a7.f767u = new C1115h(new C0100s(1, this, A.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", i, i7), new C0102t(2, this, A.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", i, i7), new C0097q(i8, this, A.class, "onClearFocusForOwner", "onClearFocusForOwner()V", i, 1), new C0104u(i8, 0, A.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        a7.f769v = interfaceC1529h;
        a7.f771w = new ViewOnDragListenerC1059a();
        int i9 = 0;
        a7.f773x = new I0(0);
        InterfaceC0725m interfaceC0725mA = androidx.compose.ui.input.key.a.a(new C0110x(a7, i9));
        InterfaceC0725m interfaceC0725mA2 = androidx.compose.ui.input.rotary.a.a();
        a7.f775y = new j0.n();
        a7.f777z = new C0084j0(ViewConfiguration.get(context));
        B0.L l7 = new B0.L(3);
        l7.X(C1936M.f18674a);
        l7.V(a7.getDensity());
        l7.Z(a7.getViewConfiguration());
        l7.Y(emptySemanticsElement.d(interfaceC0725mA2).d(interfaceC0725mA).d(((C1115h) a7.getFocusOwner()).f13413g).d(a7.m4getDragAndDropManager().f12680c).d(abstractC0036d0));
        a7.f703A = l7;
        C1570v c1570v = AbstractC1561l.f16221a;
        a7.f705B = new C1570v();
        a7.getLayoutNodes();
        a7.f707C = new J0.a();
        a7.f709D = a7;
        a7.f710E = new I0.n(a7.getRoot(), dVar, a7.getLayoutNodes());
        I i10 = new I(a7);
        a7.f712F = i10;
        a7.f714G = new ViewOnAttachStateChangeListenerC1018c(a7, new C0097q(0, a7, W.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0));
        C0077g c0077g = new C0077g();
        Object systemService = context.getSystemService("accessibility");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        a7.f716H = c0077g;
        a7.f718I = new C1149d(a7);
        a7.f720J = new d0.h();
        a7.f722K = new ArrayList();
        a7.f730O = new C1734c();
        B0.L root = a7.getRoot();
        L.s sVar = new L.s();
        sVar.f3062b = root;
        sVar.f3063c = new H0(root.f268U.f430b);
        sVar.f3064d = new C1136a();
        sVar.f3065e = new C0054t();
        a7.f732P = sVar;
        a7.f734Q = C0095p.f1083r;
        if (l()) {
            d0.h autofillTree = a7.getAutofillTree();
            c0Var = new E.c0();
            c0Var.f1552q = a7;
            c0Var.f1553r = autofillTree;
            AutofillManager autofillManagerD = com.google.firebase.c.d(a7.getContext().getSystemService(com.google.firebase.c.h()));
            if (autofillManagerD == null) {
                throw new IllegalStateException("Autofill service could not be located.");
            }
            c0Var.f1554s = autofillManagerD;
            a7.setImportantForAutofill(1);
            E0.a aVarB = P1.B(a7);
            AutofillId autofillIdH = aVarB != null ? U.h(aVarB.f1611a) : null;
            if (autofillIdH == null) {
                throw S.i("Required value was null.");
            }
            c0Var.f1555t = autofillIdH;
        } else {
            c0Var = null;
        }
        a7.f736R = c0Var;
        if (l()) {
            AutofillManager autofillManagerD2 = com.google.firebase.c.d(context.getSystemService(com.google.firebase.c.h()));
            if (autofillManagerD2 == null) {
                throw S.i("Autofill service could not be located.");
            }
            a7 = this;
            bVar = new d0.b(new k3.d(23, autofillManagerD2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            bVar = null;
        }
        a7.f738S = bVar;
        a7.f740U = new C0081i(context);
        a7.m3getClipboardManager();
        a7.f741V = new C0079h();
        a7.f742W = new B0.v0(new C0110x(a7, 1));
        a7.f748f0 = new C0030a0(a7.getRoot());
        long j = Integer.MAX_VALUE;
        a7.f749g0 = (j & 4294967295L) | (j << 32);
        a7.f750h0 = new int[]{0, 0};
        float[] fArrJ = AbstractC1145B.j();
        a7.f751i0 = AbstractC1145B.j();
        a7.f752j0 = AbstractC1145B.j();
        a7.f753k0 = -1L;
        a7.f755m0 = 9187343241974906880L;
        a7.f756n0 = true;
        a7.f757o0 = C0345b.q(null);
        a7.f758p0 = C0345b.m(new C0112y(a7, 1));
        a7.f762r0 = new ViewTreeObserverOnGlobalLayoutListenerC0083j(i9, a7);
        a7.f764s0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: C0.k
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f1052a.P();
            }
        };
        a7.f766t0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: C0.l
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z5) {
                this.f1058q.D0.f16415a.setValue(new C1587a(z5 ? 1 : 2));
            }
        };
        a7.f768u0 = new P0.c(a7.getView(), a7);
        P0.e eVar = new P0.e();
        new AtomicReference(null);
        a7.f770v0 = eVar;
        a7.f772w0 = new AtomicReference(null);
        a7.getTextInputService();
        a7.f774x0 = new E0();
        a7.f776y0 = new E0();
        a7.f778z0 = new C0354f0(P1.r(context), s6);
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = Build.VERSION.SDK_INT;
        a7.f704A0 = i11 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        W0.l lVar = W0.l.f8022q;
        W0.l lVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : W0.l.f8023r : lVar;
        a7.f706B0 = C0345b.q(lVar2 != null ? lVar2 : lVar);
        a7.f708C0 = new C1572b();
        a7.D0 = new C1589c(a7.isInTouchMode() ? 1 : 2);
        a7.f711E0 = new A0.e(a7);
        a7.f713F0 = new E0();
        a7.f719I0 = new C0050o(4);
        a7.f721J0 = new C1544C();
        a7.f723K0 = new A1.b(1, a7);
        a7.f725L0 = new RunnableC0089m(i9, a7);
        a7.f729N0 = new C0112y(a7, i9);
        a7.f731O0 = i11 < 29 ? new C0092n0(fArrJ) : new C0094o0();
        a7.addOnAttachStateChangeListener(a7.f714G);
        a7.setWillNotDraw(false);
        a7.setFocusable(true);
        if (i11 >= 26) {
            V.f936a.a(a7, 1, false);
        }
        a7.setFocusableInTouchMode(true);
        a7.setClipChildren(false);
        AbstractC1835K.m(a7, i10);
        a7.setOnDragListener(a7.m4getDragAndDropManager());
        a7.getRoot().b(a7);
        if (i11 >= 29) {
            O.f904a.a(a7);
        }
        a7.f735Q0 = i11 >= 31 ? new I0(1) : null;
        E0 e02 = new E0();
        InterfaceC1741j.f17459a.getClass();
        a7.f737R0 = e02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(A a7, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        I i7 = a7.f712F;
        if (kotlin.jvm.internal.m.a(str, i7.f845G)) {
            int iD2 = i7.f843E.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!kotlin.jvm.internal.m.a(str, i7.f846H) || (iD = i7.f844F.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final C0091n get_viewTreeOwners() {
        return (C0091n) this.f757o0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean k(A a7, C1110c c1110c, C1131c c1131c) {
        Integer numD;
        if (a7.isFocused() || a7.hasFocus()) {
            return true;
        }
        return super.requestFocus((c1110c == null || (numD = AbstractC1111d.D(c1110c.f13400a)) == null) ? 130 : numD.intValue(), c1131c != null ? AbstractC1145B.u(c1131c) : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean l() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof A) {
                ((A) childAt).C();
            } else if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long o(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static View p(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (kotlin.jvm.internal.m.a(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View viewP = p(viewGroup.getChildAt(i7), i);
                    if (viewP != null) {
                        return viewP;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(B0.L l7) {
        l7.B();
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            s((B0.L) objArr[i7]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setDensity(W0.c cVar) {
        this.f765t.setValue(cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setFontFamilyResolver(O0.d dVar) {
        this.f778z0.setValue(dVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setLayoutDirection(W0.l lVar) {
        this.f706B0.setValue(lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void set_viewTreeOwners(C0091n c0091n) {
        this.f757o0.setValue(c0091n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean u(MotionEvent motionEvent) {
        boolean z5 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z5) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z5 = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !L0.f889a.a(motionEvent, i));
                if (z5) {
                    break;
                }
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(B0.L l7, long j) {
        C0030a0 c0030a0 = this.f748f0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c0030a0.k(l7, j);
            if (!c0030a0.f364b.E()) {
                c0030a0.a(false);
                if (this.f728N) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f728N = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(B0.s0 s0Var, boolean z5) {
        ArrayList arrayList = this.f722K;
        if (!z5) {
            if (this.f726M) {
                return;
            }
            arrayList.remove(s0Var);
            ArrayList arrayList2 = this.f724L;
            if (arrayList2 != null) {
                arrayList2.remove(s0Var);
                return;
            }
            return;
        }
        if (!this.f726M) {
            arrayList.add(s0Var);
            return;
        }
        ArrayList arrayList3 = this.f724L;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f724L = arrayList3;
        }
        arrayList3.add(s0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C() {
        d0.b bVar;
        if (this.f739T) {
            a0.t tVar = getSnapshotObserver().f519a;
            synchronized (tVar.f8705g) {
                try {
                    R.e eVar = tVar.f;
                    int i = eVar.f6678s;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i; i8++) {
                        a0.s sVar = (a0.s) eVar.f6676q[i8];
                        sVar.e();
                        if (!(sVar.f.f16137e != 0)) {
                            i7++;
                        } else if (i7 > 0) {
                            Object[] objArr = eVar.f6676q;
                            objArr[i8 - i7] = objArr[i8];
                        }
                    }
                    int i9 = i - i7;
                    Arrays.fill(eVar.f6676q, i9, i, (Object) null);
                    eVar.f6678s = i9;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f739T = false;
        }
        C0086k0 c0086k0 = this.f744b0;
        if (c0086k0 != null) {
            m(c0086k0);
        }
        if (l() && (bVar = this.f738S) != null) {
            r.w wVar = bVar.f11790g;
            if (wVar.f16256d == 0 && bVar.f11791h) {
                ((AutofillManager) bVar.f11785a.f14122r).commit();
                bVar.f11791h = false;
            }
            if (wVar.f16256d != 0) {
                bVar.f11791h = true;
            }
        }
        while (this.f721J0.h() && this.f721J0.e(0) != null) {
            int i10 = this.f721J0.f16115b;
            for (int i11 = 0; i11 < i10; i11++) {
                B5.a aVar = (B5.a) this.f721J0.e(i11);
                C1544C c1544c = this.f721J0;
                if (i11 < 0 || i11 >= c1544c.f16115b) {
                    c1544c.l(i11);
                    throw null;
                }
                Object[] objArr2 = c1544c.f16114a;
                Object obj = objArr2[i11];
                objArr2[i11] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            this.f721J0.j(0, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1131c D() {
        if (isFocused()) {
            h0.o oVarG = AbstractC1111d.g(((C1115h) getFocusOwner()).f13411d);
            if (oVarG != null) {
                return AbstractC1111d.j(oVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC1111d.d(viewFindFocus, this);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(B0.L l7) {
        I i = this.f712F;
        i.f839A = true;
        if (i.u()) {
            i.v(l7);
        }
        ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c = this.f714G;
        viewOnAttachStateChangeListenerC1018c.f12491w = true;
        if (viewOnAttachStateChangeListenerC1018c.i()) {
            viewOnAttachStateChangeListenerC1018c.f12492x.j(C1386y.f15098a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(B0.L l7, boolean z5, boolean z6, boolean z7) {
        B0.L lS;
        B0.L lS2;
        B0.Y y6;
        B0.M m4;
        C0030a0 c0030a0 = this.f748f0;
        if (!z5) {
            if (c0030a0.p(l7, z6) && z7) {
                L(l7);
                return;
            }
            return;
        }
        C0050o c0050o = c0030a0.f364b;
        B0.L l8 = l7.f286x;
        B0.P p7 = l7.f269V;
        if (l8 == null) {
            AbstractC1904a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = p7.f302d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new C2.e();
                }
                if (!p7.f303e || z6) {
                    p7.f303e = true;
                    p7.f311p.f383J = true;
                    if (l7.f278e0) {
                        return;
                    }
                    if ((kotlin.jvm.internal.m.a(l7.H(), Boolean.TRUE) || (p7.f303e && (l7.r() == B0.I.f237q || !((y6 = p7.f312q) == null || (m4 = y6.f346G) == null || !m4.e())))) && ((lS = l7.s()) == null || !lS.f269V.f303e)) {
                        c0050o.l(l7, true);
                    } else if ((l7.G() || C0030a0.h(l7)) && ((lS2 = l7.s()) == null || !lS2.q())) {
                        c0050o.l(l7, false);
                    }
                    if (c0030a0.f366d || !z7) {
                        return;
                    }
                    L(l7);
                    return;
                }
                return;
            }
        }
        c0030a0.f369h.c(new B0.Z(l7, true, z6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(B0.L l7, boolean z5, boolean z6) {
        B0.P p7 = l7.f269V;
        C0030a0 c0030a0 = this.f748f0;
        if (!z5) {
            c0030a0.getClass();
            int iOrdinal = p7.f302d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new C2.e();
            }
            B0.L lS = l7.s();
            boolean z7 = lS == null || lS.G();
            if (!z6) {
                if (l7.q()) {
                    return;
                }
                if (l7.p() && l7.G() == z7 && l7.G() == p7.f311p.f382I) {
                    return;
                }
            }
            C0034c0 c0034c0 = p7.f311p;
            c0034c0.f384K = true;
            c0034c0.f385L = true;
            if (!l7.f278e0 && c0034c0.f382I && z7) {
                if ((lS == null || !lS.p()) && (lS == null || !lS.q())) {
                    c0030a0.f364b.l(l7, false);
                }
                if (c0030a0.f366d) {
                    return;
                }
                L(null);
                return;
            }
            return;
        }
        C0050o c0050o = c0030a0.f364b;
        int iOrdinal2 = p7.f302d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new C2.e();
                }
            }
        }
        if ((p7.f303e || p7.f) && !z6) {
            return;
        }
        p7.f = true;
        p7.f304g = true;
        C0034c0 c0034c02 = p7.f311p;
        c0034c02.f384K = true;
        c0034c02.f385L = true;
        if (l7.f278e0) {
            return;
        }
        B0.L lS2 = l7.s();
        if (kotlin.jvm.internal.m.a(l7.H(), Boolean.TRUE) && ((lS2 == null || !lS2.f269V.f303e) && (lS2 == null || !lS2.f269V.f))) {
            c0050o.l(l7, true);
        } else if (l7.G() && ((lS2 == null || !lS2.p()) && (lS2 == null || !lS2.q()))) {
            c0050o.l(l7, false);
        }
        if (c0030a0.f366d) {
            return;
        }
        L(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H() {
        I i = this.f712F;
        i.f839A = true;
        if (i.u() && !i.f850L) {
            i.f850L = true;
            i.f859l.post(i.f851M);
        }
        ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c = this.f714G;
        viewOnAttachStateChangeListenerC1018c.f12491w = true;
        if (!viewOnAttachStateChangeListenerC1018c.i() || viewOnAttachStateChangeListenerC1018c.f12483D) {
            return;
        }
        viewOnAttachStateChangeListenerC1018c.f12483D = true;
        viewOnAttachStateChangeListenerC1018c.f12493y.post(viewOnAttachStateChangeListenerC1018c.f12484E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() {
        if (this.f754l0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f753k0) {
            this.f753k0 = jCurrentAnimationTimeMillis;
            InterfaceC0090m0 interfaceC0090m0 = this.f731O0;
            float[] fArr = this.f751i0;
            interfaceC0090m0.a(this, fArr);
            W.i(fArr, this.f752j0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f750h0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f7 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f755m0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f7 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(MotionEvent motionEvent) {
        this.f753k0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0090m0 interfaceC0090m0 = this.f731O0;
        float[] fArr = this.f751i0;
        interfaceC0090m0.a(this, fArr);
        W.i(fArr, this.f752j0);
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        long jO = AbstractC1145B.o(fArr, (((long) Float.floatToRawIntBits(x6)) << 32) | (((long) Float.floatToRawIntBits(y6)) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jO >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jO & 4294967295L));
        this.f755m0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(B0.s0 s0Var) {
        C0050o c0050o;
        R.e eVar;
        Reference referencePoll;
        if (this.f745c0 != null) {
            c1 c1Var = d1.f1004F;
        }
        do {
            c0050o = this.f719I0;
            ReferenceQueue referenceQueue = (ReferenceQueue) c0050o.f500r;
            eVar = (R.e) c0050o.f499q;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                eVar.l(referencePoll);
            }
        } while (referencePoll != null);
        eVar.c(new WeakReference(s0Var, (ReferenceQueue) c0050o.f500r));
        this.f722K.remove(s0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(B0.L l7) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (l7 != null) {
            while (l7 != null && l7.f269V.f311p.f375B == B0.I.f237q) {
                if (!this.f747e0) {
                    B0.L lS = l7.s();
                    if (lS == null) {
                        break;
                    }
                    long j = lS.f268U.f430b.f18667t;
                    if (W0.a.f(j) && W0.a.e(j)) {
                        break;
                    }
                }
                l7 = l7.s();
            }
            if (l7 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long M(long j) {
        I();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f755m0 >> 32));
        return AbstractC1145B.o(this.f752j0, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f755m0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int N(MotionEvent motionEvent) {
        Object obj;
        if (this.f733P0) {
            this.f733P0 = false;
            int metaState = motionEvent.getMetaState();
            this.f773x.getClass();
            g1.f1040a.setValue(new C1750s(metaState));
        }
        C1734c c1734c = this.f730O;
        Z.m mVarA = c1734c.a(this, motionEvent);
        L.s sVar = this.f732P;
        if (mVarA == null) {
            if (!sVar.f3061a) {
                ((C1566q) ((C1136a) sVar.f3064d).f13562r).a();
                ((H0) sVar.f3063c).e();
            }
            return 0;
        }
        List list = (List) mVarA.f8312r;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((C1745n) obj).f17479e) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        C1745n c1745n = (C1745n) obj;
        if (c1745n != null) {
            this.f759q = c1745n.f17478d;
        }
        int iE = sVar.e(mVarA, this, w(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iE & 1) != 0) {
            return iE;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c1734c.f17441c.delete(pointerId);
        c1734c.f17440b.delete(pointerId);
        return iE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void O(MotionEvent motionEvent, int i, long j, boolean z5) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i7 = 0; i7 < pointerCount; i7++) {
            pointerPropertiesArr[i7] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i8 = 0; i8 < pointerCount; i8++) {
            pointerCoordsArr[i8] = new MotionEvent.PointerCoords();
        }
        int i9 = 0;
        while (i9 < pointerCount) {
            int i10 = ((actionIndex < 0 || i9 < actionIndex) ? 0 : 1) + i9;
            motionEvent.getPointerProperties(i10, pointerPropertiesArr[i9]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i9];
            motionEvent.getPointerCoords(i10, pointerCoords);
            float f = pointerCoords.x;
            long jY = y((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jY >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jY & 4294967295L));
            i9++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z5 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        Z.m mVarA = this.f730O.a(this, motionEventObtain);
        kotlin.jvm.internal.m.b(mVarA);
        this.f732P.e(mVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            r13 = this;
            int[] r0 = r13.f750h0
            r13.getLocationOnScreen(r0)
            long r1 = r13.f749g0
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            r2 = 0
            r7 = r0[r2]
            r8 = 1
            if (r4 != r7) goto L25
            r9 = r0[r8]
            if (r1 != r9) goto L25
            long r9 = r13.f753k0
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L42
        L25:
            r0 = r0[r8]
            long r9 = (long) r7
            long r9 = r9 << r3
            long r11 = (long) r0
            long r5 = r5 & r11
            long r5 = r5 | r9
            r13.f749g0 = r5
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L42
            if (r1 == r0) goto L42
            B0.L r0 = r13.getRoot()
            B0.P r0 = r0.f269V
            B0.c0 r0 = r0.f311p
            r0.c0()
            r0 = r8
            goto L43
        L42:
            r0 = r2
        L43:
            r13.I()
            J0.a r1 = r13.getRectManager()
            long r3 = r13.f749g0
            long r5 = r13.f755m0
            long r5 = com.google.android.gms.internal.measurement.K1.K(r5)
            r1.getClass()
            float[] r7 = r13.f751i0
            int r9 = n5.AbstractC1397A.i(r7)
            J0.b r10 = r1.f2493b
            r9 = r9 & 2
            if (r9 != 0) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            long r11 = r10.f2501c
            boolean r9 = W0.i.a(r5, r11)
            if (r9 != 0) goto L6f
            r10.f2501c = r5
            r5 = r8
            goto L70
        L6f:
            r5 = r2
        L70:
            long r11 = r10.f2502d
            boolean r6 = W0.i.a(r3, r11)
            if (r6 != 0) goto L7b
            r10.f2502d = r3
            r5 = r8
        L7b:
            if (r7 == 0) goto L7e
            r5 = r8
        L7e:
            if (r5 != 0) goto L84
            boolean r3 = r1.f2496e
            if (r3 == 0) goto L85
        L84:
            r2 = r8
        L85:
            r1.f2496e = r2
            B0.a0 r1 = r13.f748f0
            r1.a(r0)
            J0.a r0 = r13.getRectManager()
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.A.P():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        I0.i iVarU;
        B5.c cVar;
        if (l()) {
            d0.b bVar = this.f738S;
            if (bVar != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = sparseArray.keyAt(i);
                    AutofillValue autofillValueE = com.google.firebase.c.e(sparseArray.get(iKeyAt));
                    if (autofillValueE.isText()) {
                        B0.L l7 = (B0.L) bVar.f11786b.f2273c.b(iKeyAt);
                        if (l7 != null && (iVarU = l7.u()) != null) {
                            Object objG = iVarU.f2257q.g(I0.h.f2239g);
                            if (objG == null) {
                                objG = null;
                            }
                            I0.a aVar = (I0.a) objG;
                            if (aVar != null && (cVar = (B5.c) aVar.f2222b) != null) {
                            }
                        }
                    } else if (autofillValueE.isDate()) {
                        Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                    } else if (autofillValueE.isList()) {
                        Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                    } else if (autofillValueE.isToggle()) {
                        Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                    }
                }
            }
            E.c0 c0Var = this.f736R;
            if (c0Var != null) {
                d0.h hVar = (d0.h) c0Var.f1553r;
                if (hVar.f11794a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    int iKeyAt2 = sparseArray.keyAt(i7);
                    AutofillValue autofillValueE2 = com.google.firebase.c.e(sparseArray.get(iKeyAt2));
                    if (autofillValueE2.isText()) {
                        autofillValueE2.getTextValue().toString();
                        if (hVar.f11794a.get(Integer.valueOf(iKeyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (autofillValueE2.isDate()) {
                            throw new A5.a("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueE2.isList()) {
                            throw new A5.a("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueE2.isToggle()) {
                            throw new A5.a("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void b(InterfaceC0660x interfaceC0660x) {
        setShowLayoutBounds(E0.a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f712F.m(false, i, this.f759q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f712F.m(true, i, this.f759q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            s(getRoot());
        }
        z(true);
        a0.n.k().m();
        this.f726M = true;
        j0.n nVar = this.f775y;
        C1147b c1147b = nVar.f13717a;
        Canvas canvas2 = c1147b.f13696a;
        c1147b.f13696a = canvas;
        getRoot().j(c1147b, null);
        nVar.f13717a.f13696a = canvas2;
        ArrayList arrayList = this.f722K;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((B0.s0) arrayList.get(i)).e();
            }
        }
        if (d1.f1008J) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f726M = false;
        ArrayList arrayList2 = this.f724L;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C1882a c1882a;
        int size;
        C0042g0 c0042g0;
        AbstractC0724l abstractC0724lF;
        C0042g0 c0042g02;
        if (this.f727M0) {
            RunnableC0089m runnableC0089m = this.f725L0;
            removeCallbacks(runnableC0089m);
            if (motionEvent.getActionMasked() == 8) {
                this.f727M0 = false;
            } else {
                runnableC0089m.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (u(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (r(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            Method method = AbstractC1836L.f18154a;
            E0.d.d(viewConfiguration);
        } else {
            AbstractC1836L.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i >= 26) {
            E0.d.c(viewConfiguration);
        } else {
            AbstractC1836L.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        InterfaceC1114g focusOwner = getFocusOwner();
        B0.K k7 = new B0.K(4, this, motionEvent);
        C1115h c1115h = (C1115h) focusOwner;
        if (c1115h.f13412e.f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        h0.o oVarG = AbstractC1111d.g(c1115h.f13411d);
        if (oVarG != null) {
            if (!oVarG.f10100q.f10099D) {
                AbstractC1904a.b("visitAncestors called on an unattached node");
            }
            AbstractC0724l abstractC0724l = oVarG.f10100q;
            B0.L lU = AbstractC0041g.u(oVarG);
            loop0: while (true) {
                if (lU == null) {
                    abstractC0724lF = null;
                    break;
                }
                if ((lU.f268U.f433e.f10103t & 16384) != 0) {
                    while (abstractC0724l != null) {
                        if ((abstractC0724l.f10102s & 16384) != 0) {
                            R.e eVar = null;
                            abstractC0724lF = abstractC0724l;
                            while (abstractC0724lF != null) {
                                if (abstractC0724lF instanceof C1882a) {
                                    break loop0;
                                }
                                if ((abstractC0724lF.f10102s & 16384) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                    int i7 = 0;
                                    for (AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                                        if ((abstractC0724l2.f10102s & 16384) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                abstractC0724lF = abstractC0724l2;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (abstractC0724lF != null) {
                                                    eVar.c(abstractC0724lF);
                                                    abstractC0724lF = null;
                                                }
                                                eVar.c(abstractC0724l2);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                abstractC0724lF = AbstractC0041g.f(eVar);
                            }
                        }
                        abstractC0724l = abstractC0724l.f10104u;
                    }
                }
                lU = lU.s();
                abstractC0724l = (lU == null || (c0042g02 = lU.f268U) == null) ? null : c0042g02.f432d;
            }
            c1882a = (C1882a) abstractC0724lF;
        } else {
            c1882a = null;
        }
        if (c1882a != null) {
            C1882a c1882a2 = c1882a;
            if (!c1882a2.f10100q.f10099D) {
                AbstractC1904a.b("visitAncestors called on an unattached node");
            }
            AbstractC0724l abstractC0724l3 = c1882a2.f10100q.f10104u;
            B0.L lU2 = AbstractC0041g.u(c1882a);
            ArrayList arrayList = null;
            while (lU2 != null) {
                if ((lU2.f268U.f433e.f10103t & 16384) != 0) {
                    while (abstractC0724l3 != null) {
                        if ((abstractC0724l3.f10102s & 16384) != 0) {
                            AbstractC0724l abstractC0724lF2 = abstractC0724l3;
                            R.e eVar2 = null;
                            while (abstractC0724lF2 != null) {
                                if (abstractC0724lF2 instanceof C1882a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC0724lF2);
                                } else if ((abstractC0724lF2.f10102s & 16384) != 0 && (abstractC0724lF2 instanceof AbstractC0049n)) {
                                    int i8 = 0;
                                    for (AbstractC0724l abstractC0724l4 = ((AbstractC0049n) abstractC0724lF2).f473F; abstractC0724l4 != null; abstractC0724l4 = abstractC0724l4.f10105v) {
                                        if ((abstractC0724l4.f10102s & 16384) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                abstractC0724lF2 = abstractC0724l4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new R.e(new AbstractC0724l[16]);
                                                }
                                                if (abstractC0724lF2 != null) {
                                                    eVar2.c(abstractC0724lF2);
                                                    abstractC0724lF2 = null;
                                                }
                                                eVar2.c(abstractC0724l4);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC0724lF2 = AbstractC0041g.f(eVar2);
                            }
                        }
                        abstractC0724l3 = abstractC0724l3.f10104u;
                    }
                }
                lU2 = lU2.s();
                abstractC0724l3 = (lU2 == null || (c0042g0 = lU2.f268U) == null) ? null : c0042g0.f432d;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i9 = size - 1;
                    ((C1882a) arrayList.get(size)).getClass();
                    if (i9 < 0) {
                        break;
                    }
                    size = i9;
                }
            }
            AbstractC0724l abstractC0724lF3 = c1882a2.f10100q;
            R.e eVar3 = null;
            while (abstractC0724lF3 != null) {
                if (abstractC0724lF3 instanceof C1882a) {
                } else if ((abstractC0724lF3.f10102s & 16384) != 0 && (abstractC0724lF3 instanceof AbstractC0049n)) {
                    int i10 = 0;
                    for (AbstractC0724l abstractC0724l5 = ((AbstractC0049n) abstractC0724lF3).f473F; abstractC0724l5 != null; abstractC0724l5 = abstractC0724l5.f10105v) {
                        if ((abstractC0724l5.f10102s & 16384) != 0) {
                            i10++;
                            if (i10 == 1) {
                                abstractC0724lF3 = abstractC0724l5;
                            } else {
                                if (eVar3 == null) {
                                    eVar3 = new R.e(new AbstractC0724l[16]);
                                }
                                if (abstractC0724lF3 != null) {
                                    eVar3.c(abstractC0724lF3);
                                    abstractC0724lF3 = null;
                                }
                                eVar3.c(abstractC0724l5);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                abstractC0724lF3 = AbstractC0041g.f(eVar3);
            }
            if (!((Boolean) k7.invoke()).booleanValue()) {
                AbstractC0724l abstractC0724lF4 = c1882a2.f10100q;
                R.e eVar4 = null;
                while (abstractC0724lF4 != null) {
                    if (abstractC0724lF4 instanceof C1882a) {
                    } else if ((abstractC0724lF4.f10102s & 16384) != 0 && (abstractC0724lF4 instanceof AbstractC0049n)) {
                        int i11 = 0;
                        for (AbstractC0724l abstractC0724l6 = ((AbstractC0049n) abstractC0724lF4).f473F; abstractC0724l6 != null; abstractC0724l6 = abstractC0724l6.f10105v) {
                            if ((abstractC0724l6.f10102s & 16384) != 0) {
                                i11++;
                                if (i11 == 1) {
                                    abstractC0724lF4 = abstractC0724l6;
                                } else {
                                    if (eVar4 == null) {
                                        eVar4 = new R.e(new AbstractC0724l[16]);
                                    }
                                    if (abstractC0724lF4 != null) {
                                        eVar4.c(abstractC0724lF4);
                                        abstractC0724lF4 = null;
                                    }
                                    eVar4.c(abstractC0724l6);
                                }
                            }
                        }
                        if (i11 == 1) {
                        }
                    }
                    abstractC0724lF4 = AbstractC0041g.f(eVar4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        C0095p c0095p = ((C1882a) arrayList.get(i12)).f18326E;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: C0.I.D(C0.I, int, int, java.lang.Integer, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            boolean r2 = r0.f727M0
            C0.m r3 = r0.f725L0
            if (r2 == 0) goto L10
            r0.removeCallbacks(r3)
            r3.run()
        L10:
            boolean r2 = u(r1)
            r4 = 0
            if (r2 != 0) goto L160
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L1f
            goto L160
        L1f:
            C0.I r2 = r0.f712F
            C0.A r5 = r2.f854d
            android.view.accessibility.AccessibilityManager r6 = r2.f856g
            boolean r7 = r6.isEnabled()
            r8 = 10
            r9 = 7
            r10 = 1
            if (r7 == 0) goto L11c
            boolean r6 = r6.isTouchExplorationEnabled()
            if (r6 == 0) goto L11c
            int r6 = r1.getAction()
            r7 = 256(0x100, float:3.59E-43)
            r11 = 128(0x80, float:1.794E-43)
            r12 = 0
            r13 = 12
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r9) goto L67
            r15 = 9
            if (r6 == r15) goto L67
            if (r6 == r8) goto L4c
            goto L11c
        L4c:
            int r6 = r2.f855e
            if (r6 == r14) goto L5e
            if (r6 != r14) goto L54
            goto L11c
        L54:
            r2.f855e = r14
            C0.I.D(r2, r14, r11, r12, r13)
            C0.I.D(r2, r6, r7, r12, r13)
            goto L11c
        L5e:
            C0.k0 r2 = r5.getAndroidViewsHandler$ui_release()
            r2.dispatchGenericMotionEvent(r1)
            goto L11c
        L67:
            float r6 = r1.getX()
            float r15 = r1.getY()
            r5.z(r10)
            B0.t r20 = new B0.t
            r20.<init>()
            B0.L r14 = r5.getRoot()
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r8 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r15)
            r16 = r8
            long r7 = (long) r6
            r6 = 32
            long r16 = r16 << r6
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r7 & r18
            long r6 = r16 | r6
            B0.g0 r8 = r14.f268U
            B0.n0 r9 = r8.f431c
            j0.C r14 = B0.n0.f474W
            long r18 = r9.x0(r6)
            B0.n0 r6 = r8.f431c
            B0.e r17 = B0.n0.f477Z
            r21 = 1
            r22 = 1
            r16 = r6
            r16.G0(r17, r18, r20, r21, r22)
            r6 = r20
            int r7 = com.google.android.gms.internal.measurement.AbstractC0836n2.u(r6)
        Lb1:
            r8 = -1
            if (r8 >= r7) goto Ld5
            r.C r8 = r6.f513q
            java.lang.Object r8 = r8.e(r7)
            java.lang.String r9 = "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"
            kotlin.jvm.internal.m.c(r8, r9)
            c0.l r8 = (c0.AbstractC0724l) r8
            B0.L r8 = B0.AbstractC0041g.u(r8)
            C0.k0 r9 = r5.getAndroidViewsHandler$ui_release()
            java.util.HashMap r9 = r9.getLayoutNodeToHolder()
            java.lang.Object r9 = r9.get(r8)
            Z0.j r9 = (Z0.j) r9
            if (r9 == 0) goto Ld8
        Ld5:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L106
        Ld8:
            B0.g0 r9 = r8.f268U
            r14 = 8
            boolean r9 = r9.d(r14)
            if (r9 != 0) goto Le3
            goto L102
        Le3:
            int r9 = r8.f280r
            int r9 = r2.z(r9)
            I0.m r8 = a.AbstractC0597a.a(r8, r4)
            boolean r14 = C0.W.k(r8)
            if (r14 != 0) goto Lf4
            goto L102
        Lf4:
            I0.i r8 = r8.i()
            I0.s r14 = I0.p.f2322x
            r.G r8 = r8.f2257q
            boolean r8 = r8.c(r14)
            if (r8 == 0) goto L105
        L102:
            int r7 = r7 + (-1)
            goto Lb1
        L105:
            r14 = r9
        L106:
            C0.k0 r5 = r5.getAndroidViewsHandler$ui_release()
            r5.dispatchGenericMotionEvent(r1)
            int r5 = r2.f855e
            if (r5 != r14) goto L112
            goto L11c
        L112:
            r2.f855e = r14
            C0.I.D(r2, r14, r11, r12, r13)
            r15 = 256(0x100, float:3.59E-43)
            C0.I.D(r2, r5, r15, r12, r13)
        L11c:
            int r2 = r1.getActionMasked()
            r5 = 7
            if (r2 == r5) goto L151
            r5 = 10
            if (r2 == r5) goto L128
            goto L158
        L128:
            boolean r2 = r23.w(r24)
            if (r2 == 0) goto L158
            int r2 = r1.getToolType(r4)
            r5 = 3
            if (r2 != r5) goto L13c
            int r2 = r1.getButtonState()
            if (r2 == 0) goto L13c
            goto L160
        L13c:
            android.view.MotionEvent r2 = r0.f715G0
            if (r2 == 0) goto L143
            r2.recycle()
        L143:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtainNoHistory(r1)
            r0.f715G0 = r1
            r0.f727M0 = r10
            r1 = 8
            r0.postDelayed(r3, r1)
            return r4
        L151:
            boolean r2 = r23.x(r24)
            if (r2 != 0) goto L158
            goto L160
        L158:
            int r1 = r23.r(r24)
            r1 = r1 & r10
            if (r1 == 0) goto L160
            return r10
        L160:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.A.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C1115h) getFocusOwner()).c(keyEvent, new B0.K(3, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f773x.getClass();
        g1.f1040a.setValue(new C1750s(metaState));
        return ((C1115h) getFocusOwner()).c(keyEvent, C1113f.f13407q) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0042g0 c0042g0;
        if (isFocused()) {
            C1115h c1115h = (C1115h) getFocusOwner();
            if (c1115h.f13412e.f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                h0.o oVarG = AbstractC1111d.g(c1115h.f13411d);
                if (oVarG != null) {
                    if (!oVarG.f10100q.f10099D) {
                        AbstractC1904a.b("visitAncestors called on an unattached node");
                    }
                    AbstractC0724l abstractC0724l = oVarG.f10100q;
                    B0.L lU = AbstractC0041g.u(oVarG);
                    while (lU != null) {
                        if ((lU.f268U.f433e.f10103t & 131072) != 0) {
                            while (abstractC0724l != null) {
                                if ((abstractC0724l.f10102s & 131072) != 0) {
                                    AbstractC0724l abstractC0724lF = abstractC0724l;
                                    R.e eVar = null;
                                    while (abstractC0724lF != null) {
                                        if ((abstractC0724lF.f10102s & 131072) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                                            int i = 0;
                                            for (AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                                                if ((abstractC0724l2.f10102s & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        abstractC0724lF = abstractC0724l2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new R.e(new AbstractC0724l[16]);
                                                        }
                                                        if (abstractC0724lF != null) {
                                                            eVar.c(abstractC0724lF);
                                                            abstractC0724lF = null;
                                                        }
                                                        eVar.c(abstractC0724l2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        abstractC0724lF = AbstractC0041g.f(eVar);
                                    }
                                }
                                abstractC0724l = abstractC0724l.f10104u;
                            }
                        }
                        lU = lU.s();
                        abstractC0724l = (lU == null || (c0042g0 = lU.f268U) == null) ? null : c0042g0.f432d;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            N.f902a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f727M0) {
            RunnableC0089m runnableC0089m = this.f725L0;
            removeCallbacks(runnableC0089m);
            MotionEvent motionEvent2 = this.f715G0;
            kotlin.jvm.internal.m.b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f727M0 = false;
            } else {
                runnableC0089m.run();
            }
        }
        if (!u(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || x(motionEvent))) {
            int iR = r(motionEvent);
            if ((iR & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iR & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return p(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        C1131c c1131cD;
        if (view == null || this.f748f0.f365c) {
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (view == this) {
            h0.o oVarG = AbstractC1111d.g(((C1115h) getFocusOwner()).f13411d);
            c1131cD = oVarG != null ? AbstractC1111d.j(oVarG) : null;
            if (c1131cD == null) {
                c1131cD = AbstractC1111d.d(view, this);
            }
        } else {
            c1131cD = AbstractC1111d.d(view, this);
        }
        C1110c c1110cE = AbstractC1111d.E(i);
        int i7 = c1110cE != null ? c1110cE.f13400a : 6;
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        if (((C1115h) getFocusOwner()).d(i7, c1131cD, new C0106v(yVar, 0)) != null) {
            Object obj = yVar.f14268q;
            if (obj != null) {
                if (viewFindNextFocus != null) {
                    if (i7 == 1 || i7 == 2) {
                        return super.focusSearch(view, i);
                    }
                    kotlin.jvm.internal.m.b(obj);
                    if (AbstractC1111d.p(AbstractC1111d.j((h0.o) obj), AbstractC1111d.d(viewFindNextFocus, this), c1131cD, i7)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0086k0 getAndroidViewsHandler$ui_release() {
        if (this.f744b0 == null) {
            C0086k0 c0086k0 = new C0086k0(getContext());
            this.f744b0 = c0086k0;
            addView(c0086k0, -1);
            requestLayout();
        }
        C0086k0 c0086k02 = this.f744b0;
        kotlin.jvm.internal.m.b(c0086k02);
        return c0086k02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0.e getAutofill() {
        return this.f736R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0.g getAutofillManager() {
        return this.f738S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d0.h getAutofillTree() {
        return this.f720J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B5.c getConfigurationChangeObserver() {
        return this.f734Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewOnAttachStateChangeListenerC1018c getContentCaptureManager$ui_release() {
        return this.f714G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1529h getCoroutineContext() {
        return this.f769v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public W0.c getDensity() {
        return (W0.c) this.f765t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1114g getFocusOwner() {
        return this.f767u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C1131c c1131cD = D();
        if (c1131cD != null) {
            rect.left = Math.round(c1131cD.f13522a);
            rect.top = Math.round(c1131cD.f13523b);
            rect.right = Math.round(c1131cD.f13524c);
            rect.bottom = Math.round(c1131cD.f13525d);
            return;
        }
        if (kotlin.jvm.internal.m.a(((C1115h) getFocusOwner()).d(6, null, C0095p.f1084s), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O0.d getFontFamilyResolver() {
        return (O0.d) this.f778z0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O0.c getFontLoader() {
        return this.f776y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0.t getGraphicsContext() {
        return this.f718I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1571a getHapticFeedBack() {
        return this.f708C0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getHasPendingMeasureOrLayout() {
        return this.f748f0.f364b.E();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1588b getInputModeManager() {
        return this.D0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f753k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public W0.l getLayoutDirection() {
        return (W0.l) this.f706B0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getMeasureIteration() {
        C0030a0 c0030a0 = this.f748f0;
        if (!c0030a0.f365c) {
            AbstractC1904a.a("measureIteration should be only used during the measure/layout pass");
        }
        return c0030a0.f368g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public A0.e getModifierLocalManager() {
        return this.f711E0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1932I getPlacementScope() {
        int i = AbstractC1935L.f18673b;
        return new z0.z(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1742k getPointerIconService() {
        return this.f737R0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public J0.a getRectManager() {
        return this.f707C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B0.L getRoot() {
        return this.f703A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B0.z0 getRootForTest() {
        return this.f709D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getScrollCaptureInProgress$ui_release() {
        I0 i02;
        if (Build.VERSION.SDK_INT < 31 || (i02 = this.f735Q0) == null) {
            return false;
        }
        return ((Boolean) i02.f874a.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I0.n getSemanticsOwner() {
        return this.f710E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B0.N getSharedDrawScope() {
        return this.f763s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShowLayoutBounds() {
        return this.f743a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B0.v0 getSnapshotObserver() {
        return this.f742W;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public X0 getSoftwareKeyboardController() {
        return this.f774x0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P0.e getTextInputService() {
        return this.f770v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Y0 getTextToolbar() {
        return this.f713F0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b1 getViewConfiguration() {
        return this.f777z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0091n getViewTreeOwners() {
        return (C0091n) this.f758p0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f1 getWindowInfo() {
        return this.f773x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d0.b get_autofillManager$ui_release() {
        return this.f738S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC0654q lifecycle;
        InterfaceC0660x interfaceC0660x;
        E.c0 c0Var;
        super.onAttachedToWindow();
        boolean zHasWindowFocus = hasWindowFocus();
        I0 i02 = this.f773x;
        i02.f874a.setValue(Boolean.valueOf(zHasWindowFocus));
        i02.getClass();
        t(getRoot());
        s(getRoot());
        getSnapshotObserver().f519a.d();
        if (l() && (c0Var = this.f736R) != null) {
            d0.f fVar = d0.f.f11793a;
            fVar.getClass();
            ((AutofillManager) c0Var.f1554s).registerCallback(com.google.firebase.c.c(fVar));
        }
        InterfaceC0660x interfaceC0660xD = androidx.lifecycle.X.d(this);
        g2.e eVarP = AbstractC0836n2.p(this);
        C0091n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC0660xD != null && eVarP != null && (interfaceC0660xD != (interfaceC0660x = viewTreeOwners.f1065a) || eVarP != interfaceC0660x))) {
            if (interfaceC0660xD == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (eVarP == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f1065a.getLifecycle()) != null) {
                lifecycle.c(this);
            }
            interfaceC0660xD.getLifecycle().a(this);
            C0091n c0091n = new C0091n(interfaceC0660xD, eVarP);
            set_viewTreeOwners(c0091n);
            B5.c cVar = this.f760q0;
            if (cVar != null) {
                cVar.invoke(c0091n);
            }
            this.f760q0 = null;
        }
        this.D0.f16415a.setValue(new C1587a(isInTouchMode() ? 1 : 2));
        C0091n viewTreeOwners2 = getViewTreeOwners();
        AbstractC0654q lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f1065a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw S.i("No lifecycle owner exists");
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f714G);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f762r0);
        getViewTreeObserver().addOnScrollChangedListener(this.f764s0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f766t0);
        if (Build.VERSION.SDK_INT >= 31) {
            T.f929a.b(this);
        }
        d0.b bVar = this.f738S;
        if (bVar != null) {
            ((C1115h) getFocusOwner()).i.a(bVar);
            getSemanticsOwner().f2274d.a(bVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f772w0.get() != null) {
            throw new ClassCastException();
        }
        this.f768u0.getClass();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(Q2.g.a(getContext()));
        this.f773x.getClass();
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration.fontWeightAdjustment : 0) != this.f704A0) {
            this.f704A0 = i >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(P1.r(getContext()));
        }
        this.f734Q.invoke(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f772w0.get() != null) {
            throw new ClassCastException();
        }
        this.f768u0.getClass();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        I0.m mVar;
        String strA;
        ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c = this.f714G;
        viewOnAttachStateChangeListenerC1018c.getClass();
        for (long j : jArr) {
            W0 w02 = (W0) viewOnAttachStateChangeListenerC1018c.h().b((int) j);
            if (w02 != null && (mVar = w02.f941a) != null) {
                c4.a.q();
                ViewTranslationRequest.Builder builderL = c4.a.l(viewOnAttachStateChangeListenerC1018c.f12485q.getAutofillId(), mVar.f2270g);
                Object objG = mVar.f2268d.f2257q.g(I0.p.f2323y);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = Y0.a.a(62, "\n", list)) != null) {
                    builderL.setValue("android:text", TranslationRequestValue.forText(new C0192d(strA)));
                    consumer.accept(builderL.build());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        E.c0 c0Var;
        super.onDetachedFromWindow();
        B0.v0 snapshotObserver = getSnapshotObserver();
        R4.L0 l02 = snapshotObserver.f519a.f8706h;
        if (l02 != null) {
            l02.e();
        }
        a0.t tVar = snapshotObserver.f519a;
        synchronized (tVar.f8705g) {
            R.e eVar = tVar.f;
            Object[] objArr = eVar.f6676q;
            int i = eVar.f6678s;
            for (int i7 = 0; i7 < i; i7++) {
                a0.s sVar = (a0.s) objArr[i7];
                sVar.f8695e.a();
                sVar.f.a();
                sVar.f8698k.a();
                sVar.f8699l.clear();
            }
        }
        this.f773x.getClass();
        C0091n viewTreeOwners = getViewTreeOwners();
        AbstractC0654q lifecycle = viewTreeOwners != null ? viewTreeOwners.f1065a.getLifecycle() : null;
        if (lifecycle == null) {
            throw S.i("No lifecycle owner exists");
        }
        lifecycle.c(this.f714G);
        lifecycle.c(this);
        if (l() && (c0Var = this.f736R) != null) {
            d0.f fVar = d0.f.f11793a;
            fVar.getClass();
            ((AutofillManager) c0Var.f1554s).unregisterCallback(com.google.firebase.c.c(fVar));
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f762r0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f764s0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f766t0);
        if (Build.VERSION.SDK_INT >= 31) {
            T.f929a.a(this);
        }
        d0.b bVar = this.f738S;
        if (bVar != null) {
            C1544C c1544c = getSemanticsOwner().f2274d;
            int iF = c1544c.f(bVar);
            if (iF >= 0) {
                c1544c.i(iF);
            }
            C1544C c1544c2 = ((C1115h) getFocusOwner()).i;
            int iF2 = c1544c2.f(bVar);
            if (iF2 >= 0) {
                c1544c2.i(iF2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFocusChanged(boolean z5, int i, Rect rect) {
        super.onFocusChanged(z5, i, rect);
        if (z5 || hasFocus()) {
            return;
        }
        AbstractC1111d.e(((C1115h) getFocusOwner()).f13411d, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i, int i7, int i8, int i9) {
        this.f753k0 = 0L;
        this.f748f0.j(this.f729N0);
        this.f746d0 = null;
        P();
        if (this.f744b0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i8 - i, i9 - i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i7) {
        C0030a0 c0030a0 = this.f748f0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                t(getRoot());
            }
            long jO = o(i);
            long jO2 = o(i7);
            long jW = AbstractC0597a.w((int) (jO >>> 32), (int) (jO & 4294967295L), (int) (jO2 >>> 32), (int) (4294967295L & jO2));
            W0.a aVar = this.f746d0;
            if (aVar == null) {
                this.f746d0 = new W0.a(jW);
                this.f747e0 = false;
            } else if (!W0.a.b(aVar.f8007a, jW)) {
                this.f747e0 = true;
            }
            c0030a0.q(jW);
            c0030a0.l();
            setMeasuredDimension(getRoot().f269V.f311p.f18664q, getRoot().f269V.f311p.f18665r);
            if (this.f744b0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f269V.f311p.f18664q, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f269V.f311p.f18665r, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            r11 = this;
            boolean r13 = l()
            if (r13 == 0) goto L111
            if (r12 == 0) goto L111
            r13 = 1
            d0.b r0 = r11.f738S
            if (r0 == 0) goto Lac
            I0.n r1 = r0.f11786b
            B0.L r1 = r1.f2271a
            android.view.autofill.AutofillId r2 = r0.f
            java.lang.String r3 = r0.f11789e
            J0.a r4 = r0.f11788d
            D5.a.B(r12, r1, r2, r3, r4)
            java.lang.Object[] r2 = r.M.f16159a
            r.C r2 = new r.C
            r5 = 2
            r2.<init>(r5)
            r2.a(r1)
            r2.a(r12)
        L28:
            boolean r1 = r2.h()
            if (r1 == 0) goto Lac
            int r1 = r2.f16115b
            int r1 = r1 - r13
            java.lang.Object r1 = r2.i(r1)
            java.lang.String r5 = "null cannot be cast to non-null type android.view.ViewStructure"
            kotlin.jvm.internal.m.c(r1, r5)
            android.view.ViewStructure r1 = (android.view.ViewStructure) r1
            int r5 = r2.f16115b
            int r5 = r5 - r13
            java.lang.Object r5 = r2.i(r5)
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo"
            kotlin.jvm.internal.m.c(r5, r6)
            B0.L r5 = (B0.L) r5
            java.util.List r5 = r5.n()
            int r6 = r5.size()
            r7 = 0
        L53:
            if (r7 >= r6) goto L28
            r8 = r5
            R.b r8 = (R.b) r8
            java.lang.Object r8 = r8.get(r7)
            B0.L r8 = (B0.L) r8
            boolean r9 = r8.f278e0
            if (r9 != 0) goto La9
            boolean r9 = r8.F()
            if (r9 == 0) goto La9
            boolean r9 = r8.G()
            if (r9 != 0) goto L6f
            goto La9
        L6f:
            I0.i r9 = r8.u()
            if (r9 == 0) goto La3
            r.G r9 = r9.f2257q
            I0.s r10 = I0.h.f2239g
            boolean r10 = r9.b(r10)
            if (r10 != 0) goto L8f
            I0.s r10 = I0.p.f2314p
            boolean r10 = r9.b(r10)
            if (r10 != 0) goto L8f
            I0.s r10 = I0.p.f2315q
            boolean r9 = r9.b(r10)
            if (r9 == 0) goto La3
        L8f:
            int r9 = r1.addChildCount(r13)
            android.view.ViewStructure r9 = r1.newChild(r9)
            android.view.autofill.AutofillId r10 = r0.f
            D5.a.B(r9, r8, r10, r3, r4)
            r2.a(r8)
            r2.a(r9)
            goto La9
        La3:
            r2.a(r8)
            r2.a(r1)
        La9:
            int r7 = r7 + 1
            goto L53
        Lac:
            E.c0 r0 = r11.f736R
            if (r0 == 0) goto L111
            java.lang.Object r1 = r0.f1553r
            d0.h r1 = (d0.h) r1
            java.util.LinkedHashMap r2 = r1.f11794a
            java.util.LinkedHashMap r1 = r1.f11794a
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lbf
            goto L111
        Lbf:
            int r2 = r1.size()
            int r2 = r12.addChildCount(r2)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto Ld6
            goto L111
        Ld6:
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto L10b
            android.view.ViewStructure r12 = r12.newChild(r2)
            java.lang.Object r1 = r0.f1555t
            android.view.autofill.AutofillId r1 = (android.view.autofill.AutofillId) r1
            com.google.firebase.c.s(r12, r1, r3)
            java.lang.Object r0 = r0.f1552q
            C0.A r0 = (C0.A) r0
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getPackageName()
            r1 = 0
            r12.setId(r3, r0, r1, r1)
            com.google.firebase.c.r(r12, r13)
            throw r1
        L10b:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        L111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.A.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f761r) {
            W0.l lVar = W0.l.f8022q;
            W0.l lVar2 = i != 0 ? i != 1 ? null : W0.l.f8023r : lVar;
            if (lVar2 != null) {
                lVar = lVar2;
            }
            setLayoutDirection(lVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        I0 i02;
        if (Build.VERSION.SDK_INT >= 31 && (i02 = this.f735Q0) != null) {
            I0.n semanticsOwner = getSemanticsOwner();
            InterfaceC1529h coroutineContext = getCoroutineContext();
            R.e eVar = new R.e(new H0.l[16]);
            E3.h.P(semanticsOwner.a(), 0, new H0.k(1, 8, R.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            eVar.q(new J(1, new B5.c[]{H0.d.f2049s, H0.d.f2050t}));
            int i = eVar.f6678s;
            H0.l lVar = (H0.l) (i == 0 ? null : eVar.f6676q[i - 1]);
            if (lVar != null) {
                W0.j jVar = lVar.f2071c;
                H0.f fVar = new H0.f(lVar.f2069a, jVar, AbstractC0263y.a(coroutineContext), i02, this);
                B0.n0 n0Var = lVar.f2072d;
                C1131c c1131cI = AbstractC1938O.f(n0Var).I(n0Var, true);
                long j = (((long) jVar.f8017a) << 32) | (((long) jVar.f8018b) & 4294967295L);
                ScrollCaptureTarget scrollCaptureTargetF = B3.e.f(this, new Rect(Math.round(c1131cI.f13522a), Math.round(c1131cI.f13523b), Math.round(c1131cI.f13524c), Math.round(c1131cI.f13525d)), new Point((int) (j >> 32), (int) (j & 4294967295L)), fVar);
                scrollCaptureTargetF.setScrollBounds(AbstractC1145B.t(jVar));
                consumer.accept(scrollCaptureTargetF);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c = this.f714G;
        viewOnAttachStateChangeListenerC1018c.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (kotlin.jvm.internal.m.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            C3.a.v(viewOnAttachStateChangeListenerC1018c, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC1018c.f12485q.post(new N5.c(6, viewOnAttachStateChangeListenerC1018c, longSparseArray));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        boolean zA;
        this.f773x.f874a.setValue(Boolean.valueOf(z5));
        this.f733P0 = true;
        super.onWindowFocusChanged(z5);
        if (!z5 || getShowLayoutBounds() == (zA = E0.a())) {
            return;
        }
        setShowLayoutBounds(zA);
        s(getRoot());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(B0.L l7, boolean z5) {
        this.f748f0.f(l7, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            A1.b r2 = r1.f723K0
            r1.removeCallbacks(r2)
            r7 = 0
            r16.J(r17)     // Catch: java.lang.Throwable -> L16e
            r8 = 1
            r1.f754l0 = r8     // Catch: java.lang.Throwable -> L16e
            r1.z(r7)     // Catch: java.lang.Throwable -> L16e
            java.lang.String r2 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L16e
            int r9 = r0.getActionMasked()     // Catch: java.lang.Throwable -> L2b
            android.view.MotionEvent r2 = r1.f715G0     // Catch: java.lang.Throwable -> L2b
            r10 = 3
            if (r2 == 0) goto L29
            int r3 = r2.getToolType(r7)     // Catch: java.lang.Throwable -> L2b
            if (r3 != r10) goto L29
            r11 = r8
            goto L2e
        L29:
            r11 = r7
            goto L2e
        L2b:
            r0 = move-exception
            goto L170
        L2e:
            r12 = 10
            L.s r13 = r1.f732P
            if (r2 == 0) goto L7b
            int r3 = r2.getSource()     // Catch: java.lang.Throwable -> L76
            int r4 = r0.getSource()     // Catch: java.lang.Throwable -> L76
            if (r3 != r4) goto L4b
            int r3 = r2.getToolType(r7)     // Catch: java.lang.Throwable -> L76
            int r4 = r0.getToolType(r7)     // Catch: java.lang.Throwable -> L76
            if (r3 == r4) goto L49
            goto L4b
        L49:
            r3 = r7
            goto L4c
        L4b:
            r3 = r8
        L4c:
            if (r3 == 0) goto L7b
            int r3 = r2.getButtonState()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L56
        L54:
            r14 = r2
            goto L7d
        L56:
            int r3 = r2.getActionMasked()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L54
            r4 = 2
            if (r3 == r4) goto L54
            r4 = 6
            if (r3 == r4) goto L54
            int r3 = r2.getActionMasked()     // Catch: java.lang.Throwable -> L76
            if (r3 == r12) goto L7b
            if (r11 == 0) goto L7b
            long r4 = r2.getEventTime()     // Catch: java.lang.Throwable -> L76
            r6 = 1
            r3 = 10
            r1.O(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L76
            r14 = r2
            goto L93
        L76:
            r0 = move-exception
            r1 = r16
            goto L170
        L7b:
            r14 = r2
            goto L93
        L7d:
            boolean r1 = r13.f3061a     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L93
            java.lang.Object r1 = r13.f3064d     // Catch: java.lang.Throwable -> L76
            i3.a r1 = (i3.C1136a) r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.f13562r     // Catch: java.lang.Throwable -> L76
            r.q r1 = (r.C1566q) r1     // Catch: java.lang.Throwable -> L76
            r1.a()     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r13.f3063c     // Catch: java.lang.Throwable -> L76
            C0.H0 r1 = (C0.H0) r1     // Catch: java.lang.Throwable -> L76
            r1.e()     // Catch: java.lang.Throwable -> L76
        L93:
            int r1 = r0.getToolType(r7)     // Catch: java.lang.Throwable -> L76
            if (r1 != r10) goto L9b
            r1 = r8
            goto L9c
        L9b:
            r1 = r7
        L9c:
            r15 = 9
            if (r11 != 0) goto Lba
            if (r1 == 0) goto Lba
            if (r9 == r10) goto Lba
            if (r9 == r15) goto Lba
            boolean r1 = r16.w(r17)     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto Lba
            long r4 = r0.getEventTime()     // Catch: java.lang.Throwable -> L76
            r6 = 1
            r3 = 9
            r1 = r16
            r2 = r0
            r1.O(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L2b
            goto Lbc
        Lba:
            r1 = r16
        Lbc:
            if (r14 == 0) goto Lc1
            r14.recycle()     // Catch: java.lang.Throwable -> L2b
        Lc1:
            android.view.MotionEvent r0 = r1.f715G0     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L15e
            int r0 = r0.getAction()     // Catch: java.lang.Throwable -> L2b
            if (r0 != r12) goto L15e
            android.view.MotionEvent r0 = r1.f715G0     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto Ld4
            int r0 = r0.getPointerId(r7)     // Catch: java.lang.Throwable -> L2b
            goto Ld5
        Ld4:
            r0 = -1
        Ld5:
            int r2 = r17.getAction()     // Catch: java.lang.Throwable -> L2b
            v0.c r3 = r1.f730O
            if (r2 != r15) goto Lf1
            int r2 = r17.getHistorySize()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto Lf1
            if (r0 < 0) goto L15e
            android.util.SparseBooleanArray r2 = r3.f17441c     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
            android.util.SparseLongArray r2 = r3.f17440b     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
            goto L15e
        Lf1:
            int r2 = r17.getAction()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L15e
            int r2 = r17.getHistorySize()     // Catch: java.lang.Throwable -> L2b
            if (r2 != 0) goto L15e
            android.view.MotionEvent r2 = r1.f715G0     // Catch: java.lang.Throwable -> L2b
            r4 = 2143289344(0x7fc00000, float:NaN)
            if (r2 == 0) goto L108
            float r2 = r2.getX()     // Catch: java.lang.Throwable -> L2b
            goto L109
        L108:
            r2 = r4
        L109:
            android.view.MotionEvent r5 = r1.f715G0     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L111
            float r4 = r5.getY()     // Catch: java.lang.Throwable -> L2b
        L111:
            float r5 = r17.getX()     // Catch: java.lang.Throwable -> L2b
            float r6 = r17.getY()     // Catch: java.lang.Throwable -> L2b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L123
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L123
            r2 = r7
            goto L124
        L123:
            r2 = r8
        L124:
            android.view.MotionEvent r4 = r1.f715G0     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L12d
            long r4 = r4.getEventTime()     // Catch: java.lang.Throwable -> L2b
            goto L12f
        L12d:
            r4 = -1
        L12f:
            long r9 = r17.getEventTime()     // Catch: java.lang.Throwable -> L2b
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 == 0) goto L139
            r4 = r8
            goto L13a
        L139:
            r4 = r7
        L13a:
            if (r2 != 0) goto L13e
            if (r4 == 0) goto L15e
        L13e:
            if (r0 < 0) goto L14a
            android.util.SparseBooleanArray r2 = r3.f17441c     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
            android.util.SparseLongArray r2 = r3.f17440b     // Catch: java.lang.Throwable -> L2b
            r2.delete(r0)     // Catch: java.lang.Throwable -> L2b
        L14a:
            java.lang.Object r0 = r13.f3063c     // Catch: java.lang.Throwable -> L2b
            C0.H0 r0 = (C0.H0) r0     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r0.f833c     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L155
            r0.f833c = r8     // Catch: java.lang.Throwable -> L2b
            goto L15e
        L155:
            java.lang.Object r0 = r0.f836g     // Catch: java.lang.Throwable -> L2b
            v0.e r0 = (v0.C1736e) r0     // Catch: java.lang.Throwable -> L2b
            R.e r0 = r0.f17449a     // Catch: java.lang.Throwable -> L2b
            r0.i()     // Catch: java.lang.Throwable -> L2b
        L15e:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r17)     // Catch: java.lang.Throwable -> L2b
            r1.f715G0 = r0     // Catch: java.lang.Throwable -> L2b
            int r0 = r16.N(r17)     // Catch: java.lang.Throwable -> L2b
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L16e
            r1.f754l0 = r7
            return r0
        L16e:
            r0 = move-exception
            goto L174
        L170:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L16e
            throw r0     // Catch: java.lang.Throwable -> L16e
        L174:
            r1.f754l0 = r7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.A.r(android.view.MotionEvent):int");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (isFocused()) {
            return true;
        }
        int iOrdinal = ((C1115h) getFocusOwner()).f13411d.z0().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return super.requestFocus(i, rect);
        }
        if (iOrdinal != 3) {
            throw new C2.e();
        }
        C1110c c1110cE = AbstractC1111d.E(i);
        int i7 = c1110cE != null ? c1110cE.f13400a : 7;
        return kotlin.jvm.internal.m.a(((C1115h) getFocusOwner()).d(i7, rect != null ? new C1131c(rect.left, rect.top, rect.right, rect.bottom) : null, new C.w(i7)), Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f712F.f857h = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setConfigurationChangeObserver(B5.c cVar) {
        this.f734Q = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC1018c viewOnAttachStateChangeListenerC1018c) {
        this.f714G = viewOnAttachStateChangeListenerC1018c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x0089 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0098 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x0051 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0092 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [c0.l] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(InterfaceC1529h interfaceC1529h) {
        this.f769v = interfaceC1529h;
        AbstractC0724l abstractC0724l = getRoot().f268U.f433e;
        if (abstractC0724l instanceof C1731A) {
            ((C1731A) abstractC0724l).y0();
        }
        if (!abstractC0724l.f10100q.f10099D) {
            AbstractC1904a.b("visitSubtreeIf called on an unattached node");
        }
        R.e eVar = new R.e(new AbstractC0724l[16]);
        AbstractC0724l abstractC0724l2 = abstractC0724l.f10100q;
        AbstractC0724l abstractC0724l3 = abstractC0724l2.f10105v;
        if (abstractC0724l3 == null) {
            AbstractC0041g.b(eVar, abstractC0724l2);
        } else {
            eVar.c(abstractC0724l3);
        }
        while (true) {
            int i = eVar.f6678s;
            if (i == 0) {
                return;
            }
            AbstractC0724l abstractC0724l4 = (AbstractC0724l) eVar.m(i - 1);
            if ((abstractC0724l4.f10103t & 16) != 0) {
                for (AbstractC0724l abstractC0724l5 = abstractC0724l4; abstractC0724l5 != null; abstractC0724l5 = abstractC0724l5.f10105v) {
                    if ((abstractC0724l5.f10102s & 16) != 0) {
                        ?? F6 = abstractC0724l5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof B0.y0) {
                                B0.y0 y0Var = (B0.y0) F6;
                                if (y0Var instanceof C1731A) {
                                    ((C1731A) y0Var).y0();
                                }
                            } else if ((F6.f10102s & 16) != 0 && (F6 instanceof AbstractC0049n)) {
                                AbstractC0724l abstractC0724l6 = ((AbstractC0049n) F6).f473F;
                                int i7 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC0724l6 != null) {
                                    if ((abstractC0724l6.f10102s & 16) != 0) {
                                        i7++;
                                        eVar2 = eVar2;
                                        if (i7 == 1) {
                                            F6 = abstractC0724l6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new R.e(new AbstractC0724l[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.c(F6);
                                                F6 = 0;
                                            }
                                            eVar2.c(abstractC0724l6);
                                        }
                                    }
                                    abstractC0724l6 = abstractC0724l6.f10105v;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i7 == 1) {
                                }
                            }
                            F6 = AbstractC0041g.f(eVar2);
                        }
                    }
                }
            }
            AbstractC0041g.b(eVar, abstractC0724l4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.f753k0 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnViewTreeOwnersAvailable(B5.c cVar) {
        C0091n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f760q0 = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowLayoutBounds(boolean z5) {
        this.f743a0 = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(B0.L l7) {
        this.f748f0.p(l7, false);
        R.e eVarW = l7.w();
        Object[] objArr = eVarW.f6676q;
        int i = eVarW.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            t((B0.L) objArr[i7]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean w(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        return 0.0f <= x6 && x6 <= ((float) getWidth()) && 0.0f <= y6 && y6 <= ((float) getHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f715G0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long y(long j) {
        I();
        long jO = AbstractC1145B.o(this.f751i0, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f755m0 >> 32)) + Float.intBitsToFloat((int) (jO >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f755m0 & 4294967295L)) + Float.intBitsToFloat((int) (jO & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(boolean z5) {
        C0112y c0112y;
        C0030a0 c0030a0 = this.f748f0;
        if (c0030a0.f364b.E() || ((R.e) c0030a0.f367e.f499q).f6678s != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z5) {
                try {
                    c0112y = this.f729N0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c0112y = null;
            }
            if (c0030a0.j(c0112y)) {
                requestLayout();
            }
            c0030a0.a(false);
            if (this.f728N) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f728N = false;
            }
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        kotlin.jvm.internal.m.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getAccessibilityManager()LC0/f; */
    public C0077g getAccessibilityManager() {
        return this.f716H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getClipboard()LC0/p0; */
    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C0079h m2getClipboard() {
        return this.f741V;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getClipboardManager()LC0/q0; */
    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C0081i m3getClipboardManager() {
        return this.f740U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getDragAndDropManager()Lf0/c; */
    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC1059a m4getDragAndDropManager() {
        return this.f771w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getLayoutNodes()Lr/k; */
    public C1570v getLayoutNodes() {
        return this.f705B;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i7) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i7;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC1364c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC1364c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
