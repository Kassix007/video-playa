package c3;

import a3.C;
import a3.y;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import d3.InterfaceC1001a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n, InterfaceC1001a, l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10192e;
    public final y f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10194h;
    public final boolean i;
    public final d3.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d3.e f10195k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d3.i f10196l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d3.i f10197m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d3.i f10198n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d3.i f10199o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3.i f10200p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10202r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f10188a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f10189b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PathMeasure f10190c = new PathMeasure();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f10191d = new float[2];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0733c f10201q = new C0733c(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(y yVar, j3.b bVar, i3.i iVar) {
        this.f = yVar;
        this.f10192e = iVar.f13593a;
        int i = iVar.f13594b;
        this.f10193g = i;
        this.f10194h = iVar.j;
        this.i = iVar.f13600k;
        d3.i iVarF = iVar.f13595c.f();
        this.j = iVarF;
        d3.e eVarF = iVar.f13596d.f();
        this.f10195k = eVarF;
        d3.i iVarF2 = iVar.f13597e.f();
        this.f10196l = iVarF2;
        d3.i iVarF3 = iVar.f13598g.f();
        this.f10198n = iVarF3;
        d3.i iVarF4 = iVar.i.f();
        this.f10200p = iVarF4;
        if (i == 1) {
            this.f10197m = iVar.f.f();
            this.f10199o = iVar.f13599h.f();
        } else {
            this.f10197m = null;
            this.f10199o = null;
        }
        bVar.d(iVarF);
        bVar.d(eVarF);
        bVar.d(iVarF2);
        bVar.d(iVarF3);
        bVar.d(iVarF4);
        if (i == 1) {
            bVar.d(this.f10197m);
            bVar.d(this.f10199o);
        }
        iVarF.a(this);
        eVarF.a(this);
        iVarF2.a(this);
        iVarF3.a(this);
        iVarF4.a(this);
        if (i == 1) {
            this.f10197m.a(this);
            this.f10199o.a(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // d3.InterfaceC1001a
    public final void b() {
        this.f10202r = false;
        this.f.invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final void c(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.f10234c == 1) {
                    this.f10201q.f10129a.add(uVar);
                    uVar.d(this);
                }
            }
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.n
    public final Path e() {
        boolean z5;
        float f;
        double d5;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int i;
        double d7;
        boolean z6 = this.f10202r;
        Path path = this.f10188a;
        if (z6) {
            return path;
        }
        path.reset();
        if (this.f10194h) {
            this.f10202r = true;
            return path;
        }
        int iA = O.c.a(this.f10193g);
        d3.e eVar = this.f10195k;
        d3.i iVar = this.f10198n;
        d3.i iVar2 = this.f10200p;
        d3.i iVar3 = this.f10196l;
        d3.i iVar4 = this.j;
        if (iA == 0) {
            z5 = true;
            float fFloatValue = ((Float) iVar4.e()).floatValue();
            double radians = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d8 = fFloatValue;
            float f12 = (float) (6.283185307179586d / d8);
            if (this.i) {
                f12 *= -1.0f;
            }
            float f13 = f12;
            float f14 = f13 / 2.0f;
            float f15 = fFloatValue - ((int) fFloatValue);
            if (f15 != 0.0f) {
                f = 2.0f;
                radians += (double) ((1.0f - f15) * f14);
            } else {
                f = 2.0f;
            }
            float fFloatValue2 = ((Float) iVar.e()).floatValue();
            float fFloatValue3 = ((Float) this.f10197m.e()).floatValue();
            d3.i iVar5 = this.f10199o;
            float fFloatValue4 = iVar5 != null ? ((Float) iVar5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = iVar2 != null ? ((Float) iVar2.e()).floatValue() / 100.0f : 0.0f;
            if (f15 != 0.0f) {
                float fA = k1.i.a(fFloatValue2, fFloatValue3, f15, fFloatValue3);
                double d9 = fA;
                f9 = fA;
                float fCos = (float) (Math.cos(radians) * d9);
                float fSin = (float) (Math.sin(radians) * d9);
                path.moveTo(fCos, fSin);
                d5 = radians + ((double) ((f13 * f15) / f));
                f7 = fCos;
                f8 = fSin;
            } else {
                double d10 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d10);
                float fSin2 = (float) (Math.sin(radians) * d10);
                path.moveTo(fCos2, fSin2);
                d5 = radians + ((double) f14);
                f7 = fCos2;
                f8 = fSin2;
                f9 = 0.0f;
            }
            double dCeil = Math.ceil(d8) * 2.0d;
            double d11 = d5;
            int i7 = 0;
            boolean z7 = false;
            while (true) {
                double d12 = i7;
                if (d12 >= dCeil) {
                    break;
                }
                float f16 = z7 ? fFloatValue2 : fFloatValue3;
                float f17 = (f9 == 0.0f || d12 != dCeil - 2.0d) ? f14 : (f13 * f15) / f;
                if (f9 != 0.0f && d12 == dCeil - 1.0d) {
                    f16 = f9;
                }
                double d13 = f16;
                float fCos3 = (float) (Math.cos(d11) * d13);
                float fSin3 = (float) (Math.sin(d11) * d13);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f10 = f15;
                    f11 = fCos3;
                } else {
                    f10 = f15;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f8, f7) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f18 = f7;
                    float f19 = f8;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f20 = z7 ? fFloatValue4 : fFloatValue5;
                    float f21 = z7 ? fFloatValue5 : fFloatValue4;
                    float f22 = (z7 ? fFloatValue3 : fFloatValue2) * f20 * 0.47829f;
                    float f23 = fCos4 * f22;
                    float f24 = f22 * fSin4;
                    float f25 = (z7 ? fFloatValue2 : fFloatValue3) * f21 * 0.47829f;
                    float f26 = fCos5 * f25;
                    float f27 = f25 * fSin5;
                    if (f15 != 0.0f) {
                        if (i7 == 0) {
                            f23 *= f10;
                            f24 *= f10;
                        } else if (d12 == dCeil - 1.0d) {
                            f26 *= f10;
                            f27 *= f10;
                        }
                    }
                    f11 = fCos3;
                    path = path2;
                    path.cubicTo(f18 - f23, f19 - f24, f26 + fCos3, fSin3 + f27, f11, fSin3);
                }
                d11 += (double) f17;
                z7 = !z7;
                i7++;
                f7 = f11;
                f8 = fSin3;
                f15 = f10;
                f = 2.0f;
            }
            PointF pointF = (PointF) eVar.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iA != 1) {
            z5 = true;
        } else {
            int iFloor = (int) Math.floor(((Float) iVar4.e()).floatValue());
            double radians2 = Math.toRadians((iVar3 != null ? ((Float) iVar3.e()).floatValue() : 0.0d) - 90.0d);
            double d14 = iFloor;
            float fFloatValue6 = ((Float) iVar2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) iVar.e()).floatValue();
            double d15 = fFloatValue7;
            z5 = true;
            float fCos6 = (float) (Math.cos(radians2) * d15);
            float fSin6 = (float) (Math.sin(radians2) * d15);
            path.moveTo(fCos6, fSin6);
            double d16 = (float) (6.283185307179586d / d14);
            double dCeil2 = Math.ceil(d14);
            double d17 = radians2 + d16;
            int i8 = 0;
            while (true) {
                double d18 = i8;
                if (d18 >= dCeil2) {
                    break;
                }
                double d19 = dCeil2;
                float fCos7 = (float) (Math.cos(d17) * d15);
                float fSin7 = (float) (Math.sin(d17) * d15);
                if (fFloatValue6 != 0.0f) {
                    i = i8;
                    Path path3 = path;
                    d7 = d15;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f28 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f29 = f28 * fCos8;
                    float f30 = f28 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f28;
                    float fSin9 = f28 * ((float) Math.sin(dAtan24));
                    if (d18 == d19 - 1.0d) {
                        Path path4 = this.f10189b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f31 = fCos6 - f29;
                        float f32 = fSin6 - f30;
                        float f33 = fCos7 + fCos9;
                        float f34 = fSin7 + fSin9;
                        path4.cubicTo(f31, f32, f33, f34, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f10190c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.f10191d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f31, f32, f33, f34, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f35 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f29, fSin6 - f30, fCos7 + fCos9, f35, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i = i8;
                    d7 = d15;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d18 == d19 - 1.0d) {
                        i8 = i + 1;
                        dCeil2 = d19;
                        d15 = d7;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d17 += d16;
                i8 = i + 1;
                dCeil2 = d19;
                d15 = d7;
            }
            PointF pointF2 = (PointF) eVar.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f10201q.c(path);
        this.f10202r = z5;
        return path;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void f(Z.m mVar, Object obj) {
        d3.i iVar;
        d3.i iVar2;
        if (obj == C.f8784r) {
            this.j.j(mVar);
            return;
        }
        if (obj == C.f8785s) {
            this.f10196l.j(mVar);
            return;
        }
        if (obj == C.i) {
            this.f10195k.j(mVar);
            return;
        }
        if (obj == C.f8786t && (iVar2 = this.f10197m) != null) {
            iVar2.j(mVar);
            return;
        }
        if (obj == C.f8787u) {
            this.f10198n.j(mVar);
            return;
        }
        if (obj == C.f8788v && (iVar = this.f10199o) != null) {
            iVar.j(mVar);
        } else if (obj == C.f8789w) {
            this.f10200p.j(mVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // c3.d
    public final String getName() {
        return this.f10192e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // g3.f
    public final void h(g3.e eVar, int i, ArrayList arrayList, g3.e eVar2) {
        n3.g.g(eVar, i, arrayList, eVar2, this);
    }
}
