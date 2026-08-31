package C0;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1132q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w1 f1133r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(w1 w1Var, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1133r = w1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new u1(this.f1133r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u1) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f1132q;
        C1386y c1386y = C1386y.f15098a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return c1386y;
        }
        AbstractC1362a.e(obj);
        A a7 = this.f1133r.f1143q;
        this.f1132q = 1;
        Object objD = a7.f714G.d(this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objD != enumC1580a) {
            objD = c1386y;
        }
        return objD == enumC1580a ? enumC1580a : c1386y;
    }
}
