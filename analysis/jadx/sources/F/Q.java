package F;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1841q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f1842r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(B5.a aVar, int i) {
        super(0);
        this.f1841q = i;
        this.f1842r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f1841q) {
            case 0:
                return new C0151e(0, 0.0f, this.f1842r);
            case 1:
                this.f1842r.invoke();
                return Boolean.TRUE;
            case 2:
                this.f1842r.invoke();
                return Boolean.TRUE;
            case 3:
                return Float.valueOf(D5.a.p(((Number) this.f1842r.invoke()).floatValue(), 0.0f, 1.0f));
            default:
                return this.f1842r.invoke();
        }
    }
}
