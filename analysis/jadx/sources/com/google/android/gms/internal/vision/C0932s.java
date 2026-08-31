package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0932s extends AbstractC0906e0 {
    private static final C0932s zzj;
    private static volatile H0 zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0932s c0932s = new C0932s();
        zzj = c0932s;
        AbstractC0906e0.g(C0932s.class, c0932s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v10, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r11v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r11v16, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.google.android.gms.internal.vision.H0, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.AbstractC0906e0
    public final Object e(int i) {
        Object obj;
        switch (F.f11151a[i - 1]) {
            case 1:
                return new C0932s();
            case 2:
                return new C0909g(zzj);
            case 3:
                return new J0(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", H.f, "zze", H.f11156e, "zzf", H.f11155d, "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                H0 h02 = zzk;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0932s.class) {
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
