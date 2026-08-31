package w;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: renamed from: w.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1797n extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p3.z0 f18027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v.W f18028s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B5.e f18029t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1797n(p3.z0 z0Var, v.W w3, B5.e eVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18027r = z0Var;
        this.f18028s = w3;
        this.f18029t = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1797n(this.f18027r, this.f18028s, this.f18029t, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1797n) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f18026q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            p3.z0 z0Var = this.f18027r;
            v.a0 a0Var = (v.a0) z0Var.f15877c;
            F.E e7 = (F.E) z0Var.f15876b;
            C1795m c1795m = new C1795m(z0Var, this.f18029t, null);
            this.f18026q = 1;
            a0Var.getClass();
            Object objG = AbstractC0263y.g(new v.Z(this.f18028s, a0Var, c1795m, e7, null), this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objG == enumC1580a) {
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
