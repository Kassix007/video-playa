package q2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: q2.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1493E extends AnimatorListenerAdapter implements InterfaceC1507l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f15916c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15918e;
    public boolean f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15917d = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1493E(View view, int i) {
        this.f15914a = view;
        this.f15915b = i;
        this.f15916c = (ViewGroup) view.getParent();
        g(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void a() {
        g(false);
        if (this.f) {
            return;
        }
        x.b(this.f15914a, this.f15915b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void b() {
        g(true);
        if (this.f) {
            return;
        }
        x.b(this.f15914a, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // q2.InterfaceC1507l
    public final void d(AbstractC1509n abstractC1509n) {
        abstractC1509n.x(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(boolean z5) {
        ViewGroup viewGroup;
        if (!this.f15917d || this.f15918e == z5 || (viewGroup = this.f15916c) == null) {
            return;
        }
        this.f15918e = z5;
        C3.a.T(viewGroup, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            x.b(this.f15914a, this.f15915b);
            ViewGroup viewGroup = this.f15916c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z5) {
        if (z5) {
            x.b(this.f15914a, 0);
            ViewGroup viewGroup = this.f15916c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z5) {
        if (z5) {
            return;
        }
        if (!this.f) {
            x.b(this.f15914a, this.f15915b);
            ViewGroup viewGroup = this.f15916c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        g(false);
    }

    @Override // q2.InterfaceC1507l
    public final void e(AbstractC1509n abstractC1509n) {
    }

    @Override // q2.InterfaceC1507l
    public final void f(AbstractC1509n abstractC1509n) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
