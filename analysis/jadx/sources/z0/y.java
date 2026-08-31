package z0;

import B0.C0034c0;
import B0.G0;
import B0.Y;
import B0.j0;
import C0.x1;
import P.AbstractC0362j0;
import P.C0345b;
import P.C0371o;
import P.C0382u;
import P.InterfaceC0359i;
import a0.AbstractC0606h;
import android.view.ViewGroup;
import java.util.List;
import r.C1545D;
import r.C1548G;
import r.C1549H;
import r.V;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC0359i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final V f18725A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1548G f18726B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final R.e f18727C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f18728D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f18729E;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B0.L f18730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public P.r f18731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public U f18732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18733t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f18734u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1548G f18735v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1548G f18736w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1960t f18737x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1957q f18738y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1548G f18739z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(B0.L l7, U u6) {
        this.f18730q = l7;
        this.f18732s = u6;
        long[] jArr = r.O.f16162a;
        this.f18735v = new C1548G();
        this.f18736w = new C1548G();
        this.f18737x = new C1960t(this);
        this.f18738y = new C1957q(this);
        this.f18739z = new C1548G();
        this.f18725A = new V();
        this.f18726B = new C1548G();
        this.f18727C = new R.e(new Object[16]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C0382u i(C0382u c0382u, B0.L l7, boolean z5, P.r rVar, X.e eVar) {
        if (c0382u == null || c0382u.f5528J) {
            ViewGroup.LayoutParams layoutParams = x1.f1152a;
            c0382u = new C0382u(rVar, new G0(l7));
        }
        if (!z5) {
            c0382u.j(eVar);
            return c0382u;
        }
        C0371o c0371o = c0382u.f5527I;
        c0371o.f5477y = 100;
        c0371o.f5476x = true;
        c0382u.j(eVar);
        if (c0371o.f5443E || c0371o.f5477y != 100) {
            AbstractC0362j0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        c0371o.f5477y = -1;
        c0371o.f5476x = false;
        return c0382u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        boolean z5;
        boolean z6 = false;
        this.f18728D = 0;
        List listO = this.f18730q.o();
        R.b bVar = (R.b) listO;
        int i7 = (bVar.f6670q.f6678s - this.f18729E) - 1;
        if (i <= i7) {
            this.f18725A.clear();
            if (i <= i7) {
                int i8 = i;
                while (true) {
                    Object objG = this.f18735v.g((B0.L) bVar.get(i8));
                    kotlin.jvm.internal.m.b(objG);
                    ((C1545D) this.f18725A.f16184r).a(((C1958r) objG).f18702a);
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f18732s.b(this.f18725A);
            AbstractC0606h abstractC0606hC = a0.r.c();
            B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
            AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
            z5 = false;
            while (i7 >= i) {
                try {
                    B0.L l7 = (B0.L) ((R.b) listO).get(i7);
                    Object objG2 = this.f18735v.g(l7);
                    kotlin.jvm.internal.m.b(objG2);
                    C1958r c1958r = (C1958r) objG2;
                    Object obj = c1958r.f18702a;
                    if (((C1545D) this.f18725A.f16184r).c(obj)) {
                        this.f18728D++;
                        if (((Boolean) c1958r.f.getValue()).booleanValue()) {
                            B0.P p7 = l7.f269V;
                            C0034c0 c0034c0 = p7.f311p;
                            B0.I i9 = B0.I.f239s;
                            c0034c0.f375B = i9;
                            Y y6 = p7.f312q;
                            if (y6 != null) {
                                y6.f357z = i9;
                            }
                            c1958r.f.setValue(Boolean.FALSE);
                            z5 = true;
                        }
                    } else {
                        B0.L l8 = this.f18730q;
                        l8.f254G = true;
                        this.f18735v.j(l7);
                        C0382u c0382u = c1958r.f18704c;
                        if (c0382u != null) {
                            c0382u.l();
                        }
                        this.f18730q.N(i7, 1);
                        l8.f254G = false;
                    }
                    this.f18736w.j(obj);
                    i7--;
                } catch (Throwable th) {
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    throw th;
                }
            }
            a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
        } else {
            z5 = false;
        }
        if (z5) {
            synchronized (a0.n.f8680b) {
                C1549H c1549h = a0.n.i.f8653h;
                if (c1549h != null) {
                    if (c1549h.h()) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                a0.n.a();
            }
        }
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b() {
        int i = ((R.b) this.f18730q.o()).f6670q.f6678s;
        C1548G c1548g = this.f18735v;
        if (c1548g.f16137e != i) {
            AbstractC1904a.a("Inconsistency between the count of nodes tracked by the state (" + c1548g.f16137e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.f18728D) - this.f18729E < 0) {
            StringBuilder sbL = k1.i.l("Incorrect state. Total children ", ". Reusable children ", i);
            sbL.append(this.f18728D);
            sbL.append(". Precomposed children ");
            sbL.append(this.f18729E);
            AbstractC1904a.a(sbL.toString());
        }
        C1548G c1548g2 = this.f18739z;
        if (c1548g2.f16137e == this.f18729E) {
            return;
        }
        AbstractC1904a.a("Incorrect state. Precomposed children " + this.f18729E + ". Map size " + c1548g2.f16137e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(boolean z5) {
        this.f18729E = 0;
        this.f18739z.a();
        List listO = this.f18730q.o();
        int i = ((R.b) listO).f6670q.f6678s;
        if (this.f18728D != i) {
            this.f18728D = i;
            AbstractC0606h abstractC0606hC = a0.r.c();
            B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
            AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
            for (int i7 = 0; i7 < i; i7++) {
                try {
                    B0.L l7 = (B0.L) ((R.b) listO).get(i7);
                    C1958r c1958r = (C1958r) this.f18735v.g(l7);
                    if (c1958r != null && ((Boolean) c1958r.f.getValue()).booleanValue()) {
                        B0.P p7 = l7.f269V;
                        C0034c0 c0034c0 = p7.f311p;
                        B0.I i8 = B0.I.f239s;
                        c0034c0.f375B = i8;
                        Y y6 = p7.f312q;
                        if (y6 != null) {
                            y6.f357z = i8;
                        }
                        if (z5) {
                            C0382u c0382u = c1958r.f18704c;
                            if (c0382u != null) {
                                c0382u.k();
                            }
                            c1958r.f = C0345b.q(Boolean.FALSE);
                        } else {
                            c1958r.f.setValue(Boolean.FALSE);
                        }
                        c1958r.f18702a = AbstractC1938O.f18676a;
                    }
                } catch (Throwable th) {
                    a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                    throw th;
                }
            }
            a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
            this.f18736w.a();
        }
        b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC1939P d(Object obj, B5.e eVar) {
        B0.L l7 = this.f18730q;
        if (!l7.F()) {
            return new w();
        }
        b();
        if (!this.f18736w.c(obj)) {
            this.f18726B.j(obj);
            C1548G c1548g = this.f18739z;
            Object objG = c1548g.g(obj);
            if (objG == null) {
                objG = j(obj);
                if (objG != null) {
                    int iK = ((R.b) l7.o()).f6670q.k(objG);
                    int i = ((R.b) l7.o()).f6670q.f6678s;
                    l7.f254G = true;
                    l7.J(iK, i, 1);
                    l7.f254G = false;
                    this.f18729E++;
                } else {
                    int i7 = ((R.b) l7.o()).f6670q.f6678s;
                    B0.L l8 = new B0.L(2);
                    l7.f254G = true;
                    l7.z(i7, l8);
                    l7.f254G = false;
                    this.f18729E++;
                    objG = l8;
                }
                c1548g.l(obj, objG);
            }
            h((B0.L) objG, obj, eVar);
        }
        return new x(this, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void e() {
        c(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // P.InterfaceC0359i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            B0.L r2 = r0.f18730q
            r2.f254G = r1
            r.G r1 = r0.f18735v
            java.lang.Object[] r3 = r1.f16135c
            long[] r4 = r1.f16133a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            z0.r r13 = (z0.C1958r) r13
            P.u r13 = r13.f18704c
            if (r13 == 0) goto L47
            r13.l()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.M()
            r2.f254G = r6
            r1.a()
            r.G r1 = r0.f18736w
            r1.a()
            r0.f18729E = r6
            r0.f18728D = r6
            r.G r1 = r0.f18739z
            r1.a()
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.y.f():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.InterfaceC0359i
    public final void g() {
        c(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h(B0.L l7, Object obj, B5.e eVar) {
        boolean z5;
        C1548G c1548g = this.f18735v;
        Object objG = c1548g.g(l7);
        Object obj2 = objG;
        if (objG == null) {
            X.e eVar2 = AbstractC1948h.f18693a;
            C1958r c1958r = new C1958r();
            c1958r.f18702a = obj;
            c1958r.f18703b = eVar2;
            c1958r.f18704c = null;
            c1958r.f = C0345b.q(Boolean.TRUE);
            c1548g.l(l7, c1958r);
            obj2 = c1958r;
        }
        C1958r c1958r2 = (C1958r) obj2;
        C0382u c0382u = c1958r2.f18704c;
        if (c0382u != null) {
            synchronized (c0382u.f5532t) {
                z5 = c0382u.f5522D.f16137e > 0;
            }
        } else {
            z5 = true;
        }
        if (c1958r2.f18703b != eVar || z5 || c1958r2.f18705d) {
            c1958r2.f18703b = eVar;
            AbstractC0606h abstractC0606hC = a0.r.c();
            B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
            AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
            try {
                B0.L l8 = this.f18730q;
                l8.f254G = true;
                B5.e eVar3 = c1958r2.f18703b;
                C0382u c0382u2 = c1958r2.f18704c;
                P.r rVar = this.f18731r;
                if (rVar == null) {
                    AbstractC1904a.c("parent composition reference not set");
                    throw new C2.e();
                }
                c1958r2.f18704c = i(c0382u2, l7, c1958r2.f18706e, rVar, new X.e(-1750409193, true, new j0(14, c1958r2, eVar3)));
                c1958r2.f18706e = false;
                l8.f254G = false;
                a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                c1958r2.f18705d = false;
            } catch (Throwable th) {
                a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final B0.L j(Object obj) {
        C1548G c1548g;
        int i;
        if (this.f18728D == 0) {
            return null;
        }
        B0.L l7 = this.f18730q;
        R.b bVar = (R.b) l7.o();
        int i7 = bVar.f6670q.f6678s - this.f18729E;
        int i8 = i7 - this.f18728D;
        int i9 = i7 - 1;
        int i10 = i9;
        while (true) {
            c1548g = this.f18735v;
            if (i10 < i8) {
                i = -1;
                break;
            }
            Object objG = c1548g.g((B0.L) bVar.get(i10));
            kotlin.jvm.internal.m.b(objG);
            if (kotlin.jvm.internal.m.a(((C1958r) objG).f18702a, obj)) {
                i = i10;
                break;
            }
            i10--;
        }
        if (i == -1) {
            while (i9 >= i8) {
                Object objG2 = c1548g.g((B0.L) bVar.get(i9));
                kotlin.jvm.internal.m.b(objG2);
                C1958r c1958r = (C1958r) objG2;
                Object obj2 = c1958r.f18702a;
                if (obj2 == AbstractC1938O.f18676a || this.f18732s.f(obj, obj2)) {
                    c1958r.f18702a = obj;
                    i10 = i9;
                    i = i10;
                    break;
                }
                i9--;
            }
            i10 = i9;
        }
        if (i == -1) {
            return null;
        }
        if (i10 != i8) {
            l7.f254G = true;
            l7.J(i10, i8, 1);
            l7.f254G = false;
        }
        this.f18728D--;
        B0.L l8 = (B0.L) bVar.get(i8);
        Object objG3 = c1548g.g(l8);
        kotlin.jvm.internal.m.b(objG3);
        C1958r c1958r2 = (C1958r) objG3;
        c1958r2.f = C0345b.q(Boolean.TRUE);
        c1958r2.f18706e = true;
        c1958r2.f18705d = true;
        return l8;
    }
}
