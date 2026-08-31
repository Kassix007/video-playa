package J5;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G5.d f2831b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(String str, G5.d dVar) {
        this.f2830a = str;
        this.f2831b = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.m.a(this.f2830a, hVar.f2830a) && kotlin.jvm.internal.m.a(this.f2831b, hVar.f2831b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2831b.hashCode() + (this.f2830a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MatchGroup(value=" + this.f2830a + ", range=" + this.f2831b + ')';
    }
}
