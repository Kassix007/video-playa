package q6;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: q6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1535d extends I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f16055h;
    public static final Condition i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f16056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C1535d f16057l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16058e;
    public C1535d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16059g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f16055h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.m.d(conditionNewCondition, "newCondition(...)");
        i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f16056k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        long j7 = this.f16043c;
        boolean z5 = this.f16041a;
        if (j7 != 0 || z5) {
            ReentrantLock reentrantLock = f16055h;
            reentrantLock.lock();
            try {
                if (this.f16058e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f16058e = 1;
                O3.D.l(this, j7, z5);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i() {
        ReentrantLock reentrantLock = f16055h;
        reentrantLock.lock();
        try {
            int i7 = this.f16058e;
            this.f16058e = 0;
            if (i7 != 1) {
                return i7 == 2;
            }
            C1535d c1535d = f16057l;
            while (c1535d != null) {
                C1535d c1535d2 = c1535d.f;
                if (c1535d2 == this) {
                    c1535d.f = this.f;
                    this.f = null;
                    return false;
                }
                c1535d = c1535d2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
