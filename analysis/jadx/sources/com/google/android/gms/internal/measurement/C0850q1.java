package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0850q1 extends AbstractC0851q2 {
    private static final C0850q1 zzh;
    private int zzb;
    private InterfaceC0880w2 zzd = Q2.f10692u;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0850q1 c0850q1 = new C0850q1();
        zzh = c0850q1;
        AbstractC0851q2.m(C0850q1.class, c0850q1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0845p1 w() {
        return (C0845p1) zzh.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0845p1 x(C0850q1 c0850q1) {
        AbstractC0846p2 abstractC0846p2H = zzh.h();
        abstractC0846p2H.f(c0850q1);
        return (C0845p1) abstractC0846p2H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void A(ArrayList arrayList) {
        E();
        Y1.c(arrayList, this.zzd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B() {
        this.zzd = Q2.f10692u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
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
            return new R2(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", C0859s1.class, "zze", "zzf", "zzg", B0.j});
        }
        if (i7 == 3) {
            return new C0850q1();
        }
        if (i7 == 4) {
            return new C0845p1(zzh);
        }
        if (i7 == 5) {
            return zzh;
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
    public final C0859s1 r(int i) {
        return (C0859s1) this.zzd.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s() {
        return (this.zzb & 1) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String t() {
        return this.zze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u() {
        return (this.zzb & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String v() {
        return this.zzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void y(int i, C0859s1 c0859s1) {
        E();
        this.zzd.set(i, c0859s1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void z(C0859s1 c0859s1) {
        E();
        this.zzd.add(c0859s1);
    }
}
