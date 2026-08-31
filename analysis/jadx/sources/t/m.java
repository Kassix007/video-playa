package t;

import B0.T;
import java.util.ArrayList;
import java.util.List;
import z0.AbstractC1933J;
import z0.InterfaceC1925B;
import z0.InterfaceC1926C;
import z0.InterfaceC1927D;

/* JADX INFO: loaded from: classes.dex */
public final class m implements InterfaceC1926C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f16623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16624b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m(q qVar) {
        this.f16623a = qVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // z0.InterfaceC1926C
    public final InterfaceC1927D c(T t6, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1933J abstractC1933JA = ((InterfaceC1925B) list.get(i)).a(j);
            iMax = Math.max(iMax, abstractC1933JA.f18664q);
            iMax2 = Math.max(iMax2, abstractC1933JA.f18665r);
            arrayList.add(abstractC1933JA);
        }
        boolean zR = t6.r();
        q qVar = this.f16623a;
        if (zR) {
            this.f16624b = true;
            qVar.f16631a.setValue(new W0.k((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f16624b) {
            qVar.f16631a.setValue(new W0.k((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return t6.f(iMax, iMax2, n5.t.f15300q, new F.y(2, arrayList));
    }
}
