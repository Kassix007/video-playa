package H1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2089b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(long j, long j7) {
        if (j7 == 0) {
            this.f2088a = 0L;
            this.f2089b = 1L;
        } else {
            this.f2088a = j;
            this.f2089b = j7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2088a + "/" + this.f2089b;
    }
}
