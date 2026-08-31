package P5;

/* JADX INFO: renamed from: P5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0391b extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public O5.t f6386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f6387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0392c f6388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6389t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0391b(C0392c c0392c, s5.c cVar) {
        super(cVar);
        this.f6388s = c0392c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f6387r = obj;
        this.f6389t |= Integer.MIN_VALUE;
        return this.f6388s.c(null, this);
    }
}
