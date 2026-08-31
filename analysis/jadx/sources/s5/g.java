package s5;

import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(InterfaceC1524c interfaceC1524c) {
        super(interfaceC1524c);
        if (interfaceC1524c != null && interfaceC1524c.getContext() != C1530i.f16022q) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return C1530i.f16022q;
    }
}
