package com.google.android.material.behavior;

import C3.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.wnapp.smspariaz.R;
import i1.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k1.i;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f11352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f11353e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f11355h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11349a = new LinkedHashSet();
    public int f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11354g = 2;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public HideBottomViewOnScrollBehavior() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f11350b = a.M(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f11351c = a.M(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f11352d = a.N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, W3.a.f8111d);
        this.f11353e = a.N(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, W3.a.f8110c);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i7, int i8, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f11349a;
        if (i > 0) {
            if (this.f11354g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f11355h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f11354g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw i.h(it);
            }
            this.f11355h = view.animate().translationY(this.f).setInterpolator(this.f11353e).setDuration(this.f11351c).setListener(new Z3.a(0, this));
            return;
        }
        if (i >= 0 || this.f11354g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f11355h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f11354g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw i.h(it2);
        }
        this.f11355h = view.animate().translationY(0).setInterpolator(this.f11352d).setDuration(this.f11350b).setListener(new Z3.a(0, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public boolean o(View view, int i, int i7) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
