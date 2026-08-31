package R4;

import android.view.View;
import android.webkit.WebView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public final class X1 extends o2.m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public W1 f6883e0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // o2.m
    public final boolean c() {
        W1 w12 = this.f6883e0;
        if (w12 == null) {
            View view = this.f15402q;
            return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
        }
        kotlin.jvm.internal.m.b(w12);
        try {
            WebView webView = ((C0468k1) ((k3.c) w12).f14120q).f7084k;
            return (webView != null ? webView.getScrollY() : 0) > 0;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setCanChildScrollUpCallback(W1 w12) {
        this.f6883e0 = w12;
    }
}
