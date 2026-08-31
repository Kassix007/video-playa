package A;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public G(int i, int i7, int i8, int i9) {
        this.f14a = i;
        this.f15b = i7;
        this.f16c = i8;
        this.f17d = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g7 = (G) obj;
        return this.f14a == g7.f14a && this.f15b == g7.f15b && this.f16c == g7.f16c && this.f17d == g7.f17d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((((this.f14a * 31) + this.f15b) * 31) + this.f16c) * 31) + this.f17d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.f14a);
        sb.append(", top=");
        sb.append(this.f15b);
        sb.append(", right=");
        sb.append(this.f16c);
        sb.append(", bottom=");
        return C0.S.o(sb, this.f17d, ')');
    }
}
