package E2;

import M5.C0247h;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f1693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f1694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f1695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0247h f1696t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k(f fVar, ViewTreeObserver viewTreeObserver, C0247h c0247h) {
        this.f1694r = fVar;
        this.f1695s = viewTreeObserver;
        this.f1696t = c0247h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f1694r;
        h hVarB = fVar.b();
        if (hVarB != null) {
            ViewTreeObserver viewTreeObserver = this.f1695s;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f1683q.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f1693q) {
                this.f1693q = true;
                this.f1696t.resumeWith(hVarB);
            }
        }
        return true;
    }
}
