package u;

/* JADX INFO: renamed from: u.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1653h0 implements B0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B0 f16934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f16935r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1653h0(B0 b02, long j) {
        this.f16934q = b02;
        this.f16935r = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final boolean a() {
        return this.f16934q.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final long b(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return this.f16934q.b(abstractC1663q, abstractC1663q2, abstractC1663q3) + this.f16935r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof C1653h0)) {
            return false;
        }
        C1653h0 c1653h0 = (C1653h0) obj;
        return c1653h0.f16935r == this.f16935r && kotlin.jvm.internal.m.a(c1653h0.f16934q, this.f16934q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        long j7 = this.f16935r;
        return j < j7 ? abstractC1663q : this.f16934q.g(j - j7, abstractC1663q, abstractC1663q2, abstractC1663q3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Long.hashCode(this.f16935r) + (this.f16934q.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        long j7 = this.f16935r;
        return j < j7 ? abstractC1663q3 : this.f16934q.n(j - j7, abstractC1663q, abstractC1663q2, abstractC1663q3);
    }
}
