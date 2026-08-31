package c3;

import a3.C;
import a3.C0632k;
import a3.y;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b3.C0698a;
import d3.InterfaceC1001a;
import h3.C1123b;
import i3.C1139d;
import i3.C1140e;
import java.util.ArrayList;
import java.util.List;
import n3.C1395a;
import r.C1566q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f, InterfaceC1001a, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.b f10157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1566q f10158d = new C1566q((Object) null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1566q f10159e = new C1566q((Object) null);
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0698a f10160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f10161h;
    public final ArrayList i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d3.j f10162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d3.f f10163l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d3.j f10164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d3.j f10165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d3.r f10166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public d3.r f10167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f10168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d3.e f10170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f10171t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(y yVar, C0632k c0632k, j3.b bVar, C1140e c1140e) {
        Path path = new Path();
        this.f = path;
        this.f10160g = new C0698a(1, 0);
        this.f10161h = new RectF();
        this.i = new ArrayList();
        this.f10171t = 0.0f;
        this.f10157c = bVar;
        this.f10155a = c1140e.f13575g;
        this.f10156b = c1140e.f13576h;
        this.f10168q = yVar;
        this.j = c1140e.f13570a;
        path.setFillType(c1140e.f13571b);
        this.f10169r = (int) (c0632k.b() / 32.0f);
        d3.e eVarF = c1140e.f13572c.f();
        this.f10162k = (d3.j) eVarF;
        eVarF.a(this);
        bVar.d(eVarF);
        d3.e eVarF2 = c1140e.f13573d.f();
        this.f10163l = (d3.f) eVarF2;
        eVarF2.a(this);
        bVar.d(eVarF2);
        d3.e eVarF3 = c1140e.f13574e.f();
        this.f10164m = (d3.j) eVarF3;
        eVarF3.a(this);
        bVar.d(eVarF3);
        d3.e eVarF4 = c1140e.f.f();
        this.f10165n = (d3.j) eVarF4;
        eVarF4.a(this);
        bVar.d(eVarF4);
        if (bVar.l() != null) {
            d3.i iVarF = ((C1123b) bVar.l().f13562r).f();
            this.f10170s = iVarF;
            iVarF.a(this);
            bVar.d(this.f10170s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10168q.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final void c(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            d dVar = (d) list2.get(i);
            if (dVar instanceof n) {
                this.i.add((n) dVar);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] d(int[] iArr) {
        d3.r rVar = this.f10167p;
        if (rVar != null) {
            Integer[] numArr = (Integer[]) rVar.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        PointF pointF = C.f8770a;
        if (obj == 4) {
            this.f10163l.j(mVar);
            return;
        }
        ColorFilter colorFilter = C.f8764F;
        j3.b bVar = this.f10157c;
        if (obj == colorFilter) {
            d3.r rVar = this.f10166o;
            if (rVar != null) {
                bVar.o(rVar);
            }
            d3.r rVar2 = new d3.r(mVar, null);
            this.f10166o = rVar2;
            rVar2.a(this);
            bVar.d(this.f10166o);
            return;
        }
        if (obj == C.f8765G) {
            d3.r rVar3 = this.f10167p;
            if (rVar3 != null) {
                bVar.o(rVar3);
            }
            this.f10158d.a();
            this.f10159e.a();
            d3.r rVar4 = new d3.r(mVar, null);
            this.f10167p = rVar4;
            rVar4.a(this);
            bVar.d(this.f10167p);
            return;
        }
        if (obj == C.f8774e) {
            d3.e eVar = this.f10170s;
            if (eVar != null) {
                eVar.j(mVar);
                return;
            }
            d3.r rVar5 = new d3.r(mVar, null);
            this.f10170s = rVar5;
            rVar5.a(this);
            bVar.d(this.f10170s);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.f
    public final void g(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.f10156b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i7 >= arrayList.size()) {
                break;
            }
            path.addPath(((n) arrayList.get(i7)).e(), matrix);
            i7++;
        }
        path.computeBounds(this.f10161h, false);
        int i8 = this.j;
        d3.j jVar = this.f10162k;
        d3.j jVar2 = this.f10165n;
        d3.j jVar3 = this.f10164m;
        if (i8 == 1) {
            long jI = i();
            C1566q c1566q = this.f10158d;
            linearGradient = (LinearGradient) c1566q.b(jI);
            if (linearGradient == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                C1139d c1139d = (C1139d) jVar.e();
                int[] iArrD = d(c1139d.f13569b);
                float[] fArr2 = c1139d.f13568a;
                if (iArrD.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrD[0], iArrD[0]};
                } else {
                    iArr2 = iArrD;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                c1566q.e(jI, linearGradient);
            }
        } else {
            long jI2 = i();
            C1566q c1566q2 = this.f10159e;
            RadialGradient radialGradient = (RadialGradient) c1566q2.b(jI2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                C1139d c1139d2 = (C1139d) jVar.e();
                int[] iArrD2 = d(c1139d2.f13569b);
                float[] fArr3 = c1139d2.f13568a;
                if (iArrD2.length < 2) {
                    iArr = new int[]{iArrD2[0], iArrD2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrD2;
                }
                float f = pointF3.x;
                float f7 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f7);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f7, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                c1566q2.e(jI2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        C0698a c0698a = this.f10160g;
        c0698a.setShader(linearGradient);
        d3.r rVar = this.f10166o;
        if (rVar != null) {
            c0698a.setColorFilter((ColorFilter) rVar.e());
        }
        d3.e eVar = this.f10170s;
        if (eVar != null) {
            float fFloatValue = ((Float) eVar.e()).floatValue();
            if (fFloatValue == 0.0f) {
                c0698a.setMaskFilter(null);
            } else if (fFloatValue != this.f10171t) {
                c0698a.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f10171t = fFloatValue;
        }
        float fIntValue = ((Integer) this.f10163l.e()).intValue() / 100.0f;
        c0698a.setAlpha(n3.g.c((int) (i * fIntValue)));
        if (c1395a != null) {
            c1395a.a((int) (fIntValue * 255.0f), c0698a);
        }
        canvas.drawPath(path, c0698a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10155a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i() {
        float f = this.f10164m.f12233d;
        float f7 = this.f10169r;
        int iRound = Math.round(f * f7);
        int iRound2 = Math.round(this.f10165n.f12233d * f7);
        int iRound3 = Math.round(this.f10162k.f12233d * f7);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
