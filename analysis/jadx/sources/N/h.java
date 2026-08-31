package N;

/* JADX INFO: loaded from: classes.dex */
public final class h extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f3938q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3939r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f3940s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3941t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, s5.c cVar) {
        super(cVar);
        this.f3940s = rVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f3939r = obj;
        this.f3941t |= Integer.MIN_VALUE;
        return this.f3940s.b(null, null, this);
    }
}
