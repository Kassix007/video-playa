package c0;

/* JADX INFO: renamed from: c0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0723k extends InterfaceC0725m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.InterfaceC0725m
    default boolean a(B5.c cVar) {
        return ((Boolean) cVar.invoke(this)).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.InterfaceC0725m
    default Object b(Object obj, B5.e eVar) {
        return eVar.invoke(obj, this);
    }
}
