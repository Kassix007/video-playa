package P;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.e f5334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f5335t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(B5.e eVar, W w3, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f5334s = eVar;
        this.f5335t = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        L0 l02 = new L0(this.f5334s, this.f5335t, interfaceC1524c);
        l02.f5333r = obj;
        return l02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f5332q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C0364k0 c0364k0 = new C0364k0(this.f5335t, ((InterfaceC0261w) this.f5333r).d());
            this.f5332q = 1;
            Object objInvoke = this.f5334s.invoke(c0364k0, this);
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
