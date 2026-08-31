package J1;

import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class K extends f0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J f2557h = new J(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2561e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2558b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2559c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2560d = new HashMap();
    public boolean f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2562g = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public K(boolean z5) {
        this.f2561e = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.f0
    public final void b() {
        if (H.F(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (H.F(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0185q);
        }
        d(abstractComponentCallbacksC0185q.f2722u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str) {
        HashMap map = this.f2559c;
        K k7 = (K) map.get(str);
        if (k7 != null) {
            k7.b();
            map.remove(str);
        }
        HashMap map2 = this.f2560d;
        k0 k0Var = (k0) map2.get(str);
        if (k0Var != null) {
            k0Var.a();
            map2.remove(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        if (this.f2562g) {
            if (H.F(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2558b.remove(abstractComponentCallbacksC0185q.f2722u) == null || !H.F(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0185q);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k7 = (K) obj;
            if (this.f2558b.equals(k7.f2558b) && this.f2559c.equals(k7.f2559c) && this.f2560d.equals(k7.f2560d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2560d.hashCode() + ((this.f2559c.hashCode() + (this.f2558b.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2558b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2559c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2560d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
