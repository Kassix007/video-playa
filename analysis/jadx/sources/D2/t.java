package D2;

import M5.AbstractC0263y;
import M5.B;
import M5.H;
import M5.InterfaceC0241b0;
import M5.V;
import androidx.lifecycle.AbstractC0654q;
import androidx.lifecycle.InterfaceC0660x;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class t implements q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t2.l f1444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f1445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F2.a f1446s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AbstractC0654q f1447t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0241b0 f1448u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t(t2.l lVar, j jVar, F2.a aVar, AbstractC0654q abstractC0654q, InterfaceC0241b0 interfaceC0241b0) {
        this.f1444q = lVar;
        this.f1445r = jVar;
        this.f1446s = aVar;
        this.f1447t = abstractC0654q;
        this.f1448u = interfaceC0241b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0643f
    public final void c(InterfaceC0660x interfaceC0660x) {
        v vVarC = H2.f.c(this.f1446s.f1946r);
        synchronized (vVarC) {
            try {
                B b7 = vVarC.f1451r;
                if (b7 != null) {
                    b7.a(null);
                }
                V v6 = V.f3830q;
                T5.e eVar = H.f3811a;
                vVarC.f1451r = AbstractC0263y.t(v6, R5.n.f7261a.f4044t, null, new u(vVarC, null), 2);
                vVarC.f1450q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.q
    public final void f() {
        F2.a aVar = this.f1446s;
        if (aVar.f1946r.isAttachedToWindow()) {
            return;
        }
        v vVarC = H2.f.c(aVar.f1946r);
        t tVar = vVarC.f1452s;
        if (tVar != null) {
            AbstractC0654q abstractC0654q = tVar.f1447t;
            tVar.f1448u.a(null);
            F2.a aVar2 = tVar.f1446s;
            if (aVar2 != null) {
                abstractC0654q.c(aVar2);
            }
            abstractC0654q.c(tVar);
        }
        vVarC.f1452s = this;
        throw new CancellationException("'ViewTarget.view' must be attached to a window.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // D2.q
    public final void start() {
        AbstractC0654q abstractC0654q = this.f1447t;
        abstractC0654q.a(this);
        F2.a aVar = this.f1446s;
        if (aVar != null) {
            abstractC0654q.c(aVar);
            abstractC0654q.a(aVar);
        }
        v vVarC = H2.f.c(aVar.f1946r);
        t tVar = vVarC.f1452s;
        if (tVar != null) {
            AbstractC0654q abstractC0654q2 = tVar.f1447t;
            tVar.f1448u.a(null);
            F2.a aVar2 = tVar.f1446s;
            if (aVar2 != null) {
                abstractC0654q2.c(aVar2);
            }
            abstractC0654q2.c(tVar);
        }
        vVarC.f1452s = this;
    }
}
