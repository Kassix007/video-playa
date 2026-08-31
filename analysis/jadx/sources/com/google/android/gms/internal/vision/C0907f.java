package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0907f extends AbstractC0906e0 {
    private static final C0907f zzf;
    private static volatile H0 zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0907f c0907f = new C0907f();
        zzf = c0907f;
        AbstractC0906e0.g(C0907f.class, c0907f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(C0907f c0907f, String str) {
        c0907f.getClass();
        str.getClass();
        c0907f.zzc |= 1;
        c0907f.zzd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0905e k() {
        return (C0905e) ((AbstractC0902c0) zzf.e(5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void m(C0907f c0907f, String str) {
        c0907f.getClass();
        c0907f.zzc |= 2;
        c0907f.zze = str;
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
                return new C0907f();
            case 2:
                return new C0905e(zzf);
            case 3:
                return new J0(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                H0 h02 = zzg;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0907f.class) {
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
