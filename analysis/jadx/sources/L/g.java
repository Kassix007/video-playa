package L;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3032d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g(float f, float f7, float f8, float f9) {
        this.f3029a = f;
        this.f3030b = f7;
        this.f3031c = f8;
        this.f3032d = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3029a == gVar.f3029a && this.f3030b == gVar.f3030b && this.f3031c == gVar.f3031c && this.f3032d == gVar.f3032d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f3032d) + k1.i.b(this.f3031c, k1.i.b(this.f3030b, Float.hashCode(this.f3029a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f3029a);
        sb.append(", focusedAlpha=");
        sb.append(this.f3030b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f3031c);
        sb.append(", pressedAlpha=");
        return k1.i.j(sb, this.f3032d, ')');
    }
}
