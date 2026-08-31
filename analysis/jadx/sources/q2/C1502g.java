package q2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: q2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1502g extends AnimatorListenerAdapter implements InterfaceC1507l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15950b = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1502g(View view) {
        this.f15949a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void a() {
        View view = this.f15949a;
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? x.f16005a.x(view) : 0.0f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void b() {
        this.f15949a.setTag(R.id.transition_pause_alpha, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        x.f16005a.K(this.f15949a, 1.0f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.f15949a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.f15950b = true;
            view.setLayerType(2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        boolean z6 = this.f15950b;
        View view = this.f15949a;
        if (z6) {
            view.setLayerType(0, null);
        }
        if (z5) {
            return;
        }
        C1491C c1491c = x.f16005a;
        c1491c.K(view, 1.0f);
        c1491c.getClass();
    }

    @Override // q2.InterfaceC1507l
    public final void c(AbstractC1509n abstractC1509n) {
    }

    @Override // q2.InterfaceC1507l
    public final void d(AbstractC1509n abstractC1509n) {
    }

    @Override // q2.InterfaceC1507l
    public final void e(AbstractC1509n abstractC1509n) {
    }

    @Override // q2.InterfaceC1507l
    public final void f(AbstractC1509n abstractC1509n) {
    }
}
