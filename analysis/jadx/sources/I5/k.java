package I5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i Q(Iterator it) {
        kotlin.jvm.internal.m.e(it, "<this>");
        return new a(new n(0, it));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static i R(Object obj, B5.c cVar) {
        return obj == null ? e.f2425a : new g(new I2.d(2, obj), cVar, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List S(i iVar) {
        Iterator it = iVar.iterator();
        if (!it.hasNext()) {
            return s.f15299q;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0836n2.z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
