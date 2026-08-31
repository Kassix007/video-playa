package U1;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@T1.y("dialog")
public final class r extends T1.z {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final T1.p a() {
        X.e eVar = e.f7548a;
        return new q(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final void d(List list, T1.w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b().f((T1.d) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final void e(T1.d dVar, boolean z5) {
        b().e(dVar, z5);
        int iN0 = n5.l.n0((Iterable) b().f.f6338q.getValue(), dVar);
        int i = 0;
        for (Object obj : (Iterable) b().f.f6338q.getValue()) {
            int i7 = i + 1;
            if (i < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            T1.d dVar2 = (T1.d) obj;
            if (i > iN0) {
                b().c(dVar2);
            }
            i = i7;
        }
    }
}
