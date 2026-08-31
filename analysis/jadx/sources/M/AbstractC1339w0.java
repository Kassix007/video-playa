package m;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: m.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1339w0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(PopupWindow popupWindow, View view, int i, boolean z5) {
        return popupWindow.getMaxAvailableHeight(view, i, z5);
    }
}
