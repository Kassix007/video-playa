package O3;

/* JADX INFO: renamed from: O3.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0298k1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0295j1 f4937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0295j1 f4938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f4940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0304m1 f4941u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0298k1(C0304m1 c0304m1, C0295j1 c0295j1, C0295j1 c0295j12, long j, boolean z5) {
        this.f4937q = c0295j1;
        this.f4938r = c0295j12;
        this.f4939s = j;
        this.f4940t = z5;
        this.f4941u = c0304m1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f4941u.y(this.f4937q, this.f4938r, this.f4939s, this.f4940t, null);
    }
}
