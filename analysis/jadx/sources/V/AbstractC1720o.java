package v;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: v.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1720o {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float b(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static float c(EdgeEffect edgeEffect, float f, float f7) {
        try {
            return edgeEffect.onPullDistance(f, f7);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f7);
            return 0.0f;
        }
    }
}
