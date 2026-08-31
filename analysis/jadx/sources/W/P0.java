package w;

import M5.InterfaceC0261w;
import m0.C1346a;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v.C1727w;
import v0.InterfaceC1746o;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1746o f17837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1727w f17838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1346a f17839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17840v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(InterfaceC1746o interfaceC1746o, C1727w c1727w, C1346a c1346a, C1784g0 c1784g0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f17837s = interfaceC1746o;
        this.f17838t = c1727w;
        this.f17839u = c1346a;
        this.f17840v = c1784g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        P0 p02 = new P0(this.f17837s, this.f17838t, this.f17839u, this.f17840v, interfaceC1524c);
        p02.f17836r = obj;
        return p02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P0) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2)).invokeSuspend(C1386y.f15098a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f17835q;
        if (i == 0) {
            AbstractC1362a.e(obj);
            O0 o02 = new O0((InterfaceC0261w) this.f17836r, this.f17838t, this.f17839u, this.f17840v, null);
            this.f17835q = 1;
            Object objC = AbstractC1802p0.c(this.f17837s, o02, this);
            EnumC1580a enumC1580a = EnumC1580a.f16356q;
            if (objC == enumC1580a) {
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
