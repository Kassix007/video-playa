package z0;

/* JADX INFO: renamed from: z0.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1933J {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f18666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f18667t = AbstractC1935L.f18672a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f18668u = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1933J() {
        long j = 0;
        this.f18666s = (j & 4294967295L) | (j << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int K() {
        return (int) (this.f18666s & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int N() {
        return (int) (this.f18666s >> 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void S() {
        this.f18664q = D5.a.q((int) (this.f18666s >> 32), W0.a.j(this.f18667t), W0.a.h(this.f18667t));
        int iQ = D5.a.q((int) (this.f18666s & 4294967295L), W0.a.i(this.f18667t), W0.a.g(this.f18667t));
        this.f18665r = iQ;
        int i = this.f18664q;
        long j = this.f18666s;
        this.f18668u = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iQ - ((int) (j & 4294967295L))) / 2)));
    }

    public abstract void U(long j, float f, B5.c cVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void W(long j) {
        if (W0.k.a(this.f18666s, j)) {
            return;
        }
        this.f18666s = j;
        S();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void X(long j) {
        if (W0.a.b(this.f18667t, j)) {
            return;
        }
        this.f18667t = j;
        S();
    }

    public abstract Object g();
}
