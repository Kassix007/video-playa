package p0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15620e;
    public final float f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w(float f, float f7, float f8, float f9) {
        super(2);
        this.f15618c = f;
        this.f15619d = f7;
        this.f15620e = f8;
        this.f = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Float.compare(this.f15618c, wVar.f15618c) == 0 && Float.compare(this.f15619d, wVar.f15619d) == 0 && Float.compare(this.f15620e, wVar.f15620e) == 0 && Float.compare(this.f, wVar.f) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f) + k1.i.b(this.f15620e, k1.i.b(this.f15619d, Float.hashCode(this.f15618c) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
        sb.append(this.f15618c);
        sb.append(", dy1=");
        sb.append(this.f15619d);
        sb.append(", dx2=");
        sb.append(this.f15620e);
        sb.append(", dy2=");
        return k1.i.j(sb, this.f, ')');
    }
}
