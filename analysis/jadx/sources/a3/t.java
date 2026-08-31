package a3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8876c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ t(y yVar, int i, int i7) {
        this.f8874a = yVar;
        this.f8875b = i;
        this.f8876c = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a3.x
    public final void run() {
        y yVar = this.f8874a;
        C0632k c0632k = yVar.f8920q;
        int i = this.f8875b;
        int i7 = this.f8876c;
        if (c0632k == null) {
            yVar.f8925v.add(new t(yVar, i, i7));
        } else {
            yVar.f8921r.i(i, i7 + 0.99f);
        }
    }
}
