package e5;

import C.C0063c;
import P.C0363k;
import P.C0371o;
import P.W;
import R4.C0468k1;
import a5.v;
import java.util.List;
import kotlin.jvm.internal.n;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n implements B5.g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f12667q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f12668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f12669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f12670t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, C0468k1 c0468k1, W w3, W w6) {
        super(4);
        this.f12667q = list;
        this.f12668r = c0468k1;
        this.f12669s = w3;
        this.f12670t = w6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.g
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C0063c c0063c = (C0063c) obj;
        int iIntValue = ((Number) obj2).intValue();
        C0371o c0371o = (C0371o) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (c0371o.g(c0063c) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= c0371o.e(iIntValue) ? 32 : 16;
        }
        if (c0371o.K(i & 1, (i & 147) != 146)) {
            C1057b c1057b = (C1057b) this.f12667q.get(iIntValue);
            c0371o.S(754738372);
            Object objH = c0371o.H();
            if (objH == C0363k.f5418a) {
                objH = new v(1, this.f12669s, this.f12670t);
                c0371o.d0(objH);
            }
            Q2.g.f(this.f12668r, c1057b, (B5.a) objH, c0371o, 384);
            c0371o.p(false);
        } else {
            c0371o.N();
        }
        return C1386y.f15098a;
    }
}
