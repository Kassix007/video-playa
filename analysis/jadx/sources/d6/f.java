package d6;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String a7 = (String) obj;
        String b7 = (String) obj2;
        kotlin.jvm.internal.m.e(a7, "a");
        kotlin.jvm.internal.m.e(b7, "b");
        int iMin = Math.min(a7.length(), b7.length());
        for (int i = 4; i < iMin; i++) {
            char cCharAt = a7.charAt(i);
            char cCharAt2 = b7.charAt(i);
            if (cCharAt != cCharAt2) {
                return kotlin.jvm.internal.m.f(cCharAt, cCharAt2) < 0 ? -1 : 1;
            }
        }
        int length = a7.length();
        int length2 = b7.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
