package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0820k1 extends AbstractC0851q2 {
    private static final C0820k1 zzi;
    private int zzb;
    private InterfaceC0880w2 zzd = Q2.f10692u;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0820k1 c0820k1 = new C0820k1();
        zzi = c0820k1;
        AbstractC0851q2.m(C0820k1.class, c0820k1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0815j1 z() {
        return (C0815j1) zzi.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void A(int i, C0835n1 c0835n1) {
        I();
        this.zzd.set(i, c0835n1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void B(C0835n1 c0835n1) {
        c0835n1.getClass();
        I();
        this.zzd.add(c0835n1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void C(Iterable iterable) {
        I();
        Y1.c(iterable, this.zzd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D() {
        this.zzd = Q2.f10692u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void E(int i) {
        I();
        this.zzd.remove(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void G(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void I() {
        InterfaceC0880w2 interfaceC0880w2 = this.zzd;
        if (((Z1) interfaceC0880w2).f10782q) {
            return;
        }
        int size = interfaceC0880w2.size();
        this.zzd = interfaceC0880w2.K(size + size);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzb", "zzd", C0835n1.class, "zze", "zzf", "zzg", "zzh"});
        }
        if (i7 == 3) {
            return new C0820k1();
        }
        if (i7 == 4) {
            return new C0815j1(zzi);
        }
        if (i7 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List p() {
        return this.zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        return this.zzd.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0835n1 r(int i) {
        return (C0835n1) this.zzd.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String s() {
        return this.zze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long u() {
        return this.zzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long w() {
        return this.zzg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int y() {
        return this.zzh;
    }
}
