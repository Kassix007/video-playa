package x;

/* JADX INFO: renamed from: x.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1871c extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public B5.c f18285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1876h f18287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18288t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871c(C1876h c1876h, s5.c cVar) {
        super(cVar);
        this.f18287s = c1876h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18286r = obj;
        this.f18288t |= Integer.MIN_VALUE;
        return this.f18287s.c(null, 0.0f, null, this);
    }
}
