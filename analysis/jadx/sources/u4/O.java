package U4;

import M5.InterfaceC0261w;
import R4.C0468k1;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class O extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7754q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ P.W f7755r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ P.W f7756s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C0468k1 c0468k1, P.W w3, P.W w6, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7754q = c0468k1;
        this.f7755r = w3;
        this.f7756s = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new O(this.f7754q, this.f7755r, this.f7756s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        O o6 = (O) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        o6.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        this.f7756s.setValue(new W0.f(AbstractC0534a.z(((Number) this.f7755r.getValue()).intValue() - (r0.f7098t.f13883q.e() * 1.8f), this.f7754q.f7071c)));
        return C1386y.f15098a;
    }
}
