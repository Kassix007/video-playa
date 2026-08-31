package a1;

import B0.T;
import F.y;
import java.util.ArrayList;
import java.util.List;
import n5.t;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: renamed from: a1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0611d implements InterfaceC1926C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0611d f8729a = new C0611d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(T t6, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iJ = 0;
        int i = 0;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1933J abstractC1933JA = ((InterfaceC1925B) list.get(i7)).a(j);
            iJ = Math.max(iJ, abstractC1933JA.f18664q);
            i = Math.max(i, abstractC1933JA.f18665r);
            arrayList.add(abstractC1933JA);
        }
        if (list.isEmpty()) {
            iJ = W0.a.j(j);
            i = W0.a.i(j);
        }
        return t6.f(iJ, i, t.f15300q, new y(1, arrayList));
    }
}
