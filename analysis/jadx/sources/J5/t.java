package J5;

import com.google.android.gms.internal.measurement.I1;

/* JADX INFO: loaded from: classes.dex */
public abstract class t extends s {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean A0(String str, String suffix, boolean z5) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(suffix, "suffix");
        return !z5 ? str.endsWith(suffix) : D0(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean B0(String str, String str2, boolean z5) {
        return str == null ? str2 == null : !z5 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void C0(String str) {
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean D0(int i, int i7, int i8, String str, String other, boolean z5) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return !z5 ? str.regionMatches(i, other, i7, i8) : str.regionMatches(z5, i, other, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String E0(String str, String oldValue, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(oldValue, "oldValue");
        int iP0 = m.P0(str, oldValue, 0, false);
        if (iP0 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i = length >= 1 ? length : 1;
        int length2 = str2.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i7 = 0;
        do {
            sb.append((CharSequence) str, i7, iP0);
            sb.append(str2);
            i7 = iP0 + length;
            if (iP0 >= str.length()) {
                break;
            }
            iP0 = m.P0(str, oldValue, iP0 + i, false);
        } while (iP0 > 0);
        sb.append((CharSequence) str, i7, str.length());
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean F0(String str, String str2, int i, boolean z5) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return !z5 ? str.startsWith(str2, i) : D0(i, 0, str2.length(), str, str2, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean G0(String str, String prefix, boolean z5) {
        kotlin.jvm.internal.m.e(str, "<this>");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        return !z5 ? str.startsWith(prefix) : D0(0, 0, prefix.length(), str, prefix, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Integer H0(String str) {
        boolean z5;
        int i;
        int i7;
        kotlin.jvm.internal.m.e(str, "<this>");
        I1.M(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i8 = 0;
        char cCharAt = str.charAt(0);
        int i9 = -2147483647;
        if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i9 = Integer.MIN_VALUE;
                z5 = true;
            }
        } else {
            z5 = false;
            i = 0;
        }
        int i10 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i8 < i10 && (i10 != -59652323 || i8 < (i10 = i9 / 10))) || (i7 = i8 * 10) < i9 + iDigit) {
                return null;
            }
            i8 = i7 - iDigit;
            i++;
        }
        return z5 ? Integer.valueOf(i8) : Integer.valueOf(-i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Long I0(String str) {
        boolean z5;
        kotlin.jvm.internal.m.e(str, "<this>");
        I1.M(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0) {
            z5 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z5 = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z5 = false;
        }
        long j7 = 0;
        long j8 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j7 < j8) {
                if (j8 != -256204778801521550L) {
                    return null;
                }
                j8 = j / ((long) 10);
                if (j7 < j8) {
                    return null;
                }
            }
            long j9 = j7 * ((long) 10);
            long j10 = iDigit;
            if (j9 < j + j10) {
                return null;
            }
            j7 = j9 - j10;
            i++;
        }
        return z5 ? Long.valueOf(j7) : Long.valueOf(-j7);
    }
}
