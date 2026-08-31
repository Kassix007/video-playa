package P;

import m5.C1386y;

/* JADX INFO: renamed from: P.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0355g extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0355g f5402r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0355g f5403s;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f5404q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        f5402r = new C0355g(i, 0);
        f5403s = new C0355g(i, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0355g(int i, int i7) {
        super(i);
        this.f5404q = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5404q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0371o.N();
                }
                break;
            default:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!c0371o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0371o2.N();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
