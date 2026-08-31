package Q5;

import M5.AbstractC0257s;
import P5.InterfaceC0397h;
import P5.InterfaceC0398i;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(InterfaceC0397h interfaceC0397h, AbstractC0257s abstractC0257s, int i, O5.a aVar, int i7) {
        super(interfaceC0397h, (i7 & 2) != 0 ? C1530i.f16022q : abstractC0257s, (i7 & 4) != 0 ? -3 : i, (i7 & 8) != 0 ? O5.a.f5206q : aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final g d(InterfaceC1529h interfaceC1529h, int i, O5.a aVar) {
        return new j(this.f6619t, interfaceC1529h, i, aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.g
    public final InterfaceC0397h e() {
        return this.f6619t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Q5.i
    public final Object g(InterfaceC0398i interfaceC0398i, InterfaceC1524c interfaceC1524c) {
        Object objCollect = this.f6619t.collect(interfaceC0398i, interfaceC1524c);
        return objCollect == EnumC1580a.f16356q ? objCollect : C1386y.f15098a;
    }
}
