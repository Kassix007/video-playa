package w;

import M5.InterfaceC0241b0;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1785h extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17976q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17977r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1 f17978s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1789j f17979t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1775c f17980u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0241b0 f17981v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785h(j1 j1Var, C1789j c1789j, InterfaceC1775c interfaceC1775c, InterfaceC0241b0 interfaceC0241b0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17978s = j1Var;
        this.f17979t = c1789j;
        this.f17980u = interfaceC1775c;
        this.f17981v = interfaceC0241b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        C1785h c1785h = new C1785h(this.f17978s, this.f17979t, this.f17980u, this.f17981v, interfaceC1524c);
        c1785h.f17977r = obj;
        return c1785h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1785h) create((E0) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f17976q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            E0 e02 = (E0) this.f17977r;
            C1789j c1789j = this.f17979t;
            InterfaceC1775c interfaceC1775c = this.f17980u;
            float fX0 = C1789j.x0(c1789j, interfaceC1775c);
            j1 j1Var = this.f17978s;
            j1Var.f18013e = fX0;
            A.J j = new A.J(c1789j, this.f17981v, e02, 14);
            C.k kVar = new C.k(c1789j, j1Var, interfaceC1775c, 9);
            this.f17976q = 1;
            Object objA = j1Var.a(j, kVar, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objA == enumC1580a) {
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
