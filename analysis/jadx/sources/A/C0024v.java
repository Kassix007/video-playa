package A;

/* JADX INFO: renamed from: A.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0024v implements A0.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B5.c f150q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public W f151r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0024v(B5.c cVar) {
        this.f150q = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // A0.c
    public final void e(A0.g gVar) {
        W w3 = (W) gVar.e(c0.f89a);
        if (kotlin.jvm.internal.m.a(w3, this.f151r)) {
            return;
        }
        this.f151r = w3;
        this.f150q.invoke(w3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0024v) && ((C0024v) obj).f150q == this.f150q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f150q.hashCode();
    }
}
