package j3;

import Z.m;
import a3.C;
import a3.y;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b3.C0698a;
import d3.r;
import n3.C1395a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final RectF f13815D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C0698a f13816E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final float[] f13817F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Path f13818G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final e f13819H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public r f13820I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public r f13821J;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(y yVar, e eVar) {
        super(yVar, eVar);
        this.f13815D = new RectF();
        C0698a c0698a = new C0698a();
        this.f13816E = c0698a;
        this.f13817F = new float[8];
        this.f13818G = new Path();
        this.f13819H = eVar;
        c0698a.setAlpha(0);
        c0698a.setStyle(Paint.Style.FILL);
        c0698a.setColor(eVar.f13798l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, c3.f
    public final void a(RectF rectF, Matrix matrix, boolean z5) {
        super.a(rectF, matrix, z5);
        e eVar = this.f13819H;
        float f = eVar.j;
        float f7 = eVar.f13797k;
        RectF rectF2 = this.f13815D;
        rectF2.set(0.0f, 0.0f, f, f7);
        this.f13757n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b, g3.f
    public final void f(m mVar, Object obj) {
        super.f(mVar, obj);
        if (obj == C.f8764F) {
            this.f13820I = new r(mVar, null);
        } else if (obj == 1) {
            this.f13821J = new r(mVar, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // j3.b
    public final void k(Canvas canvas, Matrix matrix, int i, C1395a c1395a) {
        e eVar = this.f13819H;
        int iAlpha = Color.alpha(eVar.f13798l);
        if (iAlpha == 0) {
            return;
        }
        r rVar = this.f13821J;
        Integer num = rVar == null ? null : (Integer) rVar.e();
        C0698a c0698a = this.f13816E;
        if (num != null) {
            c0698a.setColor(num.intValue());
        } else {
            c0698a.setColor(eVar.f13798l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.f13766w.j == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        c0698a.setAlpha(iIntValue);
        if (c1395a == null || Color.alpha(c1395a.f15150d) <= 0) {
            c0698a.clearShadowLayer();
        } else {
            c0698a.setShadowLayer(Math.max(c1395a.f15147a, Float.MIN_VALUE), c1395a.f15148b, c1395a.f15149c, c1395a.f15150d);
        }
        r rVar2 = this.f13820I;
        if (rVar2 != null) {
            c0698a.setColorFilter((ColorFilter) rVar2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f13817F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = eVar.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f7 = eVar.f13797k;
            fArr[5] = f7;
            fArr[6] = 0.0f;
            fArr[7] = f7;
            matrix.mapPoints(fArr);
            Path path = this.f13818G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, c0698a);
        }
    }
}
