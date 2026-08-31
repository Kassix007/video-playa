package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public enum I implements InterfaceC0912h0 {
    UNRECOGNIZED(0),
    CODE_128(1),
    CODE_39(2),
    CODE_93(3),
    CODABAR(4),
    DATA_MATRIX(5),
    EAN_13(6),
    EAN_8(7),
    ITF(8),
    QR_CODE(9),
    UPC_A(10),
    UPC_E(11),
    PDF417(12),
    AZTEC(13),
    DATABAR(14),
    TEZ_CODE(16);


    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11177q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    I(int i) {
        this.f11177q = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Enum
    public final String toString() {
        return "<" + I.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f11177q + " name=" + name() + '>';
    }
}
