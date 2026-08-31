package o2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final LinearInterpolator f15356w = new LinearInterpolator();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final L1.a f15357x = new L1.a(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f15358y = {-16777216};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f15359q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f15360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Resources f15361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ValueAnimator f15362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f15363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15364v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Context context) {
        context.getClass();
        this.f15361s = context.getResources();
        d dVar = new d();
        this.f15359q = dVar;
        dVar.i = f15358y;
        dVar.a(0);
        dVar.f15344h = 2.5f;
        dVar.f15339b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f15356w);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f15362t = valueAnimatorOfFloat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(float f, d dVar) {
        if (f <= 0.75f) {
            dVar.f15355u = dVar.i[dVar.j];
            return;
        }
        float f7 = (f - 0.75f) / 0.25f;
        int[] iArr = dVar.i;
        int i = dVar.j;
        int i7 = iArr[i];
        int i8 = iArr[(i + 1) % iArr.length];
        dVar.f15355u = ((((i7 >> 24) & 255) + ((int) ((((i8 >> 24) & 255) - r1) * f7))) << 24) | ((((i7 >> 16) & 255) + ((int) ((((i8 >> 16) & 255) - r3) * f7))) << 16) | ((((i7 >> 8) & 255) + ((int) ((((i8 >> 8) & 255) - r4) * f7))) << 8) | ((i7 & 255) + ((int) (f7 * ((i8 & 255) - r2))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(float f, d dVar, boolean z5) {
        float interpolation;
        float interpolation2;
        if (this.f15364v) {
            d(f, dVar);
            float fFloor = (float) (Math.floor(dVar.f15347m / 0.8f) + 1.0d);
            float f7 = dVar.f15345k;
            float f8 = dVar.f15346l;
            dVar.f15342e = (((f8 - 0.01f) - f7) * f) + f7;
            dVar.f = f8;
            float f9 = dVar.f15347m;
            dVar.f15343g = k1.i.a(fFloor, f9, f, f9);
            return;
        }
        if (f != 1.0f || z5) {
            float f10 = dVar.f15347m;
            L1.a aVar = f15357x;
            if (f < 0.5f) {
                interpolation = dVar.f15345k;
                interpolation2 = (aVar.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f11 = dVar.f15345k + 0.79f;
                interpolation = f11 - (((1.0f - aVar.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f11;
            }
            float f12 = (0.20999998f * f) + f10;
            float f13 = (f + this.f15363u) * 216.0f;
            dVar.f15342e = interpolation;
            dVar.f = interpolation2;
            dVar.f15343g = f12;
            this.f15360r = f13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(float f, float f7, float f8, float f9) {
        float f10 = this.f15361s.getDisplayMetrics().density;
        float f11 = f7 * f10;
        d dVar = this.f15359q;
        dVar.f15344h = f11;
        dVar.f15339b.setStrokeWidth(f11);
        dVar.f15351q = f * f10;
        dVar.a(0);
        dVar.f15352r = (int) (f8 * f10);
        dVar.f15353s = (int) (f9 * f10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        if (i == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f15360r, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f15359q;
        Paint paint = dVar.f15339b;
        RectF rectF = dVar.f15338a;
        float f = dVar.f15351q;
        float fMin = (dVar.f15344h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f15352r * dVar.f15350p) / 2.0f, dVar.f15344h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f7 = dVar.f15342e;
        float f8 = dVar.f15343g;
        float f9 = (f7 + f8) * 360.0f;
        float f10 = ((dVar.f + f8) * 360.0f) - f9;
        paint.setColor(dVar.f15355u);
        paint.setAlpha(dVar.f15354t);
        float f11 = dVar.f15344h / 2.0f;
        rectF.inset(f11, f11);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f15341d);
        float f12 = -f11;
        rectF.inset(f12, f12);
        canvas.drawArc(rectF, f9, f10, false, paint);
        Paint paint2 = dVar.f15340c;
        if (dVar.f15348n) {
            Path path = dVar.f15349o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f15349o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f13 = (dVar.f15352r * dVar.f15350p) / 2.0f;
            dVar.f15349o.moveTo(0.0f, 0.0f);
            dVar.f15349o.lineTo(dVar.f15352r * dVar.f15350p, 0.0f);
            Path path3 = dVar.f15349o;
            float f14 = dVar.f15352r;
            float f15 = dVar.f15350p;
            path3.lineTo((f14 * f15) / 2.0f, dVar.f15353s * f15);
            dVar.f15349o.offset((rectF.centerX() + fMin2) - f13, (dVar.f15344h / 2.0f) + rectF.centerY());
            dVar.f15349o.close();
            paint2.setColor(dVar.f15355u);
            paint2.setAlpha(dVar.f15354t);
            canvas.save();
            canvas.rotate(f9 + f10, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f15349o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f15359q.f15354t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f15362t.isRunning();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f15359q.f15354t = i;
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15359q.f15339b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f15362t.cancel();
        d dVar = this.f15359q;
        float f = dVar.f15342e;
        dVar.f15345k = f;
        float f7 = dVar.f;
        dVar.f15346l = f7;
        dVar.f15347m = dVar.f15343g;
        if (f7 != f) {
            this.f15364v = true;
            this.f15362t.setDuration(666L);
            this.f15362t.start();
            return;
        }
        dVar.a(0);
        dVar.f15345k = 0.0f;
        dVar.f15346l = 0.0f;
        dVar.f15347m = 0.0f;
        dVar.f15342e = 0.0f;
        dVar.f = 0.0f;
        dVar.f15343g = 0.0f;
        this.f15362t.setDuration(1332L);
        this.f15362t.start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f15362t.cancel();
        this.f15360r = 0.0f;
        d dVar = this.f15359q;
        if (dVar.f15348n) {
            dVar.f15348n = false;
        }
        dVar.a(0);
        dVar.f15345k = 0.0f;
        dVar.f15346l = 0.0f;
        dVar.f15347m = 0.0f;
        dVar.f15342e = 0.0f;
        dVar.f = 0.0f;
        dVar.f15343g = 0.0f;
        invalidateSelf();
    }
}
