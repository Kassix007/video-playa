package m;

import android.widget.AbsListView;

/* JADX INFO: renamed from: m.A0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1244A0 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1248C0 f14616a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1244A0(C1248C0 c1248c0) {
        this.f14616a = c1248c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C1248C0 c1248c0 = this.f14616a;
        RunnableC1343y0 runnableC1343y0 = c1248c0.f14628H;
        if (i != 1 || c1248c0.f14636P.getInputMethodMode() == 2 || c1248c0.f14636P.getContentView() == null) {
            return;
        }
        c1248c0.f14632L.removeCallbacks(runnableC1343y0);
        runnableC1343y0.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i7, int i8) {
    }
}
