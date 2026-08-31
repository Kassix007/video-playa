package X3;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import w1.AbstractC1835K;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends i1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f8168a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // i1.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f8168a == null) {
            this.f8168a = new b(view);
        }
        b bVar = this.f8168a;
        View view2 = bVar.f8170r;
        bVar.f8169q = view2.getTop();
        bVar.f8171s = view2.getLeft();
        b bVar2 = this.f8168a;
        View view3 = bVar2.f8170r;
        int top = 0 - (view3.getTop() - bVar2.f8169q);
        WeakHashMap weakHashMap = AbstractC1835K.f18149a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f8171s));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}
