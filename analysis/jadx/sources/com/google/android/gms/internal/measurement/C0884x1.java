package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0884x1 extends AbstractC0851q2 {
    private static final C0884x1 zzf;
    private int zzb;
    private int zzd;
    private InterfaceC0875v2 zze = D2.f10620u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0884x1 c0884x1 = new C0884x1();
        zzf = c0884x1;
        AbstractC0851q2.m(C0884x1.class, c0884x1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0879w1 u() {
        return (C0879w1) zzf.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i7 == 3) {
            return new C0884x1();
        }
        if (i7 == 4) {
            return new C0879w1(zzf);
        }
        if (i7 == 5) {
            return zzf;
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
    public final List r() {
        return this.zze;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int s() {
        return this.zze.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long t(int i) {
        return ((D2) this.zze).g(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final /* synthetic */ void v(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(List list) {
        List list2 = this.zze;
        if (!((Z1) list2).f10782q) {
            int size = list2.size();
            this.zze = ((D2) list2).K(size + size);
        }
        Y1.c(list, this.zze);
    }
}
