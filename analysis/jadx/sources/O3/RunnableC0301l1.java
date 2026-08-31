package O3;

import java.util.Objects;

/* JADX INFO: renamed from: O3.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0301l1 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0304m1 f4957r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0301l1(C0304m1 c0304m1, int i) {
        this.f4956q = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c0304m1);
                this.f4957r = c0304m1;
                break;
            default:
                Objects.requireNonNull(c0304m1);
                this.f4957r = c0304m1;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4956q) {
            case 0:
                C0304m1 c0304m1 = this.f4957r;
                c0304m1.f4967v = c0304m1.f4962A;
                break;
            default:
                this.f4957r.f4962A = null;
                break;
        }
    }
}
