package O0;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f4289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f4290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f4293e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(p pVar, j jVar, int i, int i7, Object obj) {
        this.f4289a = pVar;
        this.f4290b = jVar;
        this.f4291c = i;
        this.f4292d = i7;
        this.f4293e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.m.a(this.f4289a, qVar.f4289a) && kotlin.jvm.internal.m.a(this.f4290b, qVar.f4290b) && this.f4291c == qVar.f4291c && this.f4292d == qVar.f4292d && kotlin.jvm.internal.m.a(this.f4293e, qVar.f4293e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        p pVar = this.f4289a;
        int iC = k1.i.c(this.f4292d, k1.i.c(this.f4291c, (((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f4290b.f4284q) * 31, 31), 31);
        Object obj = this.f4293e;
        return iC + (obj != null ? obj.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f4289a);
        sb.append(", fontWeight=");
        sb.append(this.f4290b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i = this.f4291c;
        sb.append((Object) (i == 0 ? "Normal" : i == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i7 = this.f4292d;
        if (i7 == 0) {
            str = "None";
        } else if (i7 == 1) {
            str = "Weight";
        } else if (i7 == 2) {
            str = "Style";
        } else if (i7 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f4293e);
        sb.append(')');
        return sb.toString();
    }
}
