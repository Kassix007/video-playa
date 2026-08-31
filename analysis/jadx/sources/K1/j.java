package k1;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }
}
