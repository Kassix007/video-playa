package R4;

/* JADX INFO: loaded from: classes.dex */
public final class C1 {
    public static final B1 Companion = new B1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6738a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1(int i, boolean z5) {
        if ((i & 1) == 0) {
            this.f6738a = false;
        } else {
            this.f6738a = z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1) && this.f6738a == ((C1) obj).f6738a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f6738a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "NativeDataStore(enable=" + this.f6738a + ")";
    }
}
