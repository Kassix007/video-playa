package u;

import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f16967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f16968r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1652h f16969s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1658l f16970t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B5.c f16971u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kotlin.jvm.internal.y yVar, float f, InterfaceC1652h interfaceC1652h, C1658l c1658l, B5.c cVar) {
        super(1);
        this.f16967q = yVar;
        this.f16968r = f;
        this.f16969s = interfaceC1652h;
        this.f16970t = c1658l;
        this.f16971u = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.f16967q.f14268q;
        kotlin.jvm.internal.m.b(obj2);
        AbstractC1644d.l((C1656j) obj2, jLongValue, this.f16968r, this.f16969s, this.f16970t, this.f16971u);
        return C1386y.f15098a;
    }
}
