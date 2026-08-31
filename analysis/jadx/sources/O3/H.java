package O3;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends C {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4481s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public H(C0323t0 c0323t0) {
        super(c0323t0);
        ((C0323t0) this.f4346r).f5068Q++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        if (!this.f4481s) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        if (this.f4481s) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (r()) {
            return;
        }
        ((C0323t0) this.f4346r).f5070S.incrementAndGet();
        this.f4481s = true;
    }

    public abstract boolean r();
}
