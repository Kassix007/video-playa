package u;

/* JADX INFO: renamed from: u.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1651g0 implements InterfaceC1657k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1657k f16932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16933b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1651g0(InterfaceC1671z interfaceC1671z, long j) {
        this.f16932a = interfaceC1671z;
        this.f16933b = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.InterfaceC1657k
    public final B0 a(Z.m mVar) {
        return new C1653h0(this.f16932a.a(mVar), this.f16933b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1651g0)) {
            return false;
        }
        C1651g0 c1651g0 = (C1651g0) obj;
        return c1651g0.f16933b == this.f16933b && kotlin.jvm.internal.m.a(c1651g0.f16932a, this.f16932a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f16933b) + (this.f16932a.hashCode() * 31);
    }
}
