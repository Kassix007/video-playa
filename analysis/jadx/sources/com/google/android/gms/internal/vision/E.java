package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class E extends AbstractC0906e0 {
    private static final E zzi;
    private static volatile H0 zzj;
    private int zzc;
    private C0919l zzd;
    private C0946z zze;
    private C0938v zzf;
    private int zzg;
    private boolean zzh;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        E e7 = new E();
        zzi = e7;
        AbstractC0906e0.g(E.class, e7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(E e7, C0938v c0938v) {
        e7.getClass();
        e7.zzf = c0938v;
        e7.zzc |= 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static D k() {
        return (D) ((AbstractC0902c0) zzi.e(5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r7v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r7v16, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.google.android.gms.internal.vision.H0, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.AbstractC0906e0
    public final Object e(int i) {
        Object obj;
        switch (F.f11151a[i - 1]) {
            case 1:
                return new E();
            case 2:
                return new D(zzi);
            case 3:
                return new J0(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                H0 h02 = zzj;
                if (h02 != null) {
                    return h02;
                }
                synchronized (E.class) {
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
