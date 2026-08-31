package F;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.AbstractC1644d;

/* JADX INFO: loaded from: classes.dex */
public final class v extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0151e f1927r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(C0151e c0151e, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f1927r = c0151e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new v(this.f1927r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        Object objF;
        int i = this.f1926q;
        C1386y c1386y = C1386y.f15098a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return c1386y;
        }
        AbstractC1362a.e(obj);
        this.f1926q = 1;
        float f = S.f1843a;
        C0151e c0151e = this.f1927r;
        int iJ = c0151e.j() + 1;
        int iL = c0151e.l();
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        if (iJ >= iL || (objF = c0151e.f(c0151e.j() + 1, AbstractC1644d.o(7, null), this)) != enumC1580a) {
            objF = c1386y;
        }
        return objF == enumC1580a ? enumC1580a : c1386y;
    }
}
