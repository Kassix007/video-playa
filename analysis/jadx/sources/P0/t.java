package p0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15612d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(float f, float f7) {
        super(3);
        this.f15611c = f;
        this.f15612d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Float.compare(this.f15611c, tVar.f15611c) == 0 && Float.compare(this.f15612d, tVar.f15612d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15612d) + (Float.hashCode(this.f15611c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f15611c);
        sb.append(", dy=");
        return k1.i.j(sb, this.f15612d, ')');
    }
}
