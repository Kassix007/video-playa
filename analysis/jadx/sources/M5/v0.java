package M5;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends R5.r implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f3891u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v0(long j, w0 w0Var) {
        super(w0Var, w0Var.getContext());
        this.f3891u = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final String P() {
        return super.P() + "(timeMillis=" + this.f3891u + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0263y.l(this.f3835s);
        s(new u0("Timed out waiting for " + this.f3891u + " ms", this));
    }
}
