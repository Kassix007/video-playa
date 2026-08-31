package C0;

import B0.C0029a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.P1;
import i0.C1129a;
import i0.C1130b;
import i0.C1131c;
import i0.C1132d;
import j0.AbstractC1145B;
import j0.AbstractC1148c;
import j0.C1152g;
import j0.InterfaceC1144A;
import l0.C1218a;
import l0.C1219b;
import m0.C1348c;
import m0.InterfaceC1350e;
import n5.AbstractC1397A;
import r.C1549H;
import y0.AbstractC1904a;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements B0.s0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f790D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractC1145B f792F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f793G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f794H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f796J;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1348c f798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j0.t f799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A f800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public B5.e f801t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public B5.a f802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f804w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float[] f806y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f807z;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f805x = AbstractC1145B.j();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public W0.c f787A = I1.B();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public W0.l f788B = W0.l.f8022q;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1219b f789C = new C1219b();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f791E = j0.H.f13693b;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f795I = true;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0029a f797K = new C0029a(7, this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0(C1348c c1348c, j0.t tVar, A a7, B5.e eVar, B5.a aVar) {
        this.f798q = c1348c;
        this.f799r = tVar;
        this.f800s = a7;
        this.f801t = eVar;
        this.f802u = aVar;
        long j = Integer.MAX_VALUE;
        this.f803v = (j & 4294967295L) | (j << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void a(long j) {
        if (W0.k.a(j, this.f803v)) {
            return;
        }
        this.f803v = j;
        if (this.f807z || this.f804w) {
            return;
        }
        A a7 = this.f800s;
        a7.invalidate();
        if (true != this.f807z) {
            this.f807z = true;
            a7.B(this, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void b(C1129a c1129a, boolean z5) {
        float[] fArrJ = z5 ? j() : k();
        if (this.f795I) {
            return;
        }
        if (fArrJ != null) {
            AbstractC1145B.p(fArrJ, c1129a);
            return;
        }
        c1129a.f13516b = 0.0f;
        c1129a.f13517c = 0.0f;
        c1129a.f13518d = 0.0f;
        c1129a.f13519e = 0.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void c(j0.C c7) {
        B5.a aVar;
        B5.a aVar2;
        int i = c7.f13667q | this.f790D;
        this.f788B = c7.f13665D;
        this.f787A = c7.f13664C;
        int i7 = i & 4096;
        if (i7 != 0) {
            this.f791E = c7.f13675y;
        }
        if ((i & 1) != 0) {
            C1348c c1348c = this.f798q;
            float f = c7.f13668r;
            InterfaceC1350e interfaceC1350e = c1348c.f14922a;
            if (interfaceC1350e.a() != f) {
                interfaceC1350e.h(f);
            }
        }
        if ((i & 2) != 0) {
            C1348c c1348c2 = this.f798q;
            float f7 = c7.f13669s;
            InterfaceC1350e interfaceC1350e2 = c1348c2.f14922a;
            if (interfaceC1350e2.F() != f7) {
                interfaceC1350e2.l(f7);
            }
        }
        if ((i & 4) != 0) {
            C1348c c1348c3 = this.f798q;
            float f8 = c7.f13670t;
            InterfaceC1350e interfaceC1350e3 = c1348c3.f14922a;
            if (interfaceC1350e3.c() != f8) {
                interfaceC1350e3.e(f8);
            }
        }
        if ((i & 8) != 0) {
            InterfaceC1350e interfaceC1350e4 = this.f798q.f14922a;
            if (interfaceC1350e4.t() != 0.0f) {
                interfaceC1350e4.j();
            }
        }
        if ((i & 16) != 0) {
            InterfaceC1350e interfaceC1350e5 = this.f798q.f14922a;
            if (interfaceC1350e5.o() != 0.0f) {
                interfaceC1350e5.f();
            }
        }
        boolean z5 = true;
        if ((i & 32) != 0) {
            C1348c c1348c4 = this.f798q;
            float f9 = c7.f13671u;
            InterfaceC1350e interfaceC1350e6 = c1348c4.f14922a;
            if (interfaceC1350e6.E() != f9) {
                interfaceC1350e6.b(f9);
                c1348c4.f14927g = true;
                c1348c4.a();
            }
            if (c7.f13671u > 0.0f && !this.f796J && (aVar2 = this.f802u) != null) {
                aVar2.invoke();
            }
        }
        if ((i & 64) != 0) {
            C1348c c1348c5 = this.f798q;
            long j = c7.f13672v;
            InterfaceC1350e interfaceC1350e7 = c1348c5.f14922a;
            if (!j0.o.c(j, interfaceC1350e7.J())) {
                interfaceC1350e7.q(j);
            }
        }
        if ((i & 128) != 0) {
            C1348c c1348c6 = this.f798q;
            long j7 = c7.f13673w;
            InterfaceC1350e interfaceC1350e8 = c1348c6.f14922a;
            if (!j0.o.c(j7, interfaceC1350e8.p())) {
                interfaceC1350e8.z(j7);
            }
        }
        if ((i & 1024) != 0) {
            InterfaceC1350e interfaceC1350e9 = this.f798q.f14922a;
            if (interfaceC1350e9.G() != 0.0f) {
                interfaceC1350e9.k();
            }
        }
        if ((i & 256) != 0) {
            InterfaceC1350e interfaceC1350e10 = this.f798q.f14922a;
            if (interfaceC1350e10.w() != 0.0f) {
                interfaceC1350e10.d();
            }
        }
        if ((i & 512) != 0) {
            InterfaceC1350e interfaceC1350e11 = this.f798q.f14922a;
            if (interfaceC1350e11.D() != 0.0f) {
                interfaceC1350e11.g();
            }
        }
        if ((i & 2048) != 0) {
            C1348c c1348c7 = this.f798q;
            float f10 = c7.f13674x;
            InterfaceC1350e interfaceC1350e12 = c1348c7.f14922a;
            if (interfaceC1350e12.s() != f10) {
                interfaceC1350e12.m(f10);
            }
        }
        if (i7 != 0) {
            if (j0.H.a(this.f791E, j0.H.f13693b)) {
                C1348c c1348c8 = this.f798q;
                if (!C1130b.b(c1348c8.f14940v, 9205357640488583168L)) {
                    c1348c8.f14940v = 9205357640488583168L;
                    c1348c8.f14922a.I(9205357640488583168L);
                }
            } else {
                C1348c c1348c9 = this.f798q;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j0.H.c(this.f791E) * ((int) (this.f803v & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(j0.H.b(this.f791E) * ((int) (this.f803v >> 32)))) << 32);
                if (!C1130b.b(c1348c9.f14940v, jFloatToRawIntBits)) {
                    c1348c9.f14940v = jFloatToRawIntBits;
                    c1348c9.f14922a.I(jFloatToRawIntBits);
                }
            }
        }
        if ((i & 16384) != 0) {
            C1348c c1348c10 = this.f798q;
            boolean z6 = c7.f13662A;
            if (c1348c10.f14941w != z6) {
                c1348c10.f14941w = z6;
                c1348c10.f14927g = true;
                c1348c10.a();
            }
        }
        if ((131072 & i) != 0) {
            InterfaceC1350e interfaceC1350e13 = this.f798q.f14922a;
        }
        if ((32768 & i) != 0) {
            InterfaceC1350e interfaceC1350e14 = this.f798q.f14922a;
            if (interfaceC1350e14.v() != 0) {
                interfaceC1350e14.y(0);
            }
        }
        if ((i & 7963) != 0) {
            this.f793G = true;
            this.f794H = true;
        }
        if (kotlin.jvm.internal.m.a(this.f792F, c7.f13666E)) {
            z5 = false;
        } else {
            AbstractC1145B abstractC1145B = c7.f13666E;
            this.f792F = abstractC1145B;
            if (abstractC1145B != null) {
                C1348c c1348c11 = this.f798q;
                if (abstractC1145B instanceof j0.y) {
                    C1131c c1131c = ((j0.y) abstractC1145B).f13731e;
                    float f11 = c1131c.f13522a;
                    float f12 = c1131c.f13523b;
                    c1348c11.f(0.0f, (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), (((long) Float.floatToRawIntBits(c1131c.f13524c - f11)) << 32) | (((long) Float.floatToRawIntBits(c1131c.f13525d - f12)) & 4294967295L));
                } else if (abstractC1145B instanceof j0.x) {
                    InterfaceC1144A interfaceC1144A = ((j0.x) abstractC1145B).f13730e;
                    c1348c11.f14929k = null;
                    c1348c11.i = 9205357640488583168L;
                    c1348c11.f14928h = 0L;
                    c1348c11.j = 0.0f;
                    c1348c11.f14927g = true;
                    c1348c11.f14932n = false;
                    c1348c11.f14930l = interfaceC1144A;
                    c1348c11.a();
                } else if (abstractC1145B instanceof j0.z) {
                    j0.z zVar = (j0.z) abstractC1145B;
                    C1152g c1152g = zVar.f;
                    if (c1152g != null) {
                        c1348c11.f14929k = null;
                        c1348c11.i = 9205357640488583168L;
                        c1348c11.f14928h = 0L;
                        c1348c11.j = 0.0f;
                        c1348c11.f14927g = true;
                        c1348c11.f14932n = false;
                        c1348c11.f14930l = c1152g;
                        c1348c11.a();
                    } else {
                        C1132d c1132d = zVar.f13732e;
                        c1348c11.f(Float.intBitsToFloat((int) (c1132d.f13532h >> 32)), (((long) Float.floatToRawIntBits(c1132d.f13526a)) << 32) | (((long) Float.floatToRawIntBits(c1132d.f13527b)) & 4294967295L), (((long) Float.floatToRawIntBits(c1132d.b())) << 32) | (((long) Float.floatToRawIntBits(c1132d.a())) & 4294967295L));
                    }
                }
                if ((abstractC1145B instanceof j0.x) && Build.VERSION.SDK_INT < 33 && (aVar = this.f802u) != null) {
                    aVar.invoke();
                }
            }
        }
        this.f790D = c7.f13667q;
        if (i != 0 || z5) {
            int i8 = Build.VERSION.SDK_INT;
            A a7 = this.f800s;
            if (i8 < 26) {
                a7.invalidate();
                return;
            }
            ViewParent parent = a7.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(a7, a7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void d(long j) {
        C1348c c1348c = this.f798q;
        if (!W0.i.a(c1348c.f14938t, j)) {
            c1348c.f14938t = j;
            c1348c.f14922a.C((int) (j >> 32), (int) (j & 4294967295L), c1348c.f14939u);
        }
        int i = Build.VERSION.SDK_INT;
        A a7 = this.f800s;
        if (i < 26) {
            a7.invalidate();
            return;
        }
        ViewParent parent = a7.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(a7, a7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void destroy() {
        this.f801t = null;
        this.f802u = null;
        this.f804w = true;
        boolean z5 = this.f807z;
        A a7 = this.f800s;
        if (z5) {
            this.f807z = false;
            a7.B(this, false);
        }
        j0.t tVar = this.f799r;
        if (tVar != null) {
            tVar.a(this.f798q);
            a7.K(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void e() {
        if (this.f807z) {
            if (!j0.H.a(this.f791E, j0.H.f13693b) && !W0.k.a(this.f798q.f14939u, this.f803v)) {
                C1348c c1348c = this.f798q;
                float fB = j0.H.b(this.f791E) * ((int) (this.f803v >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(j0.H.c(this.f791E) * ((int) (this.f803v & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32);
                if (!C1130b.b(c1348c.f14940v, jFloatToRawIntBits)) {
                    c1348c.f14940v = jFloatToRawIntBits;
                    c1348c.f14922a.I(jFloatToRawIntBits);
                }
            }
            C1348c c1348c2 = this.f798q;
            W0.c cVar = this.f787A;
            W0.l lVar = this.f788B;
            long j = this.f803v;
            long j7 = c1348c2.f14939u;
            InterfaceC1350e interfaceC1350e = c1348c2.f14922a;
            if (!W0.k.a(j7, j)) {
                c1348c2.f14939u = j;
                long j8 = c1348c2.f14938t;
                interfaceC1350e.C((int) (j8 >> 32), (int) (4294967295L & j8), j);
                if (c1348c2.i == 9205357640488583168L) {
                    c1348c2.f14927g = true;
                    c1348c2.a();
                }
            }
            c1348c2.f14923b = cVar;
            c1348c2.f14924c = lVar;
            c1348c2.f14925d = this.f797K;
            interfaceC1350e.B(cVar, lVar, c1348c2, c1348c2.f14926e);
            if (this.f807z) {
                this.f807z = false;
                this.f800s.B(this, false);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final long f(boolean z5, long j) {
        float[] fArrK;
        if (z5) {
            fArrK = j();
            if (fArrK == null) {
                return 9187343241974906880L;
            }
        } else {
            fArrK = k();
        }
        return this.f795I ? j : AbstractC1145B.o(fArrK, j);
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
    @Override // B0.s0
    public final void g(j0.m mVar, C1348c c1348c) {
        Canvas canvas;
        boolean z5;
        Canvas canvas2;
        boolean z6;
        e();
        this.f796J = this.f798q.f14922a.E() > 0.0f;
        C1219b c1219b = this.f789C;
        B0.G0 g02 = c1219b.f14425r;
        g02.U(mVar);
        g02.f235s = c1348c;
        C1348c c1348c2 = this.f798q;
        j0.m mVarT = c1219b.z().t();
        C1348c c1348c3 = (C1348c) c1219b.z().f235s;
        InterfaceC1350e interfaceC1350e = c1348c2.f14922a;
        if (c1348c2.f14937s) {
            return;
        }
        c1348c2.a();
        if (!interfaceC1350e.n()) {
            try {
                c1348c2.f14922a.B(c1348c2.f14923b, c1348c2.f14924c, c1348c2, c1348c2.f14926e);
            } catch (Throwable unused) {
            }
        }
        boolean z7 = interfaceC1350e.E() > 0.0f;
        if (z7) {
            mVarT.p();
        }
        Canvas canvasA = AbstractC1148c.a(mVarT);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            canvas = canvasA;
        } else {
            long j = c1348c2.f14938t;
            float f = (int) (j >> 32);
            float f7 = (int) (j & 4294967295L);
            long j7 = c1348c2.f14939u;
            float f8 = ((int) (j7 >> 32)) + f;
            float f9 = f7 + ((int) (j7 & 4294967295L));
            float fC = interfaceC1350e.c();
            int iH = interfaceC1350e.H();
            if (fC < 1.0f || iH != 3 || interfaceC1350e.v() == 1) {
                W1.d dVarF = c1348c2.f14934p;
                if (dVarF == null) {
                    dVarF = AbstractC1145B.f();
                    c1348c2.f14934p = dVarF;
                }
                dVarF.c(fC);
                dVarF.d(iH);
                dVarF.f(null);
                canvasA.saveLayer(f, f7, f8, f9, (Paint) dVarF.f8044b);
            } else {
                canvasA.save();
            }
            canvas = canvasA;
            canvas.translate(f, f7);
            canvas.concat(interfaceC1350e.A());
        }
        boolean z8 = !zIsHardwareAccelerated && c1348c2.f14941w;
        if (z8) {
            mVarT.k();
            AbstractC1145B abstractC1145BD = c1348c2.d();
            if (abstractC1145BD instanceof j0.y) {
                C1131c c1131cL = abstractC1145BD.l();
                mVarT.g(c1131cL.f13522a, c1131cL.f13523b, c1131cL.f13524c, c1131cL.f13525d, 1);
            } else if (abstractC1145BD instanceof j0.z) {
                C1152g c1152gA = c1348c2.f14931m;
                if (c1152gA != null) {
                    c1152gA.f13707a.rewind();
                } else {
                    c1152gA = j0.i.a();
                    c1348c2.f14931m = c1152gA;
                }
                InterfaceC1144A.a(c1152gA, ((j0.z) abstractC1145BD).f13732e);
                mVarT.a(c1152gA);
            } else if (abstractC1145BD instanceof j0.x) {
                mVarT.a(((j0.x) abstractC1145BD).f13730e);
            }
        }
        if (c1348c3 != null) {
            L.s sVar = c1348c3.f14936r;
            if (!sVar.f3061a) {
                j0.w.a("Only add dependencies during a tracking");
            }
            C1549H c1549h = (C1549H) sVar.f3064d;
            if (c1549h != null) {
                c1549h.a(c1348c2);
            } else if (((C1348c) sVar.f3062b) != null) {
                int i = r.P.f16163a;
                C1549H c1549h2 = new C1549H();
                C1348c c1348c4 = (C1348c) sVar.f3062b;
                kotlin.jvm.internal.m.b(c1348c4);
                c1549h2.a(c1348c4);
                c1549h2.a(c1348c2);
                sVar.f3064d = c1549h2;
                sVar.f3062b = null;
            } else {
                sVar.f3062b = c1348c2;
            }
            C1549H c1549h3 = (C1549H) sVar.f3065e;
            if (c1549h3 != null) {
                z6 = !c1549h3.l(c1348c2);
            } else if (((C1348c) sVar.f3063c) != c1348c2) {
                z6 = true;
            } else {
                sVar.f3063c = null;
                z6 = false;
            }
            if (z6) {
                c1348c2.f14935q++;
            }
        }
        if (AbstractC1148c.a(mVarT).isHardwareAccelerated()) {
            z5 = z7;
            canvas2 = canvas;
            interfaceC1350e.x(mVarT);
        } else {
            C1219b c1219b2 = c1348c2.f14933o;
            if (c1219b2 == null) {
                c1219b2 = new C1219b();
                c1348c2.f14933o = c1219b2;
            }
            B0.G0 g03 = c1219b2.f14425r;
            W0.c cVar = c1348c2.f14923b;
            W0.l lVar = c1348c2.f14924c;
            long jD0 = P1.d0(c1348c2.f14939u);
            C1218a c1218a = ((C1219b) g03.f236t).f14424q;
            W0.c cVar2 = c1218a.f14420a;
            W0.l lVar2 = c1218a.f14421b;
            j0.m mVarT2 = g03.t();
            z5 = z7;
            long jE = g03.E();
            canvas2 = canvas;
            C1348c c1348c5 = (C1348c) g03.f235s;
            g03.V(cVar);
            g03.W(lVar);
            g03.U(mVarT);
            g03.X(jD0);
            g03.f235s = c1348c2;
            mVarT.k();
            try {
                c1348c2.c(c1219b2);
            } finally {
                mVarT.i();
                g03.V(cVar2);
                g03.W(lVar2);
                g03.U(mVarT2);
                g03.X(jE);
                g03.f235s = c1348c5;
            }
        }
        if (z8) {
            mVarT.i();
        }
        if (z5) {
            mVarT.n();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas2.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo0getUnderlyingMatrixsQKQjiQ() {
        return k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final boolean h(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        C1348c c1348c = this.f798q;
        if (c1348c.f14941w) {
            return W.l(c1348c.d(), fIntBitsToFloat, fIntBitsToFloat2);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void i(B5.e eVar, B5.a aVar) {
        j0.t tVar = this.f799r;
        if (tVar == null) {
            throw S.i("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f798q.f14937s) {
            AbstractC1904a.a("layer should have been released before reuse");
        }
        this.f798q = tVar.b();
        this.f804w = false;
        this.f801t = eVar;
        this.f802u = aVar;
        this.f793G = false;
        this.f794H = false;
        this.f795I = true;
        AbstractC1145B.q(this.f805x);
        float[] fArr = this.f806y;
        if (fArr != null) {
            AbstractC1145B.q(fArr);
        }
        this.f791E = j0.H.f13693b;
        this.f796J = false;
        long j = Integer.MAX_VALUE;
        this.f803v = (j & 4294967295L) | (j << 32);
        this.f792F = null;
        this.f790D = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B0.s0
    public final void invalidate() {
        if (this.f807z || this.f804w) {
            return;
        }
        A a7 = this.f800s;
        a7.invalidate();
        if (true != this.f807z) {
            this.f807z = true;
            a7.B(this, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float[] j() {
        float[] fArrJ = this.f806y;
        if (fArrJ == null) {
            fArrJ = AbstractC1145B.j();
            this.f806y = fArrJ;
        }
        if (this.f794H) {
            this.f794H = false;
            float[] fArrK = k();
            if (this.f795I) {
                return fArrK;
            }
            if (!W.i(fArrK, fArrJ)) {
                fArrJ[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrJ[0])) {
            return null;
        }
        return fArrJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float[] k() {
        boolean z5 = this.f793G;
        float[] fArr = this.f805x;
        if (z5) {
            C1348c c1348c = this.f798q;
            long jR = c1348c.f14940v;
            InterfaceC1350e interfaceC1350e = c1348c.f14922a;
            if ((9223372034707292159L & jR) == 9205357640488583168L) {
                jR = AbstractC1397A.r(P1.d0(this.f803v));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jR >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR & 4294967295L));
            float fT = interfaceC1350e.t();
            float fO = interfaceC1350e.o();
            float fW = interfaceC1350e.w();
            float fD = interfaceC1350e.D();
            float fG = interfaceC1350e.G();
            float fA = interfaceC1350e.a();
            float F6 = interfaceC1350e.F();
            double d5 = ((double) fW) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d5);
            float fCos = (float) Math.cos(d5);
            float f = -fSin;
            float f7 = (fO * fCos) - (1.0f * fSin);
            float f8 = (1.0f * fCos) + (fO * fSin);
            double d7 = ((double) fD) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d7);
            float fCos2 = (float) Math.cos(d7);
            float f9 = -fSin2;
            float f10 = fSin * fSin2;
            float f11 = fSin * fCos2;
            float f12 = fCos * fSin2;
            float f13 = fCos * fCos2;
            float f14 = (f8 * fSin2) + (fT * fCos2);
            float f15 = (f8 * fCos2) + ((-fT) * fSin2);
            double d8 = ((double) fG) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d8);
            float fCos3 = (float) Math.cos(d8);
            float f16 = -fSin3;
            float f17 = (fCos3 * f10) + (f16 * fCos2);
            float f18 = (f10 * fSin3) + (fCos2 * fCos3);
            float f19 = fSin3 * fCos;
            float f20 = f18 * fA;
            float f21 = f19 * fA;
            float f22 = ((fSin3 * f11) + (fCos3 * f9)) * fA;
            float f23 = f17 * F6;
            float f24 = fCos * fCos3 * F6;
            float f25 = ((fCos3 * f11) + (f16 * f9)) * F6;
            float f26 = f12 * 1.0f;
            float f27 = f * 1.0f;
            float f28 = f13 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f20;
                fArr[1] = f21;
                fArr[2] = f22;
                fArr[3] = 0.0f;
                fArr[4] = f23;
                fArr[5] = f24;
                fArr[6] = f25;
                fArr[7] = 0.0f;
                fArr[8] = f26;
                fArr[9] = f27;
                fArr[10] = f28;
                fArr[11] = 0.0f;
                float f29 = -fIntBitsToFloat;
                fArr[12] = ((f20 * f29) - (fIntBitsToFloat2 * f23)) + f14 + fIntBitsToFloat;
                fArr[13] = ((f21 * f29) - (fIntBitsToFloat2 * f24)) + f7 + fIntBitsToFloat2;
                fArr[14] = ((f29 * f22) - (fIntBitsToFloat2 * f25)) + f15;
                fArr[15] = 1.0f;
            }
            this.f793G = false;
            this.f795I = AbstractC1145B.m(fArr);
        }
        return fArr;
    }
}
