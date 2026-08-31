package Z4;

/* JADX INFO: loaded from: classes.dex */
public final class r {
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f8503a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r(int i, o oVar) {
        if ((i & 1) == 0) {
            this.f8503a = null;
        } else {
            this.f8503a = oVar;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.m.a(this.f8503a, ((r) obj).f8503a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        o oVar = this.f8503a;
        if (oVar == null) {
            return 0;
        }
        return oVar.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "OfferCardData(data=" + this.f8503a + ")";
    }
}
