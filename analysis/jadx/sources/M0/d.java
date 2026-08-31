package M0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3697c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(int i, int i7, boolean z5) {
        this.f3695a = i;
        this.f3696b = i7;
        this.f3697c = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3695a == dVar.f3695a && this.f3696b == dVar.f3696b && this.f3697c == dVar.f3697c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f3697c) + k1.i.c(this.f3696b, Integer.hashCode(this.f3695a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BidiRun(start=" + this.f3695a + ", end=" + this.f3696b + ", isRtl=" + this.f3697c + ')';
    }
}
