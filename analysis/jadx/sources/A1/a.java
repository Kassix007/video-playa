package A1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f177e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f179h;
    public int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a(long j) {
        if (j < this.f177e) {
            return 0.0f;
        }
        long j7 = this.f178g;
        if (j7 < 0 || j < j7) {
            return e.b((j - r0) / this.f173a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f179h;
        return (e.b((j - j7) / this.i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
