package I2;

import M5.InterfaceC0261w;
import java.util.List;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;

/* JADX INFO: loaded from: classes.dex */
public final class x extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U2.g f2398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f2399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V2.h f2400t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i f2401u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n f2402v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(U2.g gVar, y yVar, V2.h hVar, i iVar, n nVar, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f2398r = gVar;
        this.f2399s = yVar;
        this.f2400t = hVar;
        this.f2401u = iVar;
        this.f2402v = nVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new x(this.f2398r, this.f2399s, this.f2400t, this.f2401u, this.f2402v, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f2397q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        List list = this.f2399s.f2406c.f2354a;
        boolean z5 = this.f2402v != null;
        U2.g gVar = this.f2398r;
        M2.k kVar = new M2.k(gVar, list, 0, gVar, this.f2400t, this.f2401u, z5);
        this.f2397q = 1;
        Object objC = kVar.c(this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objC == enumC1580a ? enumC1580a : objC;
    }
}
