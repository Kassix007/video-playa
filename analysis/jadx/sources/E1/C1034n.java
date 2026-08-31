package e1;

import C0.S;
import O3.B;
import d1.C0953d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: e1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1034n {
    public static int f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f12534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f12537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12538e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(ArrayList arrayList) {
        int size = this.f12534a.size();
        if (this.f12538e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1034n c1034n = (C1034n) arrayList.get(i);
                if (this.f12538e == c1034n.f12535b) {
                    c(this.f12536c, c1034n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(b1.c cVar, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f12534a;
        if (arrayList.size() == 0) {
            return 0;
        }
        d1.e eVar = (d1.e) ((C0953d) arrayList.get(0)).f11843T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((C0953d) arrayList.get(i7)).b(cVar, false);
        }
        if (i == 0 && eVar.f11909z0 > 0) {
            d1.j.a(eVar, cVar, arrayList, 0);
        }
        if (i == 1 && eVar.f11889A0 > 0) {
            d1.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e7) {
            System.err.println(e7.toString() + "\n" + Arrays.toString(e7.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f12537d = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C0953d c0953d = (C0953d) arrayList.get(i8);
            B b7 = new B(21);
            new WeakReference(c0953d);
            b1.c.n(c0953d.f11832I);
            b1.c.n(c0953d.f11833J);
            b1.c.n(c0953d.f11834K);
            b1.c.n(c0953d.f11835L);
            b1.c.n(c0953d.f11836M);
            this.f12537d.add(b7);
        }
        if (i == 0) {
            iN = b1.c.n(eVar.f11832I);
            iN2 = b1.c.n(eVar.f11834K);
            cVar.t();
        } else {
            iN = b1.c.n(eVar.f11833J);
            iN2 = b1.c.n(eVar.f11835L);
            cVar.t();
        }
        return iN2 - iN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, C1034n c1034n) {
        ArrayList arrayList = this.f12534a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            C0953d c0953d = (C0953d) obj;
            ArrayList arrayList2 = c1034n.f12534a;
            if (!arrayList2.contains(c0953d)) {
                arrayList2.add(c0953d);
            }
            int i8 = c1034n.f12535b;
            if (i == 0) {
                c0953d.f11874n0 = i8;
            } else {
                c0953d.f11876o0 = i8;
            }
        }
        this.f12538e = c1034n.f12535b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f12536c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f12535b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f12534a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            string = string + " " + ((C0953d) obj).f11864h0;
        }
        return S.l(string, " >");
    }
}
