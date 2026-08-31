package U1;

import P.C0345b;
import P.C0354f0;
import P5.S;
import androidx.lifecycle.EnumC0653p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
@T1.y("composable")
public final class i extends T1.z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0354f0 f7550c = C0345b.q(Boolean.FALSE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final T1.p a() {
        return new h(this, AbstractC0532c.f7546a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final void d(List list, T1.w wVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T1.d backStackEntry = (T1.d) it.next();
            T1.h hVarB = b();
            P5.D d5 = hVarB.f7371e;
            kotlin.jvm.internal.m.e(backStackEntry, "backStackEntry");
            S s6 = hVarB.f7369c;
            Iterable iterable = (Iterable) s6.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((T1.d) it2.next()) == backStackEntry) {
                        Iterable iterable2 = (Iterable) d5.f6338q.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((T1.d) it3.next()) == backStackEntry) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            T1.d dVar = (T1.d) n5.l.s0((List) d5.f6338q.getValue());
            if (dVar != null) {
                s6.h(null, AbstractC1397A.x((Set) s6.getValue(), dVar));
            }
            s6.h(null, AbstractC1397A.x((Set) s6.getValue(), backStackEntry));
            hVarB.f(backStackEntry);
        }
        this.f7550c.setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T1.z
    public final void e(T1.d dVar, boolean z5) {
        b().e(dVar, z5);
        this.f7550c.setValue(Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g(T1.d entry) {
        T1.h hVarB = b();
        kotlin.jvm.internal.m.e(entry, "entry");
        S s6 = hVarB.f7369c;
        s6.h(null, AbstractC1397A.x((Set) s6.getValue(), entry));
        W1.j jVar = hVarB.f7373h.f7418b;
        jVar.getClass();
        if (!jVar.f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.c(EnumC0653p.f9559t);
    }
}
