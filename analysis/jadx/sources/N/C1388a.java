package n;

import android.os.Looper;

/* JADX INFO: renamed from: n.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1388a extends D5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile C1388a f15118e;
    public static final a2.c f = new a2.c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1390c f15119d = new C1390c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1388a Q() {
        if (f15118e != null) {
            return f15118e;
        }
        synchronized (C1388a.class) {
            try {
                if (f15118e == null) {
                    f15118e = new C1388a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f15118e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void R(Runnable runnable) {
        C1390c c1390c = this.f15119d;
        if (c1390c.f == null) {
            synchronized (c1390c.f15121d) {
                try {
                    if (c1390c.f == null) {
                        c1390c.f = C1390c.Q(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c1390c.f.post(runnable);
    }
}
