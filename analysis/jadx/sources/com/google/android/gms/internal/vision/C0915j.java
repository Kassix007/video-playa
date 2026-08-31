package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0915j extends AbstractC0906e0 {
    private static final C0915j zzd;
    private static volatile H0 zze;
    private InterfaceC0924n0 zzc = K0.f11201t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0915j c0915j = new C0915j();
        zzd = c0915j;
        AbstractC0906e0.g(C0915j.class, c0915j);
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
                return new C0915j();
            case 2:
                return new C0909g(zzd);
            case 3:
                return new J0(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", B.class});
            case 4:
                return zzd;
            case 5:
                H0 h02 = zze;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0915j.class) {
                    try {
                        H0 h03 = zze;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zze = c0900b0;
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
