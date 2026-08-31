package l0;

import B0.G0;
import W0.l;
import android.graphics.Paint;
import android.graphics.Shader;
import j0.AbstractC1145B;
import j0.C1150e;
import j0.InterfaceC1144A;
import j0.j;
import j0.o;
import kotlin.jvm.internal.m;

/* JADX INFO: renamed from: l0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1219b implements InterfaceC1221d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1218a f14424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final G0 f14425r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public W1.d f14426s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public W1.d f14427t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1219b() {
        C1218a c1218a = new C1218a();
        c1218a.f14420a = AbstractC1220c.f14428a;
        c1218a.f14421b = l.f8022q;
        c1218a.f14422c = C1222e.f14429a;
        c1218a.f14423d = 0L;
        this.f14424q = c1218a;
        this.f14425r = new G0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static W1.d a(C1219b c1219b, long j, AbstractC1220c abstractC1220c, float f, int i) {
        W1.d dVarE = c1219b.e(abstractC1220c);
        if (f != 1.0f) {
            j = o.b(j, o.d(j) * f);
        }
        if (!o.c(AbstractC1145B.b(((Paint) dVarE.f8044b).getColor()), j)) {
            dVarE.e(j);
        }
        if (((Shader) dVarE.f8045c) != null) {
            dVarE.g(null);
        }
        if (!m.a((j) dVarE.f8046d, null)) {
            dVarE.f(null);
        }
        if (dVarE.f8043a != i) {
            dVarE.d(i);
        }
        if (((Paint) dVarE.f8044b).isFilterBitmap()) {
            return dVarE;
        }
        ((Paint) dVarE.f8044b).setFilterBitmap(true);
        return dVarE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void L(long j, long j7, long j8, float f, int i) {
        j0.m mVar = this.f14424q.f14422c;
        W1.d dVarF = this.f14427t;
        if (dVarF == null) {
            dVarF = AbstractC1145B.f();
            dVarF.j(1);
            this.f14427t = dVarF;
        }
        Paint paint = (Paint) dVarF.f8044b;
        if (!o.c(AbstractC1145B.b(paint.getColor()), j)) {
            dVarF.e(j);
        }
        if (((Shader) dVarF.f8045c) != null) {
            dVarF.g(null);
        }
        if (!m.a((j) dVarF.f8046d, null)) {
            dVarF.f(null);
        }
        if (dVarF.f8043a != 3) {
            dVarF.d(3);
        }
        if (paint.getStrokeWidth() != f) {
            ((Paint) dVarF.f8044b).setStrokeWidth(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) dVarF.f8044b).setStrokeMiter(4.0f);
        }
        if (dVarF.a() != i) {
            dVarF.h(i);
        }
        if (dVarF.b() != 0) {
            dVarF.i(0);
        }
        if (!paint.isFilterBitmap()) {
            ((Paint) dVarF.f8044b).setFilterBitmap(true);
        }
        mVar.f(j7, j8, dVarF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void R(long j, long j7, long j8, float f, AbstractC1220c abstractC1220c, int i) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        this.f14424q.f14422c.j(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (4294967295L & j8)) + Float.intBitsToFloat(i8), a(this, j, abstractC1220c, f, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float b() {
        return this.f14424q.f14420a.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final W1.d c(AbstractC1145B abstractC1145B, AbstractC1220c abstractC1220c, float f, j jVar, int i, int i7) {
        W1.d dVarE = e(abstractC1220c);
        if (abstractC1145B != null) {
            abstractC1145B.h(f, d(), dVarE);
        } else {
            if (((Shader) dVarE.f8045c) != null) {
                dVarE.g(null);
            }
            long jB = AbstractC1145B.b(((Paint) dVarE.f8044b).getColor());
            long j = o.f13718b;
            if (!o.c(jB, j)) {
                dVarE.e(j);
            }
            if (((Paint) dVarE.f8044b).getAlpha() / 255.0f != f) {
                dVarE.c(f);
            }
        }
        if (!m.a((j) dVarE.f8046d, jVar)) {
            dVarE.f(jVar);
        }
        if (dVarE.f8043a != i) {
            dVarE.d(i);
        }
        if (((Paint) dVarE.f8044b).isFilterBitmap() == i7) {
            return dVarE;
        }
        ((Paint) dVarE.f8044b).setFilterBitmap(true ^ (i7 == 0));
        return dVarE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final W1.d e(AbstractC1220c abstractC1220c) {
        if (m.a(abstractC1220c, C1223f.f14430b)) {
            W1.d dVar = this.f14426s;
            if (dVar != null) {
                return dVar;
            }
            W1.d dVarF = AbstractC1145B.f();
            dVarF.j(0);
            this.f14426s = dVarF;
            return dVarF;
        }
        if (!(abstractC1220c instanceof C1224g)) {
            throw new C2.e();
        }
        W1.d dVarF2 = this.f14427t;
        if (dVarF2 == null) {
            dVarF2 = AbstractC1145B.f();
            dVarF2.j(1);
            this.f14427t = dVarF2;
        }
        Paint paint = (Paint) dVarF2.f8044b;
        float strokeWidth = paint.getStrokeWidth();
        C1224g c1224g = (C1224g) abstractC1220c;
        float f = c1224g.f14431b;
        if (strokeWidth != f) {
            ((Paint) dVarF2.f8044b).setStrokeWidth(f);
        }
        int iA = dVarF2.a();
        int i = c1224g.f14433d;
        if (iA != i) {
            dVarF2.h(i);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f7 = c1224g.f14432c;
        if (strokeMiter != f7) {
            ((Paint) dVarF2.f8044b).setStrokeMiter(f7);
        }
        int iB = dVarF2.b();
        int i7 = c1224g.f14434e;
        if (iB == i7) {
            return dVarF2;
        }
        dVarF2.i(i7);
        return dVarF2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final l getLayoutDirection() {
        return this.f14424q.f14421b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void i(C1150e c1150e, long j, long j7, long j8, float f, j jVar, int i) {
        this.f14424q.f14422c.b(c1150e, j, j7, j8, c(null, C1223f.f14430b, f, jVar, 3, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // W0.c
    public final float l() {
        return this.f14424q.f14420a.l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void m(InterfaceC1144A interfaceC1144A, AbstractC1145B abstractC1145B, float f, AbstractC1220c abstractC1220c, int i) {
        this.f14424q.f14422c.m(interfaceC1144A, c(abstractC1145B, abstractC1220c, f, null, i, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void p(float f, long j, long j7) {
        this.f14424q.f14422c.q(f, j7, a(this, j, C1223f.f14430b, 1.0f, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void v(long j, float f, float f7, long j7, long j8, AbstractC1220c abstractC1220c) {
        int i = (int) (j7 >> 32);
        int i7 = (int) (j7 & 4294967295L);
        this.f14424q.f14422c.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i7), f, f7, a(this, j, abstractC1220c, 1.0f, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final void w(InterfaceC1144A interfaceC1144A, long j, AbstractC1220c abstractC1220c) {
        this.f14424q.f14422c.m(interfaceC1144A, a(this, j, abstractC1220c, 1.0f, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // l0.InterfaceC1221d
    public final G0 z() {
        return this.f14425r;
    }
}
