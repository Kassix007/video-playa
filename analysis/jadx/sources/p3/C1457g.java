package p3;

/* JADX INFO: renamed from: p3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1457g implements InterfaceC1453e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15770a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: p3.Y */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.InterfaceC1453e
    public final boolean a(Y y6) {
        switch (this.f15770a) {
            case 0:
                if (!(y6 instanceof W) || ((W) y6).f().size() == 0) {
                }
                break;
            case 1:
                if (y6.f15751b == null) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f15770a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
