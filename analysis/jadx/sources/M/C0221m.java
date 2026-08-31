package M;

import A.C0005b;
import P.C0371o;
import java.util.WeakHashMap;
import m5.C1386y;

/* JADX INFO: renamed from: M.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0221m extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0221m f3569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0221m f3570s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0221m f3571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0221m f3572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0221m f3573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0221m f3574w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0221m f3575x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0221m f3576y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0221m f3577z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f3578q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f3569r = new C0221m(i, 0);
        f3570s = new C0221m(i, 1);
        f3571t = new C0221m(i, 2);
        f3572u = new C0221m(i, 3);
        f3573v = new C0221m(i, 4);
        f3574w = new C0221m(i, 5);
        f3575x = new C0221m(i, 6);
        f3576y = new C0221m(i, 7);
        f3577z = new C0221m(i, 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0221m(int i, int i7) {
        super(i);
        this.f3578q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3578q;
        C1386y c1386y = C1386y.f15098a;
        switch (i) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o.x()) {
                    c0371o.N();
                } else {
                    C0201c.f3440a.a(null, 0.0f, 0.0f, null, 0L, c0371o, 196608);
                }
                return c1386y;
            case 1:
                C0371o c0371o2 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o2.x()) {
                    c0371o2.N();
                } else {
                    C0201c.f3440a.a(null, 0.0f, 0.0f, null, 0L, c0371o2, 196608);
                }
                return c1386y;
            case 2:
                C0371o c0371o3 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o3.x()) {
                    c0371o3.N();
                }
                return c1386y;
            case 3:
                C0371o c0371o4 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o4.x()) {
                    c0371o4.N();
                }
                return c1386y;
            case 4:
                C0371o c0371o5 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o5.x()) {
                    c0371o5.N();
                }
                return c1386y;
            case 5:
                C0371o c0371o6 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o6.x()) {
                    c0371o6.N();
                }
                return c1386y;
            case 6:
                C0371o c0371o7 = (C0371o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0371o7.x()) {
                    c0371o7.N();
                }
                return c1386y;
            case 7:
                C0371o c0371o8 = (C0371o) obj;
                ((Number) obj2).intValue();
                c0371o8.S(58488196);
                C0201c c0201c = C0201c.f3440a;
                WeakHashMap weakHashMap = A.Z.f60v;
                A.I i7 = new A.I(C0005b.e(c0371o8).f68k);
                c0371o8.p(false);
                return i7;
            default:
                return (J0) ((I0) obj2).f3322c.f3973g.getValue();
        }
    }
}
