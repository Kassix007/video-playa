package a3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f8872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8873c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s(y yVar, float f, int i) {
        this.f8871a = i;
        this.f8872b = yVar;
        this.f8873c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a3.x
    public final void run() {
        switch (this.f8871a) {
            case 0:
                y yVar = this.f8872b;
                C0632k c0632k = yVar.f8920q;
                float f = this.f8873c;
                if (c0632k != null) {
                    n3.e eVar = yVar.f8921r;
                    eVar.i(eVar.f15171z, n3.g.f(c0632k.f8841l, c0632k.f8842m, f));
                } else {
                    yVar.f8925v.add(new s(yVar, f, 0));
                }
                break;
            case 1:
                y yVar2 = this.f8872b;
                C0632k c0632k2 = yVar2.f8920q;
                float f7 = this.f8873c;
                if (c0632k2 != null) {
                    yVar2.s((int) n3.g.f(c0632k2.f8841l, c0632k2.f8842m, f7));
                } else {
                    yVar2.f8925v.add(new s(yVar2, f7, 1));
                }
                break;
            default:
                this.f8872b.u(this.f8873c);
                break;
        }
    }
}
