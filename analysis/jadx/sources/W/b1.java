package w;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;

/* JADX INFO: loaded from: classes.dex */
public final class b1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1746o f17927s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.f f17928t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B5.c f17929u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B5.c f17930v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(InterfaceC1746o interfaceC1746o, B5.f fVar, B5.c cVar, B5.c cVar2, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17927s = interfaceC1746o;
        this.f17928t = fVar;
        this.f17929u = cVar;
        this.f17930v = cVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        b1 b1Var = new b1(this.f17927s, this.f17928t, this.f17929u, this.f17930v, interfaceC1524c);
        b1Var.f17926r = obj;
        return b1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17925q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f17926r;
            InterfaceC1746o interfaceC1746o = this.f17927s;
            C1784g0 c1784g0 = new C1784g0(interfaceC1746o);
            a1 a1Var = new a1(interfaceC0261w, this.f17928t, this.f17929u, this.f17930v, c1784g0, null);
            this.f17925q = 1;
            Object objC = AbstractC1802p0.c(interfaceC1746o, a1Var, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objC == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        return C1386y.f15098a;
    }
}
