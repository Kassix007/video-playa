package d2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: d2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0978d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0974V f12085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f12089e;
    public final /* synthetic */ C0982h f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0978d(C0982h c0982h, AbstractC0974V abstractC0974V, int i, View view, int i7, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = c0982h;
        this.f12085a = abstractC0974V;
        this.f12086b = i;
        this.f12087c = view;
        this.f12088d = i7;
        this.f12089e = viewPropertyAnimator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f12086b;
        View view = this.f12087c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f12088d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f12089e.setListener(null);
        C0982h c0982h = this.f;
        AbstractC0974V abstractC0974V = this.f12085a;
        c0982h.c(abstractC0974V);
        c0982h.f12128p.remove(abstractC0974V);
        c0982h.i();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
