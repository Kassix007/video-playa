package m;

import android.view.View;
import l.InterfaceC1207j;
import l.MenuC1209l;

/* JADX INFO: renamed from: m.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1306g implements Runnable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1302e f14788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1312j f14789r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC1306g(C1312j c1312j, C1302e c1302e) {
        this.f14789r = c1312j;
        this.f14788q = c1302e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1207j interfaceC1207j;
        C1312j c1312j = this.f14789r;
        MenuC1209l menuC1209l = c1312j.f14812s;
        if (menuC1209l != null && (interfaceC1207j = menuC1209l.f14355e) != null) {
            interfaceC1207j.i(menuC1209l);
        }
        View view = (View) c1312j.f14817x;
        if (view != null && view.getWindowToken() != null) {
            C1302e c1302e = this.f14788q;
            if (c1302e.b()) {
                c1312j.f14804J = c1302e;
            } else if (c1302e.f14416e != null) {
                c1302e.d(0, 0, false, false);
                c1312j.f14804J = c1302e;
            }
        }
        c1312j.f14806L = null;
    }
}
