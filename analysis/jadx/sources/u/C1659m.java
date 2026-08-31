package u;

/* JADX INFO: renamed from: u.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1659m extends AbstractC1663q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16972a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1659m(float f) {
        this.f16972a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final float a(int i) {
        if (i == 0) {
            return this.f16972a;
        }
        return 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final int b() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final AbstractC1663q c() {
        return new C1659m(0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void d() {
        this.f16972a = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f16972a = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof C1659m) && ((C1659m) obj).f16972a == this.f16972a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f16972a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector1D: value = " + this.f16972a;
    }
}
