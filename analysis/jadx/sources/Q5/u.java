package Q5;

import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class u implements InterfaceC1529h {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1529h f6659q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Throwable f6660r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(Throwable th, InterfaceC1529h interfaceC1529h) {
        this.f6659q = interfaceC1529h;
        this.f6660r = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        return this.f6659q.fold(obj, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g interfaceC1528g) {
        return this.f6659q.get(interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g interfaceC1528g) {
        return this.f6659q.minusKey(interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h interfaceC1529h) {
        return this.f6659q.plus(interfaceC1529h);
    }
}
