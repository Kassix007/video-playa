package J1;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import w1.ViewTreeObserverOnPreDrawListenerC1852o;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ViewGroup f2739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f2740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f2741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2743u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f2743u = true;
        this.f2739q = viewGroup;
        this.f2740r = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f2743u = true;
        if (this.f2741s) {
            return !this.f2742t;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f2741s = true;
            ViewTreeObserverOnPreDrawListenerC1852o.a(this.f2739q, this);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z5 = this.f2741s;
        ViewGroup viewGroup = this.f2739q;
        if (z5 || !this.f2743u) {
            viewGroup.endViewTransition(this.f2740r);
            this.f2742t = true;
        } else {
            this.f2743u = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f2743u = true;
        if (this.f2741s) {
            return !this.f2742t;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f2741s = true;
            ViewTreeObserverOnPreDrawListenerC1852o.a(this.f2739q, this);
        }
        return true;
    }
}
