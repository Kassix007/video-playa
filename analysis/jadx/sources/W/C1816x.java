package w;

/* JADX INFO: renamed from: w.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1816x extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C f18097q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f18098r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C f18099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18100t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816x(C c7, s5.c cVar) {
        super(cVar);
        this.f18099s = c7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f18098r = obj;
        this.f18100t |= Integer.MIN_VALUE;
        return C.A0(this.f18099s, this);
    }
}
