package y2;

import D2.n;
import M5.InterfaceC0261w;
import kotlin.jvm.internal.y;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import t2.C1617b;
import t2.C1618c;
import x2.m;

/* JADX INFO: renamed from: y2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1908d extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18566q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1913i f18567r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f18568s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y f18569t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ D2.j f18570u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f18571v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f18572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1618c f18573x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1908d(C1913i c1913i, y yVar, y yVar2, D2.j jVar, Object obj, y yVar3, C1618c c1618c, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f18567r = c1913i;
        this.f18568s = yVar;
        this.f18569t = yVar2;
        this.f18570u = jVar;
        this.f18571v = obj;
        this.f18572w = yVar3;
        this.f18573x = c1618c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C1908d(this.f18567r, this.f18568s, this.f18569t, this.f18570u, this.f18571v, this.f18572w, this.f18573x, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1908d) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.f18566q;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1362a.e(obj);
            return obj;
        }
        AbstractC1362a.e(obj);
        m mVar = (m) this.f18568s.f14268q;
        C1617b c1617b = (C1617b) this.f18569t.f14268q;
        n nVar = (n) this.f18572w.f14268q;
        this.f18566q = 1;
        Object objA = C1913i.a(this.f18567r, mVar, c1617b, this.f18570u, this.f18571v, nVar, this.f18573x, this);
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        return objA == enumC1580a ? enumC1580a : objA;
    }
}
