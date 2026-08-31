package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends AbstractC0851q2 {
    private static final P0 zzd;
    private InterfaceC0880w2 zzb = Q2.f10692u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        P0 p02 = new P0();
        zzd = p02;
        AbstractC0851q2.m(P0.class, p02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i7 == 3) {
            return new P0();
        }
        if (i7 == 4) {
            return new A0(zzd);
        }
        if (i7 == 5) {
            return zzd;
        }
        throw null;
    }
}
