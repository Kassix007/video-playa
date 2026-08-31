package n;

import A1.k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: n.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1390c extends D5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15121d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f15122e = Executors.newFixedThreadPool(4, new ThreadFactoryC1389b());
    public volatile Handler f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Handler Q(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return k.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
