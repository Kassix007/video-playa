package Q2;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s5.i f6543s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: B5.e */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6543s = (s5.i) eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v0, types: [B5.e, s5.i] */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        k kVar = new k(this.f6543s, interfaceC1524c);
        kVar.f6542r = obj;
        return kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((u) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [B5.e, s5.i] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6541q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        u uVar = (u) this.f6542r;
        int i7 = uVar.f6581a;
        if ((200 > i7 || i7 >= 300) && i7 != 304) {
            throw new C2.e("HTTP " + uVar.f6581a);
        }
        this.f6541q = 1;
        Object objInvoke = this.f6543s.invoke(uVar, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objInvoke == enumC1580a ? enumC1580a : objInvoke;
    }
}
