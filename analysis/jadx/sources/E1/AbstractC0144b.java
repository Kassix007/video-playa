package E1;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: E1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0144b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
