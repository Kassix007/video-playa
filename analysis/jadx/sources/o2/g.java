package o2;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Animation {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f15368r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ g(m mVar, int i) {
        this.f15367q = i;
        this.f15368r = mVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        switch (this.f15367q) {
            case 0:
                this.f15368r.setAnimationProgress(f);
                break;
            default:
                this.f15368r.setAnimationProgress(1.0f - f);
                break;
        }
    }
}
