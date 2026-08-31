package Q5;

import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class C implements InterfaceC1524c, s5.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1524c f6593q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1529h f6594r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C(InterfaceC1524c interfaceC1524c, InterfaceC1529h interfaceC1529h) {
        this.f6593q = interfaceC1524c;
        this.f6594r = interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.d
    public final s5.d getCallerFrame() {
        InterfaceC1524c interfaceC1524c = this.f6593q;
        if (interfaceC1524c instanceof s5.d) {
            return (s5.d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final InterfaceC1529h getContext() {
        return this.f6594r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1524c
    public final void resumeWith(Object obj) {
        this.f6593q.resumeWith(obj);
    }
}
