package com.google.android.gms.internal.vision;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0938v extends AbstractC0906e0 {
    private static final C0938v zzg;
    private static volatile H0 zzh;
    private int zzc;
    private C0944y zzd;
    private A zze;
    private InterfaceC0924n0 zzf = K0.f11201t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0938v c0938v = new C0938v();
        zzg = c0938v;
        AbstractC0906e0.g(C0938v.class, c0938v);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void j(C0938v c0938v, C0944y c0944y) {
        c0938v.getClass();
        c0938v.zzd = c0944y;
        c0938v.zzc |= 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void k(C0938v c0938v, ArrayList arrayList) {
        InterfaceC0924n0 interfaceC0924n0 = c0938v.zzf;
        if (!interfaceC0924n0.zza()) {
            int size = interfaceC0924n0.size();
            c0938v.zzf = interfaceC0924n0.a(size == 0 ? 10 : size << 1);
        }
        K.a(arrayList, c0938v.zzf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0936u l() {
        return (C0936u) ((AbstractC0902c0) zzg.e(5));
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
                return new C0938v();
            case 2:
                return new C0936u(zzg);
            case 3:
                return new J0(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C0925o.class});
            case 4:
                return zzg;
            case 5:
                H0 h02 = zzh;
                if (h02 != null) {
                    return h02;
                }
                synchronized (C0938v.class) {
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
