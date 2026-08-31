package o2;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15335b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(e eVar, d dVar) {
        this.f15335b = eVar;
        this.f15334a = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f15334a;
        e.d(fFloatValue, dVar);
        e eVar = this.f15335b;
        eVar.a(fFloatValue, dVar, false);
        eVar.invalidateSelf();
    }
}
