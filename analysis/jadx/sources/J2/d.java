package J2;

/* JADX INFO: loaded from: classes.dex */
public final class d extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public U5.e f2756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f2757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f2758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2759t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, s5.c cVar) {
        super(cVar);
        this.f2758s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f2757r = obj;
        this.f2759t |= Integer.MIN_VALUE;
        return this.f2758s.a(this);
    }
}
