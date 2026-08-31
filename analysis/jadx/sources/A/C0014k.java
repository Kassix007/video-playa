package A;

import E.C0126i;
import F.C0163q;
import P.C0345b;
import P.C0371o;
import c0.InterfaceC0725m;
import m5.C1386y;

/* JADX INFO: renamed from: A.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0014k extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f112q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f113r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f114s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0014k(int i, int i7, Object obj) {
        super(2);
        this.f112q = i7;
        this.f114s = obj;
        this.f113r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f112q) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC0017n.a((InterfaceC0725m) this.f114s, (C0371o) obj, C0345b.w(this.f113r | 1));
                break;
            case 1:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C.h hVar = (C.h) this.f114s;
                    E.Y y6 = hVar.f604b.f602b;
                    int i = this.f113r;
                    C0126i c0126iF = y6.f(i);
                    ((C.f) c0126iF.f1569c).f601b.invoke(hVar.f605c, Integer.valueOf(i - c0126iF.f1567a), c0371o, 0);
                } else {
                    c0371o.N();
                }
                break;
            case 2:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (c0371o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    E.Y y7 = ((D.i) this.f114s).f1216b.f1214c;
                    int i7 = this.f113r;
                    C0126i c0126iF2 = y7.f(i7);
                    ((D.f) c0126iF2.f1569c).f1209c.invoke(D.j.f1218a, Integer.valueOf(i7 - c0126iF2.f1567a), c0371o2, 6);
                } else {
                    c0371o2.N();
                }
                break;
            default:
                C0371o c0371o3 = (C0371o) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (c0371o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    E.Y yK = ((F.x) this.f114s).f1930b.k();
                    int i8 = this.f113r;
                    C0126i c0126iF3 = yK.f(i8);
                    ((C0163q) c0126iF3.f1569c).f1906b.invoke(F.C.f1775a, Integer.valueOf(i8 - c0126iF3.f1567a), c0371o3, 0);
                } else {
                    c0371o3.N();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
