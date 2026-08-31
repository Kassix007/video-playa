package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0791e2 extends C0796f2 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f10831t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0791e2(int i, byte[] bArr) {
        super(bArr);
        C0796f2.j(0, i, bArr.length);
        this.f10831t = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.C0796f2
    public final byte d(int i) {
        int i7 = this.f10831t;
        if (((i7 - (i + 1)) | i) >= 0) {
            return this.f10842r[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 11);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i7).length());
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i7);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.C0796f2
    public final byte g(int i) {
        return this.f10842r[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.C0796f2
    public final int h() {
        return this.f10831t;
    }
}
