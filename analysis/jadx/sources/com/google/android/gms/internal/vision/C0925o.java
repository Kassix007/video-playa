package com.google.android.gms.internal.vision;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0925o extends AbstractC0906e0 {
    private static final C0925o zzl;
    private static volatile H0 zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private InterfaceC0924n0 zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private InterfaceC0924n0 zzk;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0925o c0925o = new C0925o();
        zzl = c0925o;
        AbstractC0906e0.g(C0925o.class, c0925o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0925o() {
        K0 k02 = K0.f11201t;
        this.zzf = k02;
        this.zzh = "";
        this.zzk = k02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(C0925o c0925o, long j) {
        c0925o.zzc |= 16;
        c0925o.zzi = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(C0925o c0925o, String str) {
        c0925o.getClass();
        str.getClass();
        c0925o.zzc |= 1;
        c0925o.zzd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void l(C0925o c0925o, List list) {
        InterfaceC0924n0 interfaceC0924n0 = c0925o.zzk;
        if (!interfaceC0924n0.zza()) {
            int size = interfaceC0924n0.size();
            c0925o.zzk = interfaceC0924n0.a(size == 0 ? 10 : size << 1);
        }
        K.a(list, c0925o.zzk);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0923n m() {
        return (C0923n) ((AbstractC0902c0) zzl.e(5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(C0925o c0925o, long j) {
        c0925o.zzc |= 32;
        c0925o.zzj = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r12v15, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r12v16, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.google.android.gms.internal.vision.H0, java.lang.Object] */
    @Override // com.google.android.gms.internal.vision.AbstractC0906e0
    public final Object e(int i) {
        Object obj;
        switch (F.f11151a[i - 1]) {
            case 1:
                return new C0925o();
            case 2:
                return new C0923n(zzl);
            case 3:
                return new J0(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", H.f11154c, "zzh", "zzi", "zzj", "zzk", C.class});
            case 4:
                return zzl;
            case 5:
                H0 h02 = zzm;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0925o.class) {
                    try {
                        H0 h03 = zzm;
                        obj = h03;
                        if (h03 == null) {
                            ?? c0900b0 = new C0900b0();
                            zzm = c0900b0;
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
