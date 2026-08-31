package R4;

/* JADX INFO: loaded from: classes.dex */
public final class J {
    public static final I Companion = new I();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6776a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ J(int i, String str) {
        if ((i & 1) == 0) {
            this.f6776a = null;
        } else {
            this.f6776a = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J) && kotlin.jvm.internal.m.a(this.f6776a, ((J) obj).f6776a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f6776a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.S.n("ConnectPageSetting(regex=", this.f6776a, ")");
    }
}
