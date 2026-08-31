package M5;

import C0.C0100s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: M5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0239a0 extends e0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3836v = AtomicIntegerFieldUpdater.newUpdater(C0239a0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final C0100s f3837u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0239a0(C0100s c0100s) {
        this.f3837u = c0100s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final boolean k() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.e0
    public final void l(Throwable th) {
        if (f3836v.compareAndSet(this, 0, 1)) {
            this.f3837u.invoke(th);
        }
    }
}
