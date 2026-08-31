package L2;

import J2.q;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class i implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f3260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.h f3262c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(q qVar, String str, J2.h hVar) {
        this.f3260a = qVar;
        this.f3261b = str;
        this.f3262c = hVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m.a(this.f3260a, iVar.f3260a) && m.a(this.f3261b, iVar.f3261b) && this.f3262c == iVar.f3262c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f3260a.hashCode() * 31;
        String str = this.f3261b;
        return this.f3262c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SourceFetchResult(source=" + this.f3260a + ", mimeType=" + this.f3261b + ", dataSource=" + this.f3262c + ')';
    }
}
