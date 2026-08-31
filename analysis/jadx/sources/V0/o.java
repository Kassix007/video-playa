package V0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f7943r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, int i) {
        super(0);
        this.f7942q = i;
        this.f7943r = pVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f7942q) {
            case 0:
                return Float.valueOf(this.f7943r.c());
            default:
                return this.f7943r;
        }
    }
}
