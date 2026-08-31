package W0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements X0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8025a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(float f) {
        this.f8025a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X0.a
    public final float a(float f) {
        return f / this.f8025a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // X0.a
    public final float b(float f) {
        return f * this.f8025a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && Float.compare(this.f8025a, ((m) obj).f8025a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f8025a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.j(new StringBuilder("LinearFontScaleConverter(fontScale="), this.f8025a, ')');
    }
}
