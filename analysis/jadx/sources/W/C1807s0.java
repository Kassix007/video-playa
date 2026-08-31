package w;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v.C1725u;

/* JADX INFO: renamed from: w.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1807s0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1769A f18055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0 f18056t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807s0(C1769A c1769a, H0 h02, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18055s = c1769a;
        this.f18056t = h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1807s0 c1807s0 = new C1807s0(this.f18055s, this.f18056t, interfaceC1524c);
        c1807s0.f18054r = obj;
        return c1807s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1807s0) create((E0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18053q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1725u c1725u = new C1725u(5, (E0) this.f18054r, this.f18056t);
            this.f18053q = 1;
            Object objInvoke = this.f18055s.invoke(c1725u, this);
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
