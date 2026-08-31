package E;

import B0.G0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1486a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K f1487b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public I(K k7) {
        this.f1487b = k7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i) {
        long j = L.f1491a;
        K k7 = this.f1487b;
        G0 g02 = k7.f1490c;
        if (g02 == null) {
            return;
        }
        this.f1486a.add(new b0(g02, i, j, k7.f1489b));
    }
}
