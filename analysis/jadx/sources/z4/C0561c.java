package Z4;

/* JADX INFO: renamed from: Z4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0561c {
    public static final C0560b Companion = new C0560b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0567i f8484b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0561c(int i, String str, C0567i c0567i) {
        if ((i & 1) == 0) {
            this.f8483a = null;
        } else {
            this.f8483a = str;
        }
        if ((i & 2) == 0) {
            this.f8484b = null;
        } else {
            this.f8484b = c0567i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0561c)) {
            return false;
        }
        C0561c c0561c = (C0561c) obj;
        return kotlin.jvm.internal.m.a(this.f8483a, c0561c.f8483a) && kotlin.jvm.internal.m.a(this.f8484b, c0561c.f8484b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        String str = this.f8483a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C0567i c0567i = this.f8484b;
        return iHashCode + (c0567i != null ? c0567i.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Action(url=" + this.f8483a + ", button=" + this.f8484b + ")";
    }
}
