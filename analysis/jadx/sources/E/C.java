package E;

import B0.C0029a;
import B0.j0;
import P.AbstractC0366l0;
import P.C0345b;
import P.C0354f0;
import P.C0363k;
import P.C0371o;
import P.C0372o0;
import P.T0;
import a0.AbstractC0606h;
import c0.InterfaceC0725m;
import com.google.android.gms.internal.measurement.AbstractC0836n2;
import com.google.android.gms.internal.measurement.P1;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import m5.C1386y;
import r.AbstractC1559j;
import r.C1569u;
import z.AbstractC1923a;
import z0.AbstractC1931H;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0.C f1474a = new B0.C(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(B5.a aVar, InterfaceC0725m interfaceC0725m, K k7, B5.e eVar, C0371o c0371o, int i) {
        c0371o.U(2002163445);
        int i7 = (c0371o.i(aVar) ? 4 : 2) | i | (c0371o.g(interfaceC0725m) ? 32 : 16) | (c0371o.g(k7) ? 256 : 128) | (c0371o.i(eVar) ? 2048 : 1024);
        if (c0371o.K(i7 & 1, (i7 & 1171) != 1170)) {
            c(X.k.d(-1488997347, new androidx.compose.foundation.lazy.layout.c(k7, interfaceC0725m, eVar, C0345b.t(aVar, c0371o)), c0371o), c0371o, 6);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0142z(aVar, interfaceC0725m, k7, eVar, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(Object obj, int i, H h4, X.e eVar, C0371o c0371o, int i7) {
        int i8;
        c0371o.U(-2079116560);
        if ((i7 & 6) == 0) {
            i8 = (c0371o.i(obj) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0371o.e(i) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0371o.i(h4) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0371o.i(eVar) ? 2048 : 1024;
        }
        if (c0371o.K(i8 & 1, (i8 & 1171) != 1170)) {
            boolean zG = c0371o.g(obj) | c0371o.g(h4);
            Object objH = c0371o.H();
            Object obj2 = C0363k.f5418a;
            if (zG || objH == obj2) {
                objH = new G(obj, h4);
                c0371o.d0(objH);
            }
            G g7 = (G) objH;
            g7.f1481c = i;
            C0354f0 c0354f0 = g7.f1484g;
            AbstractC0366l0 abstractC0366l0 = AbstractC1931H.f18662a;
            G g8 = (G) c0371o.k(abstractC0366l0);
            AbstractC0606h abstractC0606hC = a0.r.c();
            B5.c cVarE = abstractC0606hC != null ? abstractC0606hC.e() : null;
            AbstractC0606h abstractC0606hD = a0.r.d(abstractC0606hC);
            try {
                if (g8 != ((G) c0354f0.getValue())) {
                    c0354f0.setValue(g8);
                    if (g7.f1482d > 0) {
                        G g9 = g7.f1483e;
                        if (g9 != null) {
                            g9.b();
                        }
                        if (g8 != null) {
                            g8.a();
                        } else {
                            g8 = null;
                        }
                        g7.f1483e = g8;
                    }
                }
                a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                boolean zG2 = c0371o.g(g7);
                Object objH2 = c0371o.H();
                if (zG2 || objH2 == obj2) {
                    objH2 = new C0029a(10, g7);
                    c0371o.d0(objH2);
                }
                C0345b.c(g7, (B5.c) objH2, c0371o);
                C0345b.a(abstractC0366l0.a(g7), eVar, c0371o, ((i8 >> 6) & 112) | 8);
            } catch (Throwable th) {
                a0.r.f(abstractC0606hC, abstractC0606hD, cVarE);
                throw th;
            }
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0139w(obj, i, h4, eVar, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(X.e eVar, C0371o c0371o, int i) {
        C0371o c0371o2;
        c0371o.U(674185128);
        int i7 = 0;
        if (c0371o.K(i & 1, (i & 3) != 2)) {
            T0 t02 = Z.k.f8310a;
            Z.i iVar = (Z.i) c0371o.k(t02);
            Z.f fVarL = AbstractC0836n2.L(c0371o);
            Object[] objArr = {iVar};
            int i8 = 8;
            A.Y y6 = new A.Y(i8, iVar, fVarL);
            Z.m mVar = Z.n.f8314a;
            Z.m mVar2 = new Z.m(i7, V.f1512q, y6);
            boolean zI = c0371o.i(iVar) | c0371o.i(fVarL);
            Object objH = c0371o.H();
            if (zI || objH == C0363k.f5418a) {
                objH = new B0.K(i8, iVar, fVarL);
                c0371o.d0(objH);
            }
            B5.a aVar = (B5.a) objH;
            c0371o2 = c0371o;
            W w3 = (W) P1.P(objArr, mVar2, aVar, c0371o2, 0, 4);
            C0345b.a(t02.a(w3), X.k.d(1863926504, new j0(5, eVar, w3), c0371o2), c0371o2, 56);
        } else {
            c0371o2 = c0371o;
            c0371o2.N();
        }
        C0372o0 c0372o0R = c0371o2.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new X(eVar, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(InterfaceC0140x interfaceC0140x, Object obj, int i, Object obj2, C0371o c0371o, int i7) {
        int i8;
        c0371o.U(1439843069);
        if ((i7 & 6) == 0) {
            i8 = (c0371o.g(interfaceC0140x) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0371o.g(obj) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0371o.e(i) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0371o.g(obj2) ? 2048 : 1024;
        }
        if (c0371o.K(i8 & 1, (i8 & 1171) != 1170)) {
            ((Z.c) obj).f(obj2, X.k.d(980966366, new C0138v(i, interfaceC0140x, obj2), c0371o), c0371o, 48);
        } else {
            c0371o.N();
        }
        C0372o0 c0372o0R = c0371o.r();
        if (c0372o0R != null) {
            c0372o0R.f5482d = new C0139w(interfaceC0140x, obj, i, obj2, i7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int e(int i, R.e eVar) {
        int i7 = eVar.f6678s - 1;
        int i8 = 0;
        while (i8 < i7) {
            int i9 = ((i7 - i8) / 2) + i8;
            Object[] objArr = eVar.f6676q;
            int i10 = ((C0126i) objArr[i9]).f1567a;
            if (i10 != i) {
                if (i10 < i) {
                    i8 = i9 + 1;
                    if (i < ((C0126i) objArr[i8]).f1567a) {
                    }
                } else {
                    i7 = i9 - 1;
                }
            }
            return i9;
        }
        return i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List f(E e7, ArrayList arrayList, C1569u c1569u, int i, int i7, int i8, B5.c cVar) {
        C1569u c1569u2;
        long j;
        long j7;
        int i9;
        Object obj;
        int i10;
        int i11;
        if (e7 == null || arrayList.isEmpty() || c1569u.f16252b == 0) {
            return n5.s.f15299q;
        }
        int index = ((B) n5.l.l0(arrayList)).getIndex();
        int i12 = -1;
        if (((B) n5.l.r0(arrayList)).getIndex() - index < 0 || (i11 = c1569u.f16252b) == 0) {
            c1569u2 = AbstractC1559j.f16215a;
        } else {
            G5.d dVarO = D5.a.O(0, i11);
            int i13 = dVarO.f2017q;
            int i14 = dVarO.f2018r;
            int iC = -1;
            if (i13 <= i14) {
                while (c1569u.c(i13) <= index) {
                    iC = c1569u.c(i13);
                    if (i13 == i14) {
                        break;
                    }
                    i13++;
                }
            }
            if (iC == -1) {
                c1569u2 = AbstractC1559j.f16215a;
            } else {
                C1569u c1569u3 = AbstractC1559j.f16215a;
                c1569u2 = new C1569u(1);
                c1569u2.a(iC);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            Object obj2 = arrayList.get(i15);
            int index2 = ((B) obj2).getIndex();
            int[] iArr = c1569u.f16251a;
            int i16 = c1569u.f16252b;
            int i17 = 0;
            while (true) {
                if (i17 >= i16) {
                    break;
                }
                if (iArr[i17] == index2) {
                    arrayList3.add(obj2);
                    break;
                }
                i17++;
            }
        }
        int[] iArr2 = c1569u2.f16251a;
        int i18 = c1569u2.f16252b;
        int i19 = 0;
        while (i19 < i18) {
            int i20 = iArr2[i19];
            int size2 = arrayList.size();
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i22 >= size2) {
                    i21 = i12;
                    break;
                }
                Object obj3 = arrayList.get(i22);
                i22++;
                if (((B) obj3).getIndex() == i20) {
                    break;
                }
                i21++;
            }
            B b7 = i21 == i12 ? (B) cVar.invoke(Integer.valueOf(i20)) : (B) arrayList.remove(i21);
            int iF = b7.f();
            if (i21 == i12) {
                i9 = Integer.MIN_VALUE;
                j = 4294967295L;
            } else {
                long jG = b7.g(0);
                if (b7.c()) {
                    j = 4294967295L;
                    j7 = jG & 4294967295L;
                } else {
                    j = 4294967295L;
                    j7 = jG >> 32;
                }
                i9 = (int) j7;
            }
            int size3 = arrayList3.size();
            int i23 = 0;
            while (true) {
                if (i23 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i23);
                if (((B) obj).getIndex() != i20) {
                    break;
                }
                i23++;
            }
            B b8 = (B) obj;
            if (b8 != null) {
                long jG2 = b8.g(0);
                i10 = (int) (b8.c() ? jG2 & j : jG2 >> 32);
            } else {
                i10 = Integer.MIN_VALUE;
            }
            int iMax = i9 == Integer.MIN_VALUE ? -i : Math.max(-i, i9);
            if (i10 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i10 - iF);
            }
            b7.d();
            b7.e(iMax, i7, i8);
            arrayList2.add(b7);
            i19++;
            i12 = -1;
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List g(InterfaceC0140x interfaceC0140x, H h4, C0128k c0128k) {
        G5.d dVar;
        R.e eVar = c0128k.f1572a;
        if (!(eVar.f6678s != 0) && h4.f1485q.isEmpty()) {
            return n5.s.f15299q;
        }
        ArrayList arrayList = new ArrayList();
        if (c0128k.f1572a.f6678s != 0) {
            int i = eVar.f6678s;
            if (i == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = eVar.f6676q;
            int i7 = ((C0127j) objArr[0]).f1570a;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = ((C0127j) objArr[i8]).f1570a;
                if (i9 < i7) {
                    i7 = i9;
                }
            }
            if (i7 < 0) {
                AbstractC1923a.a("negative minIndex");
            }
            int i10 = eVar.f6678s;
            if (i10 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = eVar.f6676q;
            int i11 = ((C0127j) objArr2[0]).f1571b;
            for (int i12 = 0; i12 < i10; i12++) {
                int i13 = ((C0127j) objArr2[i12]).f1571b;
                if (i13 > i11) {
                    i11 = i13;
                }
            }
            dVar = new G5.d(i7, Math.min(i11, interfaceC0140x.a() - 1), 1);
        } else {
            dVar = G5.d.f2024t;
        }
        int size = h4.f1485q.size();
        for (int i14 = 0; i14 < size; i14++) {
            G g7 = (G) h4.get(i14);
            int i15 = i(g7.f1481c, interfaceC0140x, g7.f1479a);
            int i16 = dVar.f2017q;
            if ((i15 > dVar.f2018r || i16 > i15) && i15 >= 0 && i15 < interfaceC0140x.a()) {
                arrayList.add(Integer.valueOf(i15));
            }
        }
        int i17 = dVar.f2017q;
        int i18 = dVar.f2018r;
        if (i17 <= i18) {
            while (true) {
                arrayList.add(Integer.valueOf(i17));
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static P.W h() {
        return new C0354f0(C1386y.f15098a, P.S.f5374s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int i(int i, InterfaceC0140x interfaceC0140x, Object obj) {
        int iD;
        return (obj == null || interfaceC0140x.a() == 0 || (i < interfaceC0140x.a() && obj.equals(interfaceC0140x.b(i))) || (iD = interfaceC0140x.d(obj)) == -1) ? i : iD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final List m(int i, int i7, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return n5.s.f15299q;
        }
        ArrayList arrayListC0 = n5.l.C0(list);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            B b7 = (B) arrayList.get(i8);
            int index = b7.getIndex();
            if (i <= index && index <= i7) {
                arrayListC0.add(b7);
            }
        }
        n5.p.d0(arrayListC0, f1474a);
        return arrayListC0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object j(int i) {
        C0126i c0126iF = k().f(i);
        return c0126iF.f1569c.a().invoke(Integer.valueOf(i - c0126iF.f1567a));
    }

    public abstract Y k();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object l(int i) {
        Object objInvoke;
        C0126i c0126iF = k().f(i);
        int i7 = i - c0126iF.f1567a;
        B5.c key = c0126iF.f1569c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i7))) == null) ? new C0124g(i) : objInvoke;
    }
}
