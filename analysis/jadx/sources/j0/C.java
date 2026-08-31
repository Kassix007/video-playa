package j0;

/* JADX INFO: loaded from: classes.dex */
public final class C implements W0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13662A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f13663B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public W0.c f13664C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public W0.l f13665D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AbstractC1145B f13666E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f13668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f13669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f13670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f13671u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13672v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f13674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f13675y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public E f13676z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f) {
        if (this.f13670t == f) {
            return;
        }
        this.f13667q |= 4;
        this.f13670t = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f13664C.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(float f) {
        if (this.f13668r == f) {
            return;
        }
        this.f13667q |= 1;
        this.f13668r = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(float f) {
        if (this.f13669s == f) {
            return;
        }
        this.f13667q |= 2;
        this.f13669s = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(long j) {
        if (H.a(this.f13675y, j)) {
            return;
        }
        this.f13667q |= 4096;
        this.f13675y = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f13664C.l();
    }
}
