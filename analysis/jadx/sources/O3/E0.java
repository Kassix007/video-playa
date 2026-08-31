package O3;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 extends D0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4356s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E0(C0323t0 c0323t0) {
        super(c0323t0);
        ((C0323t0) this.f4346r).f5068Q++;
    }

    public abstract boolean p();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        if (!this.f4356s) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void r() {
        if (this.f4356s) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (p()) {
            return;
        }
        ((C0323t0) this.f4346r).f5070S.incrementAndGet();
        this.f4356s = true;
    }
}
