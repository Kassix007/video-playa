package v2;

/* JADX INFO: renamed from: v2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1755c extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f17515q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public U5.e f17516r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1756d f17518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17519u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755c(C1756d c1756d, s5.c cVar) {
        super(cVar);
        this.f17518t = c1756d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17517s = obj;
        this.f17519u |= Integer.MIN_VALUE;
        return this.f17518t.a(this);
    }
}
