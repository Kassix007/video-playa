package r;

import java.util.List;
import m0.C1346a;
import s.AbstractC1585a;

/* JADX INFO: renamed from: r.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1544C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f16114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16115b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1544C(int i) {
        this.f16114a = i == 0 ? M.f16159a : new Object[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj) {
        int i = this.f16115b + 1;
        Object[] objArr = this.f16114a;
        if (objArr.length < i) {
            k(i, objArr);
        }
        Object[] objArr2 = this.f16114a;
        int i7 = this.f16115b;
        objArr2[i7] = obj;
        this.f16115b = i7 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f16115b;
        int size = list.size() + i;
        Object[] objArr = this.f16114a;
        if (objArr.length < size) {
            k(size, objArr);
        }
        Object[] objArr2 = this.f16114a;
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            objArr2[i7 + i] = list.get(i7);
        }
        this.f16115b = list.size() + this.f16115b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        n5.k.J0(0, this.f16115b, null, this.f16114a);
        this.f16115b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object d() {
        if (!g()) {
            return this.f16114a[0];
        }
        AbstractC1585a.e("ObjectList is empty.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object e(int i) {
        if (i >= 0 && i < this.f16115b) {
            return this.f16114a[i];
        }
        l(i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1544C) {
            C1544C c1544c = (C1544C) obj;
            int i = c1544c.f16115b;
            int i7 = this.f16115b;
            if (i == i7) {
                Object[] objArr = this.f16114a;
                Object[] objArr2 = c1544c.f16114a;
                G5.d dVarO = D5.a.O(0, i7);
                int i8 = dVarO.f2017q;
                int i9 = dVarO.f2018r;
                if (i8 > i9) {
                    return true;
                }
                while (kotlin.jvm.internal.m.a(objArr[i8], objArr2[i8])) {
                    if (i8 == i9) {
                        return true;
                    }
                    i8++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.f16114a;
            int i7 = this.f16115b;
            while (i < i7) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.f16114a;
        int i8 = this.f16115b;
        while (i < i8) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean g() {
        return this.f16115b == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h() {
        return this.f16115b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f16114a;
        int i = this.f16115b;
        int iHashCode = 0;
        for (int i7 = 0; i7 < i; i7++) {
            Object obj = objArr[i7];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object i(int i) {
        int i7;
        if (i < 0 || i >= (i7 = this.f16115b)) {
            l(i);
            throw null;
        }
        Object[] objArr = this.f16114a;
        Object obj = objArr[i];
        if (i != i7 - 1) {
            n5.k.D0(i, i + 1, i7, objArr, objArr);
        }
        int i8 = this.f16115b - 1;
        this.f16115b = i8;
        objArr[i8] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(int i, int i7) {
        int i8;
        if (i < 0 || i > (i8 = this.f16115b) || i7 < 0 || i7 > i8) {
            AbstractC1585a.d("Start (" + i + ") and end (" + i7 + ") must be in 0.." + this.f16115b);
            throw null;
        }
        if (i7 < i) {
            AbstractC1585a.c("Start (" + i + ") is more than end (" + i7 + ')');
            throw null;
        }
        if (i7 != i) {
            if (i7 < i8) {
                Object[] objArr = this.f16114a;
                n5.k.D0(i, i7, i8, objArr, objArr);
            }
            int i9 = this.f16115b;
            int i10 = i9 - (i7 - i);
            n5.k.J0(i10, i9, null, this.f16114a);
            this.f16115b = i10;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i, Object[] oldContent) {
        kotlin.jvm.internal.m.e(oldContent, "oldContent");
        int length = oldContent.length;
        Object[] objArr = new Object[Math.max(i, (length * 3) / 2)];
        n5.k.D0(0, 0, length, oldContent, objArr);
        this.f16114a = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i) {
        StringBuilder sbL = k1.i.l("Index ", " must be in 0..", i);
        sbL.append(this.f16115b - 1);
        AbstractC1585a.d(sbL.toString());
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C1346a c1346a = new C1346a(2, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f16114a;
        int i = this.f16115b;
        int i7 = 0;
        while (true) {
            if (i7 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i7];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c1346a.invoke(obj));
            i7++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:5) call: r.C.<init>(int):void type: THIS */
    public /* synthetic */ C1544C() {
        this(16);
    }
}
