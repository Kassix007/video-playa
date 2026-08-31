package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import o.C1406b;
import o.C1407c;
import o.C1410f;

/* JADX INFO: loaded from: classes.dex */
public final class I extends J {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1410f f9495l = new C1410f();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.G
    public final void g() {
        Iterator it = this.f9495l.iterator();
        while (true) {
            C1406b c1406b = (C1406b) it;
            if (!c1406b.hasNext()) {
                return;
            }
            H h4 = (H) ((Map.Entry) c1406b.next()).getValue();
            h4.f9492q.f(h4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.G
    public final void h() {
        Iterator it = this.f9495l.iterator();
        while (true) {
            C1406b c1406b = (C1406b) it;
            if (!c1406b.hasNext()) {
                return;
            }
            H h4 = (H) ((Map.Entry) c1406b.next()).getValue();
            h4.f9492q.j(h4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(G g7, K k7) {
        Object obj;
        if (g7 == null) {
            throw new NullPointerException("source cannot be null");
        }
        H h4 = new H(g7, k7);
        C1410f c1410f = this.f9495l;
        C1407c c1407cD = c1410f.d(g7);
        if (c1407cD != null) {
            obj = c1407cD.f15311r;
        } else {
            C1407c c1407c = new C1407c(g7, h4);
            c1410f.f15320t++;
            C1407c c1407c2 = c1410f.f15318r;
            if (c1407c2 == null) {
                c1410f.f15317q = c1407c;
                c1410f.f15318r = c1407c;
            } else {
                c1407c2.f15312s = c1407c;
                c1407c.f15313t = c1407c2;
                c1410f.f15318r = c1407c;
            }
            obj = null;
        }
        H h7 = (H) obj;
        if (h7 != null && h7.f9493r != k7) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (h7 == null && this.f9487c > 0) {
            g7.f(h4);
        }
    }
}
