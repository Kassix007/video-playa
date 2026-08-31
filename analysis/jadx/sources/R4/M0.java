package R4;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f6795r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w1.o0 f6796s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(C0498s0 c0498s0, w1.o0 o0Var, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6795r = c0498s0;
        this.f6796s = o0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new M0(this.f6795r, this.f6796s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6794q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            this.f6794q = 1;
            Object objH = AbstractC0263y.h(1500L, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objH == enumC1580a) {
                return enumC1580a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        C0498s0 c0498s0 = this.f6795r;
        C0468k1 c0468k1 = c0498s0.f7181b;
        c0468k1.f7098t.f13882p.e(c0468k1.f7069b, new N(new N5.d(2, c0498s0, this.f6796s), 1));
        return C1386y.f15098a;
    }
}
