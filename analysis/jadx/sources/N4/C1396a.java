package n4;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: n4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1396a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f15204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f15205b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1396a(c cVar, float f) {
        this.f15205b = cVar;
        this.f15204a = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f15205b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f15204a);
    }
}
