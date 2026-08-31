package w1;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: w1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1827C {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static o0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        o0 o0VarG = o0.g(null, rootWindowInsets);
        l0 l0Var = o0VarG.f18232a;
        l0Var.t(o0VarG);
        l0Var.d(view.getRootView());
        return o0VarG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(View view, int i, int i7) {
        view.setScrollIndicators(i, i7);
    }
}
