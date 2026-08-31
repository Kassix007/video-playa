package w;

/* JADX INFO: renamed from: w.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1804q0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f18046q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18047r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1805r0 f18048s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18049t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804q0(C1805r0 c1805r0, s5.c cVar) {
        super(cVar);
        this.f18048s = c1805r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18047r = obj;
        this.f18049t |= Integer.MIN_VALUE;
        return this.f18048s.n(0L, 0L, this);
    }
}
