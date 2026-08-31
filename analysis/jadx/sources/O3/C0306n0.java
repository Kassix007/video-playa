package O3;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: O3.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0306n0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f4985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f4986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f4987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0312p0 f4988t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306n0(C0312p0 c0312p0, Runnable runnable, boolean z5, String str) {
        super(runnable, null);
        this.f4988t = c0312p0;
        long andIncrement = C0312p0.f5010B.getAndIncrement();
        this.f4985q = andIncrement;
        this.f4987s = str;
        this.f4986r = z5;
        if (andIncrement == Long.MAX_VALUE) {
            X x6 = ((C0323t0) c0312p0.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Tasks index overflow");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0306n0 c0306n0 = (C0306n0) obj;
        boolean z5 = c0306n0.f4986r;
        boolean z6 = this.f4986r;
        if (z6 != z5) {
            return !z6 ? 1 : -1;
        }
        long j = c0306n0.f4985q;
        long j7 = this.f4985q;
        if (j7 < j) {
            return -1;
        }
        if (j7 > j) {
            return 1;
        }
        X x6 = ((C0323t0) this.f4988t.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4671x.c(Long.valueOf(j7), "Two tasks share the same index. index");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        X x6 = ((C0323t0) this.f4988t.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4670w.c(th, this.f4987s);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0306n0(C0312p0 c0312p0, Callable callable, boolean z5) {
        super(callable);
        this.f4988t = c0312p0;
        long andIncrement = C0312p0.f5010B.getAndIncrement();
        this.f4985q = andIncrement;
        this.f4987s = "Task exception on worker thread";
        this.f4986r = z5;
        if (andIncrement == Long.MAX_VALUE) {
            X x6 = ((C0323t0) c0312p0.f4346r).f5077v;
            C0323t0.l(x6);
            x6.f4670w.b("Tasks index overflow");
        }
    }
}
