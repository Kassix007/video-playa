package M;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: M.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0200b0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3438q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ I0 f3439r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200b0(I0 i02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3439r = i02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0200b0(this.f3439r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0200b0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3438q;
        C1386y c1386y = C1386y.f15098a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return c1386y;
        }
        AbstractC1362a.e(obj);
        this.f3438q = 1;
        N.r rVar = this.f3439r.f3322c;
        Object objB = androidx.compose.material3.internal.a.b(rVar, J0.f3324r, rVar.f3975k.e(), this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (objB != enumC1580a) {
            objB = c1386y;
        }
        return objB == enumC1580a ? enumC1580a : c1386y;
    }
}
