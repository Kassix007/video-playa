package U1;

import P.E;
import java.util.Map;
import r.C1548G;
import t.C1613l;

/* JADX INFO: loaded from: classes.dex */
public final class n implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7564d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i) {
        this.f7561a = i;
        this.f7562b = obj;
        this.f7563c = obj2;
        this.f7564d = obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.E
    public final void a() {
        switch (this.f7561a) {
            case 0:
                r rVar = (r) this.f7562b;
                T1.d dVar = (T1.d) this.f7563c;
                rVar.b().c(dVar);
                ((a0.q) this.f7564d).remove(dVar);
                break;
            case 1:
                Z.f fVar = (Z.f) this.f7562b;
                C1548G c1548g = fVar.f8301b;
                Object obj = this.f7563c;
                Object objJ = c1548g.j(obj);
                Z.i iVar = (Z.i) this.f7564d;
                if (objJ == iVar) {
                    Map map = fVar.f8300a;
                    Map mapB = iVar.b();
                    if (!mapB.isEmpty()) {
                        map.put(obj, mapB);
                    } else {
                        map.remove(obj);
                    }
                }
                break;
            default:
                a0.q qVar = (a0.q) this.f7564d;
                Object obj2 = this.f7562b;
                qVar.remove(obj2);
                ((C1613l) this.f7563c).f16622d.j(obj2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public n(a0.q qVar, Object obj, C1613l c1613l) {
        this.f7561a = 2;
        this.f7564d = qVar;
        this.f7562b = obj;
        this.f7563c = c1613l;
    }
}
