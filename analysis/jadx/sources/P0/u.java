package p0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends AbstractC1427A {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f15613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f15614d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u(float f, float f7) {
        super(3);
        this.f15613c = f;
        this.f15614d = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Float.compare(this.f15613c, uVar.f15613c) == 0 && Float.compare(this.f15614d, uVar.f15614d) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f15614d) + (Float.hashCode(this.f15613c) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f15613c);
        sb.append(", dy=");
        return k1.i.j(sb, this.f15614d, ')');
    }
}
