package H0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public j f2062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f2064s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2065t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, s5.c cVar) {
        super(cVar);
        this.f2064s = jVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f2063r = obj;
        this.f2065t |= Integer.MIN_VALUE;
        return this.f2064s.a(0.0f, this);
    }
}
