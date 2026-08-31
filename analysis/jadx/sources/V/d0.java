package v;

import P.C0363k;
import P.C0371o;
import P.C0389z;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0389z f17323a = new C0389z(r.f17379t);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final C1717l a(C0371o c0371o) {
        c0371o.S(282942128);
        C1718m c1718m = (C1718m) c0371o.k(f17323a);
        if (c1718m == null) {
            c0371o.p(false);
            return null;
        }
        boolean zG = c0371o.g(c1718m);
        Object objH = c0371o.H();
        if (zG || objH == C0363k.f5418a) {
            Object c1717l = new C1717l(c1718m.f17361a, c1718m.f17362b, c1718m.f17363c, c1718m.f17364d);
            c0371o.d0(c1717l);
            objH = c1717l;
        }
        C1717l c1717l2 = (C1717l) objH;
        c0371o.p(false);
        return c1717l2;
    }
}
