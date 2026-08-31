package w;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P.C0345b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17850r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        S s6 = new S(2, interfaceC1524c);
        s6.f17850r = obj;
        return s6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0261w interfaceC0261w;
        int i = this.f17849q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            interfaceC0261w = (InterfaceC0261w) this.f17850r;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0261w = (InterfaceC0261w) this.f17850r;
            AbstractC1362a.e(obj);
        }
        while (AbstractC0263y.s(interfaceC0261w.d())) {
            C1777d c1777d = C1777d.f17941t;
            this.f17850r = interfaceC0261w;
            this.f17849q = 1;
            Object objE = C0345b.o(getContext()).e(c1777d, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objE == enumC1580a) {
                return enumC1580a;
            }
        }
        return C1386y.f15098a;
    }
}
