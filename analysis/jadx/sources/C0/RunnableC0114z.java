package C0;

/* JADX INFO: renamed from: C0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0114z implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1158q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B5.a f1159r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0114z(B5.a aVar, int i) {
        this.f1158q = i;
        this.f1159r = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1158q) {
            case 0:
                this.f1159r.invoke();
                break;
            case 1:
                this.f1159r.invoke();
                break;
            case 2:
                this.f1159r.invoke();
                break;
            default:
                this.f1159r.invoke();
                break;
        }
    }
}
