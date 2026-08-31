package C0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import i0.C1129a;
import j0.AbstractC1145B;
import j0.AbstractC1148c;
import m0.C1348c;

/* JADX INFO: loaded from: classes.dex */
public final class R0 implements B0.s0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final InterfaceC0107v0 f917B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f918C;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public B5.e f920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public B5.a f921s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f922t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f924v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public W1.d f926x;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final M0 f923u = new M0();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final H0 f927y = new H0(K.f883t);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j0.n f928z = new j0.n();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f916A = j0.H.f13693b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public R0(A a7, B5.e eVar, B5.a aVar) {
        this.f919q = a7;
        this.f920r = eVar;
        this.f921s = aVar;
        InterfaceC0107v0 p02 = Build.VERSION.SDK_INT >= 29 ? new P0() : new O0(a7);
        p02.J();
        p02.w(false);
        this.f917B = p02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void a(long j) {
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        float fB = j0.H.b(this.f916A) * i;
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        interfaceC0107v0.v(fB);
        interfaceC0107v0.B(j0.H.c(this.f916A) * i7);
        if (interfaceC0107v0.x(interfaceC0107v0.u(), interfaceC0107v0.t(), interfaceC0107v0.u() + i, interfaceC0107v0.t() + i7)) {
            interfaceC0107v0.H(this.f923u.b());
            if (!this.f922t && !this.f924v) {
                this.f919q.invalidate();
                j(true);
            }
            this.f927y.d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void b(C1129a c1129a, boolean z5) {
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        H0 h02 = this.f927y;
        if (!z5) {
            float[] fArrB = h02.b(interfaceC0107v0);
            if (h02.f834d) {
                return;
            }
            AbstractC1145B.p(fArrB, c1129a);
            return;
        }
        float[] fArr = (float[]) h02.f837h;
        if (h02.f832b) {
            h02.f833c = W.i(h02.b(interfaceC0107v0), fArr);
            h02.f832b = false;
        }
        if (!h02.f833c) {
            fArr = null;
        }
        if (fArr != null) {
            if (h02.f834d) {
                return;
            }
            AbstractC1145B.p(fArr, c1129a);
        } else {
            c1129a.f13516b = 0.0f;
            c1129a.f13517c = 0.0f;
            c1129a.f13518d = 0.0f;
            c1129a.f13519e = 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void c(j0.C c7) {
        B5.a aVar;
        int i = c7.f13667q | this.f918C;
        int i7 = i & 4096;
        if (i7 != 0) {
            this.f916A = c7.f13675y;
        }
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        boolean zE = interfaceC0107v0.E();
        M0 m02 = this.f923u;
        boolean z5 = false;
        boolean z6 = zE && m02.f897g;
        if ((i & 1) != 0) {
            interfaceC0107v0.h(c7.f13668r);
        }
        if ((i & 2) != 0) {
            interfaceC0107v0.l(c7.f13669s);
        }
        if ((i & 4) != 0) {
            interfaceC0107v0.e(c7.f13670t);
        }
        if ((i & 8) != 0) {
            interfaceC0107v0.j();
        }
        if ((i & 16) != 0) {
            interfaceC0107v0.f();
        }
        if ((i & 32) != 0) {
            interfaceC0107v0.C(c7.f13671u);
        }
        if ((i & 64) != 0) {
            interfaceC0107v0.A(AbstractC1145B.v(c7.f13672v));
        }
        if ((i & 128) != 0) {
            interfaceC0107v0.I(AbstractC1145B.v(c7.f13673w));
        }
        if ((i & 1024) != 0) {
            interfaceC0107v0.k();
        }
        if ((i & 256) != 0) {
            interfaceC0107v0.d();
        }
        if ((i & 512) != 0) {
            interfaceC0107v0.g();
        }
        if ((i & 2048) != 0) {
            interfaceC0107v0.m(c7.f13674x);
        }
        if (i7 != 0) {
            interfaceC0107v0.v(j0.H.b(this.f916A) * interfaceC0107v0.b());
            interfaceC0107v0.B(j0.H.c(this.f916A) * interfaceC0107v0.a());
        }
        boolean z7 = c7.f13662A;
        O3.D d5 = AbstractC1145B.f13658a;
        boolean z8 = z7 && c7.f13676z != d5;
        if ((i & 24576) != 0) {
            interfaceC0107v0.G(z8);
            interfaceC0107v0.w(c7.f13662A && c7.f13676z == d5);
        }
        if ((131072 & i) != 0) {
            interfaceC0107v0.r();
        }
        if ((32768 & i) != 0) {
            interfaceC0107v0.z();
        }
        boolean zD = this.f923u.d(c7.f13666E, c7.f13670t, z8, c7.f13671u, c7.f13663B);
        if (m02.f) {
            interfaceC0107v0.H(m02.b());
        }
        if (z8 && m02.f897g) {
            z5 = true;
        }
        A a7 = this.f919q;
        if (z6 != z5 || (z5 && zD)) {
            if (!this.f922t && !this.f924v) {
                a7.invalidate();
                j(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = a7.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(a7, a7);
            }
        } else {
            a7.invalidate();
        }
        if (!this.f925w && interfaceC0107v0.L() > 0.0f && (aVar = this.f921s) != null) {
            aVar.invoke();
        }
        if ((i & 7963) != 0) {
            this.f927y.d();
        }
        this.f918C = c7.f13667q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void d(long j) {
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        int iU = interfaceC0107v0.u();
        int iT = interfaceC0107v0.t();
        int i = (int) (j >> 32);
        int i7 = (int) (j & 4294967295L);
        if (iU == i && iT == i7) {
            return;
        }
        if (iU != i) {
            interfaceC0107v0.o(i - iU);
        }
        if (iT != i7) {
            interfaceC0107v0.F(i7 - iT);
        }
        int i8 = Build.VERSION.SDK_INT;
        A a7 = this.f919q;
        if (i8 >= 26) {
            ViewParent parent = a7.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(a7, a7);
            }
        } else {
            a7.invalidate();
        }
        this.f927y.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void destroy() {
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        if (interfaceC0107v0.n()) {
            interfaceC0107v0.i();
        }
        this.f920r = null;
        this.f921s = null;
        this.f924v = true;
        j(false);
        A a7 = this.f919q;
        a7.f739T = true;
        a7.K(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    @Override // B0.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r5 = this;
            boolean r0 = r5.f922t
            C0.v0 r1 = r5.f917B
            if (r0 != 0) goto Le
            boolean r0 = r1.n()
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            boolean r0 = r1.E()
            if (r0 == 0) goto L20
            C0.M0 r0 = r5.f923u
            boolean r2 = r0.f897g
            if (r2 == 0) goto L20
            r0.e()
            j0.A r0 = r0.f896e
            goto L21
        L20:
            r0 = 0
        L21:
            B5.e r2 = r5.f920r
            if (r2 == 0) goto L30
            C0.Q0 r3 = new C0.Q0
            r4 = 0
            r3.<init>(r2, r4)
            j0.n r2 = r5.f928z
            r1.y(r2, r0, r3)
        L30:
            r0 = 0
            r5.j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.R0.e():void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final long f(boolean z5, long j) {
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        H0 h02 = this.f927y;
        if (z5) {
            float[] fArr = (float[]) h02.f837h;
            if (h02.f832b) {
                h02.f833c = W.i(h02.b(interfaceC0107v0), fArr);
                h02.f832b = false;
            }
            if (!h02.f833c) {
                fArr = null;
            }
            if (fArr == null) {
                return 9187343241974906880L;
            }
            if (!h02.f834d) {
                return AbstractC1145B.o(fArr, j);
            }
        } else {
            float[] fArrB = h02.b(interfaceC0107v0);
            if (!h02.f834d) {
                return AbstractC1145B.o(fArrB, j);
            }
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void g(j0.m mVar, C1348c c1348c) {
        Canvas canvasA = AbstractC1148c.a(mVar);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        if (zIsHardwareAccelerated) {
            e();
            boolean z5 = interfaceC0107v0.L() > 0.0f;
            this.f925w = z5;
            if (z5) {
                mVar.p();
            }
            interfaceC0107v0.s(canvasA);
            if (this.f925w) {
                mVar.n();
                return;
            }
            return;
        }
        float fU = interfaceC0107v0.u();
        float fT = interfaceC0107v0.t();
        float fD = interfaceC0107v0.D();
        float fP = interfaceC0107v0.p();
        if (interfaceC0107v0.c() < 1.0f) {
            W1.d dVarF = this.f926x;
            if (dVarF == null) {
                dVarF = AbstractC1145B.f();
                this.f926x = dVarF;
            }
            dVarF.c(interfaceC0107v0.c());
            canvasA.saveLayer(fU, fT, fD, fP, (Paint) dVarF.f8044b);
        } else {
            mVar.k();
        }
        mVar.h(fU, fT);
        mVar.o(this.f927y.b(interfaceC0107v0));
        if (interfaceC0107v0.E() || interfaceC0107v0.q()) {
            this.f923u.a(mVar);
        }
        B5.e eVar = this.f920r;
        if (eVar != null) {
            eVar.invoke(mVar, null);
        }
        mVar.i();
        j(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return this.f927y.b(this.f917B);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final boolean h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j));
        InterfaceC0107v0 interfaceC0107v0 = this.f917B;
        if (interfaceC0107v0.q()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) interfaceC0107v0.b()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) interfaceC0107v0.a());
        }
        if (interfaceC0107v0.E()) {
            return this.f923u.c(j);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void i(B5.e eVar, B5.a aVar) {
        H0 h02 = this.f927y;
        h02.f831a = false;
        h02.f832b = false;
        h02.f834d = true;
        h02.f833c = true;
        AbstractC1145B.q((float[]) h02.f836g);
        AbstractC1145B.q((float[]) h02.f837h);
        j(false);
        this.f924v = false;
        this.f925w = false;
        this.f916A = j0.H.f13693b;
        this.f920r = eVar;
        this.f921s = aVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void invalidate() {
        if (this.f922t || this.f924v) {
            return;
        }
        this.f919q.invalidate();
        j(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(boolean z5) {
        if (z5 != this.f922t) {
            this.f922t = z5;
            this.f919q.B(this, z5);
        }
    }
}
