package A;

/* JADX INFO: loaded from: classes.dex */
public final class U implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f50a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f51b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public U(W w3, W w6) {
        this.f50a = w3;
        this.f51b = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int a(W0.c cVar, W0.l lVar) {
        return Math.max(this.f50a.a(cVar, lVar), this.f51b.a(cVar, lVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int b(W0.c cVar) {
        return Math.max(this.f50a.b(cVar), this.f51b.b(cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int c(W0.c cVar, W0.l lVar) {
        return Math.max(this.f50a.c(cVar, lVar), this.f51b.c(cVar, lVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int d(W0.c cVar) {
        return Math.max(this.f50a.d(cVar), this.f51b.d(cVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u6 = (U) obj;
        return kotlin.jvm.internal.m.a(u6.f50a, this.f50a) && kotlin.jvm.internal.m.a(u6.f51b, this.f51b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f51b.hashCode() * 31) + this.f50a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f50a + " ∪ " + this.f51b + ')';
    }
}
