package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC1201d;

/* JADX INFO: renamed from: m.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1263K implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC1201d f14674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1265L f14675r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1263K(C1265L c1265l, ViewTreeObserverOnGlobalLayoutListenerC1201d viewTreeObserverOnGlobalLayoutListenerC1201d) {
        this.f14675r = c1265l;
        this.f14674q = viewTreeObserverOnGlobalLayoutListenerC1201d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f14675r.f14680W.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f14674q);
        }
    }
}
