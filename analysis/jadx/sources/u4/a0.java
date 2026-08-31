package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7793q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7794r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7795s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(C0468k1 c0468k1, P.W w3, P.W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7793q = c0468k1;
        this.f7794r = w3;
        this.f7795s = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new a0(this.f7793q, this.f7794r, this.f7795s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        a0 a0Var = (a0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        a0Var.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        this.f7793q.getClass();
        return C1386y.f15098a;
    }
}
