package A;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f31b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f32c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f33d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public L(float f, float f7, float f8, float f9) {
        this.f30a = f;
        this.f31b = f7;
        this.f32c = f8;
        this.f33d = f9;
        if (!((f >= 0.0f) & (f7 >= 0.0f) & (f8 >= 0.0f)) || !(f9 >= 0.0f)) {
            B.a.a("Padding must be non-negative");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float a() {
        return this.f33d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b(W0.l lVar) {
        return lVar == W0.l.f8022q ? this.f30a : this.f32c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float c(W0.l lVar) {
        return lVar == W0.l.f8022q ? this.f32c : this.f30a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float d() {
        return this.f31b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l7 = (L) obj;
        return W0.f.a(this.f30a, l7.f30a) && W0.f.a(this.f31b, l7.f31b) && W0.f.a(this.f32c, l7.f32c) && W0.f.a(this.f33d, l7.f33d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f33d) + k1.i.b(this.f32c, k1.i.b(this.f31b, Float.hashCode(this.f30a) * 31, 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PaddingValues(start=" + ((Object) W0.f.b(this.f30a)) + ", top=" + ((Object) W0.f.b(this.f31b)) + ", end=" + ((Object) W0.f.b(this.f32c)) + ", bottom=" + ((Object) W0.f.b(this.f33d)) + ')';
    }
}
