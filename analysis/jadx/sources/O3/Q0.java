package O3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f4559q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f4560r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ Q0(int i, Object obj) {
        this.f4559q = i;
        this.f4560r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4559q) {
            case 0:
                C0312p0 c0312p0 = ((C0323t0) ((C0271b1) this.f4560r).f4346r).f5078w;
                C0323t0.l(c0312p0);
                c0312p0.x(runnable);
                return;
            case 1:
                ((I3.e) this.f4560r).post(runnable);
                return;
            default:
                Handler handler = (Handler) this.f4560r;
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public Q0() {
        this.f4559q = 1;
        I3.e eVar = new I3.e(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f4560r = eVar;
    }
}
