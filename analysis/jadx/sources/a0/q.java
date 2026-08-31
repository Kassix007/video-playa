package a0;

import P.AbstractC0362j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class q implements u, List, RandomAccess, C5.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p f8689q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q() {
        AbstractC0606h abstractC0606hK = n.k();
        long jG = abstractC0606hK.g();
        T.i iVar = T.i.f7345r;
        p pVar = new p(jG, iVar);
        if (!(abstractC0606hK instanceof C0601c)) {
            pVar.f8709b = new p(1, iVar);
        }
        this.f8689q = pVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean i(p pVar, int i, T.c cVar, boolean z5) {
        boolean z6;
        synchronized (r.f8690a) {
            try {
                int i7 = pVar.f8687d;
                if (i7 == i) {
                    pVar.f8686c = cVar;
                    z6 = true;
                    if (z5) {
                        pVar.f8688e++;
                    }
                    pVar.f8687d = i7 + 1;
                } else {
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.c cVarH = cVar.h(obj);
            if (cVarH.equals(cVar)) {
                return false;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i, cVarH, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return l(new D.v(i, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC0606h abstractC0606hK;
        p pVar = this.f8689q;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (n.f8680b) {
            abstractC0606hK = n.k();
            p pVar2 = (p) n.w(pVar, this, abstractC0606hK);
            synchronized (r.f8690a) {
                pVar2.f8686c = T.i.f7345r;
                pVar2.f8687d++;
                pVar2.f8688e++;
            }
        }
        n.n(abstractC0606hK, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return j().f8686c.contains(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return j().f8686c.containsAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final w d() {
        return this.f8689q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        return j().f8686c.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // a0.u
    public final void h(w wVar) {
        wVar.f8709b = this.f8689q;
        this.f8689q = (p) wVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        return j().f8686c.indexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return j().f8686c.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p j() {
        p pVar = this.f8689q;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (p) n.t(pVar, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k() {
        p pVar = this.f8689q;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((p) n.i(pVar)).f8688e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l(B5.c cVar) {
        int i;
        T.c cVar2;
        Object objInvoke;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i = pVar2.f8687d;
                cVar2 = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar2);
            T.f fVarJ = cVar2.j();
            objInvoke = cVar.invoke(fVarJ);
            T.c cVarH = fVarJ.h();
            if (kotlin.jvm.internal.m.a(cVarH, cVar2)) {
                break;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i, cVarH, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return ((Boolean) objInvoke).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return j().f8686c.lastIndexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new B0.r(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object remove(int i) {
        int i7;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        Object obj = get(i);
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.c cVarL = cVar.l(i);
            if (cVarL.equals(cVar)) {
                break;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i7, cVarL, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.c cVarK = cVar.k(new T.b(0, collection));
            if (kotlin.jvm.internal.m.a(cVarK, cVar)) {
                return false;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i, cVarK, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return l(new T.b(2, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i7;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        Object obj2 = get(i);
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.c cVarM = cVar.m(i, obj);
            if (cVarM.equals(cVar)) {
                break;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i7, cVarM, false);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return j().f8686c.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i7) {
        if (!(i >= 0 && i <= i7 && i7 <= size())) {
            AbstractC0362j0.a("fromIndex or toIndex are out of bounds");
        }
        return new y(this, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        p pVar = this.f8689q;
        kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((p) n.i(pVar)).f8686c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.c cVarI = cVar.i(collection);
            if (kotlin.jvm.internal.m.a(cVarI, cVar)) {
                return false;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i, cVarI, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new B0.r(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i7;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i7 = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.c cVarG = cVar.g(i, obj);
            if (cVarG.equals(cVar)) {
                return;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i7, cVarG, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        do {
            synchronized (r.f8690a) {
                p pVar = this.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            int iIndexOf = cVar.indexOf(obj);
            T.c cVarL = iIndexOf != -1 ? cVar.l(iIndexOf) : cVar;
            if (cVarL.equals(cVar)) {
                return false;
            }
            p pVar3 = this.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = i((p) n.w(pVar3, this, abstractC0606hK), i, cVarL, true);
            }
            n.n(abstractC0606hK, this);
        } while (!zI);
        return true;
    }
}
