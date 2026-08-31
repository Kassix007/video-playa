package x;

/* JADX INFO: renamed from: x.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1875g extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18301q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1876h f18302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18303s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1875g(C1876h c1876h, s5.c cVar) {
        super(cVar);
        this.f18302r = c1876h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18301q = obj;
        this.f18303s |= Integer.MIN_VALUE;
        return C1876h.b(this.f18302r, null, 0.0f, 0.0f, null, this);
    }
}
