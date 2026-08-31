package c3;

import a3.C;
import a3.y;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import d3.InterfaceC1001a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p implements InterfaceC1001a, l, n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f10207e;
    public final d3.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d3.e f10208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d3.i f10209h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10210k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f10203a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f10204b = new RectF();
    public final C0733c i = new C0733c(0);
    public d3.e j = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(y yVar, j3.b bVar, i3.j jVar) {
        this.f10205c = jVar.f13602b;
        this.f10206d = jVar.f13604d;
        this.f10207e = yVar;
        d3.e eVarF = jVar.f13605e.f();
        this.f = eVarF;
        d3.e eVarF2 = ((h3.e) jVar.f).f();
        this.f10208g = eVarF2;
        d3.i iVarF = jVar.f13603c.f();
        this.f10209h = iVarF;
        bVar.d(eVarF);
        bVar.d(eVarF2);
        bVar.d(iVarF);
        eVarF.a(this);
        eVarF2.a(this);
        iVarF.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10210k = false;
        this.f10207e.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // c3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L34
            java.lang.Object r0 = r0.get(r6)
            c3.d r0 = (c3.d) r0
            boolean r1 = r0 instanceof c3.u
            if (r1 == 0) goto L27
            r1 = r0
            c3.u r1 = (c3.u) r1
            int r2 = r1.f10234c
            r3 = 1
            if (r2 != r3) goto L27
            c3.c r0 = r4.i
            java.util.ArrayList r0 = r0.f10129a
            r0.add(r1)
            r1.d(r4)
            goto L31
        L27:
            boolean r1 = r0 instanceof c3.r
            if (r1 == 0) goto L31
            c3.r r0 = (c3.r) r0
            d3.e r0 = r0.f10219b
            r4.j = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.p.c(java.util.List, java.util.List):void");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        float f;
        d3.e eVar;
        boolean z5 = this.f10210k;
        Path path = this.f10203a;
        if (z5) {
            return path;
        }
        path.reset();
        if (this.f10206d) {
            this.f10210k = true;
            return path;
        }
        PointF pointF = (PointF) this.f10208g.e();
        float f7 = pointF.x / 2.0f;
        float f8 = pointF.y / 2.0f;
        d3.i iVar = this.f10209h;
        float fL = iVar == null ? 0.0f : iVar.l();
        if (fL == 0.0f && (eVar = this.j) != null) {
            fL = Math.min(((Float) eVar.e()).floatValue(), Math.min(f7, f8));
        }
        float fMin = Math.min(f7, f8);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f7, (pointF2.y - f8) + fL);
        path.lineTo(pointF2.x + f7, (pointF2.y + f8) - fL);
        RectF rectF = this.f10204b;
        if (fL > 0.0f) {
            float f9 = pointF2.x + f7;
            float f10 = fL * 2.0f;
            f = 2.0f;
            float f11 = pointF2.y + f8;
            rectF.set(f9 - f10, f11 - f10, f9, f11);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f7) + fL, pointF2.y + f8);
        if (fL > 0.0f) {
            float f12 = pointF2.x - f7;
            float f13 = pointF2.y + f8;
            float f14 = fL * f;
            rectF.set(f12, f13 - f14, f14 + f12, f13);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f7, (pointF2.y - f8) + fL);
        if (fL > 0.0f) {
            float f15 = pointF2.x - f7;
            float f16 = pointF2.y - f8;
            float f17 = fL * f;
            rectF.set(f15, f16, f15 + f17, f17 + f16);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f7) - fL, pointF2.y - f8);
        if (fL > 0.0f) {
            float f18 = pointF2.x + f7;
            float f19 = fL * f;
            float f20 = pointF2.y - f8;
            rectF.set(f18 - f19, f20, f18, f19 + f20);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.c(path);
        this.f10210k = true;
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        if (obj == C.f8775g) {
            this.f10208g.j(mVar);
        } else if (obj == C.i) {
            this.f.j(mVar);
        } else if (obj == C.f8776h) {
            this.f10209h.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10205c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }
}
