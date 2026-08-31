package J1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: J1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0173e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T f2641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f2643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0174f f2644d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AnimationAnimationListenerC0173e(T t6, ViewGroup viewGroup, View view, C0174f c0174f) {
        this.f2641a = t6;
        this.f2642b = viewGroup;
        this.f2643c = view;
        this.f2644d = c0174f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f2642b.post(new A1.b(3, this));
        if (H.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2641a + " has ended.");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (H.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f2641a + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
