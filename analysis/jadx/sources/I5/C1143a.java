package i5;

import C0.S;
import k1.i;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: i5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1143a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13642c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1143a(String str, String str2, String str3) {
        this.f13640a = str;
        this.f13641b = str2;
        this.f13642c = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1143a)) {
            return false;
        }
        C1143a c1143a = (C1143a) obj;
        return m.a(this.f13640a, c1143a.f13640a) && m.a(this.f13641b, c1143a.f13641b) && m.a(this.f13642c, c1143a.f13642c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f13642c.hashCode() + S.h(this.f13641b, this.f13640a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return i.k(S.r("UrlHandlingUtil(type=", this.f13640a, ", pageType=", this.f13641b, ", regex="), this.f13642c, ")");
    }
}
