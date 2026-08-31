package T;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import n5.k;

/* JADX INFO: loaded from: classes.dex */
public final class i extends c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final i f7345r = new i(new Object[0]);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object[] f7346q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i(Object[] objArr) {
        this.f7346q = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f7346q.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c g(int i, Object obj) {
        Object[] objArr = this.f7346q;
        E3.h.q(i, objArr.length);
        if (i == objArr.length) {
            return h(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            k.G0(0, i, 6, objArr, objArr2);
            k.D0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        k.D0(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        E3.h.o(i, d());
        return this.f7346q[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c h(Object obj) {
        Object[] objArr = this.f7346q;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c i(Collection collection) {
        Object[] objArr = this.f7346q;
        if (collection.size() + objArr.length > 32) {
            f fVarJ = j();
            fVarJ.addAll(collection);
            return fVarJ.h();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final int indexOf(Object obj) {
        return k.P0(this.f7346q, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final f j() {
        return new f(this, null, this.f7346q, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c k(b bVar) {
        Object[] objArr = this.f7346q;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z5 = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z5) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    m.d(objArrCopyOf, "copyOf(...)");
                    z5 = true;
                    length = i;
                }
            } else if (z5) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f7345r : new i(k.I0(objArrCopyOf, 0, length));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c l(int i) {
        Object[] objArr = this.f7346q;
        E3.h.o(i, objArr.length);
        if (objArr.length == 1) {
            return f7345r;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        m.d(objArrCopyOf, "copyOf(...)");
        k.D0(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f7346q;
        m.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i7 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length2 = i7;
                }
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f7346q;
        E3.h.q(i, objArr.length);
        return new d(objArr, i, objArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c m(int i, Object obj) {
        Object[] objArr = this.f7346q;
        E3.h.o(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new i(objArrCopyOf);
    }
}
