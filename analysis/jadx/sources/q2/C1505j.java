package q2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import r.C1554e;
import w1.U;
import w1.Z;

/* JADX INFO: renamed from: q2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1505j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15953a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15955c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1505j(View view, Z z5) {
        this.f15954b = z5;
        this.f15955c = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15953a) {
            case 0:
                ((C1554e) this.f15954b).remove(animator);
                ((AbstractC1509n) this.f15955c).f15973D.remove(animator);
                break;
            default:
                Z z5 = (Z) this.f15954b;
                z5.f18179a.d(1.0f);
                U.e((View) this.f15955c, z5);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f15953a) {
            case 0:
                ((AbstractC1509n) this.f15955c).f15973D.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1505j(AbstractC1509n abstractC1509n, C1554e c1554e) {
        this.f15955c = abstractC1509n;
        this.f15954b = c1554e;
    }
}
