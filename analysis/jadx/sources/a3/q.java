package a3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f8865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8866c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ q(y yVar, int i, int i7) {
        this.f8864a = i7;
        this.f8865b = yVar;
        this.f8866c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a3.x
    public final void run() {
        switch (this.f8864a) {
            case 0:
                this.f8865b.p(this.f8866c);
                break;
            case 1:
                this.f8865b.s(this.f8866c);
                break;
            default:
                this.f8865b.o(this.f8866c);
                break;
        }
    }
}
