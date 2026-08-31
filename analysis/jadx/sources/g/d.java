package G;

import B0.K;
import B0.n0;
import C.k;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import s5.i;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f1965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n0 f1966s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ K f1967t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f1968u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, n0 n0Var, K k7, k kVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1965r = eVar;
        this.f1966s = n0Var;
        this.f1967t = k7;
        this.f1968u = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        d dVar = new d(this.f1965r, this.f1966s, this.f1967t, this.f1968u, interfaceC1524c);
        dVar.f1964q = obj;
        return dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f1964q;
        n0 n0Var = this.f1966s;
        K k7 = this.f1967t;
        e eVar = this.f1965r;
        AbstractC0263y.t(interfaceC0261w, null, null, new b(eVar, n0Var, k7, null), 3);
        return AbstractC0263y.t(interfaceC0261w, null, null, new c(eVar, this.f1968u, null), 3);
    }
}
