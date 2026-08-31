package R4;

/* JADX INFO: loaded from: classes.dex */
public final class P2 {
    public static final O2 Companion = new O2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f6834a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ P2(int i, Boolean bool) {
        if ((i & 1) == 0) {
            this.f6834a = Boolean.FALSE;
        } else {
            this.f6834a = bool;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof P2) && kotlin.jvm.internal.m.a(this.f6834a, ((P2) obj).f6834a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Boolean bool = this.f6834a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "StripePaymentGateway(enable=" + this.f6834a + ")";
    }
}
