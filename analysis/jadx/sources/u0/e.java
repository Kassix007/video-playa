package u0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f17099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17100r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f17101s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f17102t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f17103u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17104v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, s5.c cVar) {
        super(cVar);
        this.f17103u = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17102t = obj;
        this.f17104v |= Integer.MIN_VALUE;
        return this.f17103u.n(0L, 0L, this);
    }
}
