package u0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f17092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f17093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f17094s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, s5.c cVar) {
        super(cVar);
        this.f17093r = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17092q = obj;
        this.f17094s |= Integer.MIN_VALUE;
        return this.f17093r.b(0L, this);
    }
}
