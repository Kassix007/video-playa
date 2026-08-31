package x2;

import d6.w;
import v2.EnumC1757e;

/* JADX INFO: loaded from: classes.dex */
public final class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f18378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC1757e f18380c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(w wVar, String str, EnumC1757e enumC1757e) {
        this.f18378a = wVar;
        this.f18379b = str;
        this.f18380c = enumC1757e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.f18378a, mVar.f18378a) && kotlin.jvm.internal.m.a(this.f18379b, mVar.f18379b) && this.f18380c == mVar.f18380c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f18378a.hashCode() * 31;
        String str = this.f18379b;
        return this.f18380c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
