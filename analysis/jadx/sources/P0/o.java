package p0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15597e;
    public final float f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(float f, float f7, float f8, float f9) {
        super(2);
        this.f15595c = f;
        this.f15596d = f7;
        this.f15597e = f8;
        this.f = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f15595c, oVar.f15595c) == 0 && Float.compare(this.f15596d, oVar.f15596d) == 0 && Float.compare(this.f15597e, oVar.f15597e) == 0 && Float.compare(this.f, oVar.f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f) + k1.i.b(this.f15597e, k1.i.b(this.f15596d, Float.hashCode(this.f15595c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveCurveTo(x1=");
        sb.append(this.f15595c);
        sb.append(", y1=");
        sb.append(this.f15596d);
        sb.append(", x2=");
        sb.append(this.f15597e);
        sb.append(", y2=");
        return k1.i.j(sb, this.f, ')');
    }
}
