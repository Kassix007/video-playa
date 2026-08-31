package C0;

import java.lang.reflect.Method;
import q5.InterfaceC1528g;
import v0.InterfaceC1742k;

/* JADX INFO: loaded from: classes.dex */
public final class E0 implements InterfaceC1528g, InterfaceC1742k, O0.c, Y0, X0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ E0 f812q = new E0();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h1 f813r = new h1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a() {
        Class cls = A.f702S0;
        try {
            if (A.f702S0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                A.f702S0 = cls2;
                A.T0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = A.T0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
