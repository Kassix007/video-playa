package u;

/* JADX INFO: loaded from: classes.dex */
public interface q0 {
    Object a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default boolean b(t.t tVar, t.t tVar2) {
        return tVar.equals(a()) && tVar2.equals(c());
    }

    Object c();
}
