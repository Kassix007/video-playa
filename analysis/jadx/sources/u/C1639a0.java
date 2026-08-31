package u;

import P.C0354f0;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: u.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1639a0 extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v0 f16869t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1639a0(Object obj, InterfaceC1524c interfaceC1524c, C1645d0 c1645d0, v0 v0Var) {
        super(1, interfaceC1524c);
        this.f16867r = c1645d0;
        this.f16868s = obj;
        this.f16869t = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new C1639a0(this.f16868s, interfaceC1524c, this.f16867r, this.f16869t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        return ((C1639a0) create((InterfaceC1524c) obj)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16866q;
        v0 v0Var = this.f16869t;
        if (i == 0) {
            AbstractC1362a.e(obj);
            C1645d0 c1645d0 = this.f16867r;
            c1645d0.v();
            C0354f0 c0354f0 = c1645d0.f16907s;
            c1645d0.f16901C = Long.MIN_VALUE;
            c1645d0.y(0.0f);
            Object value = c1645d0.f16908t.getValue();
            Object obj2 = this.f16868s;
            float f = obj2.equals(value) ? -4.0f : obj2.equals(c0354f0.getValue()) ? -5.0f : -3.0f;
            v0Var.p(obj2);
            v0Var.n(0L);
            c0354f0.setValue(obj2);
            c1645d0.y(0.0f);
            c1645d0.l(obj2);
            v0Var.j(f);
            if (f == -3.0f) {
                this.f16866q = 1;
                Object objT = C1645d0.t(c1645d0, this);
                EnumC1580a enumC1580a = EnumC1580a.f16356q;
                if (objT == enumC1580a) {
                    return enumC1580a;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
        }
        v0Var.i();
        return C1386y.f15098a;
    }
}
