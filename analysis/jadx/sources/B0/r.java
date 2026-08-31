package B0;

import c0.AbstractC0724l;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import o5.C1419a;
import o5.C1420b;
import r.C1544C;

/* JADX INFO: loaded from: classes.dex */
public final class r implements ListIterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f507u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(C0054t c0054t, int i, int i7) {
        this(c0054t, (i7 & 1) != 0 ? 0 : i, 0, c0054t.f513q.f16115b);
        this.f503q = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void a() {
        if (((AbstractList) ((C1419a) this.f507u).f15440u).modCount != this.f506t) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f503q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                c();
                a0.q qVar = (a0.q) this.f507u;
                qVar.add(this.f504r + 1, obj);
                this.f505s = -1;
                this.f504r++;
                this.f506t = qVar.k();
                return;
            case 2:
                a();
                C1419a c1419a = (C1419a) this.f507u;
                int i = this.f504r;
                this.f504r = i + 1;
                c1419a.add(i, obj);
                this.f505s = -1;
                this.f506t = ((AbstractList) c1419a).modCount;
                return;
            default:
                b();
                C1420b c1420b = (C1420b) this.f507u;
                int i7 = this.f504r;
                this.f504r = i7 + 1;
                c1420b.add(i7, obj);
                this.f505s = -1;
                this.f506t = ((AbstractList) c1420b).modCount;
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void b() {
        if (((AbstractList) ((C1420b) this.f507u)).modCount != this.f506t) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void c() {
        if (((a0.q) this.f507u).k() != this.f506t) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f503q) {
            case 0:
                return this.f504r < this.f506t;
            case 1:
                return this.f504r < ((a0.q) this.f507u).size() - 1;
            case 2:
                return this.f504r < ((C1419a) this.f507u).f15438s;
            default:
                return this.f504r < ((C1420b) this.f507u).f15443r;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f503q) {
            case 0:
                if (this.f504r > this.f505s) {
                }
                break;
            case 1:
                if (this.f504r >= 0) {
                }
                break;
            case 2:
                if (this.f504r > 0) {
                }
                break;
            default:
                if (this.f504r > 0) {
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f503q) {
            case 0:
                C1544C c1544c = ((C0054t) this.f507u).f513q;
                int i = this.f504r;
                this.f504r = i + 1;
                Object objE = c1544c.e(i);
                kotlin.jvm.internal.m.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC0724l) objE;
            case 1:
                c();
                int i7 = this.f504r + 1;
                this.f505s = i7;
                a0.q qVar = (a0.q) this.f507u;
                a0.r.a(i7, qVar.size());
                Object obj = qVar.get(i7);
                this.f504r = i7;
                return obj;
            case 2:
                a();
                int i8 = this.f504r;
                C1419a c1419a = (C1419a) this.f507u;
                if (i8 >= c1419a.f15438s) {
                    throw new NoSuchElementException();
                }
                this.f504r = i8 + 1;
                this.f505s = i8;
                return c1419a.f15436q[c1419a.f15437r + i8];
            default:
                b();
                int i9 = this.f504r;
                C1420b c1420b = (C1420b) this.f507u;
                if (i9 >= c1420b.f15443r) {
                    throw new NoSuchElementException();
                }
                this.f504r = i9 + 1;
                this.f505s = i9;
                return c1420b.f15442q[i9];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f503q) {
        }
        return this.f504r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f503q) {
            case 0:
                C1544C c1544c = ((C0054t) this.f507u).f513q;
                int i = this.f504r - 1;
                this.f504r = i;
                Object objE = c1544c.e(i);
                kotlin.jvm.internal.m.c(objE, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                return (AbstractC0724l) objE;
            case 1:
                c();
                int i7 = this.f504r;
                a0.q qVar = (a0.q) this.f507u;
                a0.r.a(i7, qVar.size());
                int i8 = this.f504r;
                this.f505s = i8;
                this.f504r--;
                return qVar.get(i8);
            case 2:
                a();
                int i9 = this.f504r;
                if (i9 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i9 - 1;
                this.f504r = i10;
                this.f505s = i10;
                C1419a c1419a = (C1419a) this.f507u;
                return c1419a.f15436q[c1419a.f15437r + i10];
            default:
                b();
                int i11 = this.f504r;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f504r = i12;
                this.f505s = i12;
                return ((C1420b) this.f507u).f15442q[i12];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.f503q) {
            case 0:
                i = this.f504r - this.f505s;
                break;
            case 1:
                return this.f504r;
            case 2:
                i = this.f504r;
                break;
            default:
                i = this.f504r;
                break;
        }
        return i - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f503q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                c();
                a0.q qVar = (a0.q) this.f507u;
                qVar.remove(this.f504r);
                this.f504r--;
                this.f505s = -1;
                this.f506t = qVar.k();
                return;
            case 2:
                C1419a c1419a = (C1419a) this.f507u;
                a();
                int i = this.f505s;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1419a.g(i);
                this.f504r = this.f505s;
                this.f505s = -1;
                this.f506t = ((AbstractList) c1419a).modCount;
                return;
            default:
                C1420b c1420b = (C1420b) this.f507u;
                b();
                int i7 = this.f505s;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                c1420b.g(i7);
                this.f504r = this.f505s;
                this.f505s = -1;
                this.f506t = ((AbstractList) c1420b).modCount;
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f503q) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a0.q qVar = (a0.q) this.f507u;
                c();
                int i = this.f505s;
                if (i < 0) {
                    throw new IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                }
                qVar.set(i, obj);
                this.f506t = qVar.k();
                return;
            case 2:
                a();
                int i7 = this.f505s;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1419a) this.f507u).set(i7, obj);
                return;
            default:
                b();
                int i8 = this.f505s;
                if (i8 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((C1420b) this.f507u).set(i8, obj);
                return;
        }
    }

    public r(C1420b c1420b, int i) {
        this.f503q = 3;
        this.f507u = c1420b;
        this.f504r = i;
        this.f505s = -1;
        this.f506t = ((AbstractList) c1420b).modCount;
    }

    public r(C0054t c0054t, int i, int i7, int i8) {
        this.f503q = 0;
        this.f507u = c0054t;
        this.f504r = i;
        this.f505s = i7;
        this.f506t = i8;
    }

    public r(a0.q qVar, int i) {
        this.f503q = 1;
        this.f507u = qVar;
        this.f504r = i - 1;
        this.f505s = -1;
        this.f506t = qVar.k();
    }

    public r(C1419a c1419a, int i) {
        this.f503q = 2;
        this.f507u = c1419a;
        this.f504r = i;
        this.f505s = -1;
        this.f506t = ((AbstractList) c1419a).modCount;
    }
}
