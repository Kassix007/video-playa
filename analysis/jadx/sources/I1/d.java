package i1;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.web2native.MainActivity;
import kotlin.jvm.internal.m;
import t1.AbstractC1614a;
import t1.C1615b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f13536q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f13537r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d(C1615b c1615b, MainActivity mainActivity) {
        this.f13537r = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        switch (this.f13536q) {
            case 0:
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = ((CoordinatorLayout) this.f13537r).f9408G;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
                break;
            default:
                if (c4.a.w(view2)) {
                    SplashScreenView child = c4.a.o(view2);
                    m.e(child, "child");
                    WindowInsets windowInsetsBuild = AbstractC1614a.h().build();
                    m.d(windowInsetsBuild, "Builder().build()");
                    Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
                    if (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                        rect.isEmpty();
                    }
                    ((ViewGroup) ((MainActivity) this.f13537r).getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        switch (this.f13536q) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f13537r;
                coordinatorLayout.p(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f9408G;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
                break;
        }
    }

    public d(CoordinatorLayout coordinatorLayout) {
        this.f13537r = coordinatorLayout;
    }

    private final void a(View view, View view2) {
    }
}
