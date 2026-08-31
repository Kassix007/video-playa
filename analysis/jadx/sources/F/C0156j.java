package F;

import B0.j0;
import M5.AbstractC0263y;
import O3.C0299l;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m0.C1346a;
import m5.C1386y;
import q5.InterfaceC1524c;
import r5.EnumC1580a;
import v.C1716k;
import v.C1717l;
import v.C1727w;
import v.C1728x;
import v0.InterfaceC1746o;
import w.AbstractC1802p0;
import w.C1784g0;
import w.C1812v;
import w.C1814w;
import w.P0;
import w.g1;

/* JADX INFO: renamed from: F.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0156j implements PointerInputEventHandler {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1885r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0156j(int i, Object obj) {
        this.f1884q = i;
        this.f1885r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC1746o interfaceC1746o, InterfaceC1524c interfaceC1524c) {
        int i = this.f1884q;
        int i7 = 7;
        C1386y c1386y = C1386y.f15098a;
        EnumC1580a enumC1580a = EnumC1580a.f16356q;
        Object obj = this.f1885r;
        switch (i) {
            case 0:
                Object objG = AbstractC0263y.g(new C0155i(interfaceC1746o, (C0151e) obj, null), interfaceC1524c);
                return objG == enumC1580a ? objG : c1386y;
            case 1:
                Object objD = g1.d(interfaceC1746o, null, new J5.i(9, (a5.y) obj), interfaceC1524c, 7);
                return objD == enumC1580a ? objD : c1386y;
            case 2:
                C1728x c1728x = (C1728x) obj;
                C1727w c1727w = new C1727w(c1728x, null);
                C1346a c1346a = new C1346a(i7, c1728x);
                e3.u uVar = g1.f17975a;
                Object objG2 = AbstractC0263y.g(new P0(interfaceC1746o, c1727w, c1346a, new C1784g0(interfaceC1746o), null), interfaceC1524c);
                if (objG2 != enumC1580a) {
                    objG2 = c1386y;
                }
                if (objG2 != enumC1580a) {
                    objG2 = c1386y;
                }
                return objG2 == enumC1580a ? objG2 : c1386y;
            case 3:
                Object objC = AbstractC1802p0.c(interfaceC1746o, new C1716k((C1717l) obj, null), interfaceC1524c);
                return objC == enumC1580a ? objC : c1386y;
            default:
                C0299l c0299l = new C0299l();
                w.C c7 = (w.C) obj;
                Object objG3 = AbstractC0263y.g(new C1812v(c7, interfaceC1746o, new C0162p(3, c7, c0299l), new A.J(c0299l, interfaceC1746o, c7, 16), new C1814w(c7, 0), new C1814w(c7, 1), new j0(13, c0299l, c7), null), interfaceC1524c);
                return objG3 == enumC1580a ? objG3 : c1386y;
        }
    }
}
