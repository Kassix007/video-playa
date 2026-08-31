package n5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC1401d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f15304q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z(List list) {
        this.f15304q = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f15304q.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        if (i >= 0 && i <= AbstractC0836n2.u(this)) {
            return this.f15304q.get(AbstractC0836n2.u(this) - i);
        }
        StringBuilder sbL = k1.i.l("Element index ", " must be in range [", i);
        sbL.append(new G5.d(0, AbstractC0836n2.u(this), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new a0.x(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final ListIterator listIterator() {
        return new a0.x(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // n5.AbstractC1401d, java.util.List
    public final ListIterator listIterator(int i) {
        return new a0.x(this, i);
    }
}
