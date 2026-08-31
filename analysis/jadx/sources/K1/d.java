package K1;

import J1.AbstractComponentCallbacksC0185q;
import J1.H;
import android.util.Log;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f2857a = c.f2856a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static c a(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q) {
        while (abstractComponentCallbacksC0185q != null) {
            if (abstractComponentCallbacksC0185q.f2691I != null && abstractComponentCallbacksC0185q.f2683A) {
                abstractComponentCallbacksC0185q.k();
            }
            abstractComponentCallbacksC0185q = abstractComponentCallbacksC0185q.f2693K;
        }
        return f2857a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(a aVar) {
        if (H.F(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f2851q.getClass().getName()), aVar);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(AbstractComponentCallbacksC0185q abstractComponentCallbacksC0185q, String previousFragmentId) {
        m.e(previousFragmentId, "previousFragmentId");
        b(new a(abstractComponentCallbacksC0185q, "Attempting to reuse fragment " + abstractComponentCallbacksC0185q + " with previous ID " + previousFragmentId));
        a(abstractComponentCallbacksC0185q).getClass();
    }
}
