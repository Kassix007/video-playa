package androidx.lifecycle;

import M5.AbstractC0263y;
import M5.q0;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.internal.measurement.P1;
import com.web2native.MainActivity;
import com.wnapp.smspariaz.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m5.C1371j;
import o5.C1423e;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O3.D f9512a = new O3.D(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O3.B f9513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final O3.D f9514c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 13;
        f9513b = new O3.B(i);
        f9514c = new O3.D(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(f0 f0Var, Z.m registry, AbstractC0654q lifecycle) {
        AutoCloseable autoCloseable;
        kotlin.jvm.internal.m.e(registry, "registry");
        kotlin.jvm.internal.m.e(lifecycle, "lifecycle");
        R1.c cVar = f0Var.f9543a;
        if (cVar != null) {
            synchronized (cVar.f6696a) {
                autoCloseable = (AutoCloseable) cVar.f6697b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        V v6 = (V) autoCloseable;
        if (v6 == null || v6.f9511s) {
            return;
        }
        v6.z(registry, lifecycle);
        EnumC0653p enumC0653pB = lifecycle.b();
        if (enumC0653pB == EnumC0653p.f9557r || enumC0653pB.compareTo(EnumC0653p.f9559t) >= 0) {
            registry.F();
        } else {
            lifecycle.a(new C0645h(registry, lifecycle));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final U b(P1.c cVar) {
        U u6;
        kotlin.jvm.internal.m.e(cVar, "<this>");
        g2.e eVar = (g2.e) cVar.a(f9512a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        l0 l0Var = (l0) cVar.a(f9513b);
        if (l0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f9514c);
        String str = (String) cVar.a(j0.f9552b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        g2.d dVarL = eVar.b().l();
        Bundle bundle2 = null;
        Y y6 = dVarL instanceof Y ? (Y) dVarL : null;
        if (y6 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = g(l0Var).f9519b;
        U u7 = (U) linkedHashMap.get(str);
        if (u7 != null) {
            return u7;
        }
        y6.b();
        Bundle bundle3 = y6.f9517c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = P1.g((C1371j[]) Arrays.copyOf(new C1371j[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                y6.f9517c = null;
            }
            bundle2 = bundle4;
        }
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            u6 = new U();
        } else {
            ClassLoader classLoader = U.class.getClassLoader();
            kotlin.jvm.internal.m.b(classLoader);
            bundle.setClassLoader(classLoader);
            C1423e c1423e = new C1423e(bundle.size());
            for (String str2 : bundle.keySet()) {
                kotlin.jvm.internal.m.b(str2);
                c1423e.put(str2, bundle.get(str2));
            }
            u6 = new U(c1423e.b());
        }
        linkedHashMap.put(str, u6);
        return u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(g2.e eVar) {
        EnumC0653p enumC0653pB = eVar.getLifecycle().b();
        if (enumC0653pB != EnumC0653p.f9557r && enumC0653pB != EnumC0653p.f9558s) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eVar.b().l() == null) {
            Y y6 = new Y(eVar.b(), (l0) eVar);
            eVar.b().C("androidx.lifecycle.internal.SavedStateHandlesProvider", y6);
            eVar.getLifecycle().a(new C0642e(1, y6));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final InterfaceC0660x d(View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0660x interfaceC0660x = tag instanceof InterfaceC0660x ? (InterfaceC0660x) tag : null;
            if (interfaceC0660x != null) {
                return interfaceC0660x;
            }
            Object objQ = l6.d.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final l0 e(View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            l0 l0Var = tag instanceof l0 ? (l0) tag : null;
            if (l0Var != null) {
                return l0Var;
            }
            Object objQ = l6.d.q(view);
            view = objQ instanceof View ? (View) objQ : null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C0655s f(MainActivity mainActivity) {
        C0662z c0662z = mainActivity.f14061q;
        kotlin.jvm.internal.m.e(c0662z, "<this>");
        j0 j0Var = c0662z.f9562a;
        while (true) {
            C0655s c0655s = (C0655s) ((AtomicReference) j0Var.f9553a).get();
            if (c0655s != null) {
                return c0655s;
            }
            q0 q0VarC = AbstractC0263y.c();
            T5.e eVar = M5.H.f3811a;
            C0655s c0655s2 = new C0655s(c0662z, E3.h.L(q0VarC, R5.n.f7261a.f4044t));
            AtomicReference atomicReference = (AtomicReference) j0Var.f9553a;
            while (!atomicReference.compareAndSet(null, c0655s2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            T5.e eVar2 = M5.H.f3811a;
            AbstractC0263y.t(c0655s2, R5.n.f7261a.f4044t, null, new r(c0655s2, null), 2);
            return c0655s2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Z g(l0 l0Var) {
        j0 j0VarP = O3.D.p(l0Var, new W(), 4);
        return (Z) ((E.c0) j0VarP.f9553a).v("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.z.a(Z.class));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(View view, InterfaceC0660x interfaceC0660x) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0660x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(View view, l0 l0Var) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, l0Var);
    }
}
