package com.google.android.gms.internal.vision;

import androidx.work.WorkInfo;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends AbstractC0904d0 {
    public static final Logger f = Logger.getLogger(Q.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f11223g = U0.f11238e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0941w0 f11224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f11225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11227e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.f11225c = bArr;
        this.f11227e = 0;
        this.f11226d = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int G(String str) {
        int length;
        try {
            length = X0.a(str);
        } catch (Y0 unused) {
            length = str.getBytes(AbstractC0914i0.f11272a).length;
        }
        return T(length) + length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int I(int i, K k7, L0 l02) {
        int iT = T(i << 3) << 1;
        int iC = k7.c();
        if (iC == -1) {
            iC = l02.h(k7);
            k7.b(iC);
        }
        return iT + iC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int J(int i, P p7) {
        int iT = T(i << 3);
        int iG = p7.g();
        return C0.S.u(iG, iG, iT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int N(int i, long j) {
        return O(j) + T(i << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int O(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int P(int i) {
        if (i >= 0) {
            return T(i);
        }
        return 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int Q(int i, long j) {
        return O((j >> 63) ^ (j << 1)) + T(i << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int R(int i) {
        return T(i << 3) + 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int S(int i, int i7) {
        return T(i7) + T(i << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int T(int i) {
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int U(int i, int i7) {
        return T((i7 >> 31) ^ (i7 << 1)) + T(i << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int V(int i) {
        return T(i << 3) + 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int y(int i) {
        return T(i << 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(byte b7) throws S {
        try {
            byte[] bArr = this.f11225c;
            int i = this.f11227e;
            this.f11227e = i + 1;
            bArr[i] = b7;
        } catch (IndexOutOfBoundsException e7) {
            throw new S(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11227e), Integer.valueOf(this.f11226d), 1), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C(int i) throws S {
        if (i >= 0) {
            H(i);
        } else {
            E(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D(int i, int i7) throws S {
        H((i << 3) | i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(long j) throws S {
        boolean z5 = f11223g;
        byte[] bArr = this.f11225c;
        if (z5 && F() >= 10) {
            while ((j & (-128)) != 0) {
                int i = this.f11227e;
                this.f11227e = i + 1;
                U0.e(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i7 = this.f11227e;
            this.f11227e = i7 + 1;
            U0.e(bArr, i7, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i8 = this.f11227e;
                this.f11227e = i8 + 1;
                bArr[i8] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e7) {
                throw new S(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11227e), Integer.valueOf(this.f11226d), 1), e7);
            }
        }
        int i9 = this.f11227e;
        this.f11227e = i9 + 1;
        bArr[i9] = (byte) j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int F() {
        return this.f11226d - this.f11227e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void H(int i) throws S {
        boolean z5 = f11223g;
        byte[] bArr = this.f11225c;
        if (!z5 || L.a() || F() < 5) {
            while ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) != 0) {
                try {
                    int i7 = this.f11227e;
                    this.f11227e = i7 + 1;
                    bArr[i7] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e7) {
                    throw new S(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11227e), Integer.valueOf(this.f11226d), 1), e7);
                }
            }
            int i8 = this.f11227e;
            this.f11227e = i8 + 1;
            bArr[i8] = (byte) i;
            return;
        }
        if ((i & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            int i9 = this.f11227e;
            this.f11227e = i9 + 1;
            U0.e(bArr, i9, (byte) i);
            return;
        }
        int i10 = this.f11227e;
        this.f11227e = i10 + 1;
        U0.e(bArr, i10, (byte) (i | 128));
        int i11 = i >>> 7;
        if ((i11 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            int i12 = this.f11227e;
            this.f11227e = i12 + 1;
            U0.e(bArr, i12, (byte) i11);
            return;
        }
        int i13 = this.f11227e;
        this.f11227e = i13 + 1;
        U0.e(bArr, i13, (byte) (i11 | 128));
        int i14 = i >>> 14;
        if ((i14 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            int i15 = this.f11227e;
            this.f11227e = i15 + 1;
            U0.e(bArr, i15, (byte) i14);
            return;
        }
        int i16 = this.f11227e;
        this.f11227e = i16 + 1;
        U0.e(bArr, i16, (byte) (i14 | 128));
        int i17 = i >>> 21;
        if ((i17 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) == 0) {
            int i18 = this.f11227e;
            this.f11227e = i18 + 1;
            U0.e(bArr, i18, (byte) i17);
        } else {
            int i19 = this.f11227e;
            this.f11227e = i19 + 1;
            U0.e(bArr, i19, (byte) (i17 | 128));
            int i20 = this.f11227e;
            this.f11227e = i20 + 1;
            U0.e(bArr, i20, (byte) (i >>> 28));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void K(long j) throws S {
        try {
            byte[] bArr = this.f11225c;
            int i = this.f11227e;
            int i7 = i + 1;
            this.f11227e = i7;
            bArr[i] = (byte) j;
            int i8 = i + 2;
            this.f11227e = i8;
            bArr[i7] = (byte) (j >> 8);
            int i9 = i + 3;
            this.f11227e = i9;
            bArr[i8] = (byte) (j >> 16);
            int i10 = i + 4;
            this.f11227e = i10;
            bArr[i9] = (byte) (j >> 24);
            int i11 = i + 5;
            this.f11227e = i11;
            bArr[i10] = (byte) (j >> 32);
            int i12 = i + 6;
            this.f11227e = i12;
            bArr[i11] = (byte) (j >> 40);
            int i13 = i + 7;
            this.f11227e = i13;
            bArr[i12] = (byte) (j >> 48);
            this.f11227e = i + 8;
            bArr[i13] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e7) {
            throw new S(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11227e), Integer.valueOf(this.f11226d), 1), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(byte[] bArr, int i, int i7) throws S {
        try {
            System.arraycopy(bArr, i, this.f11225c, this.f11227e, i7);
            this.f11227e += i7;
        } catch (IndexOutOfBoundsException e7) {
            throw new S(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11227e), Integer.valueOf(this.f11226d), Integer.valueOf(i7)), e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void M(int i) throws S {
        try {
            byte[] bArr = this.f11225c;
            int i7 = this.f11227e;
            int i8 = i7 + 1;
            this.f11227e = i8;
            bArr[i7] = (byte) i;
            int i9 = i7 + 2;
            this.f11227e = i9;
            bArr[i8] = (byte) (i >> 8);
            int i10 = i7 + 3;
            this.f11227e = i10;
            bArr[i9] = (byte) (i >> 16);
            this.f11227e = i7 + 4;
            bArr[i10] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e7) {
            throw new S(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f11227e), Integer.valueOf(this.f11226d), 1), e7);
        }
    }
}
