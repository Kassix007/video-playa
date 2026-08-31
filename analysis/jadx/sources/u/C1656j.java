package u;

import P.C0345b;
import P.C0354f0;

/* JADX INFO: renamed from: u.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1656j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z.m f16945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.n f16948d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0354f0 f16949e;
    public AbstractC1663q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16950g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16951h = Long.MIN_VALUE;
    public final C0354f0 i = C0345b.q(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: B5.a */
    /* JADX WARN: Multi-variable type inference failed */
    public C1656j(Object obj, Z.m mVar, AbstractC1663q abstractC1663q, long j, Object obj2, long j7, B5.a aVar) {
        this.f16945a = mVar;
        this.f16946b = obj2;
        this.f16947c = j7;
        this.f16948d = (kotlin.jvm.internal.n) aVar;
        this.f16949e = C0345b.q(obj);
        this.f = AbstractC1644d.j(abstractC1663q);
        this.f16950g = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [B5.a, kotlin.jvm.internal.n] */
    public final void a() {
        this.i.setValue(Boolean.FALSE);
        this.f16948d.invoke();
    }
}
