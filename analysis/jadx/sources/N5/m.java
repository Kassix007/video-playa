package n5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends AbstractC0836n2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int c0(Iterable iterable, int i) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
