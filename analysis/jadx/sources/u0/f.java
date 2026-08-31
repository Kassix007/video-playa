package u0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f17105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f17108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17109u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, s5.c cVar) {
        super(cVar);
        this.f17108t = gVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17107s = obj;
        this.f17109u |= Integer.MIN_VALUE;
        return this.f17108t.I(0L, this);
    }
}
