package k;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Window.Callback callback, boolean z5) {
        callback.onPointerCaptureChanged(z5);
    }
}
