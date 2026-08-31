package d6;

import C0.S;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f12346k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f12347l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f12348m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12353e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12355h;
    public final boolean i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(String str, String str2, long j7, String str3, String str4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f12349a = str;
        this.f12350b = str2;
        this.f12351c = j7;
        this.f12352d = str3;
        this.f12353e = str4;
        this.f = z5;
        this.f12354g = z6;
        this.f12355h = z7;
        this.i = z8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.m.a(jVar.f12349a, this.f12349a) && kotlin.jvm.internal.m.a(jVar.f12350b, this.f12350b) && jVar.f12351c == this.f12351c && kotlin.jvm.internal.m.a(jVar.f12352d, this.f12352d) && kotlin.jvm.internal.m.a(jVar.f12353e, this.f12353e) && jVar.f == this.f && jVar.f12354g == this.f12354g && jVar.f12355h == this.f12355h && jVar.i == this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.i) + k1.i.e(k1.i.e(k1.i.e(S.h(this.f12353e, S.h(this.f12352d, k1.i.d(S.h(this.f12350b, S.h(this.f12349a, 527, 31), 31), 31, this.f12351c), 31), 31), 31, this.f), 31, this.f12354g), 31, this.f12355h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12349a);
        sb.append('=');
        sb.append(this.f12350b);
        if (this.f12355h) {
            long j7 = this.f12351c;
            if (j7 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) i6.c.f13645a.get()).format(new Date(j7));
                kotlin.jvm.internal.m.d(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.f12352d);
        }
        sb.append("; path=");
        sb.append(this.f12353e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.f12354g) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString()");
        return string;
    }
}
