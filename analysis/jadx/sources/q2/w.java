package q2;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(ViewGroup viewGroup, boolean z5) {
        viewGroup.suppressLayout(z5);
    }
}
