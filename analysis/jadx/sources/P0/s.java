package p0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15610c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(float f) {
        super(3);
        this.f15610c = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Float.compare(this.f15610c, ((s) obj).f15610c) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15610c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.j(new StringBuilder("RelativeHorizontalTo(dx="), this.f15610c, ')');
    }
}
