package O3;

/* JADX INFO: loaded from: classes.dex */
public abstract class O1 extends K1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4546t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public O1(T1 t12) {
        super(t12);
        this.f4510s.f4588H++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p() {
        if (!this.f4546t) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q() {
        if (this.f4546t) {
            throw new IllegalStateException("Can't initialize twice");
        }
        r();
        this.f4510s.f4589I++;
        this.f4546t = true;
    }

    public abstract void r();
}
