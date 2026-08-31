package J1;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r.Q f2504b = new r.Q(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f2505a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B(H h4) {
        this.f2505a = h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        r.Q q7 = f2504b;
        r.Q q8 = (r.Q) q7.get(classLoader);
        if (q8 == null) {
            q8 = new r.Q(0);
            q7.put(classLoader, q8);
        }
        Class cls = (Class) q8.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        q8.put(str, cls2);
        return cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e7) {
            throw new C2.e(C0.S.n("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e8) {
            throw new C2.e(C0.S.n("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractComponentCallbacksC0185q a(String str) {
        try {
            return (AbstractComponentCallbacksC0185q) c(this.f2505a.f2541t.f2735u.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new C2.e(C0.S.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e8) {
            throw new C2.e(C0.S.n("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (NoSuchMethodException e9) {
            throw new C2.e(C0.S.n("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
        } catch (InvocationTargetException e10) {
            throw new C2.e(C0.S.n("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }
}
