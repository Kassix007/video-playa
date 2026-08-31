package p0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15607e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f15608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f15609h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(float f, float f7, float f8, float f9, float f10, float f11) {
        super(2);
        this.f15605c = f;
        this.f15606d = f7;
        this.f15607e = f8;
        this.f = f9;
        this.f15608g = f10;
        this.f15609h = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f15605c, rVar.f15605c) == 0 && Float.compare(this.f15606d, rVar.f15606d) == 0 && Float.compare(this.f15607e, rVar.f15607e) == 0 && Float.compare(this.f, rVar.f) == 0 && Float.compare(this.f15608g, rVar.f15608g) == 0 && Float.compare(this.f15609h, rVar.f15609h) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15609h) + k1.i.b(this.f15608g, k1.i.b(this.f, k1.i.b(this.f15607e, k1.i.b(this.f15606d, Float.hashCode(this.f15605c) * 31, 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f15605c);
        sb.append(", dy1=");
        sb.append(this.f15606d);
        sb.append(", dx2=");
        sb.append(this.f15607e);
        sb.append(", dy2=");
        sb.append(this.f);
        sb.append(", dx3=");
        sb.append(this.f15608g);
        sb.append(", dy3=");
        return k1.i.j(sb, this.f15609h, ')');
    }
}
