package O3;

import B0.C0050o;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class B1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f4327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f4328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0050o f4329s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public B1(C0050o c0050o, long j, long j7) {
        Objects.requireNonNull(c0050o);
        this.f4329s = c0050o;
        this.f4327q = j;
        this.f4328r = j7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0312p0 c0312p0 = ((C0323t0) ((E1) this.f4329s.f500r).f4346r).f5078w;
        C0323t0.l(c0312p0);
        c0312p0.x(new A1.b(9, this));
    }
}
