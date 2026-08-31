package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f9357d = new e(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f9358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f9360c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Runnable runnable, Executor executor) {
        this.f9358a = runnable;
        this.f9359b = executor;
    }
}
