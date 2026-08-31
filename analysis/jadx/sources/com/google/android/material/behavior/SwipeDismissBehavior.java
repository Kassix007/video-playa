package com.google.android.material.behavior;

import D1.d;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import i1.b;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f11356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11359d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11360e = 0.0f;
    public float f = 0.5f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Z3.b f11361g = new Z3.b(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zO = this.f11357b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zO = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11357b = zO;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11357b = false;
        }
        if (zO) {
            if (this.f11356a == null) {
                this.f11356a = new d(coordinatorLayout.getContext(), coordinatorLayout, this.f11361g);
            }
            if (!this.f11358c && this.f11356a.p(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            AbstractC1835K.j(view, 1048576);
            AbstractC1835K.h(view, 0);
            if (r(view)) {
                AbstractC1835K.k(view, x1.d.f18335l, new k3.d(19, this));
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f11356a == null) {
            return false;
        }
        if (this.f11358c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f11356a.j(motionEvent);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean r(View view) {
        return true;
    }
}
