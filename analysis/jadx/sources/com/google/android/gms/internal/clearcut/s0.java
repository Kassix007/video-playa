package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends AbstractC0764x {
    private static volatile T zzbg;
    private static final s0 zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        s0 s0Var = new s0();
        zzbiv = s0Var;
        AbstractC0764x.c(s0.class, s0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(s0 s0Var, long j) {
        s0Var.zzbb |= 4;
        s0Var.zzbit = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(s0 s0Var, String str) {
        s0Var.getClass();
        str.getClass();
        s0Var.zzbb |= 2;
        s0Var.zzbis = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(s0 s0Var, long j) {
        s0Var.zzbb |= 8;
        s0Var.zzbiu = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r0 m() {
        return (r0) ((AbstractC0762v) zzbiv.a(5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v16, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v17, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.clearcut.T, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0764x
    public final Object a(int i) {
        Object obj;
        switch (u0.f10559a[i - 1]) {
            case 1:
                return new s0();
            case 2:
                return new r0(zzbiv);
            case 3:
                return new X(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                T t6 = zzbg;
                if (t6 != null) {
                    return t6;
                }
                synchronized (s0.class) {
                    try {
                        T t7 = zzbg;
                        obj = t7;
                        if (t7 == null) {
                            ?? c0763w = new C0763w();
                            zzbg = c0763w;
                            obj = c0763w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return obj;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        return this.zzya;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        return (this.zzbb & 1) == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String j() {
        return this.zzbis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long k() {
        return this.zzbit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long l() {
        return this.zzbiu;
    }
}
