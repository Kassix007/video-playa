package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0929q implements InterfaceC0912h0 {
    LANDMARK_UNKNOWN(0),
    LANDMARK_NONE(1),
    LANDMARK_ALL(2),
    LANDMARK_CONTOUR(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11309q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0929q(int i) {
        this.f11309q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC0929q.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11309q + " name=" + name() + '>';
    }
}
