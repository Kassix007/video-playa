package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v.C1725u;

/* JADX INFO: loaded from: classes.dex */
public final class E extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1769A f17766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H f17767t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C1769A c1769a, H h4, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17766s = c1769a;
        this.f17767t = h4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        E e7 = new E(this.f17766s, this.f17767t, interfaceC1524c);
        e7.f17765r = obj;
        return e7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create((N.q) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17764q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1725u c1725u = new C1725u(4, (N.q) this.f17765r, this.f17767t);
            this.f17764q = 1;
            Object objInvoke = this.f17766s.invoke(c1725u, this);
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
