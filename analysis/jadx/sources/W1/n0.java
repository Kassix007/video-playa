package w1;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(int i) {
        int iStatusBars;
        int i7 = 0;
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i & i8) != 0) {
                if (i8 == 1) {
                    iStatusBars = WindowInsets.Type.statusBars();
                } else if (i8 == 2) {
                    iStatusBars = WindowInsets.Type.navigationBars();
                } else if (i8 == 4) {
                    iStatusBars = WindowInsets.Type.captionBar();
                } else if (i8 == 8) {
                    iStatusBars = WindowInsets.Type.ime();
                } else if (i8 == 16) {
                    iStatusBars = WindowInsets.Type.systemGestures();
                } else if (i8 == 32) {
                    iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i8 == 64) {
                    iStatusBars = WindowInsets.Type.tappableElement();
                } else if (i8 == 128) {
                    iStatusBars = WindowInsets.Type.displayCutout();
                } else if (i8 == 512) {
                    iStatusBars = WindowInsets.Type.systemOverlays();
                }
                i7 |= iStatusBars;
            }
        }
        return i7;
    }
}
