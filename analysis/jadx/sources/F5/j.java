package f5;

import F.C0151e;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0151e f12782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12783s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0151e c0151e, int i, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f12782r = c0151e;
        this.f12783s = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new j(this.f12782r, this.f12783s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f12781q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f12781q = 1;
            Object objF = this.f12782r.f(this.f12783s, AbstractC1644d.o(7, null), this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objF == enumC1580a) {
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
