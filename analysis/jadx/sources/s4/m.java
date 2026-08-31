package s4;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import i1.C1134a;
import java.util.ArrayList;
import java.util.BitSet;
import o3.C1416b;
import y4.AbstractC1918b;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1416b[] f16535a = new C1416b[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f16536b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f16537c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f16538d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f16539e = new Path();
    public final Path f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1416b f16540g = new C1416b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f16541h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f16542k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f16543l = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m() {
        for (int i = 0; i < 4; i++) {
            this.f16535a[i] = new C1416b();
            this.f16536b[i] = new Matrix();
            this.f16537c[i] = new Matrix();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, float f, RectF rectF, C1134a c1134a, Path path) {
        Matrix[] matrixArr;
        float[] fArr;
        int i;
        C1416b[] c1416bArr;
        Matrix[] matrixArr2;
        char c7;
        float f7;
        char c8;
        int i7;
        path.rewind();
        Path path2 = this.f16539e;
        path2.rewind();
        Path path3 = this.f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i8 = 0;
        while (true) {
            matrixArr = this.f16537c;
            fArr = this.f16541h;
            c1416bArr = this.f16535a;
            matrixArr2 = this.f16536b;
            c7 = 0;
            if (i8 >= 4) {
                break;
            }
            c cVar = i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.f : kVar.f16529e : kVar.f16531h : kVar.f16530g;
            AbstractC1918b abstractC1918b = i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.f16526b : kVar.f16525a : kVar.f16528d : kVar.f16527c;
            C1416b c1416b = c1416bArr[i8];
            abstractC1918b.getClass();
            abstractC1918b.r(c1416b, f, cVar.a(rectF));
            int i9 = i8 + 1;
            float f8 = (i9 % 4) * 90;
            matrixArr2[i8].reset();
            PointF pointF = this.f16538d;
            if (i8 == 1) {
                i7 = i8;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i8 == 2) {
                i7 = i8;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i8 != 3) {
                i7 = i8;
                pointF.set(rectF.right, rectF.top);
            } else {
                i7 = i8;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i7].setTranslate(pointF.x, pointF.y);
            matrixArr2[i7].preRotate(f8);
            C1416b c1416b2 = c1416bArr[i7];
            fArr[0] = c1416b2.f15426b;
            fArr[1] = c1416b2.f15427c;
            matrixArr2[i7].mapPoints(fArr);
            matrixArr[i7].reset();
            matrixArr[i7].setTranslate(fArr[0], fArr[1]);
            matrixArr[i7].preRotate(f8);
            i8 = i9;
        }
        int i10 = 0;
        for (i = 4; i10 < i; i = 4) {
            C1416b c1416b3 = c1416bArr[i10];
            c1416b3.getClass();
            fArr[c7] = 0.0f;
            fArr[1] = c1416b3.f15425a;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 0) {
                path.moveTo(fArr[c7], fArr[1]);
            } else {
                path.lineTo(fArr[c7], fArr[1]);
            }
            c1416bArr[i10].b(matrixArr2[i10], path);
            if (c1134a != null) {
                C1416b c1416b4 = c1416bArr[i10];
                Matrix matrix = matrixArr2[i10];
                g gVar = (g) c1134a.f13535r;
                f7 = 0.0f;
                BitSet bitSet = gVar.f16508t;
                c1416b4.getClass();
                bitSet.set(i10, (boolean) c7);
                t[] tVarArr = gVar.f16506r;
                c1416b4.a(c1416b4.f15429e);
                tVarArr[i10] = new n(new ArrayList((ArrayList) c1416b4.f15430g), new Matrix(matrix));
            } else {
                f7 = 0.0f;
            }
            int i11 = i10 + 1;
            int i12 = i11 % 4;
            C1416b c1416b5 = c1416bArr[i10];
            fArr[0] = c1416b5.f15426b;
            fArr[1] = c1416b5.f15427c;
            matrixArr2[i10].mapPoints(fArr);
            C1416b c1416b6 = c1416bArr[i12];
            c1416b6.getClass();
            float[] fArr2 = this.i;
            fArr2[0] = f7;
            fArr2[1] = c1416b6.f15425a;
            matrixArr2[i12].mapPoints(fArr2);
            Matrix[] matrixArr3 = matrixArr;
            C1416b[] c1416bArr2 = c1416bArr;
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, f7);
            C1416b c1416b7 = c1416bArr2[i10];
            fArr[0] = c1416b7.f15426b;
            fArr[1] = c1416b7.f15427c;
            matrixArr2[i10].mapPoints(fArr);
            if (i10 == 1 || i10 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C1416b c1416b8 = this.f16540g;
            c1416b8.d(0.0f, 270.0f, 0.0f);
            (i10 != 1 ? i10 != 2 ? i10 != 3 ? kVar.j : kVar.i : kVar.f16533l : kVar.f16532k).getClass();
            c1416b8.c(fMax, 0.0f);
            Path path4 = this.j;
            path4.reset();
            c1416b8.b(matrixArr3[i10], path4);
            if (this.f16543l && (b(path4, i10) || b(path4, i12))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c1416b8.f15425a;
                matrixArr3[i10].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c1416b8.b(matrixArr3[i10], path2);
            } else {
                c1416b8.b(matrixArr3[i10], path);
            }
            if (c1134a != null) {
                Matrix matrix2 = matrixArr3[i10];
                g gVar2 = (g) c1134a.f13535r;
                c8 = 0;
                gVar2.f16508t.set(i10 + 4, false);
                t[] tVarArr2 = gVar2.f16507s;
                c1416b8.a(c1416b8.f15429e);
                tVarArr2[i10] = new n(new ArrayList((ArrayList) c1416b8.f15430g), new Matrix(matrix2));
            } else {
                c8 = 0;
            }
            i10 = i11;
            c7 = c8;
            c1416bArr = c1416bArr2;
            matrixArr = matrixArr3;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b(Path path, int i) {
        Path path2 = this.f16542k;
        path2.reset();
        this.f16535a[i].b(this.f16536b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}
