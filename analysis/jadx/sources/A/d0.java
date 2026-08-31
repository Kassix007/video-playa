package A;

import P.C0363k;
import P.C0371o;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.n implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f91q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, int i7) {
        super(i);
        this.f91q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f91q;
        P.S s6 = C0363k.f5418a;
        switch (i) {
            case 0:
                C0371o c0371o = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o.S(359872873);
                WeakHashMap weakHashMap = Z.f60v;
                Z zE = C0005b.e(c0371o);
                boolean zG = c0371o.g(zE);
                Object objH = c0371o.H();
                if (zG || objH == s6) {
                    objH = new F(zE.f63c);
                    c0371o.d0(objH);
                }
                F f = (F) objH;
                c0371o.p(false);
                return f;
            case 1:
                C0371o c0371o2 = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o2.S(359872873);
                WeakHashMap weakHashMap2 = Z.f60v;
                Z zE2 = C0005b.e(c0371o2);
                boolean zG2 = c0371o2.g(zE2);
                Object objH2 = c0371o2.H();
                if (zG2 || objH2 == s6) {
                    objH2 = new F(zE2.f65e);
                    c0371o2.d0(objH2);
                }
                F f7 = (F) objH2;
                c0371o2.p(false);
                return f7;
            default:
                C0371o c0371o3 = (C0371o) obj2;
                ((Number) obj3).intValue();
                c0371o3.S(359872873);
                WeakHashMap weakHashMap3 = Z.f60v;
                Z zE3 = C0005b.e(c0371o3);
                boolean zG3 = c0371o3.g(zE3);
                Object objH3 = c0371o3.H();
                if (zG3 || objH3 == s6) {
                    objH3 = new F(zE3.f);
                    c0371o3.d0(objH3);
                }
                F f8 = (F) objH3;
                c0371o3.p(false);
                return f8;
        }
    }
}
