package u;

import P.C0345b;
import P.C0354f0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;

/* JADX INFO: renamed from: u.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1629H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final R.e f16784a = new R.e(new C1626E[16]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0354f0 f16785b = C0345b.q(Boolean.FALSE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16786c = Long.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0354f0 f16787d = C0345b.q(Boolean.TRUE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, C0371o c0371o) {
        c0371o.U(-318043801);
        int i7 = (c0371o.i(this) ? 4 : 2) | i;
        if (c0371o.K(i7 & 1, (i7 & 3) != 2)) {
            Object objH = c0371o.H();
            P.S s6 = C0363k.f5418a;
            if (objH == s6) {
                objH = C0345b.q(null);
                c0371o.d0(objH);
            }
            P.W w3 = (P.W) objH;
            if (((Boolean) this.f16787d.getValue()).booleanValue() || ((Boolean) this.f16785b.getValue()).booleanValue()) {
                c0371o.S(1719883733);
                boolean zI = c0371o.i(this);
                Object objH2 = c0371o.H();
                if (zI || objH2 == s6) {
                    objH2 = new C1628G(w3, this, null);
                    c0371o.d0(objH2);
                }
                C0345b.e((B5.e) objH2, c0371o, this);
                c0371o.p(false);
            } else {
                c0371o.S(1721270456);
                c0371o.p(false);
            }
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new A.e0(i, 16, this);
        }
    }
}
