package M5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: M5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0255p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3877b = AtomicIntegerFieldUpdater.newUpdater(C0255p.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3878a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0255p(boolean z5, Throwable th) {
        this.f3878a = th;
        this._handled$volatile = z5 ? 1 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3878a + ']';
    }
}
