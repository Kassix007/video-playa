package b6;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f10043a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + b(i >> 12) + b(i >> 8) + b(i >> 4) + b(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f10043a = strArr;
        byte[] bArr = new byte[93];
        for (int i7 = 0; i7 < 32; i7++) {
            bArr[i7] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(StringBuilder sb, String value) {
        m.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = value.charAt(i7);
            String[] strArr = f10043a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) value, i, i7);
                sb.append(strArr[cCharAt]);
                i = i7 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) value, i, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final char b(int i) {
        int i7 = i & 15;
        return (char) (i7 < 10 ? i7 + 48 : i7 + 87);
    }
}
