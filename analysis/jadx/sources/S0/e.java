package S0;

import P.C;
import V0.l;
import android.graphics.Paint;
import android.text.TextPaint;
import i0.C1133e;
import j0.AbstractC1145B;
import j0.D;
import j0.o;
import kotlin.jvm.internal.m;
import l0.AbstractC1220c;
import l0.C1223f;
import l0.C1224g;

/* JADX INFO: loaded from: classes.dex */
public final class e extends TextPaint {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W1.d f7290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f7291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public D f7293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f7294e;
    public AbstractC1145B f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C f7295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C1133e f7296h;
    public AbstractC1220c i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final W1.d a() {
        W1.d dVar = this.f7290a;
        if (dVar != null) {
            return dVar;
        }
        W1.d dVar2 = new W1.d(this);
        this.f7290a = dVar2;
        return dVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        if (i == this.f7292c) {
            return;
        }
        a().d(i);
        this.f7292c = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(j0.AbstractC1145B r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f7295g = r0
            r5.f = r0
            r5.f7296h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof j0.G
            if (r1 == 0) goto L1d
            j0.G r6 = (j0.G) r6
            long r6 = r6.f13692e
            long r6 = n5.AbstractC1397A.w(r6, r9)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof j0.l
            if (r1 == 0) goto L70
            j0.B r1 = r5.f
            boolean r1 = kotlin.jvm.internal.m.a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            i0.e r1 = r5.f7296h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f13533a
            boolean r1 = i0.C1133e.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f = r6
            i0.e r1 = new i0.e
            r1.<init>(r7)
            r5.f7296h = r1
            A0.d r1 = new A0.d
            r1.<init>(r6, r7)
            P.C r6 = P.C0345b.m(r1)
            r5.f7295g = r6
        L58:
            W1.d r6 = r5.a()
            P.C r7 = r5.f7295g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.g(r7)
            r5.f7294e = r0
            S0.j.a(r5, r9)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.e.c(j0.B, long, float):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(long j) {
        o oVar = this.f7294e;
        if (oVar == null ? false : o.c(oVar.f13724a, j)) {
            return;
        }
        if (j != 16) {
            this.f7294e = new o(j);
            setColor(AbstractC1145B.v(j));
            this.f7295g = null;
            this.f = null;
            this.f7296h = null;
            setShader(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(AbstractC1220c abstractC1220c) {
        if (abstractC1220c == null || m.a(this.i, abstractC1220c)) {
            return;
        }
        this.i = abstractC1220c;
        if (abstractC1220c.equals(C1223f.f14430b)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC1220c instanceof C1224g) {
            a().j(1);
            W1.d dVarA = a();
            C1224g c1224g = (C1224g) abstractC1220c;
            ((Paint) dVarA.f8044b).setStrokeWidth(c1224g.f14431b);
            W1.d dVarA2 = a();
            ((Paint) dVarA2.f8044b).setStrokeMiter(c1224g.f14432c);
            a().i(c1224g.f14434e);
            a().h(c1224g.f14433d);
            ((Paint) a().f8044b).setPathEffect(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(D d5) {
        if (d5 == null || m.a(this.f7293d, d5)) {
            return;
        }
        this.f7293d = d5;
        if (d5.equals(D.f13677d)) {
            clearShadowLayer();
            return;
        }
        D d7 = this.f7293d;
        float f = d7.f13680c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (d7.f13679b >> 32)), Float.intBitsToFloat((int) (this.f7293d.f13679b & 4294967295L)), AbstractC1145B.v(this.f7293d.f13678a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(l lVar) {
        if (lVar == null || m.a(this.f7291b, lVar)) {
            return;
        }
        this.f7291b = lVar;
        int i = lVar.f7939a;
        setUnderlineText((i | 1) == i);
        int i7 = this.f7291b.f7939a;
        setStrikeThruText((i7 | 2) == i7);
    }
}
