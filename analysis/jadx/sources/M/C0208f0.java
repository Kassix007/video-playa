package M;

import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v0.InterfaceC1746o;
import w.g1;

/* JADX INFO: renamed from: M.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0208f0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B5.a f3479s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0208f0(B5.a aVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3479s = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C0208f0 c0208f0 = new C0208f0(this.f3479s, interfaceC1524c);
        c0208f0.f3478r = obj;
        return c0208f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0208f0) create((InterfaceC1746o) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3477q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC1746o interfaceC1746o = (InterfaceC1746o) this.f3478r;
            Q q7 = new Q(this.f3479s, 1);
            this.f3477q = 1;
            Object objD = g1.d(interfaceC1746o, null, q7, this, 7);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objD == enumC1580a) {
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
