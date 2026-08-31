package e1;

import java.util.ArrayList;

/* JADX INFO: renamed from: e1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1032l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1035o f12530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f12531b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long a(C1026f c1026f, long j) {
        AbstractC1035o abstractC1035o = c1026f.f12521d;
        ArrayList arrayList = c1026f.f12525k;
        if (abstractC1035o instanceof C1030j) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1024d interfaceC1024d = (InterfaceC1024d) arrayList.get(i);
            if (interfaceC1024d instanceof C1026f) {
                C1026f c1026f2 = (C1026f) interfaceC1024d;
                if (c1026f2.f12521d != abstractC1035o) {
                    jMin = Math.min(jMin, a(c1026f2, ((long) c1026f2.f) + j));
                }
            }
        }
        C1026f c1026f3 = abstractC1035o.i;
        C1026f c1026f4 = abstractC1035o.f12545h;
        if (c1026f != c1026f3) {
            return jMin;
        }
        long j7 = j - abstractC1035o.j();
        return Math.min(Math.min(jMin, a(c1026f4, j7)), j7 - ((long) c1026f4.f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long b(C1026f c1026f, long j) {
        AbstractC1035o abstractC1035o = c1026f.f12521d;
        ArrayList arrayList = c1026f.f12525k;
        if (abstractC1035o instanceof C1030j) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC1024d interfaceC1024d = (InterfaceC1024d) arrayList.get(i);
            if (interfaceC1024d instanceof C1026f) {
                C1026f c1026f2 = (C1026f) interfaceC1024d;
                if (c1026f2.f12521d != abstractC1035o) {
                    jMax = Math.max(jMax, b(c1026f2, ((long) c1026f2.f) + j));
                }
            }
        }
        C1026f c1026f3 = abstractC1035o.f12545h;
        C1026f c1026f4 = abstractC1035o.i;
        if (c1026f != c1026f3) {
            return jMax;
        }
        long j7 = abstractC1035o.j() + j;
        return Math.max(Math.max(jMax, b(c1026f4, j7)), j7 - ((long) c1026f4.f));
    }
}
