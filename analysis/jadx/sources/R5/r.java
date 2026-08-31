package R5;

import M5.AbstractC0238a;
import M5.AbstractC0263y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public class r extends AbstractC0238a implements s5.d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC1524c f7266t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r(InterfaceC1524c interfaceC1524c, InterfaceC1529h interfaceC1529h) {
        super(interfaceC1529h, true);
        this.f7266t = interfaceC1524c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final boolean L() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.d
    public final s5.d getCallerFrame() {
        InterfaceC1524c interfaceC1524c = this.f7266t;
        if (interfaceC1524c instanceof s5.d) {
            return (s5.d) interfaceC1524c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public void m(Object obj) {
        b.h(AbstractC0263y.v(obj), AbstractC1397A.v(this.f7266t));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public void p(Object obj) {
        this.f7266t.resumeWith(AbstractC0263y.v(obj));
    }

    public void e0() {
    }
}
