package t2;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f16698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D2.j f16699s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(D2.j jVar, InterfaceC1524c interfaceC1524c, l lVar) {
        super(2, interfaceC1524c);
        this.f16698r = lVar;
        this.f16699s = jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new i(this.f16699s, interfaceC1524c, this.f16698r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16697q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        this.f16697q = 1;
        Object objA = l.a(this.f16698r, this.f16699s, 1, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objA == enumC1580a ? enumC1580a : objA;
    }
}
