package u;

/* JADX INFO: renamed from: u.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1641b0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1645d0 f16872q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f16873r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16874s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16875t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16876u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1641b0(C1645d0 c1645d0, s5.c cVar) {
        super(cVar);
        this.f16875t = c1645d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f16874s = obj;
        this.f16876u |= Integer.MIN_VALUE;
        return C1645d0.s(this.f16875t, this);
    }
}
