package H2;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D2.c f2135a = new D2.c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean a(D2.j jVar) {
        E2.d dVar = jVar.f;
        F2.b bVar = jVar.f1398c;
        E2.i iVar = jVar.f1415w;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C2.e();
            }
            if ((jVar.f1418z.f1373a != null || !(iVar instanceof E2.c)) && (!(bVar instanceof F2.a) || !(iVar instanceof E2.f) || ((F2.a) bVar).f1946r != ((E2.f) iVar).f1683q)) {
                return false;
            }
        }
        return true;
    }
}
