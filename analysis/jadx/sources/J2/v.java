package J2;

/* JADX INFO: loaded from: classes.dex */
public final class v extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.i f2797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f2799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2800t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(e eVar, s5.c cVar) {
        super(cVar);
        this.f2799s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f2798r = obj;
        this.f2800t |= Integer.MIN_VALUE;
        return this.f2799s.a(this);
    }
}
