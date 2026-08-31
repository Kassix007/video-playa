package androidx.work;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes.dex */
public final class Data$toString$1$content$1 extends n implements B5.c {
    public static final Data$toString$1$content$1 INSTANCE = new Data$toString$1$content$1();

    public Data$toString$1$content$1() {
        super(1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // B5.c
    public final CharSequence invoke(Map.Entry<String, ? extends Object> entry) {
        m.e(entry, "<name for destructuring parameter 0>");
        String key = entry.getKey();
        Object value = entry.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(key);
        sb.append(" : ");
        if (value instanceof Object[]) {
            value = Arrays.toString((Object[]) value);
            m.d(value, "toString(this)");
        }
        sb.append(value);
        return sb.toString();
    }
}
