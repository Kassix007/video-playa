package M5;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import q5.InterfaceC1529h;

/* JADX INFO: renamed from: M5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0264z extends Q implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final RunnableC0264z f3909x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f3910y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Long l7;
        RunnableC0264z runnableC0264z = new RunnableC0264z();
        f3909x = runnableC0264z;
        runnableC0264z.d0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l7 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l7 = 1000L;
        }
        f3910y = timeUnit.toNanos(l7.longValue());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.S
    public final Thread c0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f3909x.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.S
    public final void g0(long j, O o6) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.Q
    public final void h0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.h0(runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void m0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            Q.f3822u.set(this, null);
            Q.f3823v.set(this, null);
            notifyAll();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.Q, M5.C
    public final J n(long j, v0 v0Var, InterfaceC1529h interfaceC1529h) {
        long j7 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j7 >= 4611686018427387903L) {
            return m0.f3871q;
        }
        long jNanoTime = System.nanoTime();
        N n7 = new N(j7 + jNanoTime, v0Var);
        l0(jNanoTime, n7);
        return n7;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[SPUT, INVOKE, INVOKE]}, finally: {[SPUT, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zK0;
        s0.f3883a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zK0) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jE0 = e0();
                    if (jE0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f3910y + jNanoTime;
                        }
                        long j7 = j - jNanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            m0();
                            if (k0()) {
                                return;
                            }
                            c0();
                            return;
                        }
                        if (jE0 > j7) {
                            jE0 = j7;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jE0 > 0) {
                        int i7 = debugStatus;
                        if (i7 == 2 || i7 == 3) {
                            _thread = null;
                            m0();
                            if (k0()) {
                                return;
                            }
                            c0();
                            return;
                        }
                        LockSupport.parkNanos(this, jE0);
                    }
                }
            }
        } finally {
            _thread = null;
            m0();
            if (!k0()) {
                c0();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.Q, M5.S
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        return "DefaultExecutor";
    }
}
