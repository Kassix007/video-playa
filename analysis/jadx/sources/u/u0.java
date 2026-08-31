package u;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import P.C0345b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f17064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f17065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v0 f17067t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(v0 v0Var, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17067t = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        u0 u0Var = new u0(this.f17067t, interfaceC1524c);
        u0Var.f17066s = obj;
        return u0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        float fM;
        InterfaceC0261w interfaceC0261w;
        int i = this.f17065r;
        if (i == 0) {
            AbstractC1362a.e(obj);
            InterfaceC0261w interfaceC0261w2 = (InterfaceC0261w) this.f17066s;
            fM = AbstractC1644d.m(interfaceC0261w2.d());
            interfaceC0261w = interfaceC0261w2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fM = this.f17064q;
            interfaceC0261w = (InterfaceC0261w) this.f17066s;
            AbstractC1362a.e(obj);
        }
        while (AbstractC0263y.r(interfaceC0261w)) {
            t0 t0Var = new t0(this.f17067t, fM);
            this.f17066s = interfaceC0261w;
            this.f17064q = fM;
            this.f17065r = 1;
            Object objE = C0345b.o(getContext()).e(t0Var, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objE == enumC1580a) {
                return enumC1580a;
            }
        }
        return C1386y.f15098a;
    }
}
