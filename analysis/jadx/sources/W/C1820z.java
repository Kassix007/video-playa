package w;

/* JADX INFO: renamed from: w.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1820z extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C f18114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r f18115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C f18117t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18118u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1820z(C c7, s5.c cVar) {
        super(cVar);
        this.f18117t = c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18116s = obj;
        this.f18118u |= Integer.MIN_VALUE;
        return C.C0(this.f18117t, null, this);
    }
}
