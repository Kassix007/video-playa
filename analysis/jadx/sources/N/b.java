package N;

import B0.j0;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;
import u.InterfaceC1657k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends s5.i implements B5.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ o f3914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ y f3915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f3916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f3917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f3918v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, float f, InterfaceC1524c interfaceC1524c) {
        super(4, interfaceC1524c);
        this.f3917u = rVar;
        this.f3918v = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        b bVar = new b(this.f3917u, this.f3918v, (InterfaceC1524c) obj4);
        bVar.f3914r = (o) obj;
        bVar.f3915s = (y) obj2;
        bVar.f3916t = obj3;
        return bVar.invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3913q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            o oVar = this.f3914r;
            float fD = this.f3915s.d(this.f3916t);
            if (!Float.isNaN(fD)) {
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                r rVar = this.f3917u;
                float fE = Float.isNaN(rVar.j.e()) ? 0.0f : rVar.j.e();
                vVar.f14265q = fE;
                InterfaceC1657k interfaceC1657k = rVar.f3970c;
                j0 j0Var = new j0(9, oVar, vVar);
                this.f3914r = null;
                this.f3915s = null;
                this.f3913q = 1;
                Object objB = AbstractC1644d.b(fE, fD, this.f3918v, interfaceC1657k, j0Var, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objB == enumC1580a) {
                    return enumC1580a;
                }
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
