package w;

/* JADX INFO: renamed from: w.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1818y extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C f18105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1803q f18106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public y.b f18107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f18108t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C f18109u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18110v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1818y(C c7, s5.c cVar) {
        super(cVar);
        this.f18109u = c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18108t = obj;
        this.f18110v |= Integer.MIN_VALUE;
        return C.B0(this.f18109u, null, this);
    }
}
