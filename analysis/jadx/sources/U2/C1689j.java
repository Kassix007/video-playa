package u2;

import M5.InterfaceC0261w;
import P.Q0;
import P5.AbstractC0409u;
import P5.C0408t;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.C1530i;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1689j extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1693n f17153r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689j(C1693n c1693n, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17153r = c1693n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1689j(this.f17153r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1689j) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17152q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1693n c1693n = this.f17153r;
            C1692m c1692m = new C1692m(new Q0(new I2.d(21, c1693n), null));
            C1687h c1687h = new C1687h(c1693n, null);
            int i7 = AbstractC0409u.f6446a;
            Q5.o oVar = new Q5.o(new C0408t(c1687h, null), c1692m, C1530i.f16022q, -2, O5.a.f5206q);
            C1688i c1688i = new C1688i(c1693n);
            this.f17152q = 1;
            Object objCollect = oVar.collect(c1688i, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objCollect == enumC1580a) {
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
