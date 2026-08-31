package w;

import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1813v0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1821z0 f18090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f18091s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813v0(C1821z0 c1821z0, long j, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18090r = c1821z0;
        this.f18091s = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1813v0(this.f18090r, this.f18091s, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1813v0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18089q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            H0 h02 = this.f18090r.f18124T;
            C1811u0 c1811u0 = new C1811u0(this.f18091s, null);
            this.f18089q = 1;
            Object objF = h02.f(v.W.f17279r, c1811u0, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objF == enumC1580a) {
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
