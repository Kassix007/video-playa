package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0906e0 {
    private static final B zzf;
    private static volatile H0 zzg;
    private int zzc;
    private int zzd;
    private int zze;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        B b7 = new B();
        zzf = b7;
        AbstractC0906e0.g(B.class, b7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [com.google.android.gms.internal.vision.H0, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.AbstractC0906e0
    public final Object e(int i) {
        Object obj;
        switch (F.f11151a[i - 1]) {
            case 1:
                return new B();
            case 2:
                return new C0909g(zzf);
            case 3:
                return new J0(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                H0 h02 = zzg;
                if (h02 != null) {
                    return h02;
                }
                synchronized (B.class) {
                    try {
                        H0 h03 = zzg;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzg = c0900b0;
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
