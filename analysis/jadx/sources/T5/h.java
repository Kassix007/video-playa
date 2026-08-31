package T5;

import M5.T;
import java.util.concurrent.Executor;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends T {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f7472q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.T
    public final Executor a0() {
        return this.f7472q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        c.c(this.f7472q, runnable, 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatchYield(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        c.c(this.f7472q, runnable, 2);
    }
}
