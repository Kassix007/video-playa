package u;

/* JADX INFO: renamed from: u.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1662p extends AbstractC1663q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f17011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f17013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17014d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1662p(float f, float f7, float f8, float f9) {
        this.f17011a = f;
        this.f17012b = f7;
        this.f17013c = f8;
        this.f17014d = f9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final float a(int i) {
        if (i == 0) {
            return this.f17011a;
        }
        if (i == 1) {
            return this.f17012b;
        }
        if (i == 2) {
            return this.f17013c;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.f17014d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final int b() {
        return 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final AbstractC1663q c() {
        return new C1662p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void d() {
        this.f17011a = 0.0f;
        this.f17012b = 0.0f;
        this.f17013c = 0.0f;
        this.f17014d = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.AbstractC1663q
    public final void e(int i, float f) {
        if (i == 0) {
            this.f17011a = f;
            return;
        }
        if (i == 1) {
            this.f17012b = f;
        } else if (i == 2) {
            this.f17013c = f;
        } else {
            if (i != 3) {
                return;
            }
            this.f17014d = f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1662p)) {
            return false;
        }
        C1662p c1662p = (C1662p) obj;
        return c1662p.f17011a == this.f17011a && c1662p.f17012b == this.f17012b && c1662p.f17013c == this.f17013c && c1662p.f17014d == this.f17014d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f17014d) + k1.i.b(this.f17013c, k1.i.b(this.f17012b, Float.hashCode(this.f17011a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f17011a + ", v2 = " + this.f17012b + ", v3 = " + this.f17013c + ", v4 = " + this.f17014d;
    }
}
