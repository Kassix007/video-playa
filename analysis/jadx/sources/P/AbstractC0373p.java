package P;

import java.util.ArrayList;
import java.util.List;
import r.C1549H;

/* JADX INFO: renamed from: P.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0373p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f5485a = new Z("provider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z f5486b = new Z("provider");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Z f5487c = new Z("compositionLocalMap");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Z f5488d = new Z("providers");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Z f5489e = new Z("reference");
    public static final B0.C f = new B0.C(3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(List list, int i, int i7) {
        int iF = f(i, list);
        if (iF < 0) {
            iF = -(iF + 1);
        }
        while (iF < list.size() && ((L) list.get(iF)).f5330b < i7) {
            list.remove(iF);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void b(z0 z0Var, ArrayList arrayList, int i) {
        boolean zI = z0Var.i(i);
        int[] iArr = z0Var.f5586b;
        if (zI) {
            arrayList.add(z0Var.k(i));
            return;
        }
        int i7 = iArr[(i * 5) + 3] + i;
        for (int i8 = i + 1; i8 < i7; i8 += iArr[(i8 * 5) + 3]) {
            b(z0Var, arrayList, i8);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(String str) {
        throw new C0361j(C0.S.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Void d(String str) {
        throw new C0361j(C0.S.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void e(D0 d02, X.j jVar) {
        int iO;
        int[] iArr = d02.f5289b;
        int i = d02.f5304t;
        int iF = d02.f(iArr, d02.q(d02.s(i) + i));
        for (int iF2 = d02.f(d02.f5289b, d02.q(d02.f5304t)); iF2 < iF; iF2++) {
            Object obj = d02.f5290c[d02.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC0359i) {
                jVar.d((InterfaceC0359i) obj, d02.o() - iF2, -1, -1);
            } else if (obj instanceof x0) {
                x0 x0Var = (x0) obj;
                if (!(x0Var.f5576a instanceof C0365l)) {
                    h(d02, iF2, obj);
                    int iO2 = d02.o() - iF2;
                    C0343a c0343a = x0Var.f5577b;
                    if (c0343a == null || !c0343a.a()) {
                        iO = -1;
                    } else {
                        iC = d02.c(c0343a);
                        iO = d02.o() - d02.M(iC);
                    }
                    jVar.d(x0Var, iO2, iC, iO);
                }
            } else if (obj instanceof C0372o0) {
                h(d02, iF2, obj);
                ((C0372o0) obj).d();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int f(int i, List list) {
        int size = list.size() - 1;
        int i7 = 0;
        while (i7 <= size) {
            int i8 = (i7 + size) >>> 1;
            int iF = kotlin.jvm.internal.m.f(((L) list.get(i8)).f5330b, i);
            if (iF < 0) {
                i7 = i8 + 1;
            } else {
                if (iF <= 0) {
                    return i8;
                }
                size = i8 - 1;
            }
        }
        return -(i7 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(D0 d02, X.j jVar) {
        int iO;
        int[] iArr = d02.f5289b;
        int i = d02.f5304t;
        int iF = d02.f(iArr, d02.q(d02.s(i) + i));
        for (int iF2 = d02.f(d02.f5289b, d02.q(d02.f5304t)); iF2 < iF; iF2++) {
            Object obj = d02.f5290c[d02.g(iF2)];
            int iC = -1;
            if (obj instanceof InterfaceC0359i) {
                int iO2 = d02.o() - iF2;
                Object obj2 = (InterfaceC0359i) obj;
                C1549H c1549h = jVar.f;
                if (c1549h == null) {
                    int i7 = r.P.f16163a;
                    c1549h = new C1549H();
                    jVar.f = c1549h;
                }
                c1549h.j(obj2);
                jVar.d(obj2, iO2, -1, -1);
            }
            if (obj instanceof x0) {
                int iO3 = d02.o() - iF2;
                x0 x0Var = (x0) obj;
                C0343a c0343a = x0Var.f5577b;
                if (c0343a == null || !c0343a.a()) {
                    iO = -1;
                } else {
                    iC = d02.c(c0343a);
                    iO = d02.o() - d02.M(iC);
                }
                jVar.d(x0Var, iO3, iC, iO);
            }
            if (obj instanceof C0372o0) {
                ((C0372o0) obj).d();
            }
        }
        d02.F();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void h(D0 d02, int i, Object obj) {
        int iG = d02.g(i);
        Object[] objArr = d02.f5290c;
        Object obj2 = objArr[iG];
        objArr[iG] = C0363k.f5418a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
