package c0;

/* JADX INFO: renamed from: c0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0725m {
    boolean a(B5.c cVar);

    Object b(Object obj, B5.e eVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default InterfaceC0725m d(InterfaceC0725m interfaceC0725m) {
        return interfaceC0725m == C0722j.f10095q ? this : new C0719g(this, interfaceC0725m);
    }
}
