package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0913i extends AbstractC0906e0 {
    private static final C0913i zzg;
    private static volatile H0 zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0913i c0913i = new C0913i();
        zzg = c0913i;
        AbstractC0906e0.g(C0913i.class, c0913i);
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
                return new C0913i();
            case 2:
                return new C0909g(zzg);
            case 3:
                return new J0(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", H.f11158h, "zze", H.i, "zzf"});
            case 4:
                return zzg;
            case 5:
                H0 h02 = zzh;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0913i.class) {
                    try {
                        H0 h03 = zzh;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzh = c0900b0;
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
