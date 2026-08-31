package R4;

/* JADX INFO: renamed from: R4.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0459i0 {
    public static final C0455h0 Companion = new C0455h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7021a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0459i0(int i, String str) {
        if ((i & 1) == 0) {
            this.f7021a = null;
        } else {
            this.f7021a = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0459i0) && kotlin.jvm.internal.m.a(this.f7021a, ((C0459i0) obj).f7021a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7021a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.S.n("FacebookSocialLogin(type=", this.f7021a, ")");
    }
}
