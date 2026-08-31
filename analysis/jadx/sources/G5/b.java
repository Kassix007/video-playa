package G5;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable, C5.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f2017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2019s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(int i, int i7, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f2017q = i;
        this.f2018r = AbstractC0836n2.v(i, i7, i8);
        this.f2019s = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.f2017q == bVar.f2017q && this.f2018r == bVar.f2018r && this.f2019s == bVar.f2019s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2017q * 31) + this.f2018r) * 31) + this.f2019s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isEmpty() {
        int i = this.f2019s;
        int i7 = this.f2018r;
        int i8 = this.f2017q;
        return i > 0 ? i8 > i7 : i8 < i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.f2017q, this.f2018r, this.f2019s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb;
        int i = this.f2018r;
        int i7 = this.f2017q;
        int i8 = this.f2019s;
        if (i8 > 0) {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i7);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i8);
        }
        return sb.toString();
    }
}
