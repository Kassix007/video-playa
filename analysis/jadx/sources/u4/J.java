package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import R4.L0;
import R4.X1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class J extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7745r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(C0468k1 c0468k1, P.W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7744q = c0468k1;
        this.f7745r = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new J(this.f7744q, this.f7745r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        J j = (J) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        j.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        C0468k1 c0468k1 = this.f7744q;
        X1 x12 = c0468k1.f7057Q;
        P.W w3 = this.f7745r;
        if (x12 != null) {
            x12.setEnabled(((Boolean) w3.getValue()).booleanValue());
        }
        boolean zBooleanValue = ((Boolean) w3.getValue()).booleanValue();
        X1 x13 = c0468k1.f7057Q;
        if (zBooleanValue) {
            if (x13 != null) {
                x13.setEnabled(true);
                x13.setOnRefreshListener(null);
                x13.setOnRefreshListener(new E(c0468k1, x13));
                x13.setCanChildScrollUpCallback(new k3.c(c0468k1));
            }
        } else if (x13 != null) {
            x13.setEnabled(false);
            x13.setOnRefreshListener(new L0(2, x13));
        }
        return C1386y.f15098a;
    }
}
