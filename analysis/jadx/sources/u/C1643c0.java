package u;

/* JADX INFO: renamed from: u.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1643c0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1645d0 f16885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f16886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16889u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1643c0(C1645d0 c1645d0, s5.c cVar) {
        super(cVar);
        this.f16888t = c1645d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f16887s = obj;
        this.f16889u |= Integer.MIN_VALUE;
        return C1645d0.t(this.f16888t, this);
    }
}
