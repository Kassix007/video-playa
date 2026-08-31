package x2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f18363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l f18364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18365s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, s5.c cVar) {
        super(cVar);
        this.f18364r = lVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18363q = obj;
        this.f18365s |= Integer.MIN_VALUE;
        return this.f18364r.b(null, this);
    }
}
