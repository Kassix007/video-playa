package O3;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0312p0 extends E0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final AtomicLong f5010B = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final Semaphore f5011A;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C0309o0 f5012t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0309o0 f5013u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final PriorityBlockingQueue f5014v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedBlockingQueue f5015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0303m0 f5016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0303m0 f5017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f5018z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0312p0(C0323t0 c0323t0) {
        super(c0323t0);
        this.f5018z = new Object();
        this.f5011A = new Semaphore(2);
        this.f5014v = new PriorityBlockingQueue();
        this.f5015w = new LinkedBlockingQueue();
        this.f5016x = new C0303m0(this, "Thread death: Uncaught exception on worker thread");
        this.f5017y = new C0303m0(this, "Thread death: Uncaught exception on network thread");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(Runnable runnable) {
        q();
        C0306n0 c0306n0 = new C0306n0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f5018z) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.f5015w;
                linkedBlockingQueue.add(c0306n0);
                C0309o0 c0309o0 = this.f5013u;
                if (c0309o0 == null) {
                    C0309o0 c0309o02 = new C0309o0(this, "Measurement Network", linkedBlockingQueue);
                    this.f5013u = c0309o02;
                    c0309o02.setUncaughtExceptionHandler(this.f5017y);
                    this.f5013u.start();
                } else {
                    Object obj = c0309o0.f5000q;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(C0306n0 c0306n0) {
        synchronized (this.f5018z) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f5014v;
                priorityBlockingQueue.add(c0306n0);
                C0309o0 c0309o0 = this.f5012t;
                if (c0309o0 == null) {
                    C0309o0 c0309o02 = new C0309o0(this, "Measurement Worker", priorityBlockingQueue);
                    this.f5012t = c0309o02;
                    c0309o02.setUncaughtExceptionHandler(this.f5016x);
                    this.f5012t.start();
                } else {
                    Object obj = c0309o0.f5000q;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.D0
    public final void o() {
        if (Thread.currentThread() != this.f5012t) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.E0
    public final boolean p() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void s() {
        if (Thread.currentThread() != this.f5013u) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t() {
        if (Thread.currentThread() == this.f5012t) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean u() {
        return Thread.currentThread() == this.f5012t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0306n0 v(Callable callable) {
        q();
        C0306n0 c0306n0 = new C0306n0(this, callable, false);
        if (Thread.currentThread() != this.f5012t) {
            B(c0306n0);
            return c0306n0;
        }
        if (!this.f5014v.isEmpty()) {
            X x6 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4673z.b("Callable skipped the worker queue.");
        }
        c0306n0.run();
        return c0306n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0306n0 w(Callable callable) {
        q();
        C0306n0 c0306n0 = new C0306n0(this, callable, true);
        if (Thread.currentThread() == this.f5012t) {
            c0306n0.run();
            return c0306n0;
        }
        B(c0306n0);
        return c0306n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(Runnable runnable) {
        q();
        AbstractC1887A.g(runnable);
        B(new C0306n0(this, runnable, false, "Task exception on worker thread"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object y(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            C0312p0 c0312p0 = ((C0323t0) this.f4346r).f5078w;
            C0323t0.l(c0312p0);
            c0312p0.x(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                X x6 = ((C0323t0) this.f4346r).f5077v;
                C0323t0.l(x6);
                V v6 = x6.f4673z;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                v6.b(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            X x7 = ((C0323t0) this.f4346r).f5077v;
            C0323t0.l(x7);
            x7.f4673z.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(Runnable runnable) {
        q();
        B(new C0306n0(this, runnable, true, "Task exception on worker thread"));
    }
}
