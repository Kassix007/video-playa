package C;

/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.n implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ E.A f626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f629u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(E.A a7, long j, int i, int i7, int i8) {
        super(3);
        this.f625q = i8;
        this.f626r = a7;
        this.f627s = j;
        this.f628t = i;
        this.f629u = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f625q) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int i = iIntValue + this.f628t;
                long j = this.f627s;
                int iF = W0.b.f(i, j);
                int iE = W0.b.e(iIntValue2 + this.f629u, j);
                return this.f626r.f1471r.f(iF, iE, n5.t.f15300q, (B5.c) obj3);
            case 1:
                int iIntValue3 = ((Number) obj).intValue();
                int iIntValue4 = ((Number) obj2).intValue();
                int i7 = iIntValue3 + this.f628t;
                long j7 = this.f627s;
                int iF2 = W0.b.f(i7, j7);
                int iE2 = W0.b.e(iIntValue4 + this.f629u, j7);
                return this.f626r.f1471r.f(iF2, iE2, n5.t.f15300q, (B5.c) obj3);
            default:
                int iIntValue5 = ((Number) obj).intValue();
                int iIntValue6 = ((Number) obj2).intValue();
                int i8 = iIntValue5 + this.f628t;
                long j8 = this.f627s;
                int iF3 = W0.b.f(i8, j8);
                int iE3 = W0.b.e(iIntValue6 + this.f629u, j8);
                return this.f626r.f1471r.f(iF3, iE3, n5.t.f15300q, (B5.c) obj3);
        }
    }
}
