package m;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f14790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f14791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f14792c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f14792c = Build.VERSION.SDK_INT >= 27;
    }
}
