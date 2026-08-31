package I3;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2415a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f2415a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
