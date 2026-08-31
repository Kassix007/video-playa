package j0;

import i0.C1130b;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final D f13677d = new D(0.0f, AbstractC1145B.c(4278190080L), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13680c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(float f, long j, long j7) {
        this.f13678a = j;
        this.f13679b = j7;
        this.f13680c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d5 = (D) obj;
        return o.c(this.f13678a, d5.f13678a) && C1130b.b(this.f13679b, d5.f13679b) && this.f13680c == d5.f13680c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = o.f13723h;
        return Float.hashCode(this.f13680c) + k1.i.d(Long.hashCode(this.f13678a) * 31, 31, this.f13679b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Shadow(color=");
        k1.i.r(this.f13678a, sb, ", offset=");
        sb.append((Object) C1130b.g(this.f13679b));
        sb.append(", blurRadius=");
        return k1.i.j(sb, this.f13680c, ')');
    }
}
