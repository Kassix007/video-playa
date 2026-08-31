package z0;

import A.C0028z;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: z0.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1936M extends B0.H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1936M f18674a = new C1936M();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(B0.T t6, List list, long j) {
        int size = list.size();
        n5.t tVar = n5.t.f15300q;
        if (size == 0) {
            return t6.f(W0.a.j(j), W0.a.i(j), tVar, C1934K.f18670s);
        }
        if (size == 1) {
            AbstractC1933J abstractC1933JA = ((InterfaceC1925B) list.get(0)).a(j);
            return t6.f(W0.b.f(abstractC1933JA.f18664q, j), W0.b.e(abstractC1933JA.f18665r, j), tVar, new C0028z(abstractC1933JA, 8));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            AbstractC1933J abstractC1933JA2 = ((InterfaceC1925B) list.get(i)).a(j);
            iMax = Math.max(abstractC1933JA2.f18664q, iMax);
            iMax2 = Math.max(abstractC1933JA2.f18665r, iMax2);
            arrayList.add(abstractC1933JA2);
        }
        return t6.f(W0.b.f(iMax, j), W0.b.e(iMax2, j), tVar, new F.y(3, arrayList));
    }
}
