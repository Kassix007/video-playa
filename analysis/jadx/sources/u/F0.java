package u;

/* JADX INFO: loaded from: classes.dex */
public final class F0 implements B0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final D0 f16774q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f16775r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f16776s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public F0(D0 d02, long j) {
        this.f16774q = d02;
        this.f16775r = ((long) (d02.m() + d02.l())) * 1000000;
        this.f16776s = j * 1000000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final boolean a() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final long b(AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return Long.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long c(long j) {
        long j7 = j + this.f16776s;
        if (j7 <= 0) {
            return 0L;
        }
        long j8 = this.f16775r;
        return j7 - ((j7 / j8) * j8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1663q d(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        long j7 = this.f16776s;
        long j8 = j + j7;
        long j9 = this.f16775r;
        return j8 > j9 ? this.f16774q.n(j9 - j7, abstractC1663q, abstractC1663q3, abstractC1663q2) : abstractC1663q2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final AbstractC1663q g(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return this.f16774q.g(c(j), abstractC1663q, abstractC1663q2, d(j, abstractC1663q, abstractC1663q3, abstractC1663q2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // u.B0
    public final AbstractC1663q n(long j, AbstractC1663q abstractC1663q, AbstractC1663q abstractC1663q2, AbstractC1663q abstractC1663q3) {
        return this.f16774q.n(c(j), abstractC1663q, abstractC1663q2, d(j, abstractC1663q, abstractC1663q3, abstractC1663q2));
    }
}
