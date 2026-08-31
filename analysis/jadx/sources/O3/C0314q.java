package O3;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: O3.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0314q extends E0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5021t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f5022u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // O3.E0
    public final boolean p() {
        Calendar calendar = Calendar.getInstance();
        this.f5021t = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f5022u = sb.toString();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long s() {
        q();
        return this.f5021t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String t() {
        q();
        return this.f5022u;
    }
}
