package com.google.android.gms.internal.measurement;

import a.AbstractC0597a;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends AbstractC0851q2 {
    private static final G0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        G0 g02 = new G0();
        zzg = g02;
        AbstractC0851q2.m(G0.class, g02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", B0.f10601e, "zze", B0.f10600d, "zzf", B0.f});
        }
        if (i7 == 3) {
            return new G0();
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
    public final int p() {
        int iW = AbstractC0597a.W(this.zzd);
        if (iW == 0) {
            return 1;
        }
        return iW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        int i;
        int i7 = this.zze;
        if (i7 != 0) {
            i = 2;
            if (i7 != 1) {
                i = i7 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int r() {
        int i;
        int i7 = this.zzf;
        if (i7 != 0) {
            i = 2;
            if (i7 != 1) {
                i = i7 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
