package t;

import B0.T;
import E.Z;
import java.util.List;
import java.util.NoSuchElementException;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: t.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1607f implements InterfaceC1926C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1613l f16607a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1607f(C1613l c1613l) {
        this.f16607a = c1613l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:113:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:121:? */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(T t6, List list, long j) {
        AbstractC1933J abstractC1933J;
        AbstractC1933J abstractC1933J2;
        int i;
        int i7;
        int i8;
        int i9;
        int size = list.size();
        AbstractC1933J[] abstractC1933JArr = new AbstractC1933J[size];
        List list2 = list;
        int size2 = list2.size();
        long j7 = 0;
        int i10 = 0;
        while (true) {
            abstractC1933J = null;
            if (i10 >= size2) {
                break;
            }
            InterfaceC1925B interfaceC1925B = (InterfaceC1925B) list.get(i10);
            Object objG = interfaceC1925B.g();
            C1609h c1609h = objG instanceof C1609h ? (C1609h) objG : null;
            if (c1609h != null && ((Boolean) c1609h.f16608q.getValue()).booleanValue()) {
                AbstractC1933J abstractC1933JA = interfaceC1925B.a(j);
                long j8 = (((long) abstractC1933JA.f18665r) & 4294967295L) | (((long) abstractC1933JA.f18664q) << 32);
                abstractC1933JArr[i10] = abstractC1933JA;
                j7 = j8;
            }
            i10++;
        }
        int size3 = list2.size();
        for (int i11 = 0; i11 < size3; i11++) {
            InterfaceC1925B interfaceC1925B2 = (InterfaceC1925B) list.get(i11);
            if (abstractC1933JArr[i11] == null) {
                abstractC1933JArr[i11] = interfaceC1925B2.a(j);
            }
        }
        if (t6.r()) {
            i7 = (int) (j7 >> 32);
        } else {
            if (size == 0) {
                abstractC1933J2 = null;
            } else {
                abstractC1933J2 = abstractC1933JArr[0];
                int i12 = size - 1;
                if (i12 != 0) {
                    int i13 = abstractC1933J2 != null ? abstractC1933J2.f18664q : 0;
                    G5.d dVar = new G5.d(1, i12, 1);
                    int i14 = dVar.f2018r;
                    int i15 = dVar.f2019s;
                    boolean z5 = i15 <= 0 ? 1 >= i14 : 1 <= i14;
                    int i16 = z5 ? 1 : i14;
                    while (z5) {
                        if (i16 != i14) {
                            i = i16 + i15;
                            z5 = z5;
                        } else {
                            if (!z5) {
                                throw new NoSuchElementException();
                            }
                            i = i16;
                            z5 = false;
                        }
                        AbstractC1933J abstractC1933J3 = abstractC1933JArr[i16];
                        int i17 = abstractC1933J3 != null ? abstractC1933J3.f18664q : 0;
                        if (i13 < i17) {
                            abstractC1933J2 = abstractC1933J3;
                            i16 = i;
                            i13 = i17;
                        } else {
                            i16 = i;
                        }
                    }
                }
            }
            i7 = abstractC1933J2 != null ? abstractC1933J2.f18664q : 0;
        }
        if (t6.r()) {
            i8 = (int) (j7 & 4294967295L);
        } else {
            if (size != 0) {
                abstractC1933J = abstractC1933JArr[0];
                int i18 = size - 1;
                if (i18 != 0) {
                    int i19 = abstractC1933J != null ? abstractC1933J.f18665r : 0;
                    G5.d dVar2 = new G5.d(1, i18, 1);
                    int i20 = dVar2.f2018r;
                    int i21 = dVar2.f2019s;
                    boolean z6 = i21 <= 0 ? 1 >= i20 : 1 <= i20;
                    int i22 = z6 ? 1 : i20;
                    while (z6) {
                        if (i22 != i20) {
                            i9 = i22 + i21;
                            z6 = z6;
                        } else {
                            if (!z6) {
                                throw new NoSuchElementException();
                            }
                            i9 = i22;
                            z6 = false;
                        }
                        AbstractC1933J abstractC1933J4 = abstractC1933JArr[i22];
                        int i23 = abstractC1933J4 != null ? abstractC1933J4.f18665r : 0;
                        i22 = i9;
                        if (i19 < i23) {
                            abstractC1933J = abstractC1933J4;
                            i19 = i23;
                        }
                    }
                }
            }
            i8 = abstractC1933J != null ? abstractC1933J.f18665r : 0;
        }
        if (!t6.r()) {
            this.f16607a.f16621c.setValue(new W0.k((((long) i7) << 32) | (((long) i8) & 4294967295L)));
        }
        return t6.f(i7, i8, n5.t.f15300q, new Z(abstractC1933JArr, this, i7, i8));
    }
}
