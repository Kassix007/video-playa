package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0780c1 extends AbstractC0851q2 {
    private static final C0780c1 zzh;
    private int zzb;
    private int zzd;
    private C0874v1 zze;
    private C0874v1 zzf;
    private boolean zzg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0780c1 c0780c1 = new C0780c1();
        zzh = c0780c1;
        AbstractC0851q2.m(C0780c1.class, c0780c1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0775b1 w() {
        return (C0775b1) zzh.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void A(boolean z5) {
        this.zzb |= 8;
        this.zzg = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i7 == 3) {
            return new C0780c1();
        }
        if (i7 == 4) {
            return new C0775b1(zzh);
        }
        if (i7 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        return this.zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0874v1 r() {
        C0874v1 c0874v1 = this.zze;
        return c0874v1 == null ? C0874v1.y() : c0874v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s() {
        return (this.zzb & 4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0874v1 t() {
        C0874v1 c0874v1 = this.zzf;
        return c0874v1 == null ? C0874v1.y() : c0874v1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u() {
        return (this.zzb & 8) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v() {
        return this.zzg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void y(C0874v1 c0874v1) {
        this.zze = c0874v1;
        this.zzb |= 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void z(C0874v1 c0874v1) {
        this.zzf = c0874v1;
        this.zzb |= 4;
    }
}
