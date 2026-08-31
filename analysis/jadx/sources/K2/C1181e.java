package k2;

/* JADX INFO: renamed from: k2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1181e extends RuntimeException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f14094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Throwable f14095r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181e(int i, Throwable th) {
        super(th);
        k1.i.p(i, "callbackName");
        this.f14094q = i;
        this.f14095r = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f14095r;
    }
}
