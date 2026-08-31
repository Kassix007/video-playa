package com.google.android.material.snackbar;

import I2.l;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import s.C1586b;
import u4.AbstractC1700c;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1586b f11594h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BaseTransientBottomBar$Behavior() {
        C1586b c1586b = new C1586b();
        this.f11360e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f11359d = 0;
        this.f11594h = c1586b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.behavior.SwipeDismissBehavior, i1.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f11594h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (l.f2364b == null) {
                    l.f2364b = new l();
                }
                synchronized (l.f2364b.f2365a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (l.f2364b == null) {
                l.f2364b = new l();
            }
            synchronized (l.f2364b.f2365a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f11594h.getClass();
        return view instanceof AbstractC1700c;
    }
}
