package R5;

import M5.A;
import M5.AbstractC0257s;
import M5.C;
import M5.C0247h;
import M5.J;
import M5.v0;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0257s implements C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C f7262q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0257s f7263r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7264s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: M5.s */
    /* JADX WARN: Multi-variable type inference failed */
    public o(AbstractC0257s abstractC0257s, String str) {
        C c7 = abstractC0257s instanceof C ? (C) abstractC0257s : null;
        this.f7262q = c7 == null ? A.f3804a : c7;
        this.f7263r = abstractC0257s;
        this.f7264s = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        this.f7263r.dispatch(interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatchYield(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        this.f7263r.dispatchYield(interfaceC1529h, runnable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final boolean isDispatchNeeded(InterfaceC1529h interfaceC1529h) {
        return this.f7263r.isDispatchNeeded(interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final J n(long j, v0 v0Var, InterfaceC1529h interfaceC1529h) {
        return this.f7262q.n(j, v0Var, interfaceC1529h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        return this.f7264s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.C
    public final void z(long j, C0247h c0247h) {
        this.f7262q.z(j, c0247h);
    }
}
