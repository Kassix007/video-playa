package A;

/* JADX INFO: renamed from: A.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0027y implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f158b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0027y(W w3, W w6) {
        this.f157a = w3;
        this.f158b = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int a(W0.c cVar, W0.l lVar) {
        int iA = this.f157a.a(cVar, lVar) - this.f158b.a(cVar, lVar);
        if (iA < 0) {
            return 0;
        }
        return iA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int b(W0.c cVar) {
        int iB = this.f157a.b(cVar) - this.f158b.b(cVar);
        if (iB < 0) {
            return 0;
        }
        return iB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int c(W0.c cVar, W0.l lVar) {
        int iC = this.f157a.c(cVar, lVar) - this.f158b.c(cVar, lVar);
        if (iC < 0) {
            return 0;
        }
        return iC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A.W
    public final int d(W0.c cVar) {
        int iD = this.f157a.d(cVar) - this.f158b.d(cVar);
        if (iD < 0) {
            return 0;
        }
        return iD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0027y)) {
            return false;
        }
        C0027y c0027y = (C0027y) obj;
        return kotlin.jvm.internal.m.a(c0027y.f157a, this.f157a) && kotlin.jvm.internal.m.a(c0027y.f158b, this.f158b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f158b.hashCode() + (this.f157a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f157a + " - " + this.f158b + ')';
    }
}
