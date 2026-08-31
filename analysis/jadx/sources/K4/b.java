package K4;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f2905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f2906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f2907c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(Paint paint) {
        this.f2905a = paint;
        paint.setAlpha(255);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(int[] iArr) {
        this.f2906b = iArr;
        ColorStateList colorStateList = this.f2907c;
        int defaultColor = colorStateList != null ? colorStateList.getDefaultColor() : 0;
        ColorStateList colorStateList2 = this.f2907c;
        if (colorStateList2 != null) {
            defaultColor = colorStateList2.getColorForState(this.f2906b, defaultColor);
        }
        Paint paint = this.f2905a;
        int color = paint.getColor();
        paint.setColor(defaultColor);
        return defaultColor != color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean b() {
        ColorStateList colorStateList = this.f2907c;
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i) {
        Paint paint = this.f2905a;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "color=#" + Integer.toHexString(this.f2905a.getColor()) + ", state=" + this.f2906b + ", colorList=" + this.f2907c;
    }
}
