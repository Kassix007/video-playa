package P;

/* JADX INFO: renamed from: P.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0380t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0382u f5509a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0380t(C0382u c0382u) {
        this.f5509a = c0382u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0380t) {
            return this.f5509a.equals(((C0380t) obj).f5509a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f5509a.hashCode() * 31;
    }
}
