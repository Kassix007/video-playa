package Y0;

import L0.m;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(int i, String str, List list) {
        m mVar = m.f3147r;
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 32) != 0) {
            mVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            i7++;
            if (i7 > 1) {
                sb.append((CharSequence) str);
            }
            if (mVar != null) {
                sb.append((CharSequence) mVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) String.valueOf(obj));
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
