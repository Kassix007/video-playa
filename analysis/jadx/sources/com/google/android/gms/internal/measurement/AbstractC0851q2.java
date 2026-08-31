package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0851q2 extends Y1 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected Y2 zzc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0851q2() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = Y2.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0851q2 l(Class cls) {
        Map map = zzd;
        AbstractC0851q2 abstractC0851q2 = (AbstractC0851q2) map.get(cls);
        if (abstractC0851q2 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0851q2 = (AbstractC0851q2) map.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0851q2 != null) {
            return abstractC0851q2;
        }
        AbstractC0851q2 abstractC0851q22 = (AbstractC0851q2) ((AbstractC0851q2) AbstractC0787d3.e(cls)).o(6);
        if (abstractC0851q22 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC0851q22);
        return abstractC0851q22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(Class cls, AbstractC0851q2 abstractC0851q2) {
        abstractC0851q2.f();
        zzd.put(cls, abstractC0851q2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object n(Method method, AbstractC0851q2 abstractC0851q2, Object... objArr) {
        try {
            return method.invoke(abstractC0851q2, objArr);
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
    @Override // com.google.android.gms.internal.measurement.Y1
    public final int b(S2 s22) {
        if (e()) {
            int iG = s22.g(this);
            if (iG >= 0) {
                return iG;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iG).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iG);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iG2 = s22.g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iG2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iG2);
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(C0801g2 c0801g2) {
        S2 s2A = P2.f10684c.a(getClass());
        F2 f22 = c0801g2.f10846e;
        if (f22 == null) {
            f22 = new F2(c0801g2);
        }
        s2A.e(this, f22);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return P2.f10684c.a(getClass()).b(this, (AbstractC0851q2) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        P2.f10684c.a(getClass()).a(this);
        f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0846p2 h() {
        return (AbstractC0846p2) o(5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        if (e()) {
            return P2.f10684c.a(getClass()).f(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iF = P2.f10684c.a(getClass()).f(this);
        this.zza = iF;
        return iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0846p2 i() {
        AbstractC0846p2 abstractC0846p2 = (AbstractC0846p2) o(5);
        abstractC0846p2.f(this);
        return abstractC0846p2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k() {
        if (e()) {
            int iG = P2.f10684c.a(getClass()).g(this);
            if (iG >= 0) {
                return iG;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iG).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iG);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iG2 = P2.f10684c.a(getClass()).g(this);
        if (iG2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iG2;
            return iG2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iG2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iG2);
        throw new IllegalStateException(sb2.toString());
    }

    public abstract Object o(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = super.toString();
        char[] cArr = K2.f10653a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        K2.b(this, sb, 0);
        return sb.toString();
    }
}
