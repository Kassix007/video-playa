package O3;

import java.util.Objects;

/* JADX INFO: renamed from: O3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0334x implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5115q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f5116r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C f5117s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0334x(A a7, long j) {
        this.f5116r = j;
        Objects.requireNonNull(a7);
        this.f5117s = a7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5115q) {
            case 0:
                ((A) this.f5117s).u(this.f5116r);
                break;
            default:
                C0304m1 c0304m1 = (C0304m1) this.f5117s;
                A a7 = ((C0323t0) c0304m1.f4346r).f5055D;
                C0323t0.i(a7);
                a7.r(this.f5116r);
                c0304m1.f4967v = null;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RunnableC0334x(C0304m1 c0304m1, long j) {
        this.f5116r = j;
        Objects.requireNonNull(c0304m1);
        this.f5117s = c0304m1;
    }
}
