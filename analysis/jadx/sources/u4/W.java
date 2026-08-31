package U4;

import A.AbstractC0017n;
import A.C0023u;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.InterfaceC0360i0;
import R4.C0468k1;
import android.os.Build;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.P1;
import j0.AbstractC1145B;
import m5.C1386y;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class W implements B5.f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7778q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f7779r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ W(C0468k1 c0468k1, int i) {
        this.f7778q = i;
        this.f7779r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7778q) {
            case 0:
                C0023u ElevatedCard = (C0023u) obj;
                C0371o c0371o = (C0371o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(ElevatedCard, "$this$ElevatedCard");
                if (c0371o.K(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC0534a.d(this.f7779r, c0371o, 0);
                } else {
                    c0371o.N();
                }
                break;
            default:
                A.L innerPadding = (A.L) obj;
                C0371o c0371o2 = (C0371o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(innerPadding, "innerPadding");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c0371o2.g(innerPadding) ? 4 : 2;
                }
                if (c0371o2.K(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    Object objH = c0371o2.H();
                    if (objH == C0363k.f5418a) {
                        objH = Build.VERSION.SDK_INT >= 35 ? C0345b.q(androidx.compose.foundation.layout.c.f9279c) : C0345b.q(AbstractC0534a.A(androidx.compose.foundation.layout.c.f9279c, true));
                        c0371o2.d0(objH);
                    }
                    float f = 0;
                    InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.d((InterfaceC0725m) ((P.W) objH).getValue(), 0.0f, f, 0.0f, f, 5), P1.l(c0371o2), AbstractC1145B.f13658a);
                    InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10080u, false);
                    int i = c0371o2.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o2.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o2, interfaceC0725mA);
                    InterfaceC0046k.f452a.getClass();
                    B0.D d5 = C0045j.f445b;
                    c0371o2.W();
                    if (c0371o2.f5453O) {
                        c0371o2.l(d5);
                    } else {
                        c0371o2.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o2, interfaceC1926CD);
                    C0345b.u(C0045j.f447d, c0371o2, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o2.f5453O || !kotlin.jvm.internal.m.a(c0371o2.H(), Integer.valueOf(i))) {
                        k1.i.o(i, c0371o2, i, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o2, interfaceC0725mC);
                    C0468k1 c0468k1 = this.f7779r;
                    int identifier = c0468k1.f7071c.getResources().getIdentifier("splashimg", "drawable", c0468k1.f7071c.getPackageName());
                    if (identifier != 0) {
                        c0371o2.S(1625290165);
                        AbstractC0534a.r(c0468k1, identifier, androidx.compose.foundation.layout.c.f9279c, c0371o2, 384);
                        c0371o2.p(false);
                    } else {
                        c0371o2.S(-1164939405);
                        c0371o2.p(false);
                    }
                    c0371o2.p(true);
                } else {
                    c0371o2.N();
                }
                break;
        }
        return C1386y.f15098a;
    }
}
