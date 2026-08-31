package v;

import B0.AbstractC0041g;
import B0.E0;
import c0.AbstractC0724l;
import m0.C1346a;
import z0.InterfaceC1953m;

/* JADX INFO: loaded from: classes.dex */
public final class J extends AbstractC0724l implements E0 {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final M f17251F = new M(5);

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C1346a f17252E;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.E0
    public final Object o() {
        return f17251F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x0(InterfaceC1953m interfaceC1953m) {
        this.f17252E.invoke(interfaceC1953m);
        J j = (J) AbstractC0041g.j(this);
        if (j != null) {
            j.x0(interfaceC1953m);
        }
    }
}
