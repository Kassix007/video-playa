package t;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1602a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16594b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1602a(float f, float f7) {
        this.f16593a = f;
        this.f16594b = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1602a)) {
            return false;
        }
        C1602a c1602a = (C1602a) obj;
        return Float.compare(this.f16593a, c1602a.f16593a) == 0 && Float.compare(this.f16594b, c1602a.f16594b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f16594b) + (Float.hashCode(this.f16593a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("FlingResult(distanceCoefficient=");
        sb.append(this.f16593a);
        sb.append(", velocityCoefficient=");
        return k1.i.j(sb, this.f16594b, ')');
    }
}
