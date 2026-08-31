package androidx.work.impl.background.greedy;

import N5.c;
import androidx.work.RunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncher;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class TimeLimiter {
    private final WorkLauncher launcher;
    private final Object lock;
    private final RunnableScheduler runnableScheduler;
    private final long timeoutMs;
    private final Map<StartStopToken, Runnable> tracked;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        m.e(runnableScheduler, "runnableScheduler");
        m.e(launcher, "launcher");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void track$lambda$0(TimeLimiter timeLimiter, StartStopToken startStopToken) {
        timeLimiter.launcher.stopWork(startStopToken, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void cancel(StartStopToken token) {
        Runnable runnableRemove;
        m.e(token, "token");
        synchronized (this.lock) {
            runnableRemove = this.tracked.remove(token);
        }
        if (runnableRemove != null) {
            this.runnableScheduler.cancel(runnableRemove);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void track(StartStopToken token) {
        m.e(token, "token");
        c cVar = new c(3, this, token);
        synchronized (this.lock) {
            this.tracked.put(token, cVar);
        }
        this.runnableScheduler.scheduleWithDelay(this.timeoutMs, cVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher launcher, long j) {
        m.e(runnableScheduler, "runnableScheduler");
        m.e(launcher, "launcher");
        this.runnableScheduler = runnableScheduler;
        this.launcher = launcher;
        this.timeoutMs = j;
        this.lock = new Object();
        this.tracked = new LinkedHashMap();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r1v0 androidx.work.RunnableScheduler)
  (r2v0 androidx.work.impl.WorkLauncher)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0008: INVOKE 
  (wrap:java.util.concurrent.TimeUnit:0x0004: SGET  A[WRAPPED] (LINE:8) java.util.concurrent.TimeUnit.MINUTES java.util.concurrent.TimeUnit)
  (90 long)
 VIRTUAL call: java.util.concurrent.TimeUnit.toMillis(long):long A[MD:(long):long (c), WRAPPED] (LINE:8)) : (r3v0 long))
 A[MD:(androidx.work.RunnableScheduler, androidx.work.impl.WorkLauncher, long):void (m)] (LINE:9) call: androidx.work.impl.background.greedy.TimeLimiter.<init>(androidx.work.RunnableScheduler, androidx.work.impl.WorkLauncher, long):void type: THIS */
    public /* synthetic */ TimeLimiter(RunnableScheduler runnableScheduler, WorkLauncher workLauncher, long j, int i, g gVar) {
        this(runnableScheduler, workLauncher, (i & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j);
    }
}
