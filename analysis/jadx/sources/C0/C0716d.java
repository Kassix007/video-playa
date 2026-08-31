package c0;

/* JADX INFO: renamed from: c0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0716d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10087a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0716d(float f) {
        this.f10087a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i, int i7) {
        return Math.round((1 + this.f10087a) * ((i7 - i) / 2.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0716d) && Float.compare(this.f10087a, ((C0716d) obj).f10087a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10087a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.j(new StringBuilder("Vertical(bias="), this.f10087a, ')');
    }
}
