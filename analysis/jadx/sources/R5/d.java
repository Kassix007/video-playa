package R5;

import M5.InterfaceC0261w;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0261w {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1529h f7234q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(InterfaceC1529h interfaceC1529h) {
        this.f7234q = interfaceC1529h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.InterfaceC0261w
    public final InterfaceC1529h d() {
        return this.f7234q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f7234q + ')';
    }
}
