package w;

import B0.AbstractC0041g;
import B0.InterfaceC0047l;
import M5.AbstractC0263y;
import M5.InterfaceC0261w;
import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import b2.C0690a;
import i0.C1130b;
import i1.C1134a;
import i3.C1136a;
import java.util.Collection;
import m0.C1346a;
import m5.C1386y;
import r5.EnumC1580a;
import u.C1667v;
import v.AbstractC1720o;
import v.C1717l;
import v0.C1737f;
import v0.C1743l;
import v0.EnumC1738g;

/* JADX INFO: renamed from: w.z0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1821z0 extends C implements t0.c, B0.A0, InterfaceC0047l {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C1717l f18119O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public I f18120P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final u0.d f18121Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final C1790j0 f18122R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final C1793l f18123S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final H0 f18124T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final C1805r0 f18125U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C1789j f18126V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public A.e0 f18127W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C1819y0 f18128X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public C0690a f18129Y;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1821z0(C1717l c1717l, InterfaceC1775c interfaceC1775c, I i, EnumC1778d0 enumC1778d0, A0 a02, y.i iVar, boolean z5, boolean z6) {
        super(C1777d.f17942u, z5, iVar, enumC1778d0);
        this.f18119O = c1717l;
        this.f18120P = i;
        u0.d dVar = new u0.d();
        this.f18121Q = dVar;
        C1790j0 c1790j0 = new C1790j0();
        c1790j0.f18008E = z5;
        x0(c1790j0);
        this.f18122R = c1790j0;
        C1793l c1793l = new C1793l(new C1667v(new C1136a(AbstractC1802p0.f18043c)));
        this.f18123S = c1793l;
        C1717l c1717l2 = this.f18119O;
        I i7 = this.f18120P;
        H0 h02 = new H0(a02, c1717l2, i7 == null ? c1793l : i7, enumC1778d0, z6, dVar, new v.F(2, this));
        this.f18124T = h02;
        C1805r0 c1805r0 = new C1805r0(h02, z5);
        this.f18125U = c1805r0;
        C1789j c1789j = new C1789j(enumC1778d0, h02, z6, interfaceC1775c);
        x0(c1789j);
        this.f18126V = c1789j;
        x0(new u0.g(c1805r0, dVar));
        x0(new h0.o(2, null, 4));
        G.e eVar = new G.e();
        eVar.f1969E = c1789j;
        x0(eVar);
        C1346a c1346a = new C1346a(9, this);
        v.J j = new v.J();
        j.f17252E = c1346a;
        x0(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.A0
    public final void A(I0.i iVar) {
        if (this.f17746I && (this.f18127W == null || this.f18128X == null)) {
            this.f18127W = new A.e0(17, this);
            this.f18128X = new C1819y0(this, null);
        }
        A.e0 e0Var = this.f18127W;
        if (e0Var != null) {
            H5.k[] kVarArr = I0.r.f2326a;
            iVar.j(I0.h.f2237d, new I0.a(null, e0Var));
        }
        C1819y0 c1819y0 = this.f18128X;
        if (c1819y0 != null) {
            H5.k[] kVarArr2 = I0.r.f2326a;
            iVar.j(I0.h.f2238e, c1819y0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final Object E0(C1769A c1769a, C1770B c1770b) {
        H0 h02 = this.f18124T;
        Object objF = h02.f(v.W.f17279r, new C1807s0(c1769a, h02, null), c1770b);
        return objF == EnumC1580a.f16356q ? objF : C1386y.f15098a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final void G0(long j) {
        AbstractC0263y.t(this.f18121Q.c(), null, null, new C1809t0(this, j, null), 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w.C
    public final boolean H0() {
        H0 h02 = this.f18124T;
        if (h02.f17790a.b()) {
            return true;
        }
        C1717l c1717l = h02.f17791b;
        if (c1717l == null) {
            return false;
        }
        v.E e7 = c1717l.f17356c;
        EdgeEffect edgeEffect = e7.f17230d;
        if (edgeEffect != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1720o.b(edgeEffect) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = e7.f17231e;
        if (edgeEffect2 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1720o.b(edgeEffect2) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = e7.f;
        if (edgeEffect3 != null) {
            if ((Build.VERSION.SDK_INT >= 31 ? AbstractC1720o.b(edgeEffect3) : 0.0f) != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = e7.f17232g;
        if (edgeEffect4 != null) {
            return (Build.VERSION.SDK_INT >= 31 ? AbstractC1720o.b(edgeEffect4) : 0.0f) != 0.0f;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J0(C1717l c1717l, InterfaceC1775c interfaceC1775c, I i, EnumC1778d0 enumC1778d0, A0 a02, y.i iVar, boolean z5, boolean z6) {
        boolean z7;
        boolean z8 = true;
        boolean z9 = false;
        if (this.f17746I != z5) {
            this.f18125U.f18052r = z5;
            this.f18122R.f18008E = z5;
            z7 = true;
        } else {
            z7 = false;
        }
        I i7 = i == null ? this.f18123S : i;
        H0 h02 = this.f18124T;
        if (!kotlin.jvm.internal.m.a(h02.f17790a, a02)) {
            h02.f17790a = a02;
            z9 = true;
        }
        h02.f17791b = c1717l;
        if (h02.f17793d != enumC1778d0) {
            h02.f17793d = enumC1778d0;
            z9 = true;
        }
        if (h02.f17794e != z6) {
            h02.f17794e = z6;
        } else {
            z8 = z9;
        }
        h02.f17792c = i7;
        h02.f = this.f18121Q;
        C1789j c1789j = this.f18126V;
        c1789j.f17997E = enumC1778d0;
        c1789j.f17999G = z6;
        c1789j.f18000H = interfaceC1775c;
        this.f18119O = c1717l;
        this.f18120P = i;
        C1777d c1777d = C1777d.f17942u;
        EnumC1778d0 enumC1778d02 = h02.f17793d;
        EnumC1778d0 enumC1778d03 = EnumC1778d0.f17945q;
        if (enumC1778d02 != enumC1778d03) {
            enumC1778d03 = EnumC1778d0.f17946r;
        }
        I0(c1777d, z5, iVar, enumC1778d03, z8);
        if (z7) {
            this.f18127W = null;
            this.f18128X = null;
            AbstractC0041g.n(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // t0.c
    public final boolean K(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!this.f17746I) {
            return false;
        }
        if ((!t0.a.a(Q2.g.d(keyEvent.getKeyCode()), t0.a.f16668l) && !t0.a.a(Q2.g.d(keyEvent.getKeyCode()), t0.a.f16667k)) || E3.h.C(keyEvent) != 2 || keyEvent.isCtrlPressed()) {
            return false;
        }
        EnumC1778d0 enumC1778d0 = this.f18124T.f17793d;
        EnumC1778d0 enumC1778d02 = EnumC1778d0.f17945q;
        C1789j c1789j = this.f18126V;
        if (enumC1778d0 == enumC1778d02) {
            int i = (int) (c1789j.f18005M & 4294967295L);
            float f = t0.a.a(Q2.g.d(keyEvent.getKeyCode()), t0.a.f16667k) ? i : -i;
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            int i7 = (int) (c1789j.f18005M >> 32);
            jFloatToRawIntBits = Float.floatToRawIntBits(t0.a.a(Q2.g.d(keyEvent.getKeyCode()), t0.a.f16667k) ? i7 : -i7);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        AbstractC0263y.t(l0(), null, null, new C1813v0(this, (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L), null), 3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.InterfaceC0048m, B0.y0
    public final void a() {
        U();
        if (this.f10099D) {
            W0.c cVar = AbstractC0041g.u(this).f261N;
            C1793l c1793l = this.f18123S;
            c1793l.getClass();
            c1793l.f18020a = new C1667v(new C1136a(cVar));
        }
        C0690a c0690a = this.f18129Y;
        if (c0690a != null) {
            c0690a.f9974e = AbstractC0041g.u(this).f261N;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // t0.c
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final boolean m0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c0.AbstractC0724l
    public final void p0() {
        if (this.f10099D) {
            W0.c cVar = AbstractC0041g.u(this).f261N;
            C1793l c1793l = this.f18123S;
            c1793l.getClass();
            c1793l.f18020a = new C1667v(new C1136a(cVar));
        }
        C0690a c0690a = this.f18129Y;
        if (c0690a != null) {
            c0690a.f9974e = AbstractC0041g.u(this).f261N;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v16, types: [B5.c, kotlin.jvm.internal.n] */
    @Override // w.C, B0.y0
    public final void t(C1737f c1737f, EnumC1738g enumC1738g, long j) {
        long j7;
        ?? r02 = c1737f.f17451a;
        int size = ((Collection) r02).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((Boolean) this.f17745H.invoke((C1743l) r02.get(i))).booleanValue()) {
                super.t(c1737f, enumC1738g, j);
                break;
            }
            i++;
        }
        if (this.f17746I) {
            if (enumC1738g == EnumC1738g.f17454q && c1737f.f17453c == 6) {
                if (this.f18129Y == null) {
                    this.f18129Y = new C0690a(this.f18124T, new C1134a(12, ViewConfiguration.get(AbstractC0041g.w(this).getContext())), new X.c(2, this, C1821z0.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 1), AbstractC0041g.u(this).f261N);
                }
                C0690a c0690a = this.f18129Y;
                if (c0690a != null) {
                    InterfaceC0261w interfaceC0261wL0 = l0();
                    if (((M5.B) c0690a.f9975g) == null) {
                        c0690a.f9975g = AbstractC0263y.t(interfaceC0261wL0, null, null, new Z(c0690a, null), 3);
                    }
                }
            }
            C0690a c0690a2 = this.f18129Y;
            if (c0690a2 == null || enumC1738g != EnumC1738g.f17455r) {
                return;
            }
            int i7 = c1737f.f17453c;
            ?? r3 = c1737f.f17451a;
            if (i7 == 6) {
                Collection collection = (Collection) r3;
                int size2 = collection.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    if (((C1743l) r3.get(i8)).b()) {
                        return;
                    }
                }
                C1134a c1134a = (C1134a) c0690a2.f9972c;
                W0.c cVar = (W0.c) c0690a2.f9974e;
                ViewConfiguration viewConfiguration = (ViewConfiguration) c1134a.f13535r;
                int i9 = Build.VERSION.SDK_INT;
                float f = -(i9 > 26 ? k1.b(viewConfiguration) : cVar.u(64));
                float f7 = -(i9 > 26 ? k1.a(viewConfiguration) : cVar.u(64));
                C1130b c1130b = new C1130b(0L);
                int size3 = collection.size();
                int i10 = 0;
                while (true) {
                    j7 = c1130b.f13520a;
                    if (i10 >= size3) {
                        break;
                    }
                    c1130b = new C1130b(C1130b.e(j7, ((C1743l) r3.get(i10)).j));
                    i10++;
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 >> 32)) * f7)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * f)) & 4294967295L);
                H0 h02 = (H0) c0690a2.f9971b;
                float fG = h02.g(h02.e(jFloatToRawIntBits));
                if ((fG > 0.0f ? 1 : (fG == 0.0f ? 0 : -1)) == 0 ? false : (fG > 0.0f ? 1 : (fG == 0.0f ? 0 : -1)) > 0 ? h02.f17790a.c() : h02.f17790a.a() ? !(((O5.e) c0690a2.f).j(new Q(jFloatToRawIntBits, ((C1743l) n5.l.l0(r3)).f17461b, false)) instanceof O5.k) : c0690a2.f9970a) {
                    int size4 = collection.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        ((C1743l) r3.get(i11)).a();
                    }
                }
            }
        }
    }

    @Override // w.C
    public final void F0(long j) {
    }
}
