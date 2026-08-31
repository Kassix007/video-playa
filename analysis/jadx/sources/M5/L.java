package M5;

/* JADX INFO: loaded from: classes.dex */
public final class L implements X {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3815q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L(boolean z5) {
        this.f3815q = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.X
    public final boolean b() {
        return this.f3815q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.X
    public final k0 d() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.S.p(new StringBuilder("Empty{"), this.f3815q ? "Active" : "New", '}');
    }
}
