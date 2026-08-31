package M2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f3791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f3792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f3793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3794t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, s5.c cVar) {
        super(cVar);
        this.f3793s = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f3792r = obj;
        this.f3794t |= Integer.MIN_VALUE;
        return this.f3793s.c(this);
    }
}
