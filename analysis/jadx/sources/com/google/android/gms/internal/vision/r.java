package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public enum r implements InterfaceC0912h0 {
    MODE_UNKNOWN(0),
    MODE_ACCURATE(1),
    MODE_FAST(2),
    MODE_SELFIE(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11316q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    r(int i) {
        this.f11316q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + r.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11316q + " name=" + name() + '>';
    }
}
