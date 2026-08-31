package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends AbstractC0851q2 {
    private static final K0 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC0880w2 zze = Q2.f10692u;
    private boolean zzf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        K0 k02 = new K0();
        zzg = k02;
        AbstractC0851q2.m(K0.class, k02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", R0.class, "zzf"});
        }
        if (i7 == 3) {
            return new K0();
        }
        if (i7 == 4) {
            return new A0(zzg);
        }
        if (i7 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String p() {
        return this.zzd;
    }
}
