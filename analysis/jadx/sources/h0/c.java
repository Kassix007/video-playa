package H0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public f f2040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f2041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W0.j f2042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f2046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2047x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, s5.c cVar) {
        super(cVar);
        this.f2046w = fVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f2045v = obj;
        this.f2047x |= Integer.MIN_VALUE;
        return f.a(this.f2046w, null, null, this);
    }
}
