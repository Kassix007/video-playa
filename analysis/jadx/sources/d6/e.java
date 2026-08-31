package d6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f12317c = new e(n5.l.E0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f12318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l6.d f12319b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Set set, l6.d dVar) {
        this.f12318a = set;
        this.f12319b = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(String hostname, B5.a aVar) {
        kotlin.jvm.internal.m.e(hostname, "hostname");
        Iterator it = this.f12318a.iterator();
        if (it.hasNext()) {
            throw k1.i.h(it);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.m.a(eVar.f12318a, this.f12318a) && kotlin.jvm.internal.m.a(eVar.f12319b, this.f12319b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.f12318a.hashCode() + 1517) * 41;
        l6.d dVar = this.f12319b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
