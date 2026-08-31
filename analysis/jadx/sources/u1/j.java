package U1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends T1.q {
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X.e f7551g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(i iVar, String str, X.e eVar) {
        super(iVar, str);
        this.f = iVar;
        this.f7551g = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.q
    public final T1.p a() {
        return (h) super.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.q
    public final T1.p b() {
        return new h(this.f, this.f7551g);
    }
}
