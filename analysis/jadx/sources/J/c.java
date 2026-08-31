package J;

import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f2461b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String str;
        int i = 1;
        int length = "H".length();
        if (length == 0) {
            str = "";
        } else if (length != 1) {
            StringBuilder sb = new StringBuilder("H".length() * 10);
            while (true) {
                sb.append((CharSequence) "H");
                if (i == 10) {
                    break;
                } else {
                    i++;
                }
            }
            str = sb.toString();
            m.b(str);
        } else {
            char cCharAt = "H".charAt(0);
            char[] cArr = new char[10];
            for (int i7 = 0; i7 < 10; i7++) {
                cArr[i7] = cCharAt;
            }
            str = new String(cArr);
        }
        f2460a = str;
        f2461b = str + '\n' + str;
    }
}
