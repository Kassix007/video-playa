package c0;

/* JADX INFO: renamed from: c0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0715c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10086a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0715c(float f) {
        this.f10086a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(int i, int i7, W0.l lVar) {
        float f = (i7 - i) / 2.0f;
        W0.l lVar2 = W0.l.f8022q;
        float f7 = this.f10086a;
        if (lVar != lVar2) {
            f7 *= -1;
        }
        return Math.round((1 + f7) * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0715c) && Float.compare(this.f10086a, ((C0715c) obj).f10086a) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Float.hashCode(this.f10086a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return k1.i.j(new StringBuilder("Horizontal(bias="), this.f10086a, ')');
    }
}
