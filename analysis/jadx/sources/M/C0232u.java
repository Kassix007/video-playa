package M;

/* JADX INFO: renamed from: M.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0232u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3625d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0232u(long j, long j7, long j8, long j9) {
        this.f3622a = j;
        this.f3623b = j7;
        this.f3624c = j8;
        this.f3625d = j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0232u)) {
            return false;
        }
        C0232u c0232u = (C0232u) obj;
        return j0.o.c(this.f3622a, c0232u.f3622a) && j0.o.c(this.f3623b, c0232u.f3623b) && j0.o.c(this.f3624c, c0232u.f3624c) && j0.o.c(this.f3625d, c0232u.f3625d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int i = j0.o.f13723h;
        return Long.hashCode(this.f3625d) + k1.i.d(k1.i.d(Long.hashCode(this.f3622a) * 31, 31, this.f3623b), 31, this.f3624c);
    }
}
