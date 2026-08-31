package P;

/* JADX INFO: renamed from: P.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0361j extends IllegalStateException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f5417q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0361j(String str) {
        this.f5417q = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f5417q;
    }
}
