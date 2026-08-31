package u;

import androidx.work.impl.WorkDatabaseVersions;
import i0.C1130b;
import i0.C1131c;
import i0.C1133e;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final m0 f16973A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final m0 f16974B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final m0 f16975C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final m0 f16976D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final m0 f16977E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final m0 f16978F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final m0 f16979G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final m0 f16980H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final m0 f16981I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final m0 f16982J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final m0 f16983K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final m0 f16984L;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m0 f16985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m0 f16986s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m0 f16987t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final m0 f16988u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m0 f16989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m0 f16990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final m0 f16991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m0 f16992y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final m0 f16993z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f16994q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 1;
        f16985r = new m0(i, 0);
        f16986s = new m0(i, 1);
        f16987t = new m0(i, 2);
        f16988u = new m0(i, 3);
        f16989v = new m0(i, 4);
        f16990w = new m0(i, 5);
        f16991x = new m0(i, 6);
        f16992y = new m0(i, 7);
        f16993z = new m0(i, 8);
        f16973A = new m0(i, 9);
        f16974B = new m0(i, 10);
        f16975C = new m0(i, 11);
        f16976D = new m0(i, 12);
        f16977E = new m0(i, 13);
        f16978F = new m0(i, 14);
        f16979G = new m0(i, 15);
        f16980H = new m0(i, 16);
        f16981I = new m0(i, 17);
        f16982J = new m0(i, 18);
        f16983K = new m0(i, 19);
        f16984L = new m0(i, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, int i7) {
        super(i);
        this.f16994q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, m5.h] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        switch (this.f16994q) {
            case 0:
                return C1386y.f15098a;
            case 1:
                ((B5.a) obj).invoke();
                return C1386y.f15098a;
            case 2:
                C1645d0 c1645d0 = (C1645d0) obj;
                long j = c1645d0.f16911w;
                ((a0.t) y0.f17085a.getValue()).c(c1645d0, f16987t, c1645d0.f16912x);
                long j7 = c1645d0.f16911w;
                if (j != j7) {
                    S s6 = c1645d0.f16903E;
                    if (s6 != null) {
                        if (s6.f16821a > j7) {
                            c1645d0.v();
                        } else {
                            s6.f16826g = j7;
                            if (s6.f16822b == null) {
                                s6.f16827h = D5.a.H((1.0d - ((double) s6.f16825e.a(0))) * c1645d0.f16911w);
                            }
                        }
                    } else if (j7 != 0) {
                        c1645d0.x();
                    }
                }
                return C1386y.f15098a;
            case 3:
                long j8 = ((W0.g) obj).f8014a;
                return new C1660n(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
            case 4:
                C1660n c1660n = (C1660n) obj;
                return new W0.g((((long) Float.floatToRawIntBits(c1660n.f16995a)) << 32) | (((long) Float.floatToRawIntBits(c1660n.f16996b)) & 4294967295L));
            case 5:
                return new C1659m(((W0.f) obj).f8013q);
            case 6:
                return new W0.f(((C1659m) obj).f16972a);
            case 7:
                return new C1659m(((Number) obj).floatValue());
            case 8:
                return Float.valueOf(((C1659m) obj).f16972a);
            case 9:
                long j9 = ((W0.i) obj).f8015a;
                return new C1660n((int) (j9 >> 32), (int) (j9 & 4294967295L));
            case 10:
                C1660n c1660n2 = (C1660n) obj;
                return new W0.i((((long) Math.round(c1660n2.f16995a)) << 32) | (((long) Math.round(c1660n2.f16996b)) & 4294967295L));
            case 11:
                long j10 = ((W0.k) obj).f8021a;
                return new C1660n((int) (j10 >> 32), (int) (j10 & 4294967295L));
            case 12:
                C1660n c1660n3 = (C1660n) obj;
                int iRound = Math.round(c1660n3.f16995a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c1660n3.f16996b);
                return new W0.k((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 13:
                return new C1659m(((Number) obj).intValue());
            case 14:
                return Integer.valueOf((int) ((C1659m) obj).f16972a);
            case 15:
                long j11 = ((C1130b) obj).f13520a;
                return new C1660n(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            case WorkDatabaseVersions.VERSION_16 /* 16 */:
                C1660n c1660n4 = (C1660n) obj;
                return new C1130b((((long) Float.floatToRawIntBits(c1660n4.f16995a)) << 32) | (((long) Float.floatToRawIntBits(c1660n4.f16996b)) & 4294967295L));
            case WorkDatabaseVersions.VERSION_17 /* 17 */:
                C1131c c1131c = (C1131c) obj;
                return new C1662p(c1131c.f13522a, c1131c.f13523b, c1131c.f13524c, c1131c.f13525d);
            case WorkDatabaseVersions.VERSION_18 /* 18 */:
                C1662p c1662p = (C1662p) obj;
                return new C1131c(c1662p.f17011a, c1662p.f17012b, c1662p.f17013c, c1662p.f17014d);
            case WorkDatabaseVersions.VERSION_19 /* 19 */:
                long j12 = ((C1133e) obj).f13533a;
                return new C1660n(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
            default:
                C1660n c1660n5 = (C1660n) obj;
                return new C1133e((((long) Float.floatToRawIntBits(c1660n5.f16995a)) << 32) | (((long) Float.floatToRawIntBits(c1660n5.f16996b)) & 4294967295L));
        }
    }
}
