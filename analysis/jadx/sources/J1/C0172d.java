package J1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: J1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0172d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f2637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f2639d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0174f f2640e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0172d(ViewGroup viewGroup, View view, boolean z5, T t6, C0174f c0174f) {
        this.f2636a = viewGroup;
        this.f2637b = view;
        this.f2638c = z5;
        this.f2639d = t6;
        this.f2640e = c0174f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f2636a;
        View view = this.f2637b;
        viewGroup.endViewTransition(view);
        boolean z5 = this.f2638c;
        T t6 = this.f2639d;
        if (z5) {
            C0.S.a(view, t6.f2598a);
        }
        this.f2640e.d();
        if (H.F(2)) {
            Log.v("FragmentManager", "Animator from operation " + t6 + " has ended.");
        }
    }
}
