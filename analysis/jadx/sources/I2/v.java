package I2;

import M5.AbstractC0263y;
import M5.H;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class v extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U2.g f2388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f2389t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(y yVar, U2.g gVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2388s = gVar;
        this.f2389t = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        v vVar = new v(this.f2389t, this.f2388s, interfaceC1524c);
        vVar.f2387r = obj;
        return vVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f2386q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        InterfaceC0261w interfaceC0261w = (InterfaceC0261w) this.f2387r;
        T5.e eVar = H.f3811a;
        M5.B bD = AbstractC0263y.d(interfaceC0261w, R5.n.f7261a.f4044t, new u(this.f2389t, this.f2388s, null), 2);
        this.f2386q = 1;
        Object objR = bD.r(this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objR == enumC1580a ? enumC1580a : objR;
    }
}
