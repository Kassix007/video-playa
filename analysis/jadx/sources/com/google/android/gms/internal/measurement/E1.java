package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class E1 extends AbstractC0851q2 {
    private static final E1 zzf;
    private int zzb;
    private InterfaceC0880w2 zzd = Q2.f10692u;
    private C1 zze;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        E1 e12 = new E1();
        zzf = e12;
        AbstractC0851q2.m(E1.class, e12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", F1.class, "zze"});
        }
        if (i7 == 3) {
            return new E1();
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
    public final List p() {
        return this.zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1 q() {
        C1 c12 = this.zze;
        return c12 == null ? C1.r() : c12;
    }
}
