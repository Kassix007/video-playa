package o2;

import R4.X1;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Animation {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ X1 f15373r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(X1 x12, int i) {
        this.f15372q = i;
        this.f15373r = x12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f15372q) {
            case 0:
                X1 x12 = this.f15373r;
                int iAbs = x12.f15389N - Math.abs(x12.f15388M);
                x12.setTargetOffsetTopAndBottom((x12.f15387L + ((int) ((iAbs - r1) * f))) - x12.f15385J.getTop());
                e eVar = x12.f15391P;
                float f7 = 1.0f - f;
                d dVar = eVar.f15359q;
                if (f7 != dVar.f15350p) {
                    dVar.f15350p = f7;
                }
                eVar.invalidateSelf();
                break;
            default:
                this.f15373r.k(f);
                break;
        }
    }
}
