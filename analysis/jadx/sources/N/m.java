package N;

import m5.AbstractC1362a;
import m5.C1371j;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class m extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.g f3957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f3958t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(B5.g gVar, r rVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3957s = gVar;
        this.f3958t = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        m mVar = new m(this.f3957s, this.f3958t, interfaceC1524c);
        mVar.f3956r = obj;
        return mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((C1371j) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3955q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1371j c1371j = (C1371j) this.f3956r;
            y yVar = (y) c1371j.f15080q;
            Object obj2 = c1371j.f15081r;
            o oVar = this.f3958t.f3978n;
            this.f3955q = 1;
            Object objInvoke = this.f3957s.invoke(oVar, yVar, obj2, this);
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
