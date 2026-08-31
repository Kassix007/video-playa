package T1;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f7433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7434b;

    public abstract p a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h b() {
        h hVar = this.f7433a;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void d(List list, w wVar) {
        I5.f fVar = new I5.f(new I5.g(new I5.p(new I5.n(1, list), new J5.i(4, this, wVar), 1), new I5.m(1), 0));
        while (fVar.hasNext()) {
            b().f((d) fVar.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void e(d dVar, boolean z5) {
        List list = (List) b().f7371e.f6338q.getValue();
        if (!list.contains(dVar)) {
            throw new IllegalStateException(("popBackStack was called with " + dVar + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        d dVar2 = null;
        while (f()) {
            dVar2 = (d) listIterator.previous();
            if (kotlin.jvm.internal.m.a(dVar2, dVar)) {
                break;
            }
        }
        if (dVar2 != null) {
            b().d(dVar2, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean f() {
        return true;
    }

    public p c(p pVar) {
        return pVar;
    }
}
