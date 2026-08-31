package androidx.compose.foundation.lazy.layout;

import B0.C0050o;
import B0.j0;
import B5.e;
import B5.f;
import C.j;
import E.C0137u;
import E.C0141y;
import E.K;
import E.RunnableC0119b;
import E.e0;
import P.C0363k;
import P.C0371o;
import P.D;
import P.S;
import P.W;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c0.InterfaceC0725m;
import java.util.Arrays;
import kotlin.jvm.internal.n;
import m5.C1386y;
import r.C1543B;
import r.L;
import z0.AbstractC1938O;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n implements f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K f9300q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725m f9301r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f9302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ W f9303t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(K k7, InterfaceC0725m interfaceC0725m, e eVar, W w3) {
        super(3);
        this.f9300q = k7;
        this.f9301r = interfaceC0725m;
        this.f9302s = eVar;
        this.f9303t = w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC0725m interfaceC0725mD;
        Z.c cVar = (Z.c) obj;
        C0371o c0371o = (C0371o) obj2;
        ((Number) obj3).intValue();
        Object objH = c0371o.H();
        S s6 = C0363k.f5418a;
        if (objH == s6) {
            objH = new C0137u(cVar, new j(this.f9303t, 2));
            c0371o.d0(objH);
        }
        C0137u c0137u = (C0137u) objH;
        Object objH2 = c0371o.H();
        if (objH2 == s6) {
            C0050o c0050o = new C0050o();
            c0050o.f499q = c0137u;
            C1543B c1543b = L.f16158a;
            c0050o.f500r = new C1543B();
            objH2 = new z0.S(c0050o);
            c0371o.d0(objH2);
        }
        z0.S s7 = (z0.S) objH2;
        K k7 = this.f9300q;
        if (k7 != null) {
            c0371o.S(204281539);
            c0371o.S(6591363);
            Object obj4 = e0.f1562a;
            if (obj4 != null) {
                c0371o.S(1213893039);
                c0371o.p(false);
            } else {
                c0371o.S(1213931944);
                View view = (View) c0371o.k(AndroidCompositionLocals_androidKt.f);
                boolean zG = c0371o.g(view);
                Object objH3 = c0371o.H();
                if (zG || objH3 == s6) {
                    objH3 = new RunnableC0119b(view);
                    c0371o.d0(objH3);
                }
                obj4 = (RunnableC0119b) objH3;
                c0371o.p(false);
            }
            Object obj5 = obj4;
            c0371o.p(false);
            Object[] objArr = {k7, c0137u, s7, obj5};
            boolean zG2 = c0371o.g(k7) | c0371o.i(c0137u) | c0371o.i(s7) | c0371o.i(obj5);
            Object objH4 = c0371o.H();
            if (zG2 || objH4 == s6) {
                C0141y c0141y = new C0141y(k7, c0137u, s7, obj5, 0);
                c0371o.d0(c0141y);
                objH4 = c0141y;
            }
            B5.c cVar2 = (B5.c) objH4;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, 4);
            boolean zG3 = false;
            for (Object obj6 : objArrCopyOf) {
                zG3 |= c0371o.g(obj6);
            }
            Object objH5 = c0371o.H();
            if (zG3 || objH5 == s6) {
                c0371o.d0(new D(cVar2));
            }
            c0371o.p(false);
        } else {
            c0371o.S(204710145);
            c0371o.p(false);
        }
        int i = E.L.f1492b;
        InterfaceC0725m interfaceC0725m = this.f9301r;
        if (k7 != null && (interfaceC0725mD = interfaceC0725m.d(new TraversablePrefetchStateModifierElement(k7))) != null) {
            interfaceC0725m = interfaceC0725mD;
        }
        boolean zG4 = c0371o.g(c0137u);
        e eVar = this.f9302s;
        boolean zG5 = zG4 | c0371o.g(eVar);
        Object objH6 = c0371o.H();
        if (zG5 || objH6 == s6) {
            objH6 = new j0(4, c0137u, eVar);
            c0371o.d0(objH6);
        }
        AbstractC1938O.b(s7, interfaceC0725m, (e) objH6, c0371o, 8);
        return C1386y.f15098a;
    }
}
