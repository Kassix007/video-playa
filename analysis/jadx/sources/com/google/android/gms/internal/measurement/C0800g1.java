package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0800g1 extends AbstractC0851q2 {
    private static final C0800g1 zzd;
    private InterfaceC0880w2 zzb = Q2.f10692u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0800g1 c0800g1 = new C0800g1();
        zzd = c0800g1;
        AbstractC0851q2.m(C0800g1.class, c0800g1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0785d1 q() {
        return (C0785d1) zzd.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0800g1 r() {
        return zzd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C0795f1.class});
        }
        if (i7 == 3) {
            return new C0800g1();
        }
        if (i7 == 4) {
            return new C0785d1(zzd);
        }
        if (i7 == 5) {
            return zzd;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List p() {
        return this.zzb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s(ArrayList arrayList) {
        InterfaceC0880w2 interfaceC0880w2 = this.zzb;
        if (!((Z1) interfaceC0880w2).f10782q) {
            int size = interfaceC0880w2.size();
            this.zzb = interfaceC0880w2.K(size + size);
        }
        Y1.c(arrayList, this.zzb);
    }
}
