package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795f1 extends AbstractC0851q2 {
    private static final C0795f1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0795f1 c0795f1 = new C0795f1();
        zzf = c0795f1;
        AbstractC0851q2.m(C0795f1.class, c0795f1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0790e1 p() {
        return (C0790e1) zzf.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", B0.f10603h, "zze", B0.i});
        }
        if (i7 == 3) {
            return new C0795f1();
        }
        if (i7 == 4) {
            return new C0790e1(zzf);
        }
        if (i7 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        int i;
        int i7 = this.zzd;
        if (i7 != 0) {
            i = 2;
            if (i7 != 1) {
                if (i7 != 2) {
                    i = 4;
                    if (i7 != 3) {
                        i = i7 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
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
    public final /* synthetic */ void s(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void t(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
