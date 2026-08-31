package u5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: u5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1703a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f17216a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        m.b(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (m.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                m.d(parameterTypes, "getParameterTypes(...)");
                if (m.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f17216a = method;
        int length2 = methods.length;
        for (int i7 = 0; i7 < length2 && !m.a(methods[i7].getName(), "getSuppressed"); i7++) {
        }
    }
}
