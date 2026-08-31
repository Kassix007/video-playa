package E;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends kotlin.jvm.internal.n implements B5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ U f1499r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Q(U u6, int i) {
        super(0);
        this.f1498q = i;
        this.f1499r = u6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.a
    public final Object invoke() {
        switch (this.f1498q) {
            case 0:
                U u6 = this.f1499r;
                return Float.valueOf(u6.f1506F.a() - u6.f1506F.d());
            case 1:
                return Float.valueOf(this.f1499r.f1506F.b());
            default:
                return Float.valueOf(this.f1499r.f1506F.e());
        }
    }
}
