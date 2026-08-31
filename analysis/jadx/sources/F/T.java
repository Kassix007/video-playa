package F;

/* JADX INFO: loaded from: classes.dex */
public final class T extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U f1846q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f1847r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ U f1848s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1849t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u6, s5.c cVar) {
        super(cVar);
        this.f1848s = u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f1847r = obj;
        this.f1849t |= Integer.MIN_VALUE;
        return this.f1848s.a(null, 0.0f, this);
    }
}
