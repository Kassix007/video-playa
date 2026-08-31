package f2;

import java.util.Locale;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: f2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1061a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12695e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f12696g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1061a(String str, String str2, boolean z5, int i, String str3, int i7) {
        this.f12691a = str;
        this.f12692b = str2;
        this.f12693c = z5;
        this.f12694d = i;
        this.f12695e = str3;
        this.f = i7;
        Locale US = Locale.US;
        m.d(US, "US");
        String upperCase = str2.toUpperCase(US);
        m.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f12696g = J5.m.K0(upperCase, "INT") ? 3 : (J5.m.K0(upperCase, "CHAR") || J5.m.K0(upperCase, "CLOB") || J5.m.K0(upperCase, "TEXT")) ? 2 : J5.m.K0(upperCase, "BLOB") ? 5 : (J5.m.K0(upperCase, "REAL") || J5.m.K0(upperCase, "FLOA") || J5.m.K0(upperCase, "DOUB")) ? 4 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1061a)) {
                return false;
            }
            C1061a c1061a = (C1061a) obj;
            if (this.f12694d != c1061a.f12694d) {
                return false;
            }
            String str = c1061a.f12691a;
            int i = c1061a.f;
            String str2 = c1061a.f12695e;
            if (!this.f12691a.equals(str) || this.f12693c != c1061a.f12693c) {
                return false;
            }
            String str3 = this.f12695e;
            int i7 = this.f;
            if (i7 == 1 && i == 2 && str3 != null && !C3.a.t(str3, str2)) {
                return false;
            }
            if (i7 == 2 && i == 1 && str2 != null && !C3.a.t(str2, str3)) {
                return false;
            }
            if (i7 != 0 && i7 == i) {
                if (str3 != null) {
                    if (!C3.a.t(str3, str2)) {
                        return false;
                    }
                } else if (str2 != null) {
                    return false;
                }
            }
            if (this.f12696g != c1061a.f12696g) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f12691a.hashCode() * 31) + this.f12696g) * 31) + (this.f12693c ? 1231 : 1237)) * 31) + this.f12694d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f12691a);
        sb.append("', type='");
        sb.append(this.f12692b);
        sb.append("', affinity='");
        sb.append(this.f12696g);
        sb.append("', notNull=");
        sb.append(this.f12693c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f12694d);
        sb.append(", defaultValue='");
        String str = this.f12695e;
        if (str == null) {
            str = "undefined";
        }
        return i.k(sb, str, "'}");
    }
}
