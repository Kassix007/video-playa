package R4;

/* JADX INFO: loaded from: classes.dex */
public final class o3 {
    public static final n3 Companion = new n3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7148a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ o3(int i, String str) {
        if ((i & 1) == 0) {
            this.f7148a = null;
        } else {
            this.f7148a = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3) && kotlin.jvm.internal.m.a(this.f7148a, ((o3) obj).f7148a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f7148a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return C0.S.n("WindowUrl(regex=", this.f7148a, ")");
    }
}
