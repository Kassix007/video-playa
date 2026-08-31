package k1;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: k1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1176d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Notification.Builder builder, boolean z5) {
        builder.setAllowSystemGeneratedContextualActions(z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
