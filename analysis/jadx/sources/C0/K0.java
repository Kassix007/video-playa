package C0;

import P.C0346b0;
import c0.InterfaceC0728p;
import q5.InterfaceC1527f;
import q5.InterfaceC1528g;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements InterfaceC0728p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0346b0 f886q = new C0346b0(1.0f);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.InterfaceC0728p
    public final float K() {
        return this.f886q.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final Object fold(Object obj, B5.e eVar) {
        return eVar.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1527f get(InterfaceC1528g interfaceC1528g) {
        return E3.h.A(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h minusKey(InterfaceC1528g interfaceC1528g) {
        return E3.h.I(this, interfaceC1528g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q5.InterfaceC1529h
    public final InterfaceC1529h plus(InterfaceC1529h interfaceC1529h) {
        return E3.h.L(this, interfaceC1529h);
    }
}
