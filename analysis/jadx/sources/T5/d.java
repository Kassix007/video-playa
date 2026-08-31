package T5;

import M5.AbstractC0257s;
import M5.T;
import R5.u;
import java.util.concurrent.Executor;
import q5.C1530i;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class d extends T implements Executor {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f7468q = new d();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AbstractC0257s f7469r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        l lVar = l.f7481q;
        int i = u.f7270a;
        if (64 >= i) {
            i = 64;
        }
        f7469r = AbstractC0257s.limitedParallelism$default(lVar, R5.b.l("kotlinx.coroutines.io.parallelism", i, 12), null, 2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        f7469r.dispatch(interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatchYield(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        f7469r.dispatchYield(interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        dispatch(C1530i.f16022q, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final AbstractC0257s limitedParallelism(int i, String str) {
        return l.f7481q.limitedParallelism(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // M5.T
    public final Executor a0() {
        return this;
    }
}
