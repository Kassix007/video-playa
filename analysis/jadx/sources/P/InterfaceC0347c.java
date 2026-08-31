package P;

/* JADX INFO: renamed from: P.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0347c {
    void c(int i, Object obj);

    void d(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void f() {
        Object objJ = j();
        InterfaceC0359i interfaceC0359i = objJ instanceof InterfaceC0359i ? (InterfaceC0359i) objJ : null;
        if (interfaceC0359i != null) {
            interfaceC0359i.e();
        }
    }

    void h(int i, Object obj);

    void i(int i, int i7, int i8);

    Object j();

    void k(int i, int i7);

    void o();
}
