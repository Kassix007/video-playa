package q2;

import android.os.Build;

/* JADX INFO: renamed from: q2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1516u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f16001a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        f16001a = Build.VERSION.SDK_INT >= 28;
    }
}
