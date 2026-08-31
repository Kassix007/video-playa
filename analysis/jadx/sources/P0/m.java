package p0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15591d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(float f, float f7) {
        super(3);
        this.f15590c = f;
        this.f15591d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Float.compare(this.f15590c, mVar.f15590c) == 0 && Float.compare(this.f15591d, mVar.f15591d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15591d) + (Float.hashCode(this.f15590c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f15590c);
        sb.append(", y=");
        return k1.i.j(sb, this.f15591d, ')');
    }
}
