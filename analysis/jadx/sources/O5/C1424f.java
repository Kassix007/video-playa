package o5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import n5.AbstractC1404g;

/* JADX INFO: renamed from: o5.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424f extends AbstractC1404g {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f15463q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1423e f15464r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1424f(C1423e c1423e, int i) {
        this.f15463q = i;
        this.f15464r = c1423e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f15463q) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        switch (this.f15463q) {
            case 0:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f15463q) {
            case 0:
                this.f15464r.clear();
                break;
            default:
                this.f15464r.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f15463q) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                return this.f15464r.f(element);
            default:
                return this.f15464r.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        switch (this.f15463q) {
            case 0:
                m.e(elements, "elements");
                return this.f15464r.e(elements);
            default:
                return super.containsAll(elements);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1404g
    public final int d() {
        switch (this.f15463q) {
        }
        return this.f15464r.f15461y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f15463q) {
        }
        return this.f15464r.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f15463q) {
            case 0:
                C1423e c1423e = this.f15464r;
                c1423e.getClass();
                return new C1421c(c1423e, 0);
            default:
                C1423e c1423e2 = this.f15464r;
                c1423e2.getClass();
                return new C1421c(c1423e2, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f15463q) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry element = (Map.Entry) obj;
                    m.e(element, "element");
                    C1423e c1423e = this.f15464r;
                    c1423e.getClass();
                    c1423e.c();
                    int iH = c1423e.h(element.getKey());
                    if (iH >= 0) {
                        Object[] objArr = c1423e.f15454r;
                        m.b(objArr);
                        if (m.a(objArr[iH], element.getValue())) {
                            c1423e.l(iH);
                            break;
                        }
                    }
                }
                break;
            default:
                C1423e c1423e2 = this.f15464r;
                c1423e2.c();
                int iH2 = c1423e2.h(obj);
                if (iH2 >= 0) {
                    c1423e2.l(iH2);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        switch (this.f15463q) {
            case 0:
                m.e(elements, "elements");
                this.f15464r.c();
                break;
            default:
                m.e(elements, "elements");
                this.f15464r.c();
                break;
        }
        return super.removeAll(elements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        switch (this.f15463q) {
            case 0:
                m.e(elements, "elements");
                this.f15464r.c();
                break;
            default:
                m.e(elements, "elements");
                this.f15464r.c();
                break;
        }
        return super.retainAll(elements);
    }
}
