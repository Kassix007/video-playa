package M5;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class U extends T implements C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Executor f3829q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(Executor executor) {
        Method method;
        this.f3829q = executor;
        Method method2 = R5.a.f7225a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = R5.a.f7225a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.T
    public final Executor a0() {
        return this.f3829q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f3829q;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        try {
            this.f3829q.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            AbstractC0263y.f(interfaceC1529h, cancellationException);
            T5.e eVar = H.f3811a;
            T5.d.f7468q.dispatch(interfaceC1529h, runnable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof U) && ((U) obj).f3829q == this.f3829q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return System.identityHashCode(this.f3829q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final J n(long j, v0 v0Var, InterfaceC1529h interfaceC1529h) {
        Executor executor = this.f3829q;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(v0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                AbstractC0263y.f(interfaceC1529h, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new I(scheduledFutureSchedule) : RunnableC0264z.f3909x.n(j, v0Var, interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        return this.f3829q.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final void z(long j, C0247h c0247h) {
        Executor executor = this.f3829q;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            I4.a aVar = new I4.a(2, this, c0247h);
            InterfaceC1529h interfaceC1529h = c0247h.f3858u;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(aVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                AbstractC0263y.f(interfaceC1529h, cancellationException);
            }
        }
        if (scheduledFutureSchedule != null) {
            c0247h.v(new C0244e(0, scheduledFutureSchedule));
        } else {
            RunnableC0264z.f3909x.z(j, c0247h);
        }
    }
}
