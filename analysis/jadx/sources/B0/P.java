package B0;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f301c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f303e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f305h;
    public int i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f310o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Y f312q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G f302d = G.f229u;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0034c0 f311p = new C0034c0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public P(L l7) {
        this.f299a = l7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final n0 a() {
        return this.f299a.f268U.f431c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        int i7 = this.f307l;
        this.f307l = i;
        if ((i7 == 0) != (i == 0)) {
            L lS = this.f299a.s();
            P p7 = lS != null ? lS.f269V : null;
            if (p7 != null) {
                if (i == 0) {
                    p7.b(p7.f307l - 1);
                } else {
                    p7.b(p7.f307l + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        int i7 = this.f310o;
        this.f310o = i;
        if ((i7 == 0) != (i == 0)) {
            L lS = this.f299a.s();
            P p7 = lS != null ? lS.f269V : null;
            if (p7 != null) {
                if (i == 0) {
                    p7.c(p7.f310o - 1);
                } else {
                    p7.c(p7.f310o + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z5) {
        if (this.f306k != z5) {
            this.f306k = z5;
            if (z5 && !this.j) {
                b(this.f307l + 1);
            } else {
                if (z5 || this.j) {
                    return;
                }
                b(this.f307l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(boolean z5) {
        if (this.j != z5) {
            this.j = z5;
            if (z5 && !this.f306k) {
                b(this.f307l + 1);
            } else {
                if (z5 || this.f306k) {
                    return;
                }
                b(this.f307l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(boolean z5) {
        if (this.f309n != z5) {
            this.f309n = z5;
            if (z5 && !this.f308m) {
                c(this.f310o + 1);
            } else {
                if (z5 || this.f308m) {
                    return;
                }
                c(this.f310o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z5) {
        if (this.f308m != z5) {
            this.f308m = z5;
            if (z5 && !this.f309n) {
                c(this.f310o + 1);
            } else {
                if (z5 || this.f309n) {
                    return;
                }
                c(this.f310o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h() {
        C0034c0 c0034c0 = this.f311p;
        P p7 = c0034c0.f400v;
        Object obj = c0034c0.f380G;
        L l7 = this.f299a;
        if ((obj != null || p7.a().g() != null) && c0034c0.f379F) {
            c0034c0.f379F = false;
            c0034c0.f380G = p7.a().g();
            L lS = l7.s();
            if (lS != null) {
                L.S(lS, false, 7);
            }
        }
        Y y6 = this.f312q;
        if (y6 != null) {
            P p8 = y6.f353v;
            if (y6.f351L == null) {
                U uZ0 = p8.a().z0();
                kotlin.jvm.internal.m.b(uZ0);
                if (uZ0.f325B.g() == null) {
                    return;
                }
            }
            if (y6.f350K) {
                y6.f350K = false;
                U uZ02 = p8.a().z0();
                kotlin.jvm.internal.m.b(uZ02);
                y6.f351L = uZ02.f325B.g();
                if (AbstractC0041g.q(l7)) {
                    L lS2 = l7.s();
                    if (lS2 != null) {
                        L.S(lS2, false, 7);
                        return;
                    }
                    return;
                }
                L lS3 = l7.s();
                if (lS3 != null) {
                    L.Q(lS3, false, 7);
                }
            }
        }
    }
}
