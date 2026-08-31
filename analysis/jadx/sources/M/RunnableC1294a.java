package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: renamed from: m.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1294a implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14749q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f14750r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1294a(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f14749q = i;
        this.f14750r = actionBarOverlayLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14749q) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f14750r;
                actionBarOverlayLayout.e();
                actionBarOverlayLayout.f9130M = actionBarOverlayLayout.f9139t.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f9131N);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f14750r;
                actionBarOverlayLayout2.e();
                actionBarOverlayLayout2.f9130M = actionBarOverlayLayout2.f9139t.animate().translationY(-actionBarOverlayLayout2.f9139t.getHeight()).setListener(actionBarOverlayLayout2.f9131N);
                break;
        }
    }
}
