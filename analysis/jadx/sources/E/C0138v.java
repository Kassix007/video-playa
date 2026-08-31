package E;

import P.C0345b;
import P.C0368m0;
import P.C0371o;
import c0.InterfaceC0725m;
import java.util.Arrays;
import m5.C1386y;
import n5.AbstractC1397A;

/* JADX INFO: renamed from: E.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0138v extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1595t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0138v(int i, int i7, Object obj, Object obj2) {
        super(2);
        this.f1592q = i7;
        this.f1594s = obj;
        this.f1595t = obj2;
        this.f1593r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1592q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((InterfaceC0140x) this.f1594s).e(this.f1593r, c0371o, this.f1595t);
                } else {
                    c0371o.N();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                C0368m0[] c0368m0Arr = (C0368m0[]) this.f1594s;
                C0345b.b((C0368m0[]) Arrays.copyOf(c0368m0Arr, c0368m0Arr.length), (B5.e) this.f1595t, (C0371o) obj, C0345b.w(this.f1593r | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                C0345b.a((C0368m0) this.f1594s, (X.e) this.f1595t, (C0371o) obj, C0345b.w(this.f1593r | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ((X.e) this.f1594s).b(C0345b.w(this.f1593r) | 1, (C0371o) obj, this.f1595t);
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC1397A.h((InterfaceC0725m) this.f1594s, (B5.e) this.f1595t, (C0371o) obj, C0345b.w(this.f1593r | 1));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0138v(int i, InterfaceC0140x interfaceC0140x, Object obj) {
        super(2);
        this.f1592q = 0;
        this.f1594s = interfaceC0140x;
        this.f1593r = i;
        this.f1595t = obj;
    }
}
