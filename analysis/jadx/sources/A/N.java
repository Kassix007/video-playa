package A;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f34a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C0025w f36c = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n7 = (N) obj;
        return Float.compare(this.f34a, n7.f34a) == 0 && this.f35b == n7.f35b && kotlin.jvm.internal.m.a(this.f36c, n7.f36c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iE = k1.i.e(Float.hashCode(this.f34a) * 31, 31, this.f35b);
        C0025w c0025w = this.f36c;
        return (iE + (c0025w == null ? 0 : c0025w.hashCode())) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "RowColumnParentData(weight=" + this.f34a + ", fill=" + this.f35b + ", crossAxisAlignment=" + this.f36c + ", flowLayoutData=null)";
    }
}
