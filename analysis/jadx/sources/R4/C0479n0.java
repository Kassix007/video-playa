package R4;

/* JADX INFO: renamed from: R4.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0479n0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f7133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0498s0 f7134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7135s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479n0(C0498s0 c0498s0, s5.c cVar) {
        super(cVar);
        this.f7134r = c0498s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f7133q = obj;
        this.f7135s |= Integer.MIN_VALUE;
        return this.f7134r.a(null, null, this);
    }
}
