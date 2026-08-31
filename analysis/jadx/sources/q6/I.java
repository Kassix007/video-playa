package q6;

import C0.S;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class I {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f16040d = new H();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16043c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I a() {
        this.f16041a = false;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I b() {
        this.f16043c = 0L;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long c() {
        if (this.f16041a) {
            return this.f16042b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I d(long j) {
        this.f16041a = true;
        this.f16042b = j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean e() {
        return this.f16041a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f16041a && this.f16042b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(S.k("timeout < 0: ", j).toString());
        }
        this.f16043c = unit.toNanos(j);
        return this;
    }
}
