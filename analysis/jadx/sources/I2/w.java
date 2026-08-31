package I2;

/* JADX INFO: loaded from: classes.dex */
public final class w extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U2.o f2390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public U2.g f2391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f2392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public n f2393t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f2394u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y f2395v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2396w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, s5.c cVar) {
        super(cVar);
        this.f2395v = yVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f2394u = obj;
        this.f2396w |= Integer.MIN_VALUE;
        return this.f2395v.a(null, 0, this);
    }
}
