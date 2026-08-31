package r;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import s.AbstractC1585a;

/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int[] f16164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f16165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16166s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Q(int i) {
        this.f16164q = i == 0 ? AbstractC1585a.f16411a : new int[i];
        this.f16165r = i == 0 ? AbstractC1585a.f16413c : new Object[i << 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(Object obj) {
        int i = this.f16166s * 2;
        Object[] objArr = this.f16165r;
        if (obj == null) {
            for (int i7 = 1; i7 < i; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i) {
        int i7 = this.f16166s;
        int[] iArr = this.f16164q;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f16164q = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16165r, i * 2);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f16165r = objArrCopyOf;
        }
        if (this.f16166s != i7) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int c(int i, Object obj) {
        int i7 = this.f16166s;
        if (i7 == 0) {
            return -1;
        }
        int iA = AbstractC1585a.a(i7, i, this.f16164q);
        if (iA < 0 || kotlin.jvm.internal.m.a(obj, this.f16165r[iA << 1])) {
            return iA;
        }
        int i8 = iA + 1;
        while (i8 < i7 && this.f16164q[i8] == i) {
            if (kotlin.jvm.internal.m.a(obj, this.f16165r[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = iA - 1; i9 >= 0 && this.f16164q[i9] == i; i9--) {
            if (kotlin.jvm.internal.m.a(obj, this.f16165r[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clear() {
        if (this.f16166s > 0) {
            this.f16164q = AbstractC1585a.f16411a;
            this.f16165r = AbstractC1585a.f16413c;
            this.f16166s = 0;
        }
        if (this.f16166s > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsKey(Object obj) {
        return d(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int d(Object obj) {
        return obj == null ? e() : c(obj.hashCode(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int e() {
        int i = this.f16166s;
        if (i == 0) {
            return -1;
        }
        int iA = AbstractC1585a.a(i, 0, this.f16164q);
        if (iA < 0 || this.f16165r[iA << 1] == null) {
            return iA;
        }
        int i7 = iA + 1;
        while (i7 < i && this.f16164q[i7] == 0) {
            if (this.f16165r[i7 << 1] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = iA - 1; i8 >= 0 && this.f16164q[i8] == 0; i8--) {
            if (this.f16165r[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof Q) {
                int i = this.f16166s;
                if (i != ((Q) obj).f16166s) {
                    return false;
                }
                Q q7 = (Q) obj;
                for (int i7 = 0; i7 < i; i7++) {
                    Object objF = f(i7);
                    Object objI = i(i7);
                    Object obj2 = q7.get(objF);
                    if (objI == null) {
                        if (obj2 != null || !q7.containsKey(objF)) {
                            return false;
                        }
                    } else if (!objI.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f16166s != ((Map) obj).size()) {
                return false;
            }
            int i8 = this.f16166s;
            for (int i9 = 0; i9 < i8; i9++) {
                Object objF2 = f(i9);
                Object objI2 = i(i9);
                Object obj3 = ((Map) obj).get(objF2);
                if (objI2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objF2)) {
                        return false;
                    }
                } else if (!objI2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object f(int i) {
        boolean z5 = false;
        if (i >= 0 && i < this.f16166s) {
            z5 = true;
        }
        if (z5) {
            return this.f16165r[i << 1];
        }
        AbstractC1585a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(int i) {
        int i7;
        if (i < 0 || i >= (i7 = this.f16166s)) {
            AbstractC1585a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f16165r;
        int i8 = i << 1;
        Object obj = objArr[i8 + 1];
        if (i7 <= 1) {
            clear();
            return obj;
        }
        int i9 = i7 - 1;
        int[] iArr = this.f16164q;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i < i9) {
                int i10 = i + 1;
                n5.k.C0(i, i10, i7, iArr, iArr);
                Object[] objArr2 = this.f16165r;
                n5.k.D0(i8, i10 << 1, i7 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f16165r;
            int i11 = i9 << 1;
            objArr3[i11] = null;
            objArr3[i11 + 1] = null;
        } else {
            int i12 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f16164q = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16165r, i12 << 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f16165r = objArrCopyOf;
            if (i7 != this.f16166s) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                n5.k.C0(0, 0, i, iArr, this.f16164q);
                n5.k.D0(0, 0, i8, objArr, this.f16165r);
            }
            if (i < i9) {
                int i13 = i + 1;
                n5.k.C0(i, i13, i7, iArr, this.f16164q);
                n5.k.D0(i8, i13 << 1, i7 << 1, objArr, this.f16165r);
            }
        }
        if (i7 != this.f16166s) {
            throw new ConcurrentModificationException();
        }
        this.f16166s = i9;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f16165r[(iD << 1) + 1];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getOrDefault(Object obj, Object obj2) {
        int iD = d(obj);
        return iD >= 0 ? this.f16165r[(iD << 1) + 1] : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object h(int i, Object obj) {
        boolean z5 = false;
        if (i >= 0 && i < this.f16166s) {
            z5 = true;
        }
        if (!z5) {
            AbstractC1585a.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i7 = (i << 1) + 1;
        Object[] objArr = this.f16165r;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f16164q;
        Object[] objArr = this.f16165r;
        int i = this.f16166s;
        int i7 = 1;
        int i8 = 0;
        int iHashCode = 0;
        while (i8 < i) {
            Object obj = objArr[i7];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object i(int i) {
        boolean z5 = false;
        if (i >= 0 && i < this.f16166s) {
            z5 = true;
        }
        if (z5) {
            return this.f16165r[(i << 1) + 1];
        }
        AbstractC1585a.c("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f16166s <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object put(Object obj, Object obj2) {
        int i = this.f16166s;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iC = obj != null ? c(iHashCode, obj) : e();
        if (iC >= 0) {
            int i7 = (iC << 1) + 1;
            Object[] objArr = this.f16165r;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~iC;
        int[] iArr = this.f16164q;
        if (i >= iArr.length) {
            int i9 = 8;
            if (i >= 8) {
                i9 = (i >> 1) + i;
            } else if (i < 4) {
                i9 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i9);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f16164q = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f16165r, i9 << 1);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            this.f16165r = objArrCopyOf;
            if (i != this.f16166s) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i) {
            int[] iArr2 = this.f16164q;
            int i10 = i8 + 1;
            n5.k.C0(i10, i8, i, iArr2, iArr2);
            Object[] objArr2 = this.f16165r;
            n5.k.D0(i10 << 1, i8 << 1, this.f16166s << 1, objArr2, objArr2);
        }
        int i11 = this.f16166s;
        if (i == i11) {
            int[] iArr3 = this.f16164q;
            if (i8 < iArr3.length) {
                iArr3[i8] = iHashCode;
                Object[] objArr3 = this.f16165r;
                int i12 = i8 << 1;
                objArr3[i12] = obj;
                objArr3[i12 + 1] = obj2;
                this.f16166s = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object remove(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return g(iD);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object replace(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD >= 0) {
            return h(iD, obj2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f16166s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16166s * 28);
        sb.append('{');
        int i = this.f16166s;
        for (int i7 = 0; i7 < i; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object objF = f(i7);
            if (objF != sb) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objI = i(i7);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iD = d(obj);
        if (iD < 0 || !kotlin.jvm.internal.m.a(obj2, i(iD))) {
            return false;
        }
        g(iD);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iD = d(obj);
        if (iD < 0 || !kotlin.jvm.internal.m.a(obj2, i(iD))) {
            return false;
        }
        h(iD, obj3);
        return true;
    }
}
