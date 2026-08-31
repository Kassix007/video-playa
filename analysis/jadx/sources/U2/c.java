package U2;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I2.n f7630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f7631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f7632c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(I2.n nVar, g gVar, Throwable th) {
        this.f7630a = nVar;
        this.f7631b = gVar;
        this.f7632c = th;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // U2.j
    public final g a() {
        return this.f7631b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.m.a(this.f7630a, cVar.f7630a) && kotlin.jvm.internal.m.a(this.f7631b, cVar.f7631b) && kotlin.jvm.internal.m.a(this.f7632c, cVar.f7632c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        I2.n nVar = this.f7630a;
        return this.f7632c.hashCode() + ((this.f7631b.hashCode() + ((nVar == null ? 0 : nVar.hashCode()) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ErrorResult(image=" + this.f7630a + ", request=" + this.f7631b + ", throwable=" + this.f7632c + ')';
    }
}
