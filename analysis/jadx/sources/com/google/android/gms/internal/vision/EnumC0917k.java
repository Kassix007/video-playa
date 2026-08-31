package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0917k implements InterfaceC0912h0 {
    REASON_UNKNOWN(0),
    REASON_MISSING(1),
    REASON_UPGRADE(2),
    REASON_INVALID(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11279q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0917k(int i) {
        this.f11279q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC0917k.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11279q + " name=" + name() + '>';
    }
}
