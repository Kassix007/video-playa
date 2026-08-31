package com.google.android.gms.internal.vision;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0940w implements InterfaceC0912h0 {
    FORMAT_UNKNOWN(0),
    FORMAT_LUMINANCE(1),
    FORMAT_RGB8(2),
    FORMAT_MONOCHROME(3);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11325q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0940w(int i) {
        this.f11325q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + EnumC0940w.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11325q + " name=" + name() + '>';
    }
}
