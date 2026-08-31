package M5;

import m5.AbstractC1362a;
import m5.C1386y;
import n5.AbstractC1397A;
import q5.InterfaceC1524c;
import q5.InterfaceC1529h;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends B {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC1524c f3868u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j0(InterfaceC1529h interfaceC1529h, B5.e eVar) {
        super(interfaceC1529h, false, 1);
        this.f3868u = AbstractC1397A.p(eVar, this, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // M5.i0
    public final void T() throws Throwable {
        try {
            R5.b.h(C1386y.f15098a, AbstractC1397A.v(this.f3868u));
        } catch (Throwable th) {
            th = th;
            if (th instanceof D) {
                th = ((D) th).f3807q;
            }
            resumeWith(AbstractC1362a.b(th));
            throw th;
        }
    }
}
