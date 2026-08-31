package q6;

import C0.S;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class D extends C1541j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient byte[][] f16037u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int[] f16038v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(byte[][] bArr, int[] iArr) {
        super(C1541j.f16064t.f16065q);
        this.f16037u = bArr;
        this.f16038v = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final C1541j b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f16037u;
        int length = bArr.length;
        int i = 0;
        int i7 = 0;
        while (i < length) {
            int[] iArr = this.f16038v;
            int i8 = iArr[length + i];
            int i9 = iArr[i];
            messageDigest.update(bArr[i], i8, i9 - i7);
            i++;
            i7 = i9;
        }
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m.b(bArrDigest);
        return new C1541j(bArrDigest);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final int c() {
        return this.f16038v[this.f16037u.length - 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final String d() {
        return s().d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final int e(int i, byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        return s().e(i, other);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1541j) {
            C1541j c1541j = (C1541j) obj;
            if (c1541j.c() == c() && k(0, c1541j, c())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final byte[] g() {
        return r();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final byte h(int i) {
        byte[][] bArr = this.f16037u;
        int length = bArr.length - 1;
        int[] iArr = this.f16038v;
        Q2.g.o(iArr[length], i, 1L);
        int iH = r6.b.h(this, i);
        return bArr[iH][(i - (iH == 0 ? 0 : iArr[iH - 1])) + iArr[bArr.length + iH]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final int hashCode() {
        int i = this.f16066r;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f16037u;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f16038v;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            byte[] bArr2 = bArr[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr2[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        this.f16066r = i8;
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final int i(byte[] other) {
        kotlin.jvm.internal.m.e(other, "other");
        return s().i(other);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final boolean k(int i, C1541j other, int i7) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i >= 0 && i <= c() - i7) {
            int i8 = i7 + i;
            int iH = r6.b.h(this, i);
            int i9 = 0;
            while (i < i8) {
                int[] iArr = this.f16038v;
                int i10 = iH == 0 ? 0 : iArr[iH - 1];
                int i11 = iArr[iH] - i10;
                byte[][] bArr = this.f16037u;
                int i12 = iArr[bArr.length + iH];
                int iMin = Math.min(i8, i11 + i10) - i;
                if (other.l(i9, bArr[iH], (i - i10) + i12, iMin)) {
                    i9 += iMin;
                    i += iMin;
                    iH++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final boolean l(int i, byte[] other, int i7, int i8) {
        kotlin.jvm.internal.m.e(other, "other");
        if (i < 0 || i > c() - i8 || i7 < 0 || i7 > other.length - i8) {
            return false;
        }
        int i9 = i8 + i;
        int iH = r6.b.h(this, i);
        while (i < i9) {
            int[] iArr = this.f16038v;
            int i10 = iH == 0 ? 0 : iArr[iH - 1];
            int i11 = iArr[iH] - i10;
            byte[][] bArr = this.f16037u;
            int i12 = iArr[bArr.length + iH];
            int iMin = Math.min(i9, i11 + i10) - i;
            if (!Q2.g.l((i - i10) + i12, i7, iMin, bArr[iH], other)) {
                return false;
            }
            i7 += iMin;
            i += iMin;
            iH++;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final C1541j m(int i, int i7) {
        if (i7 == -1234567890) {
            i7 = c();
        }
        if (i < 0) {
            throw new IllegalArgumentException(S.m("beginIndex=", " < 0", i).toString());
        }
        if (i7 > c()) {
            StringBuilder sbL = k1.i.l("endIndex=", " > length(", i7);
            sbL.append(c());
            sbL.append(')');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        int i8 = i7 - i;
        if (i8 < 0) {
            throw new IllegalArgumentException(S.j(i7, i, "endIndex=", " < beginIndex=").toString());
        }
        if (i == 0 && i7 == c()) {
            return this;
        }
        if (i == i7) {
            return C1541j.f16064t;
        }
        int iH = r6.b.h(this, i);
        int iH2 = r6.b.h(this, i7 - 1);
        byte[][] bArr = this.f16037u;
        byte[][] bArr2 = (byte[][]) n5.k.I0(bArr, iH, iH2 + 1);
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f16038v;
        if (iH <= iH2) {
            int i9 = iH;
            int i10 = 0;
            while (true) {
                iArr[i10] = Math.min(iArr2[i9] - i, i8);
                int i11 = i10 + 1;
                iArr[i10 + bArr2.length] = iArr2[bArr.length + i9];
                if (i9 == iH2) {
                    break;
                }
                i9++;
                i10 = i11;
            }
        }
        int i12 = iH != 0 ? iArr2[iH - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i - i12) + iArr[length];
        return new D(bArr2, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final C1541j o() {
        return s().o();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final void q(C1538g c1538g, int i) {
        int iH = r6.b.h(this, 0);
        int i7 = 0;
        while (i7 < i) {
            int[] iArr = this.f16038v;
            int i8 = iH == 0 ? 0 : iArr[iH - 1];
            int i9 = iArr[iH] - i8;
            byte[][] bArr = this.f16037u;
            int i10 = iArr[bArr.length + iH];
            int iMin = Math.min(i, i9 + i8) - i7;
            int i11 = (i7 - i8) + i10;
            B b7 = new B(bArr[iH], i11, i11 + iMin, true);
            B b8 = c1538g.f16062q;
            if (b8 == null) {
                b7.f16033g = b7;
                b7.f = b7;
                c1538g.f16062q = b7;
            } else {
                B b9 = b8.f16033g;
                kotlin.jvm.internal.m.b(b9);
                b9.b(b7);
            }
            i7 += iMin;
            iH++;
        }
        c1538g.f16063r += (long) i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] r() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.f16037u;
        int length = bArr2.length;
        int i = 0;
        int i7 = 0;
        int i8 = 0;
        while (i < length) {
            int[] iArr = this.f16038v;
            int i9 = iArr[length + i];
            int i10 = iArr[i];
            int i11 = i10 - i7;
            n5.k.B0(i8, i9, i9 + i11, bArr2[i], bArr);
            i8 += i11;
            i++;
            i7 = i10;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1541j s() {
        return new C1541j(r());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.C1541j
    public final String toString() {
        return s().toString();
    }
}
