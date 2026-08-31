package u;

import M5.AbstractC0263y;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends s5.i implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16853q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f16855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16856t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ v0 f16857u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f16858v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Object obj, Object obj2, C1645d0 c1645d0, v0 v0Var, float f, InterfaceC1524c interfaceC1524c) {
        super(1, interfaceC1524c);
        this.f16854r = obj;
        this.f16855s = obj2;
        this.f16856t = c1645d0;
        this.f16857u = v0Var;
        this.f16858v = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(InterfaceC1524c interfaceC1524c) {
        return new Z(this.f16854r, this.f16855s, this.f16856t, this.f16857u, this.f16858v, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        return ((Z) create((InterfaceC1524c) obj)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f16853q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            Y y6 = new Y(this.f16854r, this.f16855s, this.f16856t, this.f16857u, this.f16858v, null);
            this.f16853q = 1;
            Object objG = AbstractC0263y.g(y6, this);
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
