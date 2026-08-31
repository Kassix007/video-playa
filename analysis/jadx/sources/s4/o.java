package s4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import r4.C1579a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f16546c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o(q qVar) {
        this.f16546c = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.t
    public final void a(Matrix matrix, C1579a c1579a, int i, Canvas canvas) {
        float f;
        q qVar = this.f16546c;
        float f7 = qVar.f;
        float f8 = qVar.f16555g;
        RectF rectF = new RectF(qVar.f16551b, qVar.f16552c, qVar.f16553d, qVar.f16554e);
        Paint paint = c1579a.f16350b;
        boolean z5 = f8 < 0.0f;
        Path path = c1579a.f16354g;
        int[] iArr = C1579a.f16347k;
        if (z5) {
            iArr[0] = 0;
            iArr[1] = c1579a.f;
            iArr[2] = c1579a.f16353e;
            iArr[3] = c1579a.f16352d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f7, f8);
            path.close();
            float f9 = -i;
            rectF.inset(f9, f9);
            iArr[0] = 0;
            iArr[1] = c1579a.f16352d;
            iArr[2] = c1579a.f16353e;
            iArr[3] = c1579a.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f10 = 1.0f - (i / fWidth);
        float[] fArr = C1579a.f16348l;
        fArr[1] = f10;
        fArr[2] = ((1.0f - f10) / 2.0f) + f10;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z5) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c1579a.f16355h);
        }
        canvas.drawArc(rectF, f7, f8, true, paint);
        canvas.restore();
    }
}
