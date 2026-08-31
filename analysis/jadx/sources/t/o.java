package t;

import P.C0364k0;
import P.Q0;
import P.W;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.v0;
import u2.C1692m;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16627q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v0 f16629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f16630t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(v0 v0Var, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f16629s = v0Var;
        this.f16630t = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        o oVar = new o(this.f16629s, this.f16630t, interfaceC1524c);
        oVar.f16628r = obj;
        return oVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((C0364k0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16627q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C0364k0 c0364k0 = (C0364k0) this.f16628r;
            v0 v0Var = this.f16629s;
            C1692m c1692m = new C1692m(new Q0(new n(v0Var, 0), null));
            N.f fVar = new N.f(c0364k0, v0Var, this.f16630t, 4);
            this.f16627q = 1;
            Object objCollect = c1692m.collect(fVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objCollect == enumC1580a) {
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
