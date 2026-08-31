package Q5;

import M5.InterfaceC0261w;
import P5.InterfaceC0398i;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f6620q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f6621r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0398i f6622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6623t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC0398i interfaceC0398i, Object obj, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f6621r = oVar;
        this.f6622s = interfaceC0398i;
        this.f6623t = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new k(this.f6621r, this.f6622s, this.f6623t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [B5.f, s5.i] */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f6620q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            ?? r3 = this.f6621r.f6638u;
            this.f6620q = 1;
            Object objInvoke = r3.invoke(this.f6622s, this.f6623t, this);
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
