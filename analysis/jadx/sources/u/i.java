package U;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import o5.C1421c;
import o5.C1423e;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractCollection implements Collection, C5.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7506q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f7507r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ i(int i, Object obj) {
        this.f7506q = i;
        this.f7507r = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f7506q) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.f7506q) {
            case 1:
                kotlin.jvm.internal.m.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f7506q) {
            case 0:
                ((X.h) this.f7507r).clear();
                break;
            default:
                ((C1423e) this.f7507r).clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f7506q) {
            case 0:
                return ((X.h) this.f7507r).containsValue(obj);
            default:
                return ((C1423e) this.f7507r).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f7506q) {
            case 1:
                return ((C1423e) this.f7507r).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f7506q) {
            case 0:
                X.h hVar = (X.h) this.f7507r;
                n[] nVarArr = new n[8];
                for (int i = 0; i < 8; i++) {
                    nVarArr[i] = new o(2);
                }
                return new h(hVar, nVarArr);
            default:
                C1423e c1423e = (C1423e) this.f7507r;
                c1423e.getClass();
                return new C1421c(c1423e, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f7506q) {
            case 1:
                C1423e c1423e = (C1423e) this.f7507r;
                c1423e.c();
                int i = c1423e.i(obj);
                if (i < 0) {
                    return false;
                }
                c1423e.l(i);
                return true;
            default:
                return super.remove(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.f7506q) {
            case 1:
                kotlin.jvm.internal.m.e(elements, "elements");
                ((C1423e) this.f7507r).c();
                break;
        }
        return super.removeAll(elements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.f7506q) {
            case 1:
                kotlin.jvm.internal.m.e(elements, "elements");
                ((C1423e) this.f7507r).c();
                break;
        }
        return super.retainAll(elements);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f7506q) {
            case 0:
                X.h hVar = (X.h) this.f7507r;
                hVar.getClass();
                return hVar.f8146u;
            default:
                return ((C1423e) this.f7507r).f15461y;
        }
    }
}
