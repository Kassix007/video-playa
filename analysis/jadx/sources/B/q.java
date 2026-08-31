package b;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class q extends p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.gms.internal.measurement.I1
    public void G(Window window) {
        kotlin.jvm.internal.m.e(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 1;
    }
}
