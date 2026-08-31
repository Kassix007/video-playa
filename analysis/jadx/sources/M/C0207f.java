package M;

/* JADX INFO: renamed from: M.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0207f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f3476e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0207f(float f, float f7, float f8, float f9, float f10, float f11) {
        this.f3472a = f;
        this.f3473b = f7;
        this.f3474c = f8;
        this.f3475d = f9;
        this.f3476e = f11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0207f)) {
            return false;
        }
        C0207f c0207f = (C0207f) obj;
        return W0.f.a(this.f3472a, c0207f.f3472a) && W0.f.a(this.f3473b, c0207f.f3473b) && W0.f.a(this.f3474c, c0207f.f3474c) && W0.f.a(this.f3475d, c0207f.f3475d) && W0.f.a(this.f3476e, c0207f.f3476e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f3476e) + k1.i.b(this.f3475d, k1.i.b(this.f3474c, k1.i.b(this.f3473b, Float.hashCode(this.f3472a) * 31, 31), 31), 31);
    }
}
