package R4;

import A.AbstractC0017n;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import P.C0345b;
import P.C0363k;
import P.C0371o;
import P.InterfaceC0360i0;
import U4.AbstractC0534a;
import android.os.Build;
import androidx.compose.foundation.layout.FillElement;
import c0.AbstractC0727o;
import c0.C0714b;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.wnapp.smspariaz.R;
import j0.AbstractC1145B;
import java.io.IOException;
import java.util.Arrays;
import m5.C1386y;
import n5.AbstractC1397A;
import org.xmlpull.v1.XmlPullParserException;
import z0.InterfaceC1926C;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H0 implements B5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f6769q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0468k1 f6770r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ H0(int i, int i7, C0468k1 c0468k1) {
        this.f6769q = i7;
        this.f6770r = c0468k1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.e
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        C1386y c1386y;
        boolean z5;
        P.S s6;
        switch (this.f6769q) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0836n2.a(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0534a.f(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0534a.g(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0534a.h(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0534a.c(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC0534a.u(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC0534a.k(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC0534a.v(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC0534a.p(this.f6770r, (C0371o) obj, C0345b.w(1));
                break;
            case 9:
                C0371o c0371o = (C0371o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean zK = c0371o.K(iIntValue & 1, (iIntValue & 3) != 2);
                C1386y c1386y2 = C1386y.f15098a;
                if (!zK) {
                    c0371o.N();
                    return c1386y2;
                }
                C0468k1 c0468k1 = this.f6770r;
                int i = c0468k1.f;
                P.S s7 = C0363k.f5418a;
                if (i == 0) {
                    c0371o.S(1697683065);
                    c0371o.p(false);
                    AbstractC0534a.C(c0468k1);
                    c1386y = c1386y2;
                    s6 = s7;
                } else {
                    c0371o.S(1698003667);
                    P.W wJ = C0345b.j(c0468k1.f7098t.f13874e, c0371o);
                    Boolean bool = (Boolean) wJ.getValue();
                    bool.booleanValue();
                    boolean zG = c0371o.g(wJ) | c0371o.i(c0468k1);
                    Object objH = c0371o.H();
                    if (zG || objH == s7) {
                        objH = new U4.c0(c0468k1, wJ, null);
                        c0371o.d0(objH);
                    }
                    C0345b.e((B5.e) objH, c0371o, bool);
                    Boolean bool2 = Boolean.TRUE;
                    boolean zI = c0371o.i(c0468k1);
                    Object objH2 = c0371o.H();
                    if (zI || objH2 == s7) {
                        objH2 = new U4.e0(c0468k1, null);
                        c0371o.d0(objH2);
                    }
                    C0345b.e((B5.e) objH2, c0371o, bool2);
                    if (((Boolean) wJ.getValue()).booleanValue()) {
                        c1386y = c1386y2;
                        z5 = false;
                        s6 = s7;
                        c0371o.S(1695060961);
                    } else {
                        c0371o.S(1702222147);
                        FillElement fillElement = androidx.compose.foundation.layout.c.f9279c;
                        InterfaceC1926C interfaceC1926CD = AbstractC0017n.d(C0714b.f10076q, false);
                        int i7 = c0371o.f5454P;
                        InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                        InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, fillElement);
                        InterfaceC0046k.f452a.getClass();
                        B0.D d5 = C0045j.f445b;
                        c0371o.W();
                        if (c0371o.f5453O) {
                            c0371o.l(d5);
                        } else {
                            c0371o.g0();
                        }
                        C0345b.u(C0045j.f448e, c0371o, interfaceC1926CD);
                        C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                        C0044i c0044i = C0045j.f;
                        if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i7))) {
                            k1.i.o(i7, c0371o, i7, c0044i);
                        }
                        C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                        InterfaceC0725m interfaceC0725mA = androidx.compose.foundation.a.a(fillElement, com.google.android.gms.internal.measurement.P1.l(c0371o), AbstractC1145B.f13658a);
                        kotlin.jvm.internal.m.e(interfaceC0725mA, "<this>");
                        c1386y = c1386y2;
                        s6 = s7;
                        M.z0.a(interfaceC0725mA, X.k.d(-74066198, new H0(c0468k1, 11), c0371o), X.k.d(1398212395, new H0(c0468k1, 12), c0371o), null, null, 0, 0L, 0L, null, X.k.d(406822517, new U4.W(c0468k1, 1), c0371o), c0371o, 805306800, 504);
                        c0371o.p(true);
                        z5 = false;
                    }
                    c0371o.p(z5);
                    c0371o.p(z5);
                }
                Object objH3 = c0371o.H();
                if (objH3 == s6) {
                    objH3 = new I5.m(22);
                    c0371o.d0(objH3);
                }
                C1386y c1386y3 = c1386y;
                C0345b.c(c1386y3, (B5.c) objH3, c0371o);
                return c1386y3;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC0534a.s(this.f6770r, (C0371o) obj, C0345b.w(1));
                return C1386y.f15098a;
            case 11:
                C0371o c0371o2 = (C0371o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (c0371o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (Build.VERSION.SDK_INT >= 35) {
                        c0371o2.S(1836832222);
                        AbstractC0534a.t(0, String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f6770r.f7071c.getColor(R.color.splash_bg_color))}, 1)), false, c0371o2, 0, 5);
                    } else {
                        c0371o2.S(1099249720);
                    }
                    c0371o2.p(false);
                } else {
                    c0371o2.N();
                }
                return C1386y.f15098a;
            case 12:
                C0371o c0371o3 = (C0371o) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (c0371o3.K(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC0534a.m(String.format("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(this.f6770r.f7071c.getColor(R.color.splash_bg_color))}, 1)), false, c0371o3, 0, 2);
                } else {
                    c0371o3.N();
                }
                return C1386y.f15098a;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC1397A.a(this.f6770r, (C0371o) obj, C0345b.w(1));
                return C1386y.f15098a;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC0836n2.b(this.f6770r, (C0371o) obj, C0345b.w(1));
                return C1386y.f15098a;
            case 15:
                ((Integer) obj2).getClass();
                Q2.g.h(this.f6770r, (C0371o) obj, C0345b.w(1));
                return C1386y.f15098a;
            default:
                ((Integer) obj2).getClass();
                AbstractC1397A.e(this.f6770r, (C0371o) obj, C0345b.w(1));
                return C1386y.f15098a;
        }
        return C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ H0(C0468k1 c0468k1, int i) {
        this.f6769q = i;
        this.f6770r = c0468k1;
    }
}
