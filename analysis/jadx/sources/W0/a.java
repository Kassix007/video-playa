package W0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8007a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [C0.A.onMeasure(int, int):void] */
    public /* synthetic */ a(long j) {
        this.f8007a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long a(int i, int i7, int i8, int i9, long j) {
        if ((i9 & 1) != 0) {
            i = j(j);
        }
        int iH = h(j);
        if ((i9 & 8) != 0) {
            i8 = g(j);
        }
        if (iH < i || i8 < i7 || i < 0 || i7 < 0) {
            h.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return b.g(i, iH, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean b(long j, long j7) {
        return j == j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(long j) {
        int i = (int) (3 & j);
        int i7 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j >> (i7 + 46))) & ((1 << (18 - i7)) - 1)) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean d(long j) {
        int i = (int) (3 & j);
        return (((int) (j >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean e(long j) {
        int i = (int) (3 & j);
        int i7 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i8 = (1 << (18 - i7)) - 1;
        int i9 = ((int) (j >> (i7 + 15))) & i8;
        int i10 = ((int) (j >> (i7 + 46))) & i8;
        return i9 == (i10 == 0 ? Integer.MAX_VALUE : i10 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean f(long j) {
        int i = (int) (3 & j);
        int i7 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i8 = ((int) (j >> 2)) & i7;
        int i9 = ((int) (j >> 33)) & i7;
        return i8 == (i9 == 0 ? Integer.MAX_VALUE : i9 - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int g(long j) {
        int i = (int) (3 & j);
        int i7 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i8 = ((int) (j >> (i7 + 46))) & ((1 << (18 - i7)) - 1);
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int h(long j) {
        int i = (int) (3 & j);
        int i7 = (int) (j >> 33);
        int i8 = i7 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i8 == 0) {
            return Integer.MAX_VALUE;
        }
        return i8 - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int i(long j) {
        int i = (int) (3 & j);
        int i7 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j >> (i7 + 15))) & ((1 << (18 - i7)) - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int j(long j) {
        int i = (int) (3 & j);
        return ((int) (j >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean k(long j) {
        int i = (int) (3 & j);
        int i7 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j >> 33)) & ((1 << (i7 + 13)) - 1)) - 1 == 0) | ((((int) (j >> (i7 + 46))) & ((1 << (18 - i7)) - 1)) - 1 == 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String l(long j) {
        int iH = h(j);
        String strValueOf = iH == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iH);
        int iG = g(j);
        String strValueOf2 = iG != Integer.MAX_VALUE ? String.valueOf(iG) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(j(j));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(i(j));
        sb.append(", maxHeight = ");
        return S.p(sb, strValueOf2, ')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f8007a == ((a) obj).f8007a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f8007a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return l(this.f8007a);
    }
}
