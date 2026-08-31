package O3;

import B0.C0050o;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class E1 extends H {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public I3.e f4357t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k3.c f4359v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D1 f4360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0050o f4361x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public E1(C0323t0 c0323t0) {
        super(c0323t0);
        this.f4358u = true;
        this.f4359v = new k3.c(this);
        this.f4360w = new D1(this);
        C0050o c0050o = new C0050o();
        c0050o.f500r = this;
        this.f4361x = c0050o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.H
    public final boolean r() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        o();
        if (this.f4357t == null) {
            this.f4357t = new I3.e(Looper.getMainLooper(), 3);
        }
    }
}
