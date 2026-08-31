package p0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15587c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(float f) {
        super(3);
        this.f15587c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Float.compare(this.f15587c, ((k) obj).f15587c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15587c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.j(new StringBuilder("HorizontalTo(x="), this.f15587c, ')');
    }
}
