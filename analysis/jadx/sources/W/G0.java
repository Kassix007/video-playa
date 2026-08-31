package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17781q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17782r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ H0 f17783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.e f17784t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G0(H0 h02, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17783s = h02;
        this.f17784t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        G0 g02 = new G0(this.f17783s, this.f17784t, interfaceC1524c);
        g02.f17782r = obj;
        return g02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((G0) create((InterfaceC1788i0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17781q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC1788i0 interfaceC1788i0 = (InterfaceC1788i0) this.f17782r;
            H0 h02 = this.f17783s;
            h02.j = interfaceC1788i0;
            E0 e02 = h02.f17797k;
            this.f17781q = 1;
            Object objInvoke = this.f17784t.invoke(e02, this);
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
