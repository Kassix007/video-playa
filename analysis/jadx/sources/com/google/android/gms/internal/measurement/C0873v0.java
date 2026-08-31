package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0873v0 extends AbstractC0851q2 {
    private static final C0873v0 zzi;
    private int zzb;
    private int zzd;
    private InterfaceC0880w2 zze;
    private InterfaceC0880w2 zzf;
    private boolean zzg;
    private boolean zzh;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0873v0 c0873v0 = new C0873v0();
        zzi = c0873v0;
        AbstractC0851q2.m(C0873v0.class, c0873v0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0873v0() {
        Q2 q22 = Q2.f10692u;
        this.zze = q22;
        this.zzf = q22;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC0851q2
    public final Object o(int i) {
        int i7 = i - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new R2(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", E0.class, "zzf", C0883x0.class, "zzg", "zzh"});
        }
        if (i7 == 3) {
            return new C0873v0();
        }
        if (i7 == 4) {
            return new C0868u0(zzi);
        }
        if (i7 == 5) {
            return zzi;
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
    public final E0 t(int i) {
        return (E0) this.zze.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC0880w2 u() {
        return this.zzf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int v() {
        return this.zzf.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0883x0 w(int i) {
        return (C0883x0) this.zzf.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(int i, E0 e02) {
        InterfaceC0880w2 interfaceC0880w2 = this.zze;
        if (!((Z1) interfaceC0880w2).f10782q) {
            int size = interfaceC0880w2.size();
            this.zze = interfaceC0880w2.K(size + size);
        }
        this.zze.set(i, e02);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y(int i, C0883x0 c0883x0) {
        InterfaceC0880w2 interfaceC0880w2 = this.zzf;
        if (!((Z1) interfaceC0880w2).f10782q) {
            int size = interfaceC0880w2.size();
            this.zzf = interfaceC0880w2.K(size + size);
        }
        this.zzf.set(i, c0883x0);
    }
}
