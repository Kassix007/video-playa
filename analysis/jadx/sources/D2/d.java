package D2;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E2.i f1373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E2.g f1374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E2.d f1375c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(E2.i iVar, E2.g gVar, E2.d dVar) {
        this.f1373a = iVar;
        this.f1374b = gVar;
        this.f1375c = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return kotlin.jvm.internal.m.a(this.f1373a, dVar.f1373a) && this.f1374b == dVar.f1374b && this.f1375c == dVar.f1375c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        E2.i iVar = this.f1373a;
        int iHashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        E2.g gVar = this.f1374b;
        int iHashCode2 = (iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 887503681;
        E2.d dVar = this.f1375c;
        return (iHashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 887503681;
    }
}
