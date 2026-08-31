package L1;

import android.view.animation.Interpolator;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f3246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f3247b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(float[] fArr) {
        this.f3246a = fArr;
        this.f3247b = 1.0f / (fArr.length - 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3246a;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f7 = this.f3247b;
        float f8 = (f - (iMin * f7)) / f7;
        float f9 = fArr[iMin];
        return i.a(fArr[iMin + 1], f9, f8, f9);
    }
}
