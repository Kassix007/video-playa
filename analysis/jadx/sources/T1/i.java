package T1;

import androidx.lifecycle.f0;
import androidx.lifecycle.k0;
import com.google.android.gms.internal.measurement.I1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import m5.AbstractC1362a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f7374b = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.f0
    public final void b() {
        LinkedHashMap linkedHashMap = this.f7374b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((k0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        I1.M(16);
        sb.append(AbstractC1362a.h(16, ((long) iIdentityHashCode) & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.f7374b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}
