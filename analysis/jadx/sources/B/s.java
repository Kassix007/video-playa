package b;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class s extends r {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // b.q, com.google.android.gms.internal.measurement.I1
    public void G(Window window) {
        kotlin.jvm.internal.m.e(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}
