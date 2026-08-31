package w;

/* JADX INFO: renamed from: w.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1782f0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1784g0 f17961q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17962r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1784g0 f17963s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f17964t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1782f0(C1784g0 c1784g0, s5.c cVar) {
        super(cVar);
        this.f17963s = c1784g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17962r = obj;
        this.f17964t |= Integer.MIN_VALUE;
        return this.f17963s.g(this);
    }
}
