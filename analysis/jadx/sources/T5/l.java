package T5;

import M5.AbstractC0257s;
import R5.o;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC0257s {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final l f7481q = new l();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatch(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        e.f7470r.f7472q.b(runnable, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final void dispatchYield(InterfaceC1529h interfaceC1529h, Runnable runnable) {
        e.f7470r.f7472q.b(runnable, true, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final AbstractC0257s limitedParallelism(int i, String str) {
        R5.b.a(i);
        return i >= k.f7479d ? str != null ? new o(this, str) : this : super.limitedParallelism(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.AbstractC0257s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
