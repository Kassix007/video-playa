package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0825l1 extends AbstractC0851q2 {
    private static final C0825l1 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0825l1 c0825l1 = new C0825l1();
        zzf = c0825l1;
        AbstractC0851q2.m(C0825l1.class, c0825l1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i7 == 3) {
            return new C0825l1();
        }
        if (i7 == 4) {
            return new A0(zzf);
        }
        if (i7 == 5) {
            return zzf;
        }
        throw null;
    }
}
