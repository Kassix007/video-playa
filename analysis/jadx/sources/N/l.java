package N;

/* JADX INFO: loaded from: classes.dex */
public final class l extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f3951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f3953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3954t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, s5.c cVar) {
        super(cVar);
        this.f3953s = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f3952r = obj;
        this.f3954t |= Integer.MIN_VALUE;
        return this.f3953s.a(null, null, null, this);
    }
}
