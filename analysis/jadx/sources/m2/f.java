package M2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public k f3766q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3767r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f3768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3769t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, s5.c cVar) {
        super(cVar);
        this.f3768s = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f3767r = obj;
        this.f3769t |= Integer.MIN_VALUE;
        return this.f3768s.d(null, this);
    }
}
