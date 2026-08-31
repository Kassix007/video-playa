package d2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: d2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0984j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12132a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0985k f12133b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0984j(C0985k c0985k) {
        this.f12133b = c0985k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12132a = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f12132a) {
            this.f12132a = false;
            return;
        }
        C0985k c0985k = this.f12133b;
        if (((Float) c0985k.f12160z.getAnimatedValue()).floatValue() == 0.0f) {
            c0985k.f12136A = 0;
            c0985k.f(0);
        } else {
            c0985k.f12136A = 2;
            c0985k.f12153s.invalidate();
        }
    }
}
