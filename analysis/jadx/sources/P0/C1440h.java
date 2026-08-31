package p0;

/* JADX INFO: renamed from: p0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1440h extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15578e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15580h;
    public final float i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1440h(float f, float f7, float f8, boolean z5, boolean z6, float f9, float f10) {
        super(3);
        this.f15576c = f;
        this.f15577d = f7;
        this.f15578e = f8;
        this.f = z5;
        this.f15579g = z6;
        this.f15580h = f9;
        this.i = f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1440h)) {
            return false;
        }
        C1440h c1440h = (C1440h) obj;
        return Float.compare(this.f15576c, c1440h.f15576c) == 0 && Float.compare(this.f15577d, c1440h.f15577d) == 0 && Float.compare(this.f15578e, c1440h.f15578e) == 0 && this.f == c1440h.f && this.f15579g == c1440h.f15579g && Float.compare(this.f15580h, c1440h.f15580h) == 0 && Float.compare(this.i, c1440h.i) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.i) + k1.i.b(this.f15580h, k1.i.e(k1.i.e(k1.i.b(this.f15578e, k1.i.b(this.f15577d, Float.hashCode(this.f15576c) * 31, 31), 31), 31, this.f), 31, this.f15579g), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb.append(this.f15576c);
        sb.append(", verticalEllipseRadius=");
        sb.append(this.f15577d);
        sb.append(", theta=");
        sb.append(this.f15578e);
        sb.append(", isMoreThanHalf=");
        sb.append(this.f);
        sb.append(", isPositiveArc=");
        sb.append(this.f15579g);
        sb.append(", arcStartX=");
        sb.append(this.f15580h);
        sb.append(", arcStartY=");
        return k1.i.j(sb, this.i, ')');
    }
}
