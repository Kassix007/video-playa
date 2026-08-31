package R4;

/* JADX INFO: renamed from: R4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0505u {
    public static final C0501t Companion = new C0501t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7193a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0505u(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f7193a = null;
        } else {
            this.f7193a = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0505u) && kotlin.jvm.internal.m.a(this.f7193a, ((C0505u) obj).f7193a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f7193a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "BluetoothPermission(enable=" + this.f7193a + ")";
    }
}
