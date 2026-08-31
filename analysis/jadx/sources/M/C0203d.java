package M;

import m5.C1386y;

/* JADX INFO: renamed from: M.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0203d extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0203d f3444r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0203d f3445s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0203d f3446t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0203d f3447u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0203d f3448v;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3449q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f3444r = new C0203d(i, 0);
        f3445s = new C0203d(i, 1);
        f3446t = new C0203d(i, 2);
        f3447u = new C0203d(i, 3);
        f3448v = new C0203d(i, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0203d(int i, int i7) {
        super(i);
        this.f3449q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f3449q;
        C1386y c1386y = C1386y.f15098a;
        switch (i) {
            case 0:
                break;
            case 1:
                H5.k[] kVarArr = I0.r.f2326a;
                I0.s sVar = I0.p.f2311m;
                H5.k kVar = I0.r.f2326a[6];
                sVar.a((I0.i) obj, Boolean.TRUE);
                break;
            case 2:
                H5.k[] kVarArr2 = I0.r.f2326a;
                ((I0.i) obj).j(I0.p.f2319u, c1386y);
                break;
            case 3:
                break;
            default:
                H5.k[] kVarArr3 = I0.r.f2326a;
                I0.s sVar2 = I0.p.f2310l;
                H5.k kVar2 = I0.r.f2326a[5];
                sVar2.a((I0.i) obj, Boolean.TRUE);
                break;
        }
        return c1386y;
    }
}
