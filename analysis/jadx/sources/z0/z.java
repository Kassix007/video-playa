package z0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC1932I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18741c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ z(int i, Object obj) {
        this.f18740b = i;
        this.f18741c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1932I
    public final W0.l b() {
        switch (this.f18740b) {
            case 0:
                return ((B0.T) this.f18741c).getLayoutDirection();
            default:
                return ((C0.A) this.f18741c).getLayoutDirection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.AbstractC1932I
    public final int c() {
        switch (this.f18740b) {
            case 0:
                return ((B0.T) this.f18741c).N();
            default:
                return ((C0.A) this.f18741c).getRoot().f269V.f311p.f18664q;
        }
    }
}
