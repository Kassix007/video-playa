package d6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import q6.C1538g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f12302a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f12303b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12304c = new b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.f12322d.put(str, gVar);
        return gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(String str, int i, int i7, String str2, int i8) {
        int i9 = (i8 & 1) != 0 ? 0 : i;
        int length = (i8 & 2) != 0 ? str.length() : i7;
        boolean z5 = (i8 & 8) == 0;
        boolean z6 = (i8 & 16) == 0;
        boolean z7 = (i8 & 32) == 0;
        boolean z8 = (i8 & 64) == 0;
        kotlin.jvm.internal.m.e(str, "<this>");
        int iCharCount = i9;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i10 = 128;
            int i11 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z8) || J5.m.J0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !d(str, iCharCount, length)))) || (iCodePointAt == 43 && z7)))) {
                C1538g c1538g = new C1538g();
                c1538g.j0(str, i9, iCharCount);
                C1538g c1538g2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            c1538g.i0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i11 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i10 && !z8) || J5.m.J0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !d(str, iCharCount, length)))))) {
                            if (c1538g2 == null) {
                                c1538g2 = new C1538g();
                            }
                            c1538g2.k0(iCodePointAt2);
                            while (!c1538g2.e()) {
                                byte b7 = c1538g2.readByte();
                                c1538g.e0(37);
                                char[] cArr = n.j;
                                c1538g.e0(cArr[((b7 & 255) >> 4) & 15]);
                                c1538g.e0(cArr[b7 & 15]);
                            }
                        } else {
                            c1538g.k0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i10 = 128;
                    i11 = 32;
                }
                return c1538g.M();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i9, length);
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean d(String str, int i, int i7) {
        int i8 = i + 2;
        return i8 < i7 && str.charAt(i) == '%' && e6.b.o(str.charAt(i + 1)) != -1 && e6.b.o(str.charAt(i8)) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String e(String str, int i, int i7, int i8) {
        int i9;
        if ((i8 & 1) != 0) {
            i = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        boolean z5 = (i8 & 4) == 0;
        kotlin.jvm.internal.m.e(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i7) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z5)) {
                C1538g c1538g = new C1538g();
                c1538g.j0(str, i, iCharCount);
                while (iCharCount < i7) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i9 = iCharCount + 2) < i7) {
                        int iO = e6.b.o(str.charAt(iCharCount + 1));
                        int iO2 = e6.b.o(str.charAt(i9));
                        if (iO == -1 || iO2 == -1) {
                            c1538g.k0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c1538g.e0((iO << 4) + iO2);
                            iCharCount = Character.charCount(iCodePointAt) + i9;
                        }
                    } else if (iCodePointAt == 43 && z5) {
                        c1538g.e0(32);
                        iCharCount++;
                    } else {
                        c1538g.k0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c1538g.M();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i7);
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iR0 = J5.m.R0(str, '&', i, 4);
            if (iR0 == -1) {
                iR0 = str.length();
            }
            int iR02 = J5.m.R0(str, '=', i, 4);
            if (iR02 == -1 || iR02 > iR0) {
                String strSubstring = str.substring(i, iR0);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iR02);
                kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iR02 + 1, iR0);
                kotlin.jvm.internal.m.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iR0 + 1;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(List list, StringBuilder sb) {
        kotlin.jvm.internal.m.e(list, "<this>");
        G5.b bVarM = D5.a.M(D5.a.O(0, list.size()), 2);
        int i = bVarM.f2017q;
        int i7 = bVarM.f2018r;
        int i8 = bVarM.f2019s;
        if ((i8 <= 0 || i > i7) && (i8 >= 0 || i7 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i7) {
                return;
            } else {
                i += i8;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized g c(String javaName) {
        g gVar;
        String strConcat;
        try {
            kotlin.jvm.internal.m.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = g.f12322d;
            gVar = (g) linkedHashMap.get(javaName);
            if (gVar == null) {
                if (J5.t.G0(javaName, "TLS_", false)) {
                    String strSubstring = javaName.substring(4);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (J5.t.G0(javaName, "SSL_", false)) {
                    String strSubstring2 = javaName.substring(4);
                    kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = javaName;
                }
                gVar = (g) linkedHashMap.get(strConcat);
                if (gVar == null) {
                    gVar = new g(javaName);
                }
                linkedHashMap.put(javaName, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}
