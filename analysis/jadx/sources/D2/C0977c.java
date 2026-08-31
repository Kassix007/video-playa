package d2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: d2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0977c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12070a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0974V f12071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f12072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f12073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0982h f12074e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0977c(C0982h c0982h, AbstractC0974V abstractC0974V, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f12074e = c0982h;
        this.f12071b = abstractC0974V;
        this.f12073d = viewPropertyAnimator;
        this.f12072c = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f12070a) {
            case 1:
                this.f12072c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12070a) {
            case 0:
                this.f12073d.setListener(null);
                this.f12072c.setAlpha(1.0f);
                C0982h c0982h = this.f12074e;
                AbstractC0974V abstractC0974V = this.f12071b;
                c0982h.c(abstractC0974V);
                c0982h.f12129q.remove(abstractC0974V);
                c0982h.i();
                break;
            default:
                this.f12073d.setListener(null);
                C0982h c0982h2 = this.f12074e;
                AbstractC0974V abstractC0974V2 = this.f12071b;
                c0982h2.c(abstractC0974V2);
                c0982h2.f12127o.remove(abstractC0974V2);
                c0982h2.i();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f12070a) {
            case 0:
                this.f12074e.getClass();
                break;
            default:
                this.f12074e.getClass();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0977c(C0982h c0982h, AbstractC0974V abstractC0974V, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f12074e = c0982h;
        this.f12071b = abstractC0974V;
        this.f12072c = view;
        this.f12073d = viewPropertyAnimator;
    }
}
