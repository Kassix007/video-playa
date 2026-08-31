package c3;

import a3.C;
import a3.y;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import b3.C0698a;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class t extends AbstractC0732b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j3.b f10227q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f10228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d3.f f10230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d3.r f10231u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public t(y yVar, j3.b bVar, i3.p pVar) {
        int iA = O.c.a(pVar.f13627g);
        Paint.Cap cap = iA != 0 ? iA != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iA2 = O.c.a(pVar.f13628h);
        super(yVar, bVar, cap, iA2 != 0 ? iA2 != 1 ? iA2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, pVar.i, pVar.f13626e, pVar.f, pVar.f13624c, pVar.f13623b);
        this.f10227q = bVar;
        this.f10228r = pVar.f13622a;
        this.f10229s = pVar.j;
        d3.e eVarF = pVar.f13625d.f();
        this.f10230t = (d3.f) eVarF;
        eVarF.a(this);
        bVar.d(eVarF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.AbstractC0732b, g3.f
    public final void f(Z.m mVar, Object obj) {
        super.f(mVar, obj);
        PointF pointF = C.f8770a;
        d3.f fVar = this.f10230t;
        if (obj == 2) {
            fVar.j(mVar);
            return;
        }
        if (obj == C.f8764F) {
            d3.r rVar = this.f10231u;
            j3.b bVar = this.f10227q;
            if (rVar != null) {
                bVar.o(rVar);
            }
            d3.r rVar2 = new d3.r(mVar, null);
            this.f10231u = rVar2;
            rVar2.a(this);
            bVar.d(fVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.AbstractC0732b, c3.f
    public final void g(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        if (this.f10229s) {
            return;
        }
        d3.f fVar = this.f10230t;
        int iL = fVar.l(fVar.f12232c.f(), fVar.c());
        C0698a c0698a = this.i;
        c0698a.setColor(iL);
        d3.r rVar = this.f10231u;
        if (rVar != null) {
            c0698a.setColorFilter((ColorFilter) rVar.e());
        }
        super.g(canvas, matrix, i, c1395a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10228r;
    }
}
