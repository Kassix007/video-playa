package G5;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f2024t = new d(1, 0, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G5.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f2017q == dVar.f2017q && this.f2018r == dVar.f2018r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G5.b
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2017q * 31) + this.f2018r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G5.b
    public final boolean isEmpty() {
        return this.f2017q > this.f2018r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // G5.b
    public final String toString() {
        return this.f2017q + ".." + this.f2018r;
    }
}
