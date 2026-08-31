package R;

import com.google.android.gms.internal.measurement.AbstractC0836n2;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes.dex */
public final class e implements RandomAccess {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object[] f6676q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b f6677r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6678s = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Object[] objArr) {
        this.f6676q = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(int i, Object obj) {
        int i7 = this.f6678s + 1;
        if (this.f6676q.length < i7) {
            p(i7);
        }
        Object[] objArr = this.f6676q;
        int i8 = this.f6678s;
        if (i != i8) {
            System.arraycopy(objArr, i, objArr, i + 1, i8 - i);
        }
        objArr[i] = obj;
        this.f6678s++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Object obj) {
        int i = this.f6678s + 1;
        if (this.f6676q.length < i) {
            p(i);
        }
        Object[] objArr = this.f6676q;
        int i7 = this.f6678s;
        objArr[i7] = obj;
        this.f6678s = i7 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, e eVar) {
        int i7 = eVar.f6678s;
        if (i7 == 0) {
            return;
        }
        int i8 = this.f6678s + i7;
        if (this.f6676q.length < i8) {
            p(i8);
        }
        Object[] objArr = this.f6676q;
        int i9 = this.f6678s;
        if (i != i9) {
            System.arraycopy(objArr, i, objArr, i + i7, i9 - i);
        }
        System.arraycopy(eVar.f6676q, 0, objArr, i, i7);
        this.f6678s += i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i7 = this.f6678s + size;
        if (this.f6676q.length < i7) {
            p(i7);
        }
        Object[] objArr = this.f6676q;
        int i8 = this.f6678s;
        if (i != i8) {
            System.arraycopy(objArr, i, objArr, i + size, i8 - i);
        }
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            objArr[i + i9] = list.get(i9);
        }
        this.f6678s += size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g(int i, Collection collection) {
        int i7 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i8 = this.f6678s + size;
        if (this.f6676q.length < i8) {
            p(i8);
        }
        Object[] objArr = this.f6676q;
        int i9 = this.f6678s;
        if (i != i9) {
            System.arraycopy(objArr, i, objArr, i + size, i9 - i);
        }
        for (Object obj : collection) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                AbstractC0836n2.N();
                throw null;
            }
            objArr[i7 + i] = obj;
            i7 = i10;
        }
        this.f6678s += size;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List h() {
        b bVar = this.f6677r;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f6677r = bVar2;
        return bVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i() {
        Object[] objArr = this.f6676q;
        int i = this.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            objArr[i7] = null;
        }
        this.f6678s = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(Object obj) {
        int i = this.f6678s - 1;
        if (i >= 0) {
            for (int i7 = 0; !m.a(this.f6676q[i7], obj); i7++) {
                if (i7 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int k(Object obj) {
        Object[] objArr = this.f6676q;
        int i = this.f6678s;
        for (int i7 = 0; i7 < i; i7++) {
            if (m.a(obj, objArr[i7])) {
                return i7;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean l(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return false;
        }
        m(iK);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object m(int i) {
        Object[] objArr = this.f6676q;
        Object obj = objArr[i];
        int i7 = this.f6678s;
        if (i != i7 - 1) {
            int i8 = i + 1;
            System.arraycopy(objArr, i8, objArr, i, i7 - i8);
        }
        int i9 = this.f6678s - 1;
        this.f6678s = i9;
        objArr[i9] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(int i, int i7) {
        if (i7 > i) {
            int i8 = this.f6678s;
            if (i7 < i8) {
                Object[] objArr = this.f6676q;
                System.arraycopy(objArr, i7, objArr, i, i8 - i7);
            }
            int i9 = this.f6678s;
            int i10 = i9 - (i7 - i);
            int i11 = i9 - 1;
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    this.f6676q[i12] = null;
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f6678s = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void p(int i) {
        Object[] objArr = this.f6676q;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f6676q = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void q(Comparator comparator) {
        Arrays.sort(this.f6676q, 0, this.f6678s, comparator);
    }
}
