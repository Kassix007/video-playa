package P;

/* JADX INFO: renamed from: P.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0369n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5435b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0369n(int i, Object obj) {
        this.f5434a = i;
        this.f5435b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        switch (this.f5434a) {
            case 0:
                C0371o c0371o = (C0371o) this.f5435b;
                c0371o.f5478z--;
                break;
            default:
                a0.s sVar = (a0.s) this.f5435b;
                sVar.j--;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        switch (this.f5434a) {
            case 0:
                ((C0371o) this.f5435b).f5478z++;
                break;
            default:
                ((a0.s) this.f5435b).j++;
                break;
        }
    }
}
