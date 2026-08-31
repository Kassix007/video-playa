package R;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class c implements List, C5.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f6671q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f6672r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6673s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c(List list, int i, int i7) {
        this.f6671q = list;
        this.f6672r = i;
        this.f6673s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f6673s;
        this.f6673s = i + 1;
        this.f6671q.add(i, obj);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        this.f6671q.addAll(i + this.f6672r, collection);
        int size = collection.size();
        this.f6673s += size;
        return size > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f6673s - 1;
        int i7 = this.f6672r;
        if (i7 <= i) {
            while (true) {
                this.f6671q.remove(i);
                if (i == i7) {
                    break;
                } else {
                    i--;
                }
            }
        }
        this.f6673s = i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f6673s;
        for (int i7 = this.f6672r; i7 < i; i7++) {
            if (m.a(this.f6671q.get(i7), obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i) {
        f.a(i, this);
        return this.f6671q.get(i + this.f6672r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f6673s;
        int i7 = this.f6672r;
        for (int i8 = i7; i8 < i; i8++) {
            if (m.a(this.f6671q.get(i8), obj)) {
                return i8 - i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f6673s == this.f6672r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f6673s - 1;
        int i7 = this.f6672r;
        if (i7 > i) {
            return -1;
        }
        while (!m.a(this.f6671q.get(i), obj)) {
            if (i == i7) {
                return -1;
            }
            i--;
        }
        return i - i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f6673s;
        for (int i7 = this.f6672r; i7 < i; i7++) {
            ?? r22 = this.f6671q;
            if (m.a(r22.get(i7), obj)) {
                r22.remove(i7);
                this.f6673s--;
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f6673s;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i != this.f6673s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f6673s;
        int i7 = i - 1;
        int i8 = this.f6672r;
        if (i8 <= i7) {
            while (true) {
                ?? r3 = this.f6671q;
                if (!collection.contains(r3.get(i7))) {
                    r3.remove(i7);
                    this.f6673s--;
                }
                if (i7 == i8) {
                    break;
                }
                i7--;
            }
        }
        return i != this.f6673s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        f.a(i, this);
        return this.f6671q.set(i + this.f6672r, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f6673s - this.f6672r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i7) {
        f.b(this, i, i7);
        return new c(this, i, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return l.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f6671q.add(i + this.f6672r, obj);
        this.f6673s++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return l.b(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f6671q.addAll(this.f6673s, collection);
        int size = collection.size();
        this.f6673s += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i) {
        f.a(i, this);
        this.f6673s--;
        return this.f6671q.remove(i + this.f6672r);
    }
}
