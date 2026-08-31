package H4;

import java.util.Iterator;
import n5.AbstractC1397A;

/* JADX INFO: loaded from: classes.dex */
public final class n extends f {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Object[] f2201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final n f2202z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient Object[] f2203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final transient int f2204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f2205v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f2206w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient int f2207x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object[] objArr = new Object[0];
        f2201y = objArr;
        f2202z = new n(0, 0, 0, objArr, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n(int i, int i7, int i8, Object[] objArr, Object[] objArr2) {
        this.f2203t = objArr;
        this.f2204u = i;
        this.f2205v = objArr2;
        this.f2206w = i7;
        this.f2207x = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f2205v;
            if (objArr.length != 0) {
                int iD = AbstractC1397A.D(obj.hashCode());
                while (true) {
                    int i = iD & this.f2206w;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iD = i + 1;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f2203t;
        int i = this.f2207x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final Object[] g() {
        return this.f2203t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int h() {
        return this.f2207x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2204u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.a
    public final int i() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return j().listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // H4.f
    public final d m() {
        return d.j(this.f2207x, this.f2203t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2207x;
    }
}
