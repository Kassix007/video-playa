package u3;

/* JADX INFO: loaded from: classes.dex */
public final class i extends UnsupportedOperationException {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.google.android.gms.common.d f17203q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(com.google.android.gms.common.d dVar) {
        this.f17203q = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f17203q));
    }
}
