package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0874v1 extends AbstractC0851q2 {
    private static final C0874v1 zzg;
    private InterfaceC0875v2 zzb;
    private InterfaceC0875v2 zzd;
    private InterfaceC0880w2 zze;
    private InterfaceC0880w2 zzf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0874v1 c0874v1 = new C0874v1();
        zzg = c0874v1;
        AbstractC0851q2.m(C0874v1.class, c0874v1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0874v1() {
        D2 d22 = D2.f10620u;
        this.zzb = d22;
        this.zzd = d22;
        Q2 q22 = Q2.f10692u;
        this.zze = q22;
        this.zzf = q22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0869u1 x() {
        return (C0869u1) zzg.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0874v1 y() {
        return zzg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A() {
        this.zzb = D2.f10620u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(List list) {
        List list2 = this.zzd;
        if (!((Z1) list2).f10782q) {
            int size = list2.size();
            this.zzd = ((D2) list2).K(size + size);
        }
        Y1.c(list, this.zzd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C() {
        this.zzd = D2.f10620u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(ArrayList arrayList) {
        InterfaceC0880w2 interfaceC0880w2 = this.zze;
        if (!((Z1) interfaceC0880w2).f10782q) {
            int size = interfaceC0880w2.size();
            this.zze = interfaceC0880w2.K(size + size);
        }
        Y1.c(arrayList, this.zze);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E() {
        this.zze = Q2.f10692u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void F(Iterable iterable) {
        InterfaceC0880w2 interfaceC0880w2 = this.zzf;
        if (!((Z1) interfaceC0880w2).f10782q) {
            int size = interfaceC0880w2.size();
            this.zzf = interfaceC0880w2.K(size + size);
        }
        Y1.c(iterable, this.zzf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G() {
        this.zzf = Q2.f10692u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", C0810i1.class, "zzf", C0884x1.class});
        }
        if (i7 == 3) {
            return new C0874v1();
        }
        if (i7 == 4) {
            return new C0869u1(zzg);
        }
        if (i7 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List p() {
        return this.zzb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int q() {
        return this.zzb.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List r() {
        return this.zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int s() {
        return this.zzd.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0880w2 t() {
        return this.zze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int u() {
        return this.zze.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List v() {
        return this.zzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int w() {
        return this.zzf.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(Iterable iterable) {
        List list = this.zzb;
        if (!((Z1) list).f10782q) {
            int size = list.size();
            this.zzb = ((D2) list).K(size + size);
        }
        Y1.c(iterable, this.zzb);
    }
}
