package a3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes.dex */
public final class E extends FutureTask {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F f8795q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.f8795q.d((D) get());
            } catch (InterruptedException | ExecutionException e7) {
                this.f8795q.d(new D(e7));
            }
        } finally {
            this.f8795q = null;
        }
    }
}
