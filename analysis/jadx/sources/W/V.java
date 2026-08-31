package w;

import b2.C0690a;

/* JADX INFO: loaded from: classes.dex */
public final class V extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0690a f17866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f17867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f17868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0 f17869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f17870u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0690a c0690a, kotlin.jvm.internal.y yVar, kotlin.jvm.internal.v vVar, H0 h02, kotlin.jvm.internal.u uVar) {
        super(1);
        this.f17866q = c0690a;
        this.f17867r = yVar;
        this.f17868s = vVar;
        this.f17869t = h02;
        this.f17870u = uVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        C0690a c0690a = this.f17866q;
        Q qF = C0690a.f((O5.e) c0690a.f);
        if (qF != null) {
            c0690a.g(qF);
            kotlin.jvm.internal.y yVar = this.f17867r;
            Q qA = ((Q) yVar.f14268q).a(qF);
            yVar.f14268q = qA;
            long j = qA.f17841a;
            H0 h02 = this.f17869t;
            this.f17868s.f14265q = h02.g(h02.e(j));
            this.f17870u.f14264q = !P.a(r0 - fFloatValue);
        }
        return Boolean.valueOf(qF != null);
    }
}
