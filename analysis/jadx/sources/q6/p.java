package q6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class p extends I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public I f16076e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(I delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f16076e = delegate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final I a() {
        return this.f16076e.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final I b() {
        return this.f16076e.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final long c() {
        return this.f16076e.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final I d(long j) {
        return this.f16076e.d(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final boolean e() {
        return this.f16076e.e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final void f() throws InterruptedIOException {
        this.f16076e.f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q6.I
    public final I g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(unit, "unit");
        return this.f16076e.g(j);
    }
}
