package w0;

import k1.i;

/* JADX INFO: renamed from: w0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1822a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f18130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18131b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1822a)) {
            return false;
        }
        C1822a c1822a = (C1822a) obj;
        return this.f18130a == c1822a.f18130a && Float.compare(this.f18131b, c1822a.f18131b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f18131b) + (Long.hashCode(this.f18130a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f18130a);
        sb.append(", dataPoint=");
        return i.j(sb, this.f18131b, ')');
    }
}
