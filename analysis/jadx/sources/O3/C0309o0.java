package O3;

import android.os.Process;
import androidx.work.WorkRequest;
import java.util.concurrent.BlockingQueue;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309o0 extends Thread {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f5000q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final BlockingQueue f5001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5002s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0312p0 f5003t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0309o0(C0312p0 c0312p0, String str, BlockingQueue blockingQueue) {
        this.f5003t = c0312p0;
        AbstractC1887A.g(blockingQueue);
        this.f5000q = new Object();
        this.f5001r = blockingQueue;
        setName(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        C0312p0 c0312p0 = this.f5003t;
        synchronized (c0312p0.f5018z) {
            try {
                if (!this.f5002s) {
                    c0312p0.f5011A.release();
                    c0312p0.f5018z.notifyAll();
                    if (this == c0312p0.f5012t) {
                        c0312p0.f5012t = null;
                    } else if (this == c0312p0.f5013u) {
                        c0312p0.f5013u = null;
                    } else {
                        X x6 = ((C0323t0) c0312p0.f4346r).f5077v;
                        C0323t0.l(x6);
                        x6.f4670w.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f5002s = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z5 = false;
        while (!z5) {
            try {
                this.f5003t.f5011A.acquire();
                z5 = true;
            } catch (InterruptedException e7) {
                X x6 = ((C0323t0) this.f5003t.f4346r).f5077v;
                C0323t0.l(x6);
                x6.f4673z.c(e7, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f5001r;
                C0306n0 c0306n0 = (C0306n0) blockingQueue.poll();
                if (c0306n0 != null) {
                    Process.setThreadPriority(true != c0306n0.f4986r ? 10 : threadPriority);
                    c0306n0.run();
                } else {
                    Object obj = this.f5000q;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f5003t.getClass();
                            try {
                                obj.wait(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                            } catch (InterruptedException e8) {
                                X x7 = ((C0323t0) this.f5003t.f4346r).f5077v;
                                C0323t0.l(x7);
                                x7.f4673z.c(e8, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f5003t.f5018z) {
                        if (this.f5001r.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
