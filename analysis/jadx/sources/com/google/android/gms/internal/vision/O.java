package com.google.android.gms.internal.vision;

/* JADX INFO: loaded from: classes.dex */
public final class O extends P {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11212v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O(byte[] bArr, int i, int i7) {
        super(bArr);
        P.j(i, i + i7, bArr.length);
        this.f11211u = i;
        this.f11212v = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.P
    public final byte d(int i) {
        int i7 = this.f11212v;
        if (((i7 - (i + 1)) | i) >= 0) {
            return this.f11221r[this.f11211u + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i7);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.P
    public final int g() {
        return this.f11212v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.P
    public final byte i(int i) {
        return this.f11221r[this.f11211u + i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.vision.P
    public final int k() {
        return this.f11211u;
    }
}
