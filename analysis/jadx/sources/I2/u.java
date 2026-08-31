package I2;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class u extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2383q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y f2384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U2.g f2385s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(y yVar, U2.g gVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2384r = yVar;
        this.f2385s = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new u(this.f2384r, this.f2385s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2383q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        this.f2383q = 1;
        int i7 = y.f2403e;
        Object objA = this.f2384r.a(this.f2385s, 1, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objA == enumC1580a ? enumC1580a : objA;
    }
}
