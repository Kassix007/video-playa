package K5;

import J5.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final long f2965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f2966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f2967t = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f2968q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = b.f2969a;
        f2965r = f.d(4611686018427387903L);
        f2966s = f.d(-4611686018427387903L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(long j, long j7) {
        long j8 = 1000000;
        long j9 = j7 / j8;
        long j10 = j + j9;
        if (-4611686018426L > j10 || j10 >= 4611686018427L) {
            return f.d(D5.a.r(j10, -4611686018427387903L, 4611686018427387903L));
        }
        long j11 = ((j10 * j8) + (j7 - (j9 * j8))) << 1;
        int i = b.f2969a;
        return j11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(StringBuilder sb, int i, int i7, int i8, String str, boolean z5) {
        sb.append(i);
        if (i7 != 0) {
            sb.append('.');
            String strY0 = m.Y0(i8, String.valueOf(i7));
            int i9 = -1;
            int length = strY0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (strY0.charAt(length) != '0') {
                        i9 = length;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            }
            int i11 = i9 + 1;
            if (z5 || i11 >= 3) {
                sb.append((CharSequence) strY0, 0, ((i9 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strY0, 0, i11);
            }
        }
        sb.append(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean c(long j) {
        return j == f2965r || j == f2966s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d(long j, long j7) {
        if (c(j)) {
            if (!c(j7) || (j7 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (c(j7)) {
            return j7;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j7) & 1)) {
            return i == 1 ? a(j >> 1, j7 >> 1) : a(j7 >> 1, j >> 1);
        }
        long j8 = (j >> 1) + (j7 >> 1);
        if (i != 0) {
            return f.e(j8);
        }
        if (-4611686018426999999L > j8 || j8 >= 4611686018427000000L) {
            return f.d(j8 / ((long) 1000000));
        }
        long j9 = j8 << 1;
        int i7 = b.f2969a;
        return j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long e(long j, c unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        if (j == f2965r) {
            return Long.MAX_VALUE;
        }
        if (j == f2966s) {
            return Long.MIN_VALUE;
        }
        return f.c(j >> 1, (((int) j) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, unit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long f(long j) {
        long j7 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = b.f2969a;
        return j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((a) obj).f2968q;
        long j7 = this.f2968q;
        long j8 = j7 ^ j;
        if (j8 >= 0 && (((int) j8) & 1) != 0) {
            int i = (((int) j7) & 1) - (((int) j) & 1);
            return j7 < 0 ? -i : i;
        }
        if (j7 < j) {
            return -1;
        }
        return j7 == j ? 0 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f2968q == ((a) obj).f2968q;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f2968q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        long j;
        int iE;
        int i;
        long jF = this.f2968q;
        if (jF == 0) {
            return "0s";
        }
        if (jF == f2965r) {
            return "Infinity";
        }
        if (jF == f2966s) {
            return "-Infinity";
        }
        int i7 = 0;
        boolean z5 = jF < 0;
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append('-');
        }
        if (jF < 0) {
            jF = f(jF);
        }
        long jE = e(jF, c.DAYS);
        int iE2 = c(jF) ? 0 : (int) (e(jF, c.HOURS) % ((long) 24));
        if (c(jF)) {
            j = 0;
            iE = 0;
        } else {
            j = 0;
            iE = (int) (e(jF, c.MINUTES) % ((long) 60));
        }
        int iE3 = c(jF) ? 0 : (int) (e(jF, c.SECONDS) % ((long) 60));
        if (c(jF)) {
            i = 0;
        } else {
            i = (int) ((((int) jF) & 1) == 1 ? ((jF >> 1) % ((long) 1000)) * ((long) 1000000) : (jF >> 1) % ((long) 1000000000));
        }
        boolean z6 = jE != j;
        boolean z7 = iE2 != 0;
        boolean z8 = iE != 0;
        boolean z9 = (iE3 == 0 && i == 0) ? false : true;
        if (z6) {
            sb.append(jE);
            sb.append('d');
            i7 = 1;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i8 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iE2);
            sb.append('h');
            i7 = i8;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i9 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            sb.append(iE);
            sb.append('m');
            i7 = i9;
        }
        if (z9) {
            int i10 = i7 + 1;
            if (i7 > 0) {
                sb.append(' ');
            }
            if (iE3 != 0 || z6 || z7 || z8) {
                b(sb, iE3, i, 9, "s", false);
            } else if (i >= 1000000) {
                b(sb, i / 1000000, i % 1000000, 6, "ms", false);
            } else if (i >= 1000) {
                b(sb, i / 1000, i % 1000, 3, "us", false);
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i7 = i10;
        }
        if (z5 && i7 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
