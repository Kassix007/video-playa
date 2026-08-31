package Z5;

/* JADX INFO: renamed from: Z5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0572a implements V5.a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // V5.a
    public Object c(Y5.b bVar) {
        return f(bVar);
    }

    public abstract Object d();

    public abstract int e(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f(Y5.b bVar) {
        Object objD = d();
        int iE = e(objD);
        Y5.a aVarA = bVar.a(b());
        while (true) {
            int iJ = aVarA.j(b());
            if (iJ == -1) {
                aVarA.l(b());
                return i(objD);
            }
            g(aVarA, iJ + iE, objD);
        }
    }

    public abstract void g(Y5.a aVar, int i, Object obj);

    public abstract Object h(Object obj);

    public abstract Object i(Object obj);
}
