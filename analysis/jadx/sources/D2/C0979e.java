package d2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: d2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0979e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0980f f12097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f12098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f12099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0982h f12100e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0979e(C0982h c0982h, C0980f c0980f, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f12096a = i;
        this.f12100e = c0982h;
        this.f12097b = c0980f;
        this.f12098c = viewPropertyAnimator;
        this.f12099d = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f12096a) {
            case 0:
                this.f12098c.setListener(null);
                View view = this.f12099d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0980f c0980f = this.f12097b;
                AbstractC0974V abstractC0974V = c0980f.f12106a;
                C0982h c0982h = this.f12100e;
                c0982h.c(abstractC0974V);
                c0982h.f12130r.remove(c0980f.f12106a);
                c0982h.i();
                break;
            default:
                this.f12098c.setListener(null);
                View view2 = this.f12099d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0980f c0980f2 = this.f12097b;
                AbstractC0974V abstractC0974V2 = c0980f2.f12107b;
                C0982h c0982h2 = this.f12100e;
                c0982h2.c(abstractC0974V2);
                c0982h2.f12130r.remove(c0980f2.f12107b);
                c0982h2.i();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f12096a) {
            case 0:
                AbstractC0974V abstractC0974V = this.f12097b.f12106a;
                this.f12100e.getClass();
                break;
            default:
                AbstractC0974V abstractC0974V2 = this.f12097b.f12107b;
                this.f12100e.getClass();
                break;
        }
    }
}
