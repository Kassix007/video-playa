package h;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
