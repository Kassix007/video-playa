package p0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15594e;
    public final float f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(float f, float f7, float f8, float f9) {
        super(1);
        this.f15592c = f;
        this.f15593d = f7;
        this.f15594e = f8;
        this.f = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Float.compare(this.f15592c, nVar.f15592c) == 0 && Float.compare(this.f15593d, nVar.f15593d) == 0 && Float.compare(this.f15594e, nVar.f15594e) == 0 && Float.compare(this.f, nVar.f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f) + k1.i.b(this.f15594e, k1.i.b(this.f15593d, Float.hashCode(this.f15592c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("QuadTo(x1=");
        sb.append(this.f15592c);
        sb.append(", y1=");
        sb.append(this.f15593d);
        sb.append(", x2=");
        sb.append(this.f15594e);
        sb.append(", y2=");
        return k1.i.j(sb, this.f, ')');
    }
}
