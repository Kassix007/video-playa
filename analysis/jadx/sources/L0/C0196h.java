package L0;

import C0.S;

/* JADX INFO: renamed from: L0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0196h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D f3119b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0196h(String str, D d5) {
        this.f3118a = str;
        this.f3119b = d5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0196h)) {
            return false;
        }
        C0196h c0196h = (C0196h) obj;
        if (!kotlin.jvm.internal.m.a(this.f3118a, c0196h.f3118a) || !kotlin.jvm.internal.m.a(this.f3119b, c0196h.f3119b)) {
            return false;
        }
        c0196h.getClass();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = this.f3118a.hashCode() * 31;
        D d5 = this.f3119b;
        return (iHashCode + (d5 != null ? d5.hashCode() : 0)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return S.p(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f3118a, ')');
    }
}
