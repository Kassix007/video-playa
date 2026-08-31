package A;

import B0.AbstractC0041g;
import B0.D0;
import B0.E0;
import B0.t0;
import M.I0;
import M5.AbstractC0263y;
import M5.InterfaceC0241b0;
import M5.InterfaceC0261w;
import O3.C0299l;
import P.C0354f0;
import P.S0;
import android.graphics.Canvas;
import androidx.lifecycle.InterfaceC0660x;
import b.C0683A;
import c.C0704b;
import c.C0710h;
import com.google.android.gms.internal.measurement.K1;
import com.google.android.gms.internal.measurement.P1;
import f0.ViewOnDragListenerC1059a;
import h0.C1115h;
import j0.AbstractC1148c;
import java.util.concurrent.CancellationException;
import l0.InterfaceC1221d;
import m5.C1386y;
import r.C1548G;
import t.C1596E;
import t.C1613l;
import u.AbstractC1644d;
import u.C1642c;
import u.C1656j;
import u.C1658l;
import v0.C1731A;
import v0.C1743l;
import v0.InterfaceC1746o;
import w.C0;
import w.C1789j;
import w.C1793l;
import w.EnumC1778d0;
import w.H0;
import w0.C1822a;
import w0.C1824c;
import y0.AbstractC1904a;
import z0.AbstractC1932I;
import z0.AbstractC1933J;

/* JADX INFO: loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.n implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f21q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f22r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(B0.T t6, N.u uVar, AbstractC1933J abstractC1933J) {
        super(1);
        this.f21q = 2;
        this.f24t = t6;
        this.f22r = uVar;
        this.f23s = abstractC1933J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // B5.c
    public final Object invoke(Object obj) {
        int i = this.f21q;
        int i7 = 6;
        boolean zBooleanValue = false;
        h = null;
        j0.H h4 = null;
        int i8 = 1;
        C1386y c1386y = C1386y.f15098a;
        Object obj2 = this.f23s;
        Object obj3 = this.f24t;
        Object obj4 = this.f22r;
        switch (i) {
            case 0:
                AbstractC1933J abstractC1933J = (AbstractC1933J) obj2;
                AbstractC1932I abstractC1932I = (AbstractC1932I) obj;
                B0.T t6 = (B0.T) obj3;
                K k7 = (K) obj4;
                if (k7.f29I) {
                    AbstractC1932I.f(abstractC1932I, abstractC1933J, t6.G(k7.f25E), t6.G(k7.f26F));
                } else {
                    AbstractC1932I.d(abstractC1932I, abstractC1933J, t6.G(k7.f25E), t6.G(k7.f26F));
                }
                return c1386y;
            case 1:
                I0 i02 = (I0) obj2;
                AbstractC0263y.t((InterfaceC0261w) obj4, null, null, new M.Y(i02, ((Number) obj).floatValue(), null), 3).G(new M.X(i02, (B5.a) obj3, 1));
                return c1386y;
            case 2:
                AbstractC1932I abstractC1932I2 = (AbstractC1932I) obj;
                N.u uVar = (N.u) obj4;
                float fD = ((B0.T) obj3).r() ? uVar.f3981E.d().d(uVar.f3981E.f3974h.getValue()) : uVar.f3981E.f();
                EnumC1778d0 enumC1778d0 = uVar.f3983G;
                AbstractC1932I.d(abstractC1932I2, (AbstractC1933J) obj2, D5.a.G(enumC1778d0 == EnumC1778d0.f17946r ? fD : 0.0f), D5.a.G(enumC1778d0 == EnumC1778d0.f17945q ? fD : 0.0f));
                return c1386y;
            case 3:
                final P.W w3 = (P.W) obj3;
                androidx.lifecycle.K k8 = new androidx.lifecycle.K() { // from class: Y.a
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // androidx.lifecycle.K
                    public final void onChanged(Object obj5) {
                        w3.setValue(obj5);
                    }
                };
                androidx.lifecycle.G g7 = (androidx.lifecycle.G) obj4;
                g7.e((InterfaceC0660x) obj2, k8);
                return new X(i7, g7, k8);
            case 4:
                Z.i iVar = (Z.i) obj3;
                Z.f fVar = (Z.f) obj4;
                C1548G c1548g = fVar.f8301b;
                if (!c1548g.b(obj2)) {
                    fVar.f8300a.remove(obj2);
                    c1548g.l(obj2, iVar);
                    return new U1.n(fVar, obj2, iVar, i8);
                }
                throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
            case 5:
                Z0.r rVar = (Z0.r) obj4;
                B0.L l7 = (B0.L) obj2;
                Z0.r rVar2 = (Z0.r) obj3;
                j0.m mVarT = ((InterfaceC1221d) obj).z().t();
                if (rVar.getView().getVisibility() != 8) {
                    rVar.f8355N = true;
                    t0 t0Var = l7.f251D;
                    C0.A a7 = t0Var instanceof C0.A ? (C0.A) t0Var : null;
                    if (a7 != null) {
                        Canvas canvasA = AbstractC1148c.a(mVarT);
                        a7.getAndroidViewsHandler$ui_release().getClass();
                        rVar2.draw(canvasA);
                    }
                    rVar.f8355N = false;
                }
                return c1386y;
            case 6:
                C0704b c0704b = (C0704b) obj3;
                ((C0683A) obj4).a((InterfaceC0660x) obj2, c0704b);
                return new C0.Y(i7, c0704b);
            case 7:
                C0710h c0710h = (C0710h) obj3;
                ((C0683A) obj4).a((InterfaceC0660x) obj2, c0710h);
                return new C0.Y(7, c0710h);
            case 8:
                E0 e02 = (E0) obj;
                f0.f fVar2 = (f0.f) e02;
                if (!((ViewOnDragListenerC1059a) ((C0.A) AbstractC0041g.v((f0.f) obj2)).m4getDragAndDropManager()).f12679b.contains(fVar2) || !K1.c(fVar2, P1.C((k3.c) obj3))) {
                    return D0.f221q;
                }
                ((kotlin.jvm.internal.y) obj4).f14268q = e02;
                return D0.f223s;
            case 9:
                h0.o oVar = (h0.o) obj;
                if (!kotlin.jvm.internal.m.a(oVar, (h0.o) obj4)) {
                    if (kotlin.jvm.internal.m.a(oVar, ((C1115h) obj2).f13411d)) {
                        throw new IllegalStateException("Focus search landed at the root.");
                    }
                    zBooleanValue = ((Boolean) ((kotlin.jvm.internal.n) obj3).invoke(oVar)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 10:
                return new U1.n((a0.q) obj4, obj2, (C1613l) obj3);
            case 11:
                j0.C c7 = (j0.C) obj;
                S0 s02 = (S0) obj2;
                S0 s03 = (S0) obj4;
                c7.a(s03 != null ? ((Number) s03.getValue()).floatValue() : 1.0f);
                c7.c(s02 != null ? ((Number) s02.getValue()).floatValue() : 1.0f);
                c7.e(s02 != null ? ((Number) s02.getValue()).floatValue() : 1.0f);
                S0 s04 = (S0) obj3;
                c7.g(s04 != null ? ((j0.H) s04.getValue()).f13695a : j0.H.f13693b);
                return c1386y;
            case 12:
                C1596E c1596e = (C1596E) obj3;
                int iOrdinal = ((t.t) obj).ordinal();
                if (iOrdinal == 0) {
                    t.L l8 = c1596e.f16582a;
                } else if (iOrdinal == 1) {
                    h4 = (j0.H) obj4;
                } else {
                    if (iOrdinal != 2) {
                        throw new C2.e();
                    }
                    t.L l9 = c1596e.f16582a;
                }
                return new j0.H(h4 != null ? h4.f13695a : j0.H.f13693b);
            case 13:
                C1656j c1656j = (C1656j) obj;
                C1642c c1642c = (C1642c) obj4;
                AbstractC1644d.q(c1656j, c1642c.f16879c);
                C0354f0 c0354f0 = c1656j.f16949e;
                Object objA = C1642c.a(c1642c, c0354f0.getValue());
                if (!kotlin.jvm.internal.m.a(objA, c0354f0.getValue())) {
                    c1642c.f16879c.f16962r.setValue(objA);
                    ((C1658l) obj2).f16962r.setValue(objA);
                    c1656j.a();
                    ((kotlin.jvm.internal.u) obj3).f14264q = true;
                }
                return c1386y;
            case 14:
                float fFloatValue = ((Number) obj).floatValue();
                C1789j c1789j = (C1789j) obj4;
                float f = c1789j.f17999G ? 1.0f : -1.0f;
                H0 h02 = c1789j.f17998F;
                long jE = h02.e(h02.h(f * fFloatValue));
                H0 h03 = ((w.E0) obj3).f17768a;
                float fG = h02.g(h02.e(H0.a(h03, h03.j, jE, 1))) * f;
                if (Math.abs(fG) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    ((InterfaceC0241b0) obj2).a(cancellationException);
                }
                return c1386y;
            case 15:
                C1656j c1656j2 = (C1656j) obj;
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj4;
                float fFloatValue2 = ((Number) c1656j2.f16949e.getValue()).floatValue() - vVar.f14265q;
                float fA = ((C0) obj2).a(fFloatValue2);
                vVar.f14265q = ((Number) c1656j2.f16949e.getValue()).floatValue();
                ((kotlin.jvm.internal.v) obj3).f14265q = ((Number) ((B5.c) c1656j2.f16945a.f8312r).invoke(c1656j2.f)).floatValue();
                if (Math.abs(fFloatValue2 - fA) > 0.5f) {
                    c1656j2.a();
                }
                return c1386y;
            default:
                C0299l c0299l = (C0299l) obj4;
                C1824c c1824c = (C1824c) c0299l.f4944c;
                C1824c c1824c2 = (C1824c) c0299l.f4943b;
                P1.d(c0299l, (C1743l) obj);
                C1731A c1731a = (C1731A) ((InterfaceC1746o) obj2);
                c1731a.getClass();
                float fA2 = AbstractC0041g.u(c1731a).f263P.a();
                long jI = l6.d.i(fA2, fA2);
                if (W0.p.b(jI) <= 0.0f || W0.p.c(jI) <= 0.0f) {
                    AbstractC1904a.b("maximumVelocity should be a positive value. You specified=" + ((Object) W0.p.f(jI)));
                }
                long jI2 = l6.d.i(c1824c2.b(W0.p.b(jI)), c1824c.b(W0.p.c(jI)));
                C1822a[] c1822aArr = c1824c2.f18138d;
                n5.k.J0(0, c1822aArr.length, null, c1822aArr);
                c1824c2.f18139e = 0;
                C1822a[] c1822aArr2 = c1824c.f18138d;
                n5.k.J0(0, c1822aArr2.length, null, c1822aArr2);
                c1824c.f18139e = 0;
                c0299l.f4942a = 0L;
                O5.e eVar = ((w.C) obj3).f17748K;
                if (eVar != null) {
                    e3.u uVar2 = w.D.f17754a;
                    eVar.j(new w.r(l6.d.i(Float.isNaN(W0.p.b(jI2)) ? 0.0f : W0.p.b(jI2), Float.isNaN(W0.p.c(jI2)) ? 0.0f : W0.p.c(jI2))));
                }
                return c1386y;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: B5.c */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public J(h0.o oVar, C1115h c1115h, B5.c cVar) {
        super(1);
        this.f21q = 9;
        this.f22r = oVar;
        this.f23s = c1115h;
        this.f24t = (kotlin.jvm.internal.n) cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.f21q = i;
        this.f22r = obj;
        this.f23s = obj2;
        this.f24t = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(kotlin.jvm.internal.v vVar, C0 c02, kotlin.jvm.internal.v vVar2, C1793l c1793l) {
        super(1);
        this.f21q = 15;
        this.f22r = vVar;
        this.f23s = c02;
        this.f24t = vVar2;
    }
}
