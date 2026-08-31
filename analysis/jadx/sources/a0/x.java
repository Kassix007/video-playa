package a0;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class x implements ListIterator, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8710q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f8711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8712s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(n5.z zVar, int i) {
        this.f8712s = zVar;
        List list = zVar.f15304q;
        if (i >= 0 && i <= zVar.d()) {
            this.f8711r = list.listIterator(zVar.d() - i);
            return;
        }
        StringBuilder sbL = k1.i.l("Position index ", " must be in range [", i);
        sbL.append(new G5.d(0, zVar.d(), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f8710q) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8710q) {
            case 0:
                return ((kotlin.jvm.internal.w) this.f8711r).f14266q < ((y) this.f8712s).f8716t - 1;
            default:
                return ((ListIterator) this.f8711r).hasPrevious();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f8710q) {
            case 0:
                return ((kotlin.jvm.internal.w) this.f8711r).f14266q >= 0;
            default:
                return ((ListIterator) this.f8711r).hasNext();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8710q) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f8711r;
                int i = wVar.f14266q + 1;
                y yVar = (y) this.f8712s;
                r.a(i, yVar.f8716t);
                wVar.f14266q = i;
                return yVar.get(i);
            default:
                return ((ListIterator) this.f8711r).previous();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f8710q) {
            case 0:
                return ((kotlin.jvm.internal.w) this.f8711r).f14266q + 1;
            default:
                n5.z zVar = (n5.z) this.f8712s;
                return AbstractC0836n2.u(zVar) - ((ListIterator) this.f8711r).previousIndex();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8710q) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f8711r;
                int i = wVar.f14266q;
                y yVar = (y) this.f8712s;
                r.a(i, yVar.f8716t);
                wVar.f14266q = i - 1;
                return yVar.get(i);
            default:
                return ((ListIterator) this.f8711r).next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f8710q) {
            case 0:
                return ((kotlin.jvm.internal.w) this.f8711r).f14266q;
            default:
                n5.z zVar = (n5.z) this.f8712s;
                return AbstractC0836n2.u(zVar) - ((ListIterator) this.f8711r).nextIndex();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f8710q) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f8710q) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(kotlin.jvm.internal.w wVar, y yVar) {
        this.f8711r = wVar;
        this.f8712s = yVar;
    }
}
