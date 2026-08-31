package k0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f14021r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ m(q qVar, int i) {
        this.f14020q = i;
        this.f14021r = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // k0.i
    public final double d(double d5) {
        switch (this.f14020q) {
            case 0:
                return D5.a.o(this.f14021r.f14033k.d(d5), r10.f14030e, r10.f);
            default:
                return this.f14021r.f14036n.d(D5.a.o(d5, r0.f14030e, r0.f));
        }
    }
}
