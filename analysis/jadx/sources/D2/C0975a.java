package d2;

/* JADX INFO: renamed from: d2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12061c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C0975a.class != obj.getClass()) {
                return false;
            }
            C0975a c0975a = (C0975a) obj;
            int i = this.f12059a;
            if (i != c0975a.f12059a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f12061c - this.f12060b) != 1 || this.f12061c != c0975a.f12060b || this.f12060b != c0975a.f12061c) {
                return this.f12061c == c0975a.f12061c && this.f12060b == c0975a.f12060b;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (((this.f12059a * 31) + this.f12060b) * 31) + this.f12061c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f12059a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f12060b);
        sb.append("c:");
        sb.append(this.f12061c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
