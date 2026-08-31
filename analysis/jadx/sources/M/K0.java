package M;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import v0.InterfaceC1746o;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends s5.i implements B5.e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new K0(2, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        K0 k02 = (K0) create((InterfaceC1746o) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        k02.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        return C1386y.f15098a;
    }
}
