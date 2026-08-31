package B0;

import c0.AbstractC0724l;
import com.google.android.gms.internal.measurement.P1;
import j0.AbstractC1145B;
import j0.C1150e;
import j0.InterfaceC1144A;
import l0.AbstractC1220c;
import l0.C1218a;
import l0.C1219b;
import l0.InterfaceC1221d;
import m0.C1348c;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC1221d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1219b f296q = new C1219b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public InterfaceC0051p f297r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float D(long j) {
        return this.f296q.D(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final int G(float f) {
        return this.f296q.G(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void L(long j, long j7, long j8, float f, int i) {
        this.f296q.L(j, j7, j8, f, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final long M() {
        return this.f296q.M();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long Q(long j) {
        return this.f296q.Q(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void R(long j, long j7, long j8, float f, AbstractC1220c abstractC1220c, int i) {
        this.f296q.R(j, j7, j8, f, abstractC1220c, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float T(long j) {
        return this.f296q.T(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        C1219b c1219b = this.f296q;
        j0.m mVarT = c1219b.f14425r.t();
        InterfaceC0048m interfaceC0048m = this.f297r;
        if (interfaceC0048m == null) {
            throw C0.S.i("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        AbstractC0724l abstractC0724l = (AbstractC0724l) interfaceC0048m;
        AbstractC0724l abstractC0724lF = abstractC0724l.f10100q.f10105v;
        if (abstractC0724lF == null || (abstractC0724lF.f10103t & 4) == 0) {
            abstractC0724lF = null;
        } else {
            while (abstractC0724lF != null) {
                int i = abstractC0724lF.f10102s;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    abstractC0724lF = abstractC0724lF.f10105v;
                }
            }
            abstractC0724lF = null;
        }
        if (abstractC0724lF == null) {
            n0 n0VarS = AbstractC0041g.s(interfaceC0048m, 4);
            if (n0VarS.B0() == abstractC0724l.f10100q) {
                n0VarS = n0VarS.f479C;
                kotlin.jvm.internal.m.b(n0VarS);
            }
            n0VarS.Q0(mVarT, (C1348c) c1219b.f14425r.f235s);
            return;
        }
        R.e eVar = null;
        while (abstractC0724lF != null) {
            if (abstractC0724lF instanceof InterfaceC0051p) {
                InterfaceC0051p interfaceC0051p = (InterfaceC0051p) abstractC0724lF;
                C1348c c1348c = (C1348c) c1219b.f14425r.f235s;
                n0 n0VarS2 = AbstractC0041g.s(interfaceC0051p, 4);
                long jD0 = P1.d0(n0VarS2.f18666s);
                L l7 = n0VarS2.f478B;
                l7.getClass();
                ((C0.A) O.a(l7)).getSharedDrawScope().c(mVarT, jD0, n0VarS2, interfaceC0051p, c1348c);
            } else if ((abstractC0724lF.f10102s & 4) != 0 && (abstractC0724lF instanceof AbstractC0049n)) {
                int i7 = 0;
                for (AbstractC0724l abstractC0724l2 = ((AbstractC0049n) abstractC0724lF).f473F; abstractC0724l2 != null; abstractC0724l2 = abstractC0724l2.f10105v) {
                    if ((abstractC0724l2.f10102s & 4) != 0) {
                        i7++;
                        if (i7 == 1) {
                            abstractC0724lF = abstractC0724l2;
                        } else {
                            if (eVar == null) {
                                eVar = new R.e(new AbstractC0724l[16]);
                            }
                            if (abstractC0724lF != null) {
                                eVar.c(abstractC0724lF);
                                abstractC0724lF = null;
                            }
                            eVar.c(abstractC0724l2);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            abstractC0724lF = AbstractC0041g.f(eVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long a0(float f) {
        return this.f296q.a0(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f296q.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(j0.m mVar, long j, n0 n0Var, InterfaceC0051p interfaceC0051p, C1348c c1348c) {
        InterfaceC0051p interfaceC0051p2 = this.f297r;
        this.f297r = interfaceC0051p;
        W0.l lVar = n0Var.f478B.f262O;
        C1219b c1219b = this.f296q;
        G0 g02 = c1219b.f14425r;
        C1218a c1218a = ((C1219b) g02.f236t).f14424q;
        W0.c cVar = c1218a.f14420a;
        W0.l lVar2 = c1218a.f14421b;
        j0.m mVarT = g02.t();
        G0 g03 = c1219b.f14425r;
        long jE = g03.E();
        C1348c c1348c2 = (C1348c) g03.f235s;
        g03.V(n0Var);
        g03.W(lVar);
        g03.U(mVar);
        g03.X(j);
        g03.f235s = c1348c;
        mVar.k();
        try {
            interfaceC0051p.J(this);
            mVar.i();
            g03.V(cVar);
            g03.W(lVar2);
            g03.U(mVarT);
            g03.X(jE);
            g03.f235s = c1348c2;
            this.f297r = interfaceC0051p2;
        } catch (Throwable th) {
            mVar.i();
            g03.V(cVar);
            g03.W(lVar2);
            g03.U(mVarT);
            g03.X(jE);
            g03.f235s = c1348c2;
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final long d() {
        return this.f296q.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float f0(int i) {
        return this.f296q.f0(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final W0.l getLayoutDirection() {
        return this.f296q.f14424q.f14421b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void i(C1150e c1150e, long j, long j7, long j8, float f, j0.j jVar, int i) {
        this.f296q.i(c1150e, j, j7, j8, f, jVar, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float i0(float f) {
        return f / this.f296q.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f296q.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void m(InterfaceC1144A interfaceC1144A, AbstractC1145B abstractC1145B, float f, AbstractC1220c abstractC1220c, int i) {
        this.f296q.m(interfaceC1144A, abstractC1145B, f, abstractC1220c, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void p(float f, long j, long j7) {
        this.f296q.p(f, j, j7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final long s(float f) {
        return this.f296q.s(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float u(float f) {
        return this.f296q.b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void v(long j, float f, float f7, long j7, long j8, AbstractC1220c abstractC1220c) {
        this.f296q.v(j, f, f7, j7, j8, abstractC1220c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void w(InterfaceC1144A interfaceC1144A, long j, AbstractC1220c abstractC1220c) {
        this.f296q.w(interfaceC1144A, j, abstractC1220c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final G0 z() {
        return this.f296q.f14425r;
    }
}
