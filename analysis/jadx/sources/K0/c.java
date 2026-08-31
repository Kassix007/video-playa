package k0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13981c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(String str, long j, int i) {
        this.f13979a = str;
        this.f13980b = j;
        this.f13981c = i;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i < -1 || i > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean c() {
        return false;
    }

    public abstract long d(float f, float f7, float f8);

    public abstract float e(float f, float f7, float f8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f13981c == cVar.f13981c && kotlin.jvm.internal.m.a(this.f13979a, cVar.f13979a)) {
            return b.a(this.f13980b, cVar.f13980b);
        }
        return false;
    }

    public abstract long f(float f, float f7, float f8, float f9, c cVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iHashCode = this.f13979a.hashCode() * 31;
        int i = b.f13978e;
        return k1.i.d(iHashCode, 31, this.f13980b) + this.f13981c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f13979a + " (id=" + this.f13981c + ", model=" + ((Object) b.b(this.f13980b)) + ')';
    }
}
