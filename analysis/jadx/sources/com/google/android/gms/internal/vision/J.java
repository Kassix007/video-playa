package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public enum J implements InterfaceC0912h0 {
    UNKNOWN_FORMAT(0),
    CONTACT_INFO(1),
    EMAIL(2),
    ISBN(3),
    PHONE(4),
    PRODUCT(5),
    SMS(6),
    TEXT(7),
    URL(8),
    WIFI(9),
    GEO(10),
    CALENDAR_EVENT(11),
    DRIVER_LICENSE(12),
    BOARDING_PASS(13);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11196q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    J(int i) {
        this.f11196q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + J.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11196q + " name=" + name() + '>';
    }
}
