package u;

import M5.AbstractC0263y;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class V extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v0 f16837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16839t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Object obj, InterfaceC1524c interfaceC1524c, C1645d0 c1645d0, v0 v0Var) {
        super(1, interfaceC1524c);
        this.f16837r = v0Var;
        this.f16838s = c1645d0;
        this.f16839t = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new V(this.f16839t, interfaceC1524c, this.f16838s, this.f16837r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        return ((V) create((InterfaceC1524c) obj)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16836q;
        v0 v0Var = this.f16837r;
        if (i == 0) {
            AbstractC1362a.e(obj);
            U u6 = new U(this.f16839t, null, this.f16838s, v0Var);
            this.f16836q = 1;
            Object objG = AbstractC0263y.g(u6, this);
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
        v0Var.i();
        return C1386y.f15098a;
    }
}
