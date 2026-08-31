package v0;

/* JADX INFO: renamed from: v0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1750s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17493a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1750s) {
            return this.f17493a == ((C1750s) obj).f17493a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f17493a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f17493a + ')';
    }
}
