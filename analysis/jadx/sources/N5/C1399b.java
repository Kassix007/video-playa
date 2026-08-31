package n5;

import C0.S;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C1193b;

/* JADX INFO: renamed from: n5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1399b extends C1193b implements ListIterator {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC1401d f15288t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399b(AbstractC1401d abstractC1401d, int i) {
        super(5, abstractC1401d);
        this.f15288t = abstractC1401d;
        int iD = abstractC1401d.d();
        if (i < 0 || i > iD) {
            throw new IndexOutOfBoundsException(S.j(i, iD, "index: ", ", size: "));
        }
        this.f14257r = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14257r > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14257r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f14257r - 1;
        this.f14257r = i;
        return this.f15288t.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14257r - 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
