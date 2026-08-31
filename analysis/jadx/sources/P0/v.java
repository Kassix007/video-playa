package p0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15617e;
    public final float f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(float f, float f7, float f8, float f9) {
        super(1);
        this.f15615c = f;
        this.f15616d = f7;
        this.f15617e = f8;
        this.f = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Float.compare(this.f15615c, vVar.f15615c) == 0 && Float.compare(this.f15616d, vVar.f15616d) == 0 && Float.compare(this.f15617e, vVar.f15617e) == 0 && Float.compare(this.f, vVar.f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f) + k1.i.b(this.f15617e, k1.i.b(this.f15616d, Float.hashCode(this.f15615c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeQuadTo(dx1=");
        sb.append(this.f15615c);
        sb.append(", dy1=");
        sb.append(this.f15616d);
        sb.append(", dx2=");
        sb.append(this.f15617e);
        sb.append(", dy2=");
        return k1.i.j(sb, this.f, ')');
    }
}
