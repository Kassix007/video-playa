package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0946z extends AbstractC0906e0 {
    private static final C0946z zzj;
    private static volatile H0 zzk;
    private int zzc;
    private long zze;
    private C0907f zzf;
    private C0932s zzh;
    private C0911h zzi;
    private String zzd = "";
    private String zzg = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0946z c0946z = new C0946z();
        zzj = c0946z;
        AbstractC0906e0.g(C0946z.class, c0946z);
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
                return new C0946z();
            case 2:
                return new C0909g(zzj);
            case 3:
                return new J0(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                H0 h02 = zzk;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0946z.class) {
                    try {
                        H0 h03 = zzk;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzk = c0900b0;
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
