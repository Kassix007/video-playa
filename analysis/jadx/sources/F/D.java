package F;

import P.C0346b0;
import P.C0348c0;
import u3.InterfaceC1697b;
import v3.C1763a;
import x3.InterfaceC1892d;

/* JADX INFO: loaded from: classes.dex */
public final class D implements InterfaceC1892d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1776q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f1777r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f1778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f1779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f1780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f1781v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public D(v3.e eVar, InterfaceC1697b interfaceC1697b, C1763a c1763a) {
        this.f1781v = eVar;
        this.f1779t = null;
        this.f1780u = null;
        this.f1776q = false;
        this.f1777r = interfaceC1697b;
        this.f1778s = c1763a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a(com.google.android.gms.common.b bVar) {
        v3.o oVar = (v3.o) ((v3.e) this.f1781v).j.get((C1763a) this.f1778s);
        if (oVar != null) {
            oVar.m(bVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // x3.InterfaceC1892d
    public void c(com.google.android.gms.common.b bVar) {
        ((v3.e) this.f1781v).f17574m.post(new v3.q(this, bVar, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public D(int i, float f, N n7) {
        this.f1777r = n7;
        this.f1778s = new C0348c0(i);
        this.f1779t = new C0346b0(f);
        this.f1781v = new E.F(i, 30, 100);
    }
}
