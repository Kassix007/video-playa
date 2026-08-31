package d3;

import a3.C;
import android.graphics.Matrix;
import android.graphics.PointF;
import h3.C1122a;
import h3.C1123b;
import h3.C1125d;
import java.util.Collections;
import o3.C1415a;
import o3.C1417c;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f12260a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f12261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f12262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f12263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f12264e;
    public e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f12265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f12266h;
    public e i;
    public e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i f12267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public i f12268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f12269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f12270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f12271o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(C1125d c1125d) {
        F3.c cVar = c1125d.f13446a;
        this.f = cVar == null ? null : cVar.f();
        h3.e eVar = c1125d.f13447b;
        this.f12265g = eVar == null ? null : eVar.f();
        C1122a c1122a = c1125d.f13448c;
        this.f12266h = c1122a == null ? null : c1122a.f();
        C1123b c1123b = c1125d.f13449d;
        this.i = c1123b == null ? null : c1123b.f();
        C1123b c1123b2 = c1125d.f;
        i iVarF = c1123b2 == null ? null : c1123b2.f();
        this.f12267k = iVarF;
        this.f12271o = c1125d.j;
        if (iVarF != null) {
            this.f12261b = new Matrix();
            this.f12262c = new Matrix();
            this.f12263d = new Matrix();
            this.f12264e = new float[9];
        } else {
            this.f12261b = null;
            this.f12262c = null;
            this.f12263d = null;
            this.f12264e = null;
        }
        C1123b c1123b3 = c1125d.f13451g;
        this.f12268l = c1123b3 == null ? null : c1123b3.f();
        C1122a c1122a2 = c1125d.f13450e;
        if (c1122a2 != null) {
            this.j = c1122a2.f();
        }
        C1123b c1123b4 = c1125d.f13452h;
        if (c1123b4 != null) {
            this.f12269m = c1123b4.f();
        } else {
            this.f12269m = null;
        }
        C1123b c1123b5 = c1125d.i;
        if (c1123b5 != null) {
            this.f12270n = c1123b5.f();
        } else {
            this.f12270n = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(j3.b bVar) {
        bVar.d(this.j);
        bVar.d(this.f12269m);
        bVar.d(this.f12270n);
        bVar.d(this.f);
        bVar.d(this.f12265g);
        bVar.d(this.f12266h);
        bVar.d(this.i);
        bVar.d(this.f12267k);
        bVar.d(this.f12268l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(InterfaceC1001a interfaceC1001a) {
        e eVar = this.j;
        if (eVar != null) {
            eVar.a(interfaceC1001a);
        }
        e eVar2 = this.f12269m;
        if (eVar2 != null) {
            eVar2.a(interfaceC1001a);
        }
        e eVar3 = this.f12270n;
        if (eVar3 != null) {
            eVar3.a(interfaceC1001a);
        }
        e eVar4 = this.f;
        if (eVar4 != null) {
            eVar4.a(interfaceC1001a);
        }
        e eVar5 = this.f12265g;
        if (eVar5 != null) {
            eVar5.a(interfaceC1001a);
        }
        e eVar6 = this.f12266h;
        if (eVar6 != null) {
            eVar6.a(interfaceC1001a);
        }
        e eVar7 = this.i;
        if (eVar7 != null) {
            eVar7.a(interfaceC1001a);
        }
        i iVar = this.f12267k;
        if (iVar != null) {
            iVar.a(interfaceC1001a);
        }
        i iVar2 = this.f12268l;
        if (iVar2 != null) {
            iVar2.a(interfaceC1001a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(Z.m mVar, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == C.f8770a) {
            e eVar = this.f;
            if (eVar == null) {
                this.f = new r(mVar, new PointF());
                return true;
            }
            eVar.j(mVar);
            return true;
        }
        if (obj == C.f8771b) {
            e eVar2 = this.f12265g;
            if (eVar2 == null) {
                this.f12265g = new r(mVar, new PointF());
                return true;
            }
            eVar2.j(mVar);
            return true;
        }
        if (obj == C.f8772c) {
            e eVar3 = this.f12265g;
            if (eVar3 instanceof o) {
                o oVar = (o) eVar3;
                Z.m mVar2 = oVar.f12255m;
                oVar.f12255m = mVar;
                return true;
            }
        }
        if (obj == C.f8773d) {
            e eVar4 = this.f12265g;
            if (eVar4 instanceof o) {
                o oVar2 = (o) eVar4;
                Z.m mVar3 = oVar2.f12256n;
                oVar2.f12256n = mVar;
                return true;
            }
        }
        if (obj == C.j) {
            e eVar5 = this.f12266h;
            if (eVar5 == null) {
                this.f12266h = new r(mVar, new C1417c());
                return true;
            }
            eVar5.j(mVar);
            return true;
        }
        if (obj == C.f8777k) {
            e eVar6 = this.i;
            if (eVar6 == null) {
                this.i = new r(mVar, fValueOf2);
                return true;
            }
            eVar6.j(mVar);
            return true;
        }
        if (obj == 3) {
            e eVar7 = this.j;
            if (eVar7 == null) {
                this.j = new r(mVar, 100);
                return true;
            }
            eVar7.j(mVar);
            return true;
        }
        if (obj == C.f8790x) {
            e eVar8 = this.f12269m;
            if (eVar8 == null) {
                this.f12269m = new r(mVar, fValueOf);
                return true;
            }
            eVar8.j(mVar);
            return true;
        }
        if (obj == C.f8791y) {
            e eVar9 = this.f12270n;
            if (eVar9 == null) {
                this.f12270n = new r(mVar, fValueOf);
                return true;
            }
            eVar9.j(mVar);
            return true;
        }
        if (obj == C.f8778l) {
            if (this.f12267k == null) {
                this.f12267k = new i(Collections.singletonList(new C1415a(fValueOf2)));
            }
            this.f12267k.j(mVar);
            return true;
        }
        if (obj != C.f8779m) {
            return false;
        }
        if (this.f12268l == null) {
            this.f12268l = new i(Collections.singletonList(new C1415a(fValueOf2)));
        }
        this.f12268l.j(mVar);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.f12264e[i] = 0.0f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Matrix e() {
        PointF pointF;
        C1417c c1417c;
        PointF pointF2;
        Matrix matrix = this.f12260a;
        matrix.reset();
        e eVar = this.f12265g;
        if (eVar != null && (pointF2 = (PointF) eVar.e()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                matrix.preTranslate(f, pointF2.y);
            }
        }
        if (!this.f12271o) {
            e eVar2 = this.i;
            if (eVar2 != null) {
                float fFloatValue = eVar2 instanceof r ? ((Float) eVar2.e()).floatValue() : ((i) eVar2).l();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (eVar != null) {
            float f7 = eVar.f12233d;
            PointF pointF3 = (PointF) eVar.e();
            float f8 = pointF3.x;
            float f9 = pointF3.y;
            eVar.i(1.0E-4f + f7);
            PointF pointF4 = (PointF) eVar.e();
            eVar.i(f7);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f9, pointF4.x - f8)));
        }
        if (this.f12267k != null) {
            float fCos = this.f12268l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.l()) + 90.0f));
            float fSin = this.f12268l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.l()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.l()));
            d();
            float[] fArr = this.f12264e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f10 = -fSin;
            fArr[3] = f10;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f12261b;
            matrix2.setValues(fArr);
            d();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f12262c;
            matrix3.setValues(fArr);
            d();
            fArr[0] = fCos;
            fArr[1] = f10;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f12263d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        e eVar3 = this.f12266h;
        if (eVar3 != null && (c1417c = (C1417c) eVar3.e()) != null) {
            float f11 = c1417c.f15431a;
            if (f11 != 1.0f || c1417c.f15432b != 1.0f) {
                matrix.preScale(f11, c1417c.f15432b);
            }
        }
        e eVar4 = this.f;
        if (eVar4 != null && (pointF = (PointF) eVar4.e()) != null) {
            float f12 = pointF.x;
            if (f12 != 0.0f || pointF.y != 0.0f) {
                matrix.preTranslate(-f12, -pointF.y);
            }
        }
        return matrix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Matrix f(float f) {
        e eVar = this.f12265g;
        PointF pointF = eVar == null ? null : (PointF) eVar.e();
        e eVar2 = this.f12266h;
        C1417c c1417c = eVar2 == null ? null : (C1417c) eVar2.e();
        Matrix matrix = this.f12260a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (c1417c != null) {
            double d5 = f;
            matrix.preScale((float) Math.pow(c1417c.f15431a, d5), (float) Math.pow(c1417c.f15432b, d5));
        }
        e eVar3 = this.i;
        if (eVar3 != null) {
            float fFloatValue = ((Float) eVar3.e()).floatValue();
            e eVar4 = this.f;
            PointF pointF2 = eVar4 != null ? (PointF) eVar4.e() : null;
            matrix.preRotate(fFloatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }
}
