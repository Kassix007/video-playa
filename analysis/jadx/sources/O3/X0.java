package O3;

/* JADX INFO: loaded from: classes.dex */
public final class X0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J0 f4675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f4676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f4677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0271b1 f4678u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ X0(C0271b1 c0271b1, J0 j02, long j, boolean z5, int i) {
        this.f4674q = i;
        this.f4675r = j02;
        this.f4676s = j;
        this.f4677t = z5;
        this.f4678u = c0271b1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4674q) {
            case 0:
                C0271b1 c0271b1 = this.f4678u;
                J0 j02 = this.f4675r;
                c0271b1.s(j02);
                c0271b1.D(j02, this.f4676s, this.f4677t);
                break;
            default:
                C0271b1 c0271b12 = this.f4678u;
                J0 j03 = this.f4675r;
                c0271b12.s(j03);
                c0271b12.D(j03, this.f4676s, this.f4677t);
                break;
        }
    }
}
