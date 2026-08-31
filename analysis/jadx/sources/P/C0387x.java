package P;

import M5.AbstractC0263y;
import M5.InterfaceC0261w;

/* JADX INFO: renamed from: P.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0387x implements w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC0261w f5575q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0387x(InterfaceC0261w interfaceC0261w) {
        this.f5575q = interfaceC0261w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        InterfaceC0261w interfaceC0261w = this.f5575q;
        if (interfaceC0261w instanceof y0) {
            ((y0) interfaceC0261w).a();
        } else {
            AbstractC0263y.e(interfaceC0261w, new H(1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        InterfaceC0261w interfaceC0261w = this.f5575q;
        if (interfaceC0261w instanceof y0) {
            ((y0) interfaceC0261w).a();
        } else {
            AbstractC0263y.e(interfaceC0261w, new H(1));
        }
    }

    @Override // P.w0
    public final void b() {
    }
}
