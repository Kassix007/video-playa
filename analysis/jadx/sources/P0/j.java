package p0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15584e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15586h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(float f, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f15582c = f;
        this.f15583d = f7;
        this.f15584e = f8;
        this.f = f9;
        this.f15585g = f10;
        this.f15586h = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f15582c, jVar.f15582c) == 0 && Float.compare(this.f15583d, jVar.f15583d) == 0 && Float.compare(this.f15584e, jVar.f15584e) == 0 && Float.compare(this.f, jVar.f) == 0 && Float.compare(this.f15585g, jVar.f15585g) == 0 && Float.compare(this.f15586h, jVar.f15586h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15586h) + k1.i.b(this.f15585g, k1.i.b(this.f, k1.i.b(this.f15584e, k1.i.b(this.f15583d, Float.hashCode(this.f15582c) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("CurveTo(x1=");
        sb.append(this.f15582c);
        sb.append(", y1=");
        sb.append(this.f15583d);
        sb.append(", x2=");
        sb.append(this.f15584e);
        sb.append(", y2=");
        sb.append(this.f);
        sb.append(", x3=");
        sb.append(this.f15585g);
        sb.append(", y3=");
        return k1.i.j(sb, this.f15586h, ')');
    }
}
