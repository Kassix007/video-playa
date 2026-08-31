package M;

import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.C0389z;
import P.T0;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T0 f3618a = new T0(C0215j.f3549z);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0389z f3619b = new C0389z(C0215j.f3548y);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f3620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f3621d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j = j0.o.f13722g;
        f3620c = new u0(true, Float.NaN, j);
        f3621d = new u0(false, Float.NaN, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final v.P a(float f, C0371o c0371o, int i, int i7) {
        v.P u0Var;
        boolean z5 = true;
        boolean z6 = (i7 & 1) != 0;
        if ((i7 & 2) != 0) {
            f = Float.NaN;
        }
        long j = j0.o.f13722g;
        c0371o.S(-1280632857);
        if (((Boolean) c0371o.k(f3618a)).booleanValue()) {
            u.z0 z0Var = L.l.f3046a;
            P.W wT = C0345b.t(new j0.o(j), c0371o);
            boolean z7 = (((i & 14) ^ 6) > 4 && c0371o.h(z6)) || (i & 6) == 4;
            if ((((i & 112) ^ 48) <= 32 || !c0371o.d(f)) && (i & 48) != 32) {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object objH = c0371o.H();
            if (z8 || objH == C0363k.f5418a) {
                objH = new L.d(z6, f, wT);
                c0371o.d0(objH);
            }
            u0Var = (L.d) objH;
        } else if (W0.f.a(f, Float.NaN) && j0.o.c(j, j)) {
            u0Var = z6 ? f3620c : f3621d;
        } else {
            u0Var = new u0(z6, f, j);
        }
        c0371o.p(false);
        return u0Var;
    }
}
