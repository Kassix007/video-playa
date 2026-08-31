package m;

import androidx.appcompat.widget.Toolbar;
import l.C1211n;

/* JADX INFO: renamed from: m.R0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1277R0 implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f14707q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Toolbar f14708r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC1277R0(Toolbar toolbar, int i) {
        this.f14707q = i;
        this.f14708r = toolbar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14707q) {
            case 0:
                C1281T0 c1281t0 = this.f14708r.f9199e0;
                C1211n c1211n = c1281t0 == null ? null : c1281t0.f14710r;
                if (c1211n != null) {
                    c1211n.collapseActionView();
                }
                break;
            default:
                this.f14708r.n();
                break;
        }
    }
}
