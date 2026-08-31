package p0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15589d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l(float f, float f7) {
        super(3);
        this.f15588c = f;
        this.f15589d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f15588c, lVar.f15588c) == 0 && Float.compare(this.f15589d, lVar.f15589d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15589d) + (Float.hashCode(this.f15588c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f15588c);
        sb.append(", y=");
        return k1.i.j(sb, this.f15589d, ')');
    }
}
