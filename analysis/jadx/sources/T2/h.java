package t2;

import M5.AbstractC0263y;
import M5.B;
import M5.H;
import M5.InterfaceC0261w;
import R5.n;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D2.j f16695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l f16696t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(D2.j jVar, InterfaceC1524c interfaceC1524c, l lVar) {
        super(2, interfaceC1524c);
        this.f16695s = jVar;
        this.f16696t = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        h hVar = new h(this.f16695s, interfaceC1524c, this.f16696t);
        hVar.f16694r = obj;
        return hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f16693q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f16694r;
        T5.e eVar = H.f3811a;
        N5.f fVar = n.f7261a.f4044t;
        l lVar = this.f16696t;
        D2.j jVar = this.f16695s;
        B bD = AbstractC0263y.d(interfaceC0261w, fVar, new g(jVar, null, lVar), 2);
        H2.f.c(((F2.a) jVar.f1398c).f1946r).a();
        this.f16693q = 1;
        Object objR = bD.r(this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objR == enumC1580a ? enumC1580a : objR;
    }
}
