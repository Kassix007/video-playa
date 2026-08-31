package androidx.work;

import androidx.work.Data;
import kotlin.jvm.internal.m;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class DataKt {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final <T> boolean hasKeyWithValueOfType(Data data, String key) {
        m.e(data, "<this>");
        m.e(key, "key");
        m.j();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Data workDataOf(C1371j... pairs) {
        m.e(pairs, "pairs");
        Data.Builder builder = new Data.Builder();
        for (C1371j c1371j : pairs) {
            builder.put((String) c1371j.f15080q, c1371j.f15081r);
        }
        return builder.build();
    }
}
