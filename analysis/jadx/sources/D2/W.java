package d2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import i1.C1134a;
import java.util.WeakHashMap;
import w1.C1839b;

/* JADX INFO: loaded from: classes.dex */
public final class W extends C1839b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X f12047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f12048e = new WeakHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public W(X x6) {
        this.f12047d = x6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        return c1839b != null ? c1839b.a(view, accessibilityEvent) : this.f18187a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final C1134a b(View view) {
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        return c1839b != null ? c1839b.b(view) : super.b(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        if (c1839b != null) {
            c1839b.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void d(View view, x1.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f18345a;
        X x6 = this.f12047d;
        RecyclerView recyclerView = x6.f12049d;
        RecyclerView recyclerView2 = x6.f12049d;
        boolean zK = recyclerView.K();
        View.AccessibilityDelegate accessibilityDelegate = this.f18187a;
        if (zK || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().U(view, eVar);
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        if (c1839b != null) {
            c1839b.d(view, eVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        if (c1839b != null) {
            c1839b.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1839b c1839b = (C1839b) this.f12048e.get(viewGroup);
        return c1839b != null ? c1839b.f(viewGroup, view, accessibilityEvent) : this.f18187a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final boolean g(View view, int i, Bundle bundle) {
        X x6 = this.f12047d;
        RecyclerView recyclerView = x6.f12049d;
        RecyclerView recyclerView2 = x6.f12049d;
        if (recyclerView.K() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        if (c1839b != null) {
            if (c1839b.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        C0966M c0966m = recyclerView2.getLayoutManager().f11978b.f9650r;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void h(View view, int i) {
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        if (c1839b != null) {
            c1839b.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // w1.C1839b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        C1839b c1839b = (C1839b) this.f12048e.get(view);
        if (c1839b != null) {
            c1839b.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
