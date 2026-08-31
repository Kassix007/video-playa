package D2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m5.C1371j;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterable, C5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f1434r = new p(n5.t.f15300q);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f1435q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(Map map) {
        this.f1435q = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return kotlin.jvm.internal.m.a(this.f1435q, ((p) obj).f1435q);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1435q.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f1435q;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                throw new ClassCastException();
            }
            arrayList.add(new C1371j(str, null));
        }
        return arrayList.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Parameters(entries=" + this.f1435q + ')';
    }
}
