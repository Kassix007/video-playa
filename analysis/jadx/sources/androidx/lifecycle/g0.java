package androidx.lifecycle;

import android.app.Application;
import com.google.android.gms.internal.measurement.I1;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g0 f9545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O3.B f9546d = new O3.B(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f9547b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g0(Application application) {
        this.f9547b = application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.i0, androidx.lifecycle.h0
    public final f0 a(Class cls) {
        Application application = this.f9547b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.i0, androidx.lifecycle.h0
    public final f0 c(Class cls, P1.e eVar) {
        if (this.f9547b != null) {
            return a(cls);
        }
        Application application = (Application) eVar.f5610a.get(f9546d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0638a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return I1.Q(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final f0 d(Class cls, Application application) {
        if (!AbstractC0638a.class.isAssignableFrom(cls)) {
            return I1.Q(cls);
        }
        try {
            f0 f0Var = (f0) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.m.b(f0Var);
            return f0Var;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}
