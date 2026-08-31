package w1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class S implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f18160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f18161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o0 f18162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f18164e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public S(Z z5, o0 o0Var, o0 o0Var2, int i, View view) {
        this.f18160a = z5;
        this.f18161b = o0Var;
        this.f18162c = o0Var2;
        this.f18163d = i;
        this.f18164e = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        Z z5 = this.f18160a;
        z5.f18179a.d(animatedFraction);
        o0 o0Var = this.f18161b;
        l0 l0Var = o0Var.f18232a;
        float fB = z5.f18179a.b();
        PathInterpolator pathInterpolator = U.f18167e;
        int i = Build.VERSION.SDK_INT;
        e0 d0Var = i >= 34 ? new d0(o0Var) : i >= 30 ? new c0(o0Var) : i >= 29 ? new b0(o0Var) : new a0(o0Var);
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((this.f18163d & i7) == 0) {
                d0Var.c(i7, l0Var.g(i7));
            } else {
                n1.b bVarG = l0Var.g(i7);
                n1.b bVarG2 = this.f18162c.f18232a.g(i7);
                float f = 1.0f - fB;
                d0Var.c(i7, o0.e(bVarG, (int) (((double) ((bVarG.f15125a - bVarG2.f15125a) * f)) + 0.5d), (int) (((double) ((bVarG.f15126b - bVarG2.f15126b) * f)) + 0.5d), (int) (((double) ((bVarG.f15127c - bVarG2.f15127c) * f)) + 0.5d), (int) (((double) ((bVarG.f15128d - bVarG2.f15128d) * f)) + 0.5d)));
            }
        }
        U.g(this.f18164e, d0Var.b(), Collections.singletonList(z5));
    }
}
