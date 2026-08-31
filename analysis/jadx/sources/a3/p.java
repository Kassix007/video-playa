package a3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f8862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f8863c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ p(y yVar, String str, int i) {
        this.f8861a = i;
        this.f8862b = yVar;
        this.f8863c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a3.x
    public final void run() {
        switch (this.f8861a) {
            case 0:
                this.f8862b.r(this.f8863c);
                break;
            case 1:
                this.f8862b.q(this.f8863c);
                break;
            default:
                this.f8862b.t(this.f8863c);
                break;
        }
    }
}
