package O0;

import A.Y;
import B0.C0029a;
import B0.C0050o;
import M5.AbstractC0263y;
import M5.q0;
import O3.D;
import d2.d0;
import q5.C1530i;
import x3.C1899k;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1899k f4271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0050o f4273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f4274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3.c f4275e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(C1899k c1899k, a aVar) {
        C0050o c0050o = f.f4276a;
        C0050o c0050o2 = f.f4276a;
        g gVar = new g();
        AbstractC0263y.a(g.f4277a.plus(S0.h.f7300a).plus(C1530i.f16022q).plus(new q0(null)));
        k3.c cVar = new k3.c(9);
        this.f4271a = c1899k;
        this.f4272b = aVar;
        this.f4273c = c0050o;
        this.f4274d = gVar;
        this.f4275e = cVar;
        new C0029a(19, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r a(q qVar) {
        C0050o c0050o = this.f4273c;
        Y y6 = new Y(14, this, qVar);
        synchronized (((D) c0050o.f499q)) {
            r rVar = (r) ((d0) c0050o.f500r).h(qVar);
            if (rVar != null) {
                if (rVar.f4295r) {
                    return rVar;
                }
            }
            try {
                r rVar2 = (r) y6.invoke(new Y(15, c0050o, qVar));
                synchronized (((D) c0050o.f499q)) {
                    if (((d0) c0050o.f500r).h(qVar) == null && rVar2.f4295r) {
                        ((d0) c0050o.f500r).l(qVar, rVar2);
                    }
                }
                return rVar2;
            } catch (Exception e7) {
                throw new IllegalStateException("Could not load font", e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final r b(p pVar, j jVar, int i, int i7) {
        a aVar = this.f4272b;
        aVar.getClass();
        int i8 = aVar.f4270q;
        j jVar2 = (i8 == 0 || i8 == Integer.MAX_VALUE) ? jVar : new j(D5.a.q(jVar.f4284q + i8, 1, 1000));
        this.f4271a.getClass();
        return a(new q(pVar, jVar2, i, i7, null));
    }
}
