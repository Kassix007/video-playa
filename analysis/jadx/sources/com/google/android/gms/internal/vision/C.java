package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class C extends AbstractC0906e0 {
    private static final C zzh;
    private static volatile H0 zzi;
    private int zzc;
    private C0915j zzd;
    private int zze;
    private C0934t zzf;
    private C0913i zzg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C c7 = new C();
        zzh = c7;
        AbstractC0906e0.g(C.class, c7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v16, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r5v17, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.google.android.gms.internal.vision.H0, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.AbstractC0906e0
    public final Object e(int i) {
        Object obj;
        switch (F.f11151a[i - 1]) {
            case 1:
                return new C();
            case 2:
                return new C0909g(zzh);
            case 3:
                return new J0(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                H0 h02 = zzi;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C.class) {
                    try {
                        H0 h03 = zzi;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzi = c0900b0;
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
