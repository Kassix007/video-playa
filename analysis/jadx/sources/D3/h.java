package d3;

import android.graphics.Color;
import android.graphics.Matrix;
import h3.C1122a;
import h3.C1123b;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements InterfaceC1001a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j3.b f12238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j3.b f12239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f12240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f12241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f12242e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f12243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Matrix f12244h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(j3.b bVar, j3.b bVar2, L0.l lVar) {
        this.f12239b = bVar;
        this.f12238a = bVar2;
        e eVarF = ((C1122a) lVar.f3125b).f();
        this.f12240c = (f) eVarF;
        eVarF.a(this);
        bVar2.d(eVarF);
        i iVarF = ((C1123b) lVar.f3126c).f();
        this.f12241d = iVarF;
        iVarF.a(this);
        bVar2.d(iVarF);
        i iVarF2 = ((C1123b) lVar.f3127d).f();
        this.f12242e = iVarF2;
        iVarF2.a(this);
        bVar2.d(iVarF2);
        i iVarF3 = ((C1123b) lVar.f3128e).f();
        this.f = iVarF3;
        iVarF3.a(this);
        bVar2.d(iVarF3);
        i iVarF4 = ((C1123b) lVar.f3124a).f();
        this.f12243g = iVarF4;
        iVarF4.a(this);
        bVar2.d(iVarF4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C1395a a(Matrix matrix, int i) {
        float fL = this.f12242e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d5 = fL;
        float fSin = ((float) Math.sin(d5)) * fFloatValue;
        float fCos = ((float) Math.cos(d5 + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.f12243g.e()).floatValue();
        int iIntValue = ((Integer) this.f12240c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.f12241d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        C1395a c1395a = new C1395a();
        c1395a.f15147a = fFloatValue2 * 0.33f;
        c1395a.f15148b = fSin;
        c1395a.f15149c = fCos;
        c1395a.f15150d = iArgb;
        c1395a.f15151e = null;
        c1395a.c(matrix);
        if (this.f12244h == null) {
            this.f12244h = new Matrix();
        }
        this.f12238a.f13766w.e().invert(this.f12244h);
        c1395a.c(this.f12244h);
        return c1395a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f12239b.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Z.m mVar) {
        this.f12241d.j(new g(mVar));
    }
}
