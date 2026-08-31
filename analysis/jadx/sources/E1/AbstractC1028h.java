package e1;

import d1.C0952c;
import d1.C0953d;
import g1.C1076f;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: e1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1028h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1022b f12528a = new C1022b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean a(C0953d c0953d) {
        int[] iArr = c0953d.f11878p0;
        int i = iArr[0];
        int i7 = iArr[1];
        C0953d c0953d2 = c0953d.f11843T;
        d1.e eVar = c0953d2 != null ? (d1.e) c0953d2 : null;
        if (eVar != null) {
            int i8 = eVar.f11878p0[0];
        }
        if (eVar != null) {
            int i9 = eVar.f11878p0[1];
        }
        boolean z5 = i == 1 || c0953d.A() || i == 2 || (i == 3 && c0953d.f11880r == 0 && c0953d.f11846W == 0.0f && c0953d.t(0)) || (i == 3 && c0953d.f11880r == 1 && c0953d.u(0, c0953d.q()));
        boolean z6 = i7 == 1 || c0953d.B() || i7 == 2 || (i7 == 3 && c0953d.f11881s == 0 && c0953d.f11846W == 0.0f && c0953d.t(1)) || (i7 == 3 && c0953d.f11881s == 1 && c0953d.u(1, c0953d.k()));
        return (c0953d.f11846W > 0.0f && (z5 || z6)) || (z5 && z6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static C1034n b(C0953d c0953d, int i, ArrayList arrayList, C1034n c1034n) {
        int i7;
        int i8 = i == 0 ? c0953d.f11874n0 : c0953d.f11876o0;
        if (i8 != -1 && (c1034n == null || i8 != c1034n.f12535b)) {
            int i9 = 0;
            while (true) {
                if (i9 >= arrayList.size()) {
                    break;
                }
                C1034n c1034n2 = (C1034n) arrayList.get(i9);
                if (c1034n2.f12535b == i8) {
                    if (c1034n != null) {
                        c1034n.c(i, c1034n2);
                        arrayList.remove(c1034n);
                    }
                    c1034n = c1034n2;
                } else {
                    i9++;
                }
            }
        } else if (i8 != -1) {
            return c1034n;
        }
        if (c1034n == null) {
            if (c0953d instanceof d1.i) {
                d1.i iVar = (d1.i) c0953d;
                int i10 = 0;
                while (true) {
                    if (i10 >= iVar.f11966r0) {
                        i7 = -1;
                        break;
                    }
                    C0953d c0953d2 = iVar.f11965q0[i10];
                    if ((i == 0 && (i7 = c0953d2.f11874n0) != -1) || (i == 1 && (i7 = c0953d2.f11876o0) != -1)) {
                        break;
                    }
                    i10++;
                }
                if (i7 != -1) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= arrayList.size()) {
                            break;
                        }
                        C1034n c1034n3 = (C1034n) arrayList.get(i11);
                        if (c1034n3.f12535b == i7) {
                            c1034n = c1034n3;
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (c1034n == null) {
                c1034n = new C1034n();
                c1034n.f12534a = new ArrayList();
                c1034n.f12537d = null;
                c1034n.f12538e = -1;
                int i12 = C1034n.f;
                C1034n.f = i12 + 1;
                c1034n.f12535b = i12;
                c1034n.f12536c = i;
            }
            arrayList.add(c1034n);
        }
        int i13 = c1034n.f12535b;
        ArrayList arrayList2 = c1034n.f12534a;
        if (arrayList2.contains(c0953d)) {
            return c1034n;
        }
        arrayList2.add(c0953d);
        if (c0953d instanceof d1.h) {
            d1.h hVar = (d1.h) c0953d;
            hVar.f11962t0.c(hVar.f11963u0 == 0 ? 1 : 0, c1034n, arrayList);
        }
        if (i == 0) {
            c0953d.f11874n0 = i13;
            c0953d.f11832I.c(i, c1034n, arrayList);
            c0953d.f11834K.c(i, c1034n, arrayList);
        } else {
            c0953d.f11876o0 = i13;
            c0953d.f11833J.c(i, c1034n, arrayList);
            c0953d.f11836M.c(i, c1034n, arrayList);
            c0953d.f11835L.c(i, c1034n, arrayList);
        }
        c0953d.f11839P.c(i, c1034n, arrayList);
        return c1034n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(int i, C0953d c0953d, C1076f c1076f, boolean z5) {
        C0952c c0952c;
        C0952c c0952c2;
        boolean z6;
        C0952c c0952c3;
        C0952c c0952c4;
        if (c0953d.f11871m) {
            return;
        }
        if (!(c0953d instanceof d1.e) && c0953d.z() && a(c0953d)) {
            d1.e.V(c0953d, c1076f, new C1022b());
        }
        C0952c c0952cI = c0953d.i(2);
        C0952c c0952cI2 = c0953d.i(4);
        int iD = c0952cI.d();
        int iD2 = c0952cI2.d();
        HashSet<C0952c> hashSet = c0952cI.f11817a;
        if (hashSet != null && c0952cI.f11819c) {
            for (C0952c c0952c5 : hashSet) {
                C0953d c0953d2 = c0952c5.f11820d;
                int i7 = i + 1;
                boolean zA = a(c0953d2);
                C0952c c0952c6 = c0953d2.f11832I;
                C0952c c0952c7 = c0953d2.f11834K;
                if (c0953d2.z() && zA) {
                    z6 = true;
                    d1.e.V(c0953d2, c1076f, new C1022b());
                } else {
                    z6 = true;
                }
                boolean z7 = ((c0952c5 == c0952c6 && (c0952c4 = c0952c7.f) != null && c0952c4.f11819c) || (c0952c5 == c0952c7 && (c0952c3 = c0952c6.f) != null && c0952c3.f11819c)) ? z6 : false;
                int i8 = c0953d2.f11878p0[0];
                if (i8 != 3 || zA) {
                    if (!c0953d2.z()) {
                        if (c0952c5 == c0952c6 && c0952c7.f == null) {
                            int iE = c0952c6.e() + iD;
                            c0953d2.J(iE, c0953d2.q() + iE);
                            c(i7, c0953d2, c1076f, z5);
                        } else if (c0952c5 == c0952c7 && c0952c6.f == null) {
                            int iE2 = iD - c0952c7.e();
                            c0953d2.J(iE2 - c0953d2.q(), iE2);
                            c(i7, c0953d2, c1076f, z5);
                        } else if (z7 && !c0953d2.x()) {
                            d(i7, c0953d2, c1076f, z5);
                        }
                    }
                } else if (i8 == 3 && c0953d2.f11884v >= 0 && c0953d2.f11883u >= 0 && (c0953d2.f11862g0 == 8 || (c0953d2.f11880r == 0 && c0953d2.f11846W == 0.0f))) {
                    if (!c0953d2.x() && !c0953d2.f11829F && z7 && !c0953d2.x()) {
                        e(i7, c0953d, c1076f, c0953d2, z5);
                    }
                }
            }
        }
        if (c0953d instanceof d1.h) {
            return;
        }
        HashSet<C0952c> hashSet2 = c0952cI2.f11817a;
        if (hashSet2 != null && c0952cI2.f11819c) {
            for (C0952c c0952c8 : hashSet2) {
                C0953d c0953d3 = c0952c8.f11820d;
                int i9 = i + 1;
                boolean zA2 = a(c0953d3);
                C0952c c0952c9 = c0953d3.f11832I;
                C0952c c0952c10 = c0953d3.f11834K;
                if (c0953d3.z() && zA2) {
                    d1.e.V(c0953d3, c1076f, new C1022b());
                }
                boolean z8 = (c0952c8 == c0952c9 && (c0952c2 = c0952c10.f) != null && c0952c2.f11819c) || (c0952c8 == c0952c10 && (c0952c = c0952c9.f) != null && c0952c.f11819c);
                int i10 = c0953d3.f11878p0[0];
                if (i10 != 3 || zA2) {
                    if (!c0953d3.z()) {
                        if (c0952c8 == c0952c9 && c0952c10.f == null) {
                            int iE3 = c0952c9.e() + iD2;
                            c0953d3.J(iE3, c0953d3.q() + iE3);
                            c(i9, c0953d3, c1076f, z5);
                        } else if (c0952c8 == c0952c10 && c0952c9.f == null) {
                            int iE4 = iD2 - c0952c10.e();
                            c0953d3.J(iE4 - c0953d3.q(), iE4);
                            c(i9, c0953d3, c1076f, z5);
                        } else if (z8 && !c0953d3.x()) {
                            d(i9, c0953d3, c1076f, z5);
                        }
                    }
                } else if (i10 == 3 && c0953d3.f11884v >= 0 && c0953d3.f11883u >= 0) {
                    if (c0953d3.f11862g0 == 8 || (c0953d3.f11880r == 0 && c0953d3.f11846W == 0.0f)) {
                        if (!c0953d3.x() && !c0953d3.f11829F && z8 && !c0953d3.x()) {
                            e(i9, c0953d, c1076f, c0953d3, z5);
                        }
                    }
                }
            }
        }
        c0953d.f11871m = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void d(int i, C0953d c0953d, C1076f c1076f, boolean z5) {
        float f = c0953d.f11857d0;
        C0952c c0952c = c0953d.f11832I;
        int iD = c0952c.f.d();
        C0952c c0952c2 = c0953d.f11834K;
        int iD2 = c0952c2.f.d();
        int iE = c0952c.e() + iD;
        int iE2 = iD2 - c0952c2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = c0953d.q();
        int i7 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i7 = (iD - iD2) - iQ;
        }
        int i8 = ((int) (i7 > 0 ? (f * i7) + 0.5f : f * i7)) + iD;
        int i9 = i8 + iQ;
        if (iD > iD2) {
            i9 = i8 - iQ;
        }
        c0953d.J(i8, i9);
        c(i + 1, c0953d, c1076f, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(int i, C0953d c0953d, C1076f c1076f, C0953d c0953d2, boolean z5) {
        float f = c0953d2.f11857d0;
        C0952c c0952c = c0953d2.f11832I;
        int iE = c0952c.e() + c0952c.f.d();
        C0952c c0952c2 = c0953d2.f11834K;
        int iD = c0952c2.f.d() - c0952c2.e();
        if (iD >= iE) {
            int iQ = c0953d2.q();
            if (c0953d2.f11862g0 != 8) {
                int i7 = c0953d2.f11880r;
                if (i7 == 2) {
                    iQ = (int) (c0953d2.f11857d0 * 0.5f * (c0953d instanceof d1.e ? c0953d.q() : c0953d.f11843T.q()));
                } else if (i7 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(c0953d2.f11883u, iQ);
                int i8 = c0953d2.f11884v;
                if (i8 > 0) {
                    iQ = Math.min(i8, iQ);
                }
            }
            int i9 = iE + ((int) ((f * ((iD - iE) - iQ)) + 0.5f));
            c0953d2.J(i9, iQ + i9);
            c(i + 1, c0953d2, c1076f, z5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void f(int i, C0953d c0953d, C1076f c1076f) {
        float f = c0953d.f11859e0;
        C0952c c0952c = c0953d.f11833J;
        int iD = c0952c.f.d();
        C0952c c0952c2 = c0953d.f11835L;
        int iD2 = c0952c2.f.d();
        int iE = c0952c.e() + iD;
        int iE2 = iD2 - c0952c2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = c0953d.k();
        int i7 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i7 = (iD - iD2) - iK;
        }
        int i8 = (int) (i7 > 0 ? (f * i7) + 0.5f : f * i7);
        int i9 = iD + i8;
        int i10 = i9 + iK;
        if (iD > iD2) {
            i9 = iD - i8;
            i10 = i9 - iK;
        }
        c0953d.K(i9, i10);
        i(i + 1, c0953d, c1076f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void g(int i, C0953d c0953d, C1076f c1076f, C0953d c0953d2) {
        float f = c0953d2.f11859e0;
        C0952c c0952c = c0953d2.f11833J;
        int iE = c0952c.e() + c0952c.f.d();
        C0952c c0952c2 = c0953d2.f11835L;
        int iD = c0952c2.f.d() - c0952c2.e();
        if (iD >= iE) {
            int iK = c0953d2.k();
            if (c0953d2.f11862g0 != 8) {
                int i7 = c0953d2.f11881s;
                if (i7 == 2) {
                    iK = (int) (f * 0.5f * (c0953d instanceof d1.e ? c0953d.k() : c0953d.f11843T.k()));
                } else if (i7 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(c0953d2.f11886x, iK);
                int i8 = c0953d2.f11887y;
                if (i8 > 0) {
                    iK = Math.min(i8, iK);
                }
            }
            int i9 = iE + ((int) ((f * ((iD - iE) - iK)) + 0.5f));
            c0953d2.K(i9, iK + i9);
            i(i + 1, c0953d2, c1076f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean h(int i, int i7, int i8, int i9) {
        return (i8 == 1 || i8 == 2 || (i8 == 4 && i != 2)) || (i9 == 1 || i9 == 2 || (i9 == 4 && i7 != 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(int i, C0953d c0953d, C1076f c1076f) {
        boolean z5;
        C0952c c0952c;
        C0952c c0952c2;
        C0952c c0952c3;
        C0952c c0952c4;
        if (c0953d.f11873n) {
            return;
        }
        if (!(c0953d instanceof d1.e) && c0953d.z() && a(c0953d)) {
            d1.e.V(c0953d, c1076f, new C1022b());
        }
        C0952c c0952cI = c0953d.i(3);
        C0952c c0952cI2 = c0953d.i(5);
        int iD = c0952cI.d();
        int iD2 = c0952cI2.d();
        HashSet<C0952c> hashSet = c0952cI.f11817a;
        if (hashSet != null && c0952cI.f11819c) {
            for (C0952c c0952c5 : hashSet) {
                C0953d c0953d2 = c0952c5.f11820d;
                int i7 = i + 1;
                boolean zA = a(c0953d2);
                C0952c c0952c6 = c0953d2.f11833J;
                C0952c c0952c7 = c0953d2.f11835L;
                if (c0953d2.z() && zA) {
                    d1.e.V(c0953d2, c1076f, new C1022b());
                }
                boolean z6 = (c0952c5 == c0952c6 && (c0952c4 = c0952c7.f) != null && c0952c4.f11819c) || (c0952c5 == c0952c7 && (c0952c3 = c0952c6.f) != null && c0952c3.f11819c);
                int i8 = c0953d2.f11878p0[1];
                if (i8 != 3 || zA) {
                    if (!c0953d2.z()) {
                        if (c0952c5 == c0952c6 && c0952c7.f == null) {
                            int iE = c0952c6.e() + iD;
                            c0953d2.K(iE, c0953d2.k() + iE);
                            i(i7, c0953d2, c1076f);
                        } else if (c0952c5 == c0952c7 && c0952c6.f == null) {
                            int iE2 = iD - c0952c7.e();
                            c0953d2.K(iE2 - c0953d2.k(), iE2);
                            i(i7, c0953d2, c1076f);
                        } else if (z6 && !c0953d2.y()) {
                            f(i7, c0953d2, c1076f);
                        }
                    }
                } else if (i8 == 3 && c0953d2.f11887y >= 0 && c0953d2.f11886x >= 0 && (c0953d2.f11862g0 == 8 || (c0953d2.f11881s == 0 && c0953d2.f11846W == 0.0f))) {
                    if (!c0953d2.y() && !c0953d2.f11829F && z6 && !c0953d2.y()) {
                        g(i7, c0953d, c1076f, c0953d2);
                    }
                }
            }
        }
        boolean z7 = true;
        z7 = true;
        z7 = true;
        if (c0953d instanceof d1.h) {
            return;
        }
        HashSet<C0952c> hashSet2 = c0952cI2.f11817a;
        if (hashSet2 != null && c0952cI2.f11819c) {
            for (C0952c c0952c8 : hashSet2) {
                C0953d c0953d3 = c0952c8.f11820d;
                int i9 = i + 1;
                boolean zA2 = a(c0953d3);
                C0952c c0952c9 = c0953d3.f11833J;
                C0952c c0952c10 = c0953d3.f11835L;
                if (c0953d3.z() && zA2) {
                    d1.e.V(c0953d3, c1076f, new C1022b());
                }
                boolean z8 = (c0952c8 == c0952c9 && (c0952c2 = c0952c10.f) != null && c0952c2.f11819c) || (c0952c8 == c0952c10 && (c0952c = c0952c9.f) != null && c0952c.f11819c);
                int i10 = c0953d3.f11878p0[1];
                if (i10 != 3 || zA2) {
                    if (!c0953d3.z()) {
                        if (c0952c8 == c0952c9 && c0952c10.f == null) {
                            int iE3 = c0952c9.e() + iD2;
                            c0953d3.K(iE3, c0953d3.k() + iE3);
                            i(i9, c0953d3, c1076f);
                        } else if (c0952c8 == c0952c10 && c0952c9.f == null) {
                            int iE4 = iD2 - c0952c10.e();
                            c0953d3.K(iE4 - c0953d3.k(), iE4);
                            i(i9, c0953d3, c1076f);
                        } else if (z8 && !c0953d3.y()) {
                            f(i9, c0953d3, c1076f);
                        }
                    }
                } else if (i10 == 3 && c0953d3.f11887y >= 0 && c0953d3.f11886x >= 0 && (c0953d3.f11862g0 == 8 || (c0953d3.f11881s == 0 && c0953d3.f11846W == 0.0f))) {
                    if (!c0953d3.y() && !c0953d3.f11829F && z8 && !c0953d3.y()) {
                        g(i9, c0953d, c1076f, c0953d3);
                    }
                }
            }
        }
        C0952c c0952cI3 = c0953d.i(6);
        if (c0952cI3.f11817a != null && c0952cI3.f11819c) {
            int iD3 = c0952cI3.d();
            for (C0952c c0952c11 : c0952cI3.f11817a) {
                C0953d c0953d4 = c0952c11.f11820d;
                int i11 = i + 1;
                boolean zA3 = a(c0953d4);
                C0952c c0952c12 = c0953d4.f11836M;
                if (c0953d4.z() && zA3) {
                    d1.e.V(c0953d4, c1076f, new C1022b());
                }
                if (c0953d4.f11878p0[z7 ? 1 : 0] != 3 || zA3) {
                    if (!c0953d4.z()) {
                        if (c0952c11 == c0952c12) {
                            int iE5 = c0952c11.e() + iD3;
                            if (c0953d4.f11828E) {
                                int i12 = iE5 - c0953d4.f11851a0;
                                int i13 = c0953d4.f11845V + i12;
                                c0953d4.f11849Z = i12;
                                c0953d4.f11833J.l(i12);
                                c0953d4.f11835L.l(i13);
                                c0952c12.l(iE5);
                                z5 = z7 ? 1 : 0;
                                c0953d4.f11869l = z5;
                            } else {
                                z5 = z7 ? 1 : 0;
                            }
                            i(i11, c0953d4, c1076f);
                        }
                        z7 = z5;
                    }
                }
                z5 = z7 ? 1 : 0;
                z7 = z5;
            }
        }
        c0953d.f11873n = z7;
    }
}
