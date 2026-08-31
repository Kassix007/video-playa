package M5;

/* JADX INFO: renamed from: M5.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0251l extends e0 implements InterfaceC0250k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i0 f3869u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0251l(i0 i0Var) {
        this.f3869u = i0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0250k
    public final boolean c(Throwable th) {
        return j().x(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final boolean k() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final void l(Throwable th) {
        this.f3869u.s(j());
    }
}
