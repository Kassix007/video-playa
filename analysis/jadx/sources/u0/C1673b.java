package u0;

/* JADX INFO: renamed from: u0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1673b extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f17089q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f17090r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17091s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1673b(d dVar, s5.c cVar) {
        super(cVar);
        this.f17090r = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17089q = obj;
        this.f17091s |= Integer.MIN_VALUE;
        return this.f17090r.a(0L, 0L, this);
    }
}
