package com.google.android.gms.internal.clearcut;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f10523a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f10523a = (i0.f && i0.f10513e) ? new l0(1) : new l0(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(byte[] bArr, int i, int i7) {
        byte b7 = bArr[i - 1];
        int i8 = i7 - i;
        if (i8 == 0) {
            if (b7 > -12) {
                return -1;
            }
            return b7;
        }
        if (i8 == 1) {
            byte b8 = bArr[i];
            if (b7 > -12 || b8 > -65) {
                return -1;
            }
            return (b8 << 8) ^ b7;
        }
        if (i8 != 2) {
            throw new AssertionError();
        }
        byte b9 = bArr[i];
        byte b10 = bArr[i + 1];
        if (b7 > -12 || b9 > -65 || b10 > -65) {
            return -1;
        }
        return (b10 << 16) ^ ((b9 << 8) ^ b7);
    }
}
