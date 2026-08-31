package r2;

import E.Y;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import r.C1554e;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Matrix f16315p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f16316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f16317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f16318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Paint f16319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Paint f16320e;
    public PathMeasure f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f16321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16322h;
    public float i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f16323k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16324l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f16326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1554e f16327o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l() {
        this.f16318c = new Matrix();
        this.f16322h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f16323k = 0.0f;
        this.f16324l = 255;
        this.f16325m = null;
        this.f16326n = null;
        this.f16327o = new C1554e(0);
        this.f16321g = new i();
        this.f16316a = new Path();
        this.f16317b = new Path();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(i iVar, Matrix matrix, Canvas canvas, int i, int i7) {
        int i8;
        float f;
        int i9;
        float f7;
        Matrix matrix2 = iVar.f16304a;
        ArrayList arrayList = iVar.f16305b;
        matrix2.set(matrix);
        Matrix matrix3 = iVar.f16304a;
        matrix3.preConcat(iVar.j);
        canvas.save();
        char c7 = 0;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            j jVar = (j) arrayList.get(i10);
            if (jVar instanceof i) {
                a((i) jVar, matrix3, canvas, i, i7);
            } else if (jVar instanceof k) {
                k kVar = (k) jVar;
                float f8 = i / this.j;
                float f9 = i7 / this.f16323k;
                float fMin = Math.min(f8, f9);
                Matrix matrix4 = this.f16318c;
                matrix4.set(matrix3);
                matrix4.postScale(f8, f9);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c7], fArr[1]);
                boolean z5 = c7;
                i8 = i10;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f10 = (fArr[z5 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f10) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    kVar.getClass();
                    Path path = this.f16316a;
                    path.reset();
                    n1.d[] dVarArr = kVar.f16312a;
                    if (dVarArr != null) {
                        n1.d.b(dVarArr, path);
                    }
                    Path path2 = this.f16317b;
                    path2.reset();
                    if (kVar instanceof g) {
                        path2.setFillType(kVar.f16314c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        h hVar = (h) kVar;
                        float f11 = hVar.i;
                        if (f11 != 0.0f || hVar.j != 1.0f) {
                            float f12 = hVar.f16300k;
                            float f13 = (f11 + f12) % 1.0f;
                            float f14 = (hVar.j + f12) % 1.0f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, z5);
                            float length = this.f.getLength();
                            float f15 = f13 * length;
                            float f16 = f14 * length;
                            path.reset();
                            if (f15 > f16) {
                                this.f.getSegment(f15, length, path, true);
                                f = 0.0f;
                                this.f.getSegment(0.0f, f16, path, true);
                            } else {
                                f = 0.0f;
                                this.f.getSegment(f15, f16, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        Y y6 = hVar.f;
                        if (((Shader) y6.f1520c) == null && y6.f1519b == 0) {
                            f7 = 255.0f;
                            i9 = 16777215;
                        } else {
                            if (this.f16320e == null) {
                                i9 = 16777215;
                                Paint paint = new Paint(1);
                                this.f16320e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i9 = 16777215;
                            }
                            Paint paint2 = this.f16320e;
                            Shader shader = (Shader) y6.f1520c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(hVar.f16299h * 255.0f));
                                f7 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i11 = y6.f1519b;
                                float f17 = hVar.f16299h;
                                PorterDuff.Mode mode = o.f16338z;
                                f7 = 255.0f;
                                paint2.setColor((i11 & i9) | (((int) (Color.alpha(i11) * f17)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(hVar.f16314c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        Y y7 = hVar.f16296d;
                        if (((Shader) y7.f1520c) != null || y7.f1519b != 0) {
                            if (this.f16319d == null) {
                                Paint paint3 = new Paint(1);
                                this.f16319d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f16319d;
                            Paint.Join join = hVar.f16302m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = hVar.f16301l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(hVar.f16303n);
                            Shader shader2 = (Shader) y7.f1520c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(hVar.f16298g * f7));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i12 = y7.f1519b;
                                float f18 = hVar.f16298g;
                                PorterDuff.Mode mode2 = o.f16338z;
                                paint4.setColor((i12 & i9) | (((int) (Color.alpha(i12) * f18)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(hVar.f16297e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i10 = i8 + 1;
                c7 = 0;
            }
            i8 = i10;
            i10 = i8 + 1;
            c7 = 0;
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getRootAlpha() {
        return this.f16324l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setRootAlpha(int i) {
        this.f16324l = i;
    }

    public l(l lVar) {
        this.f16318c = new Matrix();
        this.f16322h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.f16323k = 0.0f;
        this.f16324l = 255;
        this.f16325m = null;
        this.f16326n = null;
        C1554e c1554e = new C1554e(0);
        this.f16327o = c1554e;
        this.f16321g = new i(lVar.f16321g, c1554e);
        this.f16316a = new Path(lVar.f16316a);
        this.f16317b = new Path(lVar.f16317b);
        this.f16322h = lVar.f16322h;
        this.i = lVar.i;
        this.j = lVar.j;
        this.f16323k = lVar.f16323k;
        this.f16324l = lVar.f16324l;
        this.f16325m = lVar.f16325m;
        String str = lVar.f16325m;
        if (str != null) {
            c1554e.put(str, this);
        }
        this.f16326n = lVar.f16326n;
    }
}
