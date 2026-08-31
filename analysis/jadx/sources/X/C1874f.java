package x;

/* JADX INFO: renamed from: x.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1874f extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1876h f18299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18300s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1874f(C1876h c1876h, s5.c cVar) {
        super(cVar);
        this.f18299r = c1876h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18298q = obj;
        this.f18300s |= Integer.MIN_VALUE;
        return this.f18299r.d(null, 0.0f, null, this);
    }
}
