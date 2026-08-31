package p0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15602e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15604h;
    public final float i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(float f, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        super(3);
        this.f15600c = f;
        this.f15601d = f7;
        this.f15602e = f8;
        this.f = z5;
        this.f15603g = z6;
        this.f15604h = f9;
        this.i = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f15600c, qVar.f15600c) == 0 && Float.compare(this.f15601d, qVar.f15601d) == 0 && Float.compare(this.f15602e, qVar.f15602e) == 0 && this.f == qVar.f && this.f15603g == qVar.f15603g && Float.compare(this.f15604h, qVar.f15604h) == 0 && Float.compare(this.i, qVar.i) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.i) + k1.i.b(this.f15604h, k1.i.e(k1.i.e(k1.i.b(this.f15602e, k1.i.b(this.f15601d, Float.hashCode(this.f15600c) * 31, 31), 31), 31, this.f), 31, this.f15603g), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
        sb.append(this.f15600c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f15601d);
        sb.append(", theta=");
        sb.append(this.f15602e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.f15603g);
        sb.append(", arcStartDx=");
        sb.append(this.f15604h);
        sb.append(", arcStartDy=");
        return k1.i.j(sb, this.i, ')');
    }
}
