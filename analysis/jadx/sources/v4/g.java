package v4;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g extends s4.g {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final /* synthetic */ int f17625O = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public f f17626N;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g
    public final void f(Canvas canvas) {
        if (this.f17626N.f17624q.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f17626N.f17624q);
        } else {
            canvas.clipRect(this.f17626N.f17624q, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // s4.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f17626N = new f(this.f17626N);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(float f, float f7, float f8, float f9) {
        RectF rectF = this.f17626N.f17624q;
        if (f == rectF.left && f7 == rectF.top && f8 == rectF.right && f9 == rectF.bottom) {
            return;
        }
        rectF.set(f, f7, f8, f9);
        invalidateSelf();
    }
}
