package Q2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f6563q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f6564r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k3.c f6565s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f6566t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q f6567u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6568v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, s5.c cVar) {
        super(cVar);
        this.f6567u = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6566t = obj;
        this.f6568v |= Integer.MIN_VALUE;
        return q.c(this.f6567u, null, null, null, this);
    }
}
