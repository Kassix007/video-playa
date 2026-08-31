package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f9350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f9351d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f9353b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (j.GENERATE_CANCELLATION_CAUSES) {
            f9351d = null;
            f9350c = null;
        } else {
            f9351d = new b(false, null);
            f9350c = new b(true, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(boolean z5, Throwable th) {
        this.f9352a = z5;
        this.f9353b = th;
    }
}
