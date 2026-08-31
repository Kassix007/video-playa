package P5;

import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class D implements P, InterfaceC0397h, Q5.v {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ S f6338q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(S s6) {
        this.f6338q = s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.v
    public final InterfaceC0397h a(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return ((((i < 0 || i >= 2) && i != -2) || aVar != O5.a.f5207r) && !((i == 0 || i == -3) && aVar == O5.a.f5206q)) ? new Q5.j(this, interfaceC1529h, i, aVar) : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.InterfaceC0397h
    public final Object collect(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        this.f6338q.collect(interfaceC0398i, interfaceC1524c);
        return EnumC1580a.f16356q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P5.P
    public final Object getValue() {
        return this.f6338q.getValue();
    }
}
