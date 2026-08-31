package s4;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import r4.C1579a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f16547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f16548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f16549e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public p(r rVar, float f, float f7) {
        this.f16547c = rVar;
        this.f16548d = f;
        this.f16549e = f7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.t
    public final void a(Matrix matrix, C1579a c1579a, int i, Canvas canvas) {
        r rVar = this.f16547c;
        float f = rVar.f16557c;
        float f7 = this.f16549e;
        float f8 = rVar.f16556b;
        float f9 = this.f16548d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f7, f8 - f9), 0.0f);
        Matrix matrix2 = this.f16560a;
        matrix2.set(matrix);
        matrix2.preTranslate(f9, f7);
        matrix2.preRotate(b());
        c1579a.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i7 = c1579a.f;
        int[] iArr = C1579a.i;
        iArr[0] = i7;
        iArr[1] = c1579a.f16353e;
        iArr[2] = c1579a.f16352d;
        Paint paint = c1579a.f16351c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, C1579a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float b() {
        r rVar = this.f16547c;
        return (float) Math.toDegrees(Math.atan((rVar.f16557c - this.f16549e) / (rVar.f16556b - this.f16548d)));
    }
}
