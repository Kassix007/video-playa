package R4;

/* JADX INFO: loaded from: classes.dex */
public final class L1 {
    public static final K1 Companion = new K1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6791a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ L1(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f6791a = null;
        } else {
            this.f6791a = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L1) && kotlin.jvm.internal.m.a(this.f6791a, ((L1) obj).f6791a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6791a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OfferCardJson(enabled=" + this.f6791a + ")";
    }
}
