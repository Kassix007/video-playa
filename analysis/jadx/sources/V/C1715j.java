package v;

/* JADX INFO: renamed from: v.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1715j extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1717l f17346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f17347r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1717l f17349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17350u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1715j(C1717l c1717l, s5.c cVar) {
        super(cVar);
        this.f17349t = c1717l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17348s = obj;
        this.f17350u |= Integer.MIN_VALUE;
        return this.f17349t.b(0L, null, this);
    }
}
