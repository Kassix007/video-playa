package g2;

import C0.S;
import J1.AbstractComponentCallbacksC0185q;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.EnumC0652o;
import androidx.lifecycle.InterfaceC0658v;
import androidx.lifecycle.InterfaceC0660x;
import androidx.lifecycle.X;
import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import b.g;
import h.AbstractActivityC1106h;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0658v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f13037r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b(e eVar, int i) {
        this.f13036q = i;
        this.f13037r = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0658v
    public final void e(InterfaceC0660x interfaceC0660x, EnumC0652o enumC0652o) {
        View view;
        switch (this.f13036q) {
            case 0:
                if (enumC0652o != EnumC0652o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0660x.getLifecycle().c(this);
                e eVar = this.f13037r;
                Bundle bundleH = eVar.b().h("androidx.savedstate.Restarter");
                if (bundleH == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleH.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        m.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                m.b(objNewInstance);
                                if (!(eVar instanceof l0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                k0 k0VarF = ((l0) eVar).f();
                                Z.m mVarB = eVar.b();
                                k0VarF.getClass();
                                LinkedHashMap linkedHashMap = k0VarF.f9554a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    m.e(key, "key");
                                    f0 f0Var = (f0) linkedHashMap.get(key);
                                    if (f0Var != null) {
                                        X.a(f0Var, mVarB, eVar.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    mVarB.F();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(S.w("Failed to instantiate ", str2), e7);
                            }
                        } catch (NoSuchMethodException e8) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(S.n("Class ", str2, " wasn't found"), e9);
                    }
                }
                return;
            case 1:
                if (enumC0652o != EnumC0652o.ON_STOP || (view = ((AbstractComponentCallbacksC0185q) this.f13037r).f2703U) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                AbstractActivityC1106h abstractActivityC1106h = (AbstractActivityC1106h) this.f13037r;
                if (abstractActivityC1106h.f9895u == null) {
                    g gVar = (g) abstractActivityC1106h.getLastNonConfigurationInstance();
                    if (gVar != null) {
                        abstractActivityC1106h.f9895u = gVar.f9864a;
                    }
                    if (abstractActivityC1106h.f9895u == null) {
                        abstractActivityC1106h.f9895u = new k0();
                    }
                }
                abstractActivityC1106h.f14061q.c(this);
                return;
        }
    }
}
