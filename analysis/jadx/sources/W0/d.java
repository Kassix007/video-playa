package W0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f8008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f8009r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(float f, float f7) {
        this.f8008q = f;
        this.f8009r = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f8008q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f8008q, dVar.f8008q) == 0 && Float.compare(this.f8009r, dVar.f8009r) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8009r) + (Float.hashCode(this.f8008q) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f8009r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f8008q);
        sb.append(", fontScale=");
        return k1.i.j(sb, this.f8009r, ')');
    }
}
