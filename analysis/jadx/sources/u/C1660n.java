package u;

/* JADX INFO: renamed from: u.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1660n extends AbstractC1663q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16996b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1660n(float f, float f7) {
        this.f16995a = f;
        this.f16996b = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final float a(int i) {
        if (i == 0) {
            return this.f16995a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.f16996b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final int b() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final AbstractC1663q c() {
        return new C1660n(0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void d() {
        this.f16995a = 0.0f;
        this.f16996b = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f16995a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.f16996b = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1660n)) {
            return false;
        }
        C1660n c1660n = (C1660n) obj;
        return c1660n.f16995a == this.f16995a && c1660n.f16996b == this.f16996b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f16996b) + (Float.hashCode(this.f16995a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f16995a + ", v2 = " + this.f16996b;
    }
}
