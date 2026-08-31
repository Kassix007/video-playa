package t;

/* JADX INFO: renamed from: t.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1598G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16586c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1598G(float f, float f7, long j) {
        this.f16584a = f;
        this.f16585b = f7;
        this.f16586c = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1598G)) {
            return false;
        }
        C1598G c1598g = (C1598G) obj;
        return Float.compare(this.f16584a, c1598g.f16584a) == 0 && Float.compare(this.f16585b, c1598g.f16585b) == 0 && this.f16586c == c1598g.f16586c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f16586c) + k1.i.b(this.f16585b, Float.hashCode(this.f16584a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f16584a + ", distance=" + this.f16585b + ", duration=" + this.f16586c + ')';
    }
}
