package u2;

import B0.N;
import M5.AbstractC0263y;
import M5.q0;
import P.C0345b;
import P.C0346b0;
import P.C0354f0;
import P.w0;
import P5.H;
import P5.S;
import Z4.G;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import i0.C1133e;
import j0.C1150e;
import l0.C1219b;
import o0.AbstractC1412b;
import o0.C1411a;
import q3.C1519b;
import z0.C1949i;
import z0.InterfaceC1950j;

/* JADX INFO: renamed from: u2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1693n extends AbstractC1412b implements w0 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final G f17161J = new G(10);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1686g f17162A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AbstractC1412b f17163B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public B5.c f17164C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public InterfaceC1950j f17165D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f17166E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f17167F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0354f0 f17168G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final C0354f0 f17169H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0354f0 f17170I;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public R5.d f17171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S f17172w = H.b(new C1133e(0));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0354f0 f17173x = C0345b.q(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0346b0 f17174y = new C0346b0(1.0f);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0354f0 f17175z = C0345b.q(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1693n(D2.j jVar, t2.l lVar) {
        C1682c c1682c = C1682c.f17142a;
        this.f17162A = c1682c;
        this.f17164C = f17161J;
        this.f17165D = C1949i.f18694a;
        this.f17166E = 1;
        this.f17168G = C0345b.q(c1682c);
        this.f17169H = C0345b.q(jVar);
        this.f17170I = C0345b.q(lVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean a(float f) {
        this.f17174y.f(f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void b() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f17171v == null) {
                q0 q0VarC = AbstractC0263y.c();
                T5.e eVar = M5.H.f3811a;
                R5.d dVarA = AbstractC0263y.a(E3.h.L(q0VarC, R5.n.f7261a.f4044t));
                this.f17171v = dVarA;
                Object obj = this.f17163B;
                w0 w0Var = obj instanceof w0 ? (w0) obj : null;
                if (w0Var != null) {
                    w0Var.b();
                }
                if (this.f17167F) {
                    D2.h hVarA = D2.j.a((D2.j) this.f17169H.getValue());
                    hVarA.f1382b = ((t2.l) this.f17170I.getValue()).f16715b;
                    hVarA.f1394q = null;
                    hVarA.a().f1395A.getClass();
                    D2.c cVar = H2.d.f2135a;
                    k(new C1684e(null));
                } else {
                    AbstractC0263y.t(dVarA, null, null, new C1689j(this, null), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void c() {
        R5.d dVar = this.f17171v;
        if (dVar != null) {
            AbstractC0263y.e(dVar, null);
        }
        this.f17171v = null;
        Object obj = this.f17163B;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (w0Var != null) {
            w0Var.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final boolean d(j0.j jVar) {
        this.f17175z.setValue(jVar);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // P.w0
    public final void e() {
        R5.d dVar = this.f17171v;
        if (dVar != null) {
            AbstractC0263y.e(dVar, null);
        }
        this.f17171v = null;
        Object obj = this.f17163B;
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (w0Var != null) {
            w0Var.e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final long h() {
        AbstractC1412b abstractC1412b = (AbstractC1412b) this.f17173x.getValue();
        if (abstractC1412b != null) {
            return abstractC1412b.h();
        }
        return 9205357640488583168L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o0.AbstractC1412b
    public final void i(N n7) {
        C1219b c1219b = n7.f296q;
        C1133e c1133e = new C1133e(c1219b.d());
        S s6 = this.f17172w;
        s6.getClass();
        s6.h(null, c1133e);
        AbstractC1412b abstractC1412b = (AbstractC1412b) this.f17173x.getValue();
        if (abstractC1412b != null) {
            abstractC1412b.g(n7, c1219b.d(), this.f17174y.e(), (j0.j) this.f17175z.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC1412b j(Drawable drawable) {
        if (!(drawable instanceof BitmapDrawable)) {
            return new C1519b(drawable.mutate());
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        C1150e c1150e = new C1150e(bitmap);
        int i = this.f17166E;
        C1411a c1411a = new C1411a(c1150e, (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        c1411a.f15324x = i;
        return c1411a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(AbstractC1686g abstractC1686g) {
        D2.k kVar;
        AbstractC1686g abstractC1686g2 = this.f17162A;
        AbstractC1686g abstractC1686g3 = (AbstractC1686g) this.f17164C.invoke(abstractC1686g);
        this.f17162A = abstractC1686g3;
        this.f17168G.setValue(abstractC1686g3);
        if (!(abstractC1686g3 instanceof C1685f)) {
            if (abstractC1686g3 instanceof C1683d) {
                kVar = ((C1683d) abstractC1686g3).f17144b;
            }
            AbstractC1412b abstractC1412bA = abstractC1686g3.a();
            this.f17163B = abstractC1412bA;
            this.f17173x.setValue(abstractC1412bA);
            if (this.f17171v != null || abstractC1686g2.a() == abstractC1686g3.a()) {
            }
            Object objA = abstractC1686g2.a();
            w0 w0Var = objA instanceof w0 ? (w0) objA : null;
            if (w0Var != null) {
                w0Var.e();
            }
            Object objA2 = abstractC1686g3.a();
            w0 w0Var2 = objA2 instanceof w0 ? (w0) objA2 : null;
            if (w0Var2 != null) {
                w0Var2.b();
                return;
            }
            return;
        }
        kVar = ((C1685f) abstractC1686g3).f17147b;
        kVar.a().f1402h.getClass();
        AbstractC1412b abstractC1412bA2 = abstractC1686g3.a();
        this.f17163B = abstractC1412bA2;
        this.f17173x.setValue(abstractC1412bA2);
        if (this.f17171v != null) {
        }
    }
}
