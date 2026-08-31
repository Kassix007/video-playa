package v;

import B0.InterfaceC0051p;
import M5.AbstractC0263y;
import c0.AbstractC0724l;
import l0.C1219b;
import l0.InterfaceC1221d;

/* JADX INFO: renamed from: v.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1705B extends AbstractC0724l implements InterfaceC0051p {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final y.i f17219E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f17220F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f17221G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f17222H;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1705B(y.i iVar) {
        this.f17219E = iVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0051p
    public final void J(B0.N n7) {
        n7.a();
        C1219b c1219b = n7.f296q;
        if (this.f17220F) {
            InterfaceC1221d.g0(n7, j0.o.b(j0.o.f13718b, 0.3f), 0L, c1219b.d(), 0.0f, 122);
        } else if (this.f17221G || this.f17222H) {
            InterfaceC1221d.g0(n7, j0.o.b(j0.o.f13718b, 0.1f), 0L, c1219b.d(), 0.0f, 122);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        AbstractC0263y.t(l0(), null, null, new C1704A(this, null), 3);
    }
}
