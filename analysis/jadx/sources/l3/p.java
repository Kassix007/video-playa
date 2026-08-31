package l3;

import a3.C0632k;
import java.util.ArrayList;
import m3.AbstractC1360a;
import o3.C1415a;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z.m f14482a = Z.m.s("k");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ArrayList a(AbstractC1360a abstractC1360a, C0632k c0632k, float f, D d5, boolean z5) {
        AbstractC1360a abstractC1360a2;
        C0632k c0632k2;
        float f7;
        D d7;
        boolean z6;
        ArrayList arrayList = new ArrayList();
        if (abstractC1360a.M() == 6) {
            c0632k.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC1360a.b();
        while (abstractC1360a.n()) {
            if (abstractC1360a.a0(f14482a) != 0) {
                abstractC1360a.c0();
            } else if (abstractC1360a.M() == 1) {
                abstractC1360a.a();
                if (abstractC1360a.M() == 7) {
                    AbstractC1360a abstractC1360a3 = abstractC1360a;
                    C0632k c0632k3 = c0632k;
                    float f8 = f;
                    D d8 = d5;
                    boolean z7 = z5;
                    C1415a c1415aB = o.b(abstractC1360a3, c0632k3, f8, d8, false, z7);
                    abstractC1360a2 = abstractC1360a3;
                    c0632k2 = c0632k3;
                    f7 = f8;
                    d7 = d8;
                    z6 = z7;
                    arrayList.add(c1415aB);
                } else {
                    abstractC1360a2 = abstractC1360a;
                    c0632k2 = c0632k;
                    f7 = f;
                    d7 = d5;
                    z6 = z5;
                    while (abstractC1360a2.n()) {
                        arrayList.add(o.b(abstractC1360a2, c0632k2, f7, d7, true, z6));
                    }
                }
                abstractC1360a2.c();
                abstractC1360a = abstractC1360a2;
                c0632k = c0632k2;
                f = f7;
                d5 = d7;
                z5 = z6;
            } else {
                AbstractC1360a abstractC1360a4 = abstractC1360a;
                arrayList.add(o.b(abstractC1360a4, c0632k, f, d5, false, z5));
                abstractC1360a = abstractC1360a4;
            }
        }
        abstractC1360a.e();
        b(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void b(ArrayList arrayList) {
        int i;
        Object obj;
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            i = size - 1;
            if (i7 >= i) {
                break;
            }
            C1415a c1415a = (C1415a) arrayList.get(i7);
            i7++;
            C1415a c1415a2 = (C1415a) arrayList.get(i7);
            c1415a.f15418h = Float.valueOf(c1415a2.f15417g);
            if (c1415a.f15414c == null && (obj = c1415a2.f15413b) != null) {
                c1415a.f15414c = obj;
                if (c1415a instanceof d3.l) {
                    ((d3.l) c1415a).d();
                }
            }
        }
        C1415a c1415a3 = (C1415a) arrayList.get(i);
        if ((c1415a3.f15413b == null || c1415a3.f15414c == null) && arrayList.size() > 1) {
            arrayList.remove(c1415a3);
        }
    }
}
