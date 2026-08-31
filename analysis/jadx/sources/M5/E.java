package M5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class E extends R5.r {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3808u = AtomicIntegerFieldUpdater.newUpdater(E.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.r, M5.i0
    public final void m(Object obj) {
        p(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // R5.r, M5.i0
    public final void p(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3808u;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                R5.b.h(AbstractC0263y.v(obj), AbstractC1397A.v(this.f7266t));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
