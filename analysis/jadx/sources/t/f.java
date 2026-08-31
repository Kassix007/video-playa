package T;

import P.AbstractC0362j0;
import com.google.android.gms.internal.measurement.K1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.C1193b;
import kotlin.jvm.internal.m;
import n5.AbstractC1403f;
import n5.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1403f implements Collection, C5.b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public c f7331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object[] f7332r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object[] f7333s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7334t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public W.b f7335u = new W.b();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object[] f7336v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object[] f7337w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7338x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f(c cVar, Object[] objArr, Object[] objArr2, int i) {
        this.f7331q = cVar;
        this.f7332r = objArr;
        this.f7333s = objArr2;
        this.f7334t = i;
        this.f7336v = objArr;
        this.f7337w = objArr2;
        this.f7338x = cVar.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f7338x;
        int i7 = i >> 5;
        int i8 = this.f7334t;
        if (i7 > (1 << i8)) {
            this.f7336v = B(this.f7334t + 5, t(objArr), objArr2);
            this.f7337w = objArr3;
            this.f7334t += 5;
            this.f7338x++;
            return;
        }
        if (objArr == null) {
            this.f7336v = objArr2;
            this.f7337w = objArr3;
            this.f7338x = i + 1;
        } else {
            this.f7336v = B(i8, objArr, objArr2);
            this.f7337w = objArr3;
            this.f7338x++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] B(int i, Object[] objArr, Object[] objArr2) {
        int iU = K1.u(d() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iU] = objArr2;
            return objArrQ;
        }
        objArrQ[iU] = B(i - 5, (Object[]) objArrQ[iU], objArr2);
        return objArrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int C(B5.c cVar, Object[] objArr, int i, int i7, E0.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (o(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f1611a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj2 = objArr[i8];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i7 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i7 = 0;
                }
                objArrS[i7] = obj2;
                i7++;
            }
        }
        aVar.f1611a = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int D(B5.c cVar, Object[] objArr, int i, E0.a aVar) {
        Object[] objArrQ = objArr;
        int i7 = i;
        boolean z5 = false;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = objArr[i8];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z5) {
                    objArrQ = q(objArr);
                    z5 = true;
                    i7 = i8;
                }
            } else if (z5) {
                objArrQ[i7] = obj;
                i7++;
            }
        }
        aVar.f1611a = objArrQ;
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int E(B5.c cVar, int i, E0.a aVar) {
        int iD = D(cVar, this.f7337w, i, aVar);
        if (iD == i) {
            return i;
        }
        Object obj = aVar.f1611a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iD, i, (Object) null);
        this.f7337w = objArr;
        this.f7338x -= i - iD;
        return iD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean F(B5.c cVar) {
        Object[] objArrY;
        int i;
        B5.c cVar2 = cVar;
        int iO = O();
        Object[] objArrU = null;
        E0.a aVar = new E0.a(null);
        boolean z5 = false;
        if (this.f7336v != null) {
            a aVarP = p(0);
            int iD = 32;
            while (iD == 32 && aVarP.hasNext()) {
                iD = D(cVar2, (Object[]) aVarP.next(), 32, aVar);
            }
            if (iD == 32) {
                int iE = E(cVar2, iO, aVar);
                if (iE == 0) {
                    x(this.f7336v, this.f7338x, this.f7334t);
                }
                if (iE != iO) {
                }
            } else {
                int i7 = (aVarP.f7321q - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iC = iD;
                while (aVarP.hasNext()) {
                    iC = C(cVar2, (Object[]) aVarP.next(), 32, iC, aVar, arrayList2, arrayList);
                    cVar2 = cVar;
                }
                int iC2 = C(cVar, this.f7337w, iO, iC, aVar, arrayList2, arrayList);
                Object obj = aVar.f1611a;
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iC2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrY = this.f7336v;
                    m.b(objArrY);
                } else {
                    objArrY = y(this.f7336v, i7, this.f7334t, arrayList.iterator());
                }
                int size = i7 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC0362j0.a("invalid size");
                }
                if (size == 0) {
                    this.f7334t = 0;
                } else {
                    int i8 = size - 1;
                    while (true) {
                        i = this.f7334t;
                        if ((i8 >> i) != 0) {
                            break;
                        }
                        this.f7334t = i - 5;
                        Object[] objArr2 = objArrY[0];
                        m.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrY = objArr2;
                    }
                    objArrU = u(objArrY, i8, i);
                }
                this.f7336v = objArrU;
                this.f7337w = objArr;
                this.f7338x = size + iC2;
            }
            z5 = true;
        } else if (E(cVar2, iO, aVar) != iO) {
            z5 = true;
        }
        if (z5) {
            ((AbstractList) this).modCount++;
        }
        return z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] H(Object[] objArr, int i, int i7, E0.a aVar) {
        int iU = K1.u(i7, i);
        if (i == 0) {
            Object obj = objArr[iU];
            Object[] objArrQ = q(objArr);
            k.D0(iU, iU + 1, 32, objArr, objArrQ);
            objArrQ[31] = aVar.f1611a;
            aVar.f1611a = obj;
            return objArrQ;
        }
        int iU2 = objArr[31] == null ? K1.u(J() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i8 = i - 5;
        int i9 = iU + 1;
        if (i9 <= iU2) {
            while (true) {
                Object obj2 = objArrQ2[iU2];
                m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrQ2[iU2] = H((Object[]) obj2, i8, 0, aVar);
                if (iU2 == i9) {
                    break;
                }
                iU2--;
            }
        }
        Object obj3 = objArrQ2[iU];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrQ2[iU] = H((Object[]) obj3, i8, i7, aVar);
        return objArrQ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object I(Object[] objArr, int i, int i7, int i8) {
        int i9 = this.f7338x - i;
        if (i9 == 1) {
            Object obj = this.f7337w[0];
            x(objArr, i, i7);
            return obj;
        }
        Object[] objArr2 = this.f7337w;
        Object obj2 = objArr2[i8];
        Object[] objArrQ = q(objArr2);
        k.D0(i8, i8 + 1, i9, objArr2, objArrQ);
        objArrQ[i9 - 1] = null;
        this.f7336v = objArr;
        this.f7337w = objArrQ;
        this.f7338x = (i + i9) - 1;
        this.f7334t = i7;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int J() {
        int i = this.f7338x;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] L(Object[] objArr, int i, int i7, Object obj, E0.a aVar) {
        int iU = K1.u(i7, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iU];
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrQ[iU] = L((Object[]) obj2, i - 5, i7, obj, aVar);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f1611a = objArrQ[iU];
        objArrQ[iU] = obj;
        return objArrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(Collection collection, int i, Object[] objArr, int i7, Object[][] objArr2, int i8, Object[] objArr3) {
        Object[] objArrS;
        if (i8 < 1) {
            AbstractC0362j0.a("requires at least one nullBuffer");
        }
        Object[] objArrQ = q(objArr);
        objArr2[0] = objArrQ;
        int i9 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i10 = (i7 - i9) + size;
        if (i10 < 32) {
            k.D0(size + 1, i9, i7, objArrQ, objArr3);
        } else {
            int i11 = i10 - 31;
            if (i8 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = s();
                i8--;
                objArr2[i8] = objArrS;
            }
            int i12 = i7 - i11;
            k.D0(0, i12, i7, objArrQ, objArr3);
            k.D0(size + 1, i9, i12, objArrQ, objArrS);
            objArr3 = objArrS;
        }
        Iterator it = collection.iterator();
        i(objArrQ, i9, it);
        for (int i13 = 1; i13 < i8; i13++) {
            Object[] objArrS2 = s();
            i(objArrS2, 0, it);
            objArr2[i13] = objArrS2;
        }
        i(objArr3, 0, it);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int O() {
        int i = this.f7338x;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        E3.h.q(i, d());
        if (i == d()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i >= iJ) {
            m(i - iJ, obj, this.f7336v);
            return;
        }
        E0.a aVar = new E0.a(null);
        Object[] objArr = this.f7336v;
        m.b(objArr);
        m(0, aVar.f1611a, l(objArr, this.f7334t, i, obj, aVar));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        f fVar;
        Object[] objArrS;
        E3.h.q(i, this.f7338x);
        if (i == this.f7338x) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i7 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f7338x - i7)) - 1) / 32;
        if (size == 0) {
            int i8 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f7337w;
            Object[] objArrQ = q(objArr);
            k.D0(size2 + 1, i8, O(), objArr, objArrQ);
            i(objArrQ, i8, collection.iterator());
            this.f7337w = objArrQ;
            this.f7338x = collection.size() + this.f7338x;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iO = O();
        int size3 = collection.size() + this.f7338x;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= J()) {
            objArrS = s();
            collection2 = collection;
            N(collection2, i, this.f7337w, iO, objArr2, size, objArrS);
            fVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            fVar = this;
            if (size3 > iO) {
                int i9 = size3 - iO;
                Object[] objArrR = r(i9, fVar.f7337w);
                fVar.k(collection2, i, i9, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                Object[] objArr3 = fVar.f7337w;
                objArrS = s();
                int i10 = iO - size3;
                k.D0(0, i10, iO, objArr3, objArrS);
                int i11 = 32 - i10;
                Object[] objArrR2 = r(i11, fVar.f7337w);
                int i12 = size - 1;
                objArr2[i12] = objArrR2;
                fVar.k(collection2, i, i11, objArr2, i12, objArrR2);
                collection2 = collection2;
            }
        }
        fVar.f7336v = z(fVar.f7336v, i7, objArr2);
        fVar.f7337w = objArrS;
        fVar.f7338x = collection2.size() + fVar.f7338x;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final int d() {
        return this.f7338x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // n5.AbstractC1403f
    public final Object g(int i) {
        E3.h.o(i, d());
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (i >= iJ) {
            return I(this.f7336v, iJ, this.f7334t, i - iJ);
        }
        E0.a aVar = new E0.a(this.f7337w[0]);
        Object[] objArr = this.f7336v;
        m.b(objArr);
        I(H(objArr, this.f7334t, i, aVar), iJ, this.f7334t, 0);
        return aVar.f1611a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        E3.h.o(i, d());
        if (J() <= i) {
            objArr = this.f7337w;
        } else {
            objArr = this.f7336v;
            m.b(objArr);
            for (int i7 = this.f7334t; i7 > 0; i7 -= 5) {
                Object obj = objArr[K1.u(i, i7)];
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final c h() {
        c eVar;
        Object[] objArr = this.f7336v;
        if (objArr == this.f7332r && this.f7337w == this.f7333s) {
            eVar = this.f7331q;
        } else {
            this.f7335u = new W.b();
            this.f7332r = objArr;
            Object[] objArr2 = this.f7337w;
            this.f7333s = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f7338x, this.f7334t);
            } else if (objArr2.length == 0) {
                eVar = i.f7345r;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f7338x);
                m.d(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.f7331q = eVar;
        return eVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int j() {
        return ((AbstractList) this).modCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(Collection collection, int i, int i7, Object[][] objArr, int i8, Object[] objArr2) {
        if (this.f7336v == null) {
            throw new IllegalStateException("root is null");
        }
        int i9 = i >> 5;
        a aVarP = p(J() >> 5);
        int i10 = i8;
        Object[] objArrR = objArr2;
        while (aVarP.f7321q - 1 != i9) {
            Object[] objArr3 = (Object[]) aVarP.previous();
            k.D0(0, 32 - i7, 32, objArr3, objArrR);
            objArrR = r(i7, objArr3);
            i10--;
            objArr[i10] = objArrR;
        }
        Object[] objArr4 = (Object[]) aVarP.previous();
        int iJ = i8 - (((J() >> 5) - 1) - i9);
        if (iJ < i8) {
            objArr2 = objArr[iJ];
            m.b(objArr2);
        }
        N(collection, i, objArr4, 32, objArr, iJ, objArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] l(Object[] objArr, int i, int i7, Object obj, E0.a aVar) {
        Object obj2;
        int iU = K1.u(i7, i);
        if (i == 0) {
            aVar.f1611a = objArr[31];
            Object[] objArrQ = q(objArr);
            k.D0(iU + 1, iU, 31, objArr, objArrQ);
            objArrQ[iU] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i8 = i - 5;
        Object obj3 = objArrQ2[iU];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrQ2[iU] = l((Object[]) obj3, i8, i7, obj, aVar);
        while (true) {
            iU++;
            if (iU >= 32 || (obj2 = objArrQ2[iU]) == null) {
                break;
            }
            objArrQ2[iU] = l((Object[]) obj2, i8, 0, aVar.f1611a, aVar);
        }
        return objArrQ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        E3.h.q(i, this.f7338x);
        return new h(this, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i, Object obj, Object[] objArr) {
        int iO = O();
        Object[] objArrQ = q(this.f7337w);
        if (iO >= 32) {
            Object[] objArr2 = this.f7337w;
            Object obj2 = objArr2[31];
            k.D0(i + 1, i, 31, objArr2, objArrQ);
            objArrQ[i] = obj;
            A(objArr, objArrQ, t(obj2));
            return;
        }
        k.D0(i + 1, i, iO, this.f7337w, objArrQ);
        objArrQ[i] = obj;
        this.f7336v = objArr;
        this.f7337w = objArrQ;
        this.f7338x++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean o(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f7335u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final a p(int i) {
        Object[] objArr = this.f7336v;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iJ = J() >> 5;
        E3.h.q(i, iJ);
        int i7 = this.f7334t;
        return i7 == 0 ? new d(i, objArr) : new j(objArr, i, iJ, i7 / 5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] q(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (o(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        k.G0(0, length, 6, objArr, objArrS);
        return objArrS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] r(int i, Object[] objArr) {
        if (o(objArr)) {
            k.D0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrS = s();
        k.D0(i, 0, 32 - i, objArr, objArrS);
        return objArrS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return F(new b(1, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f7335u;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        E3.h.o(i, d());
        if (J() > i) {
            E0.a aVar = new E0.a(null);
            Object[] objArr = this.f7336v;
            m.b(objArr);
            this.f7336v = L(objArr, this.f7334t, i, obj, aVar);
            return aVar.f1611a;
        }
        Object[] objArrQ = q(this.f7337w);
        if (objArrQ != this.f7337w) {
            ((AbstractList) this).modCount++;
        }
        int i7 = i & 31;
        Object obj2 = objArrQ[i7];
        objArrQ[i7] = obj;
        this.f7337w = objArrQ;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f7335u;
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] u(Object[] objArr, int i, int i7) {
        if (i7 < 0) {
            AbstractC0362j0.a("shift should be positive");
        }
        if (i7 == 0) {
            return objArr;
        }
        int iU = K1.u(i, i7);
        Object obj = objArr[iU];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objU = u((Object[]) obj, i, i7 - 5);
        if (iU < 31) {
            int i8 = iU + 1;
            if (objArr[i8] != null) {
                if (o(objArr)) {
                    Arrays.fill(objArr, i8, 32, (Object) null);
                }
                Object[] objArrS = s();
                k.D0(0, 0, i8, objArr, objArrS);
                objArr = objArrS;
            }
        }
        if (objU == objArr[iU]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iU] = objU;
        return objArrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] w(Object[] objArr, int i, int i7, E0.a aVar) {
        Object[] objArrW;
        int iU = K1.u(i7 - 1, i);
        if (i == 5) {
            aVar.f1611a = objArr[iU];
            objArrW = null;
        } else {
            Object obj = objArr[iU];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrW = w((Object[]) obj, i - 5, i7, aVar);
        }
        if (objArrW == null && iU == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iU] = objArrW;
        return objArrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void x(Object[] objArr, int i, int i7) {
        if (i7 == 0) {
            this.f7336v = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f7337w = objArr;
            this.f7338x = i;
            this.f7334t = i7;
            return;
        }
        E0.a aVar = new E0.a(null);
        m.b(objArr);
        Object[] objArrW = w(objArr, i7, i, aVar);
        m.b(objArrW);
        Object obj = aVar.f1611a;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f7337w = (Object[]) obj;
        this.f7338x = i;
        if (objArrW[1] == null) {
            this.f7336v = (Object[]) objArrW[0];
            this.f7334t = i7 - 5;
        } else {
            this.f7336v = objArrW;
            this.f7334t = i7;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] y(Object[] objArr, int i, int i7, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0362j0.a("invalid buffersIterator");
        }
        if (!(i7 >= 0)) {
            AbstractC0362j0.a("negative shift");
        }
        if (i7 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iU = K1.u(i, i7);
        int i8 = i7 - 5;
        objArrQ[iU] = y((Object[]) objArrQ[iU], i, i8, it);
        while (true) {
            iU++;
            if (iU >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iU] = y((Object[]) objArrQ[iU], 0, i8, it);
        }
        return objArrQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] z(Object[] objArr, int i, Object[][] objArr2) {
        C1193b c1193bH = m.h(objArr2);
        int i7 = i >> 5;
        int i8 = this.f7334t;
        Object[] objArrY = i7 < (1 << i8) ? y(objArr, i, i8, c1193bH) : q(objArr);
        while (c1193bH.hasNext()) {
            this.f7334t += 5;
            objArrY = t(objArrY);
            int i9 = this.f7334t;
            y(objArrY, 1 << i9, i9, c1193bH);
        }
        return objArrY;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iO = O();
        if (iO < 32) {
            Object[] objArrQ = q(this.f7337w);
            objArrQ[iO] = obj;
            this.f7337w = objArrQ;
            this.f7338x = d() + 1;
        } else {
            A(this.f7336v, this.f7337w, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iO = O();
        Iterator it = collection.iterator();
        if (32 - iO >= collection.size()) {
            Object[] objArrQ = q(this.f7337w);
            i(objArrQ, iO, it);
            this.f7337w = objArrQ;
            this.f7338x = collection.size() + this.f7338x;
            return true;
        }
        int size = ((collection.size() + iO) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.f7337w);
        i(objArrQ2, iO, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            i(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        this.f7336v = z(this.f7336v, J(), objArr);
        Object[] objArrS2 = s();
        i(objArrS2, 0, it);
        this.f7337w = objArrS2;
        this.f7338x = collection.size() + this.f7338x;
        return true;
    }
}
