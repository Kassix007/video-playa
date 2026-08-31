package o2;

import android.animation.Animator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f15336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15337b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(e eVar, d dVar) {
        this.f15337b = eVar;
        this.f15336a = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        e eVar = this.f15337b;
        d dVar = this.f15336a;
        eVar.a(1.0f, dVar, true);
        dVar.f15345k = dVar.f15342e;
        dVar.f15346l = dVar.f;
        dVar.f15347m = dVar.f15343g;
        dVar.a((dVar.j + 1) % dVar.i.length);
        if (!eVar.f15364v) {
            eVar.f15363u += 1.0f;
            return;
        }
        eVar.f15364v = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (dVar.f15348n) {
            dVar.f15348n = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f15337b.f15363u = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }
}
