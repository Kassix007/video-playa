package o2;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Animation {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f15371s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h(m mVar, int i, int i7) {
        this.f15371s = mVar;
        this.f15369q = i;
        this.f15370r = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        this.f15371s.f15391P.setAlpha((int) (((this.f15370r - r0) * f) + this.f15369q));
    }
}
