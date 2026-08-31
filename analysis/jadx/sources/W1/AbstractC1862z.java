package w1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: w1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1862z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        int i = AbstractC1837M.f18155a;
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(View view) {
        view.requestApplyInsets();
    }
}
