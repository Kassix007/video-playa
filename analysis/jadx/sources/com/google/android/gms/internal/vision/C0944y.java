package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0944y extends AbstractC0906e0 {
    private static final C0944y zzi;
    private static volatile H0 zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0944y c0944y = new C0944y();
        zzi = c0944y;
        AbstractC0906e0.g(C0944y.class, c0944y);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(C0944y c0944y, long j) {
        c0944y.zzc |= 2;
        c0944y.zze = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0942x k() {
        return (C0942x) ((AbstractC0902c0) zzi.e(5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(C0944y c0944y, long j) {
        c0944y.zzc |= 4;
        c0944y.zzf = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(C0944y c0944y, long j) {
        c0944y.zzc |= 8;
        c0944y.zzg = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(C0944y c0944y, long j) {
        c0944y.zzc |= 16;
        c0944y.zzh = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v10, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r8v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r8v16, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.google.android.gms.internal.vision.H0, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.AbstractC0906e0
    public final Object e(int i) {
        Object obj;
        switch (F.f11151a[i - 1]) {
            case 1:
                return new C0944y();
            case 2:
                return new C0942x(zzi);
            case 3:
                return new J0(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", H.f11157g, "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                H0 h02 = zzj;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0944y.class) {
                    try {
                        H0 h03 = zzj;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzj = c0900b0;
                            obj = c0900b0;
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
}
