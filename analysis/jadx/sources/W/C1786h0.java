package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: w.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1786h0 extends s5.i implements B5.e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1786h0(2, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C1786h0 c1786h0 = (C1786h0) create((InterfaceC1788i0) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c1786h0.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        return C1386y.f15098a;
    }
}
