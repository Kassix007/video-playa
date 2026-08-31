package M5;

/* JADX INFO: loaded from: classes.dex */
public abstract class S extends AbstractC0257s {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f3825t = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n5.j f3828s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a0(boolean z5) {
        long j = this.f3826q - (z5 ? 4294967296L : 1L);
        this.f3826q = j;
        if (j <= 0 && this.f3827r) {
            shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b0(F f) {
        n5.j jVar = this.f3828s;
        if (jVar == null) {
            jVar = new n5.j();
            this.f3828s = jVar;
        }
        jVar.addLast(f);
    }

    public abstract Thread c0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d0(boolean z5) {
        this.f3826q = (z5 ? 4294967296L : 1L) + this.f3826q;
        if (z5) {
            return;
        }
        this.f3827r = true;
    }

    public abstract long e0();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean f0() {
        n5.j jVar = this.f3828s;
        if (jVar == null) {
            return false;
        }
        F f = (F) (jVar.isEmpty() ? null : jVar.removeFirst());
        if (f == null) {
            return false;
        }
        f.run();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void g0(long j, O o6) {
        RunnableC0264z.f3909x.l0(j, o6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final AbstractC0257s limitedParallelism(int i, String str) {
        R5.b.a(i);
        return str != null ? new R5.o(this, str) : this;
    }

    public abstract void shutdown();
}
