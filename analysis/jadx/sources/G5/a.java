package G5;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f2015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f2016b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a(float f, float f7) {
        this.f2015a = f;
        this.f2016b = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(Float f, Float f7) {
        return f.floatValue() <= f7.floatValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        float f = this.f2015a;
        float f7 = this.f2016b;
        if (f > f7) {
            a aVar = (a) obj;
            if (aVar.f2015a > aVar.f2016b) {
                return true;
            }
        }
        a aVar2 = (a) obj;
        return f == aVar2.f2015a && f7 == aVar2.f2016b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        float f = this.f2015a;
        float f7 = this.f2016b;
        if (f > f7) {
            return -1;
        }
        return Float.hashCode(f7) + (Float.hashCode(f) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2015a + ".." + this.f2016b;
    }
}
