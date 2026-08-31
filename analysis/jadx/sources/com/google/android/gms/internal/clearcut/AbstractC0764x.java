package com.google.android.gms.internal.clearcut;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0764x extends AbstractC0748g {
    private static Map<Object, AbstractC0764x> zzjr = new ConcurrentHashMap();
    protected C0739b0 zzjp;
    private int zzjq;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0764x() {
        this.zzex = 0;
        this.zzjp = C0739b0.f10493e;
        this.zzjq = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object b(Method method, AbstractC0764x abstractC0764x, Object... objArr) {
        try {
            return method.invoke(abstractC0764x, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Class cls, AbstractC0764x abstractC0764x) {
        zzjr.put(cls, abstractC0764x);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0764x d(Class cls) {
        AbstractC0764x abstractC0764x = zzjr.get(cls);
        if (abstractC0764x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0764x = zzjr.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0764x != null) {
            return abstractC0764x;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public abstract Object a(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0764x) a(6)).getClass().isInstance(obj)) {
            return false;
        }
        V v6 = V.f10444c;
        v6.getClass();
        return v6.a(getClass()).e(this, (AbstractC0764x) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        V v6 = V.f10444c;
        v6.getClass();
        int iG = v6.a(getClass()).g(this);
        this.zzex = iG;
        return iG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        l0.i(this, sb, 0);
        return sb.toString();
    }
}
