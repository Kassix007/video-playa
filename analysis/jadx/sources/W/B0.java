package w;

/* JADX INFO: loaded from: classes.dex */
public final class B0 extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public H0 f17739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.x f17740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f17741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0 f17742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17743u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(H0 h02, s5.c cVar) {
        super(cVar);
        this.f17742t = h02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f17741s = obj;
        this.f17743u |= Integer.MIN_VALUE;
        return this.f17742t.b(0L, this);
    }
}
