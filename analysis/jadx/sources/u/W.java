package u;

/* JADX INFO: loaded from: classes.dex */
public final class W extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1645d0 f16840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16841r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1645d0 f16842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16843t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C1645d0 c1645d0, s5.c cVar) {
        super(cVar);
        this.f16842s = c1645d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f16841r = obj;
        this.f16843t |= Integer.MIN_VALUE;
        return C1645d0.r(this.f16842s, this);
    }
}
