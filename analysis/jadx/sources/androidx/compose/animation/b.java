package androidx.compose.animation;

import A.Y;
import B0.C0044i;
import B0.C0045j;
import B0.InterfaceC0046k;
import B5.c;
import B5.e;
import O3.D0;
import P.C0345b;
import P.C0354f0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import P.K0;
import P.W;
import Z.m;
import c0.AbstractC0727o;
import c0.C0722j;
import c0.InterfaceC0725m;
import k1.i;
import m5.C1386y;
import n5.x;
import t.C1595D;
import t.C1596E;
import t.C1597F;
import t.L;
import t.o;
import t.q;
import t.t;
import t.u;
import t.y;
import t.z;
import u.A0;
import u.C1632K;
import u.p0;
import u.v0;
import u.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(v0 v0Var, c cVar, InterfaceC0725m interfaceC0725m, C1595D c1595d, C1596E c1596e, e eVar, X.e eVar2, C0371o c0371o, int i) {
        X.e eVar3;
        int i7;
        boolean z5;
        p0 p0VarA;
        C1595D c1595d2;
        C1596E c1596e2;
        boolean z6;
        c0371o.U(-891967166);
        int i8 = i | (c0371o.g(v0Var) ? 4 : 2) | (c0371o.i(cVar) ? 32 : 16) | (c0371o.g(interfaceC0725m) ? 256 : 128) | (c0371o.g(c1595d) ? 2048 : 1024) | (c0371o.g(c1596e) ? 16384 : 8192) | (c0371o.i(eVar) ? 131072 : 65536) | 1572864;
        if (c0371o.K(i8 & 1, (4793491 & i8) != 4793490)) {
            C0354f0 c0354f0 = v0Var.f17072d;
            D0 d02 = v0Var.f17069a;
            if (((Boolean) cVar.invoke(c0354f0.getValue())).booleanValue() || ((Boolean) cVar.invoke(d02.j())).booleanValue() || v0Var.g() || v0Var.d()) {
                c0371o.S(1788522886);
                int i9 = i8 & 14;
                int i10 = i9 | 48;
                int i11 = i10 & 14;
                boolean z7 = ((i11 ^ 6) > 4 && c0371o.g(v0Var)) || (i10 & 6) == 4;
                Object objH = c0371o.H();
                Object obj = C0363k.f5418a;
                if (z7 || objH == obj) {
                    objH = d02.j();
                    c0371o.d0(objH);
                }
                if (v0Var.g()) {
                    objH = d02.j();
                }
                c0371o.S(-466616829);
                t tVarB = b(v0Var, cVar, objH, c0371o);
                c0371o.p(false);
                Object value = v0Var.f17072d.getValue();
                c0371o.S(-466616829);
                t tVarB2 = b(v0Var, cVar, value, c0371o);
                c0371o.p(false);
                int i12 = i11 | 3072;
                Object obj2 = y0.f17085a;
                int i13 = (i12 & 14) ^ 6;
                boolean z8 = (i13 > 4 && c0371o.g(v0Var)) || (i12 & 6) == 4;
                Object objH2 = c0371o.H();
                if (z8 || objH2 == obj) {
                    i7 = i12;
                    objH2 = new v0(new C1632K(tVarB), v0Var, i.k(new StringBuilder(), v0Var.f17071c, " > EnterExitTransition"));
                    c0371o.d0(objH2);
                } else {
                    i7 = i12;
                }
                v0 v0Var2 = (v0) objH2;
                boolean zG = ((i13 > 4 && c0371o.g(v0Var)) || (i7 & 6) == 4) | c0371o.g(v0Var2);
                Object objH3 = c0371o.H();
                if (zG || objH3 == obj) {
                    objH3 = new Y(27, v0Var, v0Var2);
                    c0371o.d0(objH3);
                }
                C0345b.c(v0Var2, (c) objH3, c0371o);
                if (v0Var.g()) {
                    v0Var2.k(tVarB, tVarB2);
                } else {
                    v0Var2.p(tVarB2);
                    v0Var2.f17076k.setValue(Boolean.FALSE);
                }
                W wT = C0345b.t(eVar, c0371o);
                D0 d03 = v0Var2.f17069a;
                D0 d04 = v0Var2.f17069a;
                C0354f0 c0354f02 = v0Var2.f17072d;
                Object objInvoke = eVar.invoke(d03.j(), c0354f02.getValue());
                boolean zG2 = c0371o.g(v0Var2) | c0371o.g(wT);
                Object objH4 = c0371o.H();
                if (zG2 || objH4 == obj) {
                    objH4 = new o(v0Var2, wT, null);
                    c0371o.d0(objH4);
                }
                e eVar4 = (e) objH4;
                Object objH5 = c0371o.H();
                if (objH5 == obj) {
                    objH5 = C0345b.q(objInvoke);
                    c0371o.d0(objH5);
                }
                W w3 = (W) objH5;
                boolean zI = c0371o.i(eVar4);
                Object objH6 = c0371o.H();
                if (zI || objH6 == obj) {
                    objH6 = new K0(eVar4, w3, null);
                    c0371o.d0(objH6);
                }
                C0345b.e((e) objH6, c0371o, C1386y.f15098a);
                Object objJ = d04.j();
                t tVar = t.f16639s;
                if (objJ == tVar && c0354f02.getValue() == tVar && ((Boolean) w3.getValue()).booleanValue()) {
                    c0371o.S(1790688794);
                    c0371o.p(false);
                    eVar3 = eVar2;
                    z6 = false;
                } else {
                    c0371o.S(1789551931);
                    boolean z9 = i9 == 4;
                    Object objH7 = c0371o.H();
                    if (z9 || objH7 == obj) {
                        objH7 = new q();
                        c0371o.d0(objH7);
                    }
                    q qVar = (q) objH7;
                    m mVar = z.f16656a;
                    boolean zG3 = c0371o.g(v0Var2);
                    Object objH8 = c0371o.H();
                    if (zG3 || objH8 == obj) {
                        objH8 = C0345b.q(c1595d);
                        c0371o.d0(objH8);
                    }
                    W w6 = (W) objH8;
                    Object objJ2 = d04.j();
                    Object value2 = c0354f02.getValue();
                    t tVar2 = t.f16638r;
                    if (objJ2 == value2 && d04.j() == tVar2) {
                        if (v0Var2.g()) {
                            w6.setValue(c1595d);
                        } else {
                            w6.setValue(C1595D.f16578b);
                        }
                    } else if (c0354f02.getValue() == tVar2) {
                        L l7 = ((C1595D) w6.getValue()).f16579a;
                        L l8 = c1595d.f16579a;
                        C1597F c1597f = l8.f16590a;
                        if (c1597f == null) {
                            c1597f = l7.f16590a;
                        }
                        w6.setValue(new C1595D(new L(c1597f, (D5.a) null, x.K(l7.f16592c, l8.f16592c), 16)));
                    }
                    C1595D c1595d3 = (C1595D) w6.getValue();
                    boolean zG4 = c0371o.g(v0Var2);
                    Object objH9 = c0371o.H();
                    if (zG4 || objH9 == obj) {
                        objH9 = C0345b.q(c1596e);
                        c0371o.d0(objH9);
                    }
                    W w7 = (W) objH9;
                    if (d04.j() == c0354f02.getValue() && d04.j() == tVar2) {
                        if (v0Var2.g()) {
                            w7.setValue(c1596e);
                        } else {
                            w7.setValue(C1596E.f16580b);
                        }
                    } else if (c0354f02.getValue() != tVar2) {
                        L l9 = ((C1596E) w7.getValue()).f16582a;
                        L l10 = c1596e.f16582a;
                        C1597F c1597f2 = l10.f16590a;
                        if (c1597f2 == null) {
                            c1597f2 = l9.f16590a;
                        }
                        w7.setValue(new C1596E(new L(c1597f2, (D5.a) null, l10.f16591b || l9.f16591b, x.K(l9.f16592c, l10.f16592c))));
                    }
                    C1596E c1596e3 = (C1596E) w7.getValue();
                    L l11 = c1595d3.f16579a;
                    L l12 = c1596e3.f16582a;
                    c0371o.S(-821053656);
                    c0371o.p(false);
                    c0371o.S(-820851041);
                    c0371o.p(false);
                    c0371o.S(-820608001);
                    c0371o.p(false);
                    if ((l11.f16590a == null && l12.f16590a == null) ? false : true) {
                        c0371o.S(-675026101);
                        m mVar2 = A0.f16746a;
                        Object objH10 = c0371o.H();
                        if (objH10 == obj) {
                            objH10 = "Built-in alpha";
                            c0371o.d0("Built-in alpha");
                        }
                        p0VarA = y0.a(v0Var2, mVar2, (String) objH10, c0371o, 384, 0);
                        z5 = false;
                        c0371o.p(false);
                    } else {
                        z5 = false;
                        c0371o.S(-674857617);
                        c0371o.p(false);
                        p0VarA = null;
                    }
                    c0371o.S(-674621521);
                    c0371o.p(z5);
                    c0371o.S(-674372529);
                    c0371o.p(z5);
                    boolean zI2 = c0371o.i(p0VarA) | c0371o.g(c1595d3) | c0371o.g(c1596e3) | c0371o.i(null) | c0371o.g(v0Var2) | c0371o.i(null);
                    Object objH11 = c0371o.H();
                    if (zI2 || objH11 == obj) {
                        objH11 = new u(p0VarA, null, v0Var2, c1595d3, c1596e3, null);
                        c1595d2 = c1595d3;
                        c1596e2 = c1596e3;
                        c0371o.d0(objH11);
                    } else {
                        c1595d2 = c1595d3;
                        c1596e2 = c1596e3;
                    }
                    u uVar = (u) objH11;
                    boolean zH = c0371o.h(true);
                    t.x xVar = t.x.f16653q;
                    boolean zG5 = zH | c0371o.g(xVar);
                    Object objH12 = c0371o.H();
                    if (zG5 || objH12 == obj) {
                        objH12 = new y(true, xVar);
                        c0371o.d0(objH12);
                    }
                    C0722j c0722j = C0722j.f10095q;
                    InterfaceC0725m interfaceC0725mD = androidx.compose.ui.graphics.a.a(c0722j, (c) objH12).d(new EnterExitTransitionElement(v0Var2, c1595d2, c1596e2, xVar, uVar));
                    c0371o.S(1581779440);
                    c0371o.p(false);
                    InterfaceC0725m interfaceC0725mD2 = interfaceC0725m.d(interfaceC0725mD.d(c0722j));
                    Object objH13 = c0371o.H();
                    if (objH13 == obj) {
                        objH13 = new t.m(qVar);
                        c0371o.d0(objH13);
                    }
                    t.m mVar3 = (t.m) objH13;
                    int i14 = c0371o.f5454P;
                    InterfaceC0360i0 interfaceC0360i0M = c0371o.m();
                    InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o, interfaceC0725mD2);
                    InterfaceC0046k.f452a.getClass();
                    B5.a aVar = C0045j.f445b;
                    c0371o.W();
                    if (c0371o.f5453O) {
                        c0371o.l(aVar);
                    } else {
                        c0371o.g0();
                    }
                    C0345b.u(C0045j.f448e, c0371o, mVar3);
                    C0345b.u(C0045j.f447d, c0371o, interfaceC0360i0M);
                    C0044i c0044i = C0045j.f;
                    if (c0371o.f5453O || !kotlin.jvm.internal.m.a(c0371o.H(), Integer.valueOf(i14))) {
                        i.o(i14, c0371o, i14, c0044i);
                    }
                    C0345b.u(C0045j.f446c, c0371o, interfaceC0725mC);
                    eVar3 = eVar2;
                    eVar3.invoke(qVar, c0371o, 48);
                    c0371o.p(true);
                    z6 = false;
                    c0371o.p(false);
                }
                c0371o.p(z6);
            } else {
                c0371o.S(1790694746);
                c0371o.p(false);
                eVar3 = eVar2;
            }
        } else {
            eVar3 = eVar2;
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C.o(v0Var, cVar, interfaceC0725m, c1595d, c1596e, eVar, eVar3, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final t b(v0 v0Var, c cVar, Object obj, C0371o c0371o) {
        c0371o.O(-902032957, 0, v0Var, null);
        boolean zG = v0Var.g();
        D0 d02 = v0Var.f17069a;
        t tVar = t.f16637q;
        t tVar2 = t.f16639s;
        t tVar3 = t.f16638r;
        if (zG) {
            c0371o.S(2101770115);
            c0371o.p(false);
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                tVar = tVar3;
            } else if (((Boolean) cVar.invoke(d02.j())).booleanValue()) {
                tVar = tVar2;
            }
        } else {
            c0371o.S(2102044248);
            Object objH = c0371o.H();
            if (objH == C0363k.f5418a) {
                objH = C0345b.q(Boolean.FALSE);
                c0371o.d0(objH);
            }
            W w3 = (W) objH;
            if (((Boolean) cVar.invoke(d02.j())).booleanValue()) {
                w3.setValue(Boolean.TRUE);
            }
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                tVar = tVar3;
            } else if (((Boolean) w3.getValue()).booleanValue()) {
                tVar = tVar2;
            }
            c0371o.p(false);
        }
        c0371o.p(false);
        return tVar;
    }
}
