package j0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import i0.C1131c;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1147b implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f13696a = AbstractC1148c.f13699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f13697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f13698c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void a(InterfaceC1144A interfaceC1144A) {
        Canvas canvas = this.f13696a;
        if (!(interfaceC1144A instanceof C1152g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C1152g) interfaceC1144A).f13707a, Region.Op.INTERSECT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void b(C1150e c1150e, long j, long j7, long j8, W1.d dVar) {
        if (this.f13697b == null) {
            this.f13697b = new Rect();
            this.f13698c = new Rect();
        }
        Canvas canvas = this.f13696a;
        if (!(c1150e instanceof C1150e)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = c1150e.f13704a;
        Rect rect = this.f13697b;
        kotlin.jvm.internal.m.b(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i7 = (int) (j & 4294967295L);
        rect.top = i7;
        rect.right = i + ((int) (j7 >> 32));
        rect.bottom = i7 + ((int) (j7 & 4294967295L));
        Rect rect2 = this.f13698c;
        kotlin.jvm.internal.m.b(rect2);
        int i8 = (int) 0;
        rect2.left = i8;
        int i9 = (int) 0;
        rect2.top = i9;
        rect2.right = i8 + ((int) (j8 >> 32));
        rect2.bottom = i9 + ((int) (4294967295L & j8));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) dVar.f8044b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void c(float f, float f7) {
        this.f13696a.scale(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void d(float f, float f7, float f8, float f9, float f10, float f11, W1.d dVar) {
        this.f13696a.drawArc(f, f7, f8, f9, f10, f11, false, (Paint) dVar.f8044b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void e(float f, float f7, float f8, float f9, float f10, float f11, W1.d dVar) {
        this.f13696a.drawRoundRect(f, f7, f8, f9, f10, f11, (Paint) dVar.f8044b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void f(long j, long j7, W1.d dVar) {
        this.f13696a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), (Paint) dVar.f8044b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void g(float f, float f7, float f8, float f9, int i) {
        this.f13696a.clipRect(f, f7, f8, f9, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void h(float f, float f7) {
        this.f13696a.translate(f, f7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void i() {
        this.f13696a.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void j(float f, float f7, float f8, float f9, W1.d dVar) {
        this.f13696a.drawRect(f, f7, f8, f9, (Paint) dVar.f8044b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void k() {
        this.f13696a.save();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void l(C1131c c1131c, W1.d dVar) {
        this.f13696a.saveLayer(c1131c.f13522a, c1131c.f13523b, c1131c.f13524c, c1131c.f13525d, (Paint) dVar.f8044b, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void m(InterfaceC1144A interfaceC1144A, W1.d dVar) {
        Canvas canvas = this.f13696a;
        if (!(interfaceC1144A instanceof C1152g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C1152g) interfaceC1144A).f13707a, (Paint) dVar.f8044b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void n() {
        AbstractC1145B.k(this.f13696a, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void o(float[] fArr) {
        if (AbstractC1145B.m(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        fArr[0] = f;
        fArr[1] = f10;
        fArr[2] = f15;
        fArr[3] = f7;
        fArr[4] = f11;
        fArr[5] = f16;
        fArr[6] = f9;
        fArr[7] = f13;
        fArr[8] = f17;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f7;
        fArr[2] = f8;
        fArr[3] = f9;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
        this.f13696a.concat(matrix);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void p() {
        AbstractC1145B.k(this.f13696a, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j0.m
    public final void q(float f, long j, W1.d dVar) {
        this.f13696a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) dVar.f8044b);
    }
}
