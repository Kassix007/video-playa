package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import o5.C1423e;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f9520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f9521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f9522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0654q f9523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Z.m f9524e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a0() {
        this.f9521b = new g0(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.h0
    public final f0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.h0
    public final f0 b(kotlin.jvm.internal.f fVar, P1.e eVar) {
        return c(AbstractC0836n2.s(fVar), eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.h0
    public final f0 c(Class cls, P1.e eVar) {
        LinkedHashMap linkedHashMap = eVar.f5610a;
        String str = (String) linkedHashMap.get(j0.f9552b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(X.f9512a) == null || linkedHashMap.get(X.f9513b) == null) {
            if (this.f9523d != null) {
                return d(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(g0.f9546d);
        boolean zIsAssignableFrom = AbstractC0638a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? b0.a(cls, b0.f9528b) : b0.a(cls, b0.f9527a);
        return constructorA == null ? this.f9521b.c(cls, eVar) : (!zIsAssignableFrom || application == null) ? b0.b(cls, constructorA, X.b(eVar)) : b0.b(cls, constructorA, application, X.b(eVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f0 d(String str, Class cls) {
        U u6;
        AutoCloseable autoCloseable;
        Application application;
        AbstractC0654q abstractC0654q = this.f9523d;
        if (abstractC0654q == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0638a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f9520a == null) ? b0.a(cls, b0.f9528b) : b0.a(cls, b0.f9527a);
        if (constructorA == null) {
            if (this.f9520a != null) {
                return this.f9521b.a(cls);
            }
            if (i0.f9551a == null) {
                i0.f9551a = new i0();
            }
            kotlin.jvm.internal.m.b(i0.f9551a);
            return I1.Q(cls);
        }
        Z.m mVar = this.f9524e;
        kotlin.jvm.internal.m.b(mVar);
        Bundle bundle = this.f9522c;
        Bundle bundleH = mVar.h(str);
        if (bundleH != null) {
            bundle = bundleH;
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
        V v6 = new V(str, u6);
        v6.z(mVar, abstractC0654q);
        EnumC0653p enumC0653pB = abstractC0654q.b();
        if (enumC0653pB == EnumC0653p.f9557r || enumC0653pB.compareTo(EnumC0653p.f9559t) >= 0) {
            mVar.F();
        } else {
            abstractC0654q.a(new C0645h(mVar, abstractC0654q));
        }
        f0 f0VarB = (!zIsAssignableFrom || (application = this.f9520a) == null) ? b0.b(cls, constructorA, u6) : b0.b(cls, constructorA, application, u6);
        f0VarB.getClass();
        R1.c cVar = f0VarB.f9543a;
        if (cVar == null) {
            return f0VarB;
        }
        if (cVar.f6699d) {
            R1.c.a(v6);
            return f0VarB;
        }
        synchronized (cVar.f6696a) {
            autoCloseable = (AutoCloseable) cVar.f6697b.put("androidx.lifecycle.savedstate.vm.tag", v6);
        }
        R1.c.a(autoCloseable);
        return f0VarB;
    }

    public a0(Application application, g2.e eVar, Bundle bundle) {
        g0 g0Var;
        this.f9524e = eVar.b();
        this.f9523d = eVar.getLifecycle();
        this.f9522c = bundle;
        this.f9520a = application;
        if (application != null) {
            if (g0.f9545c == null) {
                g0.f9545c = new g0(application);
            }
            g0Var = g0.f9545c;
            kotlin.jvm.internal.m.b(g0Var);
        } else {
            g0Var = new g0(null);
        }
        this.f9521b = g0Var;
    }
}
