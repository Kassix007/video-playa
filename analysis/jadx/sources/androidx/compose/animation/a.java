package androidx.compose.animation;

import B0.AbstractC0036d0;
import B0.C0044i;
import B0.C0045j;
import B0.D;
import B0.InterfaceC0046k;
import B0.r;
import B5.c;
import O3.D0;
import P.C0345b;
import P.C0354f0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.InterfaceC0360i0;
import P.S;
import P.W;
import X.e;
import a.AbstractC0597a;
import a0.q;
import c0.AbstractC0724l;
import c0.AbstractC0727o;
import c0.C0717e;
import c0.C0722j;
import c0.InterfaceC0725m;
import java.util.ListIterator;
import k1.i;
import kotlin.jvm.internal.m;
import n5.k;
import r.C1548G;
import r.O;
import t.C1605d;
import t.C1607f;
import t.C1612k;
import t.C1613l;
import t.s;
import u.A0;
import u.p0;
import u.v0;
import u.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f9229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9230b = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j = Integer.MIN_VALUE;
        f9229a = (j & 4294967295L) | (j << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(v0 v0Var, InterfaceC0725m interfaceC0725m, c cVar, C0717e c0717e, c cVar2, e eVar, C0371o c0371o, int i) {
        int i7;
        c cVar3;
        C0371o c0371o2;
        D0 d02;
        C1613l c1613l;
        q qVar;
        final C1613l c1613l2;
        final p0 p0VarA;
        C0371o c0371o3;
        c cVar4 = cVar;
        c0371o.U(-114689412);
        if ((i & 6) == 0) {
            i7 = (c0371o.g(v0Var) ? 4 : 2) | i;
        } else {
            i7 = i;
        }
        if ((i & 48) == 0) {
            i7 |= c0371o.g(interfaceC0725m) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i7 |= c0371o.i(cVar4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= c0371o.g(c0717e) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= c0371o.i(cVar2) ? 16384 : 8192;
        }
        e eVar2 = eVar;
        if ((196608 & i) == 0) {
            i7 |= c0371o.i(eVar2) ? 131072 : 65536;
        }
        if (c0371o.K(i7 & 1, (74899 & i7) != 74898)) {
            int i8 = i7 & 14;
            boolean z5 = i8 == 4;
            Object objH = c0371o.H();
            S s6 = C0363k.f5418a;
            if (z5 || objH == s6) {
                objH = new C1613l(v0Var, c0717e);
                c0371o.d0(objH);
            }
            C1613l c1613l3 = (C1613l) objH;
            boolean z6 = i8 == 4;
            Object objH2 = c0371o.H();
            Object obj = objH2;
            if (z6 || objH2 == s6) {
                Object[] objArr = {v0Var.f17069a.j()};
                q qVar2 = new q();
                qVar2.addAll(k.R0(objArr));
                c0371o.d0(qVar2);
                obj = qVar2;
            }
            q qVar3 = (q) obj;
            boolean z7 = i8 == 4;
            Object objH3 = c0371o.H();
            if (z7 || objH3 == s6) {
                long[] jArr = O.f16162a;
                objH3 = new C1548G();
                c0371o.d0(objH3);
            }
            C1548G c1548g = (C1548G) objH3;
            D0 d03 = v0Var.f17069a;
            C0354f0 c0354f0 = v0Var.f17072d;
            if (!qVar3.contains(d03.j())) {
                qVar3.clear();
                qVar3.add(d03.j());
            }
            if (m.a(d03.j(), c0354f0.getValue())) {
                if (qVar3.size() != 1 || !m.a(qVar3.get(0), d03.j())) {
                    qVar3.clear();
                    qVar3.add(d03.j());
                }
                if (c1548g.f16137e != 1 || c1548g.c(d03.j())) {
                    c1548g.a();
                }
                c1613l3.f16620b = c0717e;
            }
            if (m.a(d03.j(), c0354f0.getValue()) || qVar3.contains(c0354f0.getValue())) {
                d02 = d03;
            } else {
                ListIterator listIterator = qVar3.listIterator();
                int i9 = 0;
                while (true) {
                    r rVar = (r) listIterator;
                    d02 = d03;
                    if (!rVar.hasNext()) {
                        i9 = -1;
                        break;
                    } else {
                        if (m.a(cVar2.invoke(rVar.next()), cVar2.invoke(c0354f0.getValue()))) {
                            break;
                        }
                        i9++;
                        d03 = d02;
                    }
                }
                if (i9 == -1) {
                    qVar3.add(c0354f0.getValue());
                } else {
                    qVar3.set(i9, c0354f0.getValue());
                }
            }
            if (c1548g.c(c0354f0.getValue()) && c1548g.c(d02.j())) {
                c0371o.S(919489879);
                c0371o.p(false);
                cVar3 = cVar4;
                c1613l = c1613l3;
            } else {
                c0371o.S(916905750);
                c1548g.a();
                int size = qVar3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = qVar3.get(i10);
                    c1548g.l(obj2, X.k.d(885640742, new C1605d(v0Var, obj2, cVar4, c1613l3, qVar3, eVar2), c0371o));
                    i10++;
                    cVar4 = cVar4;
                    eVar2 = eVar;
                }
                cVar3 = cVar4;
                c1613l = c1613l3;
                c0371o.p(false);
            }
            boolean zG = c0371o.g(v0Var.f()) | c0371o.g(c1613l);
            Object objH4 = c0371o.H();
            if (zG || objH4 == s6) {
                objH4 = (s) cVar3.invoke(c1613l);
                c0371o.d0(objH4);
            }
            s sVar = (s) objH4;
            v0 v0Var2 = c1613l.f16619a;
            boolean zG2 = c0371o.g(c1613l);
            Object objH5 = c0371o.H();
            if (zG2 || objH5 == s6) {
                objH5 = C0345b.q(Boolean.FALSE);
                c0371o.d0(objH5);
            }
            W w3 = (W) objH5;
            final W wT = C0345b.t(sVar.f16636d, c0371o);
            if (m.a(v0Var2.f17069a.j(), v0Var2.f17072d.getValue())) {
                w3.setValue(Boolean.FALSE);
            } else if (wT.getValue() != null) {
                w3.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) w3.getValue()).booleanValue();
            InterfaceC0725m interfaceC0725m2 = C0722j.f10095q;
            if (zBooleanValue) {
                c0371o.S(249676467);
                C1613l c1613l4 = c1613l;
                qVar = qVar3;
                c1613l2 = c1613l4;
                C0371o c0371o4 = c0371o;
                p0VarA = y0.a(c1613l4.f16619a, A0.f16752h, null, c0371o4, 0, 2);
                boolean zG3 = c0371o4.g(p0VarA);
                Object objH6 = c0371o4.H();
                if (zG3 || objH6 == s6) {
                    objH6 = AbstractC0597a.o(interfaceC0725m2);
                    c0371o4.d0(objH6);
                }
                interfaceC0725m2 = (InterfaceC0725m) objH6;
                c0371o4.p(false);
                c0371o3 = c0371o4;
            } else {
                qVar = qVar3;
                C0371o c0371o5 = c0371o;
                c1613l2 = c1613l;
                c0371o5.S(249942509);
                c0371o5.p(false);
                p0VarA = null;
                c0371o3 = c0371o5;
            }
            InterfaceC0725m interfaceC0725mD = interfaceC0725m.d(interfaceC0725m2.d(new AbstractC0036d0(p0VarA, wT, c1613l2) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final p0 f9221q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final W f9222r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final C1613l f9223s;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f9221q = p0VarA;
                    this.f9222r = wT;
                    this.f9223s = c1613l2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final boolean equals(Object obj3) {
                    if (!(obj3 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement)) {
                        return false;
                    }
                    AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj3;
                    return m.a(animatedContentTransitionScopeImpl$SizeModifierElement.f9221q, this.f9221q) && animatedContentTransitionScopeImpl$SizeModifierElement.f9222r.equals(this.f9222r);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B0.AbstractC0036d0
                public final AbstractC0724l f() {
                    C1612k c1612k = new C1612k();
                    c1612k.f16615E = this.f9221q;
                    c1612k.f16616F = this.f9222r;
                    c1612k.f16617G = this.f9223s;
                    c1612k.f16618H = a.f9229a;
                    return c1612k;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // B0.AbstractC0036d0
                public final void g(AbstractC0724l abstractC0724l) {
                    C1612k c1612k = (C1612k) abstractC0724l;
                    c1612k.f16615E = this.f9221q;
                    c1612k.f16616F = this.f9222r;
                    c1612k.f16617G = this.f9223s;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final int hashCode() {
                    int iHashCode = this.f9223s.hashCode() * 31;
                    p0 p0Var = this.f9221q;
                    return this.f9222r.hashCode() + ((iHashCode + (p0Var != null ? p0Var.hashCode() : 0)) * 31);
                }
            }));
            Object objH7 = c0371o3.H();
            if (objH7 == s6) {
                objH7 = new C1607f(c1613l2);
                c0371o3.d0(objH7);
            }
            C1607f c1607f = (C1607f) objH7;
            int i11 = c0371o3.f5454P;
            InterfaceC0360i0 interfaceC0360i0M = c0371o3.m();
            InterfaceC0725m interfaceC0725mC = AbstractC0727o.c(c0371o3, interfaceC0725mD);
            InterfaceC0046k.f452a.getClass();
            D d5 = C0045j.f445b;
            c0371o3.W();
            if (c0371o3.f5453O) {
                c0371o3.l(d5);
            } else {
                c0371o3.g0();
            }
            C0345b.u(C0045j.f448e, c0371o3, c1607f);
            C0345b.u(C0045j.f447d, c0371o3, interfaceC0360i0M);
            C0044i c0044i = C0045j.f;
            if (c0371o3.f5453O || !m.a(c0371o3.H(), Integer.valueOf(i11))) {
                i.o(i11, c0371o3, i11, c0044i);
            }
            C0345b.u(C0045j.f446c, c0371o3, interfaceC0725mC);
            c0371o3.S(-1490874326);
            int size2 = qVar.size();
            int i12 = 0;
            while (i12 < size2) {
                q qVar4 = qVar;
                Object obj3 = qVar4.get(i12);
                c0371o3.O(1908442329, 0, cVar2.invoke(obj3), null);
                B5.e eVar3 = (B5.e) c1548g.g(obj3);
                if (eVar3 == null) {
                    c0371o3.S(-967793488);
                } else {
                    c0371o3.S(1908443505);
                    eVar3.invoke(c0371o3, 0);
                }
                c0371o3.p(false);
                c0371o3.p(false);
                i12++;
                qVar = qVar4;
            }
            c0371o3.p(false);
            c0371o3.p(true);
            c0371o2 = c0371o3;
        } else {
            cVar3 = cVar4;
            C0371o c0371o6 = c0371o;
            c0371o6.N();
            c0371o2 = c0371o6;
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new M.v0(v0Var, interfaceC0725m, cVar3, c0717e, cVar2, eVar, i);
        }
    }
}
