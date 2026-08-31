package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractC0851q2 {
    private static final O0 zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private InterfaceC0880w2 zzg;
    private InterfaceC0880w2 zzh;
    private InterfaceC0880w2 zzi;
    private String zzj;
    private boolean zzk;
    private InterfaceC0880w2 zzl;
    private InterfaceC0880w2 zzm;
    private String zzn;
    private String zzo;
    private J0 zzp;
    private Q0 zzq;
    private T0 zzr;
    private R0 zzs;
    private P0 zzt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        O0 o02 = new O0();
        zzu = o02;
        AbstractC0851q2.m(O0.class, o02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O0() {
        Q2 q22 = Q2.f10692u;
        this.zzg = q22;
        this.zzh = q22;
        this.zzi = q22;
        this.zzj = "";
        this.zzl = q22;
        this.zzm = q22;
        this.zzn = "";
        this.zzo = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static N0 F() {
        return (N0) zzu.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static O0 G() {
        return zzu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String A() {
        return this.zzn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean B() {
        return (this.zzb & 128) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final J0 C() {
        J0 j02 = this.zzp;
        return j02 == null ? J0.v() : j02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean D() {
        return (this.zzb & 512) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final T0 E() {
        T0 t02 = this.zzr;
        return t02 == null ? T0.r() : t02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(int i, M0 m02) {
        InterfaceC0880w2 interfaceC0880w2 = this.zzh;
        if (!((Z1) interfaceC0880w2).f10782q) {
            int size = interfaceC0880w2.size();
            this.zzh = interfaceC0880w2.K(size + size);
        }
        this.zzh.set(i, m02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() {
        this.zzi = Q2.f10692u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J() {
        this.zzl = Q2.f10692u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", S0.class, "zzh", M0.class, "zzi", C0873v0.class, "zzj", "zzk", "zzl", E1.class, "zzm", K0.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i7 == 3) {
            return new O0();
        }
        if (i7 == 4) {
            return new N0(zzu);
        }
        if (i7 == 5) {
            return zzu;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean p() {
        return (this.zzb & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long q() {
        return this.zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r() {
        return (this.zzb & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String s() {
        return this.zze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0880w2 t() {
        return this.zzg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int u() {
        return this.zzh.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final M0 v(int i) {
        return (M0) this.zzh.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0880w2 w() {
        return this.zzi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0880w2 x() {
        return this.zzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int y() {
        return this.zzl.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List z() {
        return this.zzm;
    }
}
