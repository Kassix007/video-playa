package V0;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f7930c = new i(17, f.f7926c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7932b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(int i, float f) {
        this.f7931a = f;
        this.f7932b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        float f = iVar.f7931a;
        float f7 = f.f7925b;
        return Float.compare(this.f7931a, f) == 0 && this.f7932b == iVar.f7932b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        float f = f.f7925b;
        return Integer.hashCode(0) + k1.i.c(this.f7932b, Float.hashCode(this.f7931a) * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        sb.append((Object) f.b(this.f7931a));
        sb.append(", trim=");
        int i = this.f7932b;
        sb.append((Object) (i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid"));
        sb.append(",mode=Mode(value=0))");
        return sb.toString();
    }
}
