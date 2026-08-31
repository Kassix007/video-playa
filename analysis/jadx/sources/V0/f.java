package V0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7927d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7928a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        a(0.0f);
        a(0.5f);
        f7925b = 0.5f;
        a(-1.0f);
        f7926c = -1.0f;
        a(1.0f);
        f7927d = 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            Q0.a.b("topRatio should be in [0..1] range or -1");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == f7925b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == f7926c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == f7927d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return Float.compare(this.f7928a, ((f) obj).f7928a) == 0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f7928a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return b(this.f7928a);
    }
}
