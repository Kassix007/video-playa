package k0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14026q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f14027r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f14026q = i;
        this.f14027r = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f14026q) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f14027r.f14036n.d(D5.a.o(dDoubleValue, r10.f14030e, r10.f)));
            default:
                return Double.valueOf(D5.a.o(this.f14027r.f14033k.d(((Number) obj).doubleValue()), r10.f14030e, r10.f));
        }
    }
}
