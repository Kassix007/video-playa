package K5;

import J5.m;
import J5.t;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2982a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f2983b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f2984c = {3, 6};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f2985d = {1, 2, 4, 5, 7, 8};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long a(String str) {
        c cVar;
        long jE;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = a.f2967t;
        char cCharAt2 = str.charAt(0);
        int i7 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z5 = i7 > 0 && m.f1(str, '-');
        if (length <= i7) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i7) != 'P') {
            throw new IllegalArgumentException();
        }
        int i8 = i7 + 1;
        if (i8 == length) {
            throw new IllegalArgumentException();
        }
        c cVar2 = null;
        long jD = 0;
        boolean z6 = false;
        while (i8 < length) {
            if (str.charAt(i8) != 'T') {
                int i9 = i8;
                while (i9 < str.length() && (('0' <= (cCharAt = str.charAt(i9)) && cCharAt < ':') || m.J0("+-.", cCharAt))) {
                    i9++;
                }
                String strSubstring = str.substring(i8, i9);
                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i8;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i10 = length2 + 1;
                if (z6) {
                    if (cCharAt3 == 'H') {
                        cVar = c.HOURS;
                    } else if (cCharAt3 == 'M') {
                        cVar = c.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        cVar = c.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    cVar = c.DAYS;
                }
                if (cVar2 != null && cVar2.compareTo(cVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iR0 = m.R0(strSubstring, '.', 0, 6);
                if (cVar != c.SECONDS || iR0 <= 0) {
                    jD = a.d(jD, k(j(strSubstring), cVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iR0);
                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                    long jD2 = a.d(jD, k(j(strSubstring2), cVar));
                    String strSubstring3 = strSubstring.substring(iR0);
                    kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
                    double d5 = Double.parseDouble(strSubstring3);
                    double dB = b(d5, cVar, c.NANOSECONDS);
                    if (Double.isNaN(dB)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long jH = D5.a.H(dB);
                    if (-4611686018426999999L > jH || jH >= 4611686018427000000L) {
                        jE = e(D5.a.H(b(d5, cVar, c.MILLISECONDS)));
                    } else {
                        jE = jH << 1;
                        int i11 = a.f2967t;
                        int i12 = b.f2969a;
                    }
                    jD = a.d(jD2, jE);
                }
                cVar2 = cVar;
                i8 = i10;
            } else {
                if (z6 || (i8 = i8 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z6 = true;
            }
        }
        return z5 ? a.f(jD) : jD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final double b(double d5, c cVar, c targetUnit) {
        kotlin.jvm.internal.m.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.f2977q.convert(1L, cVar.f2977q);
        return jConvert > 0 ? d5 * jConvert : d5 / r8.convert(1L, r9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(long j, c sourceUnit, c targetUnit) {
        kotlin.jvm.internal.m.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.m.e(targetUnit, "targetUnit");
        return targetUnit.f2977q.convert(j, sourceUnit.f2977q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long d(long j) {
        long j7 = (j << 1) + 1;
        int i = a.f2967t;
        int i7 = b.f2969a;
        return j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long e(long j) {
        if (-4611686018426L > j || j >= 4611686018427L) {
            return d(D5.a.r(j, -4611686018427387903L, 4611686018427387903L));
        }
        long j7 = (j * ((long) 1000000)) << 1;
        int i = a.f2967t;
        int i7 = b.f2969a;
        return j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final g g(String str, String str2, int i, B5.c cVar) {
        char cCharAt = str.charAt(i);
        if (((Boolean) cVar.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return h(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final g h(String str, String str2) {
        return new g(str2 + " when parsing an Instant from \"" + l(64, str) + '\"', str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int i(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long j(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !m.J0("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i7 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i7 == i) {
                            i7++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i7 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!t.G0(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(m.L0(1, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long k(long j, c unit) {
        kotlin.jvm.internal.m.e(unit, "unit");
        c sourceUnit = c.NANOSECONDS;
        kotlin.jvm.internal.m.e(sourceUnit, "sourceUnit");
        TimeUnit timeUnit = unit.f2977q;
        TimeUnit timeUnit2 = sourceUnit.f2977q;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) > j || j > jConvert) {
            return d(D5.a.r(c(j, unit, c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
        }
        long jConvert2 = timeUnit2.convert(j, timeUnit) << 1;
        int i = a.f2967t;
        int i7 = b.f2969a;
        return jConvert2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String l(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }
}
