package L0;

import C0.S;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f3121b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(String str, D d5) {
        this.f3120a = str;
        this.f3121b = d5;
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
        if (!kotlin.jvm.internal.m.a(this.f3120a, iVar.f3120a) || !kotlin.jvm.internal.m.a(this.f3121b, iVar.f3121b)) {
            return false;
        }
        iVar.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f3120a.hashCode() * 31;
        D d5 = this.f3121b;
        return (iHashCode + (d5 != null ? d5.hashCode() : 0)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.p(new StringBuilder("LinkAnnotation.Url(url="), this.f3120a, ')');
    }
}
