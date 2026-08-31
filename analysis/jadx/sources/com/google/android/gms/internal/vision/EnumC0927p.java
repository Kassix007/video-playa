package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0927p implements InterfaceC0912h0 {
    CLASSIFICATION_UNKNOWN(0),
    CLASSIFICATION_NONE(1),
    CLASSIFICATION_ALL(2);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11303q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0927p(int i) {
        this.f11303q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC0927p.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11303q + " name=" + name() + '>';
    }
}
