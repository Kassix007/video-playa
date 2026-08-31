package com.google.android.gms.internal.measurement;

import a.AbstractC0597a;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends AbstractC0851q2 {
    private static final H0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        H0 h02 = new H0();
        zzf = h02;
        AbstractC0851q2.m(H0.class, h02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            B0 b02 = B0.f10601e;
            return new R2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", b02, "zze", b02});
        }
        if (i7 == 3) {
            return new H0();
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
    public final int p() {
        int iW = AbstractC0597a.W(this.zzd);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        int iW = AbstractC0597a.W(this.zze);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }
}
