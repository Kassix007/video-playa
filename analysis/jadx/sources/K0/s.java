package k0;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f14046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14047b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(float f, float f7) {
        this.f14046a = f;
        this.f14047b = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float[] a() {
        float f = this.f14046a;
        float f7 = this.f14047b;
        return new float[]{f / f7, 1.0f, ((1.0f - f) - f7) / f7};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Float.compare(this.f14046a, sVar.f14046a) == 0 && Float.compare(this.f14047b, sVar.f14047b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f14047b) + (Float.hashCode(this.f14046a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.f14046a);
        sb.append(", y=");
        return k1.i.j(sb, this.f14047b, ')');
    }
}
