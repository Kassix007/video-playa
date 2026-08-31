package C0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: C0.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0068b0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ G0.d f992q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C0068b0(G0.d dVar) {
        this.f992q = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        G0.d dVar = this.f992q;
        synchronized (dVar) {
            dVar.f1976a.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        G0.d dVar = this.f992q;
        synchronized (dVar) {
            dVar.f1976a.c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        G0.d dVar = this.f992q;
        synchronized (dVar) {
            dVar.f1976a.c();
        }
    }
}
