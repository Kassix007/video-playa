package p0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15599d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(float f, float f7) {
        super(1);
        this.f15598c = f;
        this.f15599d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Float.compare(this.f15598c, pVar.f15598c) == 0 && Float.compare(this.f15599d, pVar.f15599d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15599d) + (Float.hashCode(this.f15598c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f15598c);
        sb.append(", y=");
        return k1.i.j(sb, this.f15599d, ')');
    }
}
