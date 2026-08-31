package V0;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f7951c = new t(2, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f7952d = new t(1, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7954b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(int i, boolean z5) {
        this.f7953a = i;
        this.f7954b = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f7953a == tVar.f7953a && this.f7954b == tVar.f7954b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f7954b) + (Integer.hashCode(this.f7953a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return equals(f7951c) ? "TextMotion.Static" : equals(f7952d) ? "TextMotion.Animated" : "Invalid";
    }
}
