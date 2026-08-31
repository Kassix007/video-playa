package u;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f16954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f16955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1652h f16956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC1663q f16957t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1658l f16958u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f16959v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ B5.c f16960w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(kotlin.jvm.internal.y yVar, Object obj, InterfaceC1652h interfaceC1652h, AbstractC1663q abstractC1663q, C1658l c1658l, float f, B5.c cVar) {
        super(1);
        this.f16954q = yVar;
        this.f16955r = obj;
        this.f16956s = interfaceC1652h;
        this.f16957t = abstractC1663q;
        this.f16958u = c1658l;
        this.f16959v = f;
        this.f16960w = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        InterfaceC1652h interfaceC1652h = this.f16956s;
        C1656j c1656j = new C1656j(this.f16955r, interfaceC1652h.d(), this.f16957t, jLongValue, interfaceC1652h.e(), jLongValue, new j0(this.f16958u, 0));
        AbstractC1644d.l(c1656j, jLongValue, this.f16959v, this.f16956s, this.f16958u, this.f16960w);
        this.f16954q.f14268q = c1656j;
        return C1386y.f15098a;
    }
}
