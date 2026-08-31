package a6;

/* JADX INFO: loaded from: classes.dex */
public final class r extends B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f9043q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9044r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(String body, boolean z5) {
        kotlin.jvm.internal.m.e(body, "body");
        this.f9043q = z5;
        this.f9044r = body.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a6.B
    public final String d() {
        return this.f9044r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return this.f9043q == rVar.f9043q && kotlin.jvm.internal.m.a(this.f9044r, rVar.f9044r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f9044r.hashCode() + (Boolean.hashCode(this.f9043q) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a6.B
    public final String toString() {
        boolean z5 = this.f9043q;
        String str = this.f9044r;
        if (!z5) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        b6.k.a(sb, str);
        return sb.toString();
    }
}
