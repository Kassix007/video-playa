package w;

/* JADX INFO: renamed from: w.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1780e0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1784g0 f17951q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17952r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17953s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17954t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1780e0(C1784g0 c1784g0, s5.c cVar) {
        super(cVar);
        this.f17953s = c1784g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17952r = obj;
        this.f17954t |= Integer.MIN_VALUE;
        return this.f17953s.e(this);
    }
}
