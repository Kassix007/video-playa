package a0;

import P.AbstractC0362j0;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class y implements List, C5.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f8713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f8714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8716t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y(q qVar, int i, int i7) {
        this.f8713q = qVar;
        this.f8714r = i;
        this.f8715s = qVar.k();
        this.f8716t = i7 - i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        d();
        int i = this.f8714r + this.f8716t;
        q qVar = this.f8713q;
        qVar.add(i, obj);
        this.f8716t++;
        this.f8715s = qVar.k();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f8716t, collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        if (this.f8716t > 0) {
            d();
            q qVar = this.f8713q;
            int i7 = this.f8714r;
            int i8 = this.f8716t + i7;
            do {
                synchronized (r.f8690a) {
                    p pVar = qVar.f8689q;
                    kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    p pVar2 = (p) n.i(pVar);
                    i = pVar2.f8687d;
                    cVar = pVar2.f8686c;
                }
                kotlin.jvm.internal.m.b(cVar);
                T.f fVarJ = cVar.j();
                fVarJ.subList(i7, i8).clear();
                T.c cVarH = fVarJ.h();
                if (kotlin.jvm.internal.m.a(cVarH, cVar)) {
                    break;
                }
                p pVar3 = qVar.f8689q;
                kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                synchronized (n.f8680b) {
                    abstractC0606hK = n.k();
                    zI = q.i((p) n.w(pVar3, qVar, abstractC0606hK), i, cVarH, true);
                }
                n.n(abstractC0606hK, qVar);
            } while (!zI);
            this.f8716t = 0;
            this.f8715s = this.f8713q.k();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        if (this.f8713q.k() != this.f8715s) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        d();
        r.a(i, this.f8716t);
        return this.f8713q.get(this.f8714r + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        d();
        int i = this.f8716t;
        int i7 = this.f8714r;
        Iterator it = D5.a.O(i7, i + i7).iterator();
        while (it.hasNext()) {
            int iNextInt = ((n5.w) it).nextInt();
            if (kotlin.jvm.internal.m.a(obj, this.f8713q.get(iNextInt))) {
                return iNextInt - i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f8716t == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d();
        int i = this.f8716t;
        int i7 = this.f8714r;
        for (int i8 = (i + i7) - 1; i8 >= i7; i8--) {
            if (kotlin.jvm.internal.m.a(obj, this.f8713q.get(i8))) {
                return i8 - i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z5 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z5) {
                    z5 = true;
                }
            }
            return z5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        T.c cVar;
        AbstractC0606h abstractC0606hK;
        boolean zI;
        d();
        q qVar = this.f8713q;
        int i7 = this.f8714r;
        int i8 = this.f8716t + i7;
        int size = qVar.size();
        do {
            synchronized (r.f8690a) {
                p pVar = qVar.f8689q;
                kotlin.jvm.internal.m.c(pVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                p pVar2 = (p) n.i(pVar);
                i = pVar2.f8687d;
                cVar = pVar2.f8686c;
            }
            kotlin.jvm.internal.m.b(cVar);
            T.f fVarJ = cVar.j();
            fVarJ.subList(i7, i8).retainAll(collection);
            T.c cVarH = fVarJ.h();
            if (kotlin.jvm.internal.m.a(cVarH, cVar)) {
                break;
            }
            p pVar3 = qVar.f8689q;
            kotlin.jvm.internal.m.c(pVar3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (n.f8680b) {
                abstractC0606hK = n.k();
                zI = q.i((p) n.w(pVar3, qVar, abstractC0606hK), i, cVarH, true);
            }
            n.n(abstractC0606hK, qVar);
        } while (!zI);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.f8715s = this.f8713q.k();
            this.f8716t -= size2;
        }
        return size2 > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        r.a(i, this.f8716t);
        d();
        int i7 = i + this.f8714r;
        q qVar = this.f8713q;
        Object obj2 = qVar.set(i7, obj);
        this.f8715s = qVar.k();
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f8716t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i7) {
        if (!(i >= 0 && i <= i7 && i7 <= this.f8716t)) {
            AbstractC0362j0.a("fromIndex or toIndex are out of bounds");
        }
        d();
        int i8 = this.f8714r;
        return new y(this.f8713q, i + i8, i7 + i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        d();
        kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
        wVar.f14266q = i - 1;
        return new x(wVar, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        d();
        int i7 = i + this.f8714r;
        q qVar = this.f8713q;
        boolean zAddAll = qVar.addAll(i7, collection);
        if (zAddAll) {
            this.f8716t = collection.size() + this.f8716t;
            this.f8715s = qVar.k();
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object remove(int i) {
        d();
        int i7 = this.f8714r + i;
        q qVar = this.f8713q;
        Object objRemove = qVar.remove(i7);
        this.f8716t--;
        this.f8715s = qVar.k();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        d();
        int i7 = this.f8714r + i;
        q qVar = this.f8713q;
        qVar.add(i7, obj);
        this.f8716t++;
        this.f8715s = qVar.k();
    }
}
