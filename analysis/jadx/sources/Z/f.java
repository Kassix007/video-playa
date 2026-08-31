package Z;

import A.J;
import B0.C0029a;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.S;
import P.T0;
import java.util.Map;
import m5.C1386y;
import r.C1548G;
import r.O;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f8299e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1548G f8301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f8302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0029a f8303d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        d dVar = d.f8293r;
        e eVar = e.f8296r;
        m mVar = n.f8314a;
        f8299e = new m(0, dVar, eVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(Map map) {
        this.f8300a = map;
        long[] jArr = O.f16162a;
        this.f8301b = new C1548G();
        this.f8303d = new C0029a(22, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.c
    public final void e(Object obj) {
        if (this.f8301b.j(obj) == null) {
            this.f8300a.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Z.c
    public final void f(Object obj, X.e eVar, C0371o c0371o, int i) {
        c0371o.S(-1198538093);
        c0371o.V(obj);
        Object objH = c0371o.H();
        S s6 = C0363k.f5418a;
        if (objH == s6) {
            C0029a c0029a = this.f8303d;
            if (!((Boolean) c0029a.invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map map = (Map) this.f8300a.get(obj);
            T0 t02 = k.f8310a;
            j jVar = new j(map, c0029a);
            c0371o.d0(jVar);
            objH = jVar;
        }
        i iVar = (i) objH;
        C0345b.a(k.f8310a.a(iVar), eVar, c0371o, (i & 112) | 8);
        boolean zI = c0371o.i(this) | c0371o.i(obj) | c0371o.i(iVar);
        Object objH2 = c0371o.H();
        if (zI || objH2 == s6) {
            objH2 = new J(this, obj, iVar, 4);
            c0371o.d0(objH2);
        }
        C0345b.c(C1386y.f15098a, (B5.c) objH2, c0371o);
        if (c0371o.f5476x && c0371o.f5444F.i == c0371o.f5477y) {
            c0371o.f5477y = -1;
            c0371o.f5476x = false;
        }
        c0371o.p(false);
        c0371o.p(false);
    }
}
