package W0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(int i, int i7, int i8, int i9) {
        if (!((i8 >= 0) & (i7 >= i) & (i9 >= i8) & (i >= 0))) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i7, i8, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ long b(int i, int i7, int i8) {
        if ((i8 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return a(0, i, 0, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int c(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d(long j, long j7) {
        int i = (int) (j7 >> 32);
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i < iJ) {
            i = iJ;
        }
        if (i <= iH) {
            iH = i;
        }
        int i7 = (int) (j7 & 4294967295L);
        int i8 = a.i(j);
        int iG = a.g(j);
        if (i7 < i8) {
            i7 = i8;
        }
        if (i7 <= iG) {
            iG = i7;
        }
        return (((long) iH) << 32) | (((long) iG) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(int i, long j) {
        int i7 = a.i(j);
        int iG = a.g(j);
        if (i < i7) {
            i = i7;
        }
        return i > iG ? iG : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int f(int i, long j) {
        int iJ = a.j(j);
        int iH = a.h(j);
        if (i < iJ) {
            i = iJ;
        }
        return i > iH ? iH : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long g(int i, int i7, int i8, int i9) {
        int i10 = i9 == Integer.MAX_VALUE ? i8 : i9;
        int iC = c(i10);
        int i11 = i7 == Integer.MAX_VALUE ? i : i7;
        int iC2 = c(i11);
        if (iC + iC2 > 31) {
            i(i11, i10);
        }
        int i12 = i7 + 1;
        int i13 = i9 + 1;
        int i14 = iC2 - 13;
        return (((long) (i12 & (~(i12 >> 31)))) << 33) | ((long) ((i14 >> 1) + (i14 & 1))) | (((long) i) << 2) | (((long) i8) << (iC2 + 2)) | (((long) (i13 & (~(i13 >> 31)))) << (iC2 + 33));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long h(int i, int i7, long j) {
        int iJ = a.j(j) + i;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = a.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + i) < 0) {
            iH = 0;
        }
        int i8 = a.i(j) + i7;
        if (i8 < 0) {
            i8 = 0;
        }
        int iG = a.g(j);
        return a(iJ, iH, i8, (iG == Integer.MAX_VALUE || (iG = iG + i7) >= 0) ? iG : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(int i, int i7) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i7 + " in Constraints");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Void j(int i) {
        throw new IllegalArgumentException(S.m("Can't represent a size of ", " in Constraints", i));
    }
}
