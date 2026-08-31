package C0;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: C0.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0066a0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Configuration f988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ G0.c f989r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ComponentCallbacks2C0066a0(Configuration configuration, G0.c cVar) {
        this.f988q = configuration;
        this.f989r = cVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f988q;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f989r.f1975a.entrySet().iterator();
        while (it.hasNext()) {
            G0.a aVar = (G0.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f1972b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f989r.f1975a.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.f989r.f1975a.clear();
    }
}
