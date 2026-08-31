package S3;

import O5.o;
import com.google.android.gms.internal.measurement.O1;
import java.util.concurrent.Executor;
import x3.AbstractC1887A;

/* JADX INFO: loaded from: classes.dex */
public final class k extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7316a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O1 f7317b = new O1(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f7320e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.d
    public final k a(Executor executor, c cVar) {
        this.f7317b.e(new h(executor, cVar));
        i();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.d
    public final Exception b() {
        Exception exc;
        synchronized (this.f7316a) {
            exc = this.f7320e;
        }
        return exc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.d
    public final Object c() {
        Object obj;
        synchronized (this.f7316a) {
            try {
                AbstractC1887A.i(this.f7318c, "Task is not yet complete");
                Exception exc = this.f7320e;
                if (exc != null) {
                    throw new C2.e(exc);
                }
                obj = this.f7319d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // S3.d
    public final boolean d() {
        boolean z5;
        synchronized (this.f7316a) {
            try {
                z5 = false;
                if (this.f7318c && this.f7320e == null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k e(a aVar) {
        this.f7317b.e(new h(f.f7307a, aVar));
        i();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(Exception exc) {
        synchronized (this.f7316a) {
            h();
            this.f7318c = true;
            this.f7320e = exc;
        }
        this.f7317b.g(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(Object obj) {
        synchronized (this.f7316a) {
            h();
            this.f7318c = true;
            this.f7319d = obj;
        }
        this.f7317b.g(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        boolean z5;
        if (this.f7318c) {
            int i = o.f5253q;
            synchronized (this.f7316a) {
                z5 = this.f7318c;
            }
            if (!z5) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excB = b();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        synchronized (this.f7316a) {
            try {
                if (this.f7318c) {
                    this.f7317b.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
