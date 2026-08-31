package T5;

import R5.u;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f7476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f7477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f7480e;
    public static final g f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        String property;
        int i = u.f7270a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f7476a = property;
        f7477b = R5.b.k("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i7 = u.f7270a;
        if (i7 < 2) {
            i7 = 2;
        }
        f7478c = R5.b.l("kotlinx.coroutines.scheduler.core.pool.size", i7, 8);
        f7479d = R5.b.l("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 4);
        f7480e = TimeUnit.SECONDS.toNanos(R5.b.k("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f = g.f7471a;
    }
}
