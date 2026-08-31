package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class I0 extends AbstractC0851q2 {
    private static final I0 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        I0 i02 = new I0();
        zzf = i02;
        AbstractC0851q2.m(I0.class, i02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i7 == 3) {
            return new I0();
        }
        if (i7 == 4) {
            return new A0(zzf);
        }
        if (i7 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String p() {
        return this.zzd;
    }
}
