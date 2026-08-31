package H4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a implements Set {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f2178s = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public transient d f2179r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int k(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static f l(int i, Object... objArr) {
        if (i == 0) {
            return n.f2202z;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new o(obj);
        }
        int iK = k(i);
        Object[] objArr2 = new Object[iK];
        int i7 = iK - 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                throw new NullPointerException(k1.i.i(i10, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iD = AbstractC1397A.D(iHashCode);
            while (true) {
                int i11 = iD & i7;
                Object obj3 = objArr2[i11];
                if (obj3 == null) {
                    objArr[i9] = obj2;
                    objArr2[i11] = obj2;
                    i8 += iHashCode;
                    i9++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iD++;
            }
        }
        Arrays.fill(objArr, i9, i, (Object) null);
        if (i9 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new o(obj4);
        }
        if (k(i9) < iK / 2) {
            return l(i9, objArr);
        }
        int length = objArr.length;
        if (i9 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i9);
        }
        return new n(i8, i7, i9, objArr, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof f) && (this instanceof n)) {
            f fVar = (f) obj;
            fVar.getClass();
            if ((fVar instanceof n) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d j() {
        d dVar = this.f2179r;
        if (dVar != null) {
            return dVar;
        }
        d dVarM = m();
        this.f2179r = dVarM;
        return dVarM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d m() {
        Object[] array = toArray(a.f2167q);
        b bVar = d.f2174r;
        return d.j(array.length, array);
    }
}
