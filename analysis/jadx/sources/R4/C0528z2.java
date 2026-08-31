package R4;

import B0.C0050o;
import M5.InterfaceC0261w;
import P.C0348c0;
import j5.C1166c;
import java.util.List;
import k5.C1190b;
import m5.AbstractC1362a;
import m5.C1386y;
import q5.InterfaceC1524c;

/* JADX INFO: renamed from: R4.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0528z2 extends s5.i implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0050o f7223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0348c0 f7224r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528z2(C0050o c0050o, C0348c0 c0348c0, InterfaceC1524c interfaceC1524c) {
        super(2, interfaceC1524c);
        this.f7223q = c0050o;
        this.f7224r = c0348c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final InterfaceC1524c create(Object obj, InterfaceC1524c interfaceC1524c) {
        return new C0528z2(this.f7223q, this.f7224r, interfaceC1524c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) {
        C0528z2 c0528z2 = (C0528z2) create((InterfaceC0261w) obj, (InterfaceC1524c) obj2);
        C1386y c1386y = C1386y.f15098a;
        c0528z2.invokeSuspend(c1386y);
        return c1386y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s5.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.J j;
        C0516w2 c0516w2;
        List list;
        androidx.lifecycle.J j7;
        C0516w2 c0516w22;
        AbstractC1362a.e(obj);
        C0050o c0050o = this.f7223q;
        C0468k1 c0468k1 = (C0468k1) c0050o.f499q;
        C0458i c0458i = c0468k1.f7073d;
        if (c0458i != null && (c0516w2 = c0458i.f7008n) != null) {
            List list2 = null;
            if ((c0516w2 != null ? c0516w2.f7203a : null) != null && c0516w2 != null && (list = c0516w2.f7203a) != null && (!list.isEmpty())) {
                C0458i c0458i2 = c0468k1.f7073d;
                if (c0458i2 != null && (c0516w22 = c0458i2.f7008n) != null) {
                    list2 = c0516w22.f7203a;
                }
                C1190b c1190b = c0468k1.f7086l;
                if (c1190b != null && (j7 = c1190b.f14129c) != null) {
                    j7.e(c0468k1.f7069b, new N(new C0524y2(list2, c0050o, this.f7224r, 0), 3));
                }
            }
        }
        C1166c c1166c = c0468k1.f7097s;
        if (c1166c != null && (j = c1166c.f13864g) != null) {
            j.e(c0468k1.f7069b, new N(new C0520x2(1, c0050o), 3));
        }
        return C1386y.f15098a;
    }
}
