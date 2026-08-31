package M5;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class I implements J {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ScheduledFuture f3812q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(ScheduledFuture scheduledFuture) {
        this.f3812q = scheduledFuture;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.J
    public final void a() {
        this.f3812q.cancel(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DisposableFutureHandle[" + this.f3812q + ']';
    }
}
