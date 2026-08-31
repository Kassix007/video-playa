package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0911h extends AbstractC0906e0 {
    private static final InterfaceC0918k0 zzd = new G(0);
    private static final C0911h zze;
    private static volatile H0 zzf;
    private InterfaceC0920l0 zzc = AbstractC0906e0.i();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.G, com.google.android.gms.internal.vision.k0] */
    static {
        C0911h c0911h = new C0911h();
        zze = c0911h;
        AbstractC0906e0.g(C0911h.class, c0911h);
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
                return new C0911h();
            case 2:
                return new C0909g(zze);
            case 3:
                return new J0(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", H.f11158h});
            case 4:
                return zze;
            case 5:
                H0 h02 = zzf;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0911h.class) {
                    try {
                        H0 h03 = zzf;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzf = c0900b0;
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
