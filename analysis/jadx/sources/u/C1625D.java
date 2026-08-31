package u;

/* JADX INFO: renamed from: u.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1625D implements InterfaceC1657k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1668w f16762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16763b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1625D(InterfaceC1668w interfaceC1668w, long j) {
        this.f16762a = interfaceC1668w;
        this.f16763b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1657k
    public final B0 a(Z.m mVar) {
        return new F0(this.f16762a.a(mVar), this.f16763b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1625D)) {
            return false;
        }
        C1625D c1625d = (C1625D) obj;
        return c1625d.f16762a.equals(this.f16762a) && c1625d.f16763b == this.f16763b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f16763b) + ((Q.f16819q.hashCode() + (this.f16762a.hashCode() * 31)) * 31);
    }
}
