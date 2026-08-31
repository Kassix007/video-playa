package C0;

import P.C0345b;
import P.C0371o;
import a1.C0616i;
import m5.C1386y;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends kotlin.jvm.internal.n implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f978t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(Object obj, Object obj2, B5.e eVar, int i, int i7) {
        super(2);
        this.f975q = i7;
        this.f978t = obj;
        this.f976r = obj2;
        this.f977s = eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f975q) {
            case 0:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (c0371o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0103t0.a((A) this.f978t, (C0082i0) this.f976r, (B5.e) this.f977s, c0371o, 0);
                } else {
                    c0371o.N();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC0103t0.a((B0.t0) this.f978t, (C0082i0) this.f976r, (B5.e) this.f977s, (C0371o) obj, C0345b.w(1));
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC1397A.c((B5.a) this.f978t, (C0616i) this.f976r, (X.e) this.f977s, (C0371o) obj, C0345b.w(385));
                break;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) this.f978t;
                float f = fFloatValue - vVar.f14265q;
                w.H0 h02 = (w.H0) this.f976r;
                w.E0 e02 = (w.E0) this.f977s;
                long jH = h02.h(h02.d(f));
                w.H0 h03 = e02.f17768a;
                vVar.f14265q += h02.d(h02.g(w.H0.a(h03, h03.j, jH, 1)));
                break;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.f975q = i;
        this.f978t = obj;
        this.f976r = obj2;
        this.f977s = obj3;
    }
}
