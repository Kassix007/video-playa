package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f9368c = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Thread f9369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile i f9370b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i() {
        j.ATOMIC_HELPER.e(this, Thread.currentThread());
    }
}
