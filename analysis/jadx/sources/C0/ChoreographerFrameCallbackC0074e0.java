package C0;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: C0.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0074e0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0076f0 f1025q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ChoreographerFrameCallbackC0074e0(C0076f0 c0076f0) {
        this.f1025q = c0076f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f1025q.f1029r.removeCallbacks(this);
        C0076f0.a0(this.f1025q);
        C0076f0 c0076f0 = this.f1025q;
        synchronized (c0076f0.f1030s) {
            if (c0076f0.f1035x) {
                c0076f0.f1035x = false;
                ArrayList arrayList = c0076f0.f1032u;
                c0076f0.f1032u = c0076f0.f1033v;
                c0076f0.f1033v = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        C0076f0.a0(this.f1025q);
        C0076f0 c0076f0 = this.f1025q;
        synchronized (c0076f0.f1030s) {
            if (c0076f0.f1032u.isEmpty()) {
                c0076f0.f1028q.removeFrameCallback(this);
                c0076f0.f1035x = false;
            }
        }
    }
}
