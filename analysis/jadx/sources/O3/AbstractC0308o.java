package O3;

import android.os.Handler;
import x3.AbstractC1887A;

/* JADX INFO: renamed from: O3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0308o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile I3.e f4996d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0 f4997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I4.a f4998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f4999c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0308o(F0 f02) {
        AbstractC1887A.g(f02);
        this.f4997a = f02;
        this.f4998b = new I4.a(3, (Object) this, (Object) f02, false);
    }

    public abstract void a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(long j) {
        c();
        if (j >= 0) {
            F0 f02 = this.f4997a;
            f02.e().getClass();
            this.f4999c = System.currentTimeMillis();
            if (d().postDelayed(this.f4998b, j)) {
                return;
            }
            f02.b().f4670w.c(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        this.f4999c = 0L;
        d().removeCallbacks(this.f4998b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Handler d() {
        I3.e eVar;
        if (f4996d != null) {
            return f4996d;
        }
        synchronized (AbstractC0308o.class) {
            try {
                if (f4996d == null) {
                    f4996d = new I3.e(this.f4997a.d().getMainLooper(), 3);
                }
                eVar = f4996d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
