package J1;

import B0.C0050o;
import E.c0;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.X;
import androidx.lifecycle.k0;
import com.mikepenz.iconics.animation.IconicsAnimationProcessor;
import com.wnapp.smspariaz.R;
import h.AbstractActivityC1106h;
import i2.C1135a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import w1.AbstractC1835K;
import w1.AbstractC1862z;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0050o f2576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f2577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractComponentCallbacksC0185q f2578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2579d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2580e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N(C0050o c0050o, c0 c0Var, AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        this.f2576a = c0050o;
        this.f2577b = c0Var;
        this.f2578c = abstractComponentCallbacksC0185q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0185q);
        }
        Bundle bundle = abstractComponentCallbacksC0185q.f2719r;
        abstractComponentCallbacksC0185q.f2692J.L();
        abstractComponentCallbacksC0185q.f2718q = 3;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.p();
        if (!abstractComponentCallbacksC0185q.f2701S) {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onActivityCreated()");
        }
        if (H.F(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0185q);
        }
        View view = abstractComponentCallbacksC0185q.f2703U;
        if (view != null) {
            Bundle bundle2 = abstractComponentCallbacksC0185q.f2719r;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0185q.f2720s;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0185q.f2720s = null;
            }
            if (abstractComponentCallbacksC0185q.f2703U != null) {
                abstractComponentCallbacksC0185q.f2712d0.f2592u.z(abstractComponentCallbacksC0185q.f2721t);
                abstractComponentCallbacksC0185q.f2721t = null;
            }
            abstractComponentCallbacksC0185q.f2701S = false;
            abstractComponentCallbacksC0185q.A(bundle2);
            if (!abstractComponentCallbacksC0185q.f2701S) {
                throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onViewStateRestored()");
            }
            if (abstractComponentCallbacksC0185q.f2703U != null) {
                abstractComponentCallbacksC0185q.f2712d0.c(EnumC0652o.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0185q.f2719r = null;
        H h4 = abstractComponentCallbacksC0185q.f2692J;
        h4.f2516E = false;
        h4.f2517F = false;
        h4.f2523L.f2562g = false;
        h4.t(4);
        this.f2576a.o(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.f2577b.f1552q;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        ViewGroup viewGroup = abstractComponentCallbacksC0185q.f2702T;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0185q);
            int i = iIndexOf - 1;
            while (true) {
                if (i < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = (AbstractComponentCallbacksC0185q) arrayList.get(iIndexOf);
                        if (abstractComponentCallbacksC0185q2.f2702T == viewGroup && (view = abstractComponentCallbacksC0185q2.f2703U) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = (AbstractComponentCallbacksC0185q) arrayList.get(i);
                    if (abstractComponentCallbacksC0185q3.f2702T == viewGroup && (view2 = abstractComponentCallbacksC0185q3.f2703U) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i--;
                }
            }
        }
        abstractComponentCallbacksC0185q.f2702T.addView(abstractComponentCallbacksC0185q.f2703U, iIndexOfChild);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0185q);
        }
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = abstractComponentCallbacksC0185q.f2724w;
        N n7 = null;
        c0 c0Var = this.f2577b;
        if (abstractComponentCallbacksC0185q2 != null) {
            N n8 = (N) ((HashMap) c0Var.f1553r).get(abstractComponentCallbacksC0185q2.f2722u);
            if (n8 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0185q + " declared target fragment " + abstractComponentCallbacksC0185q.f2724w + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC0185q.f2725x = abstractComponentCallbacksC0185q.f2724w.f2722u;
            abstractComponentCallbacksC0185q.f2724w = null;
            n7 = n8;
        } else {
            String str = abstractComponentCallbacksC0185q.f2725x;
            if (str != null && (n7 = (N) ((HashMap) c0Var.f1553r).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0185q);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(k1.i.k(sb, abstractComponentCallbacksC0185q.f2725x, " that does not belong to this FragmentManager!"));
            }
        }
        if (n7 != null) {
            n7.k();
        }
        H h4 = abstractComponentCallbacksC0185q.f2690H;
        abstractComponentCallbacksC0185q.f2691I = h4.f2541t;
        abstractComponentCallbacksC0185q.f2693K = h4.f2543v;
        C0050o c0050o = this.f2576a;
        c0050o.v(false);
        ArrayList arrayList = abstractComponentCallbacksC0185q.f2716h0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q3 = ((C0182n) obj).f2672a;
            ((C1135a) abstractComponentCallbacksC0185q3.f2715g0.f8312r).a();
            X.c(abstractComponentCallbacksC0185q3);
        }
        arrayList.clear();
        abstractComponentCallbacksC0185q.f2692J.b(abstractComponentCallbacksC0185q.f2691I, abstractComponentCallbacksC0185q.c(), abstractComponentCallbacksC0185q);
        abstractComponentCallbacksC0185q.f2718q = 0;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.r(abstractComponentCallbacksC0185q.f2691I.f2735u);
        if (!abstractComponentCallbacksC0185q.f2701S) {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onAttach()");
        }
        Iterator it = abstractComponentCallbacksC0185q.f2690H.f2534m.iterator();
        while (it.hasNext()) {
            ((L) it.next()).c();
        }
        H h7 = abstractComponentCallbacksC0185q.f2692J;
        h7.f2516E = false;
        h7.f2517F = false;
        h7.f2523L.f2562g = false;
        h7.t(0);
        c0050o.q(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d() {
        T t6;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (abstractComponentCallbacksC0185q.f2690H == null) {
            return abstractComponentCallbacksC0185q.f2718q;
        }
        int iMin = this.f2580e;
        int iOrdinal = abstractComponentCallbacksC0185q.f2710b0.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0185q.f2685C) {
            if (abstractComponentCallbacksC0185q.f2686D) {
                iMin = Math.max(this.f2580e, 2);
                View view = abstractComponentCallbacksC0185q.f2703U;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2580e < 4 ? Math.min(iMin, abstractComponentCallbacksC0185q.f2718q) : Math.min(iMin, 1);
            }
        }
        if (!abstractComponentCallbacksC0185q.f2683A) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0185q.f2702T;
        if (viewGroup != null) {
            C0176h c0176hF = C0176h.f(viewGroup, abstractComponentCallbacksC0185q.k().D());
            c0176hF.getClass();
            T tD = c0176hF.d(abstractComponentCallbacksC0185q);
            int i7 = tD != null ? tD.f2599b : 0;
            ArrayList arrayList = c0176hF.f2650c;
            int size = arrayList.size();
            while (true) {
                if (i >= size) {
                    t6 = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                t6 = (T) obj;
                if (t6.f2600c.equals(abstractComponentCallbacksC0185q) && !t6.f) {
                    break;
                }
            }
            i = (t6 == null || !(i7 == 0 || i7 == 1)) ? i7 : t6.f2599b;
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0185q.f2684B) {
            iMin = abstractComponentCallbacksC0185q.o() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0185q.f2704V && abstractComponentCallbacksC0185q.f2718q < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (H.F(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0185q);
        }
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e() {
        Parcelable parcelable;
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0185q);
        }
        if (abstractComponentCallbacksC0185q.f2708Z) {
            Bundle bundle = abstractComponentCallbacksC0185q.f2719r;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                abstractComponentCallbacksC0185q.f2692J.R(parcelable);
                H h4 = abstractComponentCallbacksC0185q.f2692J;
                h4.f2516E = false;
                h4.f2517F = false;
                h4.f2523L.f2562g = false;
                h4.t(1);
            }
            abstractComponentCallbacksC0185q.f2718q = 1;
            return;
        }
        C0050o c0050o = this.f2576a;
        c0050o.w(false);
        Bundle bundle2 = abstractComponentCallbacksC0185q.f2719r;
        abstractComponentCallbacksC0185q.f2692J.L();
        abstractComponentCallbacksC0185q.f2718q = 1;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.f2711c0.a(new g2.b(abstractComponentCallbacksC0185q, 1));
        abstractComponentCallbacksC0185q.f2715g0.z(bundle2);
        abstractComponentCallbacksC0185q.s(bundle2);
        abstractComponentCallbacksC0185q.f2708Z = true;
        if (abstractComponentCallbacksC0185q.f2701S) {
            abstractComponentCallbacksC0185q.f2711c0.f(EnumC0652o.ON_CREATE);
            c0050o.r(false);
        } else {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onCreate()");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        String resourceName;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (abstractComponentCallbacksC0185q.f2685C) {
            return;
        }
        int i = 3;
        if (H.F(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0185q);
        }
        LayoutInflater layoutInflaterW = abstractComponentCallbacksC0185q.w(abstractComponentCallbacksC0185q.f2719r);
        ViewGroup viewGroup = abstractComponentCallbacksC0185q.f2702T;
        if (viewGroup == null) {
            int i7 = abstractComponentCallbacksC0185q.f2695M;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0185q + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0185q.f2690H.f2542u.J(i7);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0185q.f2687E) {
                        try {
                            resourceName = abstractComponentCallbacksC0185q.C().getResources().getResourceName(abstractComponentCallbacksC0185q.f2695M);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0185q.f2695M) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0185q);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    K1.c cVar = K1.d.f2857a;
                    K1.d.b(new K1.a(abstractComponentCallbacksC0185q, "Attempting to add fragment " + abstractComponentCallbacksC0185q + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    K1.d.a(abstractComponentCallbacksC0185q).getClass();
                }
            }
        }
        abstractComponentCallbacksC0185q.f2702T = viewGroup;
        abstractComponentCallbacksC0185q.B(layoutInflaterW, viewGroup, abstractComponentCallbacksC0185q.f2719r);
        View view = abstractComponentCallbacksC0185q.f2703U;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0185q.f2703U.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0185q);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC0185q.f2697O) {
                abstractComponentCallbacksC0185q.f2703U.setVisibility(8);
            }
            View view2 = abstractComponentCallbacksC0185q.f2703U;
            WeakHashMap weakHashMap = AbstractC1835K.f18149a;
            if (view2.isAttachedToWindow()) {
                AbstractC1862z.c(abstractComponentCallbacksC0185q.f2703U);
            } else {
                View view3 = abstractComponentCallbacksC0185q.f2703U;
                view3.addOnAttachStateChangeListener(new C0.D(i, view3));
            }
            abstractComponentCallbacksC0185q.f2692J.t(2);
            this.f2576a.B(false);
            int visibility = abstractComponentCallbacksC0185q.f2703U.getVisibility();
            abstractComponentCallbacksC0185q.g().j = abstractComponentCallbacksC0185q.f2703U.getAlpha();
            if (abstractComponentCallbacksC0185q.f2702T != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0185q.f2703U.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0185q.g().f2681k = viewFindFocus;
                    if (H.F(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0185q);
                    }
                }
                abstractComponentCallbacksC0185q.f2703U.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0185q.f2718q = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qF;
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0185q);
        }
        boolean zIsChangingConfigurations = true;
        int i = 0;
        boolean z5 = abstractComponentCallbacksC0185q.f2684B && !abstractComponentCallbacksC0185q.o();
        c0 c0Var = this.f2577b;
        if (z5) {
        }
        if (!z5) {
            K k7 = (K) c0Var.f1555t;
            if (!((k7.f2558b.containsKey(abstractComponentCallbacksC0185q.f2722u) && k7.f2561e) ? k7.f : true)) {
                String str = abstractComponentCallbacksC0185q.f2725x;
                if (str != null && (abstractComponentCallbacksC0185qF = c0Var.f(str)) != null && abstractComponentCallbacksC0185qF.f2699Q) {
                    abstractComponentCallbacksC0185q.f2724w = abstractComponentCallbacksC0185qF;
                }
                abstractComponentCallbacksC0185q.f2718q = 0;
                return;
            }
        }
        C0188u c0188u = abstractComponentCallbacksC0185q.f2691I;
        if (c0188u != null) {
            zIsChangingConfigurations = ((K) c0Var.f1555t).f;
        } else {
            AbstractActivityC1106h abstractActivityC1106h = c0188u.f2735u;
            if (abstractActivityC1106h != null) {
                zIsChangingConfigurations = true ^ abstractActivityC1106h.isChangingConfigurations();
            }
        }
        if (z5 || zIsChangingConfigurations) {
            ((K) c0Var.f1555t).c(abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.f2692J.k();
        abstractComponentCallbacksC0185q.f2711c0.f(EnumC0652o.ON_DESTROY);
        abstractComponentCallbacksC0185q.f2718q = 0;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.f2708Z = false;
        abstractComponentCallbacksC0185q.f2701S = true;
        if (!abstractComponentCallbacksC0185q.f2701S) {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onDestroy()");
        }
        this.f2576a.s(false);
        ArrayList arrayListO = c0Var.o();
        int size = arrayListO.size();
        while (i < size) {
            Object obj = arrayListO.get(i);
            i++;
            N n7 = (N) obj;
            if (n7 != null) {
                AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = n7.f2578c;
                if (abstractComponentCallbacksC0185q.f2722u.equals(abstractComponentCallbacksC0185q2.f2725x)) {
                    abstractComponentCallbacksC0185q2.f2724w = abstractComponentCallbacksC0185q;
                    abstractComponentCallbacksC0185q2.f2725x = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0185q.f2725x;
        if (str2 != null) {
            abstractComponentCallbacksC0185q.f2724w = c0Var.f(str2);
        }
        c0Var.x(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        View view;
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0185q);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0185q.f2702T;
        if (viewGroup != null && (view = abstractComponentCallbacksC0185q.f2703U) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0185q.f2692J.t(1);
        if (abstractComponentCallbacksC0185q.f2703U != null) {
            P p7 = abstractComponentCallbacksC0185q.f2712d0;
            p7.g();
            if (p7.f2591t.f9572d.compareTo(EnumC0653p.f9558s) >= 0) {
                abstractComponentCallbacksC0185q.f2712d0.c(EnumC0652o.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0185q.f2718q = 1;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.u();
        if (!abstractComponentCallbacksC0185q.f2701S) {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onDestroyView()");
        }
        k0 store = abstractComponentCallbacksC0185q.f();
        kotlin.jvm.internal.m.e(store, "store");
        P1.a defaultCreationExtras = P1.a.f5609b;
        kotlin.jvm.internal.m.e(defaultCreationExtras, "defaultCreationExtras");
        c0 c0Var = new c0(store, S1.a.f7304c, defaultCreationExtras);
        kotlin.jvm.internal.f fVarA = kotlin.jvm.internal.z.a(S1.a.class);
        String strB = fVarA.b();
        if (strB == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        r.S s6 = ((S1.a) c0Var.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB), fVarA)).f7305b;
        if (s6.f() > 0) {
            s6.g(0).getClass();
            throw new ClassCastException();
        }
        abstractComponentCallbacksC0185q.f2688F = false;
        this.f2576a.C(false);
        abstractComponentCallbacksC0185q.f2702T = null;
        abstractComponentCallbacksC0185q.f2703U = null;
        abstractComponentCallbacksC0185q.f2712d0 = null;
        abstractComponentCallbacksC0185q.f2713e0.k(null);
        abstractComponentCallbacksC0185q.f2686D = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.f2718q = -1;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.v();
        if (!abstractComponentCallbacksC0185q.f2701S) {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onDetach()");
        }
        H h4 = abstractComponentCallbacksC0185q.f2692J;
        if (!h4.f2518G) {
            h4.k();
            abstractComponentCallbacksC0185q.f2692J = new H();
        }
        this.f2576a.t(false);
        abstractComponentCallbacksC0185q.f2718q = -1;
        abstractComponentCallbacksC0185q.f2691I = null;
        abstractComponentCallbacksC0185q.f2693K = null;
        abstractComponentCallbacksC0185q.f2690H = null;
        if (!abstractComponentCallbacksC0185q.f2684B || abstractComponentCallbacksC0185q.o()) {
            K k7 = (K) this.f2577b.f1555t;
            if (!((k7.f2558b.containsKey(abstractComponentCallbacksC0185q.f2722u) && k7.f2561e) ? k7.f : true)) {
                return;
            }
        }
        if (H.F(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (abstractComponentCallbacksC0185q.f2685C && abstractComponentCallbacksC0185q.f2686D && !abstractComponentCallbacksC0185q.f2688F) {
            if (H.F(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0185q);
            }
            abstractComponentCallbacksC0185q.B(abstractComponentCallbacksC0185q.w(abstractComponentCallbacksC0185q.f2719r), null, abstractComponentCallbacksC0185q.f2719r);
            View view = abstractComponentCallbacksC0185q.f2703U;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0185q.f2703U.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC0185q);
                if (abstractComponentCallbacksC0185q.f2697O) {
                    abstractComponentCallbacksC0185q.f2703U.setVisibility(8);
                }
                abstractComponentCallbacksC0185q.f2692J.t(2);
                this.f2576a.B(false);
                abstractComponentCallbacksC0185q.f2718q = 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        c0 c0Var = this.f2577b;
        boolean z5 = this.f2579d;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (z5) {
            if (H.F(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0185q);
                return;
            }
            return;
        }
        try {
            this.f2579d = true;
            boolean z6 = false;
            while (true) {
                int iD = d();
                int i = abstractComponentCallbacksC0185q.f2718q;
                if (iD == i) {
                    if (!z6 && i == -1 && abstractComponentCallbacksC0185q.f2684B && !abstractComponentCallbacksC0185q.o()) {
                        if (H.F(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0185q);
                        }
                        ((K) c0Var.f1555t).c(abstractComponentCallbacksC0185q);
                        c0Var.x(this);
                        if (H.F(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0185q);
                        }
                        abstractComponentCallbacksC0185q.m();
                    }
                    if (abstractComponentCallbacksC0185q.f2707Y) {
                        if (abstractComponentCallbacksC0185q.f2703U != null && (viewGroup = abstractComponentCallbacksC0185q.f2702T) != null) {
                            C0176h c0176hF = C0176h.f(viewGroup, abstractComponentCallbacksC0185q.k().D());
                            if (abstractComponentCallbacksC0185q.f2697O) {
                                c0176hF.getClass();
                                if (H.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0185q);
                                }
                                c0176hF.a(3, 1, this);
                            } else {
                                c0176hF.getClass();
                                if (H.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0185q);
                                }
                                c0176hF.a(2, 1, this);
                            }
                        }
                        H h4 = abstractComponentCallbacksC0185q.f2690H;
                        if (h4 != null && abstractComponentCallbacksC0185q.f2683A && H.G(abstractComponentCallbacksC0185q)) {
                            h4.f2515D = true;
                        }
                        abstractComponentCallbacksC0185q.f2707Y = false;
                        abstractComponentCallbacksC0185q.f2692J.n();
                    }
                    this.f2579d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case IconicsAnimationProcessor.INFINITE /* -1 */:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC0185q.f2718q = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0185q.f2686D = false;
                            abstractComponentCallbacksC0185q.f2718q = 2;
                            break;
                        case 3:
                            if (H.F(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0185q);
                            }
                            if (abstractComponentCallbacksC0185q.f2703U != null && abstractComponentCallbacksC0185q.f2720s == null) {
                                o();
                            }
                            if (abstractComponentCallbacksC0185q.f2703U != null && (viewGroup2 = abstractComponentCallbacksC0185q.f2702T) != null) {
                                C0176h c0176hF2 = C0176h.f(viewGroup2, abstractComponentCallbacksC0185q.k().D());
                                c0176hF2.getClass();
                                if (H.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0185q);
                                }
                                c0176hF2.a(1, 3, this);
                            }
                            abstractComponentCallbacksC0185q.f2718q = 3;
                            break;
                        case 4:
                            q();
                            break;
                        case 5:
                            abstractComponentCallbacksC0185q.f2718q = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0185q.f2703U != null && (viewGroup3 = abstractComponentCallbacksC0185q.f2702T) != null) {
                                C0176h c0176hF3 = C0176h.f(viewGroup3, abstractComponentCallbacksC0185q.k().D());
                                int iB = C0.S.b(abstractComponentCallbacksC0185q.f2703U.getVisibility());
                                c0176hF3.getClass();
                                if (H.F(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0185q);
                                }
                                c0176hF3.a(iB, 2, this);
                            }
                            abstractComponentCallbacksC0185q.f2718q = 4;
                            break;
                        case 5:
                            p();
                            break;
                        case 6:
                            abstractComponentCallbacksC0185q.f2718q = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z6 = true;
            }
        } catch (Throwable th) {
            this.f2579d = false;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.f2692J.t(5);
        if (abstractComponentCallbacksC0185q.f2703U != null) {
            abstractComponentCallbacksC0185q.f2712d0.c(EnumC0652o.ON_PAUSE);
        }
        abstractComponentCallbacksC0185q.f2711c0.f(EnumC0652o.ON_PAUSE);
        abstractComponentCallbacksC0185q.f2718q = 6;
        abstractComponentCallbacksC0185q.f2701S = true;
        this.f2576a.u(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        Bundle bundle = abstractComponentCallbacksC0185q.f2719r;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        abstractComponentCallbacksC0185q.f2720s = abstractComponentCallbacksC0185q.f2719r.getSparseParcelableArray("android:view_state");
        abstractComponentCallbacksC0185q.f2721t = abstractComponentCallbacksC0185q.f2719r.getBundle("android:view_registry_state");
        String string = abstractComponentCallbacksC0185q.f2719r.getString("android:target_state");
        abstractComponentCallbacksC0185q.f2725x = string;
        if (string != null) {
            abstractComponentCallbacksC0185q.f2726y = abstractComponentCallbacksC0185q.f2719r.getInt("android:target_req_state", 0);
        }
        boolean z5 = abstractComponentCallbacksC0185q.f2719r.getBoolean("android:user_visible_hint", true);
        abstractComponentCallbacksC0185q.f2705W = z5;
        if (z5) {
            return;
        }
        abstractComponentCallbacksC0185q.f2704V = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r7 = this;
            r0 = 3
            boolean r0 = J1.H.F(r0)
            java.lang.String r1 = "FragmentManager"
            J1.q r2 = r7.f2578c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            J1.p r0 = r2.f2706X
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f2681k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.f2703U
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.f2703U
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = J1.H.F(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.f2703U
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            J1.p r0 = r2.g()
            r0.f2681k = r3
            J1.H r0 = r2.f2692J
            r0.L()
            J1.H r0 = r2.f2692J
            r1 = 1
            r0.y(r1)
            r0 = 7
            r2.f2718q = r0
            r1 = 0
            r2.f2701S = r1
            r4 = 1
            r2.f2701S = r4
            boolean r4 = r2.f2701S
            if (r4 == 0) goto Lc6
            androidx.lifecycle.z r4 = r2.f2711c0
            androidx.lifecycle.o r5 = androidx.lifecycle.EnumC0652o.ON_RESUME
            r4.f(r5)
            android.view.View r4 = r2.f2703U
            if (r4 == 0) goto Lad
            J1.P r4 = r2.f2712d0
            androidx.lifecycle.z r4 = r4.f2591t
            r4.f(r5)
        Lad:
            J1.H r4 = r2.f2692J
            r4.f2516E = r1
            r4.f2517F = r1
            J1.K r5 = r4.f2523L
            r5.f2562g = r1
            r4.t(r0)
            B0.o r0 = r7.f2576a
            r0.x(r1)
            r2.f2719r = r3
            r2.f2720s = r3
            r2.f2721t = r3
            return
        Lc6:
            J1.U r0 = new J1.U
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = " did not call through to super.onResume()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.N.n():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o() {
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (abstractComponentCallbacksC0185q.f2703U == null) {
            return;
        }
        if (H.F(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0185q + " with view " + abstractComponentCallbacksC0185q.f2703U);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0185q.f2703U.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0185q.f2720s = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0185q.f2712d0.f2592u.A(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0185q.f2721t = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0185q);
        }
        abstractComponentCallbacksC0185q.f2692J.L();
        abstractComponentCallbacksC0185q.f2692J.y(true);
        abstractComponentCallbacksC0185q.f2718q = 5;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.y();
        if (!abstractComponentCallbacksC0185q.f2701S) {
            throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onStart()");
        }
        C0662z c0662z = abstractComponentCallbacksC0185q.f2711c0;
        EnumC0652o enumC0652o = EnumC0652o.ON_START;
        c0662z.f(enumC0652o);
        if (abstractComponentCallbacksC0185q.f2703U != null) {
            abstractComponentCallbacksC0185q.f2712d0.f2591t.f(enumC0652o);
        }
        H h4 = abstractComponentCallbacksC0185q.f2692J;
        h4.f2516E = false;
        h4.f2517F = false;
        h4.f2523L.f2562g = false;
        h4.t(5);
        this.f2576a.z(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        boolean zF = H.F(3);
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2578c;
        if (zF) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0185q);
        }
        H h4 = abstractComponentCallbacksC0185q.f2692J;
        h4.f2517F = true;
        h4.f2523L.f2562g = true;
        h4.t(4);
        if (abstractComponentCallbacksC0185q.f2703U != null) {
            abstractComponentCallbacksC0185q.f2712d0.c(EnumC0652o.ON_STOP);
        }
        abstractComponentCallbacksC0185q.f2711c0.f(EnumC0652o.ON_STOP);
        abstractComponentCallbacksC0185q.f2718q = 4;
        abstractComponentCallbacksC0185q.f2701S = false;
        abstractComponentCallbacksC0185q.z();
        if (abstractComponentCallbacksC0185q.f2701S) {
            this.f2576a.A(false);
            return;
        }
        throw new U("Fragment " + abstractComponentCallbacksC0185q + " did not call through to super.onStop()");
    }

    public N(C0050o c0050o, c0 c0Var, ClassLoader classLoader, B b7, M m4) {
        this.f2576a = c0050o;
        this.f2577b = c0Var;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185qA = b7.a(m4.f2566q);
        Bundle bundle = m4.f2575z;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0185qA.F(bundle);
        abstractComponentCallbacksC0185qA.f2722u = m4.f2567r;
        abstractComponentCallbacksC0185qA.f2685C = m4.f2568s;
        abstractComponentCallbacksC0185qA.f2687E = true;
        abstractComponentCallbacksC0185qA.f2694L = m4.f2569t;
        abstractComponentCallbacksC0185qA.f2695M = m4.f2570u;
        abstractComponentCallbacksC0185qA.f2696N = m4.f2571v;
        abstractComponentCallbacksC0185qA.f2699Q = m4.f2572w;
        abstractComponentCallbacksC0185qA.f2684B = m4.f2573x;
        abstractComponentCallbacksC0185qA.f2698P = m4.f2574y;
        abstractComponentCallbacksC0185qA.f2697O = m4.f2563A;
        abstractComponentCallbacksC0185qA.f2710b0 = EnumC0653p.values()[m4.f2564B];
        Bundle bundle2 = m4.f2565C;
        if (bundle2 != null) {
            abstractComponentCallbacksC0185qA.f2719r = bundle2;
        } else {
            abstractComponentCallbacksC0185qA.f2719r = new Bundle();
        }
        this.f2578c = abstractComponentCallbacksC0185qA;
        if (H.F(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0185qA);
        }
    }

    public N(C0050o c0050o, c0 c0Var, AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, M m4) {
        this.f2576a = c0050o;
        this.f2577b = c0Var;
        this.f2578c = abstractComponentCallbacksC0185q;
        abstractComponentCallbacksC0185q.f2720s = null;
        abstractComponentCallbacksC0185q.f2721t = null;
        abstractComponentCallbacksC0185q.f2689G = 0;
        abstractComponentCallbacksC0185q.f2686D = false;
        abstractComponentCallbacksC0185q.f2683A = false;
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q2 = abstractComponentCallbacksC0185q.f2724w;
        abstractComponentCallbacksC0185q.f2725x = abstractComponentCallbacksC0185q2 != null ? abstractComponentCallbacksC0185q2.f2722u : null;
        abstractComponentCallbacksC0185q.f2724w = null;
        Bundle bundle = m4.f2565C;
        if (bundle != null) {
            abstractComponentCallbacksC0185q.f2719r = bundle;
        } else {
            abstractComponentCallbacksC0185q.f2719r = new Bundle();
        }
    }
}
