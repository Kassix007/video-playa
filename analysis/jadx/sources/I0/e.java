package I0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2227c = new e(0.0f, new G5.a(0.0f, 0.0f));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G5.a f2229b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(float f, G5.a aVar) {
        this.f2228a = f;
        this.f2229b = aVar;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final G5.a a() {
        return this.f2229b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2228a == eVar.f2228a && this.f2229b.equals(eVar.f2229b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f2229b.hashCode() + (Float.hashCode(this.f2228a) * 31)) * 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.f2228a + ", range=" + this.f2229b + ", steps=0)";
    }
}
