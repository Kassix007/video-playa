package s0;

/* JADX INFO: renamed from: s0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1587a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16414a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1587a) {
            return this.f16414a == ((C1587a) obj).f16414a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f16414a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i = this.f16414a;
        return i == 1 ? "Touch" : i == 2 ? "Keyboard" : "Error";
    }
}
