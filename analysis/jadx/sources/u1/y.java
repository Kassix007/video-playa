package U1;

import M5.InterfaceC0261w;
import P.C0346b0;
import P.W;
import java.util.List;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import u.C1645d0;

/* JADX INFO: loaded from: classes.dex */
public final class y extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7617q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f7618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f7619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0346b0 f7620t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C1645d0 c1645d0, W w3, C0346b0 c0346b0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7618r = c1645d0;
        this.f7619s = w3;
        this.f7620t = c0346b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new y(this.f7618r, this.f7619s, this.f7620t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f7617q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            T1.d dVar = (T1.d) ((List) this.f7619s.getValue()).get(((List) r3.getValue()).size() - 2);
            float fE = this.f7620t.e();
            this.f7617q = 1;
            Object objW = this.f7618r.w(fE, dVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objW == enumC1580a) {
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
