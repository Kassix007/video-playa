package J1;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.C0662z;
import androidx.lifecycle.EnumC0653p;
import androidx.lifecycle.InterfaceC0648k;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import h.AbstractActivityC1106h;
import i2.C1135a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: J1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0185q implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0660x, l0, InterfaceC0648k, g2.e {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Object f2682j0 = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f2683A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f2684B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f2685C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f2686D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2687E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2688F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f2689G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public H f2690H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public C0188u f2691I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AbstractComponentCallbacksC0185q f2693K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f2694L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f2695M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f2696N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f2697O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f2698P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f2699Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f2701S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ViewGroup f2702T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public View f2703U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f2704V;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0184p f2706X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f2707Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f2708Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f2709a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public C0662z f2711c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public P f2712d0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public a0 f2714f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Z.m f2715g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final ArrayList f2716h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final C0182n f2717i0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bundle f2719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SparseArray f2720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Bundle f2721t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Bundle f2723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AbstractComponentCallbacksC0185q f2724w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2726y;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2718q = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f2722u = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f2725x = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f2727z = null;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public H f2692J = new H();

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f2700R = true;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f2705W = true;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public EnumC0653p f2710b0 = EnumC0653p.f9560u;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final androidx.lifecycle.J f2713e0 = new androidx.lifecycle.J();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractComponentCallbacksC0185q() {
        new AtomicInteger();
        this.f2716h0 = new ArrayList();
        this.f2717i0 = new C0182n(this);
        l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void A(Bundle bundle) {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void B(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f2692J.L();
        this.f2688F = true;
        this.f2712d0 = new P(this, f());
        View viewT = t(layoutInflater, viewGroup);
        this.f2703U = viewT;
        if (viewT == null) {
            if (this.f2712d0.f2591t != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2712d0 = null;
        } else {
            this.f2712d0.g();
            X.h(this.f2703U, this.f2712d0);
            X.i(this.f2703U, this.f2712d0);
            AbstractC0836n2.M(this.f2703U, this.f2712d0);
            this.f2713e0.k(this.f2712d0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context C() {
        Context contextI = i();
        if (contextI != null) {
            return contextI;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View D() {
        View view = this.f2703U;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(int i, int i7, int i8, int i9) {
        if (this.f2706X == null && i == 0 && i7 == 0 && i8 == 0 && i9 == 0) {
            return;
        }
        g().f2675b = i;
        g().f2676c = i7;
        g().f2677d = i8;
        g().f2678e = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(Bundle bundle) {
        H h4 = this.f2690H;
        if (h4 != null && (h4.f2516E || h4.f2517F)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2723v = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g2.e
    public final Z.m b() {
        return (Z.m) this.f2715g0.f8313s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3.a c() {
        return new C0183o(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final h0 d() {
        Application application;
        if (this.f2690H == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f2714f0 == null) {
            Context applicationContext = C().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && H.F(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f2714f0 = new a0(application, this, this.f2723v);
        }
        return this.f2714f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0648k
    public final P1.e e() {
        Application application;
        Context applicationContext = C().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && H.F(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + C().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        P1.e eVar = new P1.e(0);
        LinkedHashMap linkedHashMap = eVar.f5610a;
        if (application != null) {
            linkedHashMap.put(g0.f9546d, application);
        }
        linkedHashMap.put(X.f9512a, this);
        linkedHashMap.put(X.f9513b, this);
        Bundle bundle = this.f2723v;
        if (bundle != null) {
            linkedHashMap.put(X.f9514c, bundle);
        }
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.l0
    public final k0 f() {
        if (this.f2690H == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (j() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.f2690H.f2523L.f2560d;
        k0 k0Var = (k0) map.get(this.f2722u);
        if (k0Var != null) {
            return k0Var;
        }
        k0 k0Var2 = new k0();
        map.put(this.f2722u, k0Var2);
        return k0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0184p g() {
        if (this.f2706X == null) {
            C0184p c0184p = new C0184p();
            Object obj = f2682j0;
            c0184p.f2679g = obj;
            c0184p.f2680h = obj;
            c0184p.i = obj;
            c0184p.j = 1.0f;
            c0184p.f2681k = null;
            this.f2706X = c0184p;
        }
        return this.f2706X;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0660x
    public final AbstractC0654q getLifecycle() {
        return this.f2711c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final H h() {
        if (this.f2691I != null) {
            return this.f2692J;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context i() {
        C0188u c0188u = this.f2691I;
        if (c0188u == null) {
            return null;
        }
        return c0188u.f2735u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j() {
        EnumC0653p enumC0653p = this.f2710b0;
        return (enumC0653p == EnumC0653p.f9557r || this.f2693K == null) ? enumC0653p.ordinal() : Math.min(enumC0653p.ordinal(), this.f2693K.j());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final H k() {
        H h4 = this.f2690H;
        if (h4 != null) {
            return h4;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l() {
        this.f2711c0 = new C0662z(this);
        this.f2715g0 = new Z.m(new C1135a(this, new I2.d(16, this)), 13);
        this.f2714f0 = null;
        ArrayList arrayList = this.f2716h0;
        C0182n c0182n = this.f2717i0;
        if (arrayList.contains(c0182n)) {
            return;
        }
        if (this.f2718q < 0) {
            arrayList.add(c0182n);
            return;
        }
        AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = c0182n.f2672a;
        ((C1135a) abstractComponentCallbacksC0185q.f2715g0.f8312r).a();
        X.c(abstractComponentCallbacksC0185q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        l();
        this.f2709a0 = this.f2722u;
        this.f2722u = UUID.randomUUID().toString();
        this.f2683A = false;
        this.f2684B = false;
        this.f2685C = false;
        this.f2686D = false;
        this.f2687E = false;
        this.f2689G = 0;
        this.f2690H = null;
        this.f2692J = new H();
        this.f2691I = null;
        this.f2694L = 0;
        this.f2695M = 0;
        this.f2696N = null;
        this.f2697O = false;
        this.f2698P = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean n() {
        if (this.f2697O) {
            return true;
        }
        H h4 = this.f2690H;
        if (h4 != null) {
            AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q = this.f2693K;
            h4.getClass();
            if (abstractComponentCallbacksC0185q == null ? false : abstractComponentCallbacksC0185q.n()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o() {
        return this.f2689G > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0188u c0188u = this.f2691I;
        AbstractActivityC1106h abstractActivityC1106h = c0188u == null ? null : c0188u.f2734t;
        if (abstractActivityC1106h != null) {
            abstractActivityC1106h.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void p() {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void q(int i, int i7, Intent intent) {
        if (H.F(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i7 + " data: " + intent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(Context context) {
        this.f2701S = true;
        C0188u c0188u = this.f2691I;
        if ((c0188u == null ? null : c0188u.f2734t) != null) {
            this.f2701S = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void s(Bundle bundle) {
        Parcelable parcelable;
        this.f2701S = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f2692J.R(parcelable);
            H h4 = this.f2692J;
            h4.f2516E = false;
            h4.f2517F = false;
            h4.f2523L.f2562g = false;
            h4.t(1);
        }
        H h7 = this.f2692J;
        if (h7.f2540s >= 1) {
            return;
        }
        h7.f2516E = false;
        h7.f2517F = false;
        h7.f2523L.f2562g = false;
        h7.t(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public View t(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2722u);
        if (this.f2694L != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2694L));
        }
        if (this.f2696N != null) {
            sb.append(" tag=");
            sb.append(this.f2696N);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void u() {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void v() {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutInflater w(Bundle bundle) {
        C0188u c0188u = this.f2691I;
        if (c0188u == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1106h abstractActivityC1106h = c0188u.f2738x;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC1106h.getLayoutInflater().cloneInContext(abstractActivityC1106h);
        layoutInflaterCloneInContext.setFactory2(this.f2692J.f);
        return layoutInflaterCloneInContext;
    }

    public abstract void x(Bundle bundle);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void y() {
        this.f2701S = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void z() {
        this.f2701S = true;
    }
}
