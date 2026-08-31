package u;

/* JADX INFO: renamed from: u.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1661o extends AbstractC1663q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17006c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1661o(float f, float f7, float f8) {
        this.f17004a = f;
        this.f17005b = f7;
        this.f17006c = f8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final float a(int i) {
        if (i == 0) {
            return this.f17004a;
        }
        if (i == 1) {
            return this.f17005b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.f17006c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final int b() {
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final AbstractC1663q c() {
        return new C1661o(0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void d() {
        this.f17004a = 0.0f;
        this.f17005b = 0.0f;
        this.f17006c = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f17004a = f;
        } else if (i == 1) {
            this.f17005b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.f17006c = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1661o)) {
            return false;
        }
        C1661o c1661o = (C1661o) obj;
        return c1661o.f17004a == this.f17004a && c1661o.f17005b == this.f17005b && c1661o.f17006c == this.f17006c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f17006c) + k1.i.b(this.f17005b, Float.hashCode(this.f17004a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f17004a + ", v2 = " + this.f17005b + ", v3 = " + this.f17006c;
    }
}
