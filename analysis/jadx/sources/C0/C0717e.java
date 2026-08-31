package c0;

/* JADX INFO: renamed from: c0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0717e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10089b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0717e(float f, float f7) {
        this.f10088a = f;
        this.f10089b = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long a(long j, long j7, W0.l lVar) {
        float f = (((int) (j7 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f7 = (((int) (j7 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        W0.l lVar2 = W0.l.f8022q;
        float f8 = this.f10088a;
        if (lVar != lVar2) {
            f8 *= -1;
        }
        float f9 = 1;
        float f10 = (f8 + f9) * f;
        return (((long) Math.round((f9 + this.f10089b) * f7)) & 4294967295L) | (((long) Math.round(f10)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0717e)) {
            return false;
        }
        C0717e c0717e = (C0717e) obj;
        return Float.compare(this.f10088a, c0717e.f10088a) == 0 && Float.compare(this.f10089b, c0717e.f10089b) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10089b) + (Float.hashCode(this.f10088a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.f10088a);
        sb.append(", verticalBias=");
        return k1.i.j(sb, this.f10089b, ')');
    }
}
