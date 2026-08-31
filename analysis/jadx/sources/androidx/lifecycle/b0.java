package androidx.lifecycle;

import android.app.Application;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C1193b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f9527a = AbstractC0836n2.A(Application.class, U.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f9528b = AbstractC0836n2.z(U.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.m.e(signature, "signature");
        C1193b c1193bH = kotlin.jvm.internal.m.h(cls.getConstructors());
        while (c1193bH.hasNext()) {
            Constructor constructor = (Constructor) c1193bH.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.m.d(parameterTypes, "getParameterTypes(...)");
            List listR0 = n5.k.R0(parameterTypes);
            if (signature.equals(listR0)) {
                return constructor;
            }
            if (signature.size() == listR0.size() && listR0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final f0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (f0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
