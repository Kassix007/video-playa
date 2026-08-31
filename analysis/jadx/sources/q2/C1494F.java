package q2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.wnapp.smspariaz.R;

/* JADX INFO: renamed from: q2.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1494F extends AnimatorListenerAdapter implements InterfaceC1507l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f15919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f15920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15922d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1503h f15923e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1494F(C1503h c1503h, ViewGroup viewGroup, View view, View view2) {
        this.f15923e = c1503h;
        this.f15919a = viewGroup;
        this.f15920b = view;
        this.f15921c = view2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void d(AbstractC1509n abstractC1509n) {
        abstractC1509n.x(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void e(AbstractC1509n abstractC1509n) {
        if (this.f15922d) {
            g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        this.f15921c.setTag(R.id.save_overlay_view, null);
        this.f15919a.getOverlay().remove(this.f15920b);
        this.f15922d = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.f15919a.getOverlay().remove(this.f15920b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f15920b;
        if (view.getParent() == null) {
            this.f15919a.getOverlay().add(view);
        } else {
            this.f15923e.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            View view = this.f15921c;
            View view2 = this.f15920b;
            view.setTag(R.id.save_overlay_view, view2);
            this.f15919a.getOverlay().add(view2);
            this.f15922d = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        g();
    }

    @Override // q2.InterfaceC1507l
    public final void a() {
    }

    @Override // q2.InterfaceC1507l
    public final void b() {
    }

    @Override // q2.InterfaceC1507l
    public final void f(AbstractC1509n abstractC1509n) {
    }
}
