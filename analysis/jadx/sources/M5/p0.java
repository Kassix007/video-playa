package M5;

import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends R5.r {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3879u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(InterfaceC1529h interfaceC1529h, InterfaceC1524c interfaceC1524c, int i) {
        super(interfaceC1524c, interfaceC1529h);
        this.f3879u = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final boolean x(Throwable th) {
        switch (this.f3879u) {
            case 0:
                return false;
            default:
                if (th instanceof Q5.p) {
                    return true;
                }
                return s(th);
        }
    }
}
