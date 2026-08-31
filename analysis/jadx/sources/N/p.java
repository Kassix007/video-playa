package N;

import B0.C0050o;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import w.E;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s5.i implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3964q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0050o f3965r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ E f3966s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(C0050o c0050o, E e7, InterfaceC1524c interfaceC1524c) {
        super(3, interfaceC1524c);
        this.f3965r = c0050o;
        this.f3966s = e7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new p(this.f3965r, this.f3966s, (InterfaceC1524c) obj3).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3964q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            q qVar = (q) this.f3965r.f499q;
            this.f3964q = 1;
            Object objInvoke = this.f3966s.invoke(qVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objInvoke == enumC1580a) {
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
