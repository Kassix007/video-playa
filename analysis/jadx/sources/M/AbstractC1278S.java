package m;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: m.S, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1278S {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
