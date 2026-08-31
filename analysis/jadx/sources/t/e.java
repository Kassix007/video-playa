package T;

import P.AbstractC0362j0;
import com.google.android.gms.internal.measurement.K1;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import n5.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object[] f7327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object[] f7328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f7329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7330t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e(Object[] objArr, Object[] objArr2, int i, int i7) {
        this.f7327q = objArr;
        this.f7328r = objArr2;
        this.f7329s = i;
        this.f7330t = i7;
        if (!(d() > 32)) {
            AbstractC0362j0.a("Trie-based persistent vector should have at least 33 elements, got " + d());
        }
        int length = objArr2.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] o(Object[] objArr, int i, int i7, Object obj, E0.a aVar) {
        Object[] objArrCopyOf;
        int iU = K1.u(i7, i);
        if (i == 0) {
            if (iU == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                m.d(objArrCopyOf, "copyOf(...)");
            }
            k.D0(iU + 1, iU, 31, objArr, objArrCopyOf);
            aVar.f1611a = objArr[31];
            objArrCopyOf[iU] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf2, "copyOf(...)");
        int i8 = i - 5;
        Object obj2 = objArr[iU];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iU] = o((Object[]) obj2, i8, i7, obj, aVar);
        while (true) {
            iU++;
            if (iU >= 32 || objArrCopyOf2[iU] == null) {
                break;
            }
            Object obj3 = objArr[iU];
            m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iU] = o((Object[]) obj3, i8, 0, aVar.f1611a, aVar);
        }
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] q(Object[] objArr, int i, int i7, E0.a aVar) {
        Object[] objArrQ;
        int iU = K1.u(i7, i);
        if (i == 5) {
            aVar.f1611a = objArr[iU];
            objArrQ = null;
        } else {
            Object obj = objArr[iU];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ = q((Object[]) obj, i - 5, i7, aVar);
        }
        if (objArrQ == null && iU == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iU] = objArrQ;
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object[] x(int i, int i7, Object obj, Object[] objArr) {
        int iU = K1.u(i7, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        if (i == 0) {
            objArrCopyOf[iU] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iU];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iU] = x(i - 5, i7, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1398a
    public final int d() {
        return this.f7329s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c g(int i, Object obj) {
        int i7 = this.f7329s;
        E3.h.q(i, i7);
        if (i == i7) {
            return h(obj);
        }
        int iW = w();
        Object[] objArr = this.f7327q;
        if (i >= iW) {
            return p(i - iW, obj, objArr);
        }
        E0.a aVar = new E0.a(null);
        return p(0, aVar.f1611a, o(objArr, this.f7330t, i, obj, aVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        E3.h.o(i, d());
        if (w() <= i) {
            objArr = this.f7328r;
        } else {
            objArr = this.f7327q;
            for (int i7 = this.f7330t; i7 > 0; i7 -= 5) {
                Object obj = objArr[K1.u(i, i7)];
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c h(Object obj) {
        int iW = w();
        int i = this.f7329s;
        int i7 = i - iW;
        Object[] objArr = this.f7327q;
        Object[] objArr2 = this.f7328r;
        if (i7 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return r(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i7] = obj;
        return new e(objArr, objArrCopyOf, i + 1, this.f7330t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final f j() {
        return new f(this, this.f7327q, this.f7328r, this.f7330t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c k(b bVar) {
        f fVar = new f(this, this.f7327q, this.f7328r, this.f7330t);
        fVar.F(bVar);
        return fVar.h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c l(int i) {
        E3.h.o(i, this.f7329s);
        int iW = w();
        Object[] objArr = this.f7327q;
        int i7 = this.f7330t;
        return i >= iW ? u(objArr, iW, i7, i - iW) : u(t(objArr, i7, i, new E0.a(this.f7328r[0])), iW, i7, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1401d, java.util.List
    public final ListIterator listIterator(int i) {
        E3.h.q(i, this.f7329s);
        return new g(i, this.f7329s, (this.f7330t / 5) + 1, this.f7327q, this.f7328r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // T.c
    public final c m(int i, Object obj) {
        int i7 = this.f7329s;
        E3.h.o(i, i7);
        int iW = w();
        Object[] objArr = this.f7327q;
        Object[] objArr2 = this.f7328r;
        int i8 = this.f7330t;
        if (iW > i) {
            return new e(x(i8, i, obj, objArr), objArr2, i7, i8);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i & 31] = obj;
        return new e(objArr, objArrCopyOf, i7, i8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e p(int i, Object obj, Object[] objArr) {
        int iW = w();
        int i7 = this.f7329s;
        int i8 = i7 - iW;
        Object[] objArr2 = this.f7328r;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        if (i8 < 32) {
            k.D0(i + 1, i, i8, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new e(objArr, objArrCopyOf, i7 + 1, this.f7330t);
        }
        Object obj2 = objArr2[31];
        k.D0(i + 1, i, i8 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return r(objArr, objArrCopyOf, objArr3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final e r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f7329s;
        int i7 = i >> 5;
        int i8 = this.f7330t;
        if (i7 <= (1 << i8)) {
            return new e(s(i8, objArr, objArr2), objArr3, i + 1, i8);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i9 = i8 + 5;
        return new e(s(i9, objArr4, objArr2), objArr3, i + 1, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] s(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iU = K1.u(d() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            m.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[iU] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iU] = s(i - 5, (Object[]) objArrCopyOf[iU], objArr2);
        return objArrCopyOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] t(Object[] objArr, int i, int i7, E0.a aVar) {
        Object[] objArrCopyOf;
        int iU = K1.u(i7, i);
        if (i == 0) {
            if (iU == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                m.d(objArrCopyOf, "copyOf(...)");
            }
            k.D0(iU, iU + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = aVar.f1611a;
            aVar.f1611a = objArr[iU];
            return objArrCopyOf;
        }
        int iU2 = objArr[31] == null ? K1.u(w() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf2, "copyOf(...)");
        int i8 = i - 5;
        int i9 = iU + 1;
        if (i9 <= iU2) {
            while (true) {
                Object obj = objArrCopyOf2[iU2];
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iU2] = t((Object[]) obj, i8, 0, aVar);
                if (iU2 == i9) {
                    break;
                }
                iU2--;
            }
        }
        Object obj2 = objArrCopyOf2[iU];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iU] = t((Object[]) obj2, i8, i7, aVar);
        return objArrCopyOf2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c u(Object[] objArr, int i, int i7, int i8) {
        int i9 = this.f7329s - i;
        if (i9 != 1) {
            Object[] objArr2 = this.f7328r;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            m.d(objArrCopyOf, "copyOf(...)");
            int i10 = i9 - 1;
            if (i8 < i10) {
                k.D0(i8, i8 + 1, i9, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i10] = null;
            return new e(objArr, objArrCopyOf, (i + i9) - 1, i7);
        }
        if (i7 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                m.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        E0.a aVar = new E0.a(null);
        Object[] objArrQ = q(objArr, i7, i - 1, aVar);
        m.b(objArrQ);
        Object obj = aVar.f1611a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrQ[1] != null) {
            return new e(objArrQ, objArr3, i, i7);
        }
        Object obj2 = objArrQ[0];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj2, objArr3, i, i7 - 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int w() {
        return (this.f7329s - 1) & (-32);
    }
}
