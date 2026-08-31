package c3;

import a3.C;
import a3.y;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import i3.C1139d;
import n3.C1395a;
import r.C1566q;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0732b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public d3.r f10172A;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f10173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f10174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1566q f10175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C1566q f10176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f10177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10178v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final d3.j f10180x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d3.j f10181y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final d3.j f10182z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public j(y yVar, j3.b bVar, i3.f fVar) {
        Paint.Join join;
        Paint.Join join2;
        int iA = O.c.a(fVar.f13583h);
        Paint.Cap cap = iA != 0 ? iA != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iA2 = O.c.a(fVar.i);
        if (iA2 == 0) {
            join = Paint.Join.MITER;
        } else if (iA2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (iA2 != 2) {
                join2 = null;
                super(yVar, bVar, cap, join2, fVar.j, fVar.f13580d, fVar.f13582g, fVar.f13584k, fVar.f13585l);
                this.f10175s = new C1566q((Object) null);
                this.f10176t = new C1566q((Object) null);
                this.f10177u = new RectF();
                this.f10173q = fVar.f13577a;
                this.f10178v = fVar.f13578b;
                this.f10174r = fVar.f13586m;
                this.f10179w = (int) (yVar.f8920q.b() / 32.0f);
                d3.e eVarF = fVar.f13579c.f();
                this.f10180x = (d3.j) eVarF;
                eVarF.a(this);
                bVar.d(eVarF);
                d3.e eVarF2 = fVar.f13581e.f();
                this.f10181y = (d3.j) eVarF2;
                eVarF2.a(this);
                bVar.d(eVarF2);
                d3.e eVarF3 = fVar.f.f();
                this.f10182z = (d3.j) eVarF3;
                eVarF3.a(this);
                bVar.d(eVarF3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        super(yVar, bVar, cap, join2, fVar.j, fVar.f13580d, fVar.f13582g, fVar.f13584k, fVar.f13585l);
        this.f10175s = new C1566q((Object) null);
        this.f10176t = new C1566q((Object) null);
        this.f10177u = new RectF();
        this.f10173q = fVar.f13577a;
        this.f10178v = fVar.f13578b;
        this.f10174r = fVar.f13586m;
        this.f10179w = (int) (yVar.f8920q.b() / 32.0f);
        d3.e eVarF4 = fVar.f13579c.f();
        this.f10180x = (d3.j) eVarF4;
        eVarF4.a(this);
        bVar.d(eVarF4);
        d3.e eVarF22 = fVar.f13581e.f();
        this.f10181y = (d3.j) eVarF22;
        eVarF22.a(this);
        bVar.d(eVarF22);
        d3.e eVarF32 = fVar.f.f();
        this.f10182z = (d3.j) eVarF32;
        eVarF32.a(this);
        bVar.d(eVarF32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int[] d(int[] iArr) {
        d3.r rVar = this.f10172A;
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
    @Override // c3.AbstractC0732b, g3.f
    public final void f(Z.m mVar, Object obj) {
        super.f(mVar, obj);
        if (obj == C.f8765G) {
            d3.r rVar = this.f10172A;
            j3.b bVar = this.f;
            if (rVar != null) {
                bVar.o(rVar);
            }
            d3.r rVar2 = new d3.r(mVar, null);
            this.f10172A = rVar2;
            rVar2.a(this);
            bVar.d(this.f10172A);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.AbstractC0732b, c3.f
    public final void g(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        Shader shader;
        Shader radialGradient;
        if (this.f10174r) {
            return;
        }
        a(this.f10177u, matrix, false);
        int i7 = this.f10178v;
        d3.j jVar = this.f10180x;
        d3.j jVar2 = this.f10182z;
        d3.j jVar3 = this.f10181y;
        if (i7 == 1) {
            long jI = i();
            C1566q c1566q = this.f10175s;
            shader = (LinearGradient) c1566q.b(jI);
            if (shader == null) {
                PointF pointF = (PointF) jVar3.e();
                PointF pointF2 = (PointF) jVar2.e();
                C1139d c1139d = (C1139d) jVar.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, d(c1139d.f13569b), c1139d.f13568a, Shader.TileMode.CLAMP);
                c1566q.e(jI, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jI2 = i();
            C1566q c1566q2 = this.f10176t;
            shader = (RadialGradient) c1566q2.b(jI2);
            if (shader == null) {
                PointF pointF3 = (PointF) jVar3.e();
                PointF pointF4 = (PointF) jVar2.e();
                C1139d c1139d2 = (C1139d) jVar.e();
                int[] iArrD = d(c1139d2.f13569b);
                float[] fArr = c1139d2.f13568a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrD, fArr, Shader.TileMode.CLAMP);
                c1566q2.e(jI2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, c1395a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10173q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i() {
        float f = this.f10181y.f12233d;
        float f7 = this.f10179w;
        int iRound = Math.round(f * f7);
        int iRound2 = Math.round(this.f10182z.f12233d * f7);
        int iRound3 = Math.round(this.f10180x.f12233d * f7);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
