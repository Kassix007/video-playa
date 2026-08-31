package C0;

/* JADX INFO: loaded from: classes.dex */
public final class G extends s5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I f822q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public r.w f823r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public O5.b f824s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f825t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ I f826u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f827v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i, s5.c cVar) {
        super(cVar);
        this.f826u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        this.f825t = obj;
        this.f827v |= Integer.MIN_VALUE;
        return this.f826u.l(this);
    }
}
