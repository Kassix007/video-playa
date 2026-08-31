package U1;

import M5.InterfaceC0261w;
import P.W;
import java.util.List;
import java.util.Set;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W f7570q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f7571r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a0.q f7572s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(W w3, r rVar, a0.q qVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7570q = w3;
        this.f7571r = rVar;
        this.f7572s = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new p(this.f7570q, this.f7571r, this.f7572s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        pVar.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        for (T1.d dVar : (Set) this.f7570q.getValue()) {
            r rVar = this.f7571r;
            if (!((List) rVar.b().f7371e.f6338q.getValue()).contains(dVar) && !this.f7572s.contains(dVar)) {
                rVar.b().c(dVar);
            }
        }
        return C1386y.f15098a;
    }
}
