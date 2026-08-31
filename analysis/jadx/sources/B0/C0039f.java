package B0;

import m5.C1386y;

/* JADX INFO: renamed from: B0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0039f extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0039f f409A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0039f f410B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0039f f411C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0039f f412r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0039f f413s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0039f f414t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0039f f415u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0039f f416v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0039f f417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0039f f418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0039f f419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0039f f420z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f421q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f412r = new C0039f(i, 0);
        f413s = new C0039f(i, 1);
        f414t = new C0039f(i, 2);
        f415u = new C0039f(i, 3);
        f416v = new C0039f(i, 4);
        f417w = new C0039f(i, 5);
        f418x = new C0039f(i, 6);
        f419y = new C0039f(i, 7);
        f420z = new C0039f(i, 8);
        f409A = new C0039f(i, 9);
        f410B = new C0039f(i, 10);
        f411C = new C0039f(i, 11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0039f(int i, int i7) {
        super(i);
        this.f421q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [B0.p0, c0.l] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f421q) {
            case 0:
                ((C0035d) obj).A0();
                break;
            case 1:
                x0 x0Var = (x0) obj;
                if (x0Var.x()) {
                    x0Var.f533r.Z(x0Var);
                }
                break;
            case 2:
                s0 s0Var = ((n0) obj).f498V;
                if (s0Var != null) {
                    s0Var.invalidate();
                }
                break;
            case 3:
                n0 n0Var = (n0) obj;
                if (n0Var.x() && n0Var.V0(true)) {
                    L l7 = n0Var.f478B;
                    P p7 = l7.f269V;
                    if (p7.f307l > 0) {
                        if (p7.f306k || p7.j) {
                            l7.R(false);
                        }
                        p7.f311p.c0();
                    }
                    C0.A a7 = (C0.A) O.a(l7);
                    a7.getRectManager().e(l7);
                    ((R.e) a7.f748f0.f367e.f499q).c(l7);
                    l7.f277d0 = true;
                    a7.L(null);
                }
                break;
            case 4:
                q0 q0Var = (q0) obj;
                if (q0Var.x()) {
                    q0Var.f502q.E();
                }
                break;
            case 5:
                L l8 = (L) obj;
                if (l8.F()) {
                    l8.R(false);
                }
                break;
            case 6:
                L l9 = (L) obj;
                if (l9.F()) {
                    l9.R(false);
                }
                break;
            case 7:
                L l10 = (L) obj;
                if (l10.F()) {
                    l10.P(false);
                }
                break;
            case 8:
                L l11 = (L) obj;
                if (l11.F()) {
                    l11.P(false);
                }
                break;
            case 9:
                L l12 = (L) obj;
                if (l12.F()) {
                    L.Q(l12, false, 7);
                }
                break;
            case 10:
                L l13 = (L) obj;
                if (l13.F()) {
                    L.S(l13, false, 7);
                }
                break;
            default:
                L l14 = (L) obj;
                if (l14.F()) {
                    l14.D();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
