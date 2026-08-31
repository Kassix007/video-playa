package com.google.android.gms.internal.vision;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0906e0 extends K {
    private static Map<Object, AbstractC0906e0> zzd = new ConcurrentHashMap();
    protected O0 zzb;
    private int zzc;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0906e0() {
        this.zza = 0;
        this.zzb = O0.f;
        this.zzc = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static AbstractC0906e0 d(Class cls) {
        AbstractC0906e0 abstractC0906e0 = zzd.get(cls);
        if (abstractC0906e0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0906e0 = zzd.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0906e0 != null) {
            return abstractC0906e0;
        }
        AbstractC0906e0 abstractC0906e02 = (AbstractC0906e0) ((AbstractC0906e0) U0.b(cls)).e(6);
        if (abstractC0906e02 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, abstractC0906e02);
        return abstractC0906e02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object f(Method method, AbstractC0906e0 abstractC0906e0, Object... objArr) {
        try {
            return method.invoke(abstractC0906e0, objArr);
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
    public static void g(Class cls, AbstractC0906e0 abstractC0906e0) {
        zzd.put(cls, abstractC0906e0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.g0, com.google.android.gms.internal.vision.l0] */
    public static InterfaceC0920l0 i() {
        return C0910g0.f11269t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.K
    public final void b(int i) {
        this.zzc = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.K
    public final int c() {
        return this.zzc;
    }

    public abstract Object e(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        I0 i02 = I0.f11178c;
        i02.getClass();
        return i02.a(getClass()).g(this, (AbstractC0906e0) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h() {
        if (this.zzc == -1) {
            I0 i02 = I0.f11178c;
            i02.getClass();
            this.zzc = i02.a(getClass()).h(this);
        }
        return this.zzc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        I0 i02 = I0.f11178c;
        i02.getClass();
        int iF = i02.a(getClass()).f(this);
        this.zza = iF;
        return iF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0904d0.p(this, sb, 0);
        return sb.toString();
    }
}
