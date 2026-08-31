package w;

import E.C0128k;
import M5.AbstractC0263y;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import java.util.concurrent.CancellationException;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1787i extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1789j f17991s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j1 f17992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1775c f17993u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787i(C1789j c1789j, j1 j1Var, InterfaceC1775c interfaceC1775c, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17991s = c1789j;
        this.f17992t = j1Var;
        this.f17993u = interfaceC1775c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1787i c1787i = new C1787i(this.f17991s, this.f17992t, this.f17993u, interfaceC1524c);
        c1787i.f17990r = obj;
        return c1787i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1787i) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        C1789j c1789j = this.f17991s;
        C0128k c0128k = c1789j.f18001I;
        int i = this.f17989q;
        try {
            try {
                if (i == 0) {
                    AbstractC1362a.e(obj);
                    InterfaceC0241b0 interfaceC0241b0N = AbstractC0263y.n(((InterfaceC0261w) this.f17990r).d());
                    c1789j.f18006N = true;
                    H0 h02 = c1789j.f17998F;
                    v.W w3 = v.W.f17278q;
                    C1785h c1785h = new C1785h(this.f17992t, c1789j, this.f17993u, interfaceC0241b0N, null);
                    this.f17989q = 1;
                    Object objF = h02.f(w3, c1785h, this);
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
                c0128k.b();
                c1789j.f18006N = false;
                c0128k.a(null);
                c1789j.f18003K = false;
                return C1386y.f15098a;
            } catch (CancellationException e7) {
                throw e7;
            }
        } catch (Throwable th) {
            c1789j.f18006N = false;
            c0128k.a(null);
            c1789j.f18003K = false;
            throw th;
        }
    }
}
