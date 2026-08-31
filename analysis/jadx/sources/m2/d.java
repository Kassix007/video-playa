package M2;

import M5.InterfaceC0261w;
import U2.n;
import kotlin.jvm.internal.y;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f3750r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f3751s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f3752t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ U2.g f3753u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3754v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f3755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ I2.i f3756x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, y yVar, y yVar2, U2.g gVar, Object obj, y yVar3, I2.i iVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f3750r = hVar;
        this.f3751s = yVar;
        this.f3752t = yVar2;
        this.f3753u = gVar;
        this.f3754v = obj;
        this.f3755w = yVar3;
        this.f3756x = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new d(this.f3750r, this.f3751s, this.f3752t, this.f3753u, this.f3754v, this.f3755w, this.f3756x, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f3749q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        L2.i iVar = (L2.i) this.f3751s.f14268q;
        I2.g gVar = (I2.g) this.f3752t.f14268q;
        n nVar = (n) this.f3755w.f14268q;
        this.f3749q = 1;
        Object objA = h.a(this.f3750r, iVar, gVar, this.f3753u, this.f3754v, nVar, this.f3756x, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objA == enumC1580a ? enumC1580a : objA;
    }
}
