package J5;

import com.google.android.gms.internal.measurement.K1;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f2816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f2817b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            iArr[i7] = "0123456789abcdef".charAt(i7 & 15) | ("0123456789abcdef".charAt(i7 >> 4) << '\b');
        }
        f2816a = iArr;
        int[] iArr2 = new int[256];
        for (int i8 = 0; i8 < 256; i8++) {
            iArr2[i8] = "0123456789ABCDEF".charAt(i8 & 15) | ("0123456789ABCDEF".charAt(i8 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i9 = 0; i9 < 256; i9++) {
            iArr3[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i12)] = i13;
            i12++;
            i13++;
        }
        long[] jArr = new long[256];
        for (int i14 = 0; i14 < 256; i14++) {
            jArr[i14] = -1;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i15)] = i16;
            i15++;
            i16++;
        }
        int i17 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i17;
            i++;
            i17++;
        }
        f2817b = jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(String str, int i, int i7) {
        int i8 = i7 - i;
        if (i8 < 1) {
            String strSubstring = str.substring(i, i7);
            kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + i8);
        }
        if (i8 > 16) {
            int i9 = (i8 + i) - 16;
            while (i < i9) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbL = k1.i.l("Expected the hexadecimal digit '0' at index ", ", but was '", i);
                    sbL.append(str.charAt(i));
                    sbL.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbL.toString());
                }
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long b(String str, int i, int i7) {
        f format = f.f2821d;
        kotlin.jvm.internal.m.e(format, "format");
        K1.i(i, i7, str.length());
        if (format.f2824c.f2820a) {
            a(str, i, i7);
            return c(str, i, i7);
        }
        if (i7 - i > 0) {
            a(str, i, i7);
            return c(str, i, i7);
        }
        String strSubstring = str.substring(i, i7);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final long c(String str, int i, int i7) {
        long j = 0;
        while (i < i7) {
            long j7 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j8 = f2817b[cCharAt];
                if (j8 >= 0) {
                    j = j7 | j8;
                    i++;
                }
            }
            StringBuilder sbL = k1.i.l("Expected a hexadecimal digit at index ", ", but was ", i);
            sbL.append(str.charAt(i));
            throw new NumberFormatException(sbL.toString());
        }
        return j;
    }
}
