package E2;

import android.view.ViewTreeObserver;
import m5.C1386y;

/* JADX INFO: loaded from: classes.dex */
public final class j implements B5.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f1690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f1691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f1692s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public j(f fVar, ViewTreeObserver viewTreeObserver, k kVar) {
        this.f1690q = fVar;
        this.f1691r = viewTreeObserver;
        this.f1692s = kVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // B5.c
    public final Object invoke(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f1691r;
        boolean zIsAlive = viewTreeObserver.isAlive();
        k kVar = this.f1692s;
        if (zIsAlive) {
            viewTreeObserver.removeOnPreDrawListener(kVar);
        } else {
            this.f1690q.f1683q.getViewTreeObserver().removeOnPreDrawListener(kVar);
        }
        return C1386y.f15098a;
    }
}
