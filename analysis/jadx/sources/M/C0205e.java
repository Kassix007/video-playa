package M;

/* JADX INFO: renamed from: M.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3467d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0205e(long j, long j7, long j8, long j9) {
        this.f3464a = j;
        this.f3465b = j7;
        this.f3466c = j8;
        this.f3467d = j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0205e)) {
            return false;
        }
        C0205e c0205e = (C0205e) obj;
        return j0.o.c(this.f3464a, c0205e.f3464a) && j0.o.c(this.f3465b, c0205e.f3465b) && j0.o.c(this.f3466c, c0205e.f3466c) && j0.o.c(this.f3467d, c0205e.f3467d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = j0.o.f13723h;
        return Long.hashCode(this.f3467d) + k1.i.d(k1.i.d(Long.hashCode(this.f3464a) * 31, 31, this.f3465b), 31, this.f3466c);
    }
}
