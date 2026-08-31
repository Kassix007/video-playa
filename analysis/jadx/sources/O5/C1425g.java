package o5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import n5.AbstractC1404g;

/* JADX INFO: renamed from: o5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1425g extends AbstractC1404g implements Serializable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1425g f15465r;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1423e f15466q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C1423e c1423e = C1423e.f15449D;
        f15465r = new C1425g(C1423e.f15449D);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1425g(C1423e backing) {
        m.e(backing, "backing");
        this.f15466q = backing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f15466q.a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        this.f15466q.c();
        return super.addAll(elements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f15466q.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15466q.containsKey(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1404g
    public final int d() {
        return this.f15466q.f15461y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f15466q.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C1423e c1423e = this.f15466q;
        c1423e.getClass();
        return new C1421c(c1423e, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C1423e c1423e = this.f15466q;
        c1423e.c();
        int iH = c1423e.h(obj);
        if (iH < 0) {
            return false;
        }
        c1423e.l(iH);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        this.f15466q.c();
        return super.removeAll(elements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        this.f15466q.c();
        return super.retainAll(elements);
    }

    public C1425g() {
        this(new C1423e());
    }
}
