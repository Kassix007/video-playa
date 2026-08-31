package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0921m implements InterfaceC0912h0 {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_FAIL(2),
    RESULT_SKIPPED(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11285q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0921m(int i) {
        this.f11285q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC0921m.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11285q + " name=" + name() + '>';
    }
}
