package R4;

/* JADX INFO: renamed from: R4.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0527z1 {
    public static final C0523y1 Companion = new C0523y1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7222a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0527z1(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f7222a = null;
        } else {
            this.f7222a = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0527z1) && kotlin.jvm.internal.m.a(this.f7222a, ((C0527z1) obj).f7222a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f7222a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MultipleAppIcon(enable=" + this.f7222a + ")";
    }
}
