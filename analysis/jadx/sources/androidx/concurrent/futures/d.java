package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f9355b = new d(new c("Failure occurred while trying to finish a future.", 0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f9356a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(Throwable th) {
        this.f9356a = (Throwable) j.checkNotNull(th);
    }
}
