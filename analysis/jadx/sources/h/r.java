package h;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static r1.e b(Configuration configuration) {
        return r1.e.a(configuration.getLocales().toLanguageTags());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(r1.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f16276a.f16277a.toLanguageTags()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(Configuration configuration, r1.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f16276a.f16277a.toLanguageTags()));
    }
}
