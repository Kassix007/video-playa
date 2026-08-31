package p0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15622d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(float f, float f7) {
        super(1);
        this.f15621c = f;
        this.f15622d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Float.compare(this.f15621c, xVar.f15621c) == 0 && Float.compare(this.f15622d, xVar.f15622d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15622d) + (Float.hashCode(this.f15621c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f15621c);
        sb.append(", dy=");
        return k1.i.j(sb, this.f15622d, ')');
    }
}
