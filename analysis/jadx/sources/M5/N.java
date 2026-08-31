package M5;

/* JADX INFO: loaded from: classes.dex */
public final class N extends O {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v0 f3818s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public N(long j, v0 v0Var) {
        super(j);
        this.f3818s = v0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        this.f3818s.run();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.O
    public final String toString() {
        return super.toString() + this.f3818s;
    }
}
