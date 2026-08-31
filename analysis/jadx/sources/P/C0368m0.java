package P;

/* JADX INFO: renamed from: P.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0368m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0366l0 f5429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0 f5431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5433e;
    public boolean f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0368m0(AbstractC0366l0 abstractC0366l0, Object obj, boolean z5, I0 i02, boolean z6) {
        this.f5429a = abstractC0366l0;
        this.f5430b = z5;
        this.f5431c = i02;
        this.f5432d = z6;
        this.f5433e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a() {
        if (this.f5430b) {
            return null;
        }
        Object obj = this.f5433e;
        if (obj != null) {
            return obj;
        }
        AbstractC0373p.d("Unexpected form of a provided value");
        throw new C2.e();
    }
}
