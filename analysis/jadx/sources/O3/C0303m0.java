package O3;

import java.lang.Thread;

/* JADX INFO: renamed from: O3.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0303m0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0312p0 f4961b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0303m0(C0312p0 c0312p0, String str) {
        this.f4961b = c0312p0;
        this.f4960a = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        X x6 = ((C0323t0) this.f4961b.f4346r).f5077v;
        C0323t0.l(x6);
        x6.f4670w.c(th, this.f4960a);
    }
}
