package J5;

import C0.S;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.I1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends t {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean J0(CharSequence charSequence, char c7) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return R0(charSequence, c7, 0, 2) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean K0(CharSequence charSequence, String other) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        return S0(charSequence, other, 0, 2) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String L0(int i, String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(S.m("Requested character count ", " is less than zero.", i).toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(i);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean M0(CharSequence charSequence, char c7) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() > 0 && I1.U(charSequence.charAt(O0(charSequence)), c7, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean N0(CharSequence charSequence, String str) {
        return charSequence instanceof String ? t.A0((String) charSequence, str, false) : Z0(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int O0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int P0(CharSequence charSequence, String string, int i, boolean z5) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return (z5 || !(charSequence instanceof String)) ? Q0(charSequence, string, i, charSequence.length(), z5, false) : ((String) charSequence).indexOf(string, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int Q0(CharSequence charSequence, CharSequence charSequence2, int i, int i7, boolean z5, boolean z6) {
        G5.b bVar;
        if (z6) {
            int iO0 = O0(charSequence);
            if (i > iO0) {
                i = iO0;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            bVar = new G5.b(i, i7, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i7 > length) {
                i7 = length;
            }
            bVar = new G5.d(i, i7, 1);
        }
        boolean z7 = charSequence instanceof String;
        int i8 = bVar.f2019s;
        int i9 = bVar.f2018r;
        int i10 = bVar.f2017q;
        if (!z7 || !(charSequence2 instanceof String)) {
            boolean z8 = z5;
            if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z9 = z8;
                    z8 = z9;
                    if (!Z0(charSequence4, 0, charSequence3, i10, charSequence2.length(), z9)) {
                        if (i10 == i9) {
                            break;
                        }
                        i10 += i8;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i10;
                    }
                }
            }
        } else if ((i8 > 0 && i10 <= i9) || (i8 < 0 && i9 <= i10)) {
            int i11 = i10;
            while (true) {
                String str = (String) charSequence2;
                boolean z10 = z5;
                if (!t.D0(0, i11, str.length(), str, (String) charSequence, z10)) {
                    if (i11 == i9) {
                        break;
                    }
                    i11 += i8;
                    z5 = z10;
                } else {
                    return i11;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int R0(CharSequence charSequence, char c7, int i, int i7) {
        if ((i7 & 2) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? T0(charSequence, new char[]{c7}, i, false) : ((String) charSequence).indexOf(c7, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ int S0(CharSequence charSequence, String str, int i, int i7) {
        if ((i7 & 2) != 0) {
            i = 0;
        }
        return P0(charSequence, str, i, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int T0(CharSequence charSequence, char[] cArr, int i, boolean z5) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(n5.k.Q0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iO0 = O0(charSequence);
        if (i > iO0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c7 : cArr) {
                if (I1.U(c7, cCharAt, z5)) {
                    return i;
                }
            }
            if (i == iO0) {
                return -1;
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean U0(CharSequence charSequence) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!I1.v0(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static char V0(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            return charSequence.charAt(O0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int W0(int i, CharSequence charSequence, String string) {
        int iO0 = (i & 2) != 0 ? O0(charSequence) : 0;
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(string, "string");
        return !(charSequence instanceof String) ? Q0(charSequence, string, iO0, 0, false, true) : ((String) charSequence).lastIndexOf(string, iO0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int X0(CharSequence charSequence, char c7, int i, int i7) {
        if ((i7 & 2) != 0) {
            i = O0(charSequence);
        }
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c7, i);
        }
        char[] cArr = {c7};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(n5.k.Q0(cArr), i);
        }
        int iO0 = O0(charSequence);
        if (i > iO0) {
            i = iO0;
        }
        while (-1 < i) {
            if (I1.U(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String Y0(int i, String str) {
        CharSequence charSequenceSubSequence;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(S.m("Desired length ", " is less than zero.", i));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(i);
            int length = i - str.length();
            int i7 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i7 == length) {
                        break;
                    }
                    i7++;
                }
            }
            sb.append((CharSequence) str);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean Z0(CharSequence charSequence, int i, CharSequence other, int i7, int i8, boolean z5) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        if (i7 < 0 || i < 0 || i > charSequence.length() - i8 || i7 > other.length() - i8) {
            return false;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            if (!I1.U(charSequence.charAt(i + i9), other.charAt(i7 + i9), z5)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a1(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (!t.G0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b1(String str, String str2) {
        if (!N0(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List c1(CharSequence charSequence, String str) {
        int iP0 = P0(charSequence, str, 0, false);
        if (iP0 == -1) {
            return AbstractC0836n2.z(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iP0).toString());
            length = str.length() + iP0;
            iP0 = P0(charSequence, str, length, false);
        } while (iP0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List d1(CharSequence charSequence, String[] strArr) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return c1(charSequence, str);
            }
        }
        I5.o oVar = new I5.o(0, new I5.g(charSequence, new u(0, n5.k.x0(strArr))));
        ArrayList arrayList = new ArrayList(n5.m.c0(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            G5.d range = (G5.d) bVar.next();
            kotlin.jvm.internal.m.e(range, "range");
            arrayList.add(charSequence.subSequence(range.f2017q, range.f2018r + 1).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List e1(String str, char[] cArr) {
        kotlin.jvm.internal.m.e(str, "<this>");
        if (cArr.length == 1) {
            return c1(str, String.valueOf(cArr[0]));
        }
        I5.o oVar = new I5.o(0, new I5.g(str, new u(1, cArr)));
        ArrayList arrayList = new ArrayList(n5.m.c0(oVar, 10));
        Iterator it = oVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            G5.d range = (G5.d) bVar.next();
            kotlin.jvm.internal.m.e(range, "range");
            arrayList.add(str.subSequence(range.f2017q, range.f2018r + 1).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean f1(String str, char c7) {
        return str.length() > 0 && I1.U(str.charAt(0), c7, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g1(char c7, String str, String str2) {
        int iR0 = R0(str, c7, 0, 6);
        if (iR0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iR0 + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String h1(String missingDelimiterValue, String delimiter) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(delimiter, "delimiter");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iS0 = S0(missingDelimiterValue, delimiter, 0, 6);
        if (iS0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(delimiter.length() + iS0, missingDelimiterValue.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String i1(char c7, String str, String str2) {
        int iX0 = X0(str, c7, 0, 6);
        if (iX0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iX0 + 1, str.length());
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String j1(String missingDelimiterValue, char c7) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iR0 = R0(missingDelimiterValue, c7, 0, 6);
        if (iR0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iR0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String k1(String missingDelimiterValue, String str) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iS0 = S0(missingDelimiterValue, str, 0, 6);
        if (iS0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iS0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String l1(String missingDelimiterValue, char c7) {
        kotlin.jvm.internal.m.e(missingDelimiterValue, "<this>");
        kotlin.jvm.internal.m.e(missingDelimiterValue, "missingDelimiterValue");
        int iX0 = X0(missingDelimiterValue, c7, 0, 6);
        if (iX0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(0, iX0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String m1(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(S.m("Requested character count ", " is less than zero.", i).toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static CharSequence n1(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z5 = false;
        while (i <= length) {
            boolean zV0 = I1.v0(str.charAt(!z5 ? i : length));
            if (z5) {
                if (!zV0) {
                    break;
                }
                length--;
            } else if (zV0) {
                i++;
            } else {
                z5 = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
